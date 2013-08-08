package org.eclectic.parser.antlr.internal; 

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
import org.eclectic.services.ApiDescriptionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalApiDescriptionLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'api'", "'described'", "'by'", "'generic'", "'mapper'", "'metaclass'", "'to'", "'{'", "'}'", "'empty'", "'constructor'", "'('", "','", "')'", "'set'", "'='", "'attr'", "'*'", "':'", "'get'", "'ref'", "'method'", "'iterator'", "'finished'", "'next'", "'observer'", "'update'", "'['", "']'", "'Array'", "'<'", "'>'", "'Collection'", "'void'", "'true'", "'false'", "'.'"
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
    public static final int RULE_INT=5;
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
    public static final int RULE_STRING=6;
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
    public String getGrammarFileName() { return "../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g"; }



     	private ApiDescriptionLanguageGrammarAccess grammarAccess;
     	
        public InternalApiDescriptionLanguageParser(TokenStream input, ApiDescriptionLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ApiDescription";	
       	}
       	
       	@Override
       	protected ApiDescriptionLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleApiDescription"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:68:1: entryRuleApiDescription returns [EObject current=null] : iv_ruleApiDescription= ruleApiDescription EOF ;
    public final EObject entryRuleApiDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApiDescription = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:69:2: (iv_ruleApiDescription= ruleApiDescription EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:70:2: iv_ruleApiDescription= ruleApiDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApiDescriptionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleApiDescription_in_entryRuleApiDescription75);
            iv_ruleApiDescription=ruleApiDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApiDescription; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleApiDescription85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApiDescription"


    // $ANTLR start "ruleApiDescription"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:77:1: ruleApiDescription returns [EObject current=null] : (otherlv_0= 'api' ( (lv_apiName_1_0= ruleEString ) ) otherlv_2= 'described' otherlv_3= 'by' ( (lv_metamodelName_4_0= ruleEString ) ) (otherlv_5= 'generic' otherlv_6= 'mapper' ( (lv_mapperClassName_7_0= ruleQualifiedName ) ) )? ( (lv_declaredElements_8_0= ruleDeclaredElement ) )* ( (lv_classMappings_9_0= ruleClassMapping ) )+ ) ;
    public final EObject ruleApiDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_apiName_1_0 = null;

        AntlrDatatypeRuleToken lv_metamodelName_4_0 = null;

        AntlrDatatypeRuleToken lv_mapperClassName_7_0 = null;

        EObject lv_declaredElements_8_0 = null;

        EObject lv_classMappings_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:80:28: ( (otherlv_0= 'api' ( (lv_apiName_1_0= ruleEString ) ) otherlv_2= 'described' otherlv_3= 'by' ( (lv_metamodelName_4_0= ruleEString ) ) (otherlv_5= 'generic' otherlv_6= 'mapper' ( (lv_mapperClassName_7_0= ruleQualifiedName ) ) )? ( (lv_declaredElements_8_0= ruleDeclaredElement ) )* ( (lv_classMappings_9_0= ruleClassMapping ) )+ ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:81:1: (otherlv_0= 'api' ( (lv_apiName_1_0= ruleEString ) ) otherlv_2= 'described' otherlv_3= 'by' ( (lv_metamodelName_4_0= ruleEString ) ) (otherlv_5= 'generic' otherlv_6= 'mapper' ( (lv_mapperClassName_7_0= ruleQualifiedName ) ) )? ( (lv_declaredElements_8_0= ruleDeclaredElement ) )* ( (lv_classMappings_9_0= ruleClassMapping ) )+ )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:81:1: (otherlv_0= 'api' ( (lv_apiName_1_0= ruleEString ) ) otherlv_2= 'described' otherlv_3= 'by' ( (lv_metamodelName_4_0= ruleEString ) ) (otherlv_5= 'generic' otherlv_6= 'mapper' ( (lv_mapperClassName_7_0= ruleQualifiedName ) ) )? ( (lv_declaredElements_8_0= ruleDeclaredElement ) )* ( (lv_classMappings_9_0= ruleClassMapping ) )+ )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:81:3: otherlv_0= 'api' ( (lv_apiName_1_0= ruleEString ) ) otherlv_2= 'described' otherlv_3= 'by' ( (lv_metamodelName_4_0= ruleEString ) ) (otherlv_5= 'generic' otherlv_6= 'mapper' ( (lv_mapperClassName_7_0= ruleQualifiedName ) ) )? ( (lv_declaredElements_8_0= ruleDeclaredElement ) )* ( (lv_classMappings_9_0= ruleClassMapping ) )+
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleApiDescription122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApiDescriptionAccess().getApiKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:85:1: ( (lv_apiName_1_0= ruleEString ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:86:1: (lv_apiName_1_0= ruleEString )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:86:1: (lv_apiName_1_0= ruleEString )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:87:3: lv_apiName_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getApiDescriptionAccess().getApiNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleApiDescription143);
            lv_apiName_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getApiDescriptionRule());
              	        }
                     		set(
                     			current, 
                     			"apiName",
                      		lv_apiName_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleApiDescription155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getApiDescriptionAccess().getDescribedKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleApiDescription167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getApiDescriptionAccess().getByKeyword_3());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:111:1: ( (lv_metamodelName_4_0= ruleEString ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:112:1: (lv_metamodelName_4_0= ruleEString )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:112:1: (lv_metamodelName_4_0= ruleEString )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:113:3: lv_metamodelName_4_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getApiDescriptionAccess().getMetamodelNameEStringParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleApiDescription188);
            lv_metamodelName_4_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getApiDescriptionRule());
              	        }
                     		set(
                     			current, 
                     			"metamodelName",
                      		lv_metamodelName_4_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:129:2: (otherlv_5= 'generic' otherlv_6= 'mapper' ( (lv_mapperClassName_7_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:129:4: otherlv_5= 'generic' otherlv_6= 'mapper' ( (lv_mapperClassName_7_0= ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleApiDescription201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getApiDescriptionAccess().getGenericKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleApiDescription213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getApiDescriptionAccess().getMapperKeyword_5_1());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:137:1: ( (lv_mapperClassName_7_0= ruleQualifiedName ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:138:1: (lv_mapperClassName_7_0= ruleQualifiedName )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:138:1: (lv_mapperClassName_7_0= ruleQualifiedName )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:139:3: lv_mapperClassName_7_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApiDescriptionAccess().getMapperClassNameQualifiedNameParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleApiDescription234);
                    lv_mapperClassName_7_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getApiDescriptionRule());
                      	        }
                             		set(
                             			current, 
                             			"mapperClassName",
                              		lv_mapperClassName_7_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:155:4: ( (lv_declaredElements_8_0= ruleDeclaredElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==33||LA2_0==36) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:156:1: (lv_declaredElements_8_0= ruleDeclaredElement )
            	    {
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:156:1: (lv_declaredElements_8_0= ruleDeclaredElement )
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:157:3: lv_declaredElements_8_0= ruleDeclaredElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getApiDescriptionAccess().getDeclaredElementsDeclaredElementParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaredElement_in_ruleApiDescription257);
            	    lv_declaredElements_8_0=ruleDeclaredElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getApiDescriptionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declaredElements",
            	              		lv_declaredElements_8_0, 
            	              		"DeclaredElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:173:3: ( (lv_classMappings_9_0= ruleClassMapping ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:174:1: (lv_classMappings_9_0= ruleClassMapping )
            	    {
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:174:1: (lv_classMappings_9_0= ruleClassMapping )
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:175:3: lv_classMappings_9_0= ruleClassMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getApiDescriptionAccess().getClassMappingsClassMappingParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleClassMapping_in_ruleApiDescription279);
            	    lv_classMappings_9_0=ruleClassMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getApiDescriptionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classMappings",
            	              		lv_classMappings_9_0, 
            	              		"ClassMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleApiDescription"


    // $ANTLR start "entryRuleClassMapping"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:199:1: entryRuleClassMapping returns [EObject current=null] : iv_ruleClassMapping= ruleClassMapping EOF ;
    public final EObject entryRuleClassMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMapping = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:200:2: (iv_ruleClassMapping= ruleClassMapping EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:201:2: iv_ruleClassMapping= ruleClassMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassMapping_in_entryRuleClassMapping316);
            iv_ruleClassMapping=ruleClassMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassMapping; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassMapping326); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassMapping"


    // $ANTLR start "ruleClassMapping"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:208:1: ruleClassMapping returns [EObject current=null] : this_SimpleClassMapping_0= ruleSimpleClassMapping ;
    public final EObject ruleClassMapping() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleClassMapping_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:211:28: (this_SimpleClassMapping_0= ruleSimpleClassMapping )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:213:5: this_SimpleClassMapping_0= ruleSimpleClassMapping
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClassMappingAccess().getSimpleClassMappingParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleClassMapping_in_ruleClassMapping372);
            this_SimpleClassMapping_0=ruleSimpleClassMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SimpleClassMapping_0; 
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
    // $ANTLR end "ruleClassMapping"


    // $ANTLR start "entryRuleSimpleClassMapping"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:229:1: entryRuleSimpleClassMapping returns [EObject current=null] : iv_ruleSimpleClassMapping= ruleSimpleClassMapping EOF ;
    public final EObject entryRuleSimpleClassMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleClassMapping = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:230:2: (iv_ruleSimpleClassMapping= ruleSimpleClassMapping EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:231:2: iv_ruleSimpleClassMapping= ruleSimpleClassMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleClassMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleClassMapping_in_entryRuleSimpleClassMapping406);
            iv_ruleSimpleClassMapping=ruleSimpleClassMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleClassMapping; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleClassMapping416); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleClassMapping"


    // $ANTLR start "ruleSimpleClassMapping"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:238:1: ruleSimpleClassMapping returns [EObject current=null] : (otherlv_0= 'metaclass' ( (lv_metaclassName_1_0= ruleEString ) ) otherlv_2= 'to' ( (lv_canonicalClassName_3_0= ruleQualifiedName ) ) (otherlv_4= '{' ( (lv_creation_5_0= ruleCreationMechanism ) ) ( (lv_featureMappings_6_0= ruleFeatureMapping ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleSimpleClassMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_metaclassName_1_0 = null;

        AntlrDatatypeRuleToken lv_canonicalClassName_3_0 = null;

        EObject lv_creation_5_0 = null;

        EObject lv_featureMappings_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:241:28: ( (otherlv_0= 'metaclass' ( (lv_metaclassName_1_0= ruleEString ) ) otherlv_2= 'to' ( (lv_canonicalClassName_3_0= ruleQualifiedName ) ) (otherlv_4= '{' ( (lv_creation_5_0= ruleCreationMechanism ) ) ( (lv_featureMappings_6_0= ruleFeatureMapping ) )* otherlv_7= '}' )? ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:242:1: (otherlv_0= 'metaclass' ( (lv_metaclassName_1_0= ruleEString ) ) otherlv_2= 'to' ( (lv_canonicalClassName_3_0= ruleQualifiedName ) ) (otherlv_4= '{' ( (lv_creation_5_0= ruleCreationMechanism ) ) ( (lv_featureMappings_6_0= ruleFeatureMapping ) )* otherlv_7= '}' )? )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:242:1: (otherlv_0= 'metaclass' ( (lv_metaclassName_1_0= ruleEString ) ) otherlv_2= 'to' ( (lv_canonicalClassName_3_0= ruleQualifiedName ) ) (otherlv_4= '{' ( (lv_creation_5_0= ruleCreationMechanism ) ) ( (lv_featureMappings_6_0= ruleFeatureMapping ) )* otherlv_7= '}' )? )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:242:3: otherlv_0= 'metaclass' ( (lv_metaclassName_1_0= ruleEString ) ) otherlv_2= 'to' ( (lv_canonicalClassName_3_0= ruleQualifiedName ) ) (otherlv_4= '{' ( (lv_creation_5_0= ruleCreationMechanism ) ) ( (lv_featureMappings_6_0= ruleFeatureMapping ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSimpleClassMapping453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimpleClassMappingAccess().getMetaclassKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:246:1: ( (lv_metaclassName_1_0= ruleEString ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:247:1: (lv_metaclassName_1_0= ruleEString )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:247:1: (lv_metaclassName_1_0= ruleEString )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:248:3: lv_metaclassName_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleClassMappingAccess().getMetaclassNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleClassMapping474);
            lv_metaclassName_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSimpleClassMappingRule());
              	        }
                     		set(
                     			current, 
                     			"metaclassName",
                      		lv_metaclassName_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSimpleClassMapping486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSimpleClassMappingAccess().getToKeyword_2());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:268:1: ( (lv_canonicalClassName_3_0= ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:269:1: (lv_canonicalClassName_3_0= ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:269:1: (lv_canonicalClassName_3_0= ruleQualifiedName )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:270:3: lv_canonicalClassName_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleClassMappingAccess().getCanonicalClassNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSimpleClassMapping507);
            lv_canonicalClassName_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSimpleClassMappingRule());
              	        }
                     		set(
                     			current, 
                     			"canonicalClassName",
                      		lv_canonicalClassName_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:286:2: (otherlv_4= '{' ( (lv_creation_5_0= ruleCreationMechanism ) ) ( (lv_featureMappings_6_0= ruleFeatureMapping ) )* otherlv_7= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:286:4: otherlv_4= '{' ( (lv_creation_5_0= ruleCreationMechanism ) ) ( (lv_featureMappings_6_0= ruleFeatureMapping ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSimpleClassMapping520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSimpleClassMappingAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:290:1: ( (lv_creation_5_0= ruleCreationMechanism ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:291:1: (lv_creation_5_0= ruleCreationMechanism )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:291:1: (lv_creation_5_0= ruleCreationMechanism )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:292:3: lv_creation_5_0= ruleCreationMechanism
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimpleClassMappingAccess().getCreationCreationMechanismParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCreationMechanism_in_ruleSimpleClassMapping541);
                    lv_creation_5_0=ruleCreationMechanism();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimpleClassMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"creation",
                              		lv_creation_5_0, 
                              		"CreationMechanism");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:308:2: ( (lv_featureMappings_6_0= ruleFeatureMapping ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==27||LA4_0==31) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:309:1: (lv_featureMappings_6_0= ruleFeatureMapping )
                    	    {
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:309:1: (lv_featureMappings_6_0= ruleFeatureMapping )
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:310:3: lv_featureMappings_6_0= ruleFeatureMapping
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimpleClassMappingAccess().getFeatureMappingsFeatureMappingParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeatureMapping_in_ruleSimpleClassMapping562);
                    	    lv_featureMappings_6_0=ruleFeatureMapping();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSimpleClassMappingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"featureMappings",
                    	              		lv_featureMappings_6_0, 
                    	              		"FeatureMapping");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSimpleClassMapping575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSimpleClassMappingAccess().getRightCurlyBracketKeyword_4_3());
                          
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
    // $ANTLR end "ruleSimpleClassMapping"


    // $ANTLR start "entryRuleCreationMechanism"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:338:1: entryRuleCreationMechanism returns [EObject current=null] : iv_ruleCreationMechanism= ruleCreationMechanism EOF ;
    public final EObject entryRuleCreationMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreationMechanism = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:339:2: (iv_ruleCreationMechanism= ruleCreationMechanism EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:340:2: iv_ruleCreationMechanism= ruleCreationMechanism EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreationMechanismRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCreationMechanism_in_entryRuleCreationMechanism613);
            iv_ruleCreationMechanism=ruleCreationMechanism();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreationMechanism; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCreationMechanism623); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreationMechanism"


    // $ANTLR start "ruleCreationMechanism"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:347:1: ruleCreationMechanism returns [EObject current=null] : (this_EmptyConstructor_0= ruleEmptyConstructor | this_NonEmptyConstructor_1= ruleNonEmptyConstructor ) ;
    public final EObject ruleCreationMechanism() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyConstructor_0 = null;

        EObject this_NonEmptyConstructor_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:350:28: ( (this_EmptyConstructor_0= ruleEmptyConstructor | this_NonEmptyConstructor_1= ruleNonEmptyConstructor ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:351:1: (this_EmptyConstructor_0= ruleEmptyConstructor | this_NonEmptyConstructor_1= ruleNonEmptyConstructor )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:351:1: (this_EmptyConstructor_0= ruleEmptyConstructor | this_NonEmptyConstructor_1= ruleNonEmptyConstructor )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:352:5: this_EmptyConstructor_0= ruleEmptyConstructor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCreationMechanismAccess().getEmptyConstructorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmptyConstructor_in_ruleCreationMechanism670);
                    this_EmptyConstructor_0=ruleEmptyConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EmptyConstructor_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:362:5: this_NonEmptyConstructor_1= ruleNonEmptyConstructor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCreationMechanismAccess().getNonEmptyConstructorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNonEmptyConstructor_in_ruleCreationMechanism697);
                    this_NonEmptyConstructor_1=ruleNonEmptyConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NonEmptyConstructor_1; 
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
    // $ANTLR end "ruleCreationMechanism"


    // $ANTLR start "entryRuleEmptyConstructor"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:378:1: entryRuleEmptyConstructor returns [EObject current=null] : iv_ruleEmptyConstructor= ruleEmptyConstructor EOF ;
    public final EObject entryRuleEmptyConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyConstructor = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:379:2: (iv_ruleEmptyConstructor= ruleEmptyConstructor EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:380:2: iv_ruleEmptyConstructor= ruleEmptyConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyConstructorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmptyConstructor_in_entryRuleEmptyConstructor732);
            iv_ruleEmptyConstructor=ruleEmptyConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyConstructor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmptyConstructor742); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyConstructor"


    // $ANTLR start "ruleEmptyConstructor"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:387:1: ruleEmptyConstructor returns [EObject current=null] : (otherlv_0= 'empty' () otherlv_2= 'constructor' (otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )+ otherlv_5= '}' )? ) ;
    public final EObject ruleEmptyConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:390:28: ( (otherlv_0= 'empty' () otherlv_2= 'constructor' (otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )+ otherlv_5= '}' )? ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:391:1: (otherlv_0= 'empty' () otherlv_2= 'constructor' (otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )+ otherlv_5= '}' )? )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:391:1: (otherlv_0= 'empty' () otherlv_2= 'constructor' (otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )+ otherlv_5= '}' )? )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:391:3: otherlv_0= 'empty' () otherlv_2= 'constructor' (otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )+ otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEmptyConstructor779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEmptyConstructorAccess().getEmptyKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:395:1: ()
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:396:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEmptyConstructorAccess().getConstructorAction_1(),
                          current);
                  
            }

            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEmptyConstructor800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEmptyConstructorAccess().getConstructorKeyword_2());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:405:1: (otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )+ otherlv_5= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:405:3: otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEmptyConstructor813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEmptyConstructorAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:409:1: ( (lv_statement_4_0= ruleStatement ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==25) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:410:1: (lv_statement_4_0= ruleStatement )
                    	    {
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:410:1: (lv_statement_4_0= ruleStatement )
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:411:3: lv_statement_4_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEmptyConstructorAccess().getStatementStatementParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleEmptyConstructor834);
                    	    lv_statement_4_0=ruleStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEmptyConstructorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statement",
                    	              		lv_statement_4_0, 
                    	              		"Statement");
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

                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEmptyConstructor847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEmptyConstructorAccess().getRightCurlyBracketKeyword_3_2());
                          
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
    // $ANTLR end "ruleEmptyConstructor"


    // $ANTLR start "entryRuleNonEmptyConstructor"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:439:1: entryRuleNonEmptyConstructor returns [EObject current=null] : iv_ruleNonEmptyConstructor= ruleNonEmptyConstructor EOF ;
    public final EObject entryRuleNonEmptyConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonEmptyConstructor = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:440:2: (iv_ruleNonEmptyConstructor= ruleNonEmptyConstructor EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:441:2: iv_ruleNonEmptyConstructor= ruleNonEmptyConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonEmptyConstructorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonEmptyConstructor_in_entryRuleNonEmptyConstructor885);
            iv_ruleNonEmptyConstructor=ruleNonEmptyConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonEmptyConstructor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNonEmptyConstructor895); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonEmptyConstructor"


    // $ANTLR start "ruleNonEmptyConstructor"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:448:1: ruleNonEmptyConstructor returns [EObject current=null] : ( () otherlv_1= 'constructor' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= '{' ( (lv_statement_8_0= ruleStatement ) )+ otherlv_9= '}' )? ) ;
    public final EObject ruleNonEmptyConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_statement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:451:28: ( ( () otherlv_1= 'constructor' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= '{' ( (lv_statement_8_0= ruleStatement ) )+ otherlv_9= '}' )? ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:452:1: ( () otherlv_1= 'constructor' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= '{' ( (lv_statement_8_0= ruleStatement ) )+ otherlv_9= '}' )? )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:452:1: ( () otherlv_1= 'constructor' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= '{' ( (lv_statement_8_0= ruleStatement ) )+ otherlv_9= '}' )? )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:452:2: () otherlv_1= 'constructor' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= '{' ( (lv_statement_8_0= ruleStatement ) )+ otherlv_9= '}' )?
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:452:2: ()
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:453:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNonEmptyConstructorAccess().getConstructorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNonEmptyConstructor941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNonEmptyConstructorAccess().getConstructorKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNonEmptyConstructor953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNonEmptyConstructorAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:466:1: ( (otherlv_3= RULE_ID ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:467:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:467:1: (otherlv_3= RULE_ID )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:468:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNonEmptyConstructorRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNonEmptyConstructor973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getNonEmptyConstructorAccess().getParametersFeatureMappingCrossReference_3_0()); 
              	
            }

            }


            }

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:479:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:479:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNonEmptyConstructor986); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getNonEmptyConstructorAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:483:1: ( (otherlv_5= RULE_ID ) )
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:484:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:484:1: (otherlv_5= RULE_ID )
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:485:3: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getNonEmptyConstructorRule());
            	      	        }
            	              
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNonEmptyConstructor1006); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_5, grammarAccess.getNonEmptyConstructorAccess().getParametersFeatureMappingCrossReference_4_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNonEmptyConstructor1020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNonEmptyConstructorAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:500:1: (otherlv_7= '{' ( (lv_statement_8_0= ruleStatement ) )+ otherlv_9= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:500:3: otherlv_7= '{' ( (lv_statement_8_0= ruleStatement ) )+ otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleNonEmptyConstructor1033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getNonEmptyConstructorAccess().getLeftCurlyBracketKeyword_6_0());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:504:1: ( (lv_statement_8_0= ruleStatement ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==25) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:505:1: (lv_statement_8_0= ruleStatement )
                    	    {
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:505:1: (lv_statement_8_0= ruleStatement )
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:506:3: lv_statement_8_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNonEmptyConstructorAccess().getStatementStatementParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleNonEmptyConstructor1054);
                    	    lv_statement_8_0=ruleStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNonEmptyConstructorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statement",
                    	              		lv_statement_8_0, 
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

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNonEmptyConstructor1067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getNonEmptyConstructorAccess().getRightCurlyBracketKeyword_6_2());
                          
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
    // $ANTLR end "ruleNonEmptyConstructor"


    // $ANTLR start "entryRuleStatement"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:534:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:535:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:536:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_entryRuleStatement1105);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatement1115); if (state.failed) return current;

            }

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
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:543:1: ruleStatement returns [EObject current=null] : this_SetFeature_0= ruleSetFeature ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SetFeature_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:546:28: (this_SetFeature_0= ruleSetFeature )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:548:5: this_SetFeature_0= ruleSetFeature
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStatementAccess().getSetFeatureParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSetFeature_in_ruleStatement1161);
            this_SetFeature_0=ruleSetFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SetFeature_0; 
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


    // $ANTLR start "entryRuleSetFeature"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:564:1: entryRuleSetFeature returns [EObject current=null] : iv_ruleSetFeature= ruleSetFeature EOF ;
    public final EObject entryRuleSetFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetFeature = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:565:2: (iv_ruleSetFeature= ruleSetFeature EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:566:2: iv_ruleSetFeature= ruleSetFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetFeatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSetFeature_in_entryRuleSetFeature1195);
            iv_ruleSetFeature=ruleSetFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetFeature; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetFeature1205); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetFeature"


    // $ANTLR start "ruleSetFeature"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:573:1: ruleSetFeature returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_strValue_4_0= RULE_STRING ) ) | ( (lv_boolValue_5_0= ruleEBoolean ) ) ) ) ;
    public final EObject ruleSetFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_intValue_3_0=null;
        Token lv_strValue_4_0=null;
        AntlrDatatypeRuleToken lv_boolValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:576:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_strValue_4_0= RULE_STRING ) ) | ( (lv_boolValue_5_0= ruleEBoolean ) ) ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:577:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_strValue_4_0= RULE_STRING ) ) | ( (lv_boolValue_5_0= ruleEBoolean ) ) ) )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:577:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_strValue_4_0= RULE_STRING ) ) | ( (lv_boolValue_5_0= ruleEBoolean ) ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:577:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_strValue_4_0= RULE_STRING ) ) | ( (lv_boolValue_5_0= ruleEBoolean ) ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSetFeature1242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetFeatureAccess().getSetKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:581:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:582:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:582:1: (otherlv_1= RULE_ID )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:583:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSetFeatureRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetFeature1262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getSetFeatureAccess().getFeatureFeatureMappingCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSetFeature1274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSetFeatureAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:598:1: ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_strValue_4_0= RULE_STRING ) ) | ( (lv_boolValue_5_0= ruleEBoolean ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
                {
                alt12=2;
                }
                break;
            case 45:
            case 46:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:598:2: ( (lv_intValue_3_0= RULE_INT ) )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:598:2: ( (lv_intValue_3_0= RULE_INT ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:599:1: (lv_intValue_3_0= RULE_INT )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:599:1: (lv_intValue_3_0= RULE_INT )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:600:3: lv_intValue_3_0= RULE_INT
                    {
                    lv_intValue_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSetFeature1292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_intValue_3_0, grammarAccess.getSetFeatureAccess().getIntValueINTTerminalRuleCall_3_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSetFeatureRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"intValue",
                              		lv_intValue_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:617:6: ( (lv_strValue_4_0= RULE_STRING ) )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:617:6: ( (lv_strValue_4_0= RULE_STRING ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:618:1: (lv_strValue_4_0= RULE_STRING )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:618:1: (lv_strValue_4_0= RULE_STRING )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:619:3: lv_strValue_4_0= RULE_STRING
                    {
                    lv_strValue_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSetFeature1320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_strValue_4_0, grammarAccess.getSetFeatureAccess().getStrValueSTRINGTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSetFeatureRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"strValue",
                              		lv_strValue_4_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:636:6: ( (lv_boolValue_5_0= ruleEBoolean ) )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:636:6: ( (lv_boolValue_5_0= ruleEBoolean ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:637:1: (lv_boolValue_5_0= ruleEBoolean )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:637:1: (lv_boolValue_5_0= ruleEBoolean )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:638:3: lv_boolValue_5_0= ruleEBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSetFeatureAccess().getBoolValueEBooleanParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleSetFeature1352);
                    lv_boolValue_5_0=ruleEBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSetFeatureRule());
                      	        }
                             		set(
                             			current, 
                             			"boolValue",
                              		lv_boolValue_5_0, 
                              		"EBoolean");
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
    // $ANTLR end "ruleSetFeature"


    // $ANTLR start "entryRuleFeatureMapping"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:662:1: entryRuleFeatureMapping returns [EObject current=null] : iv_ruleFeatureMapping= ruleFeatureMapping EOF ;
    public final EObject entryRuleFeatureMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMapping = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:663:2: (iv_ruleFeatureMapping= ruleFeatureMapping EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:664:2: iv_ruleFeatureMapping= ruleFeatureMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMapping_in_entryRuleFeatureMapping1389);
            iv_ruleFeatureMapping=ruleFeatureMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureMapping; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureMapping1399); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureMapping"


    // $ANTLR start "ruleFeatureMapping"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:671:1: ruleFeatureMapping returns [EObject current=null] : (this_SimpleAttributeMapping_0= ruleSimpleAttributeMapping | this_SimpleReferenceMapping_1= ruleSimpleReferenceMapping ) ;
    public final EObject ruleFeatureMapping() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAttributeMapping_0 = null;

        EObject this_SimpleReferenceMapping_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:674:28: ( (this_SimpleAttributeMapping_0= ruleSimpleAttributeMapping | this_SimpleReferenceMapping_1= ruleSimpleReferenceMapping ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:675:1: (this_SimpleAttributeMapping_0= ruleSimpleAttributeMapping | this_SimpleReferenceMapping_1= ruleSimpleReferenceMapping )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:675:1: (this_SimpleAttributeMapping_0= ruleSimpleAttributeMapping | this_SimpleReferenceMapping_1= ruleSimpleReferenceMapping )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
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
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:676:5: this_SimpleAttributeMapping_0= ruleSimpleAttributeMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureMappingAccess().getSimpleAttributeMappingParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleAttributeMapping_in_ruleFeatureMapping1446);
                    this_SimpleAttributeMapping_0=ruleSimpleAttributeMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleAttributeMapping_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:686:5: this_SimpleReferenceMapping_1= ruleSimpleReferenceMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureMappingAccess().getSimpleReferenceMappingParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleReferenceMapping_in_ruleFeatureMapping1473);
                    this_SimpleReferenceMapping_1=ruleSimpleReferenceMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleReferenceMapping_1; 
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
    // $ANTLR end "ruleFeatureMapping"


    // $ANTLR start "entryRuleSimpleAttributeMapping"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:702:1: entryRuleSimpleAttributeMapping returns [EObject current=null] : iv_ruleSimpleAttributeMapping= ruleSimpleAttributeMapping EOF ;
    public final EObject entryRuleSimpleAttributeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAttributeMapping = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:703:2: (iv_ruleSimpleAttributeMapping= ruleSimpleAttributeMapping EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:704:2: iv_ruleSimpleAttributeMapping= ruleSimpleAttributeMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleAttributeMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAttributeMapping_in_entryRuleSimpleAttributeMapping1508);
            iv_ruleSimpleAttributeMapping=ruleSimpleAttributeMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleAttributeMapping; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleAttributeMapping1518); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleAttributeMapping"


    // $ANTLR start "ruleSimpleAttributeMapping"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:711:1: ruleSimpleAttributeMapping returns [EObject current=null] : (otherlv_0= 'attr' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_isMultivalued_2_0= '*' ) )? otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )? (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )? ) ;
    public final EObject ruleSimpleAttributeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMultivalued_2_0=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_featureName_1_0 = null;

        AntlrDatatypeRuleToken lv_constructorType_7_0 = null;

        EObject lv_getMethod_9_0 = null;

        EObject lv_setMethod_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:714:28: ( (otherlv_0= 'attr' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_isMultivalued_2_0= '*' ) )? otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )? (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )? ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:715:1: (otherlv_0= 'attr' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_isMultivalued_2_0= '*' ) )? otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )? (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )? )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:715:1: (otherlv_0= 'attr' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_isMultivalued_2_0= '*' ) )? otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )? (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )? )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:715:3: otherlv_0= 'attr' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_isMultivalued_2_0= '*' ) )? otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )? (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )?
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSimpleAttributeMapping1555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimpleAttributeMappingAccess().getAttrKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:719:1: ( (lv_featureName_1_0= ruleEString ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:720:1: (lv_featureName_1_0= ruleEString )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:720:1: (lv_featureName_1_0= ruleEString )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:721:3: lv_featureName_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleAttributeMappingAccess().getFeatureNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleAttributeMapping1576);
            lv_featureName_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSimpleAttributeMappingRule());
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

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:737:2: ( (lv_isMultivalued_2_0= '*' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:738:1: (lv_isMultivalued_2_0= '*' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:738:1: (lv_isMultivalued_2_0= '*' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:739:3: lv_isMultivalued_2_0= '*'
                    {
                    lv_isMultivalued_2_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSimpleAttributeMapping1594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isMultivalued_2_0, grammarAccess.getSimpleAttributeMappingAccess().getIsMultivaluedAsteriskKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSimpleAttributeMappingRule());
                      	        }
                             		setWithLastConsumed(current, "isMultivalued", true, "*");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSimpleAttributeMapping1620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSimpleAttributeMappingAccess().getColonKeyword_3());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:756:1: ( (lv_type_4_0= RULE_ID ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:757:1: (lv_type_4_0= RULE_ID )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:757:1: (lv_type_4_0= RULE_ID )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:758:3: lv_type_4_0= RULE_ID
            {
            lv_type_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleAttributeMapping1637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_type_4_0, grammarAccess.getSimpleAttributeMappingAccess().getTypeIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSimpleAttributeMappingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:774:2: (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:774:4: otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSimpleAttributeMapping1655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSimpleAttributeMappingAccess().getConstructorKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSimpleAttributeMapping1667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSimpleAttributeMappingAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:782:1: ( (lv_constructorType_7_0= ruleQualifiedName ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:783:1: (lv_constructorType_7_0= ruleQualifiedName )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:783:1: (lv_constructorType_7_0= ruleQualifiedName )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:784:3: lv_constructorType_7_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimpleAttributeMappingAccess().getConstructorTypeQualifiedNameParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSimpleAttributeMapping1688);
                    lv_constructorType_7_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimpleAttributeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"constructorType",
                              		lv_constructorType_7_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:800:4: (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:800:6: otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) )
                    {
                    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSimpleAttributeMapping1703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSimpleAttributeMappingAccess().getGetKeyword_6_0());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:804:1: ( (lv_getMethod_9_0= ruleGetMechanism ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:805:1: (lv_getMethod_9_0= ruleGetMechanism )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:805:1: (lv_getMethod_9_0= ruleGetMechanism )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:806:3: lv_getMethod_9_0= ruleGetMechanism
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimpleAttributeMappingAccess().getGetMethodGetMechanismParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGetMechanism_in_ruleSimpleAttributeMapping1724);
                    lv_getMethod_9_0=ruleGetMechanism();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimpleAttributeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"getMethod",
                              		lv_getMethod_9_0, 
                              		"GetMechanism");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:822:4: (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:822:6: otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSimpleAttributeMapping1739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSimpleAttributeMappingAccess().getSetKeyword_7_0());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:826:1: ( (lv_setMethod_11_0= ruleSetMechanism ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:827:1: (lv_setMethod_11_0= ruleSetMechanism )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:827:1: (lv_setMethod_11_0= ruleSetMechanism )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:828:3: lv_setMethod_11_0= ruleSetMechanism
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimpleAttributeMappingAccess().getSetMethodSetMechanismParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSetMechanism_in_ruleSimpleAttributeMapping1760);
                    lv_setMethod_11_0=ruleSetMechanism();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimpleAttributeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"setMethod",
                              		lv_setMethod_11_0, 
                              		"SetMechanism");
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
    // $ANTLR end "ruleSimpleAttributeMapping"


    // $ANTLR start "entryRuleSimpleReferenceMapping"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:852:1: entryRuleSimpleReferenceMapping returns [EObject current=null] : iv_ruleSimpleReferenceMapping= ruleSimpleReferenceMapping EOF ;
    public final EObject entryRuleSimpleReferenceMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleReferenceMapping = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:853:2: (iv_ruleSimpleReferenceMapping= ruleSimpleReferenceMapping EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:854:2: iv_ruleSimpleReferenceMapping= ruleSimpleReferenceMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleReferenceMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleReferenceMapping_in_entryRuleSimpleReferenceMapping1798);
            iv_ruleSimpleReferenceMapping=ruleSimpleReferenceMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleReferenceMapping; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleReferenceMapping1808); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleReferenceMapping"


    // $ANTLR start "ruleSimpleReferenceMapping"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:861:1: ruleSimpleReferenceMapping returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_isMultivalued_2_0= '*' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )? (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )? ) ;
    public final EObject ruleSimpleReferenceMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMultivalued_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_featureName_1_0 = null;

        AntlrDatatypeRuleToken lv_constructorType_7_0 = null;

        EObject lv_getMethod_9_0 = null;

        EObject lv_setMethod_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:864:28: ( (otherlv_0= 'ref' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_isMultivalued_2_0= '*' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )? (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )? ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:865:1: (otherlv_0= 'ref' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_isMultivalued_2_0= '*' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )? (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )? )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:865:1: (otherlv_0= 'ref' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_isMultivalued_2_0= '*' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )? (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )? )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:865:3: otherlv_0= 'ref' ( (lv_featureName_1_0= ruleEString ) ) ( (lv_isMultivalued_2_0= '*' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )? (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )?
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSimpleReferenceMapping1845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimpleReferenceMappingAccess().getRefKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:869:1: ( (lv_featureName_1_0= ruleEString ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:870:1: (lv_featureName_1_0= ruleEString )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:870:1: (lv_featureName_1_0= ruleEString )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:871:3: lv_featureName_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleReferenceMappingAccess().getFeatureNameEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleReferenceMapping1866);
            lv_featureName_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSimpleReferenceMappingRule());
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

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:887:2: ( (lv_isMultivalued_2_0= '*' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:888:1: (lv_isMultivalued_2_0= '*' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:888:1: (lv_isMultivalued_2_0= '*' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:889:3: lv_isMultivalued_2_0= '*'
                    {
                    lv_isMultivalued_2_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSimpleReferenceMapping1884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isMultivalued_2_0, grammarAccess.getSimpleReferenceMappingAccess().getIsMultivaluedAsteriskKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSimpleReferenceMappingRule());
                      	        }
                             		setWithLastConsumed(current, "isMultivalued", true, "*");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSimpleReferenceMapping1910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSimpleReferenceMappingAccess().getColonKeyword_3());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:906:1: ( (otherlv_4= RULE_ID ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:907:1: (otherlv_4= RULE_ID )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:907:1: (otherlv_4= RULE_ID )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:908:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSimpleReferenceMappingRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleReferenceMapping1930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getSimpleReferenceMappingAccess().getTypeClassMappingCrossReference_4_0()); 
              	
            }

            }


            }

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:919:2: (otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:919:4: otherlv_5= 'constructor' otherlv_6= ':' ( (lv_constructorType_7_0= ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSimpleReferenceMapping1943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSimpleReferenceMappingAccess().getConstructorKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSimpleReferenceMapping1955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSimpleReferenceMappingAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:927:1: ( (lv_constructorType_7_0= ruleQualifiedName ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:928:1: (lv_constructorType_7_0= ruleQualifiedName )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:928:1: (lv_constructorType_7_0= ruleQualifiedName )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:929:3: lv_constructorType_7_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimpleReferenceMappingAccess().getConstructorTypeQualifiedNameParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSimpleReferenceMapping1976);
                    lv_constructorType_7_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimpleReferenceMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"constructorType",
                              		lv_constructorType_7_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:945:4: (otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:945:6: otherlv_8= 'get' ( (lv_getMethod_9_0= ruleGetMechanism ) )
                    {
                    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSimpleReferenceMapping1991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSimpleReferenceMappingAccess().getGetKeyword_6_0());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:949:1: ( (lv_getMethod_9_0= ruleGetMechanism ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:950:1: (lv_getMethod_9_0= ruleGetMechanism )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:950:1: (lv_getMethod_9_0= ruleGetMechanism )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:951:3: lv_getMethod_9_0= ruleGetMechanism
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimpleReferenceMappingAccess().getGetMethodGetMechanismParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGetMechanism_in_ruleSimpleReferenceMapping2012);
                    lv_getMethod_9_0=ruleGetMechanism();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimpleReferenceMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"getMethod",
                              		lv_getMethod_9_0, 
                              		"GetMechanism");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:967:4: (otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:967:6: otherlv_10= 'set' ( (lv_setMethod_11_0= ruleSetMechanism ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSimpleReferenceMapping2027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSimpleReferenceMappingAccess().getSetKeyword_7_0());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:971:1: ( (lv_setMethod_11_0= ruleSetMechanism ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:972:1: (lv_setMethod_11_0= ruleSetMechanism )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:972:1: (lv_setMethod_11_0= ruleSetMechanism )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:973:3: lv_setMethod_11_0= ruleSetMechanism
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimpleReferenceMappingAccess().getSetMethodSetMechanismParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSetMechanism_in_ruleSimpleReferenceMapping2048);
                    lv_setMethod_11_0=ruleSetMechanism();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimpleReferenceMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"setMethod",
                              		lv_setMethod_11_0, 
                              		"SetMechanism");
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
    // $ANTLR end "ruleSimpleReferenceMapping"


    // $ANTLR start "entryRuleGetMechanism"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:997:1: entryRuleGetMechanism returns [EObject current=null] : iv_ruleGetMechanism= ruleGetMechanism EOF ;
    public final EObject entryRuleGetMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetMechanism = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:998:2: (iv_ruleGetMechanism= ruleGetMechanism EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:999:2: iv_ruleGetMechanism= ruleGetMechanism EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGetMechanismRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGetMechanism_in_entryRuleGetMechanism2086);
            iv_ruleGetMechanism=ruleGetMechanism();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGetMechanism; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGetMechanism2096); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetMechanism"


    // $ANTLR start "ruleGetMechanism"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1006:1: ruleGetMechanism returns [EObject current=null] : (this_SimpleGet_0= ruleSimpleGet | this_GenericGet_1= ruleGenericGet | this_IteratorGet_2= ruleIteratorGet ) ;
    public final EObject ruleGetMechanism() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleGet_0 = null;

        EObject this_GenericGet_1 = null;

        EObject this_IteratorGet_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1009:28: ( (this_SimpleGet_0= ruleSimpleGet | this_GenericGet_1= ruleGenericGet | this_IteratorGet_2= ruleIteratorGet ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1010:1: (this_SimpleGet_0= ruleSimpleGet | this_GenericGet_1= ruleGenericGet | this_IteratorGet_2= ruleIteratorGet )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1010:1: (this_SimpleGet_0= ruleSimpleGet | this_GenericGet_1= ruleGenericGet | this_IteratorGet_2= ruleIteratorGet )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt22=1;
                }
                break;
            case 14:
                {
                alt22=2;
                }
                break;
            case 33:
                {
                alt22=3;
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
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1011:5: this_SimpleGet_0= ruleSimpleGet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGetMechanismAccess().getSimpleGetParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleGet_in_ruleGetMechanism2143);
                    this_SimpleGet_0=ruleSimpleGet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleGet_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1021:5: this_GenericGet_1= ruleGenericGet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGetMechanismAccess().getGenericGetParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGenericGet_in_ruleGetMechanism2170);
                    this_GenericGet_1=ruleGenericGet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GenericGet_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1031:5: this_IteratorGet_2= ruleIteratorGet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGetMechanismAccess().getIteratorGetParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIteratorGet_in_ruleGetMechanism2197);
                    this_IteratorGet_2=ruleIteratorGet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IteratorGet_2; 
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
    // $ANTLR end "ruleGetMechanism"


    // $ANTLR start "entryRuleSetMechanism"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1047:1: entryRuleSetMechanism returns [EObject current=null] : iv_ruleSetMechanism= ruleSetMechanism EOF ;
    public final EObject entryRuleSetMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetMechanism = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1048:2: (iv_ruleSetMechanism= ruleSetMechanism EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1049:2: iv_ruleSetMechanism= ruleSetMechanism EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetMechanismRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSetMechanism_in_entryRuleSetMechanism2232);
            iv_ruleSetMechanism=ruleSetMechanism();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetMechanism; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetMechanism2242); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetMechanism"


    // $ANTLR start "ruleSetMechanism"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1056:1: ruleSetMechanism returns [EObject current=null] : (this_SimpleSet_0= ruleSimpleSet | this_GenericSet_1= ruleGenericSet ) ;
    public final EObject ruleSetMechanism() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleSet_0 = null;

        EObject this_GenericSet_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1059:28: ( (this_SimpleSet_0= ruleSimpleSet | this_GenericSet_1= ruleGenericSet ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1060:1: (this_SimpleSet_0= ruleSimpleSet | this_GenericSet_1= ruleGenericSet )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1060:1: (this_SimpleSet_0= ruleSimpleSet | this_GenericSet_1= ruleGenericSet )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            else if ( (LA23_0==14) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1061:5: this_SimpleSet_0= ruleSimpleSet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetMechanismAccess().getSimpleSetParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleSet_in_ruleSetMechanism2289);
                    this_SimpleSet_0=ruleSimpleSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleSet_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1071:5: this_GenericSet_1= ruleGenericSet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSetMechanismAccess().getGenericSetParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGenericSet_in_ruleSetMechanism2316);
                    this_GenericSet_1=ruleGenericSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GenericSet_1; 
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
    // $ANTLR end "ruleSetMechanism"


    // $ANTLR start "entryRuleSimpleGet"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1087:1: entryRuleSimpleGet returns [EObject current=null] : iv_ruleSimpleGet= ruleSimpleGet EOF ;
    public final EObject entryRuleSimpleGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleGet = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1088:2: (iv_ruleSimpleGet= ruleSimpleGet EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1089:2: iv_ruleSimpleGet= ruleSimpleGet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleGetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleGet_in_entryRuleSimpleGet2351);
            iv_ruleSimpleGet=ruleSimpleGet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleGet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleGet2361); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleGet"


    // $ANTLR start "ruleSimpleGet"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1096:1: ruleSimpleGet returns [EObject current=null] : (otherlv_0= 'method' ( (lv_getter_1_0= ruleMethod ) ) ) ;
    public final EObject ruleSimpleGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_getter_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1099:28: ( (otherlv_0= 'method' ( (lv_getter_1_0= ruleMethod ) ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1100:1: (otherlv_0= 'method' ( (lv_getter_1_0= ruleMethod ) ) )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1100:1: (otherlv_0= 'method' ( (lv_getter_1_0= ruleMethod ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1100:3: otherlv_0= 'method' ( (lv_getter_1_0= ruleMethod ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSimpleGet2398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimpleGetAccess().getMethodKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1104:1: ( (lv_getter_1_0= ruleMethod ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1105:1: (lv_getter_1_0= ruleMethod )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1105:1: (lv_getter_1_0= ruleMethod )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1106:3: lv_getter_1_0= ruleMethod
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleGetAccess().getGetterMethodParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_ruleSimpleGet2419);
            lv_getter_1_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSimpleGetRule());
              	        }
                     		set(
                     			current, 
                     			"getter",
                      		lv_getter_1_0, 
                      		"Method");
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
    // $ANTLR end "ruleSimpleGet"


    // $ANTLR start "entryRuleSimpleSet"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1130:1: entryRuleSimpleSet returns [EObject current=null] : iv_ruleSimpleSet= ruleSimpleSet EOF ;
    public final EObject entryRuleSimpleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSet = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1131:2: (iv_ruleSimpleSet= ruleSimpleSet EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1132:2: iv_ruleSimpleSet= ruleSimpleSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleSet_in_entryRuleSimpleSet2455);
            iv_ruleSimpleSet=ruleSimpleSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleSet2465); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSet"


    // $ANTLR start "ruleSimpleSet"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1139:1: ruleSimpleSet returns [EObject current=null] : (otherlv_0= 'method' ( (lv_setter_1_0= ruleMethod ) ) ) ;
    public final EObject ruleSimpleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_setter_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1142:28: ( (otherlv_0= 'method' ( (lv_setter_1_0= ruleMethod ) ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1143:1: (otherlv_0= 'method' ( (lv_setter_1_0= ruleMethod ) ) )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1143:1: (otherlv_0= 'method' ( (lv_setter_1_0= ruleMethod ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1143:3: otherlv_0= 'method' ( (lv_setter_1_0= ruleMethod ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSimpleSet2502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimpleSetAccess().getMethodKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1147:1: ( (lv_setter_1_0= ruleMethod ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1148:1: (lv_setter_1_0= ruleMethod )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1148:1: (lv_setter_1_0= ruleMethod )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1149:3: lv_setter_1_0= ruleMethod
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleSetAccess().getSetterMethodParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_ruleSimpleSet2523);
            lv_setter_1_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSimpleSetRule());
              	        }
                     		set(
                     			current, 
                     			"setter",
                      		lv_setter_1_0, 
                      		"Method");
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
    // $ANTLR end "ruleSimpleSet"


    // $ANTLR start "entryRuleGenericGet"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1173:1: entryRuleGenericGet returns [EObject current=null] : iv_ruleGenericGet= ruleGenericGet EOF ;
    public final EObject entryRuleGenericGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericGet = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1174:2: (iv_ruleGenericGet= ruleGenericGet EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1175:2: iv_ruleGenericGet= ruleGenericGet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericGetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGenericGet_in_entryRuleGenericGet2559);
            iv_ruleGenericGet=ruleGenericGet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenericGet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericGet2569); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericGet"


    // $ANTLR start "ruleGenericGet"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1182:1: ruleGenericGet returns [EObject current=null] : (otherlv_0= 'generic' ( (lv_getter_1_0= ruleMethod ) ) ) ;
    public final EObject ruleGenericGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_getter_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1185:28: ( (otherlv_0= 'generic' ( (lv_getter_1_0= ruleMethod ) ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1186:1: (otherlv_0= 'generic' ( (lv_getter_1_0= ruleMethod ) ) )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1186:1: (otherlv_0= 'generic' ( (lv_getter_1_0= ruleMethod ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1186:3: otherlv_0= 'generic' ( (lv_getter_1_0= ruleMethod ) )
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGenericGet2606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGenericGetAccess().getGenericKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1190:1: ( (lv_getter_1_0= ruleMethod ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1191:1: (lv_getter_1_0= ruleMethod )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1191:1: (lv_getter_1_0= ruleMethod )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1192:3: lv_getter_1_0= ruleMethod
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenericGetAccess().getGetterMethodParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_ruleGenericGet2627);
            lv_getter_1_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGenericGetRule());
              	        }
                     		set(
                     			current, 
                     			"getter",
                      		lv_getter_1_0, 
                      		"Method");
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
    // $ANTLR end "ruleGenericGet"


    // $ANTLR start "entryRuleGenericSet"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1216:1: entryRuleGenericSet returns [EObject current=null] : iv_ruleGenericSet= ruleGenericSet EOF ;
    public final EObject entryRuleGenericSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericSet = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1217:2: (iv_ruleGenericSet= ruleGenericSet EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1218:2: iv_ruleGenericSet= ruleGenericSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGenericSet_in_entryRuleGenericSet2663);
            iv_ruleGenericSet=ruleGenericSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenericSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericSet2673); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericSet"


    // $ANTLR start "ruleGenericSet"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1225:1: ruleGenericSet returns [EObject current=null] : (otherlv_0= 'generic' ( (lv_setter_1_0= ruleMethod ) ) ) ;
    public final EObject ruleGenericSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_setter_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1228:28: ( (otherlv_0= 'generic' ( (lv_setter_1_0= ruleMethod ) ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1229:1: (otherlv_0= 'generic' ( (lv_setter_1_0= ruleMethod ) ) )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1229:1: (otherlv_0= 'generic' ( (lv_setter_1_0= ruleMethod ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1229:3: otherlv_0= 'generic' ( (lv_setter_1_0= ruleMethod ) )
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGenericSet2710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGenericSetAccess().getGenericKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1233:1: ( (lv_setter_1_0= ruleMethod ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1234:1: (lv_setter_1_0= ruleMethod )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1234:1: (lv_setter_1_0= ruleMethod )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1235:3: lv_setter_1_0= ruleMethod
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenericSetAccess().getSetterMethodParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_ruleGenericSet2731);
            lv_setter_1_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGenericSetRule());
              	        }
                     		set(
                     			current, 
                     			"setter",
                      		lv_setter_1_0, 
                      		"Method");
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
    // $ANTLR end "ruleGenericSet"


    // $ANTLR start "entryRuleIteratorGet"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1259:1: entryRuleIteratorGet returns [EObject current=null] : iv_ruleIteratorGet= ruleIteratorGet EOF ;
    public final EObject entryRuleIteratorGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteratorGet = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1260:2: (iv_ruleIteratorGet= ruleIteratorGet EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1261:2: iv_ruleIteratorGet= ruleIteratorGet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteratorGetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIteratorGet_in_entryRuleIteratorGet2767);
            iv_ruleIteratorGet=ruleIteratorGet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIteratorGet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIteratorGet2777); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIteratorGet"


    // $ANTLR start "ruleIteratorGet"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1268:1: ruleIteratorGet returns [EObject current=null] : (otherlv_0= 'iterator' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'method' ( (lv_getIterator_3_0= ruleMethod ) ) ) ;
    public final EObject ruleIteratorGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_getIterator_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1271:28: ( (otherlv_0= 'iterator' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'method' ( (lv_getIterator_3_0= ruleMethod ) ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1272:1: (otherlv_0= 'iterator' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'method' ( (lv_getIterator_3_0= ruleMethod ) ) )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1272:1: (otherlv_0= 'iterator' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'method' ( (lv_getIterator_3_0= ruleMethod ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1272:3: otherlv_0= 'iterator' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'method' ( (lv_getIterator_3_0= ruleMethod ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleIteratorGet2814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIteratorGetAccess().getIteratorKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1276:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1277:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1277:1: (otherlv_1= RULE_ID )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1278:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIteratorGetRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIteratorGet2834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getIteratorGetAccess().getIteratorIteratorDescriptionCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleIteratorGet2846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIteratorGetAccess().getMethodKeyword_2());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1293:1: ( (lv_getIterator_3_0= ruleMethod ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1294:1: (lv_getIterator_3_0= ruleMethod )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1294:1: (lv_getIterator_3_0= ruleMethod )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1295:3: lv_getIterator_3_0= ruleMethod
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIteratorGetAccess().getGetIteratorMethodParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_ruleIteratorGet2867);
            lv_getIterator_3_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIteratorGetRule());
              	        }
                     		set(
                     			current, 
                     			"getIterator",
                      		lv_getIterator_3_0, 
                      		"Method");
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
    // $ANTLR end "ruleIteratorGet"


    // $ANTLR start "entryRuleDeclaredElement"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1319:1: entryRuleDeclaredElement returns [EObject current=null] : iv_ruleDeclaredElement= ruleDeclaredElement EOF ;
    public final EObject entryRuleDeclaredElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredElement = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1320:2: (iv_ruleDeclaredElement= ruleDeclaredElement EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1321:2: iv_ruleDeclaredElement= ruleDeclaredElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaredElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclaredElement_in_entryRuleDeclaredElement2903);
            iv_ruleDeclaredElement=ruleDeclaredElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaredElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaredElement2913); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredElement"


    // $ANTLR start "ruleDeclaredElement"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1328:1: ruleDeclaredElement returns [EObject current=null] : (this_IteratorDescription_0= ruleIteratorDescription | this_ObserverDescription_1= ruleObserverDescription ) ;
    public final EObject ruleDeclaredElement() throws RecognitionException {
        EObject current = null;

        EObject this_IteratorDescription_0 = null;

        EObject this_ObserverDescription_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1331:28: ( (this_IteratorDescription_0= ruleIteratorDescription | this_ObserverDescription_1= ruleObserverDescription ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1332:1: (this_IteratorDescription_0= ruleIteratorDescription | this_ObserverDescription_1= ruleObserverDescription )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1332:1: (this_IteratorDescription_0= ruleIteratorDescription | this_ObserverDescription_1= ruleObserverDescription )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
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
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1333:5: this_IteratorDescription_0= ruleIteratorDescription
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclaredElementAccess().getIteratorDescriptionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIteratorDescription_in_ruleDeclaredElement2960);
                    this_IteratorDescription_0=ruleIteratorDescription();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IteratorDescription_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1343:5: this_ObserverDescription_1= ruleObserverDescription
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclaredElementAccess().getObserverDescriptionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleObserverDescription_in_ruleDeclaredElement2987);
                    this_ObserverDescription_1=ruleObserverDescription();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ObserverDescription_1; 
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
    // $ANTLR end "ruleDeclaredElement"


    // $ANTLR start "entryRuleIteratorDescription"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1359:1: entryRuleIteratorDescription returns [EObject current=null] : iv_ruleIteratorDescription= ruleIteratorDescription EOF ;
    public final EObject entryRuleIteratorDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteratorDescription = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1360:2: (iv_ruleIteratorDescription= ruleIteratorDescription EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1361:2: iv_ruleIteratorDescription= ruleIteratorDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteratorDescriptionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIteratorDescription_in_entryRuleIteratorDescription3022);
            iv_ruleIteratorDescription=ruleIteratorDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIteratorDescription; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIteratorDescription3032); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIteratorDescription"


    // $ANTLR start "ruleIteratorDescription"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1368:1: ruleIteratorDescription returns [EObject current=null] : (otherlv_0= 'iterator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_iteratorClass_3_0= ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'finished' ( (lv_hasFinished_6_0= ruleMethod ) ) otherlv_7= 'next' ( (lv_nextElement_8_0= ruleMethod ) ) otherlv_9= '}' ) ;
    public final EObject ruleIteratorDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_iteratorClass_3_0 = null;

        EObject lv_hasFinished_6_0 = null;

        EObject lv_nextElement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1371:28: ( (otherlv_0= 'iterator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_iteratorClass_3_0= ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'finished' ( (lv_hasFinished_6_0= ruleMethod ) ) otherlv_7= 'next' ( (lv_nextElement_8_0= ruleMethod ) ) otherlv_9= '}' ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1372:1: (otherlv_0= 'iterator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_iteratorClass_3_0= ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'finished' ( (lv_hasFinished_6_0= ruleMethod ) ) otherlv_7= 'next' ( (lv_nextElement_8_0= ruleMethod ) ) otherlv_9= '}' )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1372:1: (otherlv_0= 'iterator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_iteratorClass_3_0= ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'finished' ( (lv_hasFinished_6_0= ruleMethod ) ) otherlv_7= 'next' ( (lv_nextElement_8_0= ruleMethod ) ) otherlv_9= '}' )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1372:3: otherlv_0= 'iterator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_iteratorClass_3_0= ruleQualifiedName ) ) otherlv_4= '{' otherlv_5= 'finished' ( (lv_hasFinished_6_0= ruleMethod ) ) otherlv_7= 'next' ( (lv_nextElement_8_0= ruleMethod ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleIteratorDescription3069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIteratorDescriptionAccess().getIteratorKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1376:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1377:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1377:1: (lv_name_1_0= RULE_ID )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1378:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIteratorDescription3086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getIteratorDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIteratorDescriptionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleIteratorDescription3103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIteratorDescriptionAccess().getColonKeyword_2());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1398:1: ( (lv_iteratorClass_3_0= ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1399:1: (lv_iteratorClass_3_0= ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1399:1: (lv_iteratorClass_3_0= ruleQualifiedName )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1400:3: lv_iteratorClass_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIteratorDescriptionAccess().getIteratorClassQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleIteratorDescription3124);
            lv_iteratorClass_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIteratorDescriptionRule());
              	        }
                     		set(
                     			current, 
                     			"iteratorClass",
                      		lv_iteratorClass_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIteratorDescription3136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIteratorDescriptionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleIteratorDescription3148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIteratorDescriptionAccess().getFinishedKeyword_5());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1424:1: ( (lv_hasFinished_6_0= ruleMethod ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1425:1: (lv_hasFinished_6_0= ruleMethod )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1425:1: (lv_hasFinished_6_0= ruleMethod )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1426:3: lv_hasFinished_6_0= ruleMethod
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIteratorDescriptionAccess().getHasFinishedMethodParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_ruleIteratorDescription3169);
            lv_hasFinished_6_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIteratorDescriptionRule());
              	        }
                     		set(
                     			current, 
                     			"hasFinished",
                      		lv_hasFinished_6_0, 
                      		"Method");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleIteratorDescription3181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getIteratorDescriptionAccess().getNextKeyword_7());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1446:1: ( (lv_nextElement_8_0= ruleMethod ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1447:1: (lv_nextElement_8_0= ruleMethod )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1447:1: (lv_nextElement_8_0= ruleMethod )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1448:3: lv_nextElement_8_0= ruleMethod
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIteratorDescriptionAccess().getNextElementMethodParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_ruleIteratorDescription3202);
            lv_nextElement_8_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIteratorDescriptionRule());
              	        }
                     		set(
                     			current, 
                     			"nextElement",
                      		lv_nextElement_8_0, 
                      		"Method");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIteratorDescription3214); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getIteratorDescriptionAccess().getRightCurlyBracketKeyword_9());
                  
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
    // $ANTLR end "ruleIteratorDescription"


    // $ANTLR start "entryRuleObserverDescription"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1476:1: entryRuleObserverDescription returns [EObject current=null] : iv_ruleObserverDescription= ruleObserverDescription EOF ;
    public final EObject entryRuleObserverDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserverDescription = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1477:2: (iv_ruleObserverDescription= ruleObserverDescription EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1478:2: iv_ruleObserverDescription= ruleObserverDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObserverDescriptionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleObserverDescription_in_entryRuleObserverDescription3250);
            iv_ruleObserverDescription=ruleObserverDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObserverDescription; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObserverDescription3260); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObserverDescription"


    // $ANTLR start "ruleObserverDescription"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1485:1: ruleObserverDescription returns [EObject current=null] : (otherlv_0= 'observer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_observerClass_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_updateMethods_5_0= ruleUpdateMethod ) )+ otherlv_6= '}' ) ;
    public final EObject ruleObserverDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_observerClass_3_0 = null;

        EObject lv_updateMethods_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1488:28: ( (otherlv_0= 'observer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_observerClass_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_updateMethods_5_0= ruleUpdateMethod ) )+ otherlv_6= '}' ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1489:1: (otherlv_0= 'observer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_observerClass_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_updateMethods_5_0= ruleUpdateMethod ) )+ otherlv_6= '}' )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1489:1: (otherlv_0= 'observer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_observerClass_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_updateMethods_5_0= ruleUpdateMethod ) )+ otherlv_6= '}' )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1489:3: otherlv_0= 'observer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_observerClass_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_updateMethods_5_0= ruleUpdateMethod ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleObserverDescription3297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getObserverDescriptionAccess().getObserverKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1493:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1494:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1494:1: (lv_name_1_0= RULE_ID )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1495:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleObserverDescription3314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getObserverDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getObserverDescriptionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleObserverDescription3331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getObserverDescriptionAccess().getColonKeyword_2());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1515:1: ( (lv_observerClass_3_0= ruleQualifiedName ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1516:1: (lv_observerClass_3_0= ruleQualifiedName )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1516:1: (lv_observerClass_3_0= ruleQualifiedName )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1517:3: lv_observerClass_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObserverDescriptionAccess().getObserverClassQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleObserverDescription3352);
            lv_observerClass_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getObserverDescriptionRule());
              	        }
                     		set(
                     			current, 
                     			"observerClass",
                      		lv_observerClass_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleObserverDescription3364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getObserverDescriptionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1537:1: ( (lv_updateMethods_5_0= ruleUpdateMethod ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==37) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1538:1: (lv_updateMethods_5_0= ruleUpdateMethod )
            	    {
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1538:1: (lv_updateMethods_5_0= ruleUpdateMethod )
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1539:3: lv_updateMethods_5_0= ruleUpdateMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getObserverDescriptionAccess().getUpdateMethodsUpdateMethodParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleUpdateMethod_in_ruleObserverDescription3385);
            	    lv_updateMethods_5_0=ruleUpdateMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getObserverDescriptionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"updateMethods",
            	              		lv_updateMethods_5_0, 
            	              		"UpdateMethod");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleObserverDescription3398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getObserverDescriptionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleObserverDescription"


    // $ANTLR start "entryRuleUpdateMethod"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1567:1: entryRuleUpdateMethod returns [EObject current=null] : iv_ruleUpdateMethod= ruleUpdateMethod EOF ;
    public final EObject entryRuleUpdateMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateMethod = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1568:2: (iv_ruleUpdateMethod= ruleUpdateMethod EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1569:2: iv_ruleUpdateMethod= ruleUpdateMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateMethodRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUpdateMethod_in_entryRuleUpdateMethod3434);
            iv_ruleUpdateMethod=ruleUpdateMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateMethod; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUpdateMethod3444); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateMethod"


    // $ANTLR start "ruleUpdateMethod"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1576:1: ruleUpdateMethod returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= '[' ( (lv_interest_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_interest_4_0= RULE_INT ) ) )* otherlv_5= ']' )? ( (lv_name_6_0= ruleEString ) ) otherlv_7= '(' ( ( (lv_parameterTypes_8_0= ruleQualifiedName ) ) (otherlv_9= ',' ( (lv_parameterTypes_10_0= ruleQualifiedName ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( ( ( (lv_returnArray_13_0= 'Array' ) ) otherlv_14= '<' ( (lv_returnType_15_0= ruleQualifiedName ) ) otherlv_16= '>' ) | ( ( (lv_returnCollection_17_0= 'Collection' ) ) otherlv_18= '<' ( (lv_returnType_19_0= ruleQualifiedName ) ) otherlv_20= '>' ) | ( (lv_returnType_21_0= ruleQualifiedName ) ) | ( (lv_returnVoid_22_0= 'void' ) ) ) ) ;
    public final EObject ruleUpdateMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_interest_2_0=null;
        Token otherlv_3=null;
        Token lv_interest_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_returnArray_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_returnCollection_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_returnVoid_22_0=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_parameterTypes_8_0 = null;

        AntlrDatatypeRuleToken lv_parameterTypes_10_0 = null;

        AntlrDatatypeRuleToken lv_returnType_15_0 = null;

        AntlrDatatypeRuleToken lv_returnType_19_0 = null;

        AntlrDatatypeRuleToken lv_returnType_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1579:28: ( (otherlv_0= 'update' (otherlv_1= '[' ( (lv_interest_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_interest_4_0= RULE_INT ) ) )* otherlv_5= ']' )? ( (lv_name_6_0= ruleEString ) ) otherlv_7= '(' ( ( (lv_parameterTypes_8_0= ruleQualifiedName ) ) (otherlv_9= ',' ( (lv_parameterTypes_10_0= ruleQualifiedName ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( ( ( (lv_returnArray_13_0= 'Array' ) ) otherlv_14= '<' ( (lv_returnType_15_0= ruleQualifiedName ) ) otherlv_16= '>' ) | ( ( (lv_returnCollection_17_0= 'Collection' ) ) otherlv_18= '<' ( (lv_returnType_19_0= ruleQualifiedName ) ) otherlv_20= '>' ) | ( (lv_returnType_21_0= ruleQualifiedName ) ) | ( (lv_returnVoid_22_0= 'void' ) ) ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1580:1: (otherlv_0= 'update' (otherlv_1= '[' ( (lv_interest_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_interest_4_0= RULE_INT ) ) )* otherlv_5= ']' )? ( (lv_name_6_0= ruleEString ) ) otherlv_7= '(' ( ( (lv_parameterTypes_8_0= ruleQualifiedName ) ) (otherlv_9= ',' ( (lv_parameterTypes_10_0= ruleQualifiedName ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( ( ( (lv_returnArray_13_0= 'Array' ) ) otherlv_14= '<' ( (lv_returnType_15_0= ruleQualifiedName ) ) otherlv_16= '>' ) | ( ( (lv_returnCollection_17_0= 'Collection' ) ) otherlv_18= '<' ( (lv_returnType_19_0= ruleQualifiedName ) ) otherlv_20= '>' ) | ( (lv_returnType_21_0= ruleQualifiedName ) ) | ( (lv_returnVoid_22_0= 'void' ) ) ) )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1580:1: (otherlv_0= 'update' (otherlv_1= '[' ( (lv_interest_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_interest_4_0= RULE_INT ) ) )* otherlv_5= ']' )? ( (lv_name_6_0= ruleEString ) ) otherlv_7= '(' ( ( (lv_parameterTypes_8_0= ruleQualifiedName ) ) (otherlv_9= ',' ( (lv_parameterTypes_10_0= ruleQualifiedName ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( ( ( (lv_returnArray_13_0= 'Array' ) ) otherlv_14= '<' ( (lv_returnType_15_0= ruleQualifiedName ) ) otherlv_16= '>' ) | ( ( (lv_returnCollection_17_0= 'Collection' ) ) otherlv_18= '<' ( (lv_returnType_19_0= ruleQualifiedName ) ) otherlv_20= '>' ) | ( (lv_returnType_21_0= ruleQualifiedName ) ) | ( (lv_returnVoid_22_0= 'void' ) ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1580:3: otherlv_0= 'update' (otherlv_1= '[' ( (lv_interest_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_interest_4_0= RULE_INT ) ) )* otherlv_5= ']' )? ( (lv_name_6_0= ruleEString ) ) otherlv_7= '(' ( ( (lv_parameterTypes_8_0= ruleQualifiedName ) ) (otherlv_9= ',' ( (lv_parameterTypes_10_0= ruleQualifiedName ) ) )* )? otherlv_11= ')' otherlv_12= ':' ( ( ( (lv_returnArray_13_0= 'Array' ) ) otherlv_14= '<' ( (lv_returnType_15_0= ruleQualifiedName ) ) otherlv_16= '>' ) | ( ( (lv_returnCollection_17_0= 'Collection' ) ) otherlv_18= '<' ( (lv_returnType_19_0= ruleQualifiedName ) ) otherlv_20= '>' ) | ( (lv_returnType_21_0= ruleQualifiedName ) ) | ( (lv_returnVoid_22_0= 'void' ) ) )
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleUpdateMethod3481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateMethodAccess().getUpdateKeyword_0());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1584:1: (otherlv_1= '[' ( (lv_interest_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_interest_4_0= RULE_INT ) ) )* otherlv_5= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1584:3: otherlv_1= '[' ( (lv_interest_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_interest_4_0= RULE_INT ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleUpdateMethod3494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUpdateMethodAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1588:1: ( (lv_interest_2_0= RULE_INT ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1589:1: (lv_interest_2_0= RULE_INT )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1589:1: (lv_interest_2_0= RULE_INT )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1590:3: lv_interest_2_0= RULE_INT
                    {
                    lv_interest_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUpdateMethod3511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_interest_2_0, grammarAccess.getUpdateMethodAccess().getInterestINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUpdateMethodRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"interest",
                              		lv_interest_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1606:2: (otherlv_3= ',' ( (lv_interest_4_0= RULE_INT ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==23) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1606:4: otherlv_3= ',' ( (lv_interest_4_0= RULE_INT ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleUpdateMethod3529); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getUpdateMethodAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1610:1: ( (lv_interest_4_0= RULE_INT ) )
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1611:1: (lv_interest_4_0= RULE_INT )
                    	    {
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1611:1: (lv_interest_4_0= RULE_INT )
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1612:3: lv_interest_4_0= RULE_INT
                    	    {
                    	    lv_interest_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUpdateMethod3546); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_interest_4_0, grammarAccess.getUpdateMethodAccess().getInterestINTTerminalRuleCall_1_2_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getUpdateMethodRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"interest",
                    	              		lv_interest_4_0, 
                    	              		"INT");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleUpdateMethod3565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getUpdateMethodAccess().getRightSquareBracketKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1632:3: ( (lv_name_6_0= ruleEString ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1633:1: (lv_name_6_0= ruleEString )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1633:1: (lv_name_6_0= ruleEString )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1634:3: lv_name_6_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateMethodAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUpdateMethod3588);
            lv_name_6_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateMethodRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleUpdateMethod3600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUpdateMethodAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1654:1: ( ( (lv_parameterTypes_8_0= ruleQualifiedName ) ) (otherlv_9= ',' ( (lv_parameterTypes_10_0= ruleQualifiedName ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1654:2: ( (lv_parameterTypes_8_0= ruleQualifiedName ) ) (otherlv_9= ',' ( (lv_parameterTypes_10_0= ruleQualifiedName ) ) )*
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1654:2: ( (lv_parameterTypes_8_0= ruleQualifiedName ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1655:1: (lv_parameterTypes_8_0= ruleQualifiedName )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1655:1: (lv_parameterTypes_8_0= ruleQualifiedName )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1656:3: lv_parameterTypes_8_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateMethodAccess().getParameterTypesQualifiedNameParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleUpdateMethod3622);
                    lv_parameterTypes_8_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"parameterTypes",
                              		lv_parameterTypes_8_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1672:2: (otherlv_9= ',' ( (lv_parameterTypes_10_0= ruleQualifiedName ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==23) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1672:4: otherlv_9= ',' ( (lv_parameterTypes_10_0= ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleUpdateMethod3635); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getUpdateMethodAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1676:1: ( (lv_parameterTypes_10_0= ruleQualifiedName ) )
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1677:1: (lv_parameterTypes_10_0= ruleQualifiedName )
                    	    {
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1677:1: (lv_parameterTypes_10_0= ruleQualifiedName )
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1678:3: lv_parameterTypes_10_0= ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getUpdateMethodAccess().getParameterTypesQualifiedNameParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleUpdateMethod3656);
                    	    lv_parameterTypes_10_0=ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getUpdateMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameterTypes",
                    	              		lv_parameterTypes_10_0, 
                    	              		"QualifiedName");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleUpdateMethod3672); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getUpdateMethodAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_12=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleUpdateMethod3684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getUpdateMethodAccess().getColonKeyword_6());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1702:1: ( ( ( (lv_returnArray_13_0= 'Array' ) ) otherlv_14= '<' ( (lv_returnType_15_0= ruleQualifiedName ) ) otherlv_16= '>' ) | ( ( (lv_returnCollection_17_0= 'Collection' ) ) otherlv_18= '<' ( (lv_returnType_19_0= ruleQualifiedName ) ) otherlv_20= '>' ) | ( (lv_returnType_21_0= ruleQualifiedName ) ) | ( (lv_returnVoid_22_0= 'void' ) ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt30=1;
                }
                break;
            case 43:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
                {
                alt30=3;
                }
                break;
            case 44:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1702:2: ( ( (lv_returnArray_13_0= 'Array' ) ) otherlv_14= '<' ( (lv_returnType_15_0= ruleQualifiedName ) ) otherlv_16= '>' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1702:2: ( ( (lv_returnArray_13_0= 'Array' ) ) otherlv_14= '<' ( (lv_returnType_15_0= ruleQualifiedName ) ) otherlv_16= '>' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1702:3: ( (lv_returnArray_13_0= 'Array' ) ) otherlv_14= '<' ( (lv_returnType_15_0= ruleQualifiedName ) ) otherlv_16= '>'
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1702:3: ( (lv_returnArray_13_0= 'Array' ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1703:1: (lv_returnArray_13_0= 'Array' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1703:1: (lv_returnArray_13_0= 'Array' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1704:3: lv_returnArray_13_0= 'Array'
                    {
                    lv_returnArray_13_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleUpdateMethod3704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_returnArray_13_0, grammarAccess.getUpdateMethodAccess().getReturnArrayArrayKeyword_7_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUpdateMethodRule());
                      	        }
                             		setWithLastConsumed(current, "returnArray", true, "Array");
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleUpdateMethod3729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getUpdateMethodAccess().getLessThanSignKeyword_7_0_1());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1721:1: ( (lv_returnType_15_0= ruleQualifiedName ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1722:1: (lv_returnType_15_0= ruleQualifiedName )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1722:1: (lv_returnType_15_0= ruleQualifiedName )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1723:3: lv_returnType_15_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateMethodAccess().getReturnTypeQualifiedNameParserRuleCall_7_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleUpdateMethod3750);
                    lv_returnType_15_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"returnType",
                              		lv_returnType_15_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleUpdateMethod3762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getUpdateMethodAccess().getGreaterThanSignKeyword_7_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1744:6: ( ( (lv_returnCollection_17_0= 'Collection' ) ) otherlv_18= '<' ( (lv_returnType_19_0= ruleQualifiedName ) ) otherlv_20= '>' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1744:6: ( ( (lv_returnCollection_17_0= 'Collection' ) ) otherlv_18= '<' ( (lv_returnType_19_0= ruleQualifiedName ) ) otherlv_20= '>' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1744:7: ( (lv_returnCollection_17_0= 'Collection' ) ) otherlv_18= '<' ( (lv_returnType_19_0= ruleQualifiedName ) ) otherlv_20= '>'
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1744:7: ( (lv_returnCollection_17_0= 'Collection' ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1745:1: (lv_returnCollection_17_0= 'Collection' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1745:1: (lv_returnCollection_17_0= 'Collection' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1746:3: lv_returnCollection_17_0= 'Collection'
                    {
                    lv_returnCollection_17_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleUpdateMethod3788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_returnCollection_17_0, grammarAccess.getUpdateMethodAccess().getReturnCollectionCollectionKeyword_7_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUpdateMethodRule());
                      	        }
                             		setWithLastConsumed(current, "returnCollection", true, "Collection");
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleUpdateMethod3813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getUpdateMethodAccess().getLessThanSignKeyword_7_1_1());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1763:1: ( (lv_returnType_19_0= ruleQualifiedName ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1764:1: (lv_returnType_19_0= ruleQualifiedName )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1764:1: (lv_returnType_19_0= ruleQualifiedName )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1765:3: lv_returnType_19_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateMethodAccess().getReturnTypeQualifiedNameParserRuleCall_7_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleUpdateMethod3834);
                    lv_returnType_19_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"returnType",
                              		lv_returnType_19_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleUpdateMethod3846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getUpdateMethodAccess().getGreaterThanSignKeyword_7_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1786:6: ( (lv_returnType_21_0= ruleQualifiedName ) )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1786:6: ( (lv_returnType_21_0= ruleQualifiedName ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1787:1: (lv_returnType_21_0= ruleQualifiedName )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1787:1: (lv_returnType_21_0= ruleQualifiedName )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1788:3: lv_returnType_21_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateMethodAccess().getReturnTypeQualifiedNameParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleUpdateMethod3874);
                    lv_returnType_21_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"returnType",
                              		lv_returnType_21_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1805:6: ( (lv_returnVoid_22_0= 'void' ) )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1805:6: ( (lv_returnVoid_22_0= 'void' ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1806:1: (lv_returnVoid_22_0= 'void' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1806:1: (lv_returnVoid_22_0= 'void' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1807:3: lv_returnVoid_22_0= 'void'
                    {
                    lv_returnVoid_22_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleUpdateMethod3898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_returnVoid_22_0, grammarAccess.getUpdateMethodAccess().getReturnVoidVoidKeyword_7_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUpdateMethodRule());
                      	        }
                             		setWithLastConsumed(current, "returnVoid", true, "void");
                      	    
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
    // $ANTLR end "ruleUpdateMethod"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1828:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1829:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1830:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString3949);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString3960); if (state.failed) return current;

            }

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
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1837:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1840:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1841:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1841:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1841:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString4000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1849:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString4026); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMethod"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1864:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1865:2: (iv_ruleMethod= ruleMethod EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1866:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_entryRuleMethod4071);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethod4081); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1873:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleQualifiedName ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( ( ( (lv_returnArray_7_0= 'Array' ) ) otherlv_8= '<' ( (lv_returnType_9_0= ruleQualifiedName ) ) otherlv_10= '>' ) | ( ( (lv_returnCollection_11_0= 'Collection' ) ) otherlv_12= '<' ( (lv_returnType_13_0= ruleQualifiedName ) ) otherlv_14= '>' ) | ( (lv_returnType_15_0= ruleQualifiedName ) ) | ( (lv_returnVoid_16_0= 'void' ) ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_returnArray_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_returnCollection_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_returnVoid_16_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_parameterTypes_2_0 = null;

        AntlrDatatypeRuleToken lv_parameterTypes_4_0 = null;

        AntlrDatatypeRuleToken lv_returnType_9_0 = null;

        AntlrDatatypeRuleToken lv_returnType_13_0 = null;

        AntlrDatatypeRuleToken lv_returnType_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1876:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleQualifiedName ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( ( ( (lv_returnArray_7_0= 'Array' ) ) otherlv_8= '<' ( (lv_returnType_9_0= ruleQualifiedName ) ) otherlv_10= '>' ) | ( ( (lv_returnCollection_11_0= 'Collection' ) ) otherlv_12= '<' ( (lv_returnType_13_0= ruleQualifiedName ) ) otherlv_14= '>' ) | ( (lv_returnType_15_0= ruleQualifiedName ) ) | ( (lv_returnVoid_16_0= 'void' ) ) ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1877:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleQualifiedName ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( ( ( (lv_returnArray_7_0= 'Array' ) ) otherlv_8= '<' ( (lv_returnType_9_0= ruleQualifiedName ) ) otherlv_10= '>' ) | ( ( (lv_returnCollection_11_0= 'Collection' ) ) otherlv_12= '<' ( (lv_returnType_13_0= ruleQualifiedName ) ) otherlv_14= '>' ) | ( (lv_returnType_15_0= ruleQualifiedName ) ) | ( (lv_returnVoid_16_0= 'void' ) ) ) )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1877:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleQualifiedName ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( ( ( (lv_returnArray_7_0= 'Array' ) ) otherlv_8= '<' ( (lv_returnType_9_0= ruleQualifiedName ) ) otherlv_10= '>' ) | ( ( (lv_returnCollection_11_0= 'Collection' ) ) otherlv_12= '<' ( (lv_returnType_13_0= ruleQualifiedName ) ) otherlv_14= '>' ) | ( (lv_returnType_15_0= ruleQualifiedName ) ) | ( (lv_returnVoid_16_0= 'void' ) ) ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1877:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleQualifiedName ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( ( ( (lv_returnArray_7_0= 'Array' ) ) otherlv_8= '<' ( (lv_returnType_9_0= ruleQualifiedName ) ) otherlv_10= '>' ) | ( ( (lv_returnCollection_11_0= 'Collection' ) ) otherlv_12= '<' ( (lv_returnType_13_0= ruleQualifiedName ) ) otherlv_14= '>' ) | ( (lv_returnType_15_0= ruleQualifiedName ) ) | ( (lv_returnVoid_16_0= 'void' ) ) )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1877:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1878:1: (lv_name_0_0= ruleEString )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1878:1: (lv_name_0_0= ruleEString )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1879:3: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMethod4127);
            lv_name_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodRule());
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

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMethod4139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1899:1: ( ( (lv_parameterTypes_2_0= ruleQualifiedName ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleQualifiedName ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1899:2: ( (lv_parameterTypes_2_0= ruleQualifiedName ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleQualifiedName ) ) )*
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1899:2: ( (lv_parameterTypes_2_0= ruleQualifiedName ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1900:1: (lv_parameterTypes_2_0= ruleQualifiedName )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1900:1: (lv_parameterTypes_2_0= ruleQualifiedName )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1901:3: lv_parameterTypes_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getParameterTypesQualifiedNameParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMethod4161);
                    lv_parameterTypes_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"parameterTypes",
                              		lv_parameterTypes_2_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1917:2: (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleQualifiedName ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==23) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1917:4: otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleQualifiedName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMethod4174); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1921:1: ( (lv_parameterTypes_4_0= ruleQualifiedName ) )
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1922:1: (lv_parameterTypes_4_0= ruleQualifiedName )
                    	    {
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1922:1: (lv_parameterTypes_4_0= ruleQualifiedName )
                    	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1923:3: lv_parameterTypes_4_0= ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodAccess().getParameterTypesQualifiedNameParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMethod4195);
                    	    lv_parameterTypes_4_0=ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameterTypes",
                    	              		lv_parameterTypes_4_0, 
                    	              		"QualifiedName");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMethod4211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMethod4223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getColonKeyword_4());
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1947:1: ( ( ( (lv_returnArray_7_0= 'Array' ) ) otherlv_8= '<' ( (lv_returnType_9_0= ruleQualifiedName ) ) otherlv_10= '>' ) | ( ( (lv_returnCollection_11_0= 'Collection' ) ) otherlv_12= '<' ( (lv_returnType_13_0= ruleQualifiedName ) ) otherlv_14= '>' ) | ( (lv_returnType_15_0= ruleQualifiedName ) ) | ( (lv_returnVoid_16_0= 'void' ) ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt34=1;
                }
                break;
            case 43:
                {
                alt34=2;
                }
                break;
            case RULE_ID:
                {
                alt34=3;
                }
                break;
            case 44:
                {
                alt34=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1947:2: ( ( (lv_returnArray_7_0= 'Array' ) ) otherlv_8= '<' ( (lv_returnType_9_0= ruleQualifiedName ) ) otherlv_10= '>' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1947:2: ( ( (lv_returnArray_7_0= 'Array' ) ) otherlv_8= '<' ( (lv_returnType_9_0= ruleQualifiedName ) ) otherlv_10= '>' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1947:3: ( (lv_returnArray_7_0= 'Array' ) ) otherlv_8= '<' ( (lv_returnType_9_0= ruleQualifiedName ) ) otherlv_10= '>'
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1947:3: ( (lv_returnArray_7_0= 'Array' ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1948:1: (lv_returnArray_7_0= 'Array' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1948:1: (lv_returnArray_7_0= 'Array' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1949:3: lv_returnArray_7_0= 'Array'
                    {
                    lv_returnArray_7_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMethod4243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_returnArray_7_0, grammarAccess.getMethodAccess().getReturnArrayArrayKeyword_5_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodRule());
                      	        }
                             		setWithLastConsumed(current, "returnArray", true, "Array");
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMethod4268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getLessThanSignKeyword_5_0_1());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1966:1: ( (lv_returnType_9_0= ruleQualifiedName ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1967:1: (lv_returnType_9_0= ruleQualifiedName )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1967:1: (lv_returnType_9_0= ruleQualifiedName )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1968:3: lv_returnType_9_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeQualifiedNameParserRuleCall_5_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMethod4289);
                    lv_returnType_9_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"returnType",
                              		lv_returnType_9_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMethod4301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getGreaterThanSignKeyword_5_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1989:6: ( ( (lv_returnCollection_11_0= 'Collection' ) ) otherlv_12= '<' ( (lv_returnType_13_0= ruleQualifiedName ) ) otherlv_14= '>' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1989:6: ( ( (lv_returnCollection_11_0= 'Collection' ) ) otherlv_12= '<' ( (lv_returnType_13_0= ruleQualifiedName ) ) otherlv_14= '>' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1989:7: ( (lv_returnCollection_11_0= 'Collection' ) ) otherlv_12= '<' ( (lv_returnType_13_0= ruleQualifiedName ) ) otherlv_14= '>'
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1989:7: ( (lv_returnCollection_11_0= 'Collection' ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1990:1: (lv_returnCollection_11_0= 'Collection' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1990:1: (lv_returnCollection_11_0= 'Collection' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:1991:3: lv_returnCollection_11_0= 'Collection'
                    {
                    lv_returnCollection_11_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMethod4327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_returnCollection_11_0, grammarAccess.getMethodAccess().getReturnCollectionCollectionKeyword_5_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodRule());
                      	        }
                             		setWithLastConsumed(current, "returnCollection", true, "Collection");
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMethod4352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getMethodAccess().getLessThanSignKeyword_5_1_1());
                          
                    }
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2008:1: ( (lv_returnType_13_0= ruleQualifiedName ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2009:1: (lv_returnType_13_0= ruleQualifiedName )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2009:1: (lv_returnType_13_0= ruleQualifiedName )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2010:3: lv_returnType_13_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeQualifiedNameParserRuleCall_5_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMethod4373);
                    lv_returnType_13_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"returnType",
                              		lv_returnType_13_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMethod4385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getMethodAccess().getGreaterThanSignKeyword_5_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2031:6: ( (lv_returnType_15_0= ruleQualifiedName ) )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2031:6: ( (lv_returnType_15_0= ruleQualifiedName ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2032:1: (lv_returnType_15_0= ruleQualifiedName )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2032:1: (lv_returnType_15_0= ruleQualifiedName )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2033:3: lv_returnType_15_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeQualifiedNameParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMethod4413);
                    lv_returnType_15_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"returnType",
                              		lv_returnType_15_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2050:6: ( (lv_returnVoid_16_0= 'void' ) )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2050:6: ( (lv_returnVoid_16_0= 'void' ) )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2051:1: (lv_returnVoid_16_0= 'void' )
                    {
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2051:1: (lv_returnVoid_16_0= 'void' )
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2052:3: lv_returnVoid_16_0= 'void'
                    {
                    lv_returnVoid_16_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMethod4437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_returnVoid_16_0, grammarAccess.getMethodAccess().getReturnVoidVoidKeyword_5_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodRule());
                      	        }
                             		setWithLastConsumed(current, "returnVoid", true, "void");
                      	    
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2073:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2074:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2075:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean4488);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean4499); if (state.failed) return current;

            }

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
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2082:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2085:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2086:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2086:1: (kw= 'true' | kw= 'false' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            else if ( (LA35_0==46) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2087:2: kw= 'true'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEBoolean4537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2094:2: kw= 'false'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEBoolean4556); if (state.failed) return current;
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
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2107:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2108:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2109:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4597);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName4608); if (state.failed) return current;

            }

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
    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2116:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2119:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2120:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2120:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2120:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName4648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2127:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==47) && (synpred1_InternalApiDescriptionLanguage())) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2127:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2127:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2127:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleQualifiedName4676); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName4692); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
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

    // $ANTLR start synpred1_InternalApiDescriptionLanguage
    public final void synpred1_InternalApiDescriptionLanguage_fragment() throws RecognitionException {   
        // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2127:3: ( '.' )
        // ../org.eclectic.apidesc.language/src-gen/org/eclectic/parser/antlr/internal/InternalApiDescriptionLanguage.g:2128:2: '.'
        {
        match(input,47,FollowSets000.FOLLOW_47_in_synpred1_InternalApiDescriptionLanguage4667); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalApiDescriptionLanguage

    // Delegated rules

    public final boolean synpred1_InternalApiDescriptionLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalApiDescriptionLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleApiDescription_in_entryRuleApiDescription75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleApiDescription85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleApiDescription122 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleApiDescription143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleApiDescription155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleApiDescription167 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleApiDescription188 = new BitSet(new long[]{0x0000001200014000L});
        public static final BitSet FOLLOW_14_in_ruleApiDescription201 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleApiDescription213 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleApiDescription234 = new BitSet(new long[]{0x0000001200014000L});
        public static final BitSet FOLLOW_ruleDeclaredElement_in_ruleApiDescription257 = new BitSet(new long[]{0x0000001200014000L});
        public static final BitSet FOLLOW_ruleClassMapping_in_ruleApiDescription279 = new BitSet(new long[]{0x0000001200014002L});
        public static final BitSet FOLLOW_ruleClassMapping_in_entryRuleClassMapping316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassMapping326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleClassMapping_in_ruleClassMapping372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleClassMapping_in_entryRuleSimpleClassMapping406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleClassMapping416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleSimpleClassMapping453 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleClassMapping474 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSimpleClassMapping486 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSimpleClassMapping507 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleSimpleClassMapping520 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_ruleCreationMechanism_in_ruleSimpleClassMapping541 = new BitSet(new long[]{0x0000000088080000L});
        public static final BitSet FOLLOW_ruleFeatureMapping_in_ruleSimpleClassMapping562 = new BitSet(new long[]{0x0000000088080000L});
        public static final BitSet FOLLOW_19_in_ruleSimpleClassMapping575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCreationMechanism_in_entryRuleCreationMechanism613 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCreationMechanism623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmptyConstructor_in_ruleCreationMechanism670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonEmptyConstructor_in_ruleCreationMechanism697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmptyConstructor_in_entryRuleEmptyConstructor732 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmptyConstructor742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleEmptyConstructor779 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEmptyConstructor800 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleEmptyConstructor813 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleEmptyConstructor834 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_19_in_ruleEmptyConstructor847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonEmptyConstructor_in_entryRuleNonEmptyConstructor885 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNonEmptyConstructor895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleNonEmptyConstructor941 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleNonEmptyConstructor953 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNonEmptyConstructor973 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleNonEmptyConstructor986 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNonEmptyConstructor1006 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleNonEmptyConstructor1020 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleNonEmptyConstructor1033 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleNonEmptyConstructor1054 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_19_in_ruleNonEmptyConstructor1067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1105 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatement1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetFeature_in_ruleStatement1161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetFeature_in_entryRuleSetFeature1195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetFeature1205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleSetFeature1242 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetFeature1262 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleSetFeature1274 = new BitSet(new long[]{0x0000600000000060L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSetFeature1292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSetFeature1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleSetFeature1352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMapping_in_entryRuleFeatureMapping1389 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMapping1399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAttributeMapping_in_ruleFeatureMapping1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleReferenceMapping_in_ruleFeatureMapping1473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAttributeMapping_in_entryRuleSimpleAttributeMapping1508 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttributeMapping1518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSimpleAttributeMapping1555 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleAttributeMapping1576 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_28_in_ruleSimpleAttributeMapping1594 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleSimpleAttributeMapping1620 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleAttributeMapping1637 = new BitSet(new long[]{0x0000000042200002L});
        public static final BitSet FOLLOW_21_in_ruleSimpleAttributeMapping1655 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleSimpleAttributeMapping1667 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSimpleAttributeMapping1688 = new BitSet(new long[]{0x0000000042000002L});
        public static final BitSet FOLLOW_30_in_ruleSimpleAttributeMapping1703 = new BitSet(new long[]{0x0000000300004000L});
        public static final BitSet FOLLOW_ruleGetMechanism_in_ruleSimpleAttributeMapping1724 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleSimpleAttributeMapping1739 = new BitSet(new long[]{0x0000000100004000L});
        public static final BitSet FOLLOW_ruleSetMechanism_in_ruleSimpleAttributeMapping1760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleReferenceMapping_in_entryRuleSimpleReferenceMapping1798 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleReferenceMapping1808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSimpleReferenceMapping1845 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleReferenceMapping1866 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_28_in_ruleSimpleReferenceMapping1884 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleSimpleReferenceMapping1910 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleReferenceMapping1930 = new BitSet(new long[]{0x0000000042200002L});
        public static final BitSet FOLLOW_21_in_ruleSimpleReferenceMapping1943 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleSimpleReferenceMapping1955 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSimpleReferenceMapping1976 = new BitSet(new long[]{0x0000000042000002L});
        public static final BitSet FOLLOW_30_in_ruleSimpleReferenceMapping1991 = new BitSet(new long[]{0x0000000300004000L});
        public static final BitSet FOLLOW_ruleGetMechanism_in_ruleSimpleReferenceMapping2012 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleSimpleReferenceMapping2027 = new BitSet(new long[]{0x0000000100004000L});
        public static final BitSet FOLLOW_ruleSetMechanism_in_ruleSimpleReferenceMapping2048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGetMechanism_in_entryRuleGetMechanism2086 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGetMechanism2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleGet_in_ruleGetMechanism2143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericGet_in_ruleGetMechanism2170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIteratorGet_in_ruleGetMechanism2197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetMechanism_in_entryRuleSetMechanism2232 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetMechanism2242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleSet_in_ruleSetMechanism2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericSet_in_ruleSetMechanism2316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleGet_in_entryRuleSimpleGet2351 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleGet2361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleSimpleGet2398 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleMethod_in_ruleSimpleGet2419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleSet_in_entryRuleSimpleSet2455 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSet2465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleSimpleSet2502 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleMethod_in_ruleSimpleSet2523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericGet_in_entryRuleGenericGet2559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericGet2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleGenericGet2606 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleMethod_in_ruleGenericGet2627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericSet_in_entryRuleGenericSet2663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericSet2673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleGenericSet2710 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleMethod_in_ruleGenericSet2731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIteratorGet_in_entryRuleIteratorGet2767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIteratorGet2777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleIteratorGet2814 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIteratorGet2834 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleIteratorGet2846 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleMethod_in_ruleIteratorGet2867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredElement_in_entryRuleDeclaredElement2903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredElement2913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIteratorDescription_in_ruleDeclaredElement2960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObserverDescription_in_ruleDeclaredElement2987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIteratorDescription_in_entryRuleIteratorDescription3022 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIteratorDescription3032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleIteratorDescription3069 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIteratorDescription3086 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleIteratorDescription3103 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleIteratorDescription3124 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIteratorDescription3136 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleIteratorDescription3148 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleMethod_in_ruleIteratorDescription3169 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleIteratorDescription3181 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleMethod_in_ruleIteratorDescription3202 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIteratorDescription3214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObserverDescription_in_entryRuleObserverDescription3250 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObserverDescription3260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleObserverDescription3297 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleObserverDescription3314 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleObserverDescription3331 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObserverDescription3352 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleObserverDescription3364 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleUpdateMethod_in_ruleObserverDescription3385 = new BitSet(new long[]{0x0000002000080000L});
        public static final BitSet FOLLOW_19_in_ruleObserverDescription3398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUpdateMethod_in_entryRuleUpdateMethod3434 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUpdateMethod3444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleUpdateMethod3481 = new BitSet(new long[]{0x0000004000000050L});
        public static final BitSet FOLLOW_38_in_ruleUpdateMethod3494 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUpdateMethod3511 = new BitSet(new long[]{0x0000008000800000L});
        public static final BitSet FOLLOW_23_in_ruleUpdateMethod3529 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUpdateMethod3546 = new BitSet(new long[]{0x0000008000800000L});
        public static final BitSet FOLLOW_39_in_ruleUpdateMethod3565 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUpdateMethod3588 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleUpdateMethod3600 = new BitSet(new long[]{0x0000000001000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUpdateMethod3622 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleUpdateMethod3635 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUpdateMethod3656 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleUpdateMethod3672 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleUpdateMethod3684 = new BitSet(new long[]{0x0000190000000010L});
        public static final BitSet FOLLOW_40_in_ruleUpdateMethod3704 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleUpdateMethod3729 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUpdateMethod3750 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleUpdateMethod3762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleUpdateMethod3788 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleUpdateMethod3813 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUpdateMethod3834 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleUpdateMethod3846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUpdateMethod3874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleUpdateMethod3898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString3949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString3960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString4000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString4026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod4071 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethod4081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMethod4127 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMethod4139 = new BitSet(new long[]{0x0000000001000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod4161 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleMethod4174 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod4195 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleMethod4211 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMethod4223 = new BitSet(new long[]{0x0000190000000010L});
        public static final BitSet FOLLOW_40_in_ruleMethod4243 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleMethod4268 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod4289 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleMethod4301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleMethod4327 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleMethod4352 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod4373 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleMethod4385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod4413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleMethod4437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean4488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean4499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEBoolean4537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEBoolean4556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4597 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4648 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_47_in_ruleQualifiedName4676 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4692 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_47_in_synpred1_InternalApiDescriptionLanguage4667 = new BitSet(new long[]{0x0000000000000002L});
    }


}