// $ANTLR 3.1 src/serializers/ValidationDSL.g 2013-06-20 11:09:04

/*******************************************************************************
 * MetaDepth parser for language: ValidationDSL
 ******************************************************************************/
package serializers;
import meteoric.at3rdx.parse.MetaDepthParserBase;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ValidationDSLLexer extends Lexer {
    public static final int VALIDATIONDSL_NODE=18;
    public static final int ID_ACCESS=13;
    public static final int EXPONENT=24;
    public static final int SYMBOL=11;
    public static final int UNICODE_ESC=30;
    public static final int DOC_INSTANCE=4;
    public static final int OCTAL_ESC=31;
    public static final int CHAR=29;
    public static final int DATAFLOWLINKTEMPLATE_NODE=8;
    public static final int HEX_DIGIT=32;
    public static final int FLOAT=25;
    public static final int INT=23;
    public static final int SYMBOL22=19;
    public static final int ID=21;
    public static final int EOF=-1;
    public static final int TRUE=9;
    public static final int TOKEN=12;
    public static final int DFNEXT=7;
    public static final int COLON=20;
    public static final int WS=27;
    public static final int ESC_SEQ=28;
    public static final int LIST_VALUE=14;
    public static final int VALIDATE=15;
    public static final int CFNEXT=5;
    public static final int COMMENT=26;
    public static final int FALSE=10;
    public static final int CONTROLFLOWLINKTEMPLATE_NODE=6;
    public static final int GROUP2=17;
    public static final int GROUP1=16;
    public static final int STRING=22;

    // delegates
    // delegators

    public ValidationDSLLexer() {;} 
    public ValidationDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ValidationDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "src/serializers/ValidationDSL.g"; }

    // $ANTLR start "CFNEXT"
    public final void mCFNEXT() throws RecognitionException {
        try {
            int _type = CFNEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:11:8: ( 'cfNext' )
            // src/serializers/ValidationDSL.g:11:10: 'cfNext'
            {
            match("cfNext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CFNEXT"

    // $ANTLR start "DFNEXT"
    public final void mDFNEXT() throws RecognitionException {
        try {
            int _type = DFNEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:12:8: ( 'dfNext' )
            // src/serializers/ValidationDSL.g:12:10: 'dfNext'
            {
            match("dfNext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DFNEXT"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:13:6: ( 'true' )
            // src/serializers/ValidationDSL.g:13:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:14:7: ( 'false' )
            // src/serializers/ValidationDSL.g:14:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "VALIDATE"
    public final void mVALIDATE() throws RecognitionException {
        try {
            int _type = VALIDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:15:10: ( 'validate' )
            // src/serializers/ValidationDSL.g:15:12: 'validate'
            {
            match("validate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALIDATE"

    // $ANTLR start "SYMBOL22"
    public final void mSYMBOL22() throws RecognitionException {
        try {
            int _type = SYMBOL22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:16:10: ( '-->' )
            // src/serializers/ValidationDSL.g:16:12: '-->'
            {
            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SYMBOL22"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:17:7: ( ':' )
            // src/serializers/ValidationDSL.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:51:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // src/serializers/ValidationDSL.g:51:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // src/serializers/ValidationDSL.g:51:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/serializers/ValidationDSL.g:
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
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:52:5: ( ( '0' .. '9' )+ )
            // src/serializers/ValidationDSL.g:52:7: ( '0' .. '9' )+
            {
            // src/serializers/ValidationDSL.g:52:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/serializers/ValidationDSL.g:52:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:53:6: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // src/serializers/ValidationDSL.g:53:10: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // src/serializers/ValidationDSL.g:53:10: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // src/serializers/ValidationDSL.g:53:11: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    match('.'); 
                    // src/serializers/ValidationDSL.g:53:26: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // src/serializers/ValidationDSL.g:53:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // src/serializers/ValidationDSL.g:53:38: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // src/serializers/ValidationDSL.g:53:38: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/serializers/ValidationDSL.g:53:52: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // src/serializers/ValidationDSL.g:53:56: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/serializers/ValidationDSL.g:53:57: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    // src/serializers/ValidationDSL.g:53:68: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // src/serializers/ValidationDSL.g:53:68: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // src/serializers/ValidationDSL.g:53:82: ( '0' .. '9' )+ EXPONENT
                    {
                    // src/serializers/ValidationDSL.g:53:82: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // src/serializers/ValidationDSL.g:53:83: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // src/serializers/ValidationDSL.g:54:19: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // src/serializers/ValidationDSL.g:54:21: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // src/serializers/ValidationDSL.g:54:31: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src/serializers/ValidationDSL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // src/serializers/ValidationDSL.g:54:42: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/serializers/ValidationDSL.g:54:43: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:55:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='/') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='/') ) {
                    alt15=1;
                }
                else if ( (LA15_1=='*') ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // src/serializers/ValidationDSL.g:55:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // src/serializers/ValidationDSL.g:55:18: (~ ( '\\n' | '\\r' ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFE')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // src/serializers/ValidationDSL.g:55:18: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // src/serializers/ValidationDSL.g:55:32: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // src/serializers/ValidationDSL.g:55:32: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // src/serializers/ValidationDSL.g:55:67: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // src/serializers/ValidationDSL.g:55:72: ( options {greedy=false; } : . )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='*') ) {
                            int LA14_1 = input.LA(2);

                            if ( (LA14_1=='/') ) {
                                alt14=2;
                            }
                            else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFE')) ) {
                                alt14=1;
                            }


                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFE')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // src/serializers/ValidationDSL.g:55:100: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:56:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // src/serializers/ValidationDSL.g:56:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:57:8: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // src/serializers/ValidationDSL.g:57:11: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // src/serializers/ValidationDSL.g:57:15: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\\') ) {
                    alt16=1;
                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFE')) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // src/serializers/ValidationDSL.g:57:17: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // src/serializers/ValidationDSL.g:57:27: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/serializers/ValidationDSL.g:58:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // src/serializers/ValidationDSL.g:58:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // src/serializers/ValidationDSL.g:58:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\\') ) {
                alt17=1;
            }
            else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFE')) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // src/serializers/ValidationDSL.g:58:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // src/serializers/ValidationDSL.g:58:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // src/serializers/ValidationDSL.g:59:18: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // src/serializers/ValidationDSL.g:59:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // src/serializers/ValidationDSL.g:59:68: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // src/serializers/ValidationDSL.g:59:84: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // src/serializers/ValidationDSL.g:60:20: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>='0' && LA19_1<='3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2>='0' && LA19_2<='7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4>='0' && LA19_4<='7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;}
                    }
                    else {
                        alt19=3;}
                }
                else if ( ((LA19_1>='4' && LA19_1<='7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3>='0' && LA19_3<='7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // src/serializers/ValidationDSL.g:60:24: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/serializers/ValidationDSL.g:60:29: ( '0' .. '3' )
                    // src/serializers/ValidationDSL.g:60:30: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // src/serializers/ValidationDSL.g:60:40: ( '0' .. '7' )
                    // src/serializers/ValidationDSL.g:60:41: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // src/serializers/ValidationDSL.g:60:51: ( '0' .. '7' )
                    // src/serializers/ValidationDSL.g:60:52: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // src/serializers/ValidationDSL.g:60:66: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/serializers/ValidationDSL.g:60:71: ( '0' .. '7' )
                    // src/serializers/ValidationDSL.g:60:72: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // src/serializers/ValidationDSL.g:60:82: ( '0' .. '7' )
                    // src/serializers/ValidationDSL.g:60:83: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // src/serializers/ValidationDSL.g:60:97: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/serializers/ValidationDSL.g:60:102: ( '0' .. '7' )
                    // src/serializers/ValidationDSL.g:60:103: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // src/serializers/ValidationDSL.g:61:22: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // src/serializers/ValidationDSL.g:61:26: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // src/serializers/ValidationDSL.g:62:20: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // src/serializers/ValidationDSL.g:62:22: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    public void mTokens() throws RecognitionException {
        // src/serializers/ValidationDSL.g:1:8: ( CFNEXT | DFNEXT | TRUE | FALSE | VALIDATE | SYMBOL22 | COLON | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
        int alt20=14;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // src/serializers/ValidationDSL.g:1:10: CFNEXT
                {
                mCFNEXT(); 

                }
                break;
            case 2 :
                // src/serializers/ValidationDSL.g:1:17: DFNEXT
                {
                mDFNEXT(); 

                }
                break;
            case 3 :
                // src/serializers/ValidationDSL.g:1:24: TRUE
                {
                mTRUE(); 

                }
                break;
            case 4 :
                // src/serializers/ValidationDSL.g:1:29: FALSE
                {
                mFALSE(); 

                }
                break;
            case 5 :
                // src/serializers/ValidationDSL.g:1:35: VALIDATE
                {
                mVALIDATE(); 

                }
                break;
            case 6 :
                // src/serializers/ValidationDSL.g:1:44: SYMBOL22
                {
                mSYMBOL22(); 

                }
                break;
            case 7 :
                // src/serializers/ValidationDSL.g:1:53: COLON
                {
                mCOLON(); 

                }
                break;
            case 8 :
                // src/serializers/ValidationDSL.g:1:59: ID
                {
                mID(); 

                }
                break;
            case 9 :
                // src/serializers/ValidationDSL.g:1:62: INT
                {
                mINT(); 

                }
                break;
            case 10 :
                // src/serializers/ValidationDSL.g:1:66: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 11 :
                // src/serializers/ValidationDSL.g:1:72: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 12 :
                // src/serializers/ValidationDSL.g:1:80: WS
                {
                mWS(); 

                }
                break;
            case 13 :
                // src/serializers/ValidationDSL.g:1:83: STRING
                {
                mSTRING(); 

                }
                break;
            case 14 :
                // src/serializers/ValidationDSL.g:1:90: CHAR
                {
                mCHAR(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\2\56\3\uffff";
    static final String DFA9_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "53:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\5\10\3\uffff\1\24\5\uffff\5\10\1\uffff\7\10\1\41\4\10\1"+
        "\uffff\1\46\1\10\1\50\1\51\1\uffff\1\10\2\uffff\1\10\1\54\1\uffff";
    static final String DFA20_eofS =
        "\55\uffff";
    static final String DFA20_minS =
        "\1\11\2\146\1\162\2\141\3\uffff\1\56\5\uffff\2\116\1\165\2\154\1"+
        "\uffff\3\145\1\163\1\151\2\170\1\60\1\145\1\144\2\164\1\uffff\1"+
        "\60\1\141\2\60\1\uffff\1\164\2\uffff\1\145\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\172\2\146\1\162\2\141\3\uffff\1\145\5\uffff\2\116\1\165\2\154"+
        "\1\uffff\3\145\1\163\1\151\2\170\1\172\1\145\1\144\2\164\1\uffff"+
        "\1\172\1\141\2\172\1\uffff\1\164\2\uffff\1\145\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\6\uffff\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14\1\15\1\16\5\uffff\1"+
        "\11\14\uffff\1\3\4\uffff\1\4\1\uffff\1\1\1\2\2\uffff\1\5";
    static final String DFA20_specialS =
        "\55\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\14\2\uffff\1\14\22\uffff\1\14\1\uffff\1\15\4\uffff\1\16\5"+
            "\uffff\1\6\1\12\1\13\12\11\1\7\6\uffff\32\10\4\uffff\1\10\1"+
            "\uffff\2\10\1\1\1\2\1\10\1\4\15\10\1\3\1\10\1\5\4\10",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "",
            "",
            "",
            "\1\12\1\uffff\12\11\13\uffff\1\12\37\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
            "\1\47",
            "\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
            "\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
            "",
            "\1\52",
            "",
            "",
            "\1\53",
            "\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
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
            return "1:1: Tokens : ( CFNEXT | DFNEXT | TRUE | FALSE | VALIDATE | SYMBOL22 | COLON | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}