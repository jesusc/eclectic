package org.eclectic.streamdesc.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclectic.streamdesc.services.StreamDescLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStreamDescLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stream'", "'for'", "'sliding'", "'='", "'seconds'", "'secs'", "'elements'", "'key'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
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


        public InternalStreamDescLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStreamDescLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStreamDescLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g"; }



     	private StreamDescLanguageGrammarAccess grammarAccess;
     	
        public InternalStreamDescLanguageParser(TokenStream input, StreamDescLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StreamDescription";	
       	}
       	
       	@Override
       	protected StreamDescLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStreamDescription"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:67:1: entryRuleStreamDescription returns [EObject current=null] : iv_ruleStreamDescription= ruleStreamDescription EOF ;
    public final EObject entryRuleStreamDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamDescription = null;


        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:68:2: (iv_ruleStreamDescription= ruleStreamDescription EOF )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:69:2: iv_ruleStreamDescription= ruleStreamDescription EOF
            {
             newCompositeNode(grammarAccess.getStreamDescriptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStreamDescription_in_entryRuleStreamDescription75);
            iv_ruleStreamDescription=ruleStreamDescription();

            state._fsp--;

             current =iv_ruleStreamDescription; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStreamDescription85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStreamDescription"


    // $ANTLR start "ruleStreamDescription"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:76:1: ruleStreamDescription returns [EObject current=null] : (otherlv_0= 'stream' ( (lv_streamName_1_0= ruleEString ) ) otherlv_2= 'for' ( (lv_metamodelName_3_0= ruleEString ) ) ( ( (lv_keys_4_0= ruleKeySpec ) ) ( (lv_keys_5_0= ruleKeySpec ) )* )? ( ( (lv_windows_6_0= ruleSlidingWindow ) ) ( (lv_windows_7_0= ruleSlidingWindow ) )* )? ) ;
    public final EObject ruleStreamDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_streamName_1_0 = null;

        AntlrDatatypeRuleToken lv_metamodelName_3_0 = null;

        EObject lv_keys_4_0 = null;

        EObject lv_keys_5_0 = null;

        EObject lv_windows_6_0 = null;

        EObject lv_windows_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:79:28: ( (otherlv_0= 'stream' ( (lv_streamName_1_0= ruleEString ) ) otherlv_2= 'for' ( (lv_metamodelName_3_0= ruleEString ) ) ( ( (lv_keys_4_0= ruleKeySpec ) ) ( (lv_keys_5_0= ruleKeySpec ) )* )? ( ( (lv_windows_6_0= ruleSlidingWindow ) ) ( (lv_windows_7_0= ruleSlidingWindow ) )* )? ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:80:1: (otherlv_0= 'stream' ( (lv_streamName_1_0= ruleEString ) ) otherlv_2= 'for' ( (lv_metamodelName_3_0= ruleEString ) ) ( ( (lv_keys_4_0= ruleKeySpec ) ) ( (lv_keys_5_0= ruleKeySpec ) )* )? ( ( (lv_windows_6_0= ruleSlidingWindow ) ) ( (lv_windows_7_0= ruleSlidingWindow ) )* )? )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:80:1: (otherlv_0= 'stream' ( (lv_streamName_1_0= ruleEString ) ) otherlv_2= 'for' ( (lv_metamodelName_3_0= ruleEString ) ) ( ( (lv_keys_4_0= ruleKeySpec ) ) ( (lv_keys_5_0= ruleKeySpec ) )* )? ( ( (lv_windows_6_0= ruleSlidingWindow ) ) ( (lv_windows_7_0= ruleSlidingWindow ) )* )? )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:80:3: otherlv_0= 'stream' ( (lv_streamName_1_0= ruleEString ) ) otherlv_2= 'for' ( (lv_metamodelName_3_0= ruleEString ) ) ( ( (lv_keys_4_0= ruleKeySpec ) ) ( (lv_keys_5_0= ruleKeySpec ) )* )? ( ( (lv_windows_6_0= ruleSlidingWindow ) ) ( (lv_windows_7_0= ruleSlidingWindow ) )* )?
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStreamDescription122); 

                	newLeafNode(otherlv_0, grammarAccess.getStreamDescriptionAccess().getStreamKeyword_0());
                
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:84:1: ( (lv_streamName_1_0= ruleEString ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:85:1: (lv_streamName_1_0= ruleEString )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:85:1: (lv_streamName_1_0= ruleEString )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:86:3: lv_streamName_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getStreamNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStreamDescription143);
            lv_streamName_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"streamName",
                    		lv_streamName_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStreamDescription155); 

                	newLeafNode(otherlv_2, grammarAccess.getStreamDescriptionAccess().getForKeyword_2());
                
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:106:1: ( (lv_metamodelName_3_0= ruleEString ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:107:1: (lv_metamodelName_3_0= ruleEString )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:107:1: (lv_metamodelName_3_0= ruleEString )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:108:3: lv_metamodelName_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getMetamodelNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStreamDescription176);
            lv_metamodelName_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"metamodelName",
                    		lv_metamodelName_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:124:2: ( ( (lv_keys_4_0= ruleKeySpec ) ) ( (lv_keys_5_0= ruleKeySpec ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:124:3: ( (lv_keys_4_0= ruleKeySpec ) ) ( (lv_keys_5_0= ruleKeySpec ) )*
                    {
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:124:3: ( (lv_keys_4_0= ruleKeySpec ) )
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:125:1: (lv_keys_4_0= ruleKeySpec )
                    {
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:125:1: (lv_keys_4_0= ruleKeySpec )
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:126:3: lv_keys_4_0= ruleKeySpec
                    {
                     
                    	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getKeysKeySpecParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleKeySpec_in_ruleStreamDescription198);
                    lv_keys_4_0=ruleKeySpec();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
                    	        }
                           		add(
                           			current, 
                           			"keys",
                            		lv_keys_4_0, 
                            		"KeySpec");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:142:2: ( (lv_keys_5_0= ruleKeySpec ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==18) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:143:1: (lv_keys_5_0= ruleKeySpec )
                    	    {
                    	    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:143:1: (lv_keys_5_0= ruleKeySpec )
                    	    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:144:3: lv_keys_5_0= ruleKeySpec
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getKeysKeySpecParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKeySpec_in_ruleStreamDescription219);
                    	    lv_keys_5_0=ruleKeySpec();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"keys",
                    	            		lv_keys_5_0, 
                    	            		"KeySpec");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:160:5: ( ( (lv_windows_6_0= ruleSlidingWindow ) ) ( (lv_windows_7_0= ruleSlidingWindow ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:160:6: ( (lv_windows_6_0= ruleSlidingWindow ) ) ( (lv_windows_7_0= ruleSlidingWindow ) )*
                    {
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:160:6: ( (lv_windows_6_0= ruleSlidingWindow ) )
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:161:1: (lv_windows_6_0= ruleSlidingWindow )
                    {
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:161:1: (lv_windows_6_0= ruleSlidingWindow )
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:162:3: lv_windows_6_0= ruleSlidingWindow
                    {
                     
                    	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getWindowsSlidingWindowParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSlidingWindow_in_ruleStreamDescription244);
                    lv_windows_6_0=ruleSlidingWindow();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
                    	        }
                           		add(
                           			current, 
                           			"windows",
                            		lv_windows_6_0, 
                            		"SlidingWindow");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:178:2: ( (lv_windows_7_0= ruleSlidingWindow ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:179:1: (lv_windows_7_0= ruleSlidingWindow )
                    	    {
                    	    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:179:1: (lv_windows_7_0= ruleSlidingWindow )
                    	    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:180:3: lv_windows_7_0= ruleSlidingWindow
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getWindowsSlidingWindowParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSlidingWindow_in_ruleStreamDescription265);
                    	    lv_windows_7_0=ruleSlidingWindow();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"windows",
                    	            		lv_windows_7_0, 
                    	            		"SlidingWindow");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


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
    // $ANTLR end "ruleStreamDescription"


    // $ANTLR start "entryRuleSlidingWindow"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:204:1: entryRuleSlidingWindow returns [EObject current=null] : iv_ruleSlidingWindow= ruleSlidingWindow EOF ;
    public final EObject entryRuleSlidingWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlidingWindow = null;


        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:205:2: (iv_ruleSlidingWindow= ruleSlidingWindow EOF )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:206:2: iv_ruleSlidingWindow= ruleSlidingWindow EOF
            {
             newCompositeNode(grammarAccess.getSlidingWindowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlidingWindow_in_entryRuleSlidingWindow304);
            iv_ruleSlidingWindow=ruleSlidingWindow();

            state._fsp--;

             current =iv_ruleSlidingWindow; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlidingWindow314); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSlidingWindow"


    // $ANTLR start "ruleSlidingWindow"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:213:1: ruleSlidingWindow returns [EObject current=null] : (this_TimeSlidingWindow_0= ruleTimeSlidingWindow | this_ElementSlidingWindow_1= ruleElementSlidingWindow ) ;
    public final EObject ruleSlidingWindow() throws RecognitionException {
        EObject current = null;

        EObject this_TimeSlidingWindow_0 = null;

        EObject this_ElementSlidingWindow_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:216:28: ( (this_TimeSlidingWindow_0= ruleTimeSlidingWindow | this_ElementSlidingWindow_1= ruleElementSlidingWindow ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:217:1: (this_TimeSlidingWindow_0= ruleTimeSlidingWindow | this_ElementSlidingWindow_1= ruleElementSlidingWindow )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:217:1: (this_TimeSlidingWindow_0= ruleTimeSlidingWindow | this_ElementSlidingWindow_1= ruleElementSlidingWindow )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==12) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_STRING) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==14) ) {
                            int LA5_5 = input.LA(5);

                            if ( (LA5_5==RULE_INT) ) {
                                int LA5_6 = input.LA(6);

                                if ( (LA5_6==17) ) {
                                    alt5=2;
                                }
                                else if ( ((LA5_6>=15 && LA5_6<=16)) ) {
                                    alt5=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA5_2==RULE_ID) ) {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4==14) ) {
                            int LA5_5 = input.LA(5);

                            if ( (LA5_5==RULE_INT) ) {
                                int LA5_6 = input.LA(6);

                                if ( (LA5_6==17) ) {
                                    alt5=2;
                                }
                                else if ( ((LA5_6>=15 && LA5_6<=16)) ) {
                                    alt5=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:218:5: this_TimeSlidingWindow_0= ruleTimeSlidingWindow
                    {
                     
                            newCompositeNode(grammarAccess.getSlidingWindowAccess().getTimeSlidingWindowParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTimeSlidingWindow_in_ruleSlidingWindow361);
                    this_TimeSlidingWindow_0=ruleTimeSlidingWindow();

                    state._fsp--;

                     
                            current = this_TimeSlidingWindow_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:228:5: this_ElementSlidingWindow_1= ruleElementSlidingWindow
                    {
                     
                            newCompositeNode(grammarAccess.getSlidingWindowAccess().getElementSlidingWindowParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleElementSlidingWindow_in_ruleSlidingWindow388);
                    this_ElementSlidingWindow_1=ruleElementSlidingWindow();

                    state._fsp--;

                     
                            current = this_ElementSlidingWindow_1; 
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
    // $ANTLR end "ruleSlidingWindow"


    // $ANTLR start "entryRuleTimeSlidingWindow"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:244:1: entryRuleTimeSlidingWindow returns [EObject current=null] : iv_ruleTimeSlidingWindow= ruleTimeSlidingWindow EOF ;
    public final EObject entryRuleTimeSlidingWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSlidingWindow = null;


        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:245:2: (iv_ruleTimeSlidingWindow= ruleTimeSlidingWindow EOF )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:246:2: iv_ruleTimeSlidingWindow= ruleTimeSlidingWindow EOF
            {
             newCompositeNode(grammarAccess.getTimeSlidingWindowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeSlidingWindow_in_entryRuleTimeSlidingWindow423);
            iv_ruleTimeSlidingWindow=ruleTimeSlidingWindow();

            state._fsp--;

             current =iv_ruleTimeSlidingWindow; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeSlidingWindow433); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeSlidingWindow"


    // $ANTLR start "ruleTimeSlidingWindow"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:253:1: ruleTimeSlidingWindow returns [EObject current=null] : (otherlv_0= 'sliding' otherlv_1= 'for' ( (lv_className_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_seconds_4_0= ruleEInt ) ) (otherlv_5= 'seconds' | otherlv_6= 'secs' ) ) ;
    public final EObject ruleTimeSlidingWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;

        AntlrDatatypeRuleToken lv_seconds_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:256:28: ( (otherlv_0= 'sliding' otherlv_1= 'for' ( (lv_className_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_seconds_4_0= ruleEInt ) ) (otherlv_5= 'seconds' | otherlv_6= 'secs' ) ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:257:1: (otherlv_0= 'sliding' otherlv_1= 'for' ( (lv_className_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_seconds_4_0= ruleEInt ) ) (otherlv_5= 'seconds' | otherlv_6= 'secs' ) )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:257:1: (otherlv_0= 'sliding' otherlv_1= 'for' ( (lv_className_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_seconds_4_0= ruleEInt ) ) (otherlv_5= 'seconds' | otherlv_6= 'secs' ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:257:3: otherlv_0= 'sliding' otherlv_1= 'for' ( (lv_className_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_seconds_4_0= ruleEInt ) ) (otherlv_5= 'seconds' | otherlv_6= 'secs' )
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTimeSlidingWindow470); 

                	newLeafNode(otherlv_0, grammarAccess.getTimeSlidingWindowAccess().getSlidingKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTimeSlidingWindow482); 

                	newLeafNode(otherlv_1, grammarAccess.getTimeSlidingWindowAccess().getForKeyword_1());
                
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:265:1: ( (lv_className_2_0= ruleEString ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:266:1: (lv_className_2_0= ruleEString )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:266:1: (lv_className_2_0= ruleEString )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:267:3: lv_className_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTimeSlidingWindowAccess().getClassNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTimeSlidingWindow503);
            lv_className_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeSlidingWindowRule());
            	        }
                   		set(
                   			current, 
                   			"className",
                    		lv_className_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTimeSlidingWindow515); 

                	newLeafNode(otherlv_3, grammarAccess.getTimeSlidingWindowAccess().getEqualsSignKeyword_3());
                
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:287:1: ( (lv_seconds_4_0= ruleEInt ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:288:1: (lv_seconds_4_0= ruleEInt )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:288:1: (lv_seconds_4_0= ruleEInt )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:289:3: lv_seconds_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getTimeSlidingWindowAccess().getSecondsEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTimeSlidingWindow536);
            lv_seconds_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeSlidingWindowRule());
            	        }
                   		set(
                   			current, 
                   			"seconds",
                    		lv_seconds_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:305:2: (otherlv_5= 'seconds' | otherlv_6= 'secs' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:305:4: otherlv_5= 'seconds'
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTimeSlidingWindow549); 

                        	newLeafNode(otherlv_5, grammarAccess.getTimeSlidingWindowAccess().getSecondsKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:310:7: otherlv_6= 'secs'
                    {
                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTimeSlidingWindow567); 

                        	newLeafNode(otherlv_6, grammarAccess.getTimeSlidingWindowAccess().getSecsKeyword_5_1());
                        

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
    // $ANTLR end "ruleTimeSlidingWindow"


    // $ANTLR start "entryRuleElementSlidingWindow"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:322:1: entryRuleElementSlidingWindow returns [EObject current=null] : iv_ruleElementSlidingWindow= ruleElementSlidingWindow EOF ;
    public final EObject entryRuleElementSlidingWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementSlidingWindow = null;


        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:323:2: (iv_ruleElementSlidingWindow= ruleElementSlidingWindow EOF )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:324:2: iv_ruleElementSlidingWindow= ruleElementSlidingWindow EOF
            {
             newCompositeNode(grammarAccess.getElementSlidingWindowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElementSlidingWindow_in_entryRuleElementSlidingWindow604);
            iv_ruleElementSlidingWindow=ruleElementSlidingWindow();

            state._fsp--;

             current =iv_ruleElementSlidingWindow; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementSlidingWindow614); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementSlidingWindow"


    // $ANTLR start "ruleElementSlidingWindow"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:331:1: ruleElementSlidingWindow returns [EObject current=null] : (otherlv_0= 'sliding' otherlv_1= 'for' ( (lv_className_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= 'elements' ) ;
    public final EObject ruleElementSlidingWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;

        AntlrDatatypeRuleToken lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:334:28: ( (otherlv_0= 'sliding' otherlv_1= 'for' ( (lv_className_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= 'elements' ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:335:1: (otherlv_0= 'sliding' otherlv_1= 'for' ( (lv_className_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= 'elements' )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:335:1: (otherlv_0= 'sliding' otherlv_1= 'for' ( (lv_className_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= 'elements' )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:335:3: otherlv_0= 'sliding' otherlv_1= 'for' ( (lv_className_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_elements_4_0= ruleEInt ) ) otherlv_5= 'elements'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleElementSlidingWindow651); 

                	newLeafNode(otherlv_0, grammarAccess.getElementSlidingWindowAccess().getSlidingKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElementSlidingWindow663); 

                	newLeafNode(otherlv_1, grammarAccess.getElementSlidingWindowAccess().getForKeyword_1());
                
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:343:1: ( (lv_className_2_0= ruleEString ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:344:1: (lv_className_2_0= ruleEString )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:344:1: (lv_className_2_0= ruleEString )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:345:3: lv_className_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getElementSlidingWindowAccess().getClassNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleElementSlidingWindow684);
            lv_className_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementSlidingWindowRule());
            	        }
                   		set(
                   			current, 
                   			"className",
                    		lv_className_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleElementSlidingWindow696); 

                	newLeafNode(otherlv_3, grammarAccess.getElementSlidingWindowAccess().getEqualsSignKeyword_3());
                
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:365:1: ( (lv_elements_4_0= ruleEInt ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:366:1: (lv_elements_4_0= ruleEInt )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:366:1: (lv_elements_4_0= ruleEInt )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:367:3: lv_elements_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getElementSlidingWindowAccess().getElementsEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleElementSlidingWindow717);
            lv_elements_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementSlidingWindowRule());
            	        }
                   		set(
                   			current, 
                   			"elements",
                    		lv_elements_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElementSlidingWindow729); 

                	newLeafNode(otherlv_5, grammarAccess.getElementSlidingWindowAccess().getElementsKeyword_5());
                

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
    // $ANTLR end "ruleElementSlidingWindow"


    // $ANTLR start "entryRuleKeySpec"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:395:1: entryRuleKeySpec returns [EObject current=null] : iv_ruleKeySpec= ruleKeySpec EOF ;
    public final EObject entryRuleKeySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeySpec = null;


        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:396:2: (iv_ruleKeySpec= ruleKeySpec EOF )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:397:2: iv_ruleKeySpec= ruleKeySpec EOF
            {
             newCompositeNode(grammarAccess.getKeySpecRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeySpec_in_entryRuleKeySpec765);
            iv_ruleKeySpec=ruleKeySpec();

            state._fsp--;

             current =iv_ruleKeySpec; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeySpec775); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeySpec"


    // $ANTLR start "ruleKeySpec"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:404:1: ruleKeySpec returns [EObject current=null] : (otherlv_0= 'key' otherlv_1= '(' ( (lv_className_2_0= ruleEString ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_featureName_5_0= ruleEString ) ) ) ;
    public final EObject ruleKeySpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;

        AntlrDatatypeRuleToken lv_featureName_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:407:28: ( (otherlv_0= 'key' otherlv_1= '(' ( (lv_className_2_0= ruleEString ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_featureName_5_0= ruleEString ) ) ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:408:1: (otherlv_0= 'key' otherlv_1= '(' ( (lv_className_2_0= ruleEString ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_featureName_5_0= ruleEString ) ) )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:408:1: (otherlv_0= 'key' otherlv_1= '(' ( (lv_className_2_0= ruleEString ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_featureName_5_0= ruleEString ) ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:408:3: otherlv_0= 'key' otherlv_1= '(' ( (lv_className_2_0= ruleEString ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_featureName_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleKeySpec812); 

                	newLeafNode(otherlv_0, grammarAccess.getKeySpecAccess().getKeyKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKeySpec824); 

                	newLeafNode(otherlv_1, grammarAccess.getKeySpecAccess().getLeftParenthesisKeyword_1());
                
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:416:1: ( (lv_className_2_0= ruleEString ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:417:1: (lv_className_2_0= ruleEString )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:417:1: (lv_className_2_0= ruleEString )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:418:3: lv_className_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getKeySpecAccess().getClassNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeySpec845);
            lv_className_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeySpecRule());
            	        }
                   		set(
                   			current, 
                   			"className",
                    		lv_className_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKeySpec857); 

                	newLeafNode(otherlv_3, grammarAccess.getKeySpecAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleKeySpec869); 

                	newLeafNode(otherlv_4, grammarAccess.getKeySpecAccess().getEqualsSignKeyword_4());
                
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:442:1: ( (lv_featureName_5_0= ruleEString ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:443:1: (lv_featureName_5_0= ruleEString )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:443:1: (lv_featureName_5_0= ruleEString )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:444:3: lv_featureName_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getKeySpecAccess().getFeatureNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeySpec890);
            lv_featureName_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeySpecRule());
            	        }
                   		set(
                   			current, 
                   			"featureName",
                    		lv_featureName_5_0, 
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
    // $ANTLR end "ruleKeySpec"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:468:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:469:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:470:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString927);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString938); 

            }

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
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:477:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:480:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:481:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:481:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:481:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString978); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:489:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1004); 

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


    // $ANTLR start "entryRuleEInt"
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:504:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:505:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:506:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1050);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1061); 

            }

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
    // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:513:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:516:28: (this_INT_0= RULE_INT )
            // ../org.eclectic.streamdesc.language/src-gen/org/eclectic/streamdesc/parser/antlr/internal/InternalStreamDescLanguage.g:517:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1100); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
                

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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStreamDescription_in_entryRuleStreamDescription75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStreamDescription85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleStreamDescription122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStreamDescription143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStreamDescription155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStreamDescription176 = new BitSet(new long[]{0x0000000000042002L});
        public static final BitSet FOLLOW_ruleKeySpec_in_ruleStreamDescription198 = new BitSet(new long[]{0x0000000000042002L});
        public static final BitSet FOLLOW_ruleKeySpec_in_ruleStreamDescription219 = new BitSet(new long[]{0x0000000000042002L});
        public static final BitSet FOLLOW_ruleSlidingWindow_in_ruleStreamDescription244 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleSlidingWindow_in_ruleStreamDescription265 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleSlidingWindow_in_entryRuleSlidingWindow304 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlidingWindow314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSlidingWindow_in_ruleSlidingWindow361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementSlidingWindow_in_ruleSlidingWindow388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSlidingWindow_in_entryRuleTimeSlidingWindow423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeSlidingWindow433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleTimeSlidingWindow470 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTimeSlidingWindow482 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTimeSlidingWindow503 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTimeSlidingWindow515 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTimeSlidingWindow536 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleTimeSlidingWindow549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleTimeSlidingWindow567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementSlidingWindow_in_entryRuleElementSlidingWindow604 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementSlidingWindow614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleElementSlidingWindow651 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElementSlidingWindow663 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleElementSlidingWindow684 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleElementSlidingWindow696 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleElementSlidingWindow717 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleElementSlidingWindow729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeySpec_in_entryRuleKeySpec765 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeySpec775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleKeySpec812 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleKeySpec824 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeySpec845 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleKeySpec857 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleKeySpec869 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeySpec890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString927 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1050 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1100 = new BitSet(new long[]{0x0000000000000002L});
    }


}