package org.eclectic.frontend.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScriptLexer extends Lexer {
    public static final int RULE_KEYWORD_ID=7;
    public static final int RULE_ID=5;
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
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalScriptLexer() {;} 
    public InternalScriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalScriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:11:7: ( '+' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:11:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:12:7: ( '-' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:12:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:13:7: ( '*' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:13:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:14:7: ( '/' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:14:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:15:7: ( 'script' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:15:9: 'script'
            {
            match("script"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:16:7: ( '(' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:17:7: ( ')' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:18:7: ( '->' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:18:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:19:7: ( 'link' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:19:9: 'link'
            {
            match("link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:20:7: ( '{' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:21:7: ( '}' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:22:7: ( ';' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:23:7: ( 'end' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:23:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:24:7: ( ':' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:25:7: ( 'var' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:25:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:26:7: ( '!' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:26:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:27:7: ( '.' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:28:7: ( '=' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:29:7: ( '|' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:29:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:30:7: ( ',' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:30:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:31:7: ( 'match' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:31:9: 'match'
            {
            match("match"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:32:7: ( 'with' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:32:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:33:7: ( '[' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:33:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:34:7: ( ']' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:34:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:35:7: ( 'put' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:35:9: 'put'
            {
            match("put"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_KEYWORD_ID"
    public final void mRULE_KEYWORD_ID() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5312:17: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ':' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5312:19: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ':'
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5312:19: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5312:19: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5312:48: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEYWORD_ID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5314:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5314:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5314:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5314:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5314:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5316:10: ( ( '0' .. '9' )+ )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5316:12: ( '0' .. '9' )+
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5316:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5316:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5318:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5318:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5318:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5318:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5318:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5318:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5318:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5318:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5318:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5318:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5318:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5320:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5320:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5320:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5320:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5322:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5322:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5322:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5322:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5322:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5322:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5322:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5322:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5324:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5324:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5324:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5326:16: ( . )
            // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:5326:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_KEYWORD_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=33;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:160: RULE_KEYWORD_ID
                {
                mRULE_KEYWORD_ID(); 

                }
                break;
            case 27 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:176: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:184: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:193: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:205: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:221: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:237: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // ../org.eclectic.frontend.syntax.script.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalScript.g:1:245: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\2\uffff\1\42\1\uffff\1\46\1\50\2\uffff\1\50\3\uffff\1\50\1\uffff"+
        "\1\50\5\uffff\2\50\2\uffff\1\50\1\37\1\50\1\uffff\2\37\11\uffff"+
        "\1\50\1\uffff\1\50\3\uffff\1\50\3\uffff\1\50\1\uffff\1\50\5\uffff"+
        "\2\50\2\uffff\2\50\3\uffff\2\50\1\113\1\114\2\50\1\117\1\50\1\121"+
        "\2\uffff\1\50\1\123\1\uffff\1\50\1\uffff\1\125\1\uffff\1\126\2\uffff";
    static final String DFA14_eofS =
        "\127\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\1\76\1\uffff\1\52\1\60\2\uffff\1\60\3\uffff\1\60\1"+
        "\uffff\1\60\5\uffff\2\60\2\uffff\1\60\1\101\1\60\1\uffff\2\0\11"+
        "\uffff\1\60\1\uffff\1\60\3\uffff\1\60\3\uffff\1\60\1\uffff\1\60"+
        "\5\uffff\2\60\2\uffff\2\60\3\uffff\11\60\2\uffff\2\60\1\uffff\1"+
        "\60\1\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\1\76\1\uffff\1\57\1\172\2\uffff\1\172\3\uffff\1"+
        "\172\1\uffff\1\172\5\uffff\2\172\2\uffff\3\172\1\uffff\2\uffff\11"+
        "\uffff\1\172\1\uffff\1\172\3\uffff\1\172\3\uffff\1\172\1\uffff\1"+
        "\172\5\uffff\2\172\2\uffff\2\172\3\uffff\11\172\2\uffff\2\172\1"+
        "\uffff\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\2\uffff\1\6\1\7\1\uffff\1\12\1\13\1\14"+
        "\1\uffff\1\16\1\uffff\1\20\1\21\1\22\1\23\1\24\2\uffff\1\27\1\30"+
        "\3\uffff\1\34\2\uffff\1\40\1\41\1\1\1\10\1\2\1\3\1\36\1\37\1\4\1"+
        "\uffff\1\33\1\uffff\1\32\1\6\1\7\1\uffff\1\12\1\13\1\14\1\uffff"+
        "\1\16\1\uffff\1\20\1\21\1\22\1\23\1\24\2\uffff\1\27\1\30\2\uffff"+
        "\1\34\1\35\1\40\11\uffff\1\15\1\17\2\uffff\1\31\1\uffff\1\11\1\uffff"+
        "\1\26\1\uffff\1\25\1\5";
    static final String DFA14_specialS =
        "\1\0\33\uffff\1\1\1\2\71\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\17\1\34\4\37\1\35\1\6\1\7"+
            "\1\3\1\1\1\23\1\2\1\20\1\4\12\33\1\15\1\13\1\37\1\21\3\37\32"+
            "\32\1\26\1\37\1\27\1\31\1\32\1\37\4\32\1\14\6\32\1\10\1\24\2"+
            "\32\1\30\2\32\1\5\2\32\1\16\1\25\3\32\1\11\1\22\1\12\uff82\37",
            "",
            "\1\41",
            "",
            "\1\44\4\uffff\1\45",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\2\51\1\47\27"+
            "\51",
            "",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\10\51\1\55\21"+
            "\51",
            "",
            "",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\15\51\1\61\14"+
            "\51",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\1\63\31\51",
            "",
            "",
            "",
            "",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\1\71\31\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\10\51\1\72\21"+
            "\51",
            "",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\24\51\1\75\5"+
            "\51",
            "\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\0\100",
            "\0\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\21\51\1\102"+
            "\10\51",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\15\51\1\103"+
            "\14\51",
            "",
            "",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\3\51\1\104\26"+
            "\51",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\21\51\1\105"+
            "\10\51",
            "",
            "",
            "",
            "",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\23\51\1\106"+
            "\6\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\23\51\1\107"+
            "\6\51",
            "",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\23\51\1\110"+
            "\6\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\10\51\1\111"+
            "\21\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\12\51\1\112"+
            "\17\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\2\51\1\115\27"+
            "\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\7\51\1\116\22"+
            "\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\17\51\1\120"+
            "\12\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\7\51\1\122\22"+
            "\51",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\23\51\1\124"+
            "\6\51",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\1\52\6\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    static class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_KEYWORD_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='+') ) {s = 1;}

                        else if ( (LA14_0=='-') ) {s = 2;}

                        else if ( (LA14_0=='*') ) {s = 3;}

                        else if ( (LA14_0=='/') ) {s = 4;}

                        else if ( (LA14_0=='s') ) {s = 5;}

                        else if ( (LA14_0=='(') ) {s = 6;}

                        else if ( (LA14_0==')') ) {s = 7;}

                        else if ( (LA14_0=='l') ) {s = 8;}

                        else if ( (LA14_0=='{') ) {s = 9;}

                        else if ( (LA14_0=='}') ) {s = 10;}

                        else if ( (LA14_0==';') ) {s = 11;}

                        else if ( (LA14_0=='e') ) {s = 12;}

                        else if ( (LA14_0==':') ) {s = 13;}

                        else if ( (LA14_0=='v') ) {s = 14;}

                        else if ( (LA14_0=='!') ) {s = 15;}

                        else if ( (LA14_0=='.') ) {s = 16;}

                        else if ( (LA14_0=='=') ) {s = 17;}

                        else if ( (LA14_0=='|') ) {s = 18;}

                        else if ( (LA14_0==',') ) {s = 19;}

                        else if ( (LA14_0=='m') ) {s = 20;}

                        else if ( (LA14_0=='w') ) {s = 21;}

                        else if ( (LA14_0=='[') ) {s = 22;}

                        else if ( (LA14_0==']') ) {s = 23;}

                        else if ( (LA14_0=='p') ) {s = 24;}

                        else if ( (LA14_0=='^') ) {s = 25;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='d')||(LA14_0>='f' && LA14_0<='k')||(LA14_0>='n' && LA14_0<='o')||(LA14_0>='q' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='u')||(LA14_0>='x' && LA14_0<='z')) ) {s = 26;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 27;}

                        else if ( (LA14_0=='\"') ) {s = 28;}

                        else if ( (LA14_0=='\'') ) {s = 29;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 30;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='&')||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_28 = input.LA(1);

                        s = -1;
                        if ( ((LA14_28>='\u0000' && LA14_28<='\uFFFF')) ) {s = 64;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_29 = input.LA(1);

                        s = -1;
                        if ( ((LA14_29>='\u0000' && LA14_29<='\uFFFF')) ) {s = 64;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}