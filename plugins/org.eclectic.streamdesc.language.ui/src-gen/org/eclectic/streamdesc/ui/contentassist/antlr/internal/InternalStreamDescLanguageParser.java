package org.eclectic.streamdesc.ui.contentassist.antlr.internal; 

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
import org.eclectic.streamdesc.services.StreamDescLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStreamDescLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'seconds'", "'secs'", "'stream'", "'for'", "'sliding'", "'='", "'elements'", "'key'", "'('", "')'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
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
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g"; }


     
     	private StreamDescLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(StreamDescLanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleStreamDescription"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:60:1: entryRuleStreamDescription : ruleStreamDescription EOF ;
    public final void entryRuleStreamDescription() throws RecognitionException {
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:61:1: ( ruleStreamDescription EOF )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:62:1: ruleStreamDescription EOF
            {
             before(grammarAccess.getStreamDescriptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStreamDescription_in_entryRuleStreamDescription61);
            ruleStreamDescription();

            state._fsp--;

             after(grammarAccess.getStreamDescriptionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStreamDescription68); 

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
    // $ANTLR end "entryRuleStreamDescription"


    // $ANTLR start "ruleStreamDescription"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:69:1: ruleStreamDescription : ( ( rule__StreamDescription__Group__0 ) ) ;
    public final void ruleStreamDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:73:2: ( ( ( rule__StreamDescription__Group__0 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:74:1: ( ( rule__StreamDescription__Group__0 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:74:1: ( ( rule__StreamDescription__Group__0 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:75:1: ( rule__StreamDescription__Group__0 )
            {
             before(grammarAccess.getStreamDescriptionAccess().getGroup()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:76:1: ( rule__StreamDescription__Group__0 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:76:2: rule__StreamDescription__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__0_in_ruleStreamDescription94);
            rule__StreamDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleStreamDescription"


    // $ANTLR start "entryRuleSlidingWindow"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:88:1: entryRuleSlidingWindow : ruleSlidingWindow EOF ;
    public final void entryRuleSlidingWindow() throws RecognitionException {
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:89:1: ( ruleSlidingWindow EOF )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:90:1: ruleSlidingWindow EOF
            {
             before(grammarAccess.getSlidingWindowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlidingWindow_in_entryRuleSlidingWindow121);
            ruleSlidingWindow();

            state._fsp--;

             after(grammarAccess.getSlidingWindowRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlidingWindow128); 

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
    // $ANTLR end "entryRuleSlidingWindow"


    // $ANTLR start "ruleSlidingWindow"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:97:1: ruleSlidingWindow : ( ( rule__SlidingWindow__Alternatives ) ) ;
    public final void ruleSlidingWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:101:2: ( ( ( rule__SlidingWindow__Alternatives ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:102:1: ( ( rule__SlidingWindow__Alternatives ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:102:1: ( ( rule__SlidingWindow__Alternatives ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:103:1: ( rule__SlidingWindow__Alternatives )
            {
             before(grammarAccess.getSlidingWindowAccess().getAlternatives()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:104:1: ( rule__SlidingWindow__Alternatives )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:104:2: rule__SlidingWindow__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlidingWindow__Alternatives_in_ruleSlidingWindow154);
            rule__SlidingWindow__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSlidingWindowAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSlidingWindow"


    // $ANTLR start "entryRuleTimeSlidingWindow"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:116:1: entryRuleTimeSlidingWindow : ruleTimeSlidingWindow EOF ;
    public final void entryRuleTimeSlidingWindow() throws RecognitionException {
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:117:1: ( ruleTimeSlidingWindow EOF )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:118:1: ruleTimeSlidingWindow EOF
            {
             before(grammarAccess.getTimeSlidingWindowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeSlidingWindow_in_entryRuleTimeSlidingWindow181);
            ruleTimeSlidingWindow();

            state._fsp--;

             after(grammarAccess.getTimeSlidingWindowRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeSlidingWindow188); 

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
    // $ANTLR end "entryRuleTimeSlidingWindow"


    // $ANTLR start "ruleTimeSlidingWindow"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:125:1: ruleTimeSlidingWindow : ( ( rule__TimeSlidingWindow__Group__0 ) ) ;
    public final void ruleTimeSlidingWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:129:2: ( ( ( rule__TimeSlidingWindow__Group__0 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:130:1: ( ( rule__TimeSlidingWindow__Group__0 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:130:1: ( ( rule__TimeSlidingWindow__Group__0 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:131:1: ( rule__TimeSlidingWindow__Group__0 )
            {
             before(grammarAccess.getTimeSlidingWindowAccess().getGroup()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:132:1: ( rule__TimeSlidingWindow__Group__0 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:132:2: rule__TimeSlidingWindow__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__0_in_ruleTimeSlidingWindow214);
            rule__TimeSlidingWindow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSlidingWindowAccess().getGroup()); 

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
    // $ANTLR end "ruleTimeSlidingWindow"


    // $ANTLR start "entryRuleElementSlidingWindow"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:144:1: entryRuleElementSlidingWindow : ruleElementSlidingWindow EOF ;
    public final void entryRuleElementSlidingWindow() throws RecognitionException {
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:145:1: ( ruleElementSlidingWindow EOF )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:146:1: ruleElementSlidingWindow EOF
            {
             before(grammarAccess.getElementSlidingWindowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElementSlidingWindow_in_entryRuleElementSlidingWindow241);
            ruleElementSlidingWindow();

            state._fsp--;

             after(grammarAccess.getElementSlidingWindowRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementSlidingWindow248); 

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
    // $ANTLR end "entryRuleElementSlidingWindow"


    // $ANTLR start "ruleElementSlidingWindow"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:153:1: ruleElementSlidingWindow : ( ( rule__ElementSlidingWindow__Group__0 ) ) ;
    public final void ruleElementSlidingWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:157:2: ( ( ( rule__ElementSlidingWindow__Group__0 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:158:1: ( ( rule__ElementSlidingWindow__Group__0 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:158:1: ( ( rule__ElementSlidingWindow__Group__0 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:159:1: ( rule__ElementSlidingWindow__Group__0 )
            {
             before(grammarAccess.getElementSlidingWindowAccess().getGroup()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:160:1: ( rule__ElementSlidingWindow__Group__0 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:160:2: rule__ElementSlidingWindow__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__0_in_ruleElementSlidingWindow274);
            rule__ElementSlidingWindow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementSlidingWindowAccess().getGroup()); 

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
    // $ANTLR end "ruleElementSlidingWindow"


    // $ANTLR start "entryRuleKeySpec"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:172:1: entryRuleKeySpec : ruleKeySpec EOF ;
    public final void entryRuleKeySpec() throws RecognitionException {
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:173:1: ( ruleKeySpec EOF )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:174:1: ruleKeySpec EOF
            {
             before(grammarAccess.getKeySpecRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeySpec_in_entryRuleKeySpec301);
            ruleKeySpec();

            state._fsp--;

             after(grammarAccess.getKeySpecRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeySpec308); 

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
    // $ANTLR end "entryRuleKeySpec"


    // $ANTLR start "ruleKeySpec"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:181:1: ruleKeySpec : ( ( rule__KeySpec__Group__0 ) ) ;
    public final void ruleKeySpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:185:2: ( ( ( rule__KeySpec__Group__0 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:186:1: ( ( rule__KeySpec__Group__0 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:186:1: ( ( rule__KeySpec__Group__0 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:187:1: ( rule__KeySpec__Group__0 )
            {
             before(grammarAccess.getKeySpecAccess().getGroup()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:188:1: ( rule__KeySpec__Group__0 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:188:2: rule__KeySpec__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__0_in_ruleKeySpec334);
            rule__KeySpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeySpecAccess().getGroup()); 

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
    // $ANTLR end "ruleKeySpec"


    // $ANTLR start "entryRuleEString"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:200:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:201:1: ( ruleEString EOF )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:202:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString361);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString368); 

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
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:209:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:213:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:214:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:214:1: ( ( rule__EString__Alternatives ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:215:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:216:1: ( rule__EString__Alternatives )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:216:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString394);
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


    // $ANTLR start "entryRuleEInt"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:229:1: ( ruleEInt EOF )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt421);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt428); 

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
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:237:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:241:2: ( ( RULE_INT ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:242:1: ( RULE_INT )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:242:1: ( RULE_INT )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:243:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt454); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

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


    // $ANTLR start "rule__SlidingWindow__Alternatives"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:256:1: rule__SlidingWindow__Alternatives : ( ( ruleTimeSlidingWindow ) | ( ruleElementSlidingWindow ) );
    public final void rule__SlidingWindow__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:260:1: ( ( ruleTimeSlidingWindow ) | ( ruleElementSlidingWindow ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==14) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==RULE_STRING) ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3==16) ) {
                            int LA1_5 = input.LA(5);

                            if ( (LA1_5==RULE_INT) ) {
                                int LA1_6 = input.LA(6);

                                if ( (LA1_6==17) ) {
                                    alt1=2;
                                }
                                else if ( ((LA1_6>=11 && LA1_6<=12)) ) {
                                    alt1=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_2==RULE_ID) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==16) ) {
                            int LA1_5 = input.LA(5);

                            if ( (LA1_5==RULE_INT) ) {
                                int LA1_6 = input.LA(6);

                                if ( (LA1_6==17) ) {
                                    alt1=2;
                                }
                                else if ( ((LA1_6>=11 && LA1_6<=12)) ) {
                                    alt1=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:261:1: ( ruleTimeSlidingWindow )
                    {
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:261:1: ( ruleTimeSlidingWindow )
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:262:1: ruleTimeSlidingWindow
                    {
                     before(grammarAccess.getSlidingWindowAccess().getTimeSlidingWindowParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTimeSlidingWindow_in_rule__SlidingWindow__Alternatives489);
                    ruleTimeSlidingWindow();

                    state._fsp--;

                     after(grammarAccess.getSlidingWindowAccess().getTimeSlidingWindowParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:267:6: ( ruleElementSlidingWindow )
                    {
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:267:6: ( ruleElementSlidingWindow )
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:268:1: ruleElementSlidingWindow
                    {
                     before(grammarAccess.getSlidingWindowAccess().getElementSlidingWindowParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleElementSlidingWindow_in_rule__SlidingWindow__Alternatives506);
                    ruleElementSlidingWindow();

                    state._fsp--;

                     after(grammarAccess.getSlidingWindowAccess().getElementSlidingWindowParserRuleCall_1()); 

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
    // $ANTLR end "rule__SlidingWindow__Alternatives"


    // $ANTLR start "rule__TimeSlidingWindow__Alternatives_5"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:278:1: rule__TimeSlidingWindow__Alternatives_5 : ( ( 'seconds' ) | ( 'secs' ) );
    public final void rule__TimeSlidingWindow__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:282:1: ( ( 'seconds' ) | ( 'secs' ) )
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
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:283:1: ( 'seconds' )
                    {
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:283:1: ( 'seconds' )
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:284:1: 'seconds'
                    {
                     before(grammarAccess.getTimeSlidingWindowAccess().getSecondsKeyword_5_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__TimeSlidingWindow__Alternatives_5539); 
                     after(grammarAccess.getTimeSlidingWindowAccess().getSecondsKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:291:6: ( 'secs' )
                    {
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:291:6: ( 'secs' )
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:292:1: 'secs'
                    {
                     before(grammarAccess.getTimeSlidingWindowAccess().getSecsKeyword_5_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__TimeSlidingWindow__Alternatives_5559); 
                     after(grammarAccess.getTimeSlidingWindowAccess().getSecsKeyword_5_1()); 

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
    // $ANTLR end "rule__TimeSlidingWindow__Alternatives_5"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:304:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:308:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:309:1: ( RULE_STRING )
                    {
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:309:1: ( RULE_STRING )
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:310:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives593); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:315:6: ( RULE_ID )
                    {
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:315:6: ( RULE_ID )
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:316:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives610); 
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


    // $ANTLR start "rule__StreamDescription__Group__0"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:328:1: rule__StreamDescription__Group__0 : rule__StreamDescription__Group__0__Impl rule__StreamDescription__Group__1 ;
    public final void rule__StreamDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:332:1: ( rule__StreamDescription__Group__0__Impl rule__StreamDescription__Group__1 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:333:2: rule__StreamDescription__Group__0__Impl rule__StreamDescription__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__0__Impl_in_rule__StreamDescription__Group__0640);
            rule__StreamDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__1_in_rule__StreamDescription__Group__0643);
            rule__StreamDescription__Group__1();

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
    // $ANTLR end "rule__StreamDescription__Group__0"


    // $ANTLR start "rule__StreamDescription__Group__0__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:340:1: rule__StreamDescription__Group__0__Impl : ( 'stream' ) ;
    public final void rule__StreamDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:344:1: ( ( 'stream' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:345:1: ( 'stream' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:345:1: ( 'stream' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:346:1: 'stream'
            {
             before(grammarAccess.getStreamDescriptionAccess().getStreamKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__StreamDescription__Group__0__Impl671); 
             after(grammarAccess.getStreamDescriptionAccess().getStreamKeyword_0()); 

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
    // $ANTLR end "rule__StreamDescription__Group__0__Impl"


    // $ANTLR start "rule__StreamDescription__Group__1"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:359:1: rule__StreamDescription__Group__1 : rule__StreamDescription__Group__1__Impl rule__StreamDescription__Group__2 ;
    public final void rule__StreamDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:363:1: ( rule__StreamDescription__Group__1__Impl rule__StreamDescription__Group__2 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:364:2: rule__StreamDescription__Group__1__Impl rule__StreamDescription__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__1__Impl_in_rule__StreamDescription__Group__1702);
            rule__StreamDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__2_in_rule__StreamDescription__Group__1705);
            rule__StreamDescription__Group__2();

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
    // $ANTLR end "rule__StreamDescription__Group__1"


    // $ANTLR start "rule__StreamDescription__Group__1__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:371:1: rule__StreamDescription__Group__1__Impl : ( ( rule__StreamDescription__StreamNameAssignment_1 ) ) ;
    public final void rule__StreamDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:375:1: ( ( ( rule__StreamDescription__StreamNameAssignment_1 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:376:1: ( ( rule__StreamDescription__StreamNameAssignment_1 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:376:1: ( ( rule__StreamDescription__StreamNameAssignment_1 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:377:1: ( rule__StreamDescription__StreamNameAssignment_1 )
            {
             before(grammarAccess.getStreamDescriptionAccess().getStreamNameAssignment_1()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:378:1: ( rule__StreamDescription__StreamNameAssignment_1 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:378:2: rule__StreamDescription__StreamNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__StreamNameAssignment_1_in_rule__StreamDescription__Group__1__Impl732);
            rule__StreamDescription__StreamNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamDescriptionAccess().getStreamNameAssignment_1()); 

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
    // $ANTLR end "rule__StreamDescription__Group__1__Impl"


    // $ANTLR start "rule__StreamDescription__Group__2"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:388:1: rule__StreamDescription__Group__2 : rule__StreamDescription__Group__2__Impl rule__StreamDescription__Group__3 ;
    public final void rule__StreamDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:392:1: ( rule__StreamDescription__Group__2__Impl rule__StreamDescription__Group__3 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:393:2: rule__StreamDescription__Group__2__Impl rule__StreamDescription__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__2__Impl_in_rule__StreamDescription__Group__2762);
            rule__StreamDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__3_in_rule__StreamDescription__Group__2765);
            rule__StreamDescription__Group__3();

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
    // $ANTLR end "rule__StreamDescription__Group__2"


    // $ANTLR start "rule__StreamDescription__Group__2__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:400:1: rule__StreamDescription__Group__2__Impl : ( 'for' ) ;
    public final void rule__StreamDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:404:1: ( ( 'for' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:405:1: ( 'for' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:405:1: ( 'for' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:406:1: 'for'
            {
             before(grammarAccess.getStreamDescriptionAccess().getForKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__StreamDescription__Group__2__Impl793); 
             after(grammarAccess.getStreamDescriptionAccess().getForKeyword_2()); 

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
    // $ANTLR end "rule__StreamDescription__Group__2__Impl"


    // $ANTLR start "rule__StreamDescription__Group__3"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:419:1: rule__StreamDescription__Group__3 : rule__StreamDescription__Group__3__Impl rule__StreamDescription__Group__4 ;
    public final void rule__StreamDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:423:1: ( rule__StreamDescription__Group__3__Impl rule__StreamDescription__Group__4 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:424:2: rule__StreamDescription__Group__3__Impl rule__StreamDescription__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__3__Impl_in_rule__StreamDescription__Group__3824);
            rule__StreamDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__4_in_rule__StreamDescription__Group__3827);
            rule__StreamDescription__Group__4();

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
    // $ANTLR end "rule__StreamDescription__Group__3"


    // $ANTLR start "rule__StreamDescription__Group__3__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:431:1: rule__StreamDescription__Group__3__Impl : ( ( rule__StreamDescription__MetamodelNameAssignment_3 ) ) ;
    public final void rule__StreamDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:435:1: ( ( ( rule__StreamDescription__MetamodelNameAssignment_3 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:436:1: ( ( rule__StreamDescription__MetamodelNameAssignment_3 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:436:1: ( ( rule__StreamDescription__MetamodelNameAssignment_3 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:437:1: ( rule__StreamDescription__MetamodelNameAssignment_3 )
            {
             before(grammarAccess.getStreamDescriptionAccess().getMetamodelNameAssignment_3()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:438:1: ( rule__StreamDescription__MetamodelNameAssignment_3 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:438:2: rule__StreamDescription__MetamodelNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__MetamodelNameAssignment_3_in_rule__StreamDescription__Group__3__Impl854);
            rule__StreamDescription__MetamodelNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStreamDescriptionAccess().getMetamodelNameAssignment_3()); 

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
    // $ANTLR end "rule__StreamDescription__Group__3__Impl"


    // $ANTLR start "rule__StreamDescription__Group__4"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:448:1: rule__StreamDescription__Group__4 : rule__StreamDescription__Group__4__Impl rule__StreamDescription__Group__5 ;
    public final void rule__StreamDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:452:1: ( rule__StreamDescription__Group__4__Impl rule__StreamDescription__Group__5 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:453:2: rule__StreamDescription__Group__4__Impl rule__StreamDescription__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__4__Impl_in_rule__StreamDescription__Group__4884);
            rule__StreamDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__5_in_rule__StreamDescription__Group__4887);
            rule__StreamDescription__Group__5();

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
    // $ANTLR end "rule__StreamDescription__Group__4"


    // $ANTLR start "rule__StreamDescription__Group__4__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:460:1: rule__StreamDescription__Group__4__Impl : ( ( rule__StreamDescription__Group_4__0 )? ) ;
    public final void rule__StreamDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:464:1: ( ( ( rule__StreamDescription__Group_4__0 )? ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:465:1: ( ( rule__StreamDescription__Group_4__0 )? )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:465:1: ( ( rule__StreamDescription__Group_4__0 )? )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:466:1: ( rule__StreamDescription__Group_4__0 )?
            {
             before(grammarAccess.getStreamDescriptionAccess().getGroup_4()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:467:1: ( rule__StreamDescription__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:467:2: rule__StreamDescription__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group_4__0_in_rule__StreamDescription__Group__4__Impl914);
                    rule__StreamDescription__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStreamDescriptionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__StreamDescription__Group__4__Impl"


    // $ANTLR start "rule__StreamDescription__Group__5"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:477:1: rule__StreamDescription__Group__5 : rule__StreamDescription__Group__5__Impl ;
    public final void rule__StreamDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:481:1: ( rule__StreamDescription__Group__5__Impl )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:482:2: rule__StreamDescription__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group__5__Impl_in_rule__StreamDescription__Group__5945);
            rule__StreamDescription__Group__5__Impl();

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
    // $ANTLR end "rule__StreamDescription__Group__5"


    // $ANTLR start "rule__StreamDescription__Group__5__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:488:1: rule__StreamDescription__Group__5__Impl : ( ( rule__StreamDescription__Group_5__0 )? ) ;
    public final void rule__StreamDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:492:1: ( ( ( rule__StreamDescription__Group_5__0 )? ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:493:1: ( ( rule__StreamDescription__Group_5__0 )? )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:493:1: ( ( rule__StreamDescription__Group_5__0 )? )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:494:1: ( rule__StreamDescription__Group_5__0 )?
            {
             before(grammarAccess.getStreamDescriptionAccess().getGroup_5()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:495:1: ( rule__StreamDescription__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:495:2: rule__StreamDescription__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group_5__0_in_rule__StreamDescription__Group__5__Impl972);
                    rule__StreamDescription__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStreamDescriptionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__StreamDescription__Group__5__Impl"


    // $ANTLR start "rule__StreamDescription__Group_4__0"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:517:1: rule__StreamDescription__Group_4__0 : rule__StreamDescription__Group_4__0__Impl rule__StreamDescription__Group_4__1 ;
    public final void rule__StreamDescription__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:521:1: ( rule__StreamDescription__Group_4__0__Impl rule__StreamDescription__Group_4__1 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:522:2: rule__StreamDescription__Group_4__0__Impl rule__StreamDescription__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group_4__0__Impl_in_rule__StreamDescription__Group_4__01015);
            rule__StreamDescription__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group_4__1_in_rule__StreamDescription__Group_4__01018);
            rule__StreamDescription__Group_4__1();

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
    // $ANTLR end "rule__StreamDescription__Group_4__0"


    // $ANTLR start "rule__StreamDescription__Group_4__0__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:529:1: rule__StreamDescription__Group_4__0__Impl : ( ( rule__StreamDescription__KeysAssignment_4_0 ) ) ;
    public final void rule__StreamDescription__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:533:1: ( ( ( rule__StreamDescription__KeysAssignment_4_0 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:534:1: ( ( rule__StreamDescription__KeysAssignment_4_0 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:534:1: ( ( rule__StreamDescription__KeysAssignment_4_0 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:535:1: ( rule__StreamDescription__KeysAssignment_4_0 )
            {
             before(grammarAccess.getStreamDescriptionAccess().getKeysAssignment_4_0()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:536:1: ( rule__StreamDescription__KeysAssignment_4_0 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:536:2: rule__StreamDescription__KeysAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__KeysAssignment_4_0_in_rule__StreamDescription__Group_4__0__Impl1045);
            rule__StreamDescription__KeysAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamDescriptionAccess().getKeysAssignment_4_0()); 

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
    // $ANTLR end "rule__StreamDescription__Group_4__0__Impl"


    // $ANTLR start "rule__StreamDescription__Group_4__1"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:546:1: rule__StreamDescription__Group_4__1 : rule__StreamDescription__Group_4__1__Impl ;
    public final void rule__StreamDescription__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:550:1: ( rule__StreamDescription__Group_4__1__Impl )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:551:2: rule__StreamDescription__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group_4__1__Impl_in_rule__StreamDescription__Group_4__11075);
            rule__StreamDescription__Group_4__1__Impl();

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
    // $ANTLR end "rule__StreamDescription__Group_4__1"


    // $ANTLR start "rule__StreamDescription__Group_4__1__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:557:1: rule__StreamDescription__Group_4__1__Impl : ( ( rule__StreamDescription__KeysAssignment_4_1 )* ) ;
    public final void rule__StreamDescription__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:561:1: ( ( ( rule__StreamDescription__KeysAssignment_4_1 )* ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:562:1: ( ( rule__StreamDescription__KeysAssignment_4_1 )* )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:562:1: ( ( rule__StreamDescription__KeysAssignment_4_1 )* )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:563:1: ( rule__StreamDescription__KeysAssignment_4_1 )*
            {
             before(grammarAccess.getStreamDescriptionAccess().getKeysAssignment_4_1()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:564:1: ( rule__StreamDescription__KeysAssignment_4_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:564:2: rule__StreamDescription__KeysAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__KeysAssignment_4_1_in_rule__StreamDescription__Group_4__1__Impl1102);
            	    rule__StreamDescription__KeysAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStreamDescriptionAccess().getKeysAssignment_4_1()); 

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
    // $ANTLR end "rule__StreamDescription__Group_4__1__Impl"


    // $ANTLR start "rule__StreamDescription__Group_5__0"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:578:1: rule__StreamDescription__Group_5__0 : rule__StreamDescription__Group_5__0__Impl rule__StreamDescription__Group_5__1 ;
    public final void rule__StreamDescription__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:582:1: ( rule__StreamDescription__Group_5__0__Impl rule__StreamDescription__Group_5__1 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:583:2: rule__StreamDescription__Group_5__0__Impl rule__StreamDescription__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group_5__0__Impl_in_rule__StreamDescription__Group_5__01137);
            rule__StreamDescription__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group_5__1_in_rule__StreamDescription__Group_5__01140);
            rule__StreamDescription__Group_5__1();

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
    // $ANTLR end "rule__StreamDescription__Group_5__0"


    // $ANTLR start "rule__StreamDescription__Group_5__0__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:590:1: rule__StreamDescription__Group_5__0__Impl : ( ( rule__StreamDescription__WindowsAssignment_5_0 ) ) ;
    public final void rule__StreamDescription__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:594:1: ( ( ( rule__StreamDescription__WindowsAssignment_5_0 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:595:1: ( ( rule__StreamDescription__WindowsAssignment_5_0 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:595:1: ( ( rule__StreamDescription__WindowsAssignment_5_0 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:596:1: ( rule__StreamDescription__WindowsAssignment_5_0 )
            {
             before(grammarAccess.getStreamDescriptionAccess().getWindowsAssignment_5_0()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:597:1: ( rule__StreamDescription__WindowsAssignment_5_0 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:597:2: rule__StreamDescription__WindowsAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__WindowsAssignment_5_0_in_rule__StreamDescription__Group_5__0__Impl1167);
            rule__StreamDescription__WindowsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamDescriptionAccess().getWindowsAssignment_5_0()); 

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
    // $ANTLR end "rule__StreamDescription__Group_5__0__Impl"


    // $ANTLR start "rule__StreamDescription__Group_5__1"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:607:1: rule__StreamDescription__Group_5__1 : rule__StreamDescription__Group_5__1__Impl ;
    public final void rule__StreamDescription__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:611:1: ( rule__StreamDescription__Group_5__1__Impl )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:612:2: rule__StreamDescription__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__Group_5__1__Impl_in_rule__StreamDescription__Group_5__11197);
            rule__StreamDescription__Group_5__1__Impl();

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
    // $ANTLR end "rule__StreamDescription__Group_5__1"


    // $ANTLR start "rule__StreamDescription__Group_5__1__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:618:1: rule__StreamDescription__Group_5__1__Impl : ( ( rule__StreamDescription__WindowsAssignment_5_1 )* ) ;
    public final void rule__StreamDescription__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:622:1: ( ( ( rule__StreamDescription__WindowsAssignment_5_1 )* ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:623:1: ( ( rule__StreamDescription__WindowsAssignment_5_1 )* )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:623:1: ( ( rule__StreamDescription__WindowsAssignment_5_1 )* )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:624:1: ( rule__StreamDescription__WindowsAssignment_5_1 )*
            {
             before(grammarAccess.getStreamDescriptionAccess().getWindowsAssignment_5_1()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:625:1: ( rule__StreamDescription__WindowsAssignment_5_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:625:2: rule__StreamDescription__WindowsAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StreamDescription__WindowsAssignment_5_1_in_rule__StreamDescription__Group_5__1__Impl1224);
            	    rule__StreamDescription__WindowsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStreamDescriptionAccess().getWindowsAssignment_5_1()); 

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
    // $ANTLR end "rule__StreamDescription__Group_5__1__Impl"


    // $ANTLR start "rule__TimeSlidingWindow__Group__0"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:639:1: rule__TimeSlidingWindow__Group__0 : rule__TimeSlidingWindow__Group__0__Impl rule__TimeSlidingWindow__Group__1 ;
    public final void rule__TimeSlidingWindow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:643:1: ( rule__TimeSlidingWindow__Group__0__Impl rule__TimeSlidingWindow__Group__1 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:644:2: rule__TimeSlidingWindow__Group__0__Impl rule__TimeSlidingWindow__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__0__Impl_in_rule__TimeSlidingWindow__Group__01259);
            rule__TimeSlidingWindow__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__1_in_rule__TimeSlidingWindow__Group__01262);
            rule__TimeSlidingWindow__Group__1();

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__0"


    // $ANTLR start "rule__TimeSlidingWindow__Group__0__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:651:1: rule__TimeSlidingWindow__Group__0__Impl : ( 'sliding' ) ;
    public final void rule__TimeSlidingWindow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:655:1: ( ( 'sliding' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:656:1: ( 'sliding' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:656:1: ( 'sliding' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:657:1: 'sliding'
            {
             before(grammarAccess.getTimeSlidingWindowAccess().getSlidingKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TimeSlidingWindow__Group__0__Impl1290); 
             after(grammarAccess.getTimeSlidingWindowAccess().getSlidingKeyword_0()); 

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__0__Impl"


    // $ANTLR start "rule__TimeSlidingWindow__Group__1"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:670:1: rule__TimeSlidingWindow__Group__1 : rule__TimeSlidingWindow__Group__1__Impl rule__TimeSlidingWindow__Group__2 ;
    public final void rule__TimeSlidingWindow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:674:1: ( rule__TimeSlidingWindow__Group__1__Impl rule__TimeSlidingWindow__Group__2 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:675:2: rule__TimeSlidingWindow__Group__1__Impl rule__TimeSlidingWindow__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__1__Impl_in_rule__TimeSlidingWindow__Group__11321);
            rule__TimeSlidingWindow__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__2_in_rule__TimeSlidingWindow__Group__11324);
            rule__TimeSlidingWindow__Group__2();

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__1"


    // $ANTLR start "rule__TimeSlidingWindow__Group__1__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:682:1: rule__TimeSlidingWindow__Group__1__Impl : ( 'for' ) ;
    public final void rule__TimeSlidingWindow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:686:1: ( ( 'for' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:687:1: ( 'for' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:687:1: ( 'for' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:688:1: 'for'
            {
             before(grammarAccess.getTimeSlidingWindowAccess().getForKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TimeSlidingWindow__Group__1__Impl1352); 
             after(grammarAccess.getTimeSlidingWindowAccess().getForKeyword_1()); 

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__1__Impl"


    // $ANTLR start "rule__TimeSlidingWindow__Group__2"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:701:1: rule__TimeSlidingWindow__Group__2 : rule__TimeSlidingWindow__Group__2__Impl rule__TimeSlidingWindow__Group__3 ;
    public final void rule__TimeSlidingWindow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:705:1: ( rule__TimeSlidingWindow__Group__2__Impl rule__TimeSlidingWindow__Group__3 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:706:2: rule__TimeSlidingWindow__Group__2__Impl rule__TimeSlidingWindow__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__2__Impl_in_rule__TimeSlidingWindow__Group__21383);
            rule__TimeSlidingWindow__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__3_in_rule__TimeSlidingWindow__Group__21386);
            rule__TimeSlidingWindow__Group__3();

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__2"


    // $ANTLR start "rule__TimeSlidingWindow__Group__2__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:713:1: rule__TimeSlidingWindow__Group__2__Impl : ( ( rule__TimeSlidingWindow__ClassNameAssignment_2 ) ) ;
    public final void rule__TimeSlidingWindow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:717:1: ( ( ( rule__TimeSlidingWindow__ClassNameAssignment_2 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:718:1: ( ( rule__TimeSlidingWindow__ClassNameAssignment_2 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:718:1: ( ( rule__TimeSlidingWindow__ClassNameAssignment_2 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:719:1: ( rule__TimeSlidingWindow__ClassNameAssignment_2 )
            {
             before(grammarAccess.getTimeSlidingWindowAccess().getClassNameAssignment_2()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:720:1: ( rule__TimeSlidingWindow__ClassNameAssignment_2 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:720:2: rule__TimeSlidingWindow__ClassNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__ClassNameAssignment_2_in_rule__TimeSlidingWindow__Group__2__Impl1413);
            rule__TimeSlidingWindow__ClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeSlidingWindowAccess().getClassNameAssignment_2()); 

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__2__Impl"


    // $ANTLR start "rule__TimeSlidingWindow__Group__3"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:730:1: rule__TimeSlidingWindow__Group__3 : rule__TimeSlidingWindow__Group__3__Impl rule__TimeSlidingWindow__Group__4 ;
    public final void rule__TimeSlidingWindow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:734:1: ( rule__TimeSlidingWindow__Group__3__Impl rule__TimeSlidingWindow__Group__4 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:735:2: rule__TimeSlidingWindow__Group__3__Impl rule__TimeSlidingWindow__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__3__Impl_in_rule__TimeSlidingWindow__Group__31443);
            rule__TimeSlidingWindow__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__4_in_rule__TimeSlidingWindow__Group__31446);
            rule__TimeSlidingWindow__Group__4();

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__3"


    // $ANTLR start "rule__TimeSlidingWindow__Group__3__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:742:1: rule__TimeSlidingWindow__Group__3__Impl : ( '=' ) ;
    public final void rule__TimeSlidingWindow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:746:1: ( ( '=' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:747:1: ( '=' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:747:1: ( '=' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:748:1: '='
            {
             before(grammarAccess.getTimeSlidingWindowAccess().getEqualsSignKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TimeSlidingWindow__Group__3__Impl1474); 
             after(grammarAccess.getTimeSlidingWindowAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__3__Impl"


    // $ANTLR start "rule__TimeSlidingWindow__Group__4"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:761:1: rule__TimeSlidingWindow__Group__4 : rule__TimeSlidingWindow__Group__4__Impl rule__TimeSlidingWindow__Group__5 ;
    public final void rule__TimeSlidingWindow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:765:1: ( rule__TimeSlidingWindow__Group__4__Impl rule__TimeSlidingWindow__Group__5 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:766:2: rule__TimeSlidingWindow__Group__4__Impl rule__TimeSlidingWindow__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__4__Impl_in_rule__TimeSlidingWindow__Group__41505);
            rule__TimeSlidingWindow__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__5_in_rule__TimeSlidingWindow__Group__41508);
            rule__TimeSlidingWindow__Group__5();

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__4"


    // $ANTLR start "rule__TimeSlidingWindow__Group__4__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:773:1: rule__TimeSlidingWindow__Group__4__Impl : ( ( rule__TimeSlidingWindow__SecondsAssignment_4 ) ) ;
    public final void rule__TimeSlidingWindow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:777:1: ( ( ( rule__TimeSlidingWindow__SecondsAssignment_4 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:778:1: ( ( rule__TimeSlidingWindow__SecondsAssignment_4 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:778:1: ( ( rule__TimeSlidingWindow__SecondsAssignment_4 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:779:1: ( rule__TimeSlidingWindow__SecondsAssignment_4 )
            {
             before(grammarAccess.getTimeSlidingWindowAccess().getSecondsAssignment_4()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:780:1: ( rule__TimeSlidingWindow__SecondsAssignment_4 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:780:2: rule__TimeSlidingWindow__SecondsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__SecondsAssignment_4_in_rule__TimeSlidingWindow__Group__4__Impl1535);
            rule__TimeSlidingWindow__SecondsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTimeSlidingWindowAccess().getSecondsAssignment_4()); 

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__4__Impl"


    // $ANTLR start "rule__TimeSlidingWindow__Group__5"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:790:1: rule__TimeSlidingWindow__Group__5 : rule__TimeSlidingWindow__Group__5__Impl ;
    public final void rule__TimeSlidingWindow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:794:1: ( rule__TimeSlidingWindow__Group__5__Impl )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:795:2: rule__TimeSlidingWindow__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Group__5__Impl_in_rule__TimeSlidingWindow__Group__51565);
            rule__TimeSlidingWindow__Group__5__Impl();

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__5"


    // $ANTLR start "rule__TimeSlidingWindow__Group__5__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:801:1: rule__TimeSlidingWindow__Group__5__Impl : ( ( rule__TimeSlidingWindow__Alternatives_5 ) ) ;
    public final void rule__TimeSlidingWindow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:805:1: ( ( ( rule__TimeSlidingWindow__Alternatives_5 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:806:1: ( ( rule__TimeSlidingWindow__Alternatives_5 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:806:1: ( ( rule__TimeSlidingWindow__Alternatives_5 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:807:1: ( rule__TimeSlidingWindow__Alternatives_5 )
            {
             before(grammarAccess.getTimeSlidingWindowAccess().getAlternatives_5()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:808:1: ( rule__TimeSlidingWindow__Alternatives_5 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:808:2: rule__TimeSlidingWindow__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSlidingWindow__Alternatives_5_in_rule__TimeSlidingWindow__Group__5__Impl1592);
            rule__TimeSlidingWindow__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getTimeSlidingWindowAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__TimeSlidingWindow__Group__5__Impl"


    // $ANTLR start "rule__ElementSlidingWindow__Group__0"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:830:1: rule__ElementSlidingWindow__Group__0 : rule__ElementSlidingWindow__Group__0__Impl rule__ElementSlidingWindow__Group__1 ;
    public final void rule__ElementSlidingWindow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:834:1: ( rule__ElementSlidingWindow__Group__0__Impl rule__ElementSlidingWindow__Group__1 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:835:2: rule__ElementSlidingWindow__Group__0__Impl rule__ElementSlidingWindow__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__0__Impl_in_rule__ElementSlidingWindow__Group__01634);
            rule__ElementSlidingWindow__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__1_in_rule__ElementSlidingWindow__Group__01637);
            rule__ElementSlidingWindow__Group__1();

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__0"


    // $ANTLR start "rule__ElementSlidingWindow__Group__0__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:842:1: rule__ElementSlidingWindow__Group__0__Impl : ( 'sliding' ) ;
    public final void rule__ElementSlidingWindow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:846:1: ( ( 'sliding' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:847:1: ( 'sliding' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:847:1: ( 'sliding' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:848:1: 'sliding'
            {
             before(grammarAccess.getElementSlidingWindowAccess().getSlidingKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__ElementSlidingWindow__Group__0__Impl1665); 
             after(grammarAccess.getElementSlidingWindowAccess().getSlidingKeyword_0()); 

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__0__Impl"


    // $ANTLR start "rule__ElementSlidingWindow__Group__1"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:861:1: rule__ElementSlidingWindow__Group__1 : rule__ElementSlidingWindow__Group__1__Impl rule__ElementSlidingWindow__Group__2 ;
    public final void rule__ElementSlidingWindow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:865:1: ( rule__ElementSlidingWindow__Group__1__Impl rule__ElementSlidingWindow__Group__2 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:866:2: rule__ElementSlidingWindow__Group__1__Impl rule__ElementSlidingWindow__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__1__Impl_in_rule__ElementSlidingWindow__Group__11696);
            rule__ElementSlidingWindow__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__2_in_rule__ElementSlidingWindow__Group__11699);
            rule__ElementSlidingWindow__Group__2();

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__1"


    // $ANTLR start "rule__ElementSlidingWindow__Group__1__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:873:1: rule__ElementSlidingWindow__Group__1__Impl : ( 'for' ) ;
    public final void rule__ElementSlidingWindow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:877:1: ( ( 'for' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:878:1: ( 'for' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:878:1: ( 'for' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:879:1: 'for'
            {
             before(grammarAccess.getElementSlidingWindowAccess().getForKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ElementSlidingWindow__Group__1__Impl1727); 
             after(grammarAccess.getElementSlidingWindowAccess().getForKeyword_1()); 

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__1__Impl"


    // $ANTLR start "rule__ElementSlidingWindow__Group__2"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:892:1: rule__ElementSlidingWindow__Group__2 : rule__ElementSlidingWindow__Group__2__Impl rule__ElementSlidingWindow__Group__3 ;
    public final void rule__ElementSlidingWindow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:896:1: ( rule__ElementSlidingWindow__Group__2__Impl rule__ElementSlidingWindow__Group__3 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:897:2: rule__ElementSlidingWindow__Group__2__Impl rule__ElementSlidingWindow__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__2__Impl_in_rule__ElementSlidingWindow__Group__21758);
            rule__ElementSlidingWindow__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__3_in_rule__ElementSlidingWindow__Group__21761);
            rule__ElementSlidingWindow__Group__3();

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__2"


    // $ANTLR start "rule__ElementSlidingWindow__Group__2__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:904:1: rule__ElementSlidingWindow__Group__2__Impl : ( ( rule__ElementSlidingWindow__ClassNameAssignment_2 ) ) ;
    public final void rule__ElementSlidingWindow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:908:1: ( ( ( rule__ElementSlidingWindow__ClassNameAssignment_2 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:909:1: ( ( rule__ElementSlidingWindow__ClassNameAssignment_2 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:909:1: ( ( rule__ElementSlidingWindow__ClassNameAssignment_2 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:910:1: ( rule__ElementSlidingWindow__ClassNameAssignment_2 )
            {
             before(grammarAccess.getElementSlidingWindowAccess().getClassNameAssignment_2()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:911:1: ( rule__ElementSlidingWindow__ClassNameAssignment_2 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:911:2: rule__ElementSlidingWindow__ClassNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__ClassNameAssignment_2_in_rule__ElementSlidingWindow__Group__2__Impl1788);
            rule__ElementSlidingWindow__ClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementSlidingWindowAccess().getClassNameAssignment_2()); 

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__2__Impl"


    // $ANTLR start "rule__ElementSlidingWindow__Group__3"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:921:1: rule__ElementSlidingWindow__Group__3 : rule__ElementSlidingWindow__Group__3__Impl rule__ElementSlidingWindow__Group__4 ;
    public final void rule__ElementSlidingWindow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:925:1: ( rule__ElementSlidingWindow__Group__3__Impl rule__ElementSlidingWindow__Group__4 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:926:2: rule__ElementSlidingWindow__Group__3__Impl rule__ElementSlidingWindow__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__3__Impl_in_rule__ElementSlidingWindow__Group__31818);
            rule__ElementSlidingWindow__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__4_in_rule__ElementSlidingWindow__Group__31821);
            rule__ElementSlidingWindow__Group__4();

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__3"


    // $ANTLR start "rule__ElementSlidingWindow__Group__3__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:933:1: rule__ElementSlidingWindow__Group__3__Impl : ( '=' ) ;
    public final void rule__ElementSlidingWindow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:937:1: ( ( '=' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:938:1: ( '=' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:938:1: ( '=' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:939:1: '='
            {
             before(grammarAccess.getElementSlidingWindowAccess().getEqualsSignKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ElementSlidingWindow__Group__3__Impl1849); 
             after(grammarAccess.getElementSlidingWindowAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__3__Impl"


    // $ANTLR start "rule__ElementSlidingWindow__Group__4"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:952:1: rule__ElementSlidingWindow__Group__4 : rule__ElementSlidingWindow__Group__4__Impl rule__ElementSlidingWindow__Group__5 ;
    public final void rule__ElementSlidingWindow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:956:1: ( rule__ElementSlidingWindow__Group__4__Impl rule__ElementSlidingWindow__Group__5 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:957:2: rule__ElementSlidingWindow__Group__4__Impl rule__ElementSlidingWindow__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__4__Impl_in_rule__ElementSlidingWindow__Group__41880);
            rule__ElementSlidingWindow__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__5_in_rule__ElementSlidingWindow__Group__41883);
            rule__ElementSlidingWindow__Group__5();

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__4"


    // $ANTLR start "rule__ElementSlidingWindow__Group__4__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:964:1: rule__ElementSlidingWindow__Group__4__Impl : ( ( rule__ElementSlidingWindow__ElementsAssignment_4 ) ) ;
    public final void rule__ElementSlidingWindow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:968:1: ( ( ( rule__ElementSlidingWindow__ElementsAssignment_4 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:969:1: ( ( rule__ElementSlidingWindow__ElementsAssignment_4 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:969:1: ( ( rule__ElementSlidingWindow__ElementsAssignment_4 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:970:1: ( rule__ElementSlidingWindow__ElementsAssignment_4 )
            {
             before(grammarAccess.getElementSlidingWindowAccess().getElementsAssignment_4()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:971:1: ( rule__ElementSlidingWindow__ElementsAssignment_4 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:971:2: rule__ElementSlidingWindow__ElementsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__ElementsAssignment_4_in_rule__ElementSlidingWindow__Group__4__Impl1910);
            rule__ElementSlidingWindow__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElementSlidingWindowAccess().getElementsAssignment_4()); 

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__4__Impl"


    // $ANTLR start "rule__ElementSlidingWindow__Group__5"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:981:1: rule__ElementSlidingWindow__Group__5 : rule__ElementSlidingWindow__Group__5__Impl ;
    public final void rule__ElementSlidingWindow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:985:1: ( rule__ElementSlidingWindow__Group__5__Impl )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:986:2: rule__ElementSlidingWindow__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ElementSlidingWindow__Group__5__Impl_in_rule__ElementSlidingWindow__Group__51940);
            rule__ElementSlidingWindow__Group__5__Impl();

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__5"


    // $ANTLR start "rule__ElementSlidingWindow__Group__5__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:992:1: rule__ElementSlidingWindow__Group__5__Impl : ( 'elements' ) ;
    public final void rule__ElementSlidingWindow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:996:1: ( ( 'elements' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:997:1: ( 'elements' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:997:1: ( 'elements' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:998:1: 'elements'
            {
             before(grammarAccess.getElementSlidingWindowAccess().getElementsKeyword_5()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ElementSlidingWindow__Group__5__Impl1968); 
             after(grammarAccess.getElementSlidingWindowAccess().getElementsKeyword_5()); 

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
    // $ANTLR end "rule__ElementSlidingWindow__Group__5__Impl"


    // $ANTLR start "rule__KeySpec__Group__0"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1023:1: rule__KeySpec__Group__0 : rule__KeySpec__Group__0__Impl rule__KeySpec__Group__1 ;
    public final void rule__KeySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1027:1: ( rule__KeySpec__Group__0__Impl rule__KeySpec__Group__1 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1028:2: rule__KeySpec__Group__0__Impl rule__KeySpec__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__0__Impl_in_rule__KeySpec__Group__02011);
            rule__KeySpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__1_in_rule__KeySpec__Group__02014);
            rule__KeySpec__Group__1();

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
    // $ANTLR end "rule__KeySpec__Group__0"


    // $ANTLR start "rule__KeySpec__Group__0__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1035:1: rule__KeySpec__Group__0__Impl : ( 'key' ) ;
    public final void rule__KeySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1039:1: ( ( 'key' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1040:1: ( 'key' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1040:1: ( 'key' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1041:1: 'key'
            {
             before(grammarAccess.getKeySpecAccess().getKeyKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__KeySpec__Group__0__Impl2042); 
             after(grammarAccess.getKeySpecAccess().getKeyKeyword_0()); 

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
    // $ANTLR end "rule__KeySpec__Group__0__Impl"


    // $ANTLR start "rule__KeySpec__Group__1"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1054:1: rule__KeySpec__Group__1 : rule__KeySpec__Group__1__Impl rule__KeySpec__Group__2 ;
    public final void rule__KeySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1058:1: ( rule__KeySpec__Group__1__Impl rule__KeySpec__Group__2 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1059:2: rule__KeySpec__Group__1__Impl rule__KeySpec__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__1__Impl_in_rule__KeySpec__Group__12073);
            rule__KeySpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__2_in_rule__KeySpec__Group__12076);
            rule__KeySpec__Group__2();

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
    // $ANTLR end "rule__KeySpec__Group__1"


    // $ANTLR start "rule__KeySpec__Group__1__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1066:1: rule__KeySpec__Group__1__Impl : ( '(' ) ;
    public final void rule__KeySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1070:1: ( ( '(' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1071:1: ( '(' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1071:1: ( '(' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1072:1: '('
            {
             before(grammarAccess.getKeySpecAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__KeySpec__Group__1__Impl2104); 
             after(grammarAccess.getKeySpecAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__KeySpec__Group__1__Impl"


    // $ANTLR start "rule__KeySpec__Group__2"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1085:1: rule__KeySpec__Group__2 : rule__KeySpec__Group__2__Impl rule__KeySpec__Group__3 ;
    public final void rule__KeySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1089:1: ( rule__KeySpec__Group__2__Impl rule__KeySpec__Group__3 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1090:2: rule__KeySpec__Group__2__Impl rule__KeySpec__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__2__Impl_in_rule__KeySpec__Group__22135);
            rule__KeySpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__3_in_rule__KeySpec__Group__22138);
            rule__KeySpec__Group__3();

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
    // $ANTLR end "rule__KeySpec__Group__2"


    // $ANTLR start "rule__KeySpec__Group__2__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1097:1: rule__KeySpec__Group__2__Impl : ( ( rule__KeySpec__ClassNameAssignment_2 ) ) ;
    public final void rule__KeySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1101:1: ( ( ( rule__KeySpec__ClassNameAssignment_2 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1102:1: ( ( rule__KeySpec__ClassNameAssignment_2 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1102:1: ( ( rule__KeySpec__ClassNameAssignment_2 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1103:1: ( rule__KeySpec__ClassNameAssignment_2 )
            {
             before(grammarAccess.getKeySpecAccess().getClassNameAssignment_2()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1104:1: ( rule__KeySpec__ClassNameAssignment_2 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1104:2: rule__KeySpec__ClassNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__ClassNameAssignment_2_in_rule__KeySpec__Group__2__Impl2165);
            rule__KeySpec__ClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeySpecAccess().getClassNameAssignment_2()); 

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
    // $ANTLR end "rule__KeySpec__Group__2__Impl"


    // $ANTLR start "rule__KeySpec__Group__3"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1114:1: rule__KeySpec__Group__3 : rule__KeySpec__Group__3__Impl rule__KeySpec__Group__4 ;
    public final void rule__KeySpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1118:1: ( rule__KeySpec__Group__3__Impl rule__KeySpec__Group__4 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1119:2: rule__KeySpec__Group__3__Impl rule__KeySpec__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__3__Impl_in_rule__KeySpec__Group__32195);
            rule__KeySpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__4_in_rule__KeySpec__Group__32198);
            rule__KeySpec__Group__4();

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
    // $ANTLR end "rule__KeySpec__Group__3"


    // $ANTLR start "rule__KeySpec__Group__3__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1126:1: rule__KeySpec__Group__3__Impl : ( ')' ) ;
    public final void rule__KeySpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1130:1: ( ( ')' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1131:1: ( ')' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1131:1: ( ')' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1132:1: ')'
            {
             before(grammarAccess.getKeySpecAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__KeySpec__Group__3__Impl2226); 
             after(grammarAccess.getKeySpecAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__KeySpec__Group__3__Impl"


    // $ANTLR start "rule__KeySpec__Group__4"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1145:1: rule__KeySpec__Group__4 : rule__KeySpec__Group__4__Impl rule__KeySpec__Group__5 ;
    public final void rule__KeySpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1149:1: ( rule__KeySpec__Group__4__Impl rule__KeySpec__Group__5 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1150:2: rule__KeySpec__Group__4__Impl rule__KeySpec__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__4__Impl_in_rule__KeySpec__Group__42257);
            rule__KeySpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__5_in_rule__KeySpec__Group__42260);
            rule__KeySpec__Group__5();

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
    // $ANTLR end "rule__KeySpec__Group__4"


    // $ANTLR start "rule__KeySpec__Group__4__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1157:1: rule__KeySpec__Group__4__Impl : ( '=' ) ;
    public final void rule__KeySpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1161:1: ( ( '=' ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1162:1: ( '=' )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1162:1: ( '=' )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1163:1: '='
            {
             before(grammarAccess.getKeySpecAccess().getEqualsSignKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeySpec__Group__4__Impl2288); 
             after(grammarAccess.getKeySpecAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__KeySpec__Group__4__Impl"


    // $ANTLR start "rule__KeySpec__Group__5"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1176:1: rule__KeySpec__Group__5 : rule__KeySpec__Group__5__Impl ;
    public final void rule__KeySpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1180:1: ( rule__KeySpec__Group__5__Impl )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1181:2: rule__KeySpec__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__Group__5__Impl_in_rule__KeySpec__Group__52319);
            rule__KeySpec__Group__5__Impl();

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
    // $ANTLR end "rule__KeySpec__Group__5"


    // $ANTLR start "rule__KeySpec__Group__5__Impl"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1187:1: rule__KeySpec__Group__5__Impl : ( ( rule__KeySpec__FeatureNameAssignment_5 ) ) ;
    public final void rule__KeySpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1191:1: ( ( ( rule__KeySpec__FeatureNameAssignment_5 ) ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1192:1: ( ( rule__KeySpec__FeatureNameAssignment_5 ) )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1192:1: ( ( rule__KeySpec__FeatureNameAssignment_5 ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1193:1: ( rule__KeySpec__FeatureNameAssignment_5 )
            {
             before(grammarAccess.getKeySpecAccess().getFeatureNameAssignment_5()); 
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1194:1: ( rule__KeySpec__FeatureNameAssignment_5 )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1194:2: rule__KeySpec__FeatureNameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeySpec__FeatureNameAssignment_5_in_rule__KeySpec__Group__5__Impl2346);
            rule__KeySpec__FeatureNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getKeySpecAccess().getFeatureNameAssignment_5()); 

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
    // $ANTLR end "rule__KeySpec__Group__5__Impl"


    // $ANTLR start "rule__StreamDescription__StreamNameAssignment_1"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1217:1: rule__StreamDescription__StreamNameAssignment_1 : ( ruleEString ) ;
    public final void rule__StreamDescription__StreamNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1221:1: ( ( ruleEString ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1222:1: ( ruleEString )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1222:1: ( ruleEString )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1223:1: ruleEString
            {
             before(grammarAccess.getStreamDescriptionAccess().getStreamNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StreamDescription__StreamNameAssignment_12393);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStreamDescriptionAccess().getStreamNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StreamDescription__StreamNameAssignment_1"


    // $ANTLR start "rule__StreamDescription__MetamodelNameAssignment_3"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1232:1: rule__StreamDescription__MetamodelNameAssignment_3 : ( ruleEString ) ;
    public final void rule__StreamDescription__MetamodelNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1236:1: ( ( ruleEString ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1237:1: ( ruleEString )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1237:1: ( ruleEString )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1238:1: ruleEString
            {
             before(grammarAccess.getStreamDescriptionAccess().getMetamodelNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StreamDescription__MetamodelNameAssignment_32424);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStreamDescriptionAccess().getMetamodelNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StreamDescription__MetamodelNameAssignment_3"


    // $ANTLR start "rule__StreamDescription__KeysAssignment_4_0"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1247:1: rule__StreamDescription__KeysAssignment_4_0 : ( ruleKeySpec ) ;
    public final void rule__StreamDescription__KeysAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1251:1: ( ( ruleKeySpec ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1252:1: ( ruleKeySpec )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1252:1: ( ruleKeySpec )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1253:1: ruleKeySpec
            {
             before(grammarAccess.getStreamDescriptionAccess().getKeysKeySpecParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeySpec_in_rule__StreamDescription__KeysAssignment_4_02455);
            ruleKeySpec();

            state._fsp--;

             after(grammarAccess.getStreamDescriptionAccess().getKeysKeySpecParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__StreamDescription__KeysAssignment_4_0"


    // $ANTLR start "rule__StreamDescription__KeysAssignment_4_1"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1262:1: rule__StreamDescription__KeysAssignment_4_1 : ( ruleKeySpec ) ;
    public final void rule__StreamDescription__KeysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1266:1: ( ( ruleKeySpec ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1267:1: ( ruleKeySpec )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1267:1: ( ruleKeySpec )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1268:1: ruleKeySpec
            {
             before(grammarAccess.getStreamDescriptionAccess().getKeysKeySpecParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeySpec_in_rule__StreamDescription__KeysAssignment_4_12486);
            ruleKeySpec();

            state._fsp--;

             after(grammarAccess.getStreamDescriptionAccess().getKeysKeySpecParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__StreamDescription__KeysAssignment_4_1"


    // $ANTLR start "rule__StreamDescription__WindowsAssignment_5_0"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1277:1: rule__StreamDescription__WindowsAssignment_5_0 : ( ruleSlidingWindow ) ;
    public final void rule__StreamDescription__WindowsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1281:1: ( ( ruleSlidingWindow ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1282:1: ( ruleSlidingWindow )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1282:1: ( ruleSlidingWindow )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1283:1: ruleSlidingWindow
            {
             before(grammarAccess.getStreamDescriptionAccess().getWindowsSlidingWindowParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlidingWindow_in_rule__StreamDescription__WindowsAssignment_5_02517);
            ruleSlidingWindow();

            state._fsp--;

             after(grammarAccess.getStreamDescriptionAccess().getWindowsSlidingWindowParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__StreamDescription__WindowsAssignment_5_0"


    // $ANTLR start "rule__StreamDescription__WindowsAssignment_5_1"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1292:1: rule__StreamDescription__WindowsAssignment_5_1 : ( ruleSlidingWindow ) ;
    public final void rule__StreamDescription__WindowsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1296:1: ( ( ruleSlidingWindow ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1297:1: ( ruleSlidingWindow )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1297:1: ( ruleSlidingWindow )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1298:1: ruleSlidingWindow
            {
             before(grammarAccess.getStreamDescriptionAccess().getWindowsSlidingWindowParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlidingWindow_in_rule__StreamDescription__WindowsAssignment_5_12548);
            ruleSlidingWindow();

            state._fsp--;

             after(grammarAccess.getStreamDescriptionAccess().getWindowsSlidingWindowParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__StreamDescription__WindowsAssignment_5_1"


    // $ANTLR start "rule__TimeSlidingWindow__ClassNameAssignment_2"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1307:1: rule__TimeSlidingWindow__ClassNameAssignment_2 : ( ruleEString ) ;
    public final void rule__TimeSlidingWindow__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1311:1: ( ( ruleEString ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1312:1: ( ruleEString )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1312:1: ( ruleEString )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1313:1: ruleEString
            {
             before(grammarAccess.getTimeSlidingWindowAccess().getClassNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TimeSlidingWindow__ClassNameAssignment_22579);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTimeSlidingWindowAccess().getClassNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TimeSlidingWindow__ClassNameAssignment_2"


    // $ANTLR start "rule__TimeSlidingWindow__SecondsAssignment_4"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1322:1: rule__TimeSlidingWindow__SecondsAssignment_4 : ( ruleEInt ) ;
    public final void rule__TimeSlidingWindow__SecondsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1326:1: ( ( ruleEInt ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1327:1: ( ruleEInt )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1327:1: ( ruleEInt )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1328:1: ruleEInt
            {
             before(grammarAccess.getTimeSlidingWindowAccess().getSecondsEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__TimeSlidingWindow__SecondsAssignment_42610);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTimeSlidingWindowAccess().getSecondsEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__TimeSlidingWindow__SecondsAssignment_4"


    // $ANTLR start "rule__ElementSlidingWindow__ClassNameAssignment_2"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1337:1: rule__ElementSlidingWindow__ClassNameAssignment_2 : ( ruleEString ) ;
    public final void rule__ElementSlidingWindow__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1341:1: ( ( ruleEString ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1342:1: ( ruleEString )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1342:1: ( ruleEString )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1343:1: ruleEString
            {
             before(grammarAccess.getElementSlidingWindowAccess().getClassNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ElementSlidingWindow__ClassNameAssignment_22641);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getElementSlidingWindowAccess().getClassNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ElementSlidingWindow__ClassNameAssignment_2"


    // $ANTLR start "rule__ElementSlidingWindow__ElementsAssignment_4"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1352:1: rule__ElementSlidingWindow__ElementsAssignment_4 : ( ruleEInt ) ;
    public final void rule__ElementSlidingWindow__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1356:1: ( ( ruleEInt ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1357:1: ( ruleEInt )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1357:1: ( ruleEInt )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1358:1: ruleEInt
            {
             before(grammarAccess.getElementSlidingWindowAccess().getElementsEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ElementSlidingWindow__ElementsAssignment_42672);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getElementSlidingWindowAccess().getElementsEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ElementSlidingWindow__ElementsAssignment_4"


    // $ANTLR start "rule__KeySpec__ClassNameAssignment_2"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1367:1: rule__KeySpec__ClassNameAssignment_2 : ( ruleEString ) ;
    public final void rule__KeySpec__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1371:1: ( ( ruleEString ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1372:1: ( ruleEString )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1372:1: ( ruleEString )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1373:1: ruleEString
            {
             before(grammarAccess.getKeySpecAccess().getClassNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeySpec__ClassNameAssignment_22703);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeySpecAccess().getClassNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__KeySpec__ClassNameAssignment_2"


    // $ANTLR start "rule__KeySpec__FeatureNameAssignment_5"
    // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1382:1: rule__KeySpec__FeatureNameAssignment_5 : ( ruleEString ) ;
    public final void rule__KeySpec__FeatureNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1386:1: ( ( ruleEString ) )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1387:1: ( ruleEString )
            {
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1387:1: ( ruleEString )
            // ../org.eclectic.streamdesc.language.ui/src-gen/org/eclectic/streamdesc/ui/contentassist/antlr/internal/InternalStreamDescLanguage.g:1388:1: ruleEString
            {
             before(grammarAccess.getKeySpecAccess().getFeatureNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeySpec__FeatureNameAssignment_52734);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeySpecAccess().getFeatureNameEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__KeySpec__FeatureNameAssignment_5"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStreamDescription_in_entryRuleStreamDescription61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStreamDescription68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__0_in_ruleStreamDescription94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlidingWindow_in_entryRuleSlidingWindow121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlidingWindow128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlidingWindow__Alternatives_in_ruleSlidingWindow154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSlidingWindow_in_entryRuleTimeSlidingWindow181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeSlidingWindow188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__0_in_ruleTimeSlidingWindow214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementSlidingWindow_in_entryRuleElementSlidingWindow241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementSlidingWindow248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__0_in_ruleElementSlidingWindow274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeySpec_in_entryRuleKeySpec301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeySpec308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__0_in_ruleKeySpec334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSlidingWindow_in_rule__SlidingWindow__Alternatives489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementSlidingWindow_in_rule__SlidingWindow__Alternatives506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__TimeSlidingWindow__Alternatives_5539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__TimeSlidingWindow__Alternatives_5559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__0__Impl_in_rule__StreamDescription__Group__0640 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__1_in_rule__StreamDescription__Group__0643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__StreamDescription__Group__0__Impl671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__1__Impl_in_rule__StreamDescription__Group__1702 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__2_in_rule__StreamDescription__Group__1705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__StreamNameAssignment_1_in_rule__StreamDescription__Group__1__Impl732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__2__Impl_in_rule__StreamDescription__Group__2762 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__3_in_rule__StreamDescription__Group__2765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__StreamDescription__Group__2__Impl793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__3__Impl_in_rule__StreamDescription__Group__3824 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__4_in_rule__StreamDescription__Group__3827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__MetamodelNameAssignment_3_in_rule__StreamDescription__Group__3__Impl854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__4__Impl_in_rule__StreamDescription__Group__4884 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__5_in_rule__StreamDescription__Group__4887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group_4__0_in_rule__StreamDescription__Group__4__Impl914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group__5__Impl_in_rule__StreamDescription__Group__5945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group_5__0_in_rule__StreamDescription__Group__5__Impl972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group_4__0__Impl_in_rule__StreamDescription__Group_4__01015 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group_4__1_in_rule__StreamDescription__Group_4__01018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__KeysAssignment_4_0_in_rule__StreamDescription__Group_4__0__Impl1045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group_4__1__Impl_in_rule__StreamDescription__Group_4__11075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__KeysAssignment_4_1_in_rule__StreamDescription__Group_4__1__Impl1102 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group_5__0__Impl_in_rule__StreamDescription__Group_5__01137 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group_5__1_in_rule__StreamDescription__Group_5__01140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__WindowsAssignment_5_0_in_rule__StreamDescription__Group_5__0__Impl1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__Group_5__1__Impl_in_rule__StreamDescription__Group_5__11197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StreamDescription__WindowsAssignment_5_1_in_rule__StreamDescription__Group_5__1__Impl1224 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__0__Impl_in_rule__TimeSlidingWindow__Group__01259 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__1_in_rule__TimeSlidingWindow__Group__01262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TimeSlidingWindow__Group__0__Impl1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__1__Impl_in_rule__TimeSlidingWindow__Group__11321 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__2_in_rule__TimeSlidingWindow__Group__11324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TimeSlidingWindow__Group__1__Impl1352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__2__Impl_in_rule__TimeSlidingWindow__Group__21383 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__3_in_rule__TimeSlidingWindow__Group__21386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__ClassNameAssignment_2_in_rule__TimeSlidingWindow__Group__2__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__3__Impl_in_rule__TimeSlidingWindow__Group__31443 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__4_in_rule__TimeSlidingWindow__Group__31446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TimeSlidingWindow__Group__3__Impl1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__4__Impl_in_rule__TimeSlidingWindow__Group__41505 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__5_in_rule__TimeSlidingWindow__Group__41508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__SecondsAssignment_4_in_rule__TimeSlidingWindow__Group__4__Impl1535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Group__5__Impl_in_rule__TimeSlidingWindow__Group__51565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSlidingWindow__Alternatives_5_in_rule__TimeSlidingWindow__Group__5__Impl1592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__0__Impl_in_rule__ElementSlidingWindow__Group__01634 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__1_in_rule__ElementSlidingWindow__Group__01637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ElementSlidingWindow__Group__0__Impl1665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__1__Impl_in_rule__ElementSlidingWindow__Group__11696 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__2_in_rule__ElementSlidingWindow__Group__11699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ElementSlidingWindow__Group__1__Impl1727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__2__Impl_in_rule__ElementSlidingWindow__Group__21758 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__3_in_rule__ElementSlidingWindow__Group__21761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__ClassNameAssignment_2_in_rule__ElementSlidingWindow__Group__2__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__3__Impl_in_rule__ElementSlidingWindow__Group__31818 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__4_in_rule__ElementSlidingWindow__Group__31821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ElementSlidingWindow__Group__3__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__4__Impl_in_rule__ElementSlidingWindow__Group__41880 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__5_in_rule__ElementSlidingWindow__Group__41883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__ElementsAssignment_4_in_rule__ElementSlidingWindow__Group__4__Impl1910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ElementSlidingWindow__Group__5__Impl_in_rule__ElementSlidingWindow__Group__51940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ElementSlidingWindow__Group__5__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__0__Impl_in_rule__KeySpec__Group__02011 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__1_in_rule__KeySpec__Group__02014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__KeySpec__Group__0__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__1__Impl_in_rule__KeySpec__Group__12073 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__2_in_rule__KeySpec__Group__12076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__KeySpec__Group__1__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__2__Impl_in_rule__KeySpec__Group__22135 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__3_in_rule__KeySpec__Group__22138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeySpec__ClassNameAssignment_2_in_rule__KeySpec__Group__2__Impl2165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__3__Impl_in_rule__KeySpec__Group__32195 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__4_in_rule__KeySpec__Group__32198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__KeySpec__Group__3__Impl2226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__4__Impl_in_rule__KeySpec__Group__42257 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__5_in_rule__KeySpec__Group__42260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeySpec__Group__4__Impl2288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeySpec__Group__5__Impl_in_rule__KeySpec__Group__52319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeySpec__FeatureNameAssignment_5_in_rule__KeySpec__Group__5__Impl2346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StreamDescription__StreamNameAssignment_12393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StreamDescription__MetamodelNameAssignment_32424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeySpec_in_rule__StreamDescription__KeysAssignment_4_02455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeySpec_in_rule__StreamDescription__KeysAssignment_4_12486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlidingWindow_in_rule__StreamDescription__WindowsAssignment_5_02517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlidingWindow_in_rule__StreamDescription__WindowsAssignment_5_12548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TimeSlidingWindow__ClassNameAssignment_22579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__TimeSlidingWindow__SecondsAssignment_42610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ElementSlidingWindow__ClassNameAssignment_22641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ElementSlidingWindow__ElementsAssignment_42672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeySpec__ClassNameAssignment_22703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeySpec__FeatureNameAssignment_52734 = new BitSet(new long[]{0x0000000000000002L});
    }


}