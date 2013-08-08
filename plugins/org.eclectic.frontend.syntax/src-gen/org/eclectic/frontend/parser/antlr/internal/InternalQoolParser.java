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
import org.eclectic.frontend.services.QoolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalQoolParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_KEYWORD_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'qool'", "'('", "','", "')'", "'->'", "'imported'", "':'", "'model'", "'end'", "'class'", "'{'", "';'", "'}'", "'att'", "'*'", "'ref'", "'local'", "'queue'", "'with'", "'access-by'", "'!'", "'segment'", "'='", "'invoke-internal'", "'input-view-filter'", "'entrypoint'", "'invoke-external'", "'+'", "'output-element'", "'['", "'.'", "']'", "'forall'", "'from'", "'where'", "'emit'", "'to'", "'#kindOf'", "'#p'", "'copy'", "'stop'", "'link'", "'var'", "'@'", "'^'", "'|'", "'match'", "'put'", "'-'", "'true'", "'false'", "'/'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int RULE_KEYWORD_ID=7;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
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


        public InternalQoolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQoolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQoolParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g"; }



     	private QoolGrammarAccess grammarAccess;
     	
        public InternalQoolParser(TokenStream input, QoolGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "QoolTransformation";	
       	}
       	
       	@Override
       	protected QoolGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQoolTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:68:1: entryRuleQoolTransformation returns [EObject current=null] : iv_ruleQoolTransformation= ruleQoolTransformation EOF ;
    public final EObject entryRuleQoolTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQoolTransformation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:69:2: (iv_ruleQoolTransformation= ruleQoolTransformation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:70:2: iv_ruleQoolTransformation= ruleQoolTransformation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQoolTransformationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQoolTransformation_in_entryRuleQoolTransformation75);
            iv_ruleQoolTransformation=ruleQoolTransformation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQoolTransformation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQoolTransformation85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQoolTransformation"


    // $ANTLR start "ruleQoolTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:77:1: ruleQoolTransformation returns [EObject current=null] : (otherlv_0= 'qool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* )? otherlv_12= ')' ( (lv_annotations_13_0= ruleAnnotation ) )* ( (lv_inlineModels_14_0= ruleInlineModel ) )* ( (lv_importedModels_15_0= ruleImportedModel ) )* ( (lv_queues_16_0= ruleQoolQueue ) )+ ( (lv_segments_17_0= ruleSegment ) )+ ) ;
    public final EObject ruleQoolTransformation() throws RecognitionException {
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

        EObject lv_annotations_13_0 = null;

        EObject lv_inlineModels_14_0 = null;

        EObject lv_importedModels_15_0 = null;

        EObject lv_queues_16_0 = null;

        EObject lv_segments_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:80:28: ( (otherlv_0= 'qool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* )? otherlv_12= ')' ( (lv_annotations_13_0= ruleAnnotation ) )* ( (lv_inlineModels_14_0= ruleInlineModel ) )* ( (lv_importedModels_15_0= ruleImportedModel ) )* ( (lv_queues_16_0= ruleQoolQueue ) )+ ( (lv_segments_17_0= ruleSegment ) )+ ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:81:1: (otherlv_0= 'qool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* )? otherlv_12= ')' ( (lv_annotations_13_0= ruleAnnotation ) )* ( (lv_inlineModels_14_0= ruleInlineModel ) )* ( (lv_importedModels_15_0= ruleImportedModel ) )* ( (lv_queues_16_0= ruleQoolQueue ) )+ ( (lv_segments_17_0= ruleSegment ) )+ )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:81:1: (otherlv_0= 'qool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* )? otherlv_12= ')' ( (lv_annotations_13_0= ruleAnnotation ) )* ( (lv_inlineModels_14_0= ruleInlineModel ) )* ( (lv_importedModels_15_0= ruleImportedModel ) )* ( (lv_queues_16_0= ruleQoolQueue ) )+ ( (lv_segments_17_0= ruleSegment ) )+ )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:81:3: otherlv_0= 'qool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) ) (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )* otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* )? otherlv_12= ')' ( (lv_annotations_13_0= ruleAnnotation ) )* ( (lv_inlineModels_14_0= ruleInlineModel ) )* ( (lv_importedModels_15_0= ruleImportedModel ) )* ( (lv_queues_16_0= ruleQoolQueue ) )+ ( (lv_segments_17_0= ruleSegment ) )+
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQoolTransformation122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQoolTransformationAccess().getQoolKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:86:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:86:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:87:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQoolTransformationAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQoolTransformation143);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQoolTransformationRule());
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

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQoolTransformation155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQoolTransformationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:107:1: ( (lv_inModels_3_0= ruleTransformationDefinitionParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:108:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:108:1: (lv_inModels_3_0= ruleTransformationDefinitionParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:109:3: lv_inModels_3_0= ruleTransformationDefinitionParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQoolTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleQoolTransformation176);
            lv_inModels_3_0=ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQoolTransformationRule());
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:125:2: (otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:125:4: otherlv_4= ',' ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQoolTransformation189); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getQoolTransformationAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:129:1: ( (lv_inModels_5_0= ruleTransformationDefinitionParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:130:1: (lv_inModels_5_0= ruleTransformationDefinitionParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:130:1: (lv_inModels_5_0= ruleTransformationDefinitionParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:131:3: lv_inModels_5_0= ruleTransformationDefinitionParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQoolTransformationAccess().getInModelsTransformationDefinitionParameterParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleQoolTransformation210);
            	    lv_inModels_5_0=ruleTransformationDefinitionParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQoolTransformationRule());
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

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQoolTransformation224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQoolTransformationAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQoolTransformation236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getQoolTransformationAccess().getHyphenMinusGreaterThanSignKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQoolTransformation248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getQoolTransformationAccess().getLeftParenthesisKeyword_7());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:159:1: ( ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:159:2: ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) ) (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )*
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:159:2: ( (lv_outModels_9_0= ruleTransformationDefinitionParameter ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:160:1: (lv_outModels_9_0= ruleTransformationDefinitionParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:160:1: (lv_outModels_9_0= ruleTransformationDefinitionParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:161:3: lv_outModels_9_0= ruleTransformationDefinitionParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQoolTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_8_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleQoolTransformation270);
                    lv_outModels_9_0=ruleTransformationDefinitionParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQoolTransformationRule());
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:177:2: (otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:177:4: otherlv_10= ',' ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQoolTransformation283); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getQoolTransformationAccess().getCommaKeyword_8_1_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:181:1: ( (lv_outModels_11_0= ruleTransformationDefinitionParameter ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:182:1: (lv_outModels_11_0= ruleTransformationDefinitionParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:182:1: (lv_outModels_11_0= ruleTransformationDefinitionParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:183:3: lv_outModels_11_0= ruleTransformationDefinitionParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQoolTransformationAccess().getOutModelsTransformationDefinitionParameterParserRuleCall_8_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_ruleQoolTransformation304);
                    	    lv_outModels_11_0=ruleTransformationDefinitionParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getQoolTransformationRule());
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


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQoolTransformation320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getQoolTransformationAccess().getRightParenthesisKeyword_9());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:203:1: ( (lv_annotations_13_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:204:1: (lv_annotations_13_0= ruleAnnotation )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:204:1: (lv_annotations_13_0= ruleAnnotation )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:205:3: lv_annotations_13_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQoolTransformationAccess().getAnnotationsAnnotationParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleQoolTransformation341);
            	    lv_annotations_13_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQoolTransformationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_13_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:221:3: ( (lv_inlineModels_14_0= ruleInlineModel ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    int LA5_2 = input.LA(2);

                    if ( ((LA5_2>=RULE_ID && LA5_2<=RULE_STRING)) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:222:1: (lv_inlineModels_14_0= ruleInlineModel )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:222:1: (lv_inlineModels_14_0= ruleInlineModel )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:223:3: lv_inlineModels_14_0= ruleInlineModel
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQoolTransformationAccess().getInlineModelsInlineModelParserRuleCall_11_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleInlineModel_in_ruleQoolTransformation363);
            	    lv_inlineModels_14_0=ruleInlineModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQoolTransformationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inlineModels",
            	              		lv_inlineModels_14_0, 
            	              		"InlineModel");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:239:3: ( (lv_importedModels_15_0= ruleImportedModel ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:240:1: (lv_importedModels_15_0= ruleImportedModel )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:240:1: (lv_importedModels_15_0= ruleImportedModel )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:241:3: lv_importedModels_15_0= ruleImportedModel
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQoolTransformationAccess().getImportedModelsImportedModelParserRuleCall_12_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImportedModel_in_ruleQoolTransformation385);
            	    lv_importedModels_15_0=ruleImportedModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQoolTransformationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"importedModels",
            	              		lv_importedModels_15_0, 
            	              		"ImportedModel");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:257:3: ( (lv_queues_16_0= ruleQoolQueue ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19||LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:258:1: (lv_queues_16_0= ruleQoolQueue )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:258:1: (lv_queues_16_0= ruleQoolQueue )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:259:3: lv_queues_16_0= ruleQoolQueue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQoolTransformationAccess().getQueuesQoolQueueParserRuleCall_13_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQoolQueue_in_ruleQoolTransformation407);
            	    lv_queues_16_0=ruleQoolQueue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQoolTransformationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"queues",
            	              		lv_queues_16_0, 
            	              		"QoolQueue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:275:3: ( (lv_segments_17_0= ruleSegment ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==33) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:276:1: (lv_segments_17_0= ruleSegment )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:276:1: (lv_segments_17_0= ruleSegment )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:277:3: lv_segments_17_0= ruleSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQoolTransformationAccess().getSegmentsSegmentParserRuleCall_14_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSegment_in_ruleQoolTransformation429);
            	    lv_segments_17_0=ruleSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQoolTransformationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"segments",
            	              		lv_segments_17_0, 
            	              		"Segment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // $ANTLR end "ruleQoolTransformation"


    // $ANTLR start "entryRuleImportedModel"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:301:1: entryRuleImportedModel returns [EObject current=null] : iv_ruleImportedModel= ruleImportedModel EOF ;
    public final EObject entryRuleImportedModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedModel = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:302:2: (iv_ruleImportedModel= ruleImportedModel EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:303:2: iv_ruleImportedModel= ruleImportedModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportedModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportedModel_in_entryRuleImportedModel466);
            iv_ruleImportedModel=ruleImportedModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportedModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportedModel476); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportedModel"


    // $ANTLR start "ruleImportedModel"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:310:1: ruleImportedModel returns [EObject current=null] : (otherlv_0= 'imported' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleImportedModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:313:28: ( (otherlv_0= 'imported' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:314:1: (otherlv_0= 'imported' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:314:1: (otherlv_0= 'imported' ( (lv_name_1_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:314:3: otherlv_0= 'imported' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleImportedModel513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportedModelAccess().getImportedKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:318:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:319:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:319:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:320:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportedModelAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImportedModel534);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportedModelRule());
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
    // $ANTLR end "ruleImportedModel"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:344:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:345:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:346:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation570);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation580); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:353:1: ruleAnnotation returns [EObject current=null] : this_MetamodelModelAnnotation_0= ruleMetamodelModelAnnotation ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_MetamodelModelAnnotation_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:356:28: (this_MetamodelModelAnnotation_0= ruleMetamodelModelAnnotation )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:358:5: this_MetamodelModelAnnotation_0= ruleMetamodelModelAnnotation
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAnnotationAccess().getMetamodelModelAnnotationParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMetamodelModelAnnotation_in_ruleAnnotation626);
            this_MetamodelModelAnnotation_0=ruleMetamodelModelAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MetamodelModelAnnotation_0; 
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleMetamodelModelAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:374:1: entryRuleMetamodelModelAnnotation returns [EObject current=null] : iv_ruleMetamodelModelAnnotation= ruleMetamodelModelAnnotation EOF ;
    public final EObject entryRuleMetamodelModelAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelModelAnnotation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:375:2: (iv_ruleMetamodelModelAnnotation= ruleMetamodelModelAnnotation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:376:2: iv_ruleMetamodelModelAnnotation= ruleMetamodelModelAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetamodelModelAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMetamodelModelAnnotation_in_entryRuleMetamodelModelAnnotation660);
            iv_ruleMetamodelModelAnnotation=ruleMetamodelModelAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetamodelModelAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetamodelModelAnnotation670); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:383:1: ruleMetamodelModelAnnotation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_metamodel_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetamodelModelAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_metamodel_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:386:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_metamodel_2_0= RULE_STRING ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:387:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_metamodel_2_0= RULE_STRING ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:387:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_metamodel_2_0= RULE_STRING ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:387:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_metamodel_2_0= RULE_STRING ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:387:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:388:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:388:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:389:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMetamodelModelAnnotationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMetamodelModelAnnotation715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getMetamodelModelAnnotationAccess().getAnnotatedElementRepresentModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMetamodelModelAnnotation727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMetamodelModelAnnotationAccess().getColonKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:404:1: ( (lv_metamodel_2_0= RULE_STRING ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:405:1: (lv_metamodel_2_0= RULE_STRING )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:405:1: (lv_metamodel_2_0= RULE_STRING )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:406:3: lv_metamodel_2_0= RULE_STRING
            {
            lv_metamodel_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMetamodelModelAnnotation744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_metamodel_2_0, grammarAccess.getMetamodelModelAnnotationAccess().getMetamodelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleMetamodelModelAnnotation"


    // $ANTLR start "entryRuleTransformationDefinitionParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:430:1: entryRuleTransformationDefinitionParameter returns [EObject current=null] : iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF ;
    public final EObject entryRuleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationDefinitionParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:431:2: (iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:432:2: iv_ruleTransformationDefinitionParameter= ruleTransformationDefinitionParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformationDefinitionParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter785);
            iv_ruleTransformationDefinitionParameter=ruleTransformationDefinitionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformationDefinitionParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter795); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:439:1: ruleTransformationDefinitionParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTransformationDefinitionParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:442:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:443:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:443:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:443:2: () ( (lv_name_1_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:443:2: ()
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:444:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransformationDefinitionParameterAccess().getTransformationDefinitionParameterAction_0(),
                          current);
                  
            }

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:449:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:450:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:450:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:451:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransformationDefinitionParameterAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter850);
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


    // $ANTLR start "entryRuleInlineModel"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:475:1: entryRuleInlineModel returns [EObject current=null] : iv_ruleInlineModel= ruleInlineModel EOF ;
    public final EObject entryRuleInlineModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineModel = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:476:2: (iv_ruleInlineModel= ruleInlineModel EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:477:2: iv_ruleInlineModel= ruleInlineModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInlineModel_in_entryRuleInlineModel886);
            iv_ruleInlineModel=ruleInlineModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineModel896); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInlineModel"


    // $ANTLR start "ruleInlineModel"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:484:1: ruleInlineModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= ruleEString ) ) ( (lv_classes_2_0= ruleInlineClass ) )+ otherlv_3= 'end' ) ;
    public final EObject ruleInlineModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_classes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:487:28: ( (otherlv_0= 'model' ( (lv_name_1_0= ruleEString ) ) ( (lv_classes_2_0= ruleInlineClass ) )+ otherlv_3= 'end' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:488:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleEString ) ) ( (lv_classes_2_0= ruleInlineClass ) )+ otherlv_3= 'end' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:488:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleEString ) ) ( (lv_classes_2_0= ruleInlineClass ) )+ otherlv_3= 'end' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:488:3: otherlv_0= 'model' ( (lv_name_1_0= ruleEString ) ) ( (lv_classes_2_0= ruleInlineClass ) )+ otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInlineModel933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInlineModelAccess().getModelKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:492:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:493:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:493:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:494:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInlineModelAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInlineModel954);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInlineModelRule());
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:510:2: ( (lv_classes_2_0= ruleInlineClass ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:511:1: (lv_classes_2_0= ruleInlineClass )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:511:1: (lv_classes_2_0= ruleInlineClass )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:512:3: lv_classes_2_0= ruleInlineClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInlineModelAccess().getClassesInlineClassParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleInlineClass_in_ruleInlineModel975);
            	    lv_classes_2_0=ruleInlineClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInlineModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classes",
            	              		lv_classes_2_0, 
            	              		"InlineClass");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInlineModel988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInlineModelAccess().getEndKeyword_3());
                  
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
    // $ANTLR end "ruleInlineModel"


    // $ANTLR start "entryRuleInlineClass"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:540:1: entryRuleInlineClass returns [EObject current=null] : iv_ruleInlineClass= ruleInlineClass EOF ;
    public final EObject entryRuleInlineClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineClass = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:541:2: (iv_ruleInlineClass= ruleInlineClass EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:542:2: iv_ruleInlineClass= ruleInlineClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineClassRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInlineClass_in_entryRuleInlineClass1024);
            iv_ruleInlineClass=ruleInlineClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineClass; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineClass1034); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInlineClass"


    // $ANTLR start "ruleInlineClass"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:549:1: ruleInlineClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_features_3_0= ruleInlineReferenceInline ) ) (otherlv_4= ';' ( (lv_features_5_0= ruleInlineReferenceInline ) ) )* otherlv_6= '}' ) | ( ( (lv_features_7_0= ruleInlineFeatureExpanded ) ) ( (lv_features_8_0= ruleInlineFeatureExpanded ) )* otherlv_9= 'end' ) ) ) ;
    public final EObject ruleInlineClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_features_3_0 = null;

        EObject lv_features_5_0 = null;

        EObject lv_features_7_0 = null;

        EObject lv_features_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:552:28: ( (otherlv_0= 'class' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_features_3_0= ruleInlineReferenceInline ) ) (otherlv_4= ';' ( (lv_features_5_0= ruleInlineReferenceInline ) ) )* otherlv_6= '}' ) | ( ( (lv_features_7_0= ruleInlineFeatureExpanded ) ) ( (lv_features_8_0= ruleInlineFeatureExpanded ) )* otherlv_9= 'end' ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:553:1: (otherlv_0= 'class' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_features_3_0= ruleInlineReferenceInline ) ) (otherlv_4= ';' ( (lv_features_5_0= ruleInlineReferenceInline ) ) )* otherlv_6= '}' ) | ( ( (lv_features_7_0= ruleInlineFeatureExpanded ) ) ( (lv_features_8_0= ruleInlineFeatureExpanded ) )* otherlv_9= 'end' ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:553:1: (otherlv_0= 'class' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_features_3_0= ruleInlineReferenceInline ) ) (otherlv_4= ';' ( (lv_features_5_0= ruleInlineReferenceInline ) ) )* otherlv_6= '}' ) | ( ( (lv_features_7_0= ruleInlineFeatureExpanded ) ) ( (lv_features_8_0= ruleInlineFeatureExpanded ) )* otherlv_9= 'end' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:553:3: otherlv_0= 'class' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_features_3_0= ruleInlineReferenceInline ) ) (otherlv_4= ';' ( (lv_features_5_0= ruleInlineReferenceInline ) ) )* otherlv_6= '}' ) | ( ( (lv_features_7_0= ruleInlineFeatureExpanded ) ) ( (lv_features_8_0= ruleInlineFeatureExpanded ) )* otherlv_9= 'end' ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInlineClass1071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInlineClassAccess().getClassKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:557:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:558:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:558:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:559:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInlineClassAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInlineClass1092);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInlineClassRule());
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:575:2: ( (otherlv_2= '{' ( (lv_features_3_0= ruleInlineReferenceInline ) ) (otherlv_4= ';' ( (lv_features_5_0= ruleInlineReferenceInline ) ) )* otherlv_6= '}' ) | ( ( (lv_features_7_0= ruleInlineFeatureExpanded ) ) ( (lv_features_8_0= ruleInlineFeatureExpanded ) )* otherlv_9= 'end' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==25||LA12_0==27) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:575:3: (otherlv_2= '{' ( (lv_features_3_0= ruleInlineReferenceInline ) ) (otherlv_4= ';' ( (lv_features_5_0= ruleInlineReferenceInline ) ) )* otherlv_6= '}' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:575:3: (otherlv_2= '{' ( (lv_features_3_0= ruleInlineReferenceInline ) ) (otherlv_4= ';' ( (lv_features_5_0= ruleInlineReferenceInline ) ) )* otherlv_6= '}' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:575:5: otherlv_2= '{' ( (lv_features_3_0= ruleInlineReferenceInline ) ) (otherlv_4= ';' ( (lv_features_5_0= ruleInlineReferenceInline ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInlineClass1106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInlineClassAccess().getLeftCurlyBracketKeyword_2_0_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:579:1: ( (lv_features_3_0= ruleInlineReferenceInline ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:580:1: (lv_features_3_0= ruleInlineReferenceInline )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:580:1: (lv_features_3_0= ruleInlineReferenceInline )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:581:3: lv_features_3_0= ruleInlineReferenceInline
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInlineClassAccess().getFeaturesInlineReferenceInlineParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInlineReferenceInline_in_ruleInlineClass1127);
                    lv_features_3_0=ruleInlineReferenceInline();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInlineClassRule());
                      	        }
                             		add(
                             			current, 
                             			"features",
                              		lv_features_3_0, 
                              		"InlineReferenceInline");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:597:2: (otherlv_4= ';' ( (lv_features_5_0= ruleInlineReferenceInline ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==23) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:597:4: otherlv_4= ';' ( (lv_features_5_0= ruleInlineReferenceInline ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInlineClass1140); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getInlineClassAccess().getSemicolonKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:601:1: ( (lv_features_5_0= ruleInlineReferenceInline ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:602:1: (lv_features_5_0= ruleInlineReferenceInline )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:602:1: (lv_features_5_0= ruleInlineReferenceInline )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:603:3: lv_features_5_0= ruleInlineReferenceInline
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInlineClassAccess().getFeaturesInlineReferenceInlineParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineReferenceInline_in_ruleInlineClass1161);
                    	    lv_features_5_0=ruleInlineReferenceInline();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInlineClassRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"features",
                    	              		lv_features_5_0, 
                    	              		"InlineReferenceInline");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInlineClass1175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInlineClassAccess().getRightCurlyBracketKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:624:6: ( ( (lv_features_7_0= ruleInlineFeatureExpanded ) ) ( (lv_features_8_0= ruleInlineFeatureExpanded ) )* otherlv_9= 'end' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:624:6: ( ( (lv_features_7_0= ruleInlineFeatureExpanded ) ) ( (lv_features_8_0= ruleInlineFeatureExpanded ) )* otherlv_9= 'end' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:624:7: ( (lv_features_7_0= ruleInlineFeatureExpanded ) ) ( (lv_features_8_0= ruleInlineFeatureExpanded ) )* otherlv_9= 'end'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:624:7: ( (lv_features_7_0= ruleInlineFeatureExpanded ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:625:1: (lv_features_7_0= ruleInlineFeatureExpanded )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:625:1: (lv_features_7_0= ruleInlineFeatureExpanded )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:626:3: lv_features_7_0= ruleInlineFeatureExpanded
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInlineClassAccess().getFeaturesInlineFeatureExpandedParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInlineFeatureExpanded_in_ruleInlineClass1204);
                    lv_features_7_0=ruleInlineFeatureExpanded();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInlineClassRule());
                      	        }
                             		add(
                             			current, 
                             			"features",
                              		lv_features_7_0, 
                              		"InlineFeatureExpanded");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:642:2: ( (lv_features_8_0= ruleInlineFeatureExpanded ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==25||LA11_0==27) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:643:1: (lv_features_8_0= ruleInlineFeatureExpanded )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:643:1: (lv_features_8_0= ruleInlineFeatureExpanded )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:644:3: lv_features_8_0= ruleInlineFeatureExpanded
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInlineClassAccess().getFeaturesInlineFeatureExpandedParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleInlineFeatureExpanded_in_ruleInlineClass1225);
                    	    lv_features_8_0=ruleInlineFeatureExpanded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInlineClassRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"features",
                    	              		lv_features_8_0, 
                    	              		"InlineFeatureExpanded");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInlineClass1238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getInlineClassAccess().getEndKeyword_2_1_2());
                          
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
    // $ANTLR end "ruleInlineClass"


    // $ANTLR start "entryRuleInlineReferenceInline"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:672:1: entryRuleInlineReferenceInline returns [EObject current=null] : iv_ruleInlineReferenceInline= ruleInlineReferenceInline EOF ;
    public final EObject entryRuleInlineReferenceInline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineReferenceInline = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:673:2: (iv_ruleInlineReferenceInline= ruleInlineReferenceInline EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:674:2: iv_ruleInlineReferenceInline= ruleInlineReferenceInline EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineReferenceInlineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInlineReferenceInline_in_entryRuleInlineReferenceInline1276);
            iv_ruleInlineReferenceInline=ruleInlineReferenceInline();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineReferenceInline; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineReferenceInline1286); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInlineReferenceInline"


    // $ANTLR start "ruleInlineReferenceInline"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:681:1: ruleInlineReferenceInline returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) ;
    public final EObject ruleInlineReferenceInline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:684:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:685:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:685:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:685:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:685:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:686:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:686:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:687:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInlineReferenceInlineAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInlineReferenceInline1332);
            lv_name_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInlineReferenceInlineRule());
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

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInlineReferenceInline1344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInlineReferenceInlineAccess().getColonKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:707:1: ( (lv_type_2_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:708:1: (lv_type_2_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:708:1: (lv_type_2_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:709:3: lv_type_2_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInlineReferenceInlineAccess().getTypeTypeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleInlineReferenceInline1365);
            lv_type_2_0=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInlineReferenceInlineRule());
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
    // $ANTLR end "ruleInlineReferenceInline"


    // $ANTLR start "entryRuleInlineFeatureExpanded"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:733:1: entryRuleInlineFeatureExpanded returns [EObject current=null] : iv_ruleInlineFeatureExpanded= ruleInlineFeatureExpanded EOF ;
    public final EObject entryRuleInlineFeatureExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineFeatureExpanded = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:734:2: (iv_ruleInlineFeatureExpanded= ruleInlineFeatureExpanded EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:735:2: iv_ruleInlineFeatureExpanded= ruleInlineFeatureExpanded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineFeatureExpandedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInlineFeatureExpanded_in_entryRuleInlineFeatureExpanded1401);
            iv_ruleInlineFeatureExpanded=ruleInlineFeatureExpanded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineFeatureExpanded; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineFeatureExpanded1411); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInlineFeatureExpanded"


    // $ANTLR start "ruleInlineFeatureExpanded"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:742:1: ruleInlineFeatureExpanded returns [EObject current=null] : (this_InlineAttributeExpanded_0= ruleInlineAttributeExpanded | this_InlineReferenceExpanded_1= ruleInlineReferenceExpanded ) ;
    public final EObject ruleInlineFeatureExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_InlineAttributeExpanded_0 = null;

        EObject this_InlineReferenceExpanded_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:745:28: ( (this_InlineAttributeExpanded_0= ruleInlineAttributeExpanded | this_InlineReferenceExpanded_1= ruleInlineReferenceExpanded ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:746:1: (this_InlineAttributeExpanded_0= ruleInlineAttributeExpanded | this_InlineReferenceExpanded_1= ruleInlineReferenceExpanded )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:746:1: (this_InlineAttributeExpanded_0= ruleInlineAttributeExpanded | this_InlineReferenceExpanded_1= ruleInlineReferenceExpanded )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:747:5: this_InlineAttributeExpanded_0= ruleInlineAttributeExpanded
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInlineFeatureExpandedAccess().getInlineAttributeExpandedParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInlineAttributeExpanded_in_ruleInlineFeatureExpanded1458);
                    this_InlineAttributeExpanded_0=ruleInlineAttributeExpanded();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InlineAttributeExpanded_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:757:5: this_InlineReferenceExpanded_1= ruleInlineReferenceExpanded
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInlineFeatureExpandedAccess().getInlineReferenceExpandedParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInlineReferenceExpanded_in_ruleInlineFeatureExpanded1485);
                    this_InlineReferenceExpanded_1=ruleInlineReferenceExpanded();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InlineReferenceExpanded_1; 
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
    // $ANTLR end "ruleInlineFeatureExpanded"


    // $ANTLR start "entryRuleInlineAttributeExpanded"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:773:1: entryRuleInlineAttributeExpanded returns [EObject current=null] : iv_ruleInlineAttributeExpanded= ruleInlineAttributeExpanded EOF ;
    public final EObject entryRuleInlineAttributeExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineAttributeExpanded = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:774:2: (iv_ruleInlineAttributeExpanded= ruleInlineAttributeExpanded EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:775:2: iv_ruleInlineAttributeExpanded= ruleInlineAttributeExpanded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineAttributeExpandedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInlineAttributeExpanded_in_entryRuleInlineAttributeExpanded1520);
            iv_ruleInlineAttributeExpanded=ruleInlineAttributeExpanded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineAttributeExpanded; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineAttributeExpanded1530); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInlineAttributeExpanded"


    // $ANTLR start "ruleInlineAttributeExpanded"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:782:1: ruleInlineAttributeExpanded returns [EObject current=null] : (otherlv_0= 'att' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ( (lv_multivalued_4_0= '*' ) )? ) ;
    public final EObject ruleInlineAttributeExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_multivalued_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:785:28: ( (otherlv_0= 'att' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ( (lv_multivalued_4_0= '*' ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:786:1: (otherlv_0= 'att' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ( (lv_multivalued_4_0= '*' ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:786:1: (otherlv_0= 'att' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ( (lv_multivalued_4_0= '*' ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:786:3: otherlv_0= 'att' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ( (lv_multivalued_4_0= '*' ) )?
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInlineAttributeExpanded1567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInlineAttributeExpandedAccess().getAttKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:790:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:791:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:791:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:792:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInlineAttributeExpandedAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInlineAttributeExpanded1588);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInlineAttributeExpandedRule());
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

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInlineAttributeExpanded1600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInlineAttributeExpandedAccess().getColonKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:812:1: ( (lv_type_3_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:813:1: (lv_type_3_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:813:1: (lv_type_3_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:814:3: lv_type_3_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInlineAttributeExpandedAccess().getTypeTypeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleInlineAttributeExpanded1621);
            lv_type_3_0=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInlineAttributeExpandedRule());
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:830:2: ( (lv_multivalued_4_0= '*' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:831:1: (lv_multivalued_4_0= '*' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:831:1: (lv_multivalued_4_0= '*' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:832:3: lv_multivalued_4_0= '*'
                    {
                    lv_multivalued_4_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInlineAttributeExpanded1639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multivalued_4_0, grammarAccess.getInlineAttributeExpandedAccess().getMultivaluedAsteriskKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInlineAttributeExpandedRule());
                      	        }
                             		setWithLastConsumed(current, "multivalued", true, "*");
                      	    
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
    // $ANTLR end "ruleInlineAttributeExpanded"


    // $ANTLR start "entryRuleInlineReferenceExpanded"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:853:1: entryRuleInlineReferenceExpanded returns [EObject current=null] : iv_ruleInlineReferenceExpanded= ruleInlineReferenceExpanded EOF ;
    public final EObject entryRuleInlineReferenceExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineReferenceExpanded = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:854:2: (iv_ruleInlineReferenceExpanded= ruleInlineReferenceExpanded EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:855:2: iv_ruleInlineReferenceExpanded= ruleInlineReferenceExpanded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineReferenceExpandedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInlineReferenceExpanded_in_entryRuleInlineReferenceExpanded1689);
            iv_ruleInlineReferenceExpanded=ruleInlineReferenceExpanded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineReferenceExpanded; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineReferenceExpanded1699); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInlineReferenceExpanded"


    // $ANTLR start "ruleInlineReferenceExpanded"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:862:1: ruleInlineReferenceExpanded returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ( (lv_multivalued_4_0= '*' ) )? ) ;
    public final EObject ruleInlineReferenceExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_multivalued_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:865:28: ( (otherlv_0= 'ref' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ( (lv_multivalued_4_0= '*' ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:866:1: (otherlv_0= 'ref' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ( (lv_multivalued_4_0= '*' ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:866:1: (otherlv_0= 'ref' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ( (lv_multivalued_4_0= '*' ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:866:3: otherlv_0= 'ref' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ( (lv_multivalued_4_0= '*' ) )?
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInlineReferenceExpanded1736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInlineReferenceExpandedAccess().getRefKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:870:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:871:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:871:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:872:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInlineReferenceExpandedAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInlineReferenceExpanded1757);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInlineReferenceExpandedRule());
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

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInlineReferenceExpanded1769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInlineReferenceExpandedAccess().getColonKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:892:1: ( (lv_type_3_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:893:1: (lv_type_3_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:893:1: (lv_type_3_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:894:3: lv_type_3_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInlineReferenceExpandedAccess().getTypeTypeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleInlineReferenceExpanded1790);
            lv_type_3_0=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInlineReferenceExpandedRule());
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:910:2: ( (lv_multivalued_4_0= '*' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:911:1: (lv_multivalued_4_0= '*' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:911:1: (lv_multivalued_4_0= '*' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:912:3: lv_multivalued_4_0= '*'
                    {
                    lv_multivalued_4_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInlineReferenceExpanded1808); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multivalued_4_0, grammarAccess.getInlineReferenceExpandedAccess().getMultivaluedAsteriskKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInlineReferenceExpandedRule());
                      	        }
                             		setWithLastConsumed(current, "multivalued", true, "*");
                      	    
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
    // $ANTLR end "ruleInlineReferenceExpanded"


    // $ANTLR start "entryRuleQoolQueue"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:933:1: entryRuleQoolQueue returns [EObject current=null] : iv_ruleQoolQueue= ruleQoolQueue EOF ;
    public final EObject entryRuleQoolQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQoolQueue = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:934:2: (iv_ruleQoolQueue= ruleQoolQueue EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:935:2: iv_ruleQoolQueue= ruleQoolQueue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQoolQueueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQoolQueue_in_entryRuleQoolQueue1858);
            iv_ruleQoolQueue=ruleQoolQueue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQoolQueue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQoolQueue1868); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQoolQueue"


    // $ANTLR start "ruleQoolQueue"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:942:1: ruleQoolQueue returns [EObject current=null] : (this_LocalQueue_0= ruleLocalQueue | this_ModelElementQueue_1= ruleModelElementQueue ) ;
    public final EObject ruleQoolQueue() throws RecognitionException {
        EObject current = null;

        EObject this_LocalQueue_0 = null;

        EObject this_ModelElementQueue_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:945:28: ( (this_LocalQueue_0= ruleLocalQueue | this_ModelElementQueue_1= ruleModelElementQueue ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:946:1: (this_LocalQueue_0= ruleLocalQueue | this_ModelElementQueue_1= ruleModelElementQueue )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:946:1: (this_LocalQueue_0= ruleLocalQueue | this_ModelElementQueue_1= ruleModelElementQueue )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            else if ( (LA16_0==19) ) {
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:947:5: this_LocalQueue_0= ruleLocalQueue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQoolQueueAccess().getLocalQueueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLocalQueue_in_ruleQoolQueue1915);
                    this_LocalQueue_0=ruleLocalQueue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalQueue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:957:5: this_ModelElementQueue_1= ruleModelElementQueue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQoolQueueAccess().getModelElementQueueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModelElementQueue_in_ruleQoolQueue1942);
                    this_ModelElementQueue_1=ruleModelElementQueue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ModelElementQueue_1; 
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
    // $ANTLR end "ruleQoolQueue"


    // $ANTLR start "entryRuleLocalQueue"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:973:1: entryRuleLocalQueue returns [EObject current=null] : iv_ruleLocalQueue= ruleLocalQueue EOF ;
    public final EObject entryRuleLocalQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalQueue = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:974:2: (iv_ruleLocalQueue= ruleLocalQueue EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:975:2: iv_ruleLocalQueue= ruleLocalQueue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalQueueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocalQueue_in_entryRuleLocalQueue1977);
            iv_ruleLocalQueue=ruleLocalQueue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalQueue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalQueue1987); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalQueue"


    // $ANTLR start "ruleLocalQueue"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:982:1: ruleLocalQueue returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'queue' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type__4_0= ruleTypeExpression ) ) (otherlv_5= 'with' ( (lv_optimizations_6_0= ruleQueueOptimization ) )+ )? ) ;
    public final EObject ruleLocalQueue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type__4_0 = null;

        EObject lv_optimizations_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:985:28: ( (otherlv_0= 'local' otherlv_1= 'queue' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type__4_0= ruleTypeExpression ) ) (otherlv_5= 'with' ( (lv_optimizations_6_0= ruleQueueOptimization ) )+ )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:986:1: (otherlv_0= 'local' otherlv_1= 'queue' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type__4_0= ruleTypeExpression ) ) (otherlv_5= 'with' ( (lv_optimizations_6_0= ruleQueueOptimization ) )+ )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:986:1: (otherlv_0= 'local' otherlv_1= 'queue' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type__4_0= ruleTypeExpression ) ) (otherlv_5= 'with' ( (lv_optimizations_6_0= ruleQueueOptimization ) )+ )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:986:3: otherlv_0= 'local' otherlv_1= 'queue' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type__4_0= ruleTypeExpression ) ) (otherlv_5= 'with' ( (lv_optimizations_6_0= ruleQueueOptimization ) )+ )?
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLocalQueue2024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocalQueueAccess().getLocalKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLocalQueue2036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalQueueAccess().getQueueKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:994:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:995:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:995:1: (lv_name_2_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:996:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLocalQueue2053); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getLocalQueueAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalQueueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLocalQueue2070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLocalQueueAccess().getColonKeyword_3());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1016:1: ( (lv_type__4_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1017:1: (lv_type__4_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1017:1: (lv_type__4_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1018:3: lv_type__4_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalQueueAccess().getType_TypeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleLocalQueue2091);
            lv_type__4_0=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalQueueRule());
              	        }
                     		set(
                     			current, 
                     			"type_",
                      		lv_type__4_0, 
                      		"TypeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1034:2: (otherlv_5= 'with' ( (lv_optimizations_6_0= ruleQueueOptimization ) )+ )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1034:4: otherlv_5= 'with' ( (lv_optimizations_6_0= ruleQueueOptimization ) )+
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLocalQueue2104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLocalQueueAccess().getWithKeyword_5_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1038:1: ( (lv_optimizations_6_0= ruleQueueOptimization ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==31) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1039:1: (lv_optimizations_6_0= ruleQueueOptimization )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1039:1: (lv_optimizations_6_0= ruleQueueOptimization )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1040:3: lv_optimizations_6_0= ruleQueueOptimization
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLocalQueueAccess().getOptimizationsQueueOptimizationParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleQueueOptimization_in_ruleLocalQueue2125);
                    	    lv_optimizations_6_0=ruleQueueOptimization();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLocalQueueRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"optimizations",
                    	              		lv_optimizations_6_0, 
                    	              		"QueueOptimization");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
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
    // $ANTLR end "ruleLocalQueue"


    // $ANTLR start "entryRuleModelElementQueue"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1064:1: entryRuleModelElementQueue returns [EObject current=null] : iv_ruleModelElementQueue= ruleModelElementQueue EOF ;
    public final EObject entryRuleModelElementQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementQueue = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1065:2: (iv_ruleModelElementQueue= ruleModelElementQueue EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1066:2: iv_ruleModelElementQueue= ruleModelElementQueue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelElementQueueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModelElementQueue_in_entryRuleModelElementQueue2164);
            iv_ruleModelElementQueue=ruleModelElementQueue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelElementQueue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelElementQueue2174); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModelElementQueue"


    // $ANTLR start "ruleModelElementQueue"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1073:1: ruleModelElementQueue returns [EObject current=null] : (otherlv_0= 'model' otherlv_1= 'queue' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_class__4_0= ruleClassUse ) ) (otherlv_5= ',' ( (lv_additionals_6_0= ruleClassUse ) ) )* ) ;
    public final EObject ruleModelElementQueue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_class__4_0 = null;

        EObject lv_additionals_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1076:28: ( (otherlv_0= 'model' otherlv_1= 'queue' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_class__4_0= ruleClassUse ) ) (otherlv_5= ',' ( (lv_additionals_6_0= ruleClassUse ) ) )* ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1077:1: (otherlv_0= 'model' otherlv_1= 'queue' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_class__4_0= ruleClassUse ) ) (otherlv_5= ',' ( (lv_additionals_6_0= ruleClassUse ) ) )* )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1077:1: (otherlv_0= 'model' otherlv_1= 'queue' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_class__4_0= ruleClassUse ) ) (otherlv_5= ',' ( (lv_additionals_6_0= ruleClassUse ) ) )* )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1077:3: otherlv_0= 'model' otherlv_1= 'queue' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_class__4_0= ruleClassUse ) ) (otherlv_5= ',' ( (lv_additionals_6_0= ruleClassUse ) ) )*
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModelElementQueue2211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelElementQueueAccess().getModelKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleModelElementQueue2223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelElementQueueAccess().getQueueKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1085:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1086:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1086:1: (lv_name_2_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1087:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModelElementQueue2240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getModelElementQueueAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getModelElementQueueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleModelElementQueue2257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModelElementQueueAccess().getColonKeyword_3());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1107:1: ( (lv_class__4_0= ruleClassUse ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1108:1: (lv_class__4_0= ruleClassUse )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1108:1: (lv_class__4_0= ruleClassUse )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1109:3: lv_class__4_0= ruleClassUse
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelElementQueueAccess().getClass_ClassUseParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleModelElementQueue2278);
            lv_class__4_0=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelElementQueueRule());
              	        }
                     		set(
                     			current, 
                     			"class_",
                      		lv_class__4_0, 
                      		"ClassUse");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1125:2: (otherlv_5= ',' ( (lv_additionals_6_0= ruleClassUse ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1125:4: otherlv_5= ',' ( (lv_additionals_6_0= ruleClassUse ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModelElementQueue2291); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getModelElementQueueAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1129:1: ( (lv_additionals_6_0= ruleClassUse ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1130:1: (lv_additionals_6_0= ruleClassUse )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1130:1: (lv_additionals_6_0= ruleClassUse )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1131:3: lv_additionals_6_0= ruleClassUse
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelElementQueueAccess().getAdditionalsClassUseParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleModelElementQueue2312);
            	    lv_additionals_6_0=ruleClassUse();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelElementQueueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"additionals",
            	              		lv_additionals_6_0, 
            	              		"ClassUse");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
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
    // $ANTLR end "ruleModelElementQueue"


    // $ANTLR start "entryRuleQueueOptimization"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1155:1: entryRuleQueueOptimization returns [EObject current=null] : iv_ruleQueueOptimization= ruleQueueOptimization EOF ;
    public final EObject entryRuleQueueOptimization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueueOptimization = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1156:2: (iv_ruleQueueOptimization= ruleQueueOptimization EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1157:2: iv_ruleQueueOptimization= ruleQueueOptimization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueueOptimizationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQueueOptimization_in_entryRuleQueueOptimization2350);
            iv_ruleQueueOptimization=ruleQueueOptimization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueueOptimization; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQueueOptimization2360); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQueueOptimization"


    // $ANTLR start "ruleQueueOptimization"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1164:1: ruleQueueOptimization returns [EObject current=null] : this_AccessByFeatureOptimization_0= ruleAccessByFeatureOptimization ;
    public final EObject ruleQueueOptimization() throws RecognitionException {
        EObject current = null;

        EObject this_AccessByFeatureOptimization_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1167:28: (this_AccessByFeatureOptimization_0= ruleAccessByFeatureOptimization )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1169:5: this_AccessByFeatureOptimization_0= ruleAccessByFeatureOptimization
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQueueOptimizationAccess().getAccessByFeatureOptimizationParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAccessByFeatureOptimization_in_ruleQueueOptimization2406);
            this_AccessByFeatureOptimization_0=ruleAccessByFeatureOptimization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AccessByFeatureOptimization_0; 
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
    // $ANTLR end "ruleQueueOptimization"


    // $ANTLR start "entryRuleAccessByFeatureOptimization"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1185:1: entryRuleAccessByFeatureOptimization returns [EObject current=null] : iv_ruleAccessByFeatureOptimization= ruleAccessByFeatureOptimization EOF ;
    public final EObject entryRuleAccessByFeatureOptimization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessByFeatureOptimization = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1186:2: (iv_ruleAccessByFeatureOptimization= ruleAccessByFeatureOptimization EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1187:2: iv_ruleAccessByFeatureOptimization= ruleAccessByFeatureOptimization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessByFeatureOptimizationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAccessByFeatureOptimization_in_entryRuleAccessByFeatureOptimization2440);
            iv_ruleAccessByFeatureOptimization=ruleAccessByFeatureOptimization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessByFeatureOptimization; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccessByFeatureOptimization2450); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAccessByFeatureOptimization"


    // $ANTLR start "ruleAccessByFeatureOptimization"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1194:1: ruleAccessByFeatureOptimization returns [EObject current=null] : (otherlv_0= 'access-by' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_force_2_0= '!' ) )? ) ;
    public final EObject ruleAccessByFeatureOptimization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_force_2_0=null;
        AntlrDatatypeRuleToken lv_featureName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1197:28: ( (otherlv_0= 'access-by' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_force_2_0= '!' ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1198:1: (otherlv_0= 'access-by' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_force_2_0= '!' ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1198:1: (otherlv_0= 'access-by' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_force_2_0= '!' ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1198:3: otherlv_0= 'access-by' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_force_2_0= '!' ) )?
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAccessByFeatureOptimization2487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAccessByFeatureOptimizationAccess().getAccessByKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1202:1: ( (lv_featureName_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1203:1: (lv_featureName_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1203:1: (lv_featureName_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1204:3: lv_featureName_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAccessByFeatureOptimizationAccess().getFeatureNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccessByFeatureOptimization2508);
            lv_featureName_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAccessByFeatureOptimizationRule());
              	        }
                     		set(
                     			current, 
                     			"featureName",
                      		lv_featureName_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1220:2: ( (lv_force_2_0= '!' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1221:1: (lv_force_2_0= '!' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1221:1: (lv_force_2_0= '!' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1222:3: lv_force_2_0= '!'
                    {
                    lv_force_2_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAccessByFeatureOptimization2526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_force_2_0, grammarAccess.getAccessByFeatureOptimizationAccess().getForceExclamationMarkKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAccessByFeatureOptimizationRule());
                      	        }
                             		setWithLastConsumed(current, "force", true, "!");
                      	    
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
    // $ANTLR end "ruleAccessByFeatureOptimization"


    // $ANTLR start "entryRuleSegment"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1243:1: entryRuleSegment returns [EObject current=null] : iv_ruleSegment= ruleSegment EOF ;
    public final EObject entryRuleSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegment = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1244:2: (iv_ruleSegment= ruleSegment EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1245:2: iv_ruleSegment= ruleSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSegmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSegment_in_entryRuleSegment2576);
            iv_ruleSegment=ruleSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSegment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSegment2586); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSegment"


    // $ANTLR start "ruleSegment"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1252:1: ruleSegment returns [EObject current=null] : (otherlv_0= 'segment' ( (lv_name_1_0= ruleEString ) ) ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= 'end' ) ;
    public final EObject ruleSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1255:28: ( (otherlv_0= 'segment' ( (lv_name_1_0= ruleEString ) ) ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= 'end' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1256:1: (otherlv_0= 'segment' ( (lv_name_1_0= ruleEString ) ) ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= 'end' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1256:1: (otherlv_0= 'segment' ( (lv_name_1_0= ruleEString ) ) ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= 'end' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1256:3: otherlv_0= 'segment' ( (lv_name_1_0= ruleEString ) ) ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSegment2623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSegmentAccess().getSegmentKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1260:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1261:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1261:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1262:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSegmentAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSegment2644);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSegmentRule());
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1278:2: ( (lv_statements_2_0= ruleStatement ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==13||LA21_0==22||LA21_0==35||LA21_0==38||LA21_0==44||LA21_0==47||LA21_0==51||(LA21_0>=58 && LA21_0<=62)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1279:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1279:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1280:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSegmentAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleSegment2665);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSegmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSegment2678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSegmentAccess().getEndKeyword_3());
                  
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
    // $ANTLR end "ruleSegment"


    // $ANTLR start "entryRuleStatement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1308:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1309:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1310:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_entryRuleStatement2714);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatement2724); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1317:1: ruleStatement returns [EObject current=null] : (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite | this_ForAllStatement_4= ruleForAllStatement | this_EmitStatement_5= ruleEmitStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DefineVariable_0 = null;

        EObject this_Expression_1 = null;

        EObject this_PutTraceExpression_2 = null;

        EObject this_PropertyWrite_3 = null;

        EObject this_ForAllStatement_4 = null;

        EObject this_EmitStatement_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1320:28: ( (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite | this_ForAllStatement_4= ruleForAllStatement | this_EmitStatement_5= ruleEmitStatement ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1321:1: (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite | this_ForAllStatement_4= ruleForAllStatement | this_EmitStatement_5= ruleEmitStatement )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1321:1: (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite | this_ForAllStatement_4= ruleForAllStatement | this_EmitStatement_5= ruleEmitStatement )
            int alt22=6;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1322:5: this_DefineVariable_0= ruleDefineVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDefineVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_ruleStatement2771);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1332:5: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleStatement2798);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1342:5: this_PutTraceExpression_2= rulePutTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getPutTraceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_ruleStatement2825);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1352:5: this_PropertyWrite_3= rulePropertyWrite
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getPropertyWriteParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_ruleStatement2852);
                    this_PropertyWrite_3=rulePropertyWrite();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyWrite_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1362:5: this_ForAllStatement_4= ruleForAllStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getForAllStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleForAllStatement_in_ruleStatement2879);
                    this_ForAllStatement_4=ruleForAllStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForAllStatement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1372:5: this_EmitStatement_5= ruleEmitStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getEmitStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmitStatement_in_ruleStatement2906);
                    this_EmitStatement_5=ruleEmitStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EmitStatement_5; 
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


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1388:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1389:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1390:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2941);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression2951); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1397:1: rulePrimaryExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration | this_MatchExpression_6= ruleMatchExpression | this_InvokeTransformation_7= ruleInvokeTransformation | this_Copier_8= ruleCopier ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_VariableReference_1 = null;

        EObject this_ModelReference_2 = null;

        EObject this_ParenthesizedExpression_3 = null;

        EObject this_MatchTraceExpression_4 = null;

        EObject this_ClosureDeclaration_5 = null;

        EObject this_MatchExpression_6 = null;

        EObject this_InvokeTransformation_7 = null;

        EObject this_Copier_8 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1400:28: ( (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration | this_MatchExpression_6= ruleMatchExpression | this_InvokeTransformation_7= ruleInvokeTransformation | this_Copier_8= ruleCopier ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1401:1: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration | this_MatchExpression_6= ruleMatchExpression | this_InvokeTransformation_7= ruleInvokeTransformation | this_Copier_8= ruleCopier )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1401:1: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration | this_MatchExpression_6= ruleMatchExpression | this_InvokeTransformation_7= ruleInvokeTransformation | this_Copier_8= ruleCopier )
            int alt23=9;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1402:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rulePrimaryExpression2998);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1412:5: this_VariableReference_1= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rulePrimaryExpression3025);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1422:5: this_ModelReference_2= ruleModelReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getModelReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_rulePrimaryExpression3052);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1432:5: this_ParenthesizedExpression_3= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression3079);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1442:5: this_MatchTraceExpression_4= ruleMatchTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMatchTraceExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_rulePrimaryExpression3106);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1452:5: this_ClosureDeclaration_5= ruleClosureDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getClosureDeclarationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_rulePrimaryExpression3133);
                    this_ClosureDeclaration_5=ruleClosureDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClosureDeclaration_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1462:5: this_MatchExpression_6= ruleMatchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMatchExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMatchExpression_in_rulePrimaryExpression3160);
                    this_MatchExpression_6=ruleMatchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MatchExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1472:5: this_InvokeTransformation_7= ruleInvokeTransformation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInvokeTransformationParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvokeTransformation_in_rulePrimaryExpression3187);
                    this_InvokeTransformation_7=ruleInvokeTransformation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvokeTransformation_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1482:5: this_Copier_8= ruleCopier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCopierParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCopier_in_rulePrimaryExpression3214);
                    this_Copier_8=ruleCopier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Copier_8; 
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


    // $ANTLR start "entryRuleNamedInvocationParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1498:1: entryRuleNamedInvocationParameter returns [EObject current=null] : iv_ruleNamedInvocationParameter= ruleNamedInvocationParameter EOF ;
    public final EObject entryRuleNamedInvocationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedInvocationParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1499:2: (iv_ruleNamedInvocationParameter= ruleNamedInvocationParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1500:2: iv_ruleNamedInvocationParameter= ruleNamedInvocationParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedInvocationParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNamedInvocationParameter_in_entryRuleNamedInvocationParameter3249);
            iv_ruleNamedInvocationParameter=ruleNamedInvocationParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedInvocationParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedInvocationParameter3259); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNamedInvocationParameter"


    // $ANTLR start "ruleNamedInvocationParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1507:1: ruleNamedInvocationParameter returns [EObject current=null] : ( ( (lv_formalName_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_actualParameter_2_0= ruleExpression ) ) ) ;
    public final EObject ruleNamedInvocationParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_formalName_0_0 = null;

        EObject lv_actualParameter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1510:28: ( ( ( (lv_formalName_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_actualParameter_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1511:1: ( ( (lv_formalName_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_actualParameter_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1511:1: ( ( (lv_formalName_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_actualParameter_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1511:2: ( (lv_formalName_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_actualParameter_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1511:2: ( (lv_formalName_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1512:1: (lv_formalName_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1512:1: (lv_formalName_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1513:3: lv_formalName_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNamedInvocationParameterAccess().getFormalNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNamedInvocationParameter3305);
            lv_formalName_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNamedInvocationParameterRule());
              	        }
                     		set(
                     			current, 
                     			"formalName",
                      		lv_formalName_0_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNamedInvocationParameter3317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNamedInvocationParameterAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1533:1: ( (lv_actualParameter_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1534:1: (lv_actualParameter_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1534:1: (lv_actualParameter_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1535:3: lv_actualParameter_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNamedInvocationParameterAccess().getActualParameterExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleNamedInvocationParameter3338);
            lv_actualParameter_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNamedInvocationParameterRule());
              	        }
                     		set(
                     			current, 
                     			"actualParameter",
                      		lv_actualParameter_2_0, 
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
    // $ANTLR end "ruleNamedInvocationParameter"


    // $ANTLR start "entryRuleInvokeTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1559:1: entryRuleInvokeTransformation returns [EObject current=null] : iv_ruleInvokeTransformation= ruleInvokeTransformation EOF ;
    public final EObject entryRuleInvokeTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvokeTransformation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1560:2: (iv_ruleInvokeTransformation= ruleInvokeTransformation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1561:2: iv_ruleInvokeTransformation= ruleInvokeTransformation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvokeTransformationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvokeTransformation_in_entryRuleInvokeTransformation3374);
            iv_ruleInvokeTransformation=ruleInvokeTransformation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvokeTransformation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvokeTransformation3384); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvokeTransformation"


    // $ANTLR start "ruleInvokeTransformation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1568:1: ruleInvokeTransformation returns [EObject current=null] : (this_InvokeExternal_0= ruleInvokeExternal | this_InvokeInternal_1= ruleInvokeInternal ) ;
    public final EObject ruleInvokeTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_InvokeExternal_0 = null;

        EObject this_InvokeInternal_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1571:28: ( (this_InvokeExternal_0= ruleInvokeExternal | this_InvokeInternal_1= ruleInvokeInternal ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1572:1: (this_InvokeExternal_0= ruleInvokeExternal | this_InvokeInternal_1= ruleInvokeInternal )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1572:1: (this_InvokeExternal_0= ruleInvokeExternal | this_InvokeInternal_1= ruleInvokeInternal )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            else if ( (LA24_0==35) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1573:5: this_InvokeExternal_0= ruleInvokeExternal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInvokeTransformationAccess().getInvokeExternalParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvokeExternal_in_ruleInvokeTransformation3431);
                    this_InvokeExternal_0=ruleInvokeExternal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvokeExternal_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1583:5: this_InvokeInternal_1= ruleInvokeInternal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInvokeTransformationAccess().getInvokeInternalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvokeInternal_in_ruleInvokeTransformation3458);
                    this_InvokeInternal_1=ruleInvokeInternal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvokeInternal_1; 
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
    // $ANTLR end "ruleInvokeTransformation"


    // $ANTLR start "entryRuleInvokeInternal"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1599:1: entryRuleInvokeInternal returns [EObject current=null] : iv_ruleInvokeInternal= ruleInvokeInternal EOF ;
    public final EObject entryRuleInvokeInternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvokeInternal = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1600:2: (iv_ruleInvokeInternal= ruleInvokeInternal EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1601:2: iv_ruleInvokeInternal= ruleInvokeInternal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvokeInternalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvokeInternal_in_entryRuleInvokeInternal3493);
            iv_ruleInvokeInternal=ruleInvokeInternal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvokeInternal; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvokeInternal3503); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvokeInternal"


    // $ANTLR start "ruleInvokeInternal"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1608:1: ruleInvokeInternal returns [EObject current=null] : (otherlv_0= 'invoke-internal' ( (lv_transformationName_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )? otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )? otherlv_12= ')' (otherlv_13= 'input-view-filter' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'entrypoint' ( (lv_entryPointName_16_0= RULE_ID ) ) otherlv_17= '(' ( (lv_entryPointParameters_18_0= ruleExpression ) )? (otherlv_19= ',' ( (lv_entryPointParameters_20_0= ruleExpression ) ) )* otherlv_21= ')' )? ) ;
    public final EObject ruleInvokeInternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_entryPointName_16_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_transformationName_1_0 = null;

        EObject lv_sourceModels_3_0 = null;

        EObject lv_sourceModels_5_0 = null;

        EObject lv_targetModels_9_0 = null;

        EObject lv_targetModels_11_0 = null;

        EObject lv_entryPointParameters_18_0 = null;

        EObject lv_entryPointParameters_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1611:28: ( (otherlv_0= 'invoke-internal' ( (lv_transformationName_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )? otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )? otherlv_12= ')' (otherlv_13= 'input-view-filter' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'entrypoint' ( (lv_entryPointName_16_0= RULE_ID ) ) otherlv_17= '(' ( (lv_entryPointParameters_18_0= ruleExpression ) )? (otherlv_19= ',' ( (lv_entryPointParameters_20_0= ruleExpression ) ) )* otherlv_21= ')' )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1612:1: (otherlv_0= 'invoke-internal' ( (lv_transformationName_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )? otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )? otherlv_12= ')' (otherlv_13= 'input-view-filter' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'entrypoint' ( (lv_entryPointName_16_0= RULE_ID ) ) otherlv_17= '(' ( (lv_entryPointParameters_18_0= ruleExpression ) )? (otherlv_19= ',' ( (lv_entryPointParameters_20_0= ruleExpression ) ) )* otherlv_21= ')' )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1612:1: (otherlv_0= 'invoke-internal' ( (lv_transformationName_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )? otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )? otherlv_12= ')' (otherlv_13= 'input-view-filter' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'entrypoint' ( (lv_entryPointName_16_0= RULE_ID ) ) otherlv_17= '(' ( (lv_entryPointParameters_18_0= ruleExpression ) )? (otherlv_19= ',' ( (lv_entryPointParameters_20_0= ruleExpression ) ) )* otherlv_21= ')' )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1612:3: otherlv_0= 'invoke-internal' ( (lv_transformationName_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )? otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )? otherlv_12= ')' (otherlv_13= 'input-view-filter' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'entrypoint' ( (lv_entryPointName_16_0= RULE_ID ) ) otherlv_17= '(' ( (lv_entryPointParameters_18_0= ruleExpression ) )? (otherlv_19= ',' ( (lv_entryPointParameters_20_0= ruleExpression ) ) )* otherlv_21= ')' )?
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInvokeInternal3540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInvokeInternalAccess().getInvokeInternalKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1616:1: ( (lv_transformationName_1_0= ruleQualifiedName ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1617:1: (lv_transformationName_1_0= ruleQualifiedName )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1617:1: (lv_transformationName_1_0= ruleQualifiedName )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1618:3: lv_transformationName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInvokeInternalAccess().getTransformationNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleInvokeInternal3561);
            lv_transformationName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInvokeInternalRule());
              	        }
                     		set(
                     			current, 
                     			"transformationName",
                      		lv_transformationName_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvokeInternal3573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInvokeInternalAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1638:1: ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1638:2: ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )*
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1638:2: ( (lv_sourceModels_3_0= ruleInvocationParameter ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1639:1: (lv_sourceModels_3_0= ruleInvocationParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1639:1: (lv_sourceModels_3_0= ruleInvocationParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1640:3: lv_sourceModels_3_0= ruleInvocationParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInvokeInternalAccess().getSourceModelsInvocationParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvocationParameter_in_ruleInvokeInternal3595);
                    lv_sourceModels_3_0=ruleInvocationParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInvokeInternalRule());
                      	        }
                             		add(
                             			current, 
                             			"sourceModels",
                              		lv_sourceModels_3_0, 
                              		"InvocationParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1656:2: (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1656:4: otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInvokeInternal3608); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getInvokeInternalAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1660:1: ( (lv_sourceModels_5_0= ruleInvocationParameter ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1661:1: (lv_sourceModels_5_0= ruleInvocationParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1661:1: (lv_sourceModels_5_0= ruleInvocationParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1662:3: lv_sourceModels_5_0= ruleInvocationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInvokeInternalAccess().getSourceModelsInvocationParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvocationParameter_in_ruleInvokeInternal3629);
                    	    lv_sourceModels_5_0=ruleInvocationParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInvokeInternalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"sourceModels",
                    	              		lv_sourceModels_5_0, 
                    	              		"InvocationParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInvokeInternal3645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getInvokeInternalAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInvokeInternal3657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInvokeInternalAccess().getHyphenMinusGreaterThanSignKeyword_5());
                  
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvokeInternal3669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getInvokeInternalAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1690:1: ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1690:2: ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )*
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1690:2: ( (lv_targetModels_9_0= ruleInvocationParameter ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1691:1: (lv_targetModels_9_0= ruleInvocationParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1691:1: (lv_targetModels_9_0= ruleInvocationParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1692:3: lv_targetModels_9_0= ruleInvocationParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInvokeInternalAccess().getTargetModelsInvocationParameterParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvocationParameter_in_ruleInvokeInternal3691);
                    lv_targetModels_9_0=ruleInvocationParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInvokeInternalRule());
                      	        }
                             		add(
                             			current, 
                             			"targetModels",
                              		lv_targetModels_9_0, 
                              		"InvocationParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1708:2: (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1708:4: otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInvokeInternal3704); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getInvokeInternalAccess().getCommaKeyword_7_1_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1712:1: ( (lv_targetModels_11_0= ruleInvocationParameter ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1713:1: (lv_targetModels_11_0= ruleInvocationParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1713:1: (lv_targetModels_11_0= ruleInvocationParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1714:3: lv_targetModels_11_0= ruleInvocationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInvokeInternalAccess().getTargetModelsInvocationParameterParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvocationParameter_in_ruleInvokeInternal3725);
                    	    lv_targetModels_11_0=ruleInvocationParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInvokeInternalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"targetModels",
                    	              		lv_targetModels_11_0, 
                    	              		"InvocationParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInvokeInternal3741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getInvokeInternalAccess().getRightParenthesisKeyword_8());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1734:1: (otherlv_13= 'input-view-filter' ( (otherlv_14= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1734:3: otherlv_13= 'input-view-filter' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleInvokeInternal3754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getInvokeInternalAccess().getInputViewFilterKeyword_9_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1738:1: ( (otherlv_14= RULE_ID ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1739:1: (otherlv_14= RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1739:1: (otherlv_14= RULE_ID )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1740:3: otherlv_14= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInvokeInternalRule());
                      	        }
                              
                    }
                    otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInvokeInternal3774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_14, grammarAccess.getInvokeInternalAccess().getInputViewFilterDefineVariableCrossReference_9_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1751:4: (otherlv_15= 'entrypoint' ( (lv_entryPointName_16_0= RULE_ID ) ) otherlv_17= '(' ( (lv_entryPointParameters_18_0= ruleExpression ) )? (otherlv_19= ',' ( (lv_entryPointParameters_20_0= ruleExpression ) ) )* otherlv_21= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1751:6: otherlv_15= 'entrypoint' ( (lv_entryPointName_16_0= RULE_ID ) ) otherlv_17= '(' ( (lv_entryPointParameters_18_0= ruleExpression ) )? (otherlv_19= ',' ( (lv_entryPointParameters_20_0= ruleExpression ) ) )* otherlv_21= ')'
                    {
                    otherlv_15=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleInvokeInternal3789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getInvokeInternalAccess().getEntrypointKeyword_10_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1755:1: ( (lv_entryPointName_16_0= RULE_ID ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1756:1: (lv_entryPointName_16_0= RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1756:1: (lv_entryPointName_16_0= RULE_ID )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1757:3: lv_entryPointName_16_0= RULE_ID
                    {
                    lv_entryPointName_16_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInvokeInternal3806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_entryPointName_16_0, grammarAccess.getInvokeInternalAccess().getEntryPointNameIDTerminalRuleCall_10_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInvokeInternalRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"entryPointName",
                              		lv_entryPointName_16_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvokeInternal3823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getInvokeInternalAccess().getLeftParenthesisKeyword_10_2());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1777:1: ( (lv_entryPointParameters_18_0= ruleExpression ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INT)||LA30_0==13||LA30_0==22||LA30_0==35||LA30_0==38||LA30_0==51||LA30_0==58||(LA30_0>=60 && LA30_0<=62)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1778:1: (lv_entryPointParameters_18_0= ruleExpression )
                            {
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1778:1: (lv_entryPointParameters_18_0= ruleExpression )
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1779:3: lv_entryPointParameters_18_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInvokeInternalAccess().getEntryPointParametersExpressionParserRuleCall_10_3_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleInvokeInternal3844);
                            lv_entryPointParameters_18_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInvokeInternalRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"entryPointParameters",
                                      		lv_entryPointParameters_18_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1795:3: (otherlv_19= ',' ( (lv_entryPointParameters_20_0= ruleExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1795:5: otherlv_19= ',' ( (lv_entryPointParameters_20_0= ruleExpression ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInvokeInternal3858); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_19, grammarAccess.getInvokeInternalAccess().getCommaKeyword_10_4_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1799:1: ( (lv_entryPointParameters_20_0= ruleExpression ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1800:1: (lv_entryPointParameters_20_0= ruleExpression )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1800:1: (lv_entryPointParameters_20_0= ruleExpression )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1801:3: lv_entryPointParameters_20_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInvokeInternalAccess().getEntryPointParametersExpressionParserRuleCall_10_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleInvokeInternal3879);
                    	    lv_entryPointParameters_20_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInvokeInternalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"entryPointParameters",
                    	              		lv_entryPointParameters_20_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInvokeInternal3893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getInvokeInternalAccess().getRightParenthesisKeyword_10_5());
                          
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
    // $ANTLR end "ruleInvokeInternal"


    // $ANTLR start "entryRuleInvokeExternal"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1829:1: entryRuleInvokeExternal returns [EObject current=null] : iv_ruleInvokeExternal= ruleInvokeExternal EOF ;
    public final EObject entryRuleInvokeExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvokeExternal = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1830:2: (iv_ruleInvokeExternal= ruleInvokeExternal EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1831:2: iv_ruleInvokeExternal= ruleInvokeExternal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvokeExternalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvokeExternal_in_entryRuleInvokeExternal3931);
            iv_ruleInvokeExternal=ruleInvokeExternal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvokeExternal; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvokeExternal3941); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvokeExternal"


    // $ANTLR start "ruleInvokeExternal"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1838:1: ruleInvokeExternal returns [EObject current=null] : (otherlv_0= 'invoke-external' ( (lv_transformationName_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )? otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )? otherlv_12= ')' (otherlv_13= '+' otherlv_14= '(' ( (lv_parameters_15_0= ruleNamedInvocationParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleNamedInvocationParameter ) ) )* otherlv_18= ')' )? ( (otherlv_19= 'entrypoint' ( (lv_entryPointName_20_0= RULE_ID ) ) otherlv_21= '(' ( (lv_entryPointParameters_22_0= ruleExpression ) )? (otherlv_23= ',' ( (lv_entryPointParameters_24_0= ruleExpression ) ) )* otherlv_25= ')' )? | (otherlv_26= 'input-view-filter' ( (otherlv_27= RULE_ID ) ) (otherlv_28= 'output-element' ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) ) otherlv_30= '[' ( (lv_queueName_31_0= ruleEString ) ) otherlv_32= '.' ( (lv_traceAttributeName_33_0= ruleEString ) ) otherlv_34= ']' )? ) ) ) ;
    public final EObject ruleInvokeExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_entryPointName_20_0=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_transformationName_1_0 = null;

        EObject lv_sourceModels_3_0 = null;

        EObject lv_sourceModels_5_0 = null;

        EObject lv_targetModels_9_0 = null;

        EObject lv_targetModels_11_0 = null;

        EObject lv_parameters_15_0 = null;

        EObject lv_parameters_17_0 = null;

        EObject lv_entryPointParameters_22_0 = null;

        EObject lv_entryPointParameters_24_0 = null;

        EObject lv_outputResolutionSourceElement_29_0 = null;

        AntlrDatatypeRuleToken lv_queueName_31_0 = null;

        AntlrDatatypeRuleToken lv_traceAttributeName_33_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1841:28: ( (otherlv_0= 'invoke-external' ( (lv_transformationName_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )? otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )? otherlv_12= ')' (otherlv_13= '+' otherlv_14= '(' ( (lv_parameters_15_0= ruleNamedInvocationParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleNamedInvocationParameter ) ) )* otherlv_18= ')' )? ( (otherlv_19= 'entrypoint' ( (lv_entryPointName_20_0= RULE_ID ) ) otherlv_21= '(' ( (lv_entryPointParameters_22_0= ruleExpression ) )? (otherlv_23= ',' ( (lv_entryPointParameters_24_0= ruleExpression ) ) )* otherlv_25= ')' )? | (otherlv_26= 'input-view-filter' ( (otherlv_27= RULE_ID ) ) (otherlv_28= 'output-element' ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) ) otherlv_30= '[' ( (lv_queueName_31_0= ruleEString ) ) otherlv_32= '.' ( (lv_traceAttributeName_33_0= ruleEString ) ) otherlv_34= ']' )? ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1842:1: (otherlv_0= 'invoke-external' ( (lv_transformationName_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )? otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )? otherlv_12= ')' (otherlv_13= '+' otherlv_14= '(' ( (lv_parameters_15_0= ruleNamedInvocationParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleNamedInvocationParameter ) ) )* otherlv_18= ')' )? ( (otherlv_19= 'entrypoint' ( (lv_entryPointName_20_0= RULE_ID ) ) otherlv_21= '(' ( (lv_entryPointParameters_22_0= ruleExpression ) )? (otherlv_23= ',' ( (lv_entryPointParameters_24_0= ruleExpression ) ) )* otherlv_25= ')' )? | (otherlv_26= 'input-view-filter' ( (otherlv_27= RULE_ID ) ) (otherlv_28= 'output-element' ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) ) otherlv_30= '[' ( (lv_queueName_31_0= ruleEString ) ) otherlv_32= '.' ( (lv_traceAttributeName_33_0= ruleEString ) ) otherlv_34= ']' )? ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1842:1: (otherlv_0= 'invoke-external' ( (lv_transformationName_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )? otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )? otherlv_12= ')' (otherlv_13= '+' otherlv_14= '(' ( (lv_parameters_15_0= ruleNamedInvocationParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleNamedInvocationParameter ) ) )* otherlv_18= ')' )? ( (otherlv_19= 'entrypoint' ( (lv_entryPointName_20_0= RULE_ID ) ) otherlv_21= '(' ( (lv_entryPointParameters_22_0= ruleExpression ) )? (otherlv_23= ',' ( (lv_entryPointParameters_24_0= ruleExpression ) ) )* otherlv_25= ')' )? | (otherlv_26= 'input-view-filter' ( (otherlv_27= RULE_ID ) ) (otherlv_28= 'output-element' ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) ) otherlv_30= '[' ( (lv_queueName_31_0= ruleEString ) ) otherlv_32= '.' ( (lv_traceAttributeName_33_0= ruleEString ) ) otherlv_34= ']' )? ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1842:3: otherlv_0= 'invoke-external' ( (lv_transformationName_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )? otherlv_6= ')' otherlv_7= '->' otherlv_8= '(' ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )? otherlv_12= ')' (otherlv_13= '+' otherlv_14= '(' ( (lv_parameters_15_0= ruleNamedInvocationParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleNamedInvocationParameter ) ) )* otherlv_18= ')' )? ( (otherlv_19= 'entrypoint' ( (lv_entryPointName_20_0= RULE_ID ) ) otherlv_21= '(' ( (lv_entryPointParameters_22_0= ruleExpression ) )? (otherlv_23= ',' ( (lv_entryPointParameters_24_0= ruleExpression ) ) )* otherlv_25= ')' )? | (otherlv_26= 'input-view-filter' ( (otherlv_27= RULE_ID ) ) (otherlv_28= 'output-element' ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) ) otherlv_30= '[' ( (lv_queueName_31_0= ruleEString ) ) otherlv_32= '.' ( (lv_traceAttributeName_33_0= ruleEString ) ) otherlv_34= ']' )? ) )
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleInvokeExternal3978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInvokeExternalAccess().getInvokeExternalKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1846:1: ( (lv_transformationName_1_0= ruleQualifiedName ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1847:1: (lv_transformationName_1_0= ruleQualifiedName )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1847:1: (lv_transformationName_1_0= ruleQualifiedName )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1848:3: lv_transformationName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getTransformationNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleInvokeExternal3999);
            lv_transformationName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
              	        }
                     		set(
                     			current, 
                     			"transformationName",
                      		lv_transformationName_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvokeExternal4011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInvokeExternalAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1868:1: ( ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1868:2: ( (lv_sourceModels_3_0= ruleInvocationParameter ) ) (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )*
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1868:2: ( (lv_sourceModels_3_0= ruleInvocationParameter ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1869:1: (lv_sourceModels_3_0= ruleInvocationParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1869:1: (lv_sourceModels_3_0= ruleInvocationParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1870:3: lv_sourceModels_3_0= ruleInvocationParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getSourceModelsInvocationParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvocationParameter_in_ruleInvokeExternal4033);
                    lv_sourceModels_3_0=ruleInvocationParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
                      	        }
                             		add(
                             			current, 
                             			"sourceModels",
                              		lv_sourceModels_3_0, 
                              		"InvocationParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1886:2: (otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1886:4: otherlv_4= ',' ( (lv_sourceModels_5_0= ruleInvocationParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInvokeExternal4046); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getInvokeExternalAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1890:1: ( (lv_sourceModels_5_0= ruleInvocationParameter ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1891:1: (lv_sourceModels_5_0= ruleInvocationParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1891:1: (lv_sourceModels_5_0= ruleInvocationParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1892:3: lv_sourceModels_5_0= ruleInvocationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getSourceModelsInvocationParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvocationParameter_in_ruleInvokeExternal4067);
                    	    lv_sourceModels_5_0=ruleInvocationParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"sourceModels",
                    	              		lv_sourceModels_5_0, 
                    	              		"InvocationParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInvokeExternal4083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getInvokeExternalAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInvokeExternal4095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInvokeExternalAccess().getHyphenMinusGreaterThanSignKeyword_5());
                  
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvokeExternal4107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getInvokeExternalAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1920:1: ( ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1920:2: ( (lv_targetModels_9_0= ruleInvocationParameter ) ) (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )*
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1920:2: ( (lv_targetModels_9_0= ruleInvocationParameter ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1921:1: (lv_targetModels_9_0= ruleInvocationParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1921:1: (lv_targetModels_9_0= ruleInvocationParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1922:3: lv_targetModels_9_0= ruleInvocationParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getTargetModelsInvocationParameterParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvocationParameter_in_ruleInvokeExternal4129);
                    lv_targetModels_9_0=ruleInvocationParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
                      	        }
                             		add(
                             			current, 
                             			"targetModels",
                              		lv_targetModels_9_0, 
                              		"InvocationParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1938:2: (otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1938:4: otherlv_10= ',' ( (lv_targetModels_11_0= ruleInvocationParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInvokeExternal4142); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getInvokeExternalAccess().getCommaKeyword_7_1_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1942:1: ( (lv_targetModels_11_0= ruleInvocationParameter ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1943:1: (lv_targetModels_11_0= ruleInvocationParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1943:1: (lv_targetModels_11_0= ruleInvocationParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1944:3: lv_targetModels_11_0= ruleInvocationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getTargetModelsInvocationParameterParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvocationParameter_in_ruleInvokeExternal4163);
                    	    lv_targetModels_11_0=ruleInvocationParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"targetModels",
                    	              		lv_targetModels_11_0, 
                    	              		"InvocationParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInvokeExternal4179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getInvokeExternalAccess().getRightParenthesisKeyword_8());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1964:1: (otherlv_13= '+' otherlv_14= '(' ( (lv_parameters_15_0= ruleNamedInvocationParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleNamedInvocationParameter ) ) )* otherlv_18= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==13) ) {
                    int LA38_3 = input.LA(3);

                    if ( (LA38_3==RULE_STRING) ) {
                        int LA38_4 = input.LA(4);

                        if ( (LA38_4==34) ) {
                            alt38=1;
                        }
                    }
                    else if ( (LA38_3==RULE_ID) ) {
                        int LA38_5 = input.LA(4);

                        if ( (LA38_5==34) ) {
                            alt38=1;
                        }
                    }
                }
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1964:3: otherlv_13= '+' otherlv_14= '(' ( (lv_parameters_15_0= ruleNamedInvocationParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleNamedInvocationParameter ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleInvokeExternal4192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getInvokeExternalAccess().getPlusSignKeyword_9_0());
                          
                    }
                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvokeExternal4204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getInvokeExternalAccess().getLeftParenthesisKeyword_9_1());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1972:1: ( (lv_parameters_15_0= ruleNamedInvocationParameter ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1973:1: (lv_parameters_15_0= ruleNamedInvocationParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1973:1: (lv_parameters_15_0= ruleNamedInvocationParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1974:3: lv_parameters_15_0= ruleNamedInvocationParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getParametersNamedInvocationParameterParserRuleCall_9_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNamedInvocationParameter_in_ruleInvokeExternal4225);
                    lv_parameters_15_0=ruleNamedInvocationParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_15_0, 
                              		"NamedInvocationParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1990:2: (otherlv_16= ',' ( (lv_parameters_17_0= ruleNamedInvocationParameter ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1990:4: otherlv_16= ',' ( (lv_parameters_17_0= ruleNamedInvocationParameter ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInvokeExternal4238); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_16, grammarAccess.getInvokeExternalAccess().getCommaKeyword_9_3_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1994:1: ( (lv_parameters_17_0= ruleNamedInvocationParameter ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1995:1: (lv_parameters_17_0= ruleNamedInvocationParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1995:1: (lv_parameters_17_0= ruleNamedInvocationParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:1996:3: lv_parameters_17_0= ruleNamedInvocationParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getParametersNamedInvocationParameterParserRuleCall_9_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleNamedInvocationParameter_in_ruleInvokeExternal4259);
                    	    lv_parameters_17_0=ruleNamedInvocationParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_17_0, 
                    	              		"NamedInvocationParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInvokeExternal4273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getInvokeExternalAccess().getRightParenthesisKeyword_9_4());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2016:3: ( (otherlv_19= 'entrypoint' ( (lv_entryPointName_20_0= RULE_ID ) ) otherlv_21= '(' ( (lv_entryPointParameters_22_0= ruleExpression ) )? (otherlv_23= ',' ( (lv_entryPointParameters_24_0= ruleExpression ) ) )* otherlv_25= ')' )? | (otherlv_26= 'input-view-filter' ( (otherlv_27= RULE_ID ) ) (otherlv_28= 'output-element' ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) ) otherlv_30= '[' ( (lv_queueName_31_0= ruleEString ) ) otherlv_32= '.' ( (lv_traceAttributeName_33_0= ruleEString ) ) otherlv_34= ']' )? ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==EOF||(LA43_0>=RULE_ID && LA43_0<=RULE_INT)||(LA43_0>=13 && LA43_0<=16)||LA43_0==20||LA43_0==22||LA43_0==24||LA43_0==26||LA43_0==35||(LA43_0>=37 && LA43_0<=39)||(LA43_0>=41 && LA43_0<=44)||(LA43_0>=47 && LA43_0<=48)||LA43_0==51||(LA43_0>=58 && LA43_0<=63)) ) {
                alt43=1;
            }
            else if ( (LA43_0==36) ) {
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2016:4: (otherlv_19= 'entrypoint' ( (lv_entryPointName_20_0= RULE_ID ) ) otherlv_21= '(' ( (lv_entryPointParameters_22_0= ruleExpression ) )? (otherlv_23= ',' ( (lv_entryPointParameters_24_0= ruleExpression ) ) )* otherlv_25= ')' )?
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2016:4: (otherlv_19= 'entrypoint' ( (lv_entryPointName_20_0= RULE_ID ) ) otherlv_21= '(' ( (lv_entryPointParameters_22_0= ruleExpression ) )? (otherlv_23= ',' ( (lv_entryPointParameters_24_0= ruleExpression ) ) )* otherlv_25= ')' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==37) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2016:6: otherlv_19= 'entrypoint' ( (lv_entryPointName_20_0= RULE_ID ) ) otherlv_21= '(' ( (lv_entryPointParameters_22_0= ruleExpression ) )? (otherlv_23= ',' ( (lv_entryPointParameters_24_0= ruleExpression ) ) )* otherlv_25= ')'
                            {
                            otherlv_19=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleInvokeExternal4289); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_19, grammarAccess.getInvokeExternalAccess().getEntrypointKeyword_10_0_0());
                                  
                            }
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2020:1: ( (lv_entryPointName_20_0= RULE_ID ) )
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2021:1: (lv_entryPointName_20_0= RULE_ID )
                            {
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2021:1: (lv_entryPointName_20_0= RULE_ID )
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2022:3: lv_entryPointName_20_0= RULE_ID
                            {
                            lv_entryPointName_20_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInvokeExternal4306); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_entryPointName_20_0, grammarAccess.getInvokeExternalAccess().getEntryPointNameIDTerminalRuleCall_10_0_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInvokeExternalRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"entryPointName",
                                      		lv_entryPointName_20_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }

                            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvokeExternal4323); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_21, grammarAccess.getInvokeExternalAccess().getLeftParenthesisKeyword_10_0_2());
                                  
                            }
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2042:1: ( (lv_entryPointParameters_22_0= ruleExpression ) )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_INT)||LA39_0==13||LA39_0==22||LA39_0==35||LA39_0==38||LA39_0==51||LA39_0==58||(LA39_0>=60 && LA39_0<=62)) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2043:1: (lv_entryPointParameters_22_0= ruleExpression )
                                    {
                                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2043:1: (lv_entryPointParameters_22_0= ruleExpression )
                                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2044:3: lv_entryPointParameters_22_0= ruleExpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getEntryPointParametersExpressionParserRuleCall_10_0_3_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleInvokeExternal4344);
                                    lv_entryPointParameters_22_0=ruleExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"entryPointParameters",
                                              		lv_entryPointParameters_22_0, 
                                              		"Expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2060:3: (otherlv_23= ',' ( (lv_entryPointParameters_24_0= ruleExpression ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==14) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2060:5: otherlv_23= ',' ( (lv_entryPointParameters_24_0= ruleExpression ) )
                            	    {
                            	    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInvokeExternal4358); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_23, grammarAccess.getInvokeExternalAccess().getCommaKeyword_10_0_4_0());
                            	          
                            	    }
                            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2064:1: ( (lv_entryPointParameters_24_0= ruleExpression ) )
                            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2065:1: (lv_entryPointParameters_24_0= ruleExpression )
                            	    {
                            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2065:1: (lv_entryPointParameters_24_0= ruleExpression )
                            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2066:3: lv_entryPointParameters_24_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getEntryPointParametersExpressionParserRuleCall_10_0_4_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleInvokeExternal4379);
                            	    lv_entryPointParameters_24_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"entryPointParameters",
                            	              		lv_entryPointParameters_24_0, 
                            	              		"Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);

                            otherlv_25=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInvokeExternal4393); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_25, grammarAccess.getInvokeExternalAccess().getRightParenthesisKeyword_10_0_5());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2087:6: (otherlv_26= 'input-view-filter' ( (otherlv_27= RULE_ID ) ) (otherlv_28= 'output-element' ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) ) otherlv_30= '[' ( (lv_queueName_31_0= ruleEString ) ) otherlv_32= '.' ( (lv_traceAttributeName_33_0= ruleEString ) ) otherlv_34= ']' )? )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2087:6: (otherlv_26= 'input-view-filter' ( (otherlv_27= RULE_ID ) ) (otherlv_28= 'output-element' ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) ) otherlv_30= '[' ( (lv_queueName_31_0= ruleEString ) ) otherlv_32= '.' ( (lv_traceAttributeName_33_0= ruleEString ) ) otherlv_34= ']' )? )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2087:8: otherlv_26= 'input-view-filter' ( (otherlv_27= RULE_ID ) ) (otherlv_28= 'output-element' ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) ) otherlv_30= '[' ( (lv_queueName_31_0= ruleEString ) ) otherlv_32= '.' ( (lv_traceAttributeName_33_0= ruleEString ) ) otherlv_34= ']' )?
                    {
                    otherlv_26=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleInvokeExternal4414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getInvokeExternalAccess().getInputViewFilterKeyword_10_1_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2091:1: ( (otherlv_27= RULE_ID ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2092:1: (otherlv_27= RULE_ID )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2092:1: (otherlv_27= RULE_ID )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2093:3: otherlv_27= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInvokeExternalRule());
                      	        }
                              
                    }
                    otherlv_27=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInvokeExternal4434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_27, grammarAccess.getInvokeExternalAccess().getInputViewFilterDefineVariableCrossReference_10_1_1_0()); 
                      	
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2104:2: (otherlv_28= 'output-element' ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) ) otherlv_30= '[' ( (lv_queueName_31_0= ruleEString ) ) otherlv_32= '.' ( (lv_traceAttributeName_33_0= ruleEString ) ) otherlv_34= ']' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==40) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2104:4: otherlv_28= 'output-element' ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) ) otherlv_30= '[' ( (lv_queueName_31_0= ruleEString ) ) otherlv_32= '.' ( (lv_traceAttributeName_33_0= ruleEString ) ) otherlv_34= ']'
                            {
                            otherlv_28=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleInvokeExternal4447); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_28, grammarAccess.getInvokeExternalAccess().getOutputElementKeyword_10_1_2_0());
                                  
                            }
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2108:1: ( (lv_outputResolutionSourceElement_29_0= ruleExpression ) )
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2109:1: (lv_outputResolutionSourceElement_29_0= ruleExpression )
                            {
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2109:1: (lv_outputResolutionSourceElement_29_0= ruleExpression )
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2110:3: lv_outputResolutionSourceElement_29_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getOutputResolutionSourceElementExpressionParserRuleCall_10_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleInvokeExternal4468);
                            lv_outputResolutionSourceElement_29_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"outputResolutionSourceElement",
                                      		lv_outputResolutionSourceElement_29_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_30=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleInvokeExternal4480); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getInvokeExternalAccess().getLeftSquareBracketKeyword_10_1_2_2());
                                  
                            }
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2130:1: ( (lv_queueName_31_0= ruleEString ) )
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2131:1: (lv_queueName_31_0= ruleEString )
                            {
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2131:1: (lv_queueName_31_0= ruleEString )
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2132:3: lv_queueName_31_0= ruleEString
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getQueueNameEStringParserRuleCall_10_1_2_3_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvokeExternal4501);
                            lv_queueName_31_0=ruleEString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"queueName",
                                      		lv_queueName_31_0, 
                                      		"EString");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_32=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleInvokeExternal4513); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_32, grammarAccess.getInvokeExternalAccess().getFullStopKeyword_10_1_2_4());
                                  
                            }
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2152:1: ( (lv_traceAttributeName_33_0= ruleEString ) )
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2153:1: (lv_traceAttributeName_33_0= ruleEString )
                            {
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2153:1: (lv_traceAttributeName_33_0= ruleEString )
                            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2154:3: lv_traceAttributeName_33_0= ruleEString
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInvokeExternalAccess().getTraceAttributeNameEStringParserRuleCall_10_1_2_5_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvokeExternal4534);
                            lv_traceAttributeName_33_0=ruleEString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInvokeExternalRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"traceAttributeName",
                                      		lv_traceAttributeName_33_0, 
                                      		"EString");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_34=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleInvokeExternal4546); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_34, grammarAccess.getInvokeExternalAccess().getRightSquareBracketKeyword_10_1_2_6());
                                  
                            }

                            }
                            break;

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
    // $ANTLR end "ruleInvokeExternal"


    // $ANTLR start "entryRuleInvocationParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2182:1: entryRuleInvocationParameter returns [EObject current=null] : iv_ruleInvocationParameter= ruleInvocationParameter EOF ;
    public final EObject entryRuleInvocationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2183:2: (iv_ruleInvocationParameter= ruleInvocationParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2184:2: iv_ruleInvocationParameter= ruleInvocationParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvocationParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvocationParameter_in_entryRuleInvocationParameter4586);
            iv_ruleInvocationParameter=ruleInvocationParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvocationParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvocationParameter4596); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvocationParameter"


    // $ANTLR start "ruleInvocationParameter"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2191:1: ruleInvocationParameter returns [EObject current=null] : ( ( (lv_calleeModelName_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleInvocationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_calleeModelName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2194:28: ( ( ( (lv_calleeModelName_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2195:1: ( ( (lv_calleeModelName_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2195:1: ( ( (lv_calleeModelName_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2195:2: ( (lv_calleeModelName_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2195:2: ( (lv_calleeModelName_0_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2196:1: (lv_calleeModelName_0_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2196:1: (lv_calleeModelName_0_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2197:3: lv_calleeModelName_0_0= RULE_ID
            {
            lv_calleeModelName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInvocationParameter4638); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_calleeModelName_0_0, grammarAccess.getInvocationParameterAccess().getCalleeModelNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInvocationParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"calleeModelName",
                      		lv_calleeModelName_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInvocationParameter4655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInvocationParameterAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2217:1: ( (otherlv_2= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2218:1: (otherlv_2= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2218:1: (otherlv_2= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2219:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInvocationParameterRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInvocationParameter4675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getInvocationParameterAccess().getModelTransformationDefinitionParameterCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleInvocationParameter"


    // $ANTLR start "entryRuleForAllStatement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2238:1: entryRuleForAllStatement returns [EObject current=null] : iv_ruleForAllStatement= ruleForAllStatement EOF ;
    public final EObject entryRuleForAllStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForAllStatement = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2239:2: (iv_ruleForAllStatement= ruleForAllStatement EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2240:2: iv_ruleForAllStatement= ruleForAllStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForAllStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForAllStatement_in_entryRuleForAllStatement4711);
            iv_ruleForAllStatement=ruleForAllStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForAllStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForAllStatement4721); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForAllStatement"


    // $ANTLR start "ruleForAllStatement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2247:1: ruleForAllStatement returns [EObject current=null] : (otherlv_0= 'forall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'where' ( (lv_condition_5_0= ruleExpression ) ) )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= 'end' ) ;
    public final EObject ruleForAllStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_condition_5_0 = null;

        EObject lv_statements_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2250:28: ( (otherlv_0= 'forall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'where' ( (lv_condition_5_0= ruleExpression ) ) )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= 'end' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2251:1: (otherlv_0= 'forall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'where' ( (lv_condition_5_0= ruleExpression ) ) )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= 'end' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2251:1: (otherlv_0= 'forall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'where' ( (lv_condition_5_0= ruleExpression ) ) )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= 'end' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2251:3: otherlv_0= 'forall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'where' ( (lv_condition_5_0= ruleExpression ) ) )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleForAllStatement4758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAllStatementAccess().getForallKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2255:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2256:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2256:1: (lv_name_1_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2257:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleForAllStatement4775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getForAllStatementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getForAllStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleForAllStatement4792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForAllStatementAccess().getFromKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2277:1: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2278:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2278:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2279:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getForAllStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleForAllStatement4812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getForAllStatementAccess().getQueueQoolQueueCrossReference_3_0()); 
              	
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2290:2: (otherlv_4= 'where' ( (lv_condition_5_0= ruleExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2290:4: otherlv_4= 'where' ( (lv_condition_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleForAllStatement4825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getForAllStatementAccess().getWhereKeyword_4_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2294:1: ( (lv_condition_5_0= ruleExpression ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2295:1: (lv_condition_5_0= ruleExpression )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2295:1: (lv_condition_5_0= ruleExpression )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2296:3: lv_condition_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForAllStatementAccess().getConditionExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForAllStatement4846);
                    lv_condition_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForAllStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2312:4: ( (lv_statements_6_0= ruleStatement ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_INT)||LA45_0==13||LA45_0==22||LA45_0==35||LA45_0==38||LA45_0==44||LA45_0==47||LA45_0==51||(LA45_0>=58 && LA45_0<=62)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2313:1: (lv_statements_6_0= ruleStatement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2313:1: (lv_statements_6_0= ruleStatement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2314:3: lv_statements_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getForAllStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleForAllStatement4869);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getForAllStatementRule());
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
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleForAllStatement4882); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForAllStatementAccess().getEndKeyword_6());
                  
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
    // $ANTLR end "ruleForAllStatement"


    // $ANTLR start "entryRuleEmitStatement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2342:1: entryRuleEmitStatement returns [EObject current=null] : iv_ruleEmitStatement= ruleEmitStatement EOF ;
    public final EObject entryRuleEmitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmitStatement = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2343:2: (iv_ruleEmitStatement= ruleEmitStatement EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2344:2: iv_ruleEmitStatement= ruleEmitStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmitStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmitStatement_in_entryRuleEmitStatement4918);
            iv_ruleEmitStatement=ruleEmitStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmitStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmitStatement4928); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEmitStatement"


    // $ANTLR start "ruleEmitStatement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2351:1: ruleEmitStatement returns [EObject current=null] : (otherlv_0= 'emit' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleEmitStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2354:28: ( (otherlv_0= 'emit' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2355:1: (otherlv_0= 'emit' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2355:1: (otherlv_0= 'emit' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2355:3: otherlv_0= 'emit' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEmitStatement4965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEmitStatementAccess().getEmitKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2359:1: ( (lv_value_1_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2360:1: (lv_value_1_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2360:1: (lv_value_1_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2361:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmitStatementAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEmitStatement4986);
            lv_value_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEmitStatementRule());
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

            otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEmitStatement4998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEmitStatementAccess().getToKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2381:1: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2382:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2382:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2383:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmitStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmitStatement5018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getEmitStatementAccess().getQueueQoolQueueCrossReference_3_0()); 
              	
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
    // $ANTLR end "ruleEmitStatement"


    // $ANTLR start "entryRuleMatchExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2402:1: entryRuleMatchExpression returns [EObject current=null] : iv_ruleMatchExpression= ruleMatchExpression EOF ;
    public final EObject entryRuleMatchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2403:2: (iv_ruleMatchExpression= ruleMatchExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2404:2: iv_ruleMatchExpression= ruleMatchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatchExpression_in_entryRuleMatchExpression5054);
            iv_ruleMatchExpression=ruleMatchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatchExpression5064); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMatchExpression"


    // $ANTLR start "ruleMatchExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2411:1: ruleMatchExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_predicates_2_0= rulePredicate ) ) (otherlv_3= ',' ( (lv_predicates_4_0= rulePredicate ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleMatchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_predicates_2_0 = null;

        EObject lv_predicates_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2414:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_predicates_2_0= rulePredicate ) ) (otherlv_3= ',' ( (lv_predicates_4_0= rulePredicate ) ) )* otherlv_5= ']' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2415:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_predicates_2_0= rulePredicate ) ) (otherlv_3= ',' ( (lv_predicates_4_0= rulePredicate ) ) )* otherlv_5= ']' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2415:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_predicates_2_0= rulePredicate ) ) (otherlv_3= ',' ( (lv_predicates_4_0= rulePredicate ) ) )* otherlv_5= ']' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2415:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_predicates_2_0= rulePredicate ) ) (otherlv_3= ',' ( (lv_predicates_4_0= rulePredicate ) ) )* otherlv_5= ']'
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2415:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2416:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2416:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2417:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMatchExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchExpression5109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getMatchExpressionAccess().getQueueQoolQueueCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMatchExpression5121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMatchExpressionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2432:1: ( (lv_predicates_2_0= rulePredicate ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2433:1: (lv_predicates_2_0= rulePredicate )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2433:1: (lv_predicates_2_0= rulePredicate )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2434:3: lv_predicates_2_0= rulePredicate
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMatchExpressionAccess().getPredicatesPredicateParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_ruleMatchExpression5142);
            lv_predicates_2_0=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMatchExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"predicates",
                      		lv_predicates_2_0, 
                      		"Predicate");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2450:2: (otherlv_3= ',' ( (lv_predicates_4_0= rulePredicate ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==14) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2450:4: otherlv_3= ',' ( (lv_predicates_4_0= rulePredicate ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMatchExpression5155); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMatchExpressionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2454:1: ( (lv_predicates_4_0= rulePredicate ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2455:1: (lv_predicates_4_0= rulePredicate )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2455:1: (lv_predicates_4_0= rulePredicate )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2456:3: lv_predicates_4_0= rulePredicate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMatchExpressionAccess().getPredicatesPredicateParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePredicate_in_ruleMatchExpression5176);
            	    lv_predicates_4_0=rulePredicate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMatchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"predicates",
            	              		lv_predicates_4_0, 
            	              		"Predicate");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_5=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMatchExpression5190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMatchExpressionAccess().getRightSquareBracketKeyword_4());
                  
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
    // $ANTLR end "ruleMatchExpression"


    // $ANTLR start "entryRulePredicate"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2484:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2485:2: (iv_rulePredicate= rulePredicate EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2486:2: iv_rulePredicate= rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_entryRulePredicate5226);
            iv_rulePredicate=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicate; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicate5236); if (state.failed) return current;

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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2493:1: rulePredicate returns [EObject current=null] : (this_KindOfPredicate_0= ruleKindOfPredicate | this_PropertyEqualsPredicate_1= rulePropertyEqualsPredicate ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_KindOfPredicate_0 = null;

        EObject this_PropertyEqualsPredicate_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2496:28: ( (this_KindOfPredicate_0= ruleKindOfPredicate | this_PropertyEqualsPredicate_1= rulePropertyEqualsPredicate ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2497:1: (this_KindOfPredicate_0= ruleKindOfPredicate | this_PropertyEqualsPredicate_1= rulePropertyEqualsPredicate )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2497:1: (this_KindOfPredicate_0= ruleKindOfPredicate | this_PropertyEqualsPredicate_1= rulePropertyEqualsPredicate )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            else if ( (LA47_0==50) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2498:5: this_KindOfPredicate_0= ruleKindOfPredicate
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredicateAccess().getKindOfPredicateParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKindOfPredicate_in_rulePredicate5283);
                    this_KindOfPredicate_0=ruleKindOfPredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KindOfPredicate_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2508:5: this_PropertyEqualsPredicate_1= rulePropertyEqualsPredicate
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredicateAccess().getPropertyEqualsPredicateParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyEqualsPredicate_in_rulePredicate5310);
                    this_PropertyEqualsPredicate_1=rulePropertyEqualsPredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyEqualsPredicate_1; 
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleKindOfPredicate"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2524:1: entryRuleKindOfPredicate returns [EObject current=null] : iv_ruleKindOfPredicate= ruleKindOfPredicate EOF ;
    public final EObject entryRuleKindOfPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKindOfPredicate = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2525:2: (iv_ruleKindOfPredicate= ruleKindOfPredicate EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2526:2: iv_ruleKindOfPredicate= ruleKindOfPredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKindOfPredicateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKindOfPredicate_in_entryRuleKindOfPredicate5345);
            iv_ruleKindOfPredicate=ruleKindOfPredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKindOfPredicate; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKindOfPredicate5355); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKindOfPredicate"


    // $ANTLR start "ruleKindOfPredicate"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2533:1: ruleKindOfPredicate returns [EObject current=null] : (otherlv_0= '#kindOf' otherlv_1= '(' ( (lv_class__2_0= ruleClassUse ) ) otherlv_3= ')' ) ;
    public final EObject ruleKindOfPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_class__2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2536:28: ( (otherlv_0= '#kindOf' otherlv_1= '(' ( (lv_class__2_0= ruleClassUse ) ) otherlv_3= ')' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2537:1: (otherlv_0= '#kindOf' otherlv_1= '(' ( (lv_class__2_0= ruleClassUse ) ) otherlv_3= ')' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2537:1: (otherlv_0= '#kindOf' otherlv_1= '(' ( (lv_class__2_0= ruleClassUse ) ) otherlv_3= ')' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2537:3: otherlv_0= '#kindOf' otherlv_1= '(' ( (lv_class__2_0= ruleClassUse ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleKindOfPredicate5392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKindOfPredicateAccess().getKindOfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleKindOfPredicate5404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getKindOfPredicateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2545:1: ( (lv_class__2_0= ruleClassUse ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2546:1: (lv_class__2_0= ruleClassUse )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2546:1: (lv_class__2_0= ruleClassUse )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2547:3: lv_class__2_0= ruleClassUse
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKindOfPredicateAccess().getClass_ClassUseParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleKindOfPredicate5425);
            lv_class__2_0=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKindOfPredicateRule());
              	        }
                     		set(
                     			current, 
                     			"class_",
                      		lv_class__2_0, 
                      		"ClassUse");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKindOfPredicate5437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getKindOfPredicateAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleKindOfPredicate"


    // $ANTLR start "entryRulePropertyEqualsPredicate"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2575:1: entryRulePropertyEqualsPredicate returns [EObject current=null] : iv_rulePropertyEqualsPredicate= rulePropertyEqualsPredicate EOF ;
    public final EObject entryRulePropertyEqualsPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyEqualsPredicate = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2576:2: (iv_rulePropertyEqualsPredicate= rulePropertyEqualsPredicate EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2577:2: iv_rulePropertyEqualsPredicate= rulePropertyEqualsPredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyEqualsPredicateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyEqualsPredicate_in_entryRulePropertyEqualsPredicate5473);
            iv_rulePropertyEqualsPredicate=rulePropertyEqualsPredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyEqualsPredicate; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyEqualsPredicate5483); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyEqualsPredicate"


    // $ANTLR start "rulePropertyEqualsPredicate"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2584:1: rulePropertyEqualsPredicate returns [EObject current=null] : (otherlv_0= '#p' otherlv_1= '(' ( (lv_propertyName_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject rulePropertyEqualsPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_propertyName_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2587:28: ( (otherlv_0= '#p' otherlv_1= '(' ( (lv_propertyName_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2588:1: (otherlv_0= '#p' otherlv_1= '(' ( (lv_propertyName_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2588:1: (otherlv_0= '#p' otherlv_1= '(' ( (lv_propertyName_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ')' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2588:3: otherlv_0= '#p' otherlv_1= '(' ( (lv_propertyName_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulePropertyEqualsPredicate5520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyEqualsPredicateAccess().getPKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePropertyEqualsPredicate5532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyEqualsPredicateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2596:1: ( (lv_propertyName_2_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2597:1: (lv_propertyName_2_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2597:1: (lv_propertyName_2_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2598:3: lv_propertyName_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyEqualsPredicateAccess().getPropertyNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePropertyEqualsPredicate5553);
            lv_propertyName_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyEqualsPredicateRule());
              	        }
                     		set(
                     			current, 
                     			"propertyName",
                      		lv_propertyName_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePropertyEqualsPredicate5565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropertyEqualsPredicateAccess().getCommaKeyword_3());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2618:1: ( (lv_value_4_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2619:1: (lv_value_4_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2619:1: (lv_value_4_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2620:3: lv_value_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyEqualsPredicateAccess().getValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePropertyEqualsPredicate5586);
            lv_value_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyEqualsPredicateRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePropertyEqualsPredicate5598); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPropertyEqualsPredicateAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "rulePropertyEqualsPredicate"


    // $ANTLR start "entryRuleCopier"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2648:1: entryRuleCopier returns [EObject current=null] : iv_ruleCopier= ruleCopier EOF ;
    public final EObject entryRuleCopier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopier = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2649:2: (iv_ruleCopier= ruleCopier EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2650:2: iv_ruleCopier= ruleCopier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCopierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCopier_in_entryRuleCopier5634);
            iv_ruleCopier=ruleCopier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCopier; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopier5644); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCopier"


    // $ANTLR start "ruleCopier"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2657:1: ruleCopier returns [EObject current=null] : (otherlv_0= 'copy' otherlv_1= '(' ( (lv_objects_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'model' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '{' ( (lv_callbacks_9_0= ruleCopierCallbackDefinition ) ) (otherlv_10= ',' ( (lv_callbacks_11_0= ruleCopierCallbackDefinition ) ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleCopier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_objects_2_0 = null;

        EObject lv_objects_4_0 = null;

        EObject lv_callbacks_9_0 = null;

        EObject lv_callbacks_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2660:28: ( (otherlv_0= 'copy' otherlv_1= '(' ( (lv_objects_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'model' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '{' ( (lv_callbacks_9_0= ruleCopierCallbackDefinition ) ) (otherlv_10= ',' ( (lv_callbacks_11_0= ruleCopierCallbackDefinition ) ) )* otherlv_12= '}' )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2661:1: (otherlv_0= 'copy' otherlv_1= '(' ( (lv_objects_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'model' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '{' ( (lv_callbacks_9_0= ruleCopierCallbackDefinition ) ) (otherlv_10= ',' ( (lv_callbacks_11_0= ruleCopierCallbackDefinition ) ) )* otherlv_12= '}' )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2661:1: (otherlv_0= 'copy' otherlv_1= '(' ( (lv_objects_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'model' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '{' ( (lv_callbacks_9_0= ruleCopierCallbackDefinition ) ) (otherlv_10= ',' ( (lv_callbacks_11_0= ruleCopierCallbackDefinition ) ) )* otherlv_12= '}' )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2661:3: otherlv_0= 'copy' otherlv_1= '(' ( (lv_objects_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleExpression ) ) )* otherlv_5= ')' otherlv_6= 'model' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '{' ( (lv_callbacks_9_0= ruleCopierCallbackDefinition ) ) (otherlv_10= ',' ( (lv_callbacks_11_0= ruleCopierCallbackDefinition ) ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleCopier5681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCopierAccess().getCopyKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCopier5693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCopierAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2669:1: ( (lv_objects_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2670:1: (lv_objects_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2670:1: (lv_objects_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2671:3: lv_objects_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCopierAccess().getObjectsExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleCopier5714);
            lv_objects_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCopierRule());
              	        }
                     		add(
                     			current, 
                     			"objects",
                      		lv_objects_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2687:2: (otherlv_3= ',' ( (lv_objects_4_0= ruleExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==14) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2687:4: otherlv_3= ',' ( (lv_objects_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCopier5727); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getCopierAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2691:1: ( (lv_objects_4_0= ruleExpression ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2692:1: (lv_objects_4_0= ruleExpression )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2692:1: (lv_objects_4_0= ruleExpression )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2693:3: lv_objects_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCopierAccess().getObjectsExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleCopier5748);
            	    lv_objects_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCopierRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"objects",
            	              		lv_objects_4_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCopier5762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCopierAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCopier5774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCopierAccess().getModelKeyword_5());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2717:1: ( (otherlv_7= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2718:1: (otherlv_7= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2718:1: (otherlv_7= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2719:3: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCopierRule());
              	        }
                      
            }
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCopier5794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_7, grammarAccess.getCopierAccess().getCopyInModelTransformationDefinitionParameterCrossReference_6_0()); 
              	
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2730:2: (otherlv_8= '{' ( (lv_callbacks_9_0= ruleCopierCallbackDefinition ) ) (otherlv_10= ',' ( (lv_callbacks_11_0= ruleCopierCallbackDefinition ) ) )* otherlv_12= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==22) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==30||LA50_1==52) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2730:4: otherlv_8= '{' ( (lv_callbacks_9_0= ruleCopierCallbackDefinition ) ) (otherlv_10= ',' ( (lv_callbacks_11_0= ruleCopierCallbackDefinition ) ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCopier5807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCopierAccess().getLeftCurlyBracketKeyword_7_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2734:1: ( (lv_callbacks_9_0= ruleCopierCallbackDefinition ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2735:1: (lv_callbacks_9_0= ruleCopierCallbackDefinition )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2735:1: (lv_callbacks_9_0= ruleCopierCallbackDefinition )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2736:3: lv_callbacks_9_0= ruleCopierCallbackDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCopierAccess().getCallbacksCopierCallbackDefinitionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCopierCallbackDefinition_in_ruleCopier5828);
                    lv_callbacks_9_0=ruleCopierCallbackDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCopierRule());
                      	        }
                             		add(
                             			current, 
                             			"callbacks",
                              		lv_callbacks_9_0, 
                              		"CopierCallbackDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2752:2: (otherlv_10= ',' ( (lv_callbacks_11_0= ruleCopierCallbackDefinition ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2752:4: otherlv_10= ',' ( (lv_callbacks_11_0= ruleCopierCallbackDefinition ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCopier5841); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getCopierAccess().getCommaKeyword_7_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2756:1: ( (lv_callbacks_11_0= ruleCopierCallbackDefinition ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2757:1: (lv_callbacks_11_0= ruleCopierCallbackDefinition )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2757:1: (lv_callbacks_11_0= ruleCopierCallbackDefinition )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2758:3: lv_callbacks_11_0= ruleCopierCallbackDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCopierAccess().getCallbacksCopierCallbackDefinitionParserRuleCall_7_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCopierCallbackDefinition_in_ruleCopier5862);
                    	    lv_callbacks_11_0=ruleCopierCallbackDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCopierRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"callbacks",
                    	              		lv_callbacks_11_0, 
                    	              		"CopierCallbackDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCopier5876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCopierAccess().getRightCurlyBracketKeyword_7_3());
                          
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
    // $ANTLR end "ruleCopier"


    // $ANTLR start "entryRuleCopierCallbackDefinition"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2786:1: entryRuleCopierCallbackDefinition returns [EObject current=null] : iv_ruleCopierCallbackDefinition= ruleCopierCallbackDefinition EOF ;
    public final EObject entryRuleCopierCallbackDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopierCallbackDefinition = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2787:2: (iv_ruleCopierCallbackDefinition= ruleCopierCallbackDefinition EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2788:2: iv_ruleCopierCallbackDefinition= ruleCopierCallbackDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCopierCallbackDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCopierCallbackDefinition_in_entryRuleCopierCallbackDefinition5914);
            iv_ruleCopierCallbackDefinition=ruleCopierCallbackDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCopierCallbackDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopierCallbackDefinition5924); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCopierCallbackDefinition"


    // $ANTLR start "ruleCopierCallbackDefinition"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2795:1: ruleCopierCallbackDefinition returns [EObject current=null] : ( (otherlv_0= 'with' | ( (lv_stop_1_0= 'stop' ) ) ) ( (lv_trigger_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_action_4_0= ruleExpression ) ) ) ;
    public final EObject ruleCopierCallbackDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stop_1_0=null;
        Token otherlv_3=null;
        EObject lv_trigger_2_0 = null;

        EObject lv_action_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2798:28: ( ( (otherlv_0= 'with' | ( (lv_stop_1_0= 'stop' ) ) ) ( (lv_trigger_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_action_4_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2799:1: ( (otherlv_0= 'with' | ( (lv_stop_1_0= 'stop' ) ) ) ( (lv_trigger_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_action_4_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2799:1: ( (otherlv_0= 'with' | ( (lv_stop_1_0= 'stop' ) ) ) ( (lv_trigger_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_action_4_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2799:2: (otherlv_0= 'with' | ( (lv_stop_1_0= 'stop' ) ) ) ( (lv_trigger_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_action_4_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2799:2: (otherlv_0= 'with' | ( (lv_stop_1_0= 'stop' ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==30) ) {
                alt51=1;
            }
            else if ( (LA51_0==52) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2799:4: otherlv_0= 'with'
                    {
                    otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCopierCallbackDefinition5962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCopierCallbackDefinitionAccess().getWithKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2804:6: ( (lv_stop_1_0= 'stop' ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2804:6: ( (lv_stop_1_0= 'stop' ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2805:1: (lv_stop_1_0= 'stop' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2805:1: (lv_stop_1_0= 'stop' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2806:3: lv_stop_1_0= 'stop'
                    {
                    lv_stop_1_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleCopierCallbackDefinition5986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stop_1_0, grammarAccess.getCopierCallbackDefinitionAccess().getStopStopKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCopierCallbackDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "stop", true, "stop");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2819:3: ( (lv_trigger_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2820:1: (lv_trigger_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2820:1: (lv_trigger_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2821:3: lv_trigger_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCopierCallbackDefinitionAccess().getTriggerExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleCopierCallbackDefinition6021);
            lv_trigger_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCopierCallbackDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"trigger",
                      		lv_trigger_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCopierCallbackDefinition6033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCopierCallbackDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2841:1: ( (lv_action_4_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2842:1: (lv_action_4_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2842:1: (lv_action_4_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2843:3: lv_action_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCopierCallbackDefinitionAccess().getActionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleCopierCallbackDefinition6054);
            lv_action_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCopierCallbackDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"action",
                      		lv_action_4_0, 
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
    // $ANTLR end "ruleCopierCallbackDefinition"


    // $ANTLR start "entryRuleTraceDefinition"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2869:1: entryRuleTraceDefinition returns [EObject current=null] : iv_ruleTraceDefinition= ruleTraceDefinition EOF ;
    public final EObject entryRuleTraceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceDefinition = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2870:2: (iv_ruleTraceDefinition= ruleTraceDefinition EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2871:2: iv_ruleTraceDefinition= ruleTraceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition6092);
            iv_ruleTraceDefinition=ruleTraceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceDefinition6102); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2878:1: ruleTraceDefinition returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2881:28: ( (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2882:1: (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2882:1: (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2882:3: otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) )
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTraceDefinition6139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceDefinitionAccess().getLinkKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2886:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2887:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2887:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2888:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceDefinition6160);
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2904:2: ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==22) ) {
                alt54=1;
            }
            else if ( (LA54_0==54) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2904:3: (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2904:3: (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2904:5: otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTraceDefinition6174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTraceDefinitionAccess().getLeftCurlyBracketKeyword_2_0_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2908:1: ( (lv_elements_3_0= ruleTraceElementInline ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2909:1: (lv_elements_3_0= ruleTraceElementInline )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2909:1: (lv_elements_3_0= ruleTraceElementInline )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2910:3: lv_elements_3_0= ruleTraceElementInline
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition6195);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2926:2: (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==23) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2926:4: otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTraceDefinition6208); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTraceDefinitionAccess().getSemicolonKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2930:1: ( (lv_elements_5_0= ruleTraceElementInline ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2931:1: (lv_elements_5_0= ruleTraceElementInline )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2931:1: (lv_elements_5_0= ruleTraceElementInline )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2932:3: lv_elements_5_0= ruleTraceElementInline
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition6229);
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
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTraceDefinition6243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTraceDefinitionAccess().getRightCurlyBracketKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2953:6: ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2953:6: ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2953:7: ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2953:7: ( (lv_elements_7_0= ruleTraceElementExpanded ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2954:1: (lv_elements_7_0= ruleTraceElementExpanded )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2954:1: (lv_elements_7_0= ruleTraceElementExpanded )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2955:3: lv_elements_7_0= ruleTraceElementExpanded
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition6272);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2971:2: ( (lv_elements_8_0= ruleTraceElementExpanded ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==54) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2972:1: (lv_elements_8_0= ruleTraceElementExpanded )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2972:1: (lv_elements_8_0= ruleTraceElementExpanded )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:2973:3: lv_elements_8_0= ruleTraceElementExpanded
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition6293);
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTraceDefinition6306); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3001:1: entryRuleTraceElementInline returns [EObject current=null] : iv_ruleTraceElementInline= ruleTraceElementInline EOF ;
    public final EObject entryRuleTraceElementInline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceElementInline = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3002:2: (iv_ruleTraceElementInline= ruleTraceElementInline EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3003:2: iv_ruleTraceElementInline= ruleTraceElementInline EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceElementInlineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline6344);
            iv_ruleTraceElementInline=ruleTraceElementInline();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceElementInline; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementInline6354); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3010:1: ruleTraceElementInline returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) ;
    public final EObject ruleTraceElementInline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3013:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3014:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3014:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3014:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3014:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3015:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3015:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3016:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementInlineAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceElementInline6400);
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

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTraceElementInline6412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceElementInlineAccess().getColonKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3036:1: ( (lv_type_2_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3037:1: (lv_type_2_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3037:1: (lv_type_2_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3038:3: lv_type_2_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementInlineAccess().getTypeTypeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleTraceElementInline6433);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3062:1: entryRuleTraceElementExpanded returns [EObject current=null] : iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF ;
    public final EObject entryRuleTraceElementExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceElementExpanded = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3063:2: (iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3064:2: iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceElementExpandedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded6469);
            iv_ruleTraceElementExpanded=ruleTraceElementExpanded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceElementExpanded; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementExpanded6479); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3071:1: ruleTraceElementExpanded returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ) ;
    public final EObject ruleTraceElementExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3074:28: ( (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3075:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3075:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3075:3: otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) )
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTraceElementExpanded6516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceElementExpandedAccess().getVarKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3079:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3080:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3080:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3081:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementExpandedAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceElementExpanded6537);
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

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTraceElementExpanded6549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTraceElementExpandedAccess().getColonKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3101:1: ( (lv_type_3_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3102:1: (lv_type_3_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3102:1: (lv_type_3_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3103:3: lv_type_3_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementExpandedAccess().getTypeTypeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleTraceElementExpanded6570);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3127:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3128:2: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3129:2: iv_ruleTypeExpression= ruleTypeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression6606);
            iv_ruleTypeExpression=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpression6616); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3136:1: ruleTypeExpression returns [EObject current=null] : this_ClassUse_0= ruleClassUse ;
    public final EObject ruleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassUse_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3139:28: (this_ClassUse_0= ruleClassUse )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3141:5: this_ClassUse_0= ruleClassUse
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeExpressionAccess().getClassUseParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleTypeExpression6662);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3157:1: entryRuleClassUse returns [EObject current=null] : iv_ruleClassUse= ruleClassUse EOF ;
    public final EObject entryRuleClassUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassUse = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3158:2: (iv_ruleClassUse= ruleClassUse EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3159:2: iv_ruleClassUse= ruleClassUse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassUseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_entryRuleClassUse6696);
            iv_ruleClassUse=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassUse; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassUse6706); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3166:1: ruleClassUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ( (lv_annotations_3_0= ruleSingleAnnotation ) )? ( (lv_strictType_4_0= '!' ) )? ) ;
    public final EObject ruleClassUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token lv_strictType_4_0=null;
        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3169:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ( (lv_annotations_3_0= ruleSingleAnnotation ) )? ( (lv_strictType_4_0= '!' ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3170:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ( (lv_annotations_3_0= ruleSingleAnnotation ) )? ( (lv_strictType_4_0= '!' ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3170:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ( (lv_annotations_3_0= ruleSingleAnnotation ) )? ( (lv_strictType_4_0= '!' ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3170:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ( (lv_annotations_3_0= ruleSingleAnnotation ) )? ( (lv_strictType_4_0= '!' ) )?
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3170:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3171:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3171:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3172:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassUseRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassUse6751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getClassUseAccess().getModelRepresentModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleClassUse6763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassUseAccess().getExclamationMarkKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3187:1: ( (lv_className_2_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3188:1: (lv_className_2_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3188:1: (lv_className_2_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3189:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassUse6780); if (state.failed) return current;
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3205:2: ( (lv_annotations_3_0= ruleSingleAnnotation ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=55 && LA55_0<=56)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3206:1: (lv_annotations_3_0= ruleSingleAnnotation )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3206:1: (lv_annotations_3_0= ruleSingleAnnotation )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3207:3: lv_annotations_3_0= ruleSingleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassUseAccess().getAnnotationsSingleAnnotationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSingleAnnotation_in_ruleClassUse6806);
                    lv_annotations_3_0=ruleSingleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassUseRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_3_0, 
                              		"SingleAnnotation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3223:3: ( (lv_strictType_4_0= '!' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==32) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3224:1: (lv_strictType_4_0= '!' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3224:1: (lv_strictType_4_0= '!' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3225:3: lv_strictType_4_0= '!'
                    {
                    lv_strictType_4_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleClassUse6825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_strictType_4_0, grammarAccess.getClassUseAccess().getStrictTypeExclamationMarkKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassUseRule());
                      	        }
                             		setWithLastConsumed(current, "strictType", true, "!");
                      	    
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
    // $ANTLR end "ruleClassUse"


    // $ANTLR start "entryRuleSingleAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3246:1: entryRuleSingleAnnotation returns [EObject current=null] : iv_ruleSingleAnnotation= ruleSingleAnnotation EOF ;
    public final EObject entryRuleSingleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAnnotation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3247:2: (iv_ruleSingleAnnotation= ruleSingleAnnotation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3248:2: iv_ruleSingleAnnotation= ruleSingleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSingleAnnotation_in_entryRuleSingleAnnotation6875);
            iv_ruleSingleAnnotation=ruleSingleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleAnnotation6885); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3255:1: ruleSingleAnnotation returns [EObject current=null] : this_PotencyAnnotation_0= rulePotencyAnnotation ;
    public final EObject ruleSingleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_PotencyAnnotation_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3258:28: (this_PotencyAnnotation_0= rulePotencyAnnotation )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3260:5: this_PotencyAnnotation_0= rulePotencyAnnotation
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSingleAnnotationAccess().getPotencyAnnotationParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePotencyAnnotation_in_ruleSingleAnnotation6931);
            this_PotencyAnnotation_0=rulePotencyAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PotencyAnnotation_0; 
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
    // $ANTLR end "ruleSingleAnnotation"


    // $ANTLR start "entryRulePotencyAnnotation"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3276:1: entryRulePotencyAnnotation returns [EObject current=null] : iv_rulePotencyAnnotation= rulePotencyAnnotation EOF ;
    public final EObject entryRulePotencyAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotencyAnnotation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3277:2: (iv_rulePotencyAnnotation= rulePotencyAnnotation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3278:2: iv_rulePotencyAnnotation= rulePotencyAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPotencyAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation6965);
            iv_rulePotencyAnnotation=rulePotencyAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePotencyAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePotencyAnnotation6975); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3285:1: rulePotencyAnnotation returns [EObject current=null] : ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject rulePotencyAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3288:28: ( ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3289:1: ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3289:1: ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3289:2: (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3289:2: (otherlv_0= '@' | otherlv_1= '^' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==55) ) {
                alt57=1;
            }
            else if ( (LA57_0==56) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3289:4: otherlv_0= '@'
                    {
                    otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePotencyAnnotation7013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPotencyAnnotationAccess().getCommercialAtKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3294:7: otherlv_1= '^'
                    {
                    otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulePotencyAnnotation7031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPotencyAnnotationAccess().getCircumflexAccentKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3298:2: ( (lv_value_2_0= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3299:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3299:1: (lv_value_2_0= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3300:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulePotencyAnnotation7049); if (state.failed) return current;
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


    // $ANTLR start "entryRulePropertyWrite"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3324:1: entryRulePropertyWrite returns [EObject current=null] : iv_rulePropertyWrite= rulePropertyWrite EOF ;
    public final EObject entryRulePropertyWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyWrite = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3325:2: (iv_rulePropertyWrite= rulePropertyWrite EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3326:2: iv_rulePropertyWrite= rulePropertyWrite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyWriteRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite7090);
            iv_rulePropertyWrite=rulePropertyWrite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyWrite; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyWrite7100); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3333:1: rulePropertyWrite returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyWrite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3336:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3337:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3337:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3337:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3337:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3338:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3338:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3339:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyWriteRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropertyWrite7145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPropertyWriteAccess().getReceptorVariableCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulePropertyWrite7157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyWriteAccess().getFullStopKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3354:1: ( (lv_property_2_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3355:1: (lv_property_2_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3355:1: (lv_property_2_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3356:3: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropertyWrite7174); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePropertyWrite7191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropertyWriteAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3376:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3377:1: (lv_expression_4_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3377:1: (lv_expression_4_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3378:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyWriteAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePropertyWrite7212);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3402:1: entryRuleDefineVariable returns [EObject current=null] : iv_ruleDefineVariable= ruleDefineVariable EOF ;
    public final EObject entryRuleDefineVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineVariable = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3403:2: (iv_ruleDefineVariable= ruleDefineVariable EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3404:2: iv_ruleDefineVariable= ruleDefineVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable7248);
            iv_ruleDefineVariable=ruleDefineVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefineVariable7258); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3411:1: ruleDefineVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleDefineVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3414:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3415:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3415:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3415:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3415:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3416:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3416:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3417:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineVariableAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDefineVariable7304);
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

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDefineVariable7316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefineVariableAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3437:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3438:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3438:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3439:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDefineVariable7337);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3463:1: entryRuleModelReference returns [EObject current=null] : iv_ruleModelReference= ruleModelReference EOF ;
    public final EObject entryRuleModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelReference = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3464:2: (iv_ruleModelReference= ruleModelReference EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3465:2: iv_ruleModelReference= ruleModelReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_entryRuleModelReference7373);
            iv_ruleModelReference=ruleModelReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelReference7383); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3472:1: ruleModelReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) ;
    public final EObject ruleModelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3475:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3476:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3476:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3476:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3476:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3477:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3477:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3478:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getModelReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModelReference7428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getModelReferenceAccess().getModelRepresentModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleModelReference7440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelReferenceAccess().getExclamationMarkKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3493:1: ( (lv_className_2_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3494:1: (lv_className_2_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3494:1: (lv_className_2_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3495:3: lv_className_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelReferenceAccess().getClassNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModelReference7461);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3519:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3520:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3521:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression7497);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression7507); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3528:1: ruleExpression returns [EObject current=null] : this_MethodCall_0= ruleMethodCall ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MethodCall_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3531:28: (this_MethodCall_0= ruleMethodCall )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3533:5: this_MethodCall_0= ruleMethodCall
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getMethodCallParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_ruleExpression7553);
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


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3549:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3550:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3551:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7587);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedExpression7597); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3558:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3561:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3562:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3562:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3562:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParenthesizedExpression7634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParenthesizedExpression7656);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedExpression7667); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3587:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3588:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3589:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral7703);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral7713); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3596:1: ruleLiteral returns [EObject current=null] : (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_FloatLiteral_0 = null;

        EObject this_NumLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3599:28: ( (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3600:1: (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3600:1: (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt58=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==EOF||(LA58_1>=RULE_ID && LA58_1<=RULE_INT)||(LA58_1>=13 && LA58_1<=16)||LA58_1==20||LA58_1==22||LA58_1==24||LA58_1==26||LA58_1==35||(LA58_1>=38 && LA58_1<=39)||LA58_1==41||(LA58_1>=43 && LA58_1<=44)||(LA58_1>=47 && LA58_1<=48)||LA58_1==51||(LA58_1>=58 && LA58_1<=63)) ) {
                    alt58=2;
                }
                else if ( (LA58_1==42) ) {
                    int LA58_5 = input.LA(3);

                    if ( (LA58_5==RULE_INT) ) {
                        alt58=1;
                    }
                    else if ( ((LA58_5>=RULE_ID && LA58_5<=RULE_STRING)) ) {
                        alt58=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                alt58=2;
                }
                break;
            case RULE_STRING:
                {
                alt58=3;
                }
                break;
            case 61:
            case 62:
                {
                alt58=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3601:5: this_FloatLiteral_0= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_ruleLiteral7760);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3611:5: this_NumLiteral_1= ruleNumLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_ruleLiteral7787);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3621:5: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleLiteral7814);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3631:5: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_ruleLiteral7841);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3647:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3648:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3649:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference7876);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference7886); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3656:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3659:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3660:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3660:1: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3661:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3661:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3662:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableReference7930); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3681:1: entryRuleClosureDeclaration returns [EObject current=null] : iv_ruleClosureDeclaration= ruleClosureDeclaration EOF ;
    public final EObject entryRuleClosureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureDeclaration = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3682:2: (iv_ruleClosureDeclaration= ruleClosureDeclaration EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3683:2: iv_ruleClosureDeclaration= ruleClosureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClosureDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration7965);
            iv_ruleClosureDeclaration=ruleClosureDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClosureDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureDeclaration7975); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3690:1: ruleClosureDeclaration returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3693:28: ( (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3694:1: (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3694:1: (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3694:3: otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleClosureDeclaration8012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClosureDeclarationAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3698:1: (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==57) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3698:3: otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|'
                    {
                    otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleClosureDeclaration8025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3702:1: ( (lv_formalParameters_2_0= ruleClosureParameter ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3703:1: (lv_formalParameters_2_0= ruleClosureParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3703:1: (lv_formalParameters_2_0= ruleClosureParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3704:3: lv_formalParameters_2_0= ruleClosureParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration8046);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3720:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==14) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3720:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleClosureDeclaration8059); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getClosureDeclarationAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3724:1: ( (lv_formalParameters_4_0= ruleClosureParameter ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3725:1: (lv_formalParameters_4_0= ruleClosureParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3725:1: (lv_formalParameters_4_0= ruleClosureParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3726:3: lv_formalParameters_4_0= ruleClosureParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration8080);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleClosureDeclaration8094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3746:3: ( (lv_statements_6_0= ruleStatement ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_INT)||LA61_0==13||LA61_0==22||LA61_0==35||LA61_0==38||LA61_0==44||LA61_0==47||LA61_0==51||(LA61_0>=58 && LA61_0<=62)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3747:1: (lv_statements_6_0= ruleStatement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3747:1: (lv_statements_6_0= ruleStatement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3748:3: lv_statements_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleClosureDeclaration8117);
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
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleClosureDeclaration8130); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3776:1: entryRuleClosureParameter returns [EObject current=null] : iv_ruleClosureParameter= ruleClosureParameter EOF ;
    public final EObject entryRuleClosureParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3777:2: (iv_ruleClosureParameter= ruleClosureParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3778:2: iv_ruleClosureParameter= ruleClosureParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClosureParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter8166);
            iv_ruleClosureParameter=ruleClosureParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClosureParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureParameter8176); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3785:1: ruleClosureParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClosureParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3788:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3789:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3789:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3790:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3790:1: (lv_name_0_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3791:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClosureParameter8217); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3815:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3816:2: (iv_ruleMethodCall= ruleMethodCall EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3817:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_entryRuleMethodCall8257);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodCall8267); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3824:1: ruleMethodCall returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3827:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3828:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3828:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3829:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMethodCallAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleMethodCall8314);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3837:1: ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )?
            int alt66=3;
            switch ( input.LA(1) ) {
                case 26:
                case 39:
                case 63:
                    {
                    alt66=1;
                    }
                    break;
                case 60:
                    {
                    int LA66_2 = input.LA(2);

                    if ( ((LA66_2>=RULE_ID && LA66_2<=RULE_INT)||LA66_2==13||LA66_2==22||LA66_2==35||LA66_2==38||LA66_2==51||LA66_2==58||(LA66_2>=60 && LA66_2<=62)) ) {
                        alt66=1;
                    }
                    }
                    break;
                case 42:
                    {
                    alt66=2;
                    }
                    break;
            }

            switch (alt66) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3837:2: ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3837:2: ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3837:3: () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3837:3: ()
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3838:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getMethodCallAccess().getBinaryExprLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3843:2: ( (lv_binaryOp_2_0= ruleBinaryOp ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3844:1: (lv_binaryOp_2_0= ruleBinaryOp )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3844:1: (lv_binaryOp_2_0= ruleBinaryOp )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3845:3: lv_binaryOp_2_0= ruleBinaryOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodCallAccess().getBinaryOpBinaryOpEnumRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOp_in_ruleMethodCall8345);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3861:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3862:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3862:1: (lv_right_3_0= ruleExpression )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3863:3: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodCallAccess().getRightExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall8366);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3880:6: ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3880:6: ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==42) && (synpred1_InternalQool())) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3880:7: ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )?
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3880:7: ( ( () )=> () )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3880:8: ( () )=> ()
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3881:5: ()
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3882:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getMethodCallAccess().getMethodCallReceptorAction_1_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }


                    	    }

                    	    otherlv_5=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMethodCall8403); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getMethodCallAccess().getFullStopKeyword_1_1_1());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3891:1: ( (lv_methodName_6_0= ruleEString ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3892:1: (lv_methodName_6_0= ruleEString )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3892:1: (lv_methodName_6_0= ruleEString )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3893:3: lv_methodName_6_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodCallAccess().getMethodNameEStringParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMethodCall8424);
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

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3909:2: ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )?
                    	    int alt63=2;
                    	    alt63 = dfa63.predict(input);
                    	    switch (alt63) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3909:3: ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')'
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3909:3: ( (lv_withParameters_7_0= '(' ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3910:1: (lv_withParameters_7_0= '(' )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3910:1: (lv_withParameters_7_0= '(' )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3911:3: lv_withParameters_7_0= '('
                    	            {
                    	            lv_withParameters_7_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMethodCall8443); if (state.failed) return current;
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

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3924:2: ( (lv_parameters_8_0= ruleExpression ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3925:1: (lv_parameters_8_0= ruleExpression )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3925:1: (lv_parameters_8_0= ruleExpression )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3926:3: lv_parameters_8_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall8477);
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

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3942:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )*
                    	            loop62:
                    	            do {
                    	                int alt62=2;
                    	                int LA62_0 = input.LA(1);

                    	                if ( (LA62_0==14) ) {
                    	                    alt62=1;
                    	                }


                    	                switch (alt62) {
                    	            	case 1 :
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3942:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) )
                    	            	    {
                    	            	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMethodCall8490); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	          	newLeafNode(otherlv_9, grammarAccess.getMethodCallAccess().getCommaKeyword_1_1_3_2_0());
                    	            	          
                    	            	    }
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3946:1: ( (lv_parameters_10_0= ruleExpression ) )
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3947:1: (lv_parameters_10_0= ruleExpression )
                    	            	    {
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3947:1: (lv_parameters_10_0= ruleExpression )
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3948:3: lv_parameters_10_0= ruleExpression
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {
                    	            	       
                    	            	      	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_2_1_0()); 
                    	            	      	    
                    	            	    }
                    	            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall8511);
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
                    	            	    break loop62;
                    	                }
                    	            } while (true);

                    	            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMethodCall8525); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_11, grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_1_1_3_3());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3968:3: ( (lv_parameters_12_0= ruleClosureDeclaration ) )?
                    	    int alt64=2;
                    	    alt64 = dfa64.predict(input);
                    	    switch (alt64) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3969:1: (lv_parameters_12_0= ruleClosureDeclaration )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3969:1: (lv_parameters_12_0= ruleClosureDeclaration )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3970:3: lv_parameters_12_0= ruleClosureDeclaration
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersClosureDeclarationParserRuleCall_1_1_4_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_ruleMethodCall8548);
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
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3998:1: entryRuleMatchTraceExpression returns [EObject current=null] : iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF ;
    public final EObject entryRuleMatchTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchTraceExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3999:2: (iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4000:2: iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression8593);
            iv_ruleMatchTraceExpression=ruleMatchTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchTraceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatchTraceExpression8603); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4007:1: ruleMatchTraceExpression returns [EObject current=null] : (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4010:28: ( (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4011:1: (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4011:1: (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4011:3: otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleMatchTraceExpression8640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMatchTraceExpressionAccess().getMatchKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4015:1: (this_ID_1= RULE_ID otherlv_2= '!' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==32) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4015:2: this_ID_1= RULE_ID otherlv_2= '!'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchTraceExpression8652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getMatchTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMatchTraceExpression8663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMatchTraceExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4023:3: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4024:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4024:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4025:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMatchTraceExpressionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchTraceExpression8685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMatchTraceExpression8697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMatchTraceExpressionAccess().getWithKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMatchTraceExpression8709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMatchTraceExpressionAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4044:1: ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4045:1: (lv_traceExpr_6_0= ruleTraceExprLanguage )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4045:1: (lv_traceExpr_6_0= ruleTraceExprLanguage )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4046:3: lv_traceExpr_6_0= ruleTraceExprLanguage
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMatchTraceExpressionAccess().getTraceExprTraceExprLanguageParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_ruleMatchTraceExpression8730);
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

            otherlv_7=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMatchTraceExpression8742); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4074:1: entryRuleTraceExprLanguage returns [EObject current=null] : iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF ;
    public final EObject entryRuleTraceExprLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceExprLanguage = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4075:2: (iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4076:2: iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceExprLanguageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage8778);
            iv_ruleTraceExprLanguage=ruleTraceExprLanguage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceExprLanguage; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceExprLanguage8788); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4083:1: ruleTraceExprLanguage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleTraceExprLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4086:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4087:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4087:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4087:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4087:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4088:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4088:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4089:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTraceExprLanguageRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraceExprLanguage8833); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTraceExprLanguage8845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceExprLanguageAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4104:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4105:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4105:1: (lv_expr_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4106:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceExprLanguageAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTraceExprLanguage8866);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4130:1: entryRulePutTraceExpression returns [EObject current=null] : iv_rulePutTraceExpression= rulePutTraceExpression EOF ;
    public final EObject entryRulePutTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutTraceExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4131:2: (iv_rulePutTraceExpression= rulePutTraceExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4132:2: iv_rulePutTraceExpression= rulePutTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPutTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression8902);
            iv_rulePutTraceExpression=rulePutTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePutTraceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceExpression8912); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4139:1: rulePutTraceExpression returns [EObject current=null] : (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4142:28: ( (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4143:1: (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4143:1: (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4143:3: otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulePutTraceExpression8949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPutTraceExpressionAccess().getPutKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4147:1: (this_ID_1= RULE_ID otherlv_2= '!' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==32) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4147:2: this_ID_1= RULE_ID otherlv_2= '!'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceExpression8961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getPutTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulePutTraceExpression8972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPutTraceExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4155:3: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4156:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4156:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4157:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPutTraceExpressionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceExpression8994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePutTraceExpression9006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPutTraceExpressionAccess().getWithKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePutTraceExpression9018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPutTraceExpressionAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4176:1: ( (lv_parameters_6_0= rulePutTraceParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4177:1: (lv_parameters_6_0= rulePutTraceParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4177:1: (lv_parameters_6_0= rulePutTraceParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4178:3: lv_parameters_6_0= rulePutTraceParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression9039);
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4194:2: (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==14) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4194:4: otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePutTraceExpression9052); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getPutTraceExpressionAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4198:1: ( (lv_parameters_8_0= rulePutTraceParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4199:1: (lv_parameters_8_0= rulePutTraceParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4199:1: (lv_parameters_8_0= rulePutTraceParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4200:3: lv_parameters_8_0= rulePutTraceParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression9073);
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
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);

            otherlv_9=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePutTraceExpression9087); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4228:1: entryRulePutTraceParameter returns [EObject current=null] : iv_rulePutTraceParameter= rulePutTraceParameter EOF ;
    public final EObject entryRulePutTraceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutTraceParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4229:2: (iv_rulePutTraceParameter= rulePutTraceParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4230:2: iv_rulePutTraceParameter= rulePutTraceParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPutTraceParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter9123);
            iv_rulePutTraceParameter=rulePutTraceParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePutTraceParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceParameter9133); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4237:1: rulePutTraceParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePutTraceParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4240:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4241:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4241:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4241:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4241:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4242:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4242:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4243:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPutTraceParameterRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceParameter9178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePutTraceParameter9190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPutTraceParameterAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4258:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4259:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4259:1: (lv_value_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4260:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPutTraceParameterAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePutTraceParameter9211);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4284:1: entryRuleNumLiteral returns [EObject current=null] : iv_ruleNumLiteral= ruleNumLiteral EOF ;
    public final EObject entryRuleNumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4285:2: (iv_ruleNumLiteral= ruleNumLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4286:2: iv_ruleNumLiteral= ruleNumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral9247);
            iv_ruleNumLiteral=ruleNumLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumLiteral9257); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4293:1: ruleNumLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4296:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4297:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4297:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4298:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4298:1: (lv_value_0_0= ruleEInt )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4299:3: lv_value_0_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumLiteralAccess().getValueEIntParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumLiteral9302);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4323:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4324:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4325:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral9337);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatLiteral9347); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4332:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4335:28: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4336:1: ( (lv_value_0_0= ruleEDouble ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4336:1: ( (lv_value_0_0= ruleEDouble ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4337:1: (lv_value_0_0= ruleEDouble )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4337:1: (lv_value_0_0= ruleEDouble )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4338:3: lv_value_0_0= ruleEDouble
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFloatLiteralAccess().getValueEDoubleParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleFloatLiteral9392);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4362:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4363:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4364:2: iv_ruleEDouble= ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble9428);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDouble.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble9439); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4371:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4374:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4375:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4375:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4375:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble9479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEDouble9497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble9512); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4403:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4404:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4405:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9557);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral9567); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4412:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4415:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4416:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4416:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4417:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4417:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4418:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringLiteral9608); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4442:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4443:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4444:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9648);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteral9658); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4451:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4454:28: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4455:1: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4455:1: ( (lv_value_0_0= ruleEBoolean ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4456:1: (lv_value_0_0= ruleEBoolean )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4456:1: (lv_value_0_0= ruleEBoolean )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4457:3: lv_value_0_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLiteralAccess().getValueEBooleanParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleBooleanLiteral9703);
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


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4481:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4482:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4483:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString9739);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString9750); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4490:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4493:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4494:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4494:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_STRING) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_ID) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4494:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString9790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4502:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString9816); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4517:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4518:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4519:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt9862);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt9873); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4526:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4529:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4530:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4530:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4530:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4530:2: (kw= '-' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==60) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4531:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEInt9912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt9929); if (state.failed) return current;
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


    // $ANTLR start "entryRuleEBoolean"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4551:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4552:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4553:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean9975);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean9986); if (state.failed) return current;

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4560:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4563:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4564:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4564:1: (kw= 'true' | kw= 'false' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==61) ) {
                alt72=1;
            }
            else if ( (LA72_0==62) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4565:2: kw= 'true'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleEBoolean10024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4572:2: kw= 'false'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEBoolean10043); if (state.failed) return current;
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4585:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4586:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4587:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10084);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName10095); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4594:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_EString_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4597:28: ( (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4598:1: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4598:1: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4599:5: this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getEStringParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQualifiedName10142);
            this_EString_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EString_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4609:1: (kw= '.' this_EString_2= ruleEString )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==42) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4610:2: kw= '.' this_EString_2= ruleEString
            	    {
            	    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleQualifiedName10161); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getEStringParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQualifiedName10183);
            	    this_EString_2=ruleEString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_EString_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop73;
                }
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleBinaryOp"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4634:1: ruleBinaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleBinaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4636:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4637:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4637:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt74=1;
                }
                break;
            case 60:
                {
                alt74=2;
                }
                break;
            case 26:
                {
                alt74=3;
                }
                break;
            case 63:
                {
                alt74=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4637:2: (enumLiteral_0= '+' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4637:2: (enumLiteral_0= '+' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4637:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBinaryOp10244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4643:6: (enumLiteral_1= '-' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4643:6: (enumLiteral_1= '-' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4643:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleBinaryOp10261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4649:6: (enumLiteral_2= '*' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4649:6: (enumLiteral_2= '*' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4649:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBinaryOp10278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4655:6: (enumLiteral_3= '/' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4655:6: (enumLiteral_3= '/' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:4655:8: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleBinaryOp10295); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalQool
    public final void synpred1_InternalQool_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3880:8: ( () )
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3880:9: ()
        {
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3880:9: ()
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/parser/antlr/internal/InternalQool.g:3881:1: 
        {
        }


        }
    }
    // $ANTLR end synpred1_InternalQool

    // Delegated rules

    public final boolean synpred1_InternalQool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalQool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA22_eotS =
        "\13\uffff";
    static final String DFA22_eofS =
        "\1\uffff\2\3\6\uffff\1\3\1\uffff";
    static final String DFA22_minS =
        "\3\4\5\uffff\2\4\1\uffff";
    static final String DFA22_maxS =
        "\1\76\2\77\5\uffff\1\5\1\76\1\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\2\1\3\1\5\1\6\1\1\2\uffff\1\4";
    static final String DFA22_specialS =
        "\13\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\1\1\1\3\6\uffff\1\3\10\uffff\1\3\14\uffff\1\3\2\uffff\1"+
            "\3\5\uffff\1\5\2\uffff\1\6\3\uffff\1\3\6\uffff\1\3\1\4\3\3",
            "\3\3\6\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\7\uffff\1\7\1\3\2\uffff\2\3\2\uffff\1\3\1\uffff\1\3\2\uffff"+
            "\1\3\3\uffff\1\3\6\uffff\6\3",
            "\3\3\6\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\5\uffff\1\3\1\uffff\1\7\1\3\2\uffff\2\3\1\uffff\1\3\1\10"+
            "\1\uffff\1\3\2\uffff\1\3\3\uffff\1\3\6\uffff\6\3",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\3",
            "\3\3\6\uffff\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\11\uffff"+
            "\1\12\1\3\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\3"+
            "\uffff\1\3\6\uffff\5\3",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1321:1: (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite | this_ForAllStatement_4= ruleForAllStatement | this_EmitStatement_5= ruleEmitStatement )";
        }
    }
    static final String DFA23_eotS =
        "\14\uffff";
    static final String DFA23_eofS =
        "\2\uffff\1\11\11\uffff";
    static final String DFA23_minS =
        "\1\4\1\uffff\1\4\7\uffff\1\4\1\uffff";
    static final String DFA23_maxS =
        "\1\76\1\uffff\1\77\7\uffff\1\62\1\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\10\1\11\1\3\1\2\1\uffff\1\7";
    static final String DFA23_specialS =
        "\14\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\2\2\1\6\uffff\1\3\10\uffff\1\5\14\uffff\1\6\2\uffff\1\6\14"+
            "\uffff\1\7\6\uffff\1\4\1\uffff\3\1",
            "",
            "\3\11\6\uffff\4\11\3\uffff\1\11\1\uffff\1\11\1\uffff\1\11\1"+
            "\uffff\1\11\5\uffff\1\10\2\uffff\1\11\2\uffff\2\11\1\uffff\1"+
            "\12\3\11\2\uffff\2\11\2\uffff\1\11\6\uffff\6\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\11\53\uffff\2\13",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1401:1: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration | this_MatchExpression_6= ruleMatchExpression | this_InvokeTransformation_7= ruleInvokeTransformation | this_Copier_8= ruleCopier )";
        }
    }
    static final String DFA63_eotS =
        "\32\uffff";
    static final String DFA63_eofS =
        "\1\2\31\uffff";
    static final String DFA63_minS =
        "\1\4\31\uffff";
    static final String DFA63_maxS =
        "\1\76\31\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\1\1\2\27\uffff";
    static final String DFA63_specialS =
        "\32\uffff}>";
    static final String[] DFA63_transitionS = {
            "\3\2\6\uffff\1\1\3\2\3\uffff\1\2\1\uffff\1\2\1\uffff\1\2\12"+
            "\uffff\1\2\2\uffff\1\2\2\uffff\4\2\2\uffff\2\2\2\uffff\1\2\6"+
            "\uffff\5\2",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3909:2: ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )?";
        }
    }
    static final String DFA64_eotS =
        "\32\uffff";
    static final String DFA64_eofS =
        "\1\2\31\uffff";
    static final String DFA64_minS =
        "\1\4\31\uffff";
    static final String DFA64_maxS =
        "\1\76\31\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\1\1\2\27\uffff";
    static final String DFA64_specialS =
        "\32\uffff}>";
    static final String[] DFA64_transitionS = {
            "\3\2\6\uffff\4\2\3\uffff\1\2\1\uffff\1\1\1\uffff\1\2\12\uffff"+
            "\1\2\2\uffff\1\2\2\uffff\4\2\2\uffff\2\2\2\uffff\1\2\6\uffff"+
            "\5\2",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3968:3: ( (lv_parameters_12_0= ruleClosureDeclaration ) )?";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQoolTransformation_in_entryRuleQoolTransformation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQoolTransformation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleQoolTransformation122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQoolTransformation143 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleQoolTransformation155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleQoolTransformation176 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleQoolTransformation189 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleQoolTransformation210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleQoolTransformation224 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleQoolTransformation236 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleQoolTransformation248 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleQoolTransformation270 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleQoolTransformation283 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_ruleQoolTransformation304 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleQoolTransformation320 = new BitSet(new long[]{0x00000000100A0010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleQoolTransformation341 = new BitSet(new long[]{0x00000000100A0010L});
        public static final BitSet FOLLOW_ruleInlineModel_in_ruleQoolTransformation363 = new BitSet(new long[]{0x00000000100A0010L});
        public static final BitSet FOLLOW_ruleImportedModel_in_ruleQoolTransformation385 = new BitSet(new long[]{0x00000000100A0010L});
        public static final BitSet FOLLOW_ruleQoolQueue_in_ruleQoolTransformation407 = new BitSet(new long[]{0x00000002100A0010L});
        public static final BitSet FOLLOW_ruleSegment_in_ruleQoolTransformation429 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleImportedModel_in_entryRuleImportedModel466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportedModel476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleImportedModel513 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImportedModel534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation570 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetamodelModelAnnotation_in_ruleAnnotation626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetamodelModelAnnotation_in_entryRuleMetamodelModelAnnotation660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelModelAnnotation670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMetamodelModelAnnotation715 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMetamodelModelAnnotation727 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMetamodelModelAnnotation744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformationDefinitionParameter_in_entryRuleTransformationDefinitionParameter785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformationDefinitionParameter795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransformationDefinitionParameter850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineModel_in_entryRuleInlineModel886 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineModel896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleInlineModel933 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInlineModel954 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleInlineClass_in_ruleInlineModel975 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleInlineModel988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineClass_in_entryRuleInlineClass1024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineClass1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleInlineClass1071 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInlineClass1092 = new BitSet(new long[]{0x000000000A400000L});
        public static final BitSet FOLLOW_22_in_ruleInlineClass1106 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleInlineReferenceInline_in_ruleInlineClass1127 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleInlineClass1140 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleInlineReferenceInline_in_ruleInlineClass1161 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleInlineClass1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineFeatureExpanded_in_ruleInlineClass1204 = new BitSet(new long[]{0x000000000A500000L});
        public static final BitSet FOLLOW_ruleInlineFeatureExpanded_in_ruleInlineClass1225 = new BitSet(new long[]{0x000000000A500000L});
        public static final BitSet FOLLOW_20_in_ruleInlineClass1238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineReferenceInline_in_entryRuleInlineReferenceInline1276 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineReferenceInline1286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInlineReferenceInline1332 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleInlineReferenceInline1344 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleInlineReferenceInline1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineFeatureExpanded_in_entryRuleInlineFeatureExpanded1401 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineFeatureExpanded1411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineAttributeExpanded_in_ruleInlineFeatureExpanded1458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineReferenceExpanded_in_ruleInlineFeatureExpanded1485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineAttributeExpanded_in_entryRuleInlineAttributeExpanded1520 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineAttributeExpanded1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleInlineAttributeExpanded1567 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInlineAttributeExpanded1588 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleInlineAttributeExpanded1600 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleInlineAttributeExpanded1621 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleInlineAttributeExpanded1639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineReferenceExpanded_in_entryRuleInlineReferenceExpanded1689 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineReferenceExpanded1699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleInlineReferenceExpanded1736 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInlineReferenceExpanded1757 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleInlineReferenceExpanded1769 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleInlineReferenceExpanded1790 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleInlineReferenceExpanded1808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQoolQueue_in_entryRuleQoolQueue1858 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQoolQueue1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalQueue_in_ruleQoolQueue1915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelElementQueue_in_ruleQoolQueue1942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalQueue_in_entryRuleLocalQueue1977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalQueue1987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleLocalQueue2024 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleLocalQueue2036 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLocalQueue2053 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleLocalQueue2070 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleLocalQueue2091 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleLocalQueue2104 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleQueueOptimization_in_ruleLocalQueue2125 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleModelElementQueue_in_entryRuleModelElementQueue2164 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelElementQueue2174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleModelElementQueue2211 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleModelElementQueue2223 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModelElementQueue2240 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleModelElementQueue2257 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleModelElementQueue2278 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleModelElementQueue2291 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleModelElementQueue2312 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleQueueOptimization_in_entryRuleQueueOptimization2350 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQueueOptimization2360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessByFeatureOptimization_in_ruleQueueOptimization2406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessByFeatureOptimization_in_entryRuleAccessByFeatureOptimization2440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccessByFeatureOptimization2450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleAccessByFeatureOptimization2487 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccessByFeatureOptimization2508 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleAccessByFeatureOptimization2526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSegment_in_entryRuleSegment2576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSegment2586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleSegment2623 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSegment2644 = new BitSet(new long[]{0x7C08904800402070L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleSegment2665 = new BitSet(new long[]{0x7C08904800502070L});
        public static final BitSet FOLLOW_20_in_ruleSegment2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2714 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatement2724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_ruleStatement2771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleStatement2798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_ruleStatement2825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_ruleStatement2852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForAllStatement_in_ruleStatement2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmitStatement_in_ruleStatement2906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2941 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression2998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rulePrimaryExpression3025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_rulePrimaryExpression3052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression3079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_rulePrimaryExpression3106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_rulePrimaryExpression3133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchExpression_in_rulePrimaryExpression3160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvokeTransformation_in_rulePrimaryExpression3187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopier_in_rulePrimaryExpression3214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedInvocationParameter_in_entryRuleNamedInvocationParameter3249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedInvocationParameter3259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNamedInvocationParameter3305 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleNamedInvocationParameter3317 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleNamedInvocationParameter3338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvokeTransformation_in_entryRuleInvokeTransformation3374 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvokeTransformation3384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvokeExternal_in_ruleInvokeTransformation3431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvokeInternal_in_ruleInvokeTransformation3458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvokeInternal_in_entryRuleInvokeInternal3493 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvokeInternal3503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleInvokeInternal3540 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvokeInternal3561 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvokeInternal3573 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleInvocationParameter_in_ruleInvokeInternal3595 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleInvokeInternal3608 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleInvocationParameter_in_ruleInvokeInternal3629 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleInvokeInternal3645 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleInvokeInternal3657 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvokeInternal3669 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleInvocationParameter_in_ruleInvokeInternal3691 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleInvokeInternal3704 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleInvocationParameter_in_ruleInvokeInternal3725 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleInvokeInternal3741 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_36_in_ruleInvokeInternal3754 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInvokeInternal3774 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_37_in_ruleInvokeInternal3789 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInvokeInternal3806 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvokeInternal3823 = new BitSet(new long[]{0x740800480040E070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleInvokeInternal3844 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleInvokeInternal3858 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleInvokeInternal3879 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleInvokeInternal3893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvokeExternal_in_entryRuleInvokeExternal3931 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvokeExternal3941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleInvokeExternal3978 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInvokeExternal3999 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvokeExternal4011 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleInvocationParameter_in_ruleInvokeExternal4033 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleInvokeExternal4046 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleInvocationParameter_in_ruleInvokeExternal4067 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleInvokeExternal4083 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleInvokeExternal4095 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvokeExternal4107 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleInvocationParameter_in_ruleInvokeExternal4129 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleInvokeExternal4142 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleInvocationParameter_in_ruleInvokeExternal4163 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleInvokeExternal4179 = new BitSet(new long[]{0x000000B000000002L});
        public static final BitSet FOLLOW_39_in_ruleInvokeExternal4192 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvokeExternal4204 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleNamedInvocationParameter_in_ruleInvokeExternal4225 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleInvokeExternal4238 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleNamedInvocationParameter_in_ruleInvokeExternal4259 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleInvokeExternal4273 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_37_in_ruleInvokeExternal4289 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInvokeExternal4306 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvokeExternal4323 = new BitSet(new long[]{0x740800480040E070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleInvokeExternal4344 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleInvokeExternal4358 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleInvokeExternal4379 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleInvokeExternal4393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleInvokeExternal4414 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInvokeExternal4434 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_40_in_ruleInvokeExternal4447 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleInvokeExternal4468 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleInvokeExternal4480 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvokeExternal4501 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleInvokeExternal4513 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvokeExternal4534 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleInvokeExternal4546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvocationParameter_in_entryRuleInvocationParameter4586 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvocationParameter4596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInvocationParameter4638 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleInvocationParameter4655 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInvocationParameter4675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForAllStatement_in_entryRuleForAllStatement4711 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForAllStatement4721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleForAllStatement4758 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleForAllStatement4775 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleForAllStatement4792 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleForAllStatement4812 = new BitSet(new long[]{0x7C08D04800402070L});
        public static final BitSet FOLLOW_46_in_ruleForAllStatement4825 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForAllStatement4846 = new BitSet(new long[]{0x7C08904800402070L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleForAllStatement4869 = new BitSet(new long[]{0x7C08904800502070L});
        public static final BitSet FOLLOW_20_in_ruleForAllStatement4882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmitStatement_in_entryRuleEmitStatement4918 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmitStatement4928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEmitStatement4965 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEmitStatement4986 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleEmitStatement4998 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmitStatement5018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchExpression_in_entryRuleMatchExpression5054 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatchExpression5064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchExpression5109 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleMatchExpression5121 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_rulePredicate_in_ruleMatchExpression5142 = new BitSet(new long[]{0x0000080000004000L});
        public static final BitSet FOLLOW_14_in_ruleMatchExpression5155 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_rulePredicate_in_ruleMatchExpression5176 = new BitSet(new long[]{0x0000080000004000L});
        public static final BitSet FOLLOW_43_in_ruleMatchExpression5190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate5226 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicate5236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKindOfPredicate_in_rulePredicate5283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyEqualsPredicate_in_rulePredicate5310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKindOfPredicate_in_entryRuleKindOfPredicate5345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKindOfPredicate5355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleKindOfPredicate5392 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleKindOfPredicate5404 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleKindOfPredicate5425 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleKindOfPredicate5437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyEqualsPredicate_in_entryRulePropertyEqualsPredicate5473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyEqualsPredicate5483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rulePropertyEqualsPredicate5520 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePropertyEqualsPredicate5532 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePropertyEqualsPredicate5553 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePropertyEqualsPredicate5565 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePropertyEqualsPredicate5586 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePropertyEqualsPredicate5598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopier_in_entryRuleCopier5634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopier5644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleCopier5681 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCopier5693 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleCopier5714 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleCopier5727 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleCopier5748 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleCopier5762 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleCopier5774 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCopier5794 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleCopier5807 = new BitSet(new long[]{0x0010000040000000L});
        public static final BitSet FOLLOW_ruleCopierCallbackDefinition_in_ruleCopier5828 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleCopier5841 = new BitSet(new long[]{0x0010000040000000L});
        public static final BitSet FOLLOW_ruleCopierCallbackDefinition_in_ruleCopier5862 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_24_in_ruleCopier5876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopierCallbackDefinition_in_entryRuleCopierCallbackDefinition5914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopierCallbackDefinition5924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCopierCallbackDefinition5962 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_52_in_ruleCopierCallbackDefinition5986 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleCopierCallbackDefinition6021 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCopierCallbackDefinition6033 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleCopierCallbackDefinition6054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition6092 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceDefinition6102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTraceDefinition6139 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceDefinition6160 = new BitSet(new long[]{0x0040000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTraceDefinition6174 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition6195 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleTraceDefinition6208 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition6229 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleTraceDefinition6243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition6272 = new BitSet(new long[]{0x0040000000500000L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition6293 = new BitSet(new long[]{0x0040000000500000L});
        public static final BitSet FOLLOW_20_in_ruleTraceDefinition6306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline6344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementInline6354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceElementInline6400 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTraceElementInline6412 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleTraceElementInline6433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded6469 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementExpanded6479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTraceElementExpanded6516 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceElementExpanded6537 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTraceElementExpanded6549 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleTraceElementExpanded6570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression6606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpression6616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleTypeExpression6662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_entryRuleClassUse6696 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassUse6706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassUse6751 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleClassUse6763 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassUse6780 = new BitSet(new long[]{0x0180000100000002L});
        public static final BitSet FOLLOW_ruleSingleAnnotation_in_ruleClassUse6806 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleClassUse6825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleAnnotation_in_entryRuleSingleAnnotation6875 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleAnnotation6885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePotencyAnnotation_in_ruleSingleAnnotation6931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation6965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePotencyAnnotation6975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rulePotencyAnnotation7013 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_56_in_rulePotencyAnnotation7031 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_rulePotencyAnnotation7049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite7090 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyWrite7100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropertyWrite7145 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_rulePropertyWrite7157 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropertyWrite7174 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulePropertyWrite7191 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePropertyWrite7212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable7248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefineVariable7258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDefineVariable7304 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleDefineVariable7316 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDefineVariable7337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference7373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelReference7383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModelReference7428 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleModelReference7440 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModelReference7461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression7497 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression7507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_ruleExpression7553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7587 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression7597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleParenthesizedExpression7634 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression7656 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedExpression7667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral7703 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral7713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral7760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_ruleLiteral7787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral7814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral7841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference7876 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference7886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference7930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration7965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureDeclaration7975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleClosureDeclaration8012 = new BitSet(new long[]{0x7E08904800402070L});
        public static final BitSet FOLLOW_57_in_ruleClosureDeclaration8025 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration8046 = new BitSet(new long[]{0x0200000000004000L});
        public static final BitSet FOLLOW_14_in_ruleClosureDeclaration8059 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration8080 = new BitSet(new long[]{0x0200000000004000L});
        public static final BitSet FOLLOW_57_in_ruleClosureDeclaration8094 = new BitSet(new long[]{0x7C08904800402070L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleClosureDeclaration8117 = new BitSet(new long[]{0x7C08904801402070L});
        public static final BitSet FOLLOW_24_in_ruleClosureDeclaration8130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter8166 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureParameter8176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClosureParameter8217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall8257 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall8267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMethodCall8314 = new BitSet(new long[]{0x9000048004000002L});
        public static final BitSet FOLLOW_ruleBinaryOp_in_ruleMethodCall8345 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall8366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleMethodCall8403 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMethodCall8424 = new BitSet(new long[]{0x0000040000402002L});
        public static final BitSet FOLLOW_13_in_ruleMethodCall8443 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall8477 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleMethodCall8490 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall8511 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleMethodCall8525 = new BitSet(new long[]{0x0000040000400002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_ruleMethodCall8548 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression8593 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatchTraceExpression8603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleMatchTraceExpression8640 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchTraceExpression8652 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMatchTraceExpression8663 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchTraceExpression8685 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMatchTraceExpression8697 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleMatchTraceExpression8709 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_ruleMatchTraceExpression8730 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleMatchTraceExpression8742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage8778 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceExprLanguage8788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraceExprLanguage8833 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleTraceExprLanguage8845 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTraceExprLanguage8866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression8902 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceExpression8912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulePutTraceExpression8949 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceExpression8961 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulePutTraceExpression8972 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceExpression8994 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePutTraceExpression9006 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_rulePutTraceExpression9018 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression9039 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePutTraceExpression9052 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression9073 = new BitSet(new long[]{0x0000080000004000L});
        public static final BitSet FOLLOW_43_in_rulePutTraceExpression9087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter9123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceParameter9133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceParameter9178 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulePutTraceParameter9190 = new BitSet(new long[]{0x7408004800402070L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePutTraceParameter9211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral9247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral9257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumLiteral9302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral9337 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral9347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleFloatLiteral9392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble9428 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble9439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble9479 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleEDouble9497 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble9512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9557 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral9658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleBooleanLiteral9703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString9739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString9750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString9790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString9816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt9862 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt9873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleEInt9912 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt9929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean9975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean9986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleEBoolean10024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleEBoolean10043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQualifiedName10142 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleQualifiedName10161 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQualifiedName10183 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_39_in_ruleBinaryOp10244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleBinaryOp10261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleBinaryOp10278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleBinaryOp10295 = new BitSet(new long[]{0x0000000000000002L});
    }


}