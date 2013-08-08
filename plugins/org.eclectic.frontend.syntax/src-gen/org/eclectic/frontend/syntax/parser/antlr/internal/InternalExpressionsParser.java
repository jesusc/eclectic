package org.eclectic.frontend.syntax.parser.antlr.internal; 

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
import org.eclectic.frontend.syntax.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_KEYWORD_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'trace'", "'end'", "'link'", "'{'", "';'", "'}'", "':'", "'var'", "'!'", "'@'", "'^'", "'.'", "'='", "'if'", "'elsif'", "'else'", "'('", "')'", "'|'", "','", "'match'", "'with'", "'['", "']'", "'put'", "'-'", "'true'", "'false'", "'+'", "'*'", "'/'"
    };
    public static final int T__42=42;
    public static final int RULE_KEYWORD_ID=7;
    public static final int RULE_ID=4;
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
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g"; }



     	private ExpressionsGrammarAccess grammarAccess;
     	
        public InternalExpressionsParser(TokenStream input, ExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TraceInterface";	
       	}
       	
       	@Override
       	protected ExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTraceInterface"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:68:1: entryRuleTraceInterface returns [EObject current=null] : iv_ruleTraceInterface= ruleTraceInterface EOF ;
    public final EObject entryRuleTraceInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceInterface = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:69:2: (iv_ruleTraceInterface= ruleTraceInterface EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:70:2: iv_ruleTraceInterface= ruleTraceInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceInterface_in_entryRuleTraceInterface75);
            iv_ruleTraceInterface=ruleTraceInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceInterface; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceInterface85); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:77:1: ruleTraceInterface returns [EObject current=null] : (otherlv_0= 'trace' ( (lv_name_1_0= ruleEString ) ) ( (lv_definitions_2_0= ruleTraceDefinition ) )+ otherlv_3= 'end' ) ;
    public final EObject ruleTraceInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_definitions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:80:28: ( (otherlv_0= 'trace' ( (lv_name_1_0= ruleEString ) ) ( (lv_definitions_2_0= ruleTraceDefinition ) )+ otherlv_3= 'end' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:81:1: (otherlv_0= 'trace' ( (lv_name_1_0= ruleEString ) ) ( (lv_definitions_2_0= ruleTraceDefinition ) )+ otherlv_3= 'end' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:81:1: (otherlv_0= 'trace' ( (lv_name_1_0= ruleEString ) ) ( (lv_definitions_2_0= ruleTraceDefinition ) )+ otherlv_3= 'end' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:81:3: otherlv_0= 'trace' ( (lv_name_1_0= ruleEString ) ) ( (lv_definitions_2_0= ruleTraceDefinition ) )+ otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTraceInterface122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceInterfaceAccess().getTraceKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:86:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:86:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:87:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceInterfaceAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceInterface143);
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:103:2: ( (lv_definitions_2_0= ruleTraceDefinition ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:104:1: (lv_definitions_2_0= ruleTraceDefinition )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:104:1: (lv_definitions_2_0= ruleTraceDefinition )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:105:3: lv_definitions_2_0= ruleTraceDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTraceInterfaceAccess().getDefinitionsTraceDefinitionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_ruleTraceInterface164);
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
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTraceInterface177); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:133:1: entryRuleTraceDefinition returns [EObject current=null] : iv_ruleTraceDefinition= ruleTraceDefinition EOF ;
    public final EObject entryRuleTraceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceDefinition = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:134:2: (iv_ruleTraceDefinition= ruleTraceDefinition EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:135:2: iv_ruleTraceDefinition= ruleTraceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition213);
            iv_ruleTraceDefinition=ruleTraceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceDefinition223); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:142:1: ruleTraceDefinition returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:145:28: ( (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:146:1: (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:146:1: (otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:146:3: otherlv_0= 'link' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) )
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTraceDefinition260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceDefinitionAccess().getLinkKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:150:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:151:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:151:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:152:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceDefinition281);
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:168:2: ( (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' ) | ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:168:3: (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:168:3: (otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:168:5: otherlv_2= '{' ( (lv_elements_3_0= ruleTraceElementInline ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTraceDefinition295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTraceDefinitionAccess().getLeftCurlyBracketKeyword_2_0_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:172:1: ( (lv_elements_3_0= ruleTraceElementInline ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:173:1: (lv_elements_3_0= ruleTraceElementInline )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:173:1: (lv_elements_3_0= ruleTraceElementInline )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:174:3: lv_elements_3_0= ruleTraceElementInline
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition316);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:190:2: (otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:190:4: otherlv_4= ';' ( (lv_elements_5_0= ruleTraceElementInline ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTraceDefinition329); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTraceDefinitionAccess().getSemicolonKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:194:1: ( (lv_elements_5_0= ruleTraceElementInline ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:195:1: (lv_elements_5_0= ruleTraceElementInline )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:195:1: (lv_elements_5_0= ruleTraceElementInline )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:196:3: lv_elements_5_0= ruleTraceElementInline
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementInlineParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition350);
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

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTraceDefinition364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTraceDefinitionAccess().getRightCurlyBracketKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:217:6: ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:217:6: ( ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:217:7: ( (lv_elements_7_0= ruleTraceElementExpanded ) ) ( (lv_elements_8_0= ruleTraceElementExpanded ) )* otherlv_9= 'end'
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:217:7: ( (lv_elements_7_0= ruleTraceElementExpanded ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:218:1: (lv_elements_7_0= ruleTraceElementExpanded )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:218:1: (lv_elements_7_0= ruleTraceElementExpanded )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:219:3: lv_elements_7_0= ruleTraceElementExpanded
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition393);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:235:2: ( (lv_elements_8_0= ruleTraceElementExpanded ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==19) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:236:1: (lv_elements_8_0= ruleTraceElementExpanded )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:236:1: (lv_elements_8_0= ruleTraceElementExpanded )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:237:3: lv_elements_8_0= ruleTraceElementExpanded
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTraceDefinitionAccess().getElementsTraceElementExpandedParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition414);
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

                    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTraceDefinition427); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:265:1: entryRuleTraceElementInline returns [EObject current=null] : iv_ruleTraceElementInline= ruleTraceElementInline EOF ;
    public final EObject entryRuleTraceElementInline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceElementInline = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:266:2: (iv_ruleTraceElementInline= ruleTraceElementInline EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:267:2: iv_ruleTraceElementInline= ruleTraceElementInline EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceElementInlineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline465);
            iv_ruleTraceElementInline=ruleTraceElementInline();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceElementInline; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementInline475); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:274:1: ruleTraceElementInline returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) ;
    public final EObject ruleTraceElementInline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:277:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:278:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:278:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:278:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:278:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:279:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:279:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:280:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementInlineAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceElementInline521);
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

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTraceElementInline533); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceElementInlineAccess().getColonKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:300:1: ( (lv_type_2_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:301:1: (lv_type_2_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:301:1: (lv_type_2_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:302:3: lv_type_2_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementInlineAccess().getTypeTypeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleTraceElementInline554);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:326:1: entryRuleTraceElementExpanded returns [EObject current=null] : iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF ;
    public final EObject entryRuleTraceElementExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceElementExpanded = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:327:2: (iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:328:2: iv_ruleTraceElementExpanded= ruleTraceElementExpanded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceElementExpandedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded590);
            iv_ruleTraceElementExpanded=ruleTraceElementExpanded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceElementExpanded; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceElementExpanded600); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:335:1: ruleTraceElementExpanded returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ) ;
    public final EObject ruleTraceElementExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:338:28: ( (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:339:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:339:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:339:3: otherlv_0= 'var' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExpression ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTraceElementExpanded637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceElementExpandedAccess().getVarKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:343:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:344:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:344:1: (lv_name_1_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:345:3: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementExpandedAccess().getNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTraceElementExpanded658);
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

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTraceElementExpanded670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTraceElementExpandedAccess().getColonKeyword_2());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:365:1: ( (lv_type_3_0= ruleTypeExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:366:1: (lv_type_3_0= ruleTypeExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:366:1: (lv_type_3_0= ruleTypeExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:367:3: lv_type_3_0= ruleTypeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceElementExpandedAccess().getTypeTypeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_ruleTraceElementExpanded691);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:391:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:392:2: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:393:2: iv_ruleTypeExpression= ruleTypeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression727);
            iv_ruleTypeExpression=ruleTypeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpression737); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:400:1: ruleTypeExpression returns [EObject current=null] : this_ClassUse_0= ruleClassUse ;
    public final EObject ruleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassUse_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:403:28: (this_ClassUse_0= ruleClassUse )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:405:5: this_ClassUse_0= ruleClassUse
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeExpressionAccess().getClassUseParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_ruleTypeExpression783);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:421:1: entryRuleClassUse returns [EObject current=null] : iv_ruleClassUse= ruleClassUse EOF ;
    public final EObject entryRuleClassUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassUse = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:422:2: (iv_ruleClassUse= ruleClassUse EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:423:2: iv_ruleClassUse= ruleClassUse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassUseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassUse_in_entryRuleClassUse817);
            iv_ruleClassUse=ruleClassUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassUse; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassUse827); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:430:1: ruleClassUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ( (lv_annotations_3_0= ruleSingleAnnotation ) )? ( (lv_strictType_4_0= '!' ) )? ) ;
    public final EObject ruleClassUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token lv_strictType_4_0=null;
        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:433:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ( (lv_annotations_3_0= ruleSingleAnnotation ) )? ( (lv_strictType_4_0= '!' ) )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:434:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ( (lv_annotations_3_0= ruleSingleAnnotation ) )? ( (lv_strictType_4_0= '!' ) )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:434:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ( (lv_annotations_3_0= ruleSingleAnnotation ) )? ( (lv_strictType_4_0= '!' ) )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:434:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= RULE_ID ) ) ( (lv_annotations_3_0= ruleSingleAnnotation ) )? ( (lv_strictType_4_0= '!' ) )?
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:434:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:435:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:435:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:436:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassUseRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassUse872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getClassUseAccess().getModelRepresentModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleClassUse884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassUseAccess().getExclamationMarkKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:451:1: ( (lv_className_2_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:452:1: (lv_className_2_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:452:1: (lv_className_2_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:453:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassUse901); if (state.failed) return current;
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:469:2: ( (lv_annotations_3_0= ruleSingleAnnotation ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=21 && LA5_0<=22)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:470:1: (lv_annotations_3_0= ruleSingleAnnotation )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:470:1: (lv_annotations_3_0= ruleSingleAnnotation )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:471:3: lv_annotations_3_0= ruleSingleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassUseAccess().getAnnotationsSingleAnnotationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSingleAnnotation_in_ruleClassUse927);
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:487:3: ( (lv_strictType_4_0= '!' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:488:1: (lv_strictType_4_0= '!' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:488:1: (lv_strictType_4_0= '!' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:489:3: lv_strictType_4_0= '!'
                    {
                    lv_strictType_4_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleClassUse946); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:510:1: entryRuleSingleAnnotation returns [EObject current=null] : iv_ruleSingleAnnotation= ruleSingleAnnotation EOF ;
    public final EObject entryRuleSingleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAnnotation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:511:2: (iv_ruleSingleAnnotation= ruleSingleAnnotation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:512:2: iv_ruleSingleAnnotation= ruleSingleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSingleAnnotation_in_entryRuleSingleAnnotation996);
            iv_ruleSingleAnnotation=ruleSingleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleAnnotation1006); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:519:1: ruleSingleAnnotation returns [EObject current=null] : this_PotencyAnnotation_0= rulePotencyAnnotation ;
    public final EObject ruleSingleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_PotencyAnnotation_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:522:28: (this_PotencyAnnotation_0= rulePotencyAnnotation )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:524:5: this_PotencyAnnotation_0= rulePotencyAnnotation
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSingleAnnotationAccess().getPotencyAnnotationParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePotencyAnnotation_in_ruleSingleAnnotation1052);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:540:1: entryRulePotencyAnnotation returns [EObject current=null] : iv_rulePotencyAnnotation= rulePotencyAnnotation EOF ;
    public final EObject entryRulePotencyAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePotencyAnnotation = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:541:2: (iv_rulePotencyAnnotation= rulePotencyAnnotation EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:542:2: iv_rulePotencyAnnotation= rulePotencyAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPotencyAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation1086);
            iv_rulePotencyAnnotation=rulePotencyAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePotencyAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePotencyAnnotation1096); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:549:1: rulePotencyAnnotation returns [EObject current=null] : ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject rulePotencyAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:552:28: ( ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:553:1: ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:553:1: ( (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:553:2: (otherlv_0= '@' | otherlv_1= '^' ) ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:553:2: (otherlv_0= '@' | otherlv_1= '^' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:553:4: otherlv_0= '@'
                    {
                    otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePotencyAnnotation1134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPotencyAnnotationAccess().getCommercialAtKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:558:7: otherlv_1= '^'
                    {
                    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePotencyAnnotation1152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPotencyAnnotationAccess().getCircumflexAccentKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:562:2: ( (lv_value_2_0= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:563:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:563:1: (lv_value_2_0= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:564:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulePotencyAnnotation1170); if (state.failed) return current;
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


    // $ANTLR start "entryRuleStatement"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:588:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:589:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:590:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_entryRuleStatement1211);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatement1221); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:597:1: ruleStatement returns [EObject current=null] : (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DefineVariable_0 = null;

        EObject this_Expression_1 = null;

        EObject this_PutTraceExpression_2 = null;

        EObject this_PropertyWrite_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:600:28: ( (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:601:1: (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:601:1: (this_DefineVariable_0= ruleDefineVariable | this_Expression_1= ruleExpression | this_PutTraceExpression_2= rulePutTraceExpression | this_PropertyWrite_3= rulePropertyWrite )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||(LA8_1>=RULE_ID && LA8_1<=RULE_STRING)||LA8_1==13||LA8_1==15||LA8_1==17||LA8_1==23||(LA8_1>=25 && LA8_1<=28)||LA8_1==32||(LA8_1>=36 && LA8_1<=42)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==24) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case RULE_STRING:
                case 13:
                case 15:
                case 17:
                case 20:
                case 25:
                case 26:
                case 27:
                case 28:
                case 32:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                    {
                    alt8=2;
                    }
                    break;
                case 24:
                    {
                    alt8=1;
                    }
                    break;
                case 23:
                    {
                    int LA8_6 = input.LA(3);

                    if ( (LA8_6==RULE_ID) ) {
                        int LA8_7 = input.LA(4);

                        if ( (LA8_7==24) ) {
                            alt8=4;
                        }
                        else if ( (LA8_7==EOF||(LA8_7>=RULE_ID && LA8_7<=RULE_STRING)||LA8_7==13||LA8_7==15||LA8_7==17||LA8_7==23||(LA8_7>=25 && LA8_7<=28)||LA8_7==32||(LA8_7>=36 && LA8_7<=39)) ) {
                            alt8=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 7, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA8_6==RULE_STRING) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_INT:
            case 15:
            case 25:
            case 28:
            case 32:
            case 37:
            case 38:
            case 39:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:602:5: this_DefineVariable_0= ruleDefineVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDefineVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_ruleStatement1268);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:612:5: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleStatement1295);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:622:5: this_PutTraceExpression_2= rulePutTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getPutTraceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_ruleStatement1322);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:632:5: this_PropertyWrite_3= rulePropertyWrite
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getPropertyWriteParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_ruleStatement1349);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:648:1: entryRulePropertyWrite returns [EObject current=null] : iv_rulePropertyWrite= rulePropertyWrite EOF ;
    public final EObject entryRulePropertyWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyWrite = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:649:2: (iv_rulePropertyWrite= rulePropertyWrite EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:650:2: iv_rulePropertyWrite= rulePropertyWrite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyWriteRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite1384);
            iv_rulePropertyWrite=rulePropertyWrite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyWrite; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyWrite1394); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:657:1: rulePropertyWrite returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyWrite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:660:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:661:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:661:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:661:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:661:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:662:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:662:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:663:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyWriteRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropertyWrite1439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPropertyWriteAccess().getReceptorVariableCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePropertyWrite1451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyWriteAccess().getFullStopKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:678:1: ( (lv_property_2_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:679:1: (lv_property_2_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:679:1: (lv_property_2_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:680:3: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropertyWrite1468); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePropertyWrite1485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropertyWriteAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:700:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:701:1: (lv_expression_4_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:701:1: (lv_expression_4_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:702:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyWriteAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePropertyWrite1506);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:726:1: entryRuleDefineVariable returns [EObject current=null] : iv_ruleDefineVariable= ruleDefineVariable EOF ;
    public final EObject entryRuleDefineVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineVariable = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:727:2: (iv_ruleDefineVariable= ruleDefineVariable EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:728:2: iv_ruleDefineVariable= ruleDefineVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable1542);
            iv_ruleDefineVariable=ruleDefineVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefineVariable1552); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:735:1: ruleDefineVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleDefineVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:738:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:739:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:739:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:739:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:739:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:740:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:740:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:741:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineVariableAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDefineVariable1598);
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

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDefineVariable1610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefineVariableAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:761:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:762:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:762:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:763:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDefineVariable1631);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:787:1: entryRuleModelReference returns [EObject current=null] : iv_ruleModelReference= ruleModelReference EOF ;
    public final EObject entryRuleModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelReference = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:788:2: (iv_ruleModelReference= ruleModelReference EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:789:2: iv_ruleModelReference= ruleModelReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_entryRuleModelReference1667);
            iv_ruleModelReference=ruleModelReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelReference1677); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:796:1: ruleModelReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) ;
    public final EObject ruleModelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:799:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:800:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:800:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:800:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '!' ( (lv_className_2_0= ruleEString ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:800:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:801:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:801:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:802:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getModelReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModelReference1722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getModelReferenceAccess().getModelRepresentModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleModelReference1734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelReferenceAccess().getExclamationMarkKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:817:1: ( (lv_className_2_0= ruleEString ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:818:1: (lv_className_2_0= ruleEString )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:818:1: (lv_className_2_0= ruleEString )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:819:3: lv_className_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelReferenceAccess().getClassNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModelReference1755);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:843:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:844:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:845:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1791);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1801); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:852:1: ruleExpression returns [EObject current=null] : this_MethodCall_0= ruleMethodCall ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MethodCall_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:855:28: (this_MethodCall_0= ruleMethodCall )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:857:5: this_MethodCall_0= ruleMethodCall
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getMethodCallParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_ruleExpression1847);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:873:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:874:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:875:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1881);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression1891); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:882:1: rulePrimaryExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration | this_IfExpr_6= ruleIfExpr ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_VariableReference_1 = null;

        EObject this_ModelReference_2 = null;

        EObject this_ParenthesizedExpression_3 = null;

        EObject this_MatchTraceExpression_4 = null;

        EObject this_ClosureDeclaration_5 = null;

        EObject this_IfExpr_6 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:885:28: ( (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration | this_IfExpr_6= ruleIfExpr ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:886:1: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration | this_IfExpr_6= ruleIfExpr )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:886:1: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ModelReference_2= ruleModelReference | this_ParenthesizedExpression_3= ruleParenthesizedExpression | this_MatchTraceExpression_4= ruleMatchTraceExpression | this_ClosureDeclaration_5= ruleClosureDeclaration | this_IfExpr_6= ruleIfExpr )
            int alt9=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 37:
            case 38:
            case 39:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==20) ) {
                    alt9=3;
                }
                else if ( (LA9_2==EOF||(LA9_2>=RULE_ID && LA9_2<=RULE_STRING)||LA9_2==13||LA9_2==15||LA9_2==17||LA9_2==23||(LA9_2>=25 && LA9_2<=29)||(LA9_2>=31 && LA9_2<=32)||(LA9_2>=35 && LA9_2<=42)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            case 32:
                {
                alt9=5;
                }
                break;
            case 15:
                {
                alt9=6;
                }
                break;
            case 25:
                {
                alt9=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:887:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rulePrimaryExpression1938);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:897:5: this_VariableReference_1= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rulePrimaryExpression1965);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:907:5: this_ModelReference_2= ruleModelReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getModelReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModelReference_in_rulePrimaryExpression1992);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:917:5: this_ParenthesizedExpression_3= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2019);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:927:5: this_MatchTraceExpression_4= ruleMatchTraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMatchTraceExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_rulePrimaryExpression2046);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:937:5: this_ClosureDeclaration_5= ruleClosureDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getClosureDeclarationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_rulePrimaryExpression2073);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:947:5: this_IfExpr_6= ruleIfExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIfExprParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpr_in_rulePrimaryExpression2100);
                    this_IfExpr_6=ruleIfExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExpr_6; 
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


    // $ANTLR start "entryRuleIfExpr"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:963:1: entryRuleIfExpr returns [EObject current=null] : iv_ruleIfExpr= ruleIfExpr EOF ;
    public final EObject entryRuleIfExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpr = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:964:2: (iv_ruleIfExpr= ruleIfExpr EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:965:2: iv_ruleIfExpr= ruleIfExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpr_in_entryRuleIfExpr2135);
            iv_ruleIfExpr=ruleIfExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpr2145); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpr"


    // $ANTLR start "ruleIfExpr"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:972:1: ruleIfExpr returns [EObject current=null] : (otherlv_0= 'if' ( (lv_then_1_0= ruleConditionBranch ) ) (otherlv_2= 'elsif' ( (lv_elsifs_3_0= ruleConditionBranch ) ) )* (otherlv_4= 'else' ( (lv_else_5_0= ruleBranchBranch ) ) )? otherlv_6= 'end' ) ;
    public final EObject ruleIfExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_then_1_0 = null;

        EObject lv_elsifs_3_0 = null;

        EObject lv_else_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:975:28: ( (otherlv_0= 'if' ( (lv_then_1_0= ruleConditionBranch ) ) (otherlv_2= 'elsif' ( (lv_elsifs_3_0= ruleConditionBranch ) ) )* (otherlv_4= 'else' ( (lv_else_5_0= ruleBranchBranch ) ) )? otherlv_6= 'end' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:976:1: (otherlv_0= 'if' ( (lv_then_1_0= ruleConditionBranch ) ) (otherlv_2= 'elsif' ( (lv_elsifs_3_0= ruleConditionBranch ) ) )* (otherlv_4= 'else' ( (lv_else_5_0= ruleBranchBranch ) ) )? otherlv_6= 'end' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:976:1: (otherlv_0= 'if' ( (lv_then_1_0= ruleConditionBranch ) ) (otherlv_2= 'elsif' ( (lv_elsifs_3_0= ruleConditionBranch ) ) )* (otherlv_4= 'else' ( (lv_else_5_0= ruleBranchBranch ) ) )? otherlv_6= 'end' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:976:3: otherlv_0= 'if' ( (lv_then_1_0= ruleConditionBranch ) ) (otherlv_2= 'elsif' ( (lv_elsifs_3_0= ruleConditionBranch ) ) )* (otherlv_4= 'else' ( (lv_else_5_0= ruleBranchBranch ) ) )? otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIfExpr2182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExprAccess().getIfKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:980:1: ( (lv_then_1_0= ruleConditionBranch ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:981:1: (lv_then_1_0= ruleConditionBranch )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:981:1: (lv_then_1_0= ruleConditionBranch )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:982:3: lv_then_1_0= ruleConditionBranch
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExprAccess().getThenConditionBranchParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionBranch_in_ruleIfExpr2203);
            lv_then_1_0=ruleConditionBranch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExprRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_1_0, 
                      		"ConditionBranch");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:998:2: (otherlv_2= 'elsif' ( (lv_elsifs_3_0= ruleConditionBranch ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:998:4: otherlv_2= 'elsif' ( (lv_elsifs_3_0= ruleConditionBranch ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleIfExpr2216); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getIfExprAccess().getElsifKeyword_2_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1002:1: ( (lv_elsifs_3_0= ruleConditionBranch ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1003:1: (lv_elsifs_3_0= ruleConditionBranch )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1003:1: (lv_elsifs_3_0= ruleConditionBranch )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1004:3: lv_elsifs_3_0= ruleConditionBranch
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfExprAccess().getElsifsConditionBranchParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleConditionBranch_in_ruleIfExpr2237);
            	    lv_elsifs_3_0=ruleConditionBranch();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfExprRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elsifs",
            	              		lv_elsifs_3_0, 
            	              		"ConditionBranch");
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1020:4: (otherlv_4= 'else' ( (lv_else_5_0= ruleBranchBranch ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1020:6: otherlv_4= 'else' ( (lv_else_5_0= ruleBranchBranch ) )
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleIfExpr2252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIfExprAccess().getElseKeyword_3_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1024:1: ( (lv_else_5_0= ruleBranchBranch ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1025:1: (lv_else_5_0= ruleBranchBranch )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1025:1: (lv_else_5_0= ruleBranchBranch )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1026:3: lv_else_5_0= ruleBranchBranch
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExprAccess().getElseBranchBranchParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBranchBranch_in_ruleIfExpr2273);
                    lv_else_5_0=ruleBranchBranch();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExprRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_5_0, 
                              		"BranchBranch");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleIfExpr2287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIfExprAccess().getEndKeyword_4());
                  
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
    // $ANTLR end "ruleIfExpr"


    // $ANTLR start "entryRuleConditionBranch"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1054:1: entryRuleConditionBranch returns [EObject current=null] : iv_ruleConditionBranch= ruleConditionBranch EOF ;
    public final EObject entryRuleConditionBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionBranch = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1055:2: (iv_ruleConditionBranch= ruleConditionBranch EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1056:2: iv_ruleConditionBranch= ruleConditionBranch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionBranchRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionBranch_in_entryRuleConditionBranch2323);
            iv_ruleConditionBranch=ruleConditionBranch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionBranch; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditionBranch2333); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionBranch"


    // $ANTLR start "ruleConditionBranch"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1063:1: ruleConditionBranch returns [EObject current=null] : ( ( (lv_condition_0_0= ruleExpression ) ) ( (lv_statements_1_0= ruleStatement ) )+ ) ;
    public final EObject ruleConditionBranch() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_0_0 = null;

        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1066:28: ( ( ( (lv_condition_0_0= ruleExpression ) ) ( (lv_statements_1_0= ruleStatement ) )+ ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1067:1: ( ( (lv_condition_0_0= ruleExpression ) ) ( (lv_statements_1_0= ruleStatement ) )+ )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1067:1: ( ( (lv_condition_0_0= ruleExpression ) ) ( (lv_statements_1_0= ruleStatement ) )+ )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1067:2: ( (lv_condition_0_0= ruleExpression ) ) ( (lv_statements_1_0= ruleStatement ) )+
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1067:2: ( (lv_condition_0_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1068:1: (lv_condition_0_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1068:1: (lv_condition_0_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1069:3: lv_condition_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionBranchAccess().getConditionExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleConditionBranch2379);
            lv_condition_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionBranchRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1085:2: ( (lv_statements_1_0= ruleStatement ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||LA12_0==15||LA12_0==25||LA12_0==28||LA12_0==32||(LA12_0>=36 && LA12_0<=39)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1086:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1086:1: (lv_statements_1_0= ruleStatement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1087:3: lv_statements_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionBranchAccess().getStatementsStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleConditionBranch2400);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionBranchRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleConditionBranch"


    // $ANTLR start "entryRuleBranchBranch"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1111:1: entryRuleBranchBranch returns [EObject current=null] : iv_ruleBranchBranch= ruleBranchBranch EOF ;
    public final EObject entryRuleBranchBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchBranch = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1112:2: (iv_ruleBranchBranch= ruleBranchBranch EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1113:2: iv_ruleBranchBranch= ruleBranchBranch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBranchBranchRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBranchBranch_in_entryRuleBranchBranch2437);
            iv_ruleBranchBranch=ruleBranchBranch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBranchBranch; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBranchBranch2447); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranchBranch"


    // $ANTLR start "ruleBranchBranch"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1120:1: ruleBranchBranch returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleBranchBranch() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1123:28: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1124:1: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1124:1: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||LA13_0==15||LA13_0==25||LA13_0==28||LA13_0==32||(LA13_0>=36 && LA13_0<=39)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1125:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1125:1: (lv_statements_0_0= ruleStatement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1126:3: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBranchBranchAccess().getStatementsStatementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleBranchBranch2492);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBranchBranchRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_0_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleBranchBranch"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1150:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1151:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1152:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression2528);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedExpression2538); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1159:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1162:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1163:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1163:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1163:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleParenthesizedExpression2575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParenthesizedExpression2597);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleParenthesizedExpression2608); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1188:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1189:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1190:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral2644);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral2654); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1197:1: ruleLiteral returns [EObject current=null] : (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_FloatLiteral_0 = null;

        EObject this_NumLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1200:28: ( (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1201:1: (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1201:1: (this_FloatLiteral_0= ruleFloatLiteral | this_NumLiteral_1= ruleNumLiteral | this_StringLiteral_2= ruleStringLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==23) ) {
                    int LA14_5 = input.LA(3);

                    if ( (LA14_5==RULE_ID||LA14_5==RULE_STRING) ) {
                        alt14=2;
                    }
                    else if ( (LA14_5==RULE_INT) ) {
                        alt14=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA14_1==EOF||(LA14_1>=RULE_ID && LA14_1<=RULE_STRING)||LA14_1==13||LA14_1==15||LA14_1==17||(LA14_1>=25 && LA14_1<=29)||(LA14_1>=31 && LA14_1<=32)||(LA14_1>=35 && LA14_1<=42)) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt14=2;
                }
                break;
            case RULE_STRING:
                {
                alt14=3;
                }
                break;
            case 38:
            case 39:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1202:5: this_FloatLiteral_0= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_ruleLiteral2701);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1212:5: this_NumLiteral_1= ruleNumLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_ruleLiteral2728);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1222:5: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleLiteral2755);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1232:5: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_ruleLiteral2782);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1248:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1249:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1250:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference2817);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference2827); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1257:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1260:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1261:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1261:1: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1262:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1262:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1263:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableReference2871); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1282:1: entryRuleClosureDeclaration returns [EObject current=null] : iv_ruleClosureDeclaration= ruleClosureDeclaration EOF ;
    public final EObject entryRuleClosureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureDeclaration = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1283:2: (iv_ruleClosureDeclaration= ruleClosureDeclaration EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1284:2: iv_ruleClosureDeclaration= ruleClosureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClosureDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration2906);
            iv_ruleClosureDeclaration=ruleClosureDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClosureDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureDeclaration2916); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1291:1: ruleClosureDeclaration returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1294:28: ( (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1295:1: (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1295:1: (otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1295:3: otherlv_0= '{' (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )? ( (lv_statements_6_0= ruleStatement ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClosureDeclaration2953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClosureDeclarationAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1299:1: (otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1299:3: otherlv_1= '|' ( (lv_formalParameters_2_0= ruleClosureParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )* otherlv_5= '|'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleClosureDeclaration2966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1303:1: ( (lv_formalParameters_2_0= ruleClosureParameter ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1304:1: (lv_formalParameters_2_0= ruleClosureParameter )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1304:1: (lv_formalParameters_2_0= ruleClosureParameter )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1305:3: lv_formalParameters_2_0= ruleClosureParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration2987);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1321:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==31) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1321:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleClosureParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleClosureDeclaration3000); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getClosureDeclarationAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1325:1: ( (lv_formalParameters_4_0= ruleClosureParameter ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1326:1: (lv_formalParameters_4_0= ruleClosureParameter )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1326:1: (lv_formalParameters_4_0= ruleClosureParameter )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1327:3: lv_formalParameters_4_0= ruleClosureParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getFormalParametersClosureParameterParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration3021);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleClosureDeclaration3035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClosureDeclarationAccess().getVerticalLineKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1347:3: ( (lv_statements_6_0= ruleStatement ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)||LA17_0==15||LA17_0==25||LA17_0==28||LA17_0==32||(LA17_0>=36 && LA17_0<=39)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1348:1: (lv_statements_6_0= ruleStatement )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1348:1: (lv_statements_6_0= ruleStatement )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1349:3: lv_statements_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClosureDeclarationAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleClosureDeclaration3058);
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
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClosureDeclaration3071); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1377:1: entryRuleClosureParameter returns [EObject current=null] : iv_ruleClosureParameter= ruleClosureParameter EOF ;
    public final EObject entryRuleClosureParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1378:2: (iv_ruleClosureParameter= ruleClosureParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1379:2: iv_ruleClosureParameter= ruleClosureParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClosureParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter3107);
            iv_ruleClosureParameter=ruleClosureParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClosureParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClosureParameter3117); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1386:1: ruleClosureParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleClosureParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1389:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1390:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1390:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1391:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1391:1: (lv_name_0_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1392:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClosureParameter3158); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1416:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1417:2: (iv_ruleMethodCall= ruleMethodCall EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1418:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodCall_in_entryRuleMethodCall3198);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodCall3208); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1425:1: ruleMethodCall returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1428:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1429:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1429:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )? )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1430:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMethodCallAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleMethodCall3255);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1438:1: ( ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) ) | ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+ )?
            int alt22=3;
            switch ( input.LA(1) ) {
                case 40:
                case 41:
                case 42:
                    {
                    alt22=1;
                    }
                    break;
                case 37:
                    {
                    int LA22_2 = input.LA(2);

                    if ( ((LA22_2>=RULE_ID && LA22_2<=RULE_STRING)||LA22_2==15||LA22_2==25||LA22_2==28||LA22_2==32||(LA22_2>=37 && LA22_2<=39)) ) {
                        alt22=1;
                    }
                    }
                    break;
                case 23:
                    {
                    alt22=2;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1438:2: ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1438:2: ( () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1438:3: () ( (lv_binaryOp_2_0= ruleBinaryOp ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1438:3: ()
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1439:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getMethodCallAccess().getBinaryExprLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1444:2: ( (lv_binaryOp_2_0= ruleBinaryOp ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1445:1: (lv_binaryOp_2_0= ruleBinaryOp )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1445:1: (lv_binaryOp_2_0= ruleBinaryOp )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1446:3: lv_binaryOp_2_0= ruleBinaryOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodCallAccess().getBinaryOpBinaryOpEnumRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOp_in_ruleMethodCall3286);
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

                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1462:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1463:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1463:1: (lv_right_3_0= ruleExpression )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1464:3: lv_right_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodCallAccess().getRightExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall3307);
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
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1481:6: ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1481:6: ( ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )? )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==23) && (synpred1_InternalExpressions())) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1481:7: ( ( () )=> () ) otherlv_5= '.' ( (lv_methodName_6_0= ruleEString ) ) ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ( (lv_parameters_12_0= ruleClosureDeclaration ) )?
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1481:7: ( ( () )=> () )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1481:8: ( () )=> ()
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1482:5: ()
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1483:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getMethodCallAccess().getMethodCallReceptorAction_1_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }


                    	    }

                    	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMethodCall3344); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getMethodCallAccess().getFullStopKeyword_1_1_1());
                    	          
                    	    }
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1492:1: ( (lv_methodName_6_0= ruleEString ) )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1493:1: (lv_methodName_6_0= ruleEString )
                    	    {
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1493:1: (lv_methodName_6_0= ruleEString )
                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1494:3: lv_methodName_6_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodCallAccess().getMethodNameEStringParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMethodCall3365);
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

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1510:2: ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )?
                    	    int alt19=2;
                    	    alt19 = dfa19.predict(input);
                    	    switch (alt19) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1510:3: ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')'
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1510:3: ( (lv_withParameters_7_0= '(' ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1511:1: (lv_withParameters_7_0= '(' )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1511:1: (lv_withParameters_7_0= '(' )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1512:3: lv_withParameters_7_0= '('
                    	            {
                    	            lv_withParameters_7_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMethodCall3384); if (state.failed) return current;
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

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1525:2: ( (lv_parameters_8_0= ruleExpression ) )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1526:1: (lv_parameters_8_0= ruleExpression )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1526:1: (lv_parameters_8_0= ruleExpression )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1527:3: lv_parameters_8_0= ruleExpression
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall3418);
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

                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1543:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )*
                    	            loop18:
                    	            do {
                    	                int alt18=2;
                    	                int LA18_0 = input.LA(1);

                    	                if ( (LA18_0==31) ) {
                    	                    alt18=1;
                    	                }


                    	                switch (alt18) {
                    	            	case 1 :
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1543:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) )
                    	            	    {
                    	            	    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMethodCall3431); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	          	newLeafNode(otherlv_9, grammarAccess.getMethodCallAccess().getCommaKeyword_1_1_3_2_0());
                    	            	          
                    	            	    }
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1547:1: ( (lv_parameters_10_0= ruleExpression ) )
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1548:1: (lv_parameters_10_0= ruleExpression )
                    	            	    {
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1548:1: (lv_parameters_10_0= ruleExpression )
                    	            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1549:3: lv_parameters_10_0= ruleExpression
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {
                    	            	       
                    	            	      	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersExpressionParserRuleCall_1_1_3_2_1_0()); 
                    	            	      	    
                    	            	    }
                    	            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodCall3452);
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
                    	            	    break loop18;
                    	                }
                    	            } while (true);

                    	            otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMethodCall3466); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_11, grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_1_1_3_3());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1569:3: ( (lv_parameters_12_0= ruleClosureDeclaration ) )?
                    	    int alt20=2;
                    	    alt20 = dfa20.predict(input);
                    	    switch (alt20) {
                    	        case 1 :
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1570:1: (lv_parameters_12_0= ruleClosureDeclaration )
                    	            {
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1570:1: (lv_parameters_12_0= ruleClosureDeclaration )
                    	            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1571:3: lv_parameters_12_0= ruleClosureDeclaration
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersClosureDeclarationParserRuleCall_1_1_4_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleClosureDeclaration_in_ruleMethodCall3489);
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
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1599:1: entryRuleMatchTraceExpression returns [EObject current=null] : iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF ;
    public final EObject entryRuleMatchTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchTraceExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1600:2: (iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1601:2: iv_ruleMatchTraceExpression= ruleMatchTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression3534);
            iv_ruleMatchTraceExpression=ruleMatchTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchTraceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatchTraceExpression3544); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1608:1: ruleMatchTraceExpression returns [EObject current=null] : (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1611:28: ( (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1612:1: (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1612:1: (otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1612:3: otherlv_0= 'match' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMatchTraceExpression3581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMatchTraceExpressionAccess().getMatchKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1616:1: (this_ID_1= RULE_ID otherlv_2= '!' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==20) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1616:2: this_ID_1= RULE_ID otherlv_2= '!'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchTraceExpression3593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getMatchTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMatchTraceExpression3604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMatchTraceExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1624:3: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1625:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1625:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1626:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMatchTraceExpressionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMatchTraceExpression3626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getMatchTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMatchTraceExpression3638); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMatchTraceExpressionAccess().getWithKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMatchTraceExpression3650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMatchTraceExpressionAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1645:1: ( (lv_traceExpr_6_0= ruleTraceExprLanguage ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1646:1: (lv_traceExpr_6_0= ruleTraceExprLanguage )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1646:1: (lv_traceExpr_6_0= ruleTraceExprLanguage )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1647:3: lv_traceExpr_6_0= ruleTraceExprLanguage
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMatchTraceExpressionAccess().getTraceExprTraceExprLanguageParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_ruleMatchTraceExpression3671);
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

            otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMatchTraceExpression3683); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1675:1: entryRuleTraceExprLanguage returns [EObject current=null] : iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF ;
    public final EObject entryRuleTraceExprLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceExprLanguage = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1676:2: (iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1677:2: iv_ruleTraceExprLanguage= ruleTraceExprLanguage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceExprLanguageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage3719);
            iv_ruleTraceExprLanguage=ruleTraceExprLanguage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceExprLanguage; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraceExprLanguage3729); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1684:1: ruleTraceExprLanguage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleTraceExprLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1687:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1688:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1688:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1688:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1688:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1689:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1689:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1690:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTraceExprLanguageRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraceExprLanguage3774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getTraceExprLanguageAccess().getTraceVarTraceElementCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTraceExprLanguage3786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceExprLanguageAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1705:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1706:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1706:1: (lv_expr_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1707:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTraceExprLanguageAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTraceExprLanguage3807);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1731:1: entryRulePutTraceExpression returns [EObject current=null] : iv_rulePutTraceExpression= rulePutTraceExpression EOF ;
    public final EObject entryRulePutTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutTraceExpression = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1732:2: (iv_rulePutTraceExpression= rulePutTraceExpression EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1733:2: iv_rulePutTraceExpression= rulePutTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPutTraceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression3843);
            iv_rulePutTraceExpression=rulePutTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePutTraceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceExpression3853); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1740:1: rulePutTraceExpression returns [EObject current=null] : (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' ) ;
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
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1743:28: ( (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1744:1: (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1744:1: (otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']' )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1744:3: otherlv_0= 'put' (this_ID_1= RULE_ID otherlv_2= '!' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= '[' ( (lv_parameters_6_0= rulePutTraceParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+ otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePutTraceExpression3890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPutTraceExpressionAccess().getPutKeyword_0());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1748:1: (this_ID_1= RULE_ID otherlv_2= '!' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==20) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1748:2: this_ID_1= RULE_ID otherlv_2= '!'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceExpression3902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getPutTraceExpressionAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePutTraceExpression3913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPutTraceExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1756:3: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1757:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1757:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1758:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPutTraceExpressionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceExpression3935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getPutTraceExpressionAccess().getTraceTraceDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulePutTraceExpression3947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPutTraceExpressionAccess().getWithKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePutTraceExpression3959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPutTraceExpressionAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1777:1: ( (lv_parameters_6_0= rulePutTraceParameter ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1778:1: (lv_parameters_6_0= rulePutTraceParameter )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1778:1: (lv_parameters_6_0= rulePutTraceParameter )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1779:3: lv_parameters_6_0= rulePutTraceParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression3980);
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

            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1795:2: (otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1795:4: otherlv_7= ',' ( (lv_parameters_8_0= rulePutTraceParameter ) )
            	    {
            	    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePutTraceExpression3993); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getPutTraceExpressionAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1799:1: ( (lv_parameters_8_0= rulePutTraceParameter ) )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1800:1: (lv_parameters_8_0= rulePutTraceParameter )
            	    {
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1800:1: (lv_parameters_8_0= rulePutTraceParameter )
            	    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1801:3: lv_parameters_8_0= rulePutTraceParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPutTraceExpressionAccess().getParametersPutTraceParameterParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression4014);
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
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_35_in_rulePutTraceExpression4028); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1829:1: entryRulePutTraceParameter returns [EObject current=null] : iv_rulePutTraceParameter= rulePutTraceParameter EOF ;
    public final EObject entryRulePutTraceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutTraceParameter = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1830:2: (iv_rulePutTraceParameter= rulePutTraceParameter EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1831:2: iv_rulePutTraceParameter= rulePutTraceParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPutTraceParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter4064);
            iv_rulePutTraceParameter=rulePutTraceParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePutTraceParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePutTraceParameter4074); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1838:1: rulePutTraceParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePutTraceParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1841:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1842:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1842:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1842:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1842:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1843:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1843:1: (otherlv_0= RULE_ID )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1844:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPutTraceParameterRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePutTraceParameter4119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPutTraceParameterAccess().getTraceVarTraceElementCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePutTraceParameter4131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPutTraceParameterAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1859:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1860:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1860:1: (lv_value_2_0= ruleExpression )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1861:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPutTraceParameterAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePutTraceParameter4152);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1885:1: entryRuleNumLiteral returns [EObject current=null] : iv_ruleNumLiteral= ruleNumLiteral EOF ;
    public final EObject entryRuleNumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1886:2: (iv_ruleNumLiteral= ruleNumLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1887:2: iv_ruleNumLiteral= ruleNumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral4188);
            iv_ruleNumLiteral=ruleNumLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumLiteral4198); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1894:1: ruleNumLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1897:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1898:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1898:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1899:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1899:1: (lv_value_0_0= ruleEInt )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1900:3: lv_value_0_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumLiteralAccess().getValueEIntParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumLiteral4243);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1924:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1925:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1926:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral4278);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatLiteral4288); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1933:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1936:28: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1937:1: ( (lv_value_0_0= ruleEDouble ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1937:1: ( (lv_value_0_0= ruleEDouble ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1938:1: (lv_value_0_0= ruleEDouble )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1938:1: (lv_value_0_0= ruleEDouble )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1939:3: lv_value_0_0= ruleEDouble
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFloatLiteralAccess().getValueEDoubleParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleFloatLiteral4333);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1963:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1964:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1965:2: iv_ruleEDouble= ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble4369);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDouble.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble4380); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1972:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1975:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1976:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1976:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1976:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble4420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEDouble4438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble4453); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2004:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2005:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2006:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral4498);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral4508); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2013:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2016:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2017:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2017:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2018:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2018:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2019:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringLiteral4549); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2043:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2044:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2045:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4589);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteral4599); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2052:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2055:28: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2056:1: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2056:1: ( (lv_value_0_0= ruleEBoolean ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2057:1: (lv_value_0_0= ruleEBoolean )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2057:1: (lv_value_0_0= ruleEBoolean )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2058:3: lv_value_0_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLiteralAccess().getValueEBooleanParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleBooleanLiteral4644);
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2082:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2083:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2084:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString4680);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString4691); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2091:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2094:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2095:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2095:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2095:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString4731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2103:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString4757); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2118:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2119:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2120:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4803);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4814); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2127:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2130:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2131:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2131:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2131:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2131:2: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2132:2: kw= '-'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEInt4853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4870); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2152:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2153:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2154:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean4916);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean4927); if (state.failed) return current;

            }

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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2161:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2164:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2165:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2165:1: (kw= 'true' | kw= 'false' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            else if ( (LA28_0==39) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2166:2: kw= 'true'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEBoolean4965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2173:2: kw= 'false'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEBoolean4984); if (state.failed) return current;
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
    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2188:1: ruleBinaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleBinaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2190:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2191:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2191:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt29=1;
                }
                break;
            case 37:
                {
                alt29=2;
                }
                break;
            case 41:
                {
                alt29=3;
                }
                break;
            case 42:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2191:2: (enumLiteral_0= '+' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2191:2: (enumLiteral_0= '+' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2191:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleBinaryOp5040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBinaryOpAccess().getADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2197:6: (enumLiteral_1= '-' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2197:6: (enumLiteral_1= '-' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2197:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBinaryOp5057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBinaryOpAccess().getSUBEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2203:6: (enumLiteral_2= '*' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2203:6: (enumLiteral_2= '*' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2203:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleBinaryOp5074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBinaryOpAccess().getMULEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2209:6: (enumLiteral_3= '/' )
                    {
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2209:6: (enumLiteral_3= '/' )
                    // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:2209:8: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleBinaryOp5091); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalExpressions
    public final void synpred1_InternalExpressions_fragment() throws RecognitionException {   
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1481:8: ( () )
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1481:9: ()
        {
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1481:9: ()
        // ../org.eclectic.frontend.syntax/src-gen/org/eclectic/frontend/syntax/parser/antlr/internal/InternalExpressions.g:1482:1: 
        {
        }


        }
    }
    // $ANTLR end synpred1_InternalExpressions

    // Delegated rules

    public final boolean synpred1_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA19_eotS =
        "\25\uffff";
    static final String DFA19_eofS =
        "\1\2\24\uffff";
    static final String DFA19_minS =
        "\1\4\24\uffff";
    static final String DFA19_maxS =
        "\1\47\24\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\2\22\uffff";
    static final String DFA19_specialS =
        "\25\uffff}>";
    static final String[] DFA19_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff\1\2\5\uffff\1\2\1\uffff"+
            "\3\2\1\1\1\2\1\uffff\2\2\2\uffff\5\2",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1510:2: ( ( (lv_withParameters_7_0= '(' ) ) ( (lv_parameters_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleExpression ) ) )* otherlv_11= ')' )?";
        }
    }
    static final String DFA20_eotS =
        "\25\uffff";
    static final String DFA20_eofS =
        "\1\2\24\uffff";
    static final String DFA20_minS =
        "\1\4\24\uffff";
    static final String DFA20_maxS =
        "\1\47\24\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\22\uffff";
    static final String DFA20_specialS =
        "\25\uffff}>";
    static final String[] DFA20_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\1\1\1\uffff\1\2\5\uffff\1\2\1\uffff"+
            "\5\2\1\uffff\2\2\2\uffff\5\2",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1569:3: ( (lv_parameters_12_0= ruleClosureDeclaration ) )?";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTraceInterface_in_entryRuleTraceInterface75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceInterface85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleTraceInterface122 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceInterface143 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_ruleTraceInterface164 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleTraceInterface177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceDefinition_in_entryRuleTraceDefinition213 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceDefinition223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleTraceDefinition260 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceDefinition281 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_15_in_ruleTraceDefinition295 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition316 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleTraceDefinition329 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_ruleTraceDefinition350 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleTraceDefinition364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition393 = new BitSet(new long[]{0x000000000008A000L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_ruleTraceDefinition414 = new BitSet(new long[]{0x000000000008A000L});
        public static final BitSet FOLLOW_13_in_ruleTraceDefinition427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementInline_in_entryRuleTraceElementInline465 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementInline475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceElementInline521 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTraceElementInline533 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleTraceElementInline554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceElementExpanded_in_entryRuleTraceElementExpanded590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceElementExpanded600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleTraceElementExpanded637 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTraceElementExpanded658 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTraceElementExpanded670 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_ruleTraceElementExpanded691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpression_in_entryRuleTypeExpression727 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpression737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_ruleTypeExpression783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassUse_in_entryRuleClassUse817 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassUse827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassUse872 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleClassUse884 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassUse901 = new BitSet(new long[]{0x0000000000700002L});
        public static final BitSet FOLLOW_ruleSingleAnnotation_in_ruleClassUse927 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleClassUse946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleAnnotation_in_entryRuleSingleAnnotation996 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleAnnotation1006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePotencyAnnotation_in_ruleSingleAnnotation1052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePotencyAnnotation_in_entryRulePotencyAnnotation1086 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePotencyAnnotation1096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rulePotencyAnnotation1134 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_22_in_rulePotencyAnnotation1152 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_rulePotencyAnnotation1170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatement1221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_ruleStatement1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleStatement1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_ruleStatement1322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_ruleStatement1349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyWrite_in_entryRulePropertyWrite1384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyWrite1394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropertyWrite1439 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_rulePropertyWrite1451 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropertyWrite1468 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulePropertyWrite1485 = new BitSet(new long[]{0x000000E112008070L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePropertyWrite1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefineVariable_in_entryRuleDefineVariable1542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefineVariable1552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDefineVariable1598 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleDefineVariable1610 = new BitSet(new long[]{0x000000E112008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDefineVariable1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference1667 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelReference1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModelReference1722 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleModelReference1734 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModelReference1755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1791 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_ruleExpression1847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1881 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression1938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rulePrimaryExpression1965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelReference_in_rulePrimaryExpression1992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_rulePrimaryExpression2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_rulePrimaryExpression2073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpr_in_rulePrimaryExpression2100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpr_in_entryRuleIfExpr2135 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpr2145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleIfExpr2182 = new BitSet(new long[]{0x000000E112008070L});
        public static final BitSet FOLLOW_ruleConditionBranch_in_ruleIfExpr2203 = new BitSet(new long[]{0x000000000C002000L});
        public static final BitSet FOLLOW_26_in_ruleIfExpr2216 = new BitSet(new long[]{0x000000E112008070L});
        public static final BitSet FOLLOW_ruleConditionBranch_in_ruleIfExpr2237 = new BitSet(new long[]{0x000000000C002000L});
        public static final BitSet FOLLOW_27_in_ruleIfExpr2252 = new BitSet(new long[]{0x000000F112008070L});
        public static final BitSet FOLLOW_ruleBranchBranch_in_ruleIfExpr2273 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleIfExpr2287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionBranch_in_entryRuleConditionBranch2323 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditionBranch2333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleConditionBranch2379 = new BitSet(new long[]{0x000000F112008070L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleConditionBranch2400 = new BitSet(new long[]{0x000000F112008072L});
        public static final BitSet FOLLOW_ruleBranchBranch_in_entryRuleBranchBranch2437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBranchBranch2447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleBranchBranch2492 = new BitSet(new long[]{0x000000F112008072L});
        public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression2528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression2538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleParenthesizedExpression2575 = new BitSet(new long[]{0x000000E112008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression2597 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleParenthesizedExpression2608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2644 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral2701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_ruleLiteral2728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral2755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral2782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference2817 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference2827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference2871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_entryRuleClosureDeclaration2906 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureDeclaration2916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleClosureDeclaration2953 = new BitSet(new long[]{0x000000F152008070L});
        public static final BitSet FOLLOW_30_in_ruleClosureDeclaration2966 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration2987 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_31_in_ruleClosureDeclaration3000 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_ruleClosureDeclaration3021 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleClosureDeclaration3035 = new BitSet(new long[]{0x000000F112008070L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleClosureDeclaration3058 = new BitSet(new long[]{0x000000F112028070L});
        public static final BitSet FOLLOW_17_in_ruleClosureDeclaration3071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClosureParameter_in_entryRuleClosureParameter3107 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClosureParameter3117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClosureParameter3158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall3198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall3208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMethodCall3255 = new BitSet(new long[]{0x0000072000800002L});
        public static final BitSet FOLLOW_ruleBinaryOp_in_ruleMethodCall3286 = new BitSet(new long[]{0x000000E112008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall3307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleMethodCall3344 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMethodCall3365 = new BitSet(new long[]{0x0000000010808002L});
        public static final BitSet FOLLOW_28_in_ruleMethodCall3384 = new BitSet(new long[]{0x000000E112008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall3418 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_31_in_ruleMethodCall3431 = new BitSet(new long[]{0x000000E112008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodCall3452 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleMethodCall3466 = new BitSet(new long[]{0x0000000000808002L});
        public static final BitSet FOLLOW_ruleClosureDeclaration_in_ruleMethodCall3489 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_ruleMatchTraceExpression_in_entryRuleMatchTraceExpression3534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatchTraceExpression3544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleMatchTraceExpression3581 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchTraceExpression3593 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMatchTraceExpression3604 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMatchTraceExpression3626 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMatchTraceExpression3638 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMatchTraceExpression3650 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_ruleMatchTraceExpression3671 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleMatchTraceExpression3683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraceExprLanguage_in_entryRuleTraceExprLanguage3719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraceExprLanguage3729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraceExprLanguage3774 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTraceExprLanguage3786 = new BitSet(new long[]{0x000000E112008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTraceExprLanguage3807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceExpression_in_entryRulePutTraceExpression3843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceExpression3853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePutTraceExpression3890 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceExpression3902 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_rulePutTraceExpression3913 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceExpression3935 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulePutTraceExpression3947 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulePutTraceExpression3959 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression3980 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_rulePutTraceExpression3993 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_rulePutTraceExpression4014 = new BitSet(new long[]{0x0000000880000000L});
        public static final BitSet FOLLOW_35_in_rulePutTraceExpression4028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePutTraceParameter_in_entryRulePutTraceParameter4064 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePutTraceParameter4074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePutTraceParameter4119 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulePutTraceParameter4131 = new BitSet(new long[]{0x000000E112008070L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePutTraceParameter4152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral4188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral4198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumLiteral4243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral4278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral4288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleFloatLiteral4333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble4369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble4380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble4420 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEDouble4438 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble4453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral4498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral4508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral4549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4589 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral4599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleBooleanLiteral4644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString4680 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString4691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString4731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString4757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEInt4853 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean4916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean4927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEBoolean4965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEBoolean4984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleBinaryOp5040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleBinaryOp5057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleBinaryOp5074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleBinaryOp5091 = new BitSet(new long[]{0x0000000000000002L});
    }


}