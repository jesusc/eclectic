package org.eclectic.frontend.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEclecticLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T__43=43;
    public static final int RULE_KEYWORD_ID=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__44=44;
    public static final int T__82=82;
    public static final int T__45=45;
    public static final int T__83=83;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__86=86;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int RULE_WS=10;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalEclecticLexer() {;} 
    public InternalEclecticLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEclecticLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:11:7: ( '@' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:11:9: '@'
            {
            match('@'); 

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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:12:7: ( '^' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:12:9: '^'
            {
            match('^'); 

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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:13:7: ( 'true' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:13:9: 'true'
            {
            match("true"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:14:7: ( 'false' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:14:9: 'false'
            {
            match("false"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:15:7: ( 'qool' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:15:9: 'qool'
            {
            match("qool"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:16:7: ( 'scripting' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:16:9: 'scripting'
            {
            match("scripting"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:17:7: ( 'with' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:17:9: 'with'
            {
            match("with"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:18:7: ( '+' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:18:9: '+'
            {
            match('+'); 

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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:19:7: ( '-' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:19:9: '-'
            {
            match('-'); 

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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:20:7: ( '*' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:20:9: '*'
            {
            match('*'); 

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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:21:7: ( '/' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:21:9: '/'
            {
            match('/'); 

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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:22:7: ( 'eclectic' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:22:9: 'eclectic'
            {
            match("eclectic"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:23:7: ( '(' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:23:9: '('
            {
            match('('); 

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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:24:7: ( ')' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:24:9: ')'
            {
            match(')'); 

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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:25:7: ( '->' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:25:9: '->'
            {
            match("->"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:26:7: ( ',' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:26:9: ','
            {
            match(','); 

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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:27:7: ( 'mappings' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:27:9: 'mappings'
            {
            match("mappings"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:28:7: ( 'end' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:28:9: 'end'
            {
            match("end"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:29:7: ( 'optimizations' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:29:9: 'optimizations'
            {
            match("optimizations"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:30:7: ( ':' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:30:9: ':'
            {
            match(':'); 

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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:31:7: ( 'uses' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:31:9: 'uses'
            {
            match("uses"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:32:7: ( 'as' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:32:9: 'as'
            {
            match("as"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33:7: ( 'require' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33:9: 'require'
            {
            match("require"); 


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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:34:7: ( '=' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:34:9: '='
            {
            match('='); 

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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:35:7: ( 'delegate' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:35:9: 'delegate'
            {
            match("delegate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:36:7: ( 'from' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:36:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:37:7: ( 'to' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:37:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:38:7: ( '.' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:38:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:39:7: ( '[' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:39:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:40:7: ( ']' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:40:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:41:7: ( '!' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:41:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:42:7: ( 'linking' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:42:9: 'linking'
            {
            match("linking"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:43:7: ( '<-' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:43:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:44:7: ( 'convert' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:44:9: 'convert'
            {
            match("convert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:45:7: ( 'patterns' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:45:9: 'patterns'
            {
            match("patterns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:46:7: ( 'def' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:46:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:47:7: ( '{' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:47:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:48:7: ( '}' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:48:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:49:7: ( 'navigation' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:49:9: 'navigation'
            {
            match("navigation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:50:7: ( 'model' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:50:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:51:7: ( 'class' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:51:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:52:7: ( ';' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:52:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:53:7: ( 'att' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:53:9: 'att'
            {
            match("att"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:54:7: ( 'ref' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:54:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:55:7: ( 'local' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:55:9: 'local'
            {
            match("local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:56:7: ( 'queue' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:56:9: 'queue'
            {
            match("queue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:57:7: ( 'access-by' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:57:9: 'access-by'
            {
            match("access-by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:58:7: ( 'segment' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:58:9: 'segment'
            {
            match("segment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:59:7: ( '|' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:59:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:60:7: ( 'invoke-internal' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:60:9: 'invoke-internal'
            {
            match("invoke-internal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:61:7: ( 'input-view-filter' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:61:9: 'input-view-filter'
            {
            match("input-view-filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:62:7: ( 'entrypoint' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:62:9: 'entrypoint'
            {
            match("entrypoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:63:7: ( 'invoke-external' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:63:9: 'invoke-external'
            {
            match("invoke-external"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:64:7: ( 'output-element' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:64:9: 'output-element'
            {
            match("output-element"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:65:7: ( 'forall' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:65:9: 'forall'
            {
            match("forall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:66:7: ( 'where' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:66:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:67:7: ( 'emit' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:67:9: 'emit'
            {
            match("emit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:68:7: ( '#kindOf' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:68:9: '#kindOf'
            {
            match("#kindOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:69:7: ( '#p' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:69:9: '#p'
            {
            match("#p"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:70:7: ( 'copy' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:70:9: 'copy'
            {
            match("copy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:71:7: ( 'tao' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:71:9: 'tao'
            {
            match("tao"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:72:7: ( 'template' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:72:9: 'template'
            {
            match("template"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:73:7: ( 'attribution' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:73:9: 'attribution'
            {
            match("attribution"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:74:7: ( 'inh' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:74:9: 'inh'
            {
            match("inh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:75:7: ( 'syn' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:75:9: 'syn'
            {
            match("syn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:76:7: ( 'rule' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:76:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:77:7: ( 'link' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:77:9: 'link'
            {
            match("link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:78:7: ( 'var' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:78:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:79:7: ( 'if' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:79:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:80:7: ( 'elsif' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:80:9: 'elsif'
            {
            match("elsif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:81:7: ( 'else' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:81:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:82:7: ( 'match' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:82:9: 'match'
            {
            match("match"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:83:7: ( 'put' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:83:9: 'put'
            {
            match("put"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:84:7: ( 'enabled' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:84:9: 'enabled'
            {
            match("enabled"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:85:7: ( 'stop' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:85:9: 'stop'
            {
            match("stop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "RULE_KEYWORD_ID"
    public final void mRULE_KEYWORD_ID() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33383:17: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ':' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33383:19: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ':'
            {
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33383:19: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33383:19: '^'
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

            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33383:48: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:
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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33385:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33385:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33385:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33385:11: '^'
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

            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33385:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:
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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33387:10: ( ( '0' .. '9' )+ )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33387:12: ( '0' .. '9' )+
            {
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33387:12: ( '0' .. '9' )+
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
            	    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33387:13: '0' .. '9'
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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33389:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33389:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33389:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33389:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33389:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33389:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33389:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33389:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33389:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33389:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33389:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33391:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33391:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33391:24: ( options {greedy=false; } : . )*
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
            	    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33391:52: .
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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33393:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33393:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33393:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33393:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33393:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33393:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33393:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33393:41: '\\r'
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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33395:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33395:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33395:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:
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
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33397:16: ( . )
            // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:33397:18: .
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
        // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | RULE_KEYWORD_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=83;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:448: T__85
                {
                mT__85(); 

                }
                break;
            case 75 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:454: T__86
                {
                mT__86(); 

                }
                break;
            case 76 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:460: RULE_KEYWORD_ID
                {
                mRULE_KEYWORD_ID(); 

                }
                break;
            case 77 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:476: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 78 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:484: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 79 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:493: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 80 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:505: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 81 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:521: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 82 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:537: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 83 :
                // ../org.eclectic.frontend.syntax.ui/src-gen/org/eclectic/frontend/ui/contentassist/antlr/internal/InternalEclectic.g:1:545: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\2\uffff\1\57\5\66\1\uffff\1\105\1\uffff\1\111\1\66\3\uffff\2\66"+
        "\1\uffff\3\66\1\uffff\1\66\4\uffff\1\66\1\55\2\66\2\uffff\1\66\2"+
        "\uffff\1\66\1\55\2\66\1\uffff\2\55\4\uffff\2\66\1\167\3\66\2\uffff"+
        "\13\66\7\uffff\4\66\3\uffff\4\66\1\uffff\1\66\1\u0091\4\66\1\uffff"+
        "\1\66\4\uffff\2\66\1\uffff\4\66\2\uffff\1\66\2\uffff\1\66\1\u00a4"+
        "\2\uffff\1\66\3\uffff\1\66\1\uffff\1\u00a7\10\66\1\u00b0\4\66\1"+
        "\u00b5\12\66\1\uffff\1\u00c2\2\66\1\u00c5\2\66\1\u00c8\6\66\1\u00cf"+
        "\3\66\1\u00d3\1\uffff\1\u00d4\1\u00d5\1\uffff\2\66\1\u00d8\1\66"+
        "\1\u00da\3\66\1\uffff\1\u00de\1\u00df\2\66\1\uffff\2\66\1\u00e4"+
        "\1\66\1\u00e6\5\66\1\u00ec\1\66\1\uffff\2\66\1\uffff\1\u00f0\1\66"+
        "\1\uffff\1\u00f3\2\66\1\u00f6\2\66\1\uffff\3\66\3\uffff\1\66\1\u00fd"+
        "\1\uffff\1\66\1\uffff\1\u00ff\2\66\2\uffff\1\u0102\3\66\1\uffff"+
        "\1\u0106\1\uffff\1\66\1\u0108\1\u0109\2\66\1\uffff\3\66\1\uffff"+
        "\2\66\1\uffff\1\u0111\1\66\1\uffff\1\u0113\5\66\1\uffff\1\u0119"+
        "\1\uffff\2\66\1\uffff\3\66\1\uffff\1\66\2\uffff\7\66\1\uffff\1\66"+
        "\1\uffff\3\66\1\uffff\1\66\1\uffff\1\66\1\u012d\2\66\1\u0130\2\66"+
        "\1\uffff\1\66\1\uffff\1\u0134\1\66\1\u0136\1\u0137\2\66\1\uffff"+
        "\1\u013c\1\66\1\uffff\1\u013e\1\66\1\uffff\1\u0140\2\66\1\uffff"+
        "\1\u0143\2\uffff\1\u0144\1\66\3\uffff\1\u0146\1\uffff\1\66\1\uffff"+
        "\2\66\2\uffff\1\66\1\uffff\1\u014b\2\66\1\u014e\1\uffff\1\66\1\u0150"+
        "\1\uffff\1\66\1\uffff\1\u0152\1\uffff";
    static final String DFA14_eofS =
        "\u0153\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\1\101\5\60\1\uffff\1\76\1\uffff\1\52\1\60\3\uffff\2"+
        "\60\1\uffff\3\60\1\uffff\1\60\4\uffff\1\60\1\55\2\60\2\uffff\1\60"+
        "\2\uffff\1\60\1\153\2\60\1\uffff\2\0\4\uffff\6\60\2\uffff\13\60"+
        "\7\uffff\4\60\3\uffff\4\60\1\uffff\6\60\1\uffff\1\60\4\uffff\2\60"+
        "\1\uffff\4\60\2\uffff\1\60\2\uffff\2\60\2\uffff\1\60\3\uffff\1\60"+
        "\1\uffff\31\60\1\uffff\22\60\1\uffff\2\60\1\uffff\10\60\1\uffff"+
        "\4\60\1\uffff\14\60\1\uffff\2\60\1\uffff\2\60\1\uffff\6\60\1\uffff"+
        "\3\60\3\uffff\2\60\1\uffff\1\60\1\uffff\3\60\2\uffff\4\60\1\uffff"+
        "\1\60\1\uffff\5\60\1\uffff\3\60\1\uffff\2\60\1\uffff\2\60\1\uffff"+
        "\4\60\1\55\1\60\1\uffff\1\60\1\uffff\2\60\1\uffff\3\60\1\uffff\1"+
        "\60\2\uffff\1\60\1\55\1\60\1\55\3\60\1\uffff\1\60\1\uffff\2\60\1"+
        "\55\1\uffff\1\60\1\uffff\7\60\1\uffff\1\60\1\uffff\6\60\1\145\2"+
        "\60\1\uffff\2\60\1\uffff\3\60\1\uffff\1\60\2\uffff\2\60\3\uffff"+
        "\1\60\1\uffff\1\60\1\uffff\2\60\2\uffff\1\60\1\uffff\4\60\1\uffff"+
        "\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\6\172\1\uffff\1\76\1\uffff\1\57\1\172\3\uffff\2"+
        "\172\1\uffff\3\172\1\uffff\1\172\4\uffff\1\172\1\55\2\172\2\uffff"+
        "\1\172\2\uffff\1\172\1\160\2\172\1\uffff\2\uffff\4\uffff\6\172\2"+
        "\uffff\13\172\7\uffff\4\172\3\uffff\4\172\1\uffff\6\172\1\uffff"+
        "\1\172\4\uffff\2\172\1\uffff\4\172\2\uffff\1\172\2\uffff\2\172\2"+
        "\uffff\1\172\3\uffff\1\172\1\uffff\31\172\1\uffff\22\172\1\uffff"+
        "\2\172\1\uffff\10\172\1\uffff\4\172\1\uffff\14\172\1\uffff\2\172"+
        "\1\uffff\2\172\1\uffff\6\172\1\uffff\3\172\3\uffff\2\172\1\uffff"+
        "\1\172\1\uffff\3\172\2\uffff\4\172\1\uffff\1\172\1\uffff\5\172\1"+
        "\uffff\3\172\1\uffff\2\172\1\uffff\2\172\1\uffff\6\172\1\uffff\1"+
        "\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\2\uffff\7\172\1\uffff"+
        "\1\172\1\uffff\3\172\1\uffff\1\172\1\uffff\7\172\1\uffff\1\172\1"+
        "\uffff\6\172\1\151\2\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172"+
        "\2\uffff\2\172\3\uffff\1\172\1\uffff\1\172\1\uffff\2\172\2\uffff"+
        "\1\172\1\uffff\4\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1"+
        "\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\6\uffff\1\10\1\uffff\1\12\2\uffff\1\15\1\16\1\20\2"+
        "\uffff\1\24\3\uffff\1\30\1\uffff\1\34\1\35\1\36\1\37\4\uffff\1\45"+
        "\1\46\1\uffff\1\52\1\61\4\uffff\1\116\2\uffff\1\122\1\123\1\1\1"+
        "\2\6\uffff\1\115\1\114\13\uffff\1\10\1\17\1\11\1\12\1\120\1\121"+
        "\1\13\4\uffff\1\15\1\16\1\20\4\uffff\1\24\6\uffff\1\30\1\uffff\1"+
        "\34\1\35\1\36\1\37\2\uffff\1\41\4\uffff\1\45\1\46\1\uffff\1\52\1"+
        "\61\2\uffff\1\72\1\73\1\uffff\1\116\1\117\1\122\1\uffff\1\33\31"+
        "\uffff\1\26\22\uffff\1\105\2\uffff\1\75\10\uffff\1\101\4\uffff\1"+
        "\22\14\uffff\1\53\2\uffff\1\54\2\uffff\1\44\6\uffff\1\111\3\uffff"+
        "\1\100\1\104\1\3\2\uffff\1\32\1\uffff\1\5\3\uffff\1\113\1\7\4\uffff"+
        "\1\71\1\uffff\1\107\5\uffff\1\25\3\uffff\1\102\2\uffff\1\103\2\uffff"+
        "\1\74\6\uffff\1\4\1\uffff\1\56\2\uffff\1\70\3\uffff\1\106\1\uffff"+
        "\1\110\1\50\7\uffff\1\55\1\uffff\1\51\3\uffff\1\63\1\uffff\1\67"+
        "\7\uffff\1\66\1\uffff\1\57\11\uffff\1\60\2\uffff\1\112\3\uffff\1"+
        "\27\1\uffff\1\40\1\42\2\uffff\1\62\1\65\1\76\1\uffff\1\14\1\uffff"+
        "\1\21\2\uffff\1\31\1\43\1\uffff\1\6\4\uffff\1\64\2\uffff\1\47\1"+
        "\uffff\1\77\1\uffff\1\23";
    static final String DFA14_specialS =
        "\1\1\51\uffff\1\0\1\2\u0127\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\33\1\52\1\46\3\55\1\53\1"+
            "\15\1\16\1\12\1\10\1\17\1\11\1\30\1\13\12\51\1\22\1\43\1\35"+
            "\1\26\2\55\1\1\32\50\1\31\1\55\1\32\1\2\1\50\1\55\1\24\1\50"+
            "\1\36\1\27\1\14\1\4\2\50\1\45\2\50\1\34\1\20\1\42\1\21\1\37"+
            "\1\5\1\25\1\6\1\3\1\23\1\47\1\7\3\50\1\40\1\44\1\41\uff82\55",
            "",
            "\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\63\3\65\1"+
            "\64\11\65\1\62\2\65\1\61\10\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\70\15\65\1"+
            "\72\2\65\1\71\10\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\73\5"+
            "\65\1\74\5\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\75\1"+
            "\65\1\76\16\65\1\100\4\65\1\77\1\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\102\1"+
            "\101\21\65",
            "",
            "\1\104",
            "",
            "\1\107\4\uffff\1\110",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\112\10"+
            "\65\1\115\1\114\1\113\14\65",
            "",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\121\15\65"+
            "\1\122\13\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\123"+
            "\4\65\1\124\5\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\126"+
            "\7\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\131\17"+
            "\65\1\127\1\130\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\132\17"+
            "\65\1\133\5\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\135\25"+
            "\65",
            "",
            "",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\142"+
            "\5\65\1\143\13\65",
            "\1\144",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\146"+
            "\2\65\1\145\13\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\147\23\65"+
            "\1\150\5\65",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\153\31\65",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\157\7"+
            "\65\1\156\14\65",
            "\1\160\4\uffff\1\161",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\162\31\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\0\164",
            "\0\164",
            "",
            "",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\166"+
            "\5\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\170"+
            "\13\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\14\65\1\171"+
            "\15\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\172"+
            "\16\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\173"+
            "\13\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\174"+
            "\10\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\175"+
            "\13\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\176\25"+
            "\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\177"+
            "\10\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u0080"+
            "\23\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0081"+
            "\14\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0082"+
            "\13\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0083"+
            "\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0084"+
            "\25\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0085"+
            "\16\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\u0088\2\65"+
            "\1\u0086\17\65\1\u0087\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0089"+
            "\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u008a"+
            "\7\65",
            "",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\u008b"+
            "\3\65\1\u008c\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u008d"+
            "\26\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u008e"+
            "\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u008f"+
            "\6\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0090"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0092"+
            "\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u0093"+
            "\27\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\u0095"+
            "\12\65\1\u0094\11\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0096"+
            "\16\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\u0098"+
            "\5\65\1\u0097\16\65",
            "",
            "",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0099"+
            "\14\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u009a"+
            "\27\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u009b"+
            "\1\65\1\u009c\12\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\u009d\31\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u009e"+
            "\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u009f"+
            "\6\65",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\25\65\1\u00a0"+
            "\4\65",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\u00a3"+
            "\7\65\1\u00a2\5\65\1\u00a1\4\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00a5"+
            "\10\65",
            "",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00a6"+
            "\25\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\u00a8"+
            "\12\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00a9"+
            "\7\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\14\65\1\u00aa"+
            "\15\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\u00ab\31\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00ac"+
            "\16\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00ad"+
            "\5\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00ae"+
            "\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\14\65\1\u00af"+
            "\15\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\u00b1"+
            "\12\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\u00b2"+
            "\22\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00b3"+
            "\10\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00b4"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00b6"+
            "\10\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\65\1\u00b7"+
            "\30\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00b8"+
            "\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00ba"+
            "\3\65\1\u00b9\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\u00bb"+
            "\12\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u00bc"+
            "\27\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00bd"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00be"+
            "\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\u00bf"+
            "\12\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00c0"+
            "\7\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00c1"+
            "\10\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00c3"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00c4"+
            "\5\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00c6"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00c7"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\12\65\1\u00c9"+
            "\17\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\u00ca\31\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\25\65\1\u00cb"+
            "\4\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\30\65\1\u00cc"+
            "\1\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00cd"+
            "\7\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00ce"+
            "\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00d0"+
            "\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u00d1"+
            "\13\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00d2"+
            "\5\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00d6"+
            "\16\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00d7"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00d9"+
            "\16\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00db"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\u00dc"+
            "\12\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00dd"+
            "\25\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00e0"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u00e1"+
            "\27\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\30\65\1\u00e2"+
            "\1\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00e3"+
            "\16\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\u00e5"+
            "\24\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00e7"+
            "\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\u00e8"+
            "\22\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00e9"+
            "\16\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\14\65\1\u00ea"+
            "\15\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00eb"+
            "\5\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00ed"+
            "\21\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00ee"+
            "\7\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00ef"+
            "\21\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u00f1"+
            "\23\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00f2"+
            "\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00f4"+
            "\16\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00f5"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00f7"+
            "\7\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00f8"+
            "\25\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u00f9"+
            "\23\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\12\65\1\u00fa"+
            "\17\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00fb"+
            "\6\65",
            "",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\u00fc\31\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00fe"+
            "\16\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0100"+
            "\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0101"+
            "\14\65",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0103"+
            "\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\u0104"+
            "\12\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0105"+
            "\25\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0107"+
            "\14\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u010a"+
            "\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u010b"+
            "\6\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\65\1\u010c"+
            "\30\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u010d"+
            "\7\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u010e"+
            "\10\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\u010f\31\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0110"+
            "\14\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0112"+
            "\10\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0114"+
            "\10\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\u0115\31\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0116"+
            "\25\65",
            "\1\u0117\2\uffff\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff"+
            "\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0118"+
            "\6\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u011a"+
            "\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u011b"+
            "\6\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u011c"+
            "\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u011d"+
            "\13\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u011e"+
            "\26\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u011f"+
            "\23\65",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\31\65\1\u0120",
            "\1\u0121\2\uffff\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff"+
            "\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u0122"+
            "\5\65",
            "\1\u0123\2\uffff\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff"+
            "\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0124"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0125"+
            "\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u0126"+
            "\23\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0127"+
            "\6\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0128"+
            "\14\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0129"+
            "\6\65",
            "\1\u012a\2\uffff\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff"+
            "\32\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u012b"+
            "\25\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u012c"+
            "\14\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u012e"+
            "\27\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u012f"+
            "\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0131"+
            "\7\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\1\u0132\31\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0133"+
            "\6\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0135"+
            "\25\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0138"+
            "\7\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0139"+
            "\21\65",
            "\1\u013b\3\uffff\1\u013a",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u013d"+
            "\23\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u013f"+
            "\14\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0141"+
            "\6\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0142"+
            "\21\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0145"+
            "\13\65",
            "",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0147"+
            "\6\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0148"+
            "\21\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0149"+
            "\13\65",
            "",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u014a"+
            "\14\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u014c"+
            "\13\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u014d"+
            "\14\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u014f"+
            "\14\65",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0151"+
            "\7\65",
            "",
            "\12\65\1\67\6\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | RULE_KEYWORD_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_42 = input.LA(1);

                        s = -1;
                        if ( ((LA14_42>='\u0000' && LA14_42<='\uFFFF')) ) {s = 116;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='@') ) {s = 1;}

                        else if ( (LA14_0=='^') ) {s = 2;}

                        else if ( (LA14_0=='t') ) {s = 3;}

                        else if ( (LA14_0=='f') ) {s = 4;}

                        else if ( (LA14_0=='q') ) {s = 5;}

                        else if ( (LA14_0=='s') ) {s = 6;}

                        else if ( (LA14_0=='w') ) {s = 7;}

                        else if ( (LA14_0=='+') ) {s = 8;}

                        else if ( (LA14_0=='-') ) {s = 9;}

                        else if ( (LA14_0=='*') ) {s = 10;}

                        else if ( (LA14_0=='/') ) {s = 11;}

                        else if ( (LA14_0=='e') ) {s = 12;}

                        else if ( (LA14_0=='(') ) {s = 13;}

                        else if ( (LA14_0==')') ) {s = 14;}

                        else if ( (LA14_0==',') ) {s = 15;}

                        else if ( (LA14_0=='m') ) {s = 16;}

                        else if ( (LA14_0=='o') ) {s = 17;}

                        else if ( (LA14_0==':') ) {s = 18;}

                        else if ( (LA14_0=='u') ) {s = 19;}

                        else if ( (LA14_0=='a') ) {s = 20;}

                        else if ( (LA14_0=='r') ) {s = 21;}

                        else if ( (LA14_0=='=') ) {s = 22;}

                        else if ( (LA14_0=='d') ) {s = 23;}

                        else if ( (LA14_0=='.') ) {s = 24;}

                        else if ( (LA14_0=='[') ) {s = 25;}

                        else if ( (LA14_0==']') ) {s = 26;}

                        else if ( (LA14_0=='!') ) {s = 27;}

                        else if ( (LA14_0=='l') ) {s = 28;}

                        else if ( (LA14_0=='<') ) {s = 29;}

                        else if ( (LA14_0=='c') ) {s = 30;}

                        else if ( (LA14_0=='p') ) {s = 31;}

                        else if ( (LA14_0=='{') ) {s = 32;}

                        else if ( (LA14_0=='}') ) {s = 33;}

                        else if ( (LA14_0=='n') ) {s = 34;}

                        else if ( (LA14_0==';') ) {s = 35;}

                        else if ( (LA14_0=='|') ) {s = 36;}

                        else if ( (LA14_0=='i') ) {s = 37;}

                        else if ( (LA14_0=='#') ) {s = 38;}

                        else if ( (LA14_0=='v') ) {s = 39;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='x' && LA14_0<='z')) ) {s = 40;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 41;}

                        else if ( (LA14_0=='\"') ) {s = 42;}

                        else if ( (LA14_0=='\'') ) {s = 43;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 44;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='>' && LA14_0<='?')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_43 = input.LA(1);

                        s = -1;
                        if ( ((LA14_43>='\u0000' && LA14_43<='\uFFFF')) ) {s = 116;}

                        else s = 45;

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