// $ANTLR 3.4 /home/richard/workspace/RichTea/antlr/RichTea.g 2012-08-20 22:52:47
package richTea.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RichTeaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int ARRAY=5;
    public static final int ASSIGN=6;
    public static final int AT=7;
    public static final int ATTRIBUTE=8;
    public static final int ATTRIBUTES=9;
    public static final int BOOLEAN=10;
    public static final int BRANCH=11;
    public static final int BRANCHES=12;
    public static final int CHILDREN=13;
    public static final int CLOSE_BOX=14;
    public static final int CLOSE_BRACE=15;
    public static final int CLOSE_PAREN=16;
    public static final int COLON=17;
    public static final int COMMA=18;
    public static final int COMMENT=19;
    public static final int DIVIDE=20;
    public static final int DIVIDE_EQUALS=21;
    public static final int EQ=22;
    public static final int ESC_SEQ=23;
    public static final int EXECUTABLE_FUNCTION_ATTRIBUTE=24;
    public static final int FLOAT=25;
    public static final int FUNCTION=26;
    public static final int GT=27;
    public static final int GTEQ=28;
    public static final int HASH=29;
    public static final int ID=30;
    public static final int INTEGER=31;
    public static final int LAST_RETURNED_VALUE=32;
    public static final int LETTER=33;
    public static final int LT=34;
    public static final int LTEQ=35;
    public static final int MINUS=36;
    public static final int MINUS_EQUALS=37;
    public static final int MODULUS=38;
    public static final int MULTIPLY=39;
    public static final int MULTIPLY_EQUALS=40;
    public static final int NAME=41;
    public static final int NATIVE_METHOD_CALL=42;
    public static final int NEGATE=43;
    public static final int NEQ=44;
    public static final int NOT=45;
    public static final int NULL=46;
    public static final int NUMBER=47;
    public static final int OPEN_BOX=48;
    public static final int OPEN_BRACE=49;
    public static final int OPEN_PAREN=50;
    public static final int OR=51;
    public static final int PERIOD=52;
    public static final int PLUS=53;
    public static final int PLUS_EQUALS=54;
    public static final int POWER=55;
    public static final int PROPERTY_LOOKUP=56;
    public static final int QUESTION_MARK=57;
    public static final int SEMI_COLON=58;
    public static final int STRING=59;
    public static final int TERNARY_OPERATOR=60;
    public static final int UNDERSCORE=61;
    public static final int VALUE=62;
    public static final int VARIABLE=63;
    public static final int WHITESPACE=64;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public RichTeaLexer() {} 
    public RichTeaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RichTeaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/richard/workspace/RichTea/antlr/RichTea.g"; }

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:162:3: ( INTEGER | FLOAT )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:162:5: INTEGER
                    {
                    mINTEGER(); 


                    }
                    break;
                case 2 :
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:162:15: FLOAT
                    {
                    mFLOAT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:166:6: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:166:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/richard/workspace/RichTea/antlr/RichTea.g:166:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/richard/workspace/RichTea/antlr/RichTea.g:166:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/richard/workspace/RichTea/antlr/RichTea.g:166:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:170:3: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:170:5: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:171:5: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:175:2: ( 'null' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:175:4: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:178:6: ( ( UNDERSCORE )? LETTER ( LETTER | INTEGER | UNDERSCORE )* )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:178:8: ( UNDERSCORE )? LETTER ( LETTER | INTEGER | UNDERSCORE )*
            {
            // /home/richard/workspace/RichTea/antlr/RichTea.g:178:8: ( UNDERSCORE )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='_') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:
                    {
                    if ( input.LA(1)=='_' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mLETTER(); 


            // /home/richard/workspace/RichTea/antlr/RichTea.g:178:27: ( LETTER | INTEGER | UNDERSCORE )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt5=1;
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
                case '8':
                case '9':
                    {
                    alt5=2;
                    }
                    break;
                case '_':
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // /home/richard/workspace/RichTea/antlr/RichTea.g:178:28: LETTER
            	    {
            	    mLETTER(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/richard/workspace/RichTea/antlr/RichTea.g:178:37: INTEGER
            	    {
            	    mINTEGER(); 


            	    }
            	    break;
            	case 3 :
            	    // /home/richard/workspace/RichTea/antlr/RichTea.g:178:47: UNDERSCORE
            	    {
            	    mUNDERSCORE(); 


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:182:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='/') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='/') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='*') ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:182:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/richard/workspace/RichTea/antlr/RichTea.g:182:9: (~ ( '\\n' | '\\r' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/richard/workspace/RichTea/antlr/RichTea.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    // /home/richard/workspace/RichTea/antlr/RichTea.g:182:23: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/richard/workspace/RichTea/antlr/RichTea.g:182:23: '\\r'
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
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:183:6: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/richard/workspace/RichTea/antlr/RichTea.g:183:11: ( options {greedy=false; } : . )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='*') ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1=='/') ) {
                                alt8=2;
                            }
                            else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/richard/workspace/RichTea/antlr/RichTea.g:183:39: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:187:2: ( ( '\\r' | '\\n' | '\\r\\n' | ' ' | '\\t' ) )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:187:4: ( '\\r' | '\\n' | '\\r\\n' | ' ' | '\\t' )
            {
            // /home/richard/workspace/RichTea/antlr/RichTea.g:187:4: ( '\\r' | '\\n' | '\\r\\n' | ' ' | '\\t' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case '\r':
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='\n') ) {
                    alt10=3;
                }
                else {
                    alt10=1;
                }
                }
                break;
            case '\n':
                {
                alt10=2;
                }
                break;
            case ' ':
                {
                alt10=4;
                }
                break;
            case '\t':
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:187:5: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:187:12: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:187:19: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 4 :
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:187:28: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 5 :
                    // /home/richard/workspace/RichTea/antlr/RichTea.g:187:34: '\\t'
                    {
                    match('\t'); 

                    }
                    break;

            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:190:7: ( ',' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:190:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "PERIOD"
    public final void mPERIOD() throws RecognitionException {
        try {
            int _type = PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:191:8: ( '.' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:191:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERIOD"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:192:6: ( '#' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:192:8: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:193:4: ( '@' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:193:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:194:12: ( '_' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:194:14: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "PLUS_EQUALS"
    public final void mPLUS_EQUALS() throws RecognitionException {
        try {
            int _type = PLUS_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:196:13: ( PLUS ASSIGN )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:196:15: PLUS ASSIGN
            {
            mPLUS(); 


            mASSIGN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS_EQUALS"

    // $ANTLR start "MULTIPLY_EQUALS"
    public final void mMULTIPLY_EQUALS() throws RecognitionException {
        try {
            int _type = MULTIPLY_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:197:17: ( MULTIPLY ASSIGN )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:197:19: MULTIPLY ASSIGN
            {
            mMULTIPLY(); 


            mASSIGN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTIPLY_EQUALS"

    // $ANTLR start "MINUS_EQUALS"
    public final void mMINUS_EQUALS() throws RecognitionException {
        try {
            int _type = MINUS_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:198:14: ( MINUS ASSIGN )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:198:16: MINUS ASSIGN
            {
            mMINUS(); 


            mASSIGN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS_EQUALS"

    // $ANTLR start "DIVIDE_EQUALS"
    public final void mDIVIDE_EQUALS() throws RecognitionException {
        try {
            int _type = DIVIDE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:199:15: ( DIVIDE ASSIGN )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:199:17: DIVIDE ASSIGN
            {
            mDIVIDE(); 


            mASSIGN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE_EQUALS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:201:6: ( '+' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:201:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:202:7: ( '-' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:202:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULTIPLY"
    public final void mMULTIPLY() throws RecognitionException {
        try {
            int _type = MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:203:9: ( '*' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:203:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTIPLY"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:204:8: ( '/' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:204:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "MODULUS"
    public final void mMODULUS() throws RecognitionException {
        try {
            int _type = MODULUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:205:9: ( '%' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:205:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODULUS"

    // $ANTLR start "POWER"
    public final void mPOWER() throws RecognitionException {
        try {
            int _type = POWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:206:7: ( '^' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:206:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POWER"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:208:4: ( '||' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:208:6: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:209:5: ( '&&' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:209:7: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:210:4: ( '>' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:210:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:211:6: ( '>=' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:211:8: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:212:4: ( '<' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:212:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:213:6: ( '<=' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:213:8: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:214:4: ( '==' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:214:6: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:215:5: ( '!=' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:215:7: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:216:5: ( '!' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:216:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:218:9: ( '=' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:218:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:219:8: ( ':' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:219:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMI_COLON"
    public final void mSEMI_COLON() throws RecognitionException {
        try {
            int _type = SEMI_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:220:12: ( ';' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:220:15: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI_COLON"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            int _type = QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:221:15: ( '?' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:221:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION_MARK"

    // $ANTLR start "OPEN_PAREN"
    public final void mOPEN_PAREN() throws RecognitionException {
        try {
            int _type = OPEN_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:223:13: ( '(' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:223:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_PAREN"

    // $ANTLR start "CLOSE_PAREN"
    public final void mCLOSE_PAREN() throws RecognitionException {
        try {
            int _type = CLOSE_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:224:14: ( ')' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:224:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_PAREN"

    // $ANTLR start "OPEN_BRACE"
    public final void mOPEN_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:226:12: ( '{' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:226:14: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_BRACE"

    // $ANTLR start "CLOSE_BRACE"
    public final void mCLOSE_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:227:13: ( '}' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:227:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_BRACE"

    // $ANTLR start "OPEN_BOX"
    public final void mOPEN_BOX() throws RecognitionException {
        try {
            int _type = OPEN_BOX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:229:10: ( '[' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:229:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_BOX"

    // $ANTLR start "CLOSE_BOX"
    public final void mCLOSE_BOX() throws RecognitionException {
        try {
            int _type = CLOSE_BOX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/workspace/RichTea/antlr/RichTea.g:230:11: ( ']' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:230:13: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_BOX"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // /home/richard/workspace/RichTea/antlr/RichTea.g:237:2: ( ( '0' .. '9' )+ )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:237:4: ( '0' .. '9' )+
            {
            // /home/richard/workspace/RichTea/antlr/RichTea.g:237:4: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/richard/workspace/RichTea/antlr/RichTea.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            // /home/richard/workspace/RichTea/antlr/RichTea.g:242:2: ( ( INTEGER )+ '.' ( INTEGER )* )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:242:4: ( INTEGER )+ '.' ( INTEGER )*
            {
            // /home/richard/workspace/RichTea/antlr/RichTea.g:242:4: ( INTEGER )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/richard/workspace/RichTea/antlr/RichTea.g:242:4: INTEGER
            	    {
            	    mINTEGER(); 


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


            match('.'); 

            // /home/richard/workspace/RichTea/antlr/RichTea.g:242:17: ( INTEGER )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/richard/workspace/RichTea/antlr/RichTea.g:242:17: INTEGER
            	    {
            	    mINTEGER(); 


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/richard/workspace/RichTea/antlr/RichTea.g:247:2: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/richard/workspace/RichTea/antlr/RichTea.g:253:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/richard/workspace/RichTea/antlr/RichTea.g:253:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    public void mTokens() throws RecognitionException {
        // /home/richard/workspace/RichTea/antlr/RichTea.g:1:8: ( NUMBER | STRING | BOOLEAN | NULL | ID | COMMENT | WHITESPACE | COMMA | PERIOD | HASH | AT | UNDERSCORE | PLUS_EQUALS | MULTIPLY_EQUALS | MINUS_EQUALS | DIVIDE_EQUALS | PLUS | MINUS | MULTIPLY | DIVIDE | MODULUS | POWER | OR | AND | GT | GTEQ | LT | LTEQ | EQ | NEQ | NOT | ASSIGN | COLON | SEMI_COLON | QUESTION_MARK | OPEN_PAREN | CLOSE_PAREN | OPEN_BRACE | CLOSE_BRACE | OPEN_BOX | CLOSE_BOX )
        int alt14=41;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:10: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 2 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:17: STRING
                {
                mSTRING(); 


                }
                break;
            case 3 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:24: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 4 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:32: NULL
                {
                mNULL(); 


                }
                break;
            case 5 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:37: ID
                {
                mID(); 


                }
                break;
            case 6 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:40: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 7 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:48: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 8 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:59: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 9 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:65: PERIOD
                {
                mPERIOD(); 


                }
                break;
            case 10 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:72: HASH
                {
                mHASH(); 


                }
                break;
            case 11 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:77: AT
                {
                mAT(); 


                }
                break;
            case 12 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:80: UNDERSCORE
                {
                mUNDERSCORE(); 


                }
                break;
            case 13 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:91: PLUS_EQUALS
                {
                mPLUS_EQUALS(); 


                }
                break;
            case 14 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:103: MULTIPLY_EQUALS
                {
                mMULTIPLY_EQUALS(); 


                }
                break;
            case 15 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:119: MINUS_EQUALS
                {
                mMINUS_EQUALS(); 


                }
                break;
            case 16 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:132: DIVIDE_EQUALS
                {
                mDIVIDE_EQUALS(); 


                }
                break;
            case 17 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:146: PLUS
                {
                mPLUS(); 


                }
                break;
            case 18 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:151: MINUS
                {
                mMINUS(); 


                }
                break;
            case 19 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:157: MULTIPLY
                {
                mMULTIPLY(); 


                }
                break;
            case 20 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:166: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 21 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:173: MODULUS
                {
                mMODULUS(); 


                }
                break;
            case 22 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:181: POWER
                {
                mPOWER(); 


                }
                break;
            case 23 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:187: OR
                {
                mOR(); 


                }
                break;
            case 24 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:190: AND
                {
                mAND(); 


                }
                break;
            case 25 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:194: GT
                {
                mGT(); 


                }
                break;
            case 26 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:197: GTEQ
                {
                mGTEQ(); 


                }
                break;
            case 27 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:202: LT
                {
                mLT(); 


                }
                break;
            case 28 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:205: LTEQ
                {
                mLTEQ(); 


                }
                break;
            case 29 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:210: EQ
                {
                mEQ(); 


                }
                break;
            case 30 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:213: NEQ
                {
                mNEQ(); 


                }
                break;
            case 31 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:217: NOT
                {
                mNOT(); 


                }
                break;
            case 32 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:221: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 33 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:228: COLON
                {
                mCOLON(); 


                }
                break;
            case 34 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:234: SEMI_COLON
                {
                mSEMI_COLON(); 


                }
                break;
            case 35 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:245: QUESTION_MARK
                {
                mQUESTION_MARK(); 


                }
                break;
            case 36 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:259: OPEN_PAREN
                {
                mOPEN_PAREN(); 


                }
                break;
            case 37 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:270: CLOSE_PAREN
                {
                mCLOSE_PAREN(); 


                }
                break;
            case 38 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:282: OPEN_BRACE
                {
                mOPEN_BRACE(); 


                }
                break;
            case 39 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:293: CLOSE_BRACE
                {
                mCLOSE_BRACE(); 


                }
                break;
            case 40 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:305: OPEN_BOX
                {
                mOPEN_BOX(); 


                }
                break;
            case 41 :
                // /home/richard/workspace/RichTea/antlr/RichTea.g:1:314: CLOSE_BOX
                {
                mCLOSE_BOX(); 


                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA1_eotS =
        "\1\uffff\1\2\2\uffff";
    static final String DFA1_eofS =
        "\4\uffff";
    static final String DFA1_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA1_maxS =
        "\2\71\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\12\1",
            "\1\3\1\uffff\12\1",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "161:1: NUMBER : ( INTEGER | FLOAT );";
        }
    }
    static final String DFA14_eotS =
        "\3\uffff\3\7\1\45\1\uffff\1\47\5\uffff\1\51\1\53\1\55\4\uffff\1"+
        "\60\1\62\1\64\1\66\11\uffff\3\7\22\uffff\3\7\1\75\1\7\1\77\1\uffff"+
        "\1\75\1\uffff";
    static final String DFA14_eofS =
        "\100\uffff";
    static final String DFA14_minS =
        "\1\11\2\uffff\1\162\1\141\1\165\1\101\1\uffff\1\52\5\uffff\3\75"+
        "\4\uffff\4\75\11\uffff\1\165\2\154\22\uffff\1\145\1\163\1\154\1"+
        "\60\1\145\1\60\1\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\175\2\uffff\1\162\1\141\1\165\1\172\1\uffff\1\75\5\uffff\3\75"+
        "\4\uffff\4\75\11\uffff\1\165\2\154\22\uffff\1\145\1\163\1\154\1"+
        "\172\1\145\1\172\1\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\4\uffff\1\5\1\uffff\1\7\1\10\1\11\1\12\1\13\3\uffff"+
        "\1\25\1\26\1\27\1\30\4\uffff\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
        "\1\50\1\51\3\uffff\1\14\1\6\1\24\1\20\1\21\1\15\1\23\1\16\1\22\1"+
        "\17\1\32\1\31\1\34\1\33\1\35\1\40\1\36\1\37\6\uffff\1\3\1\uffff"+
        "\1\4";
    static final String DFA14_specialS =
        "\100\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\11\2\uffff\1\11\22\uffff\1\11\1\30\1\2\1\14\1\uffff\1\21"+
            "\1\24\1\uffff\1\34\1\35\1\17\1\16\1\12\1\20\1\13\1\10\12\1\1"+
            "\31\1\32\1\26\1\27\1\25\1\33\1\15\32\7\1\40\1\uffff\1\41\1\22"+
            "\1\6\1\uffff\5\7\1\4\7\7\1\5\5\7\1\3\6\7\1\36\1\23\1\37",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\32\7\6\uffff\32\7",
            "",
            "\1\46\4\uffff\1\46\15\uffff\1\50",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\54",
            "\1\56",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\61",
            "\1\63",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
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
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\76",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
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

    class DFA14 extends DFA {

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
            return "1:1: Tokens : ( NUMBER | STRING | BOOLEAN | NULL | ID | COMMENT | WHITESPACE | COMMA | PERIOD | HASH | AT | UNDERSCORE | PLUS_EQUALS | MULTIPLY_EQUALS | MINUS_EQUALS | DIVIDE_EQUALS | PLUS | MINUS | MULTIPLY | DIVIDE | MODULUS | POWER | OR | AND | GT | GTEQ | LT | LTEQ | EQ | NEQ | NOT | ASSIGN | COLON | SEMI_COLON | QUESTION_MARK | OPEN_PAREN | CLOSE_PAREN | OPEN_BRACE | CLOSE_BRACE | OPEN_BOX | CLOSE_BOX );";
        }
    }
 

}