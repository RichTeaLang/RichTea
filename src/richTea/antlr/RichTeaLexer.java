// $ANTLR 3.4 /home/richard/Programming/RichTea/antlr/RichTea.g 2012-02-07 00:59:31
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
    public static final int ATTRIBUTE=7;
    public static final int ATTRIBUTES=8;
    public static final int BOOLEAN=9;
    public static final int BRANCH=10;
    public static final int BRANCHES=11;
    public static final int CHILDREN=12;
    public static final int CLOSE_BOX=13;
    public static final int CLOSE_BRACE=14;
    public static final int CLOSE_PAREN=15;
    public static final int COLON=16;
    public static final int COMMA=17;
    public static final int COMMENT=18;
    public static final int DIVIDE=19;
    public static final int DIVIDE_EQUALS=20;
    public static final int EQ=21;
    public static final int ESC_SEQ=22;
    public static final int FLOAT=23;
    public static final int FUNCTION=24;
    public static final int GT=25;
    public static final int GTEQ=26;
    public static final int HASH=27;
    public static final int ID=28;
    public static final int INTEGER=29;
    public static final int LETTER=30;
    public static final int LT=31;
    public static final int LTEQ=32;
    public static final int MINUS=33;
    public static final int MINUS_EQUALS=34;
    public static final int MODULUS=35;
    public static final int MULTIPLY=36;
    public static final int MULTIPLY_EQUALS=37;
    public static final int NAME=38;
    public static final int NEGATE=39;
    public static final int NEQ=40;
    public static final int NOT=41;
    public static final int NUMBER=42;
    public static final int OPEN_BOX=43;
    public static final int OPEN_BRACE=44;
    public static final int OPEN_PAREN=45;
    public static final int OR=46;
    public static final int PERIOD=47;
    public static final int PLUS=48;
    public static final int PLUS_EQUALS=49;
    public static final int POWER=50;
    public static final int QUESTION_MARK=51;
    public static final int SEMI_COLON=52;
    public static final int STRING=53;
    public static final int TERNARY_OPERATOR=54;
    public static final int VALUE=55;
    public static final int VARIABLE=56;
    public static final int WHITESPACE=57;

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
    public String getGrammarFileName() { return "/home/richard/Programming/RichTea/antlr/RichTea.g"; }

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/Programming/RichTea/antlr/RichTea.g:140:3: ( INTEGER | FLOAT )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:140:5: INTEGER
                    {
                    mINTEGER(); 


                    }
                    break;
                case 2 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:140:15: FLOAT
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:144:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:144:7: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/richard/Programming/RichTea/antlr/RichTea.g:144:11: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:144:13: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:144:23: ~ ( '\\\\' | '\"' )
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:148:3: ( 'true' | 'false' )
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
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:148:5: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:149:5: 'false'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/Programming/RichTea/antlr/RichTea.g:152:5: ( ( LETTER | '_' ) ( LETTER | INTEGER | '_' )* )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:152:7: ( LETTER | '_' ) ( LETTER | INTEGER | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/richard/Programming/RichTea/antlr/RichTea.g:152:22: ( LETTER | INTEGER | '_' )*
            loop4:
            do {
                int alt4=4;
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
                    alt4=1;
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
                    alt4=2;
                    }
                    break;
                case '_':
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:152:23: LETTER
            	    {
            	    mLETTER(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:152:32: INTEGER
            	    {
            	    mINTEGER(); 


            	    }
            	    break;
            	case 3 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:152:42: '_'
            	    {
            	    match('_'); 

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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/Programming/RichTea/antlr/RichTea.g:156:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:156:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/richard/Programming/RichTea/antlr/RichTea.g:156:9: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/richard/Programming/RichTea/antlr/RichTea.g:
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
                    	    break loop5;
                        }
                    } while (true);


                    // /home/richard/Programming/RichTea/antlr/RichTea.g:156:23: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/richard/Programming/RichTea/antlr/RichTea.g:156:23: '\\r'
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
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:157:7: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/richard/Programming/RichTea/antlr/RichTea.g:157:12: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/richard/Programming/RichTea/antlr/RichTea.g:157:40: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:161:2: ( ( '\\r' | '\\n' | '\\r\\n' | ' ' | '\\t' ) )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:161:4: ( '\\r' | '\\n' | '\\r\\n' | ' ' | '\\t' )
            {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:161:4: ( '\\r' | '\\n' | '\\r\\n' | ' ' | '\\t' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case '\r':
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='\n') ) {
                    alt9=3;
                }
                else {
                    alt9=1;
                }
                }
                break;
            case '\n':
                {
                alt9=2;
                }
                break;
            case ' ':
                {
                alt9=4;
                }
                break;
            case '\t':
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:161:5: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:161:12: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:161:19: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 4 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:161:28: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 5 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:161:34: '\\t'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:164:7: ( ',' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:164:9: ','
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:165:8: ( '.' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:165:10: '.'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:166:6: ( '#' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:166:8: '#'
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

    // $ANTLR start "PLUS_EQUALS"
    public final void mPLUS_EQUALS() throws RecognitionException {
        try {
            int _type = PLUS_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/richard/Programming/RichTea/antlr/RichTea.g:168:14: ( PLUS ASSIGN )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:168:16: PLUS ASSIGN
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:169:17: ( MULTIPLY ASSIGN )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:169:19: MULTIPLY ASSIGN
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:170:14: ( MINUS ASSIGN )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:170:16: MINUS ASSIGN
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:171:15: ( DIVIDE ASSIGN )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:171:17: DIVIDE ASSIGN
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:173:6: ( '+' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:173:8: '+'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:174:7: ( '-' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:174:9: '-'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:175:9: ( '*' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:175:11: '*'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:176:8: ( '/' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:176:10: '/'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:177:9: ( '%' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:177:11: '%'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:178:7: ( '^' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:178:9: '^'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:180:4: ( '||' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:180:6: '||'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:181:5: ( '&&' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:181:7: '&&'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:182:4: ( '>' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:182:6: '>'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:183:5: ( '>=' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:183:7: '>='
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:184:4: ( '<' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:184:6: '<'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:185:5: ( '<=' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:185:7: '<='
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:186:4: ( '==' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:186:6: '=='
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:187:5: ( '!=' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:187:7: '!='
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:188:5: ( '!' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:188:7: '!'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:190:9: ( '=' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:190:11: '='
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:191:8: ( ':' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:191:10: ':'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:192:12: ( ';' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:192:15: ';'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:193:15: ( '?' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:193:17: '?'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:195:13: ( '(' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:195:15: '('
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:196:13: ( ')' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:196:15: ')'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:198:12: ( '{' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:198:14: '{'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:199:13: ( '}' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:199:15: '}'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:201:10: ( '[' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:201:12: '['
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:202:11: ( ']' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:202:13: ']'
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:209:2: ( ( '0' .. '9' )+ )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:209:4: ( '0' .. '9' )+
            {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:209:4: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:214:2: ( ( INTEGER )+ '.' ( INTEGER )* )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:214:4: ( INTEGER )+ '.' ( INTEGER )*
            {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:214:4: ( INTEGER )+
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
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:214:4: INTEGER
            	    {
            	    mINTEGER(); 


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


            match('.'); 

            // /home/richard/Programming/RichTea/antlr/RichTea.g:214:17: ( INTEGER )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:214:17: INTEGER
            	    {
            	    mINTEGER(); 


            	    }
            	    break;

            	default :
            	    break loop12;
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:219:2: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:225:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:225:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
        // /home/richard/Programming/RichTea/antlr/RichTea.g:1:8: ( NUMBER | STRING | BOOLEAN | ID | COMMENT | WHITESPACE | COMMA | PERIOD | HASH | PLUS_EQUALS | MULTIPLY_EQUALS | MINUS_EQUALS | DIVIDE_EQUALS | PLUS | MINUS | MULTIPLY | DIVIDE | MODULUS | POWER | OR | AND | GT | GTEQ | LT | LTEQ | EQ | NEQ | NOT | ASSIGN | COLON | SEMI_COLON | QUESTION_MARK | OPEN_PAREN | CLOSE_PAREN | OPEN_BRACE | CLOSE_BRACE | OPEN_BOX | CLOSE_BOX )
        int alt13=38;
        switch ( input.LA(1) ) {
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
            alt13=1;
            }
            break;
        case '\"':
            {
            alt13=2;
            }
            break;
        case 't':
            {
            int LA13_3 = input.LA(2);

            if ( (LA13_3=='r') ) {
                int LA13_31 = input.LA(3);

                if ( (LA13_31=='u') ) {
                    int LA13_50 = input.LA(4);

                    if ( (LA13_50=='e') ) {
                        int LA13_52 = input.LA(5);

                        if ( ((LA13_52 >= '0' && LA13_52 <= '9')||(LA13_52 >= 'A' && LA13_52 <= 'Z')||LA13_52=='_'||(LA13_52 >= 'a' && LA13_52 <= 'z')) ) {
                            alt13=4;
                        }
                        else {
                            alt13=3;
                        }
                    }
                    else {
                        alt13=4;
                    }
                }
                else {
                    alt13=4;
                }
            }
            else {
                alt13=4;
            }
            }
            break;
        case 'f':
            {
            int LA13_4 = input.LA(2);

            if ( (LA13_4=='a') ) {
                int LA13_32 = input.LA(3);

                if ( (LA13_32=='l') ) {
                    int LA13_51 = input.LA(4);

                    if ( (LA13_51=='s') ) {
                        int LA13_53 = input.LA(5);

                        if ( (LA13_53=='e') ) {
                            int LA13_55 = input.LA(6);

                            if ( ((LA13_55 >= '0' && LA13_55 <= '9')||(LA13_55 >= 'A' && LA13_55 <= 'Z')||LA13_55=='_'||(LA13_55 >= 'a' && LA13_55 <= 'z')) ) {
                                alt13=4;
                            }
                            else {
                                alt13=3;
                            }
                        }
                        else {
                            alt13=4;
                        }
                    }
                    else {
                        alt13=4;
                    }
                }
                else {
                    alt13=4;
                }
            }
            else {
                alt13=4;
            }
            }
            break;
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
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
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
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt13=4;
            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case '*':
            case '/':
                {
                alt13=5;
                }
                break;
            case '=':
                {
                alt13=13;
                }
                break;
            default:
                alt13=17;
            }

            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt13=6;
            }
            break;
        case ',':
            {
            alt13=7;
            }
            break;
        case '.':
            {
            alt13=8;
            }
            break;
        case '#':
            {
            alt13=9;
            }
            break;
        case '+':
            {
            int LA13_11 = input.LA(2);

            if ( (LA13_11=='=') ) {
                alt13=10;
            }
            else {
                alt13=14;
            }
            }
            break;
        case '*':
            {
            int LA13_12 = input.LA(2);

            if ( (LA13_12=='=') ) {
                alt13=11;
            }
            else {
                alt13=16;
            }
            }
            break;
        case '-':
            {
            int LA13_13 = input.LA(2);

            if ( (LA13_13=='=') ) {
                alt13=12;
            }
            else {
                alt13=15;
            }
            }
            break;
        case '%':
            {
            alt13=18;
            }
            break;
        case '^':
            {
            alt13=19;
            }
            break;
        case '|':
            {
            alt13=20;
            }
            break;
        case '&':
            {
            alt13=21;
            }
            break;
        case '>':
            {
            int LA13_18 = input.LA(2);

            if ( (LA13_18=='=') ) {
                alt13=23;
            }
            else {
                alt13=22;
            }
            }
            break;
        case '<':
            {
            int LA13_19 = input.LA(2);

            if ( (LA13_19=='=') ) {
                alt13=25;
            }
            else {
                alt13=24;
            }
            }
            break;
        case '=':
            {
            int LA13_20 = input.LA(2);

            if ( (LA13_20=='=') ) {
                alt13=26;
            }
            else {
                alt13=29;
            }
            }
            break;
        case '!':
            {
            int LA13_21 = input.LA(2);

            if ( (LA13_21=='=') ) {
                alt13=27;
            }
            else {
                alt13=28;
            }
            }
            break;
        case ':':
            {
            alt13=30;
            }
            break;
        case ';':
            {
            alt13=31;
            }
            break;
        case '?':
            {
            alt13=32;
            }
            break;
        case '(':
            {
            alt13=33;
            }
            break;
        case ')':
            {
            alt13=34;
            }
            break;
        case '{':
            {
            alt13=35;
            }
            break;
        case '}':
            {
            alt13=36;
            }
            break;
        case '[':
            {
            alt13=37;
            }
            break;
        case ']':
            {
            alt13=38;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 13, 0, input);

            throw nvae;

        }

        switch (alt13) {
            case 1 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:10: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 2 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:17: STRING
                {
                mSTRING(); 


                }
                break;
            case 3 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:24: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 4 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:32: ID
                {
                mID(); 


                }
                break;
            case 5 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:35: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 6 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:43: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 7 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:54: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 8 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:60: PERIOD
                {
                mPERIOD(); 


                }
                break;
            case 9 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:67: HASH
                {
                mHASH(); 


                }
                break;
            case 10 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:72: PLUS_EQUALS
                {
                mPLUS_EQUALS(); 


                }
                break;
            case 11 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:84: MULTIPLY_EQUALS
                {
                mMULTIPLY_EQUALS(); 


                }
                break;
            case 12 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:100: MINUS_EQUALS
                {
                mMINUS_EQUALS(); 


                }
                break;
            case 13 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:113: DIVIDE_EQUALS
                {
                mDIVIDE_EQUALS(); 


                }
                break;
            case 14 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:127: PLUS
                {
                mPLUS(); 


                }
                break;
            case 15 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:132: MINUS
                {
                mMINUS(); 


                }
                break;
            case 16 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:138: MULTIPLY
                {
                mMULTIPLY(); 


                }
                break;
            case 17 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:147: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 18 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:154: MODULUS
                {
                mMODULUS(); 


                }
                break;
            case 19 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:162: POWER
                {
                mPOWER(); 


                }
                break;
            case 20 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:168: OR
                {
                mOR(); 


                }
                break;
            case 21 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:171: AND
                {
                mAND(); 


                }
                break;
            case 22 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:175: GT
                {
                mGT(); 


                }
                break;
            case 23 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:178: GTEQ
                {
                mGTEQ(); 


                }
                break;
            case 24 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:183: LT
                {
                mLT(); 


                }
                break;
            case 25 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:186: LTEQ
                {
                mLTEQ(); 


                }
                break;
            case 26 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:191: EQ
                {
                mEQ(); 


                }
                break;
            case 27 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:194: NEQ
                {
                mNEQ(); 


                }
                break;
            case 28 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:198: NOT
                {
                mNOT(); 


                }
                break;
            case 29 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:202: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 30 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:209: COLON
                {
                mCOLON(); 


                }
                break;
            case 31 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:215: SEMI_COLON
                {
                mSEMI_COLON(); 


                }
                break;
            case 32 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:226: QUESTION_MARK
                {
                mQUESTION_MARK(); 


                }
                break;
            case 33 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:240: OPEN_PAREN
                {
                mOPEN_PAREN(); 


                }
                break;
            case 34 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:251: CLOSE_PAREN
                {
                mCLOSE_PAREN(); 


                }
                break;
            case 35 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:263: OPEN_BRACE
                {
                mOPEN_BRACE(); 


                }
                break;
            case 36 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:274: CLOSE_BRACE
                {
                mCLOSE_BRACE(); 


                }
                break;
            case 37 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:286: OPEN_BOX
                {
                mOPEN_BOX(); 


                }
                break;
            case 38 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:1:295: CLOSE_BOX
                {
                mCLOSE_BOX(); 


                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
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
            return "139:1: NUMBER : ( INTEGER | FLOAT );";
        }
    }
 

}