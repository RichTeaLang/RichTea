// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g 2010-10-31 00:53:44
package richTea.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RichTeaLexer extends Lexer {
    public static final int FUNCTION=4;
    public static final int LT=30;
    public static final int ATTRIBUTES=7;
    public static final int CHILDREN=5;
    public static final int LETTER=47;
    public static final int LTEQ=31;
    public static final int ATTRIBUTE=6;
    public static final int FLOAT=45;
    public static final int NOT=40;
    public static final int AND=27;
    public static final int ID=15;
    public static final int EOF=-1;
    public static final int NAME=8;
    public static final int BOOLEAN=42;
    public static final int ESC_SEQ=46;
    public static final int MULTIPLY=36;
    public static final int COMMA=21;
    public static final int PLUS=34;
    public static final int CLOSE_PAREN=17;
    public static final int EQ=28;
    public static final int COMMENT=48;
    public static final int ARRAY=10;
    public static final int DIVIDE=37;
    public static final int INTEGER=44;
    public static final int PERIOD=14;
    public static final int NUMBER=41;
    public static final int WHITESPACE=49;
    public static final int OPEN_PAREN=16;
    public static final int NEGATE=13;
    public static final int POWER=39;
    public static final int SEMI_COLON=20;
    public static final int CLOSE_BRACE=19;
    public static final int VALUE=9;
    public static final int GTEQ=33;
    public static final int MINUS=35;
    public static final int OPEN_BOX=24;
    public static final int COLON=22;
    public static final int LOOKUP=12;
    public static final int CLOSE_BOX=25;
    public static final int NEQ=29;
    public static final int MODULUS=38;
    public static final int OR=26;
    public static final int ASSIGN=23;
    public static final int GT=32;
    public static final int ARRAY_ELEMENT=11;
    public static final int OPEN_BRACE=18;
    public static final int STRING=43;

    // delegates
    // delegators

    public RichTeaLexer() {;} 
    public RichTeaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RichTeaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g"; }

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:166:3: ( INTEGER | FLOAT )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:166:5: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:166:15: FLOAT
                    {
                    mFLOAT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:170:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:170:7: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:170:11: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:170:13: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:170:23: ~ ( '\\\\' | '\"' )
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
            	    break loop2;
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

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:174:3: ( 'true' | 'false' )
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:174:5: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:175:5: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:178:5: ( ( LETTER | '_' ) ( LETTER | INTEGER | '_' )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:178:7: ( LETTER | '_' ) ( LETTER | INTEGER | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:178:22: ( LETTER | INTEGER | '_' )*
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
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:178:23: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:178:32: INTEGER
            	    {
            	    mINTEGER(); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:178:42: '_'
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
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:182:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:182:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:182:9: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:182:9: ~ ( '\\n' | '\\r' )
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
                    	    break loop5;
                        }
                    } while (true);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:182:23: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:182:23: '\\r'
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:183:7: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:183:12: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:183:40: .
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
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:187:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:187:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:190:7: ( ',' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:190:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "PERIOD"
    public final void mPERIOD() throws RecognitionException {
        try {
            int _type = PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:191:8: ( '.' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:191:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERIOD"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:193:6: ( '+' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:193:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:194:7: ( '-' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:194:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULTIPLY"
    public final void mMULTIPLY() throws RecognitionException {
        try {
            int _type = MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:195:9: ( '*' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:195:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTIPLY"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:196:8: ( '/' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:196:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "MODULUS"
    public final void mMODULUS() throws RecognitionException {
        try {
            int _type = MODULUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:197:9: ( '%' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:197:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULUS"

    // $ANTLR start "POWER"
    public final void mPOWER() throws RecognitionException {
        try {
            int _type = POWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:198:7: ( '^' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:198:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POWER"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:200:4: ( '||' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:200:6: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:201:5: ( '&&' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:201:7: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:202:4: ( '>' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:202:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:203:5: ( '>=' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:203:7: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:204:4: ( '<' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:204:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:205:5: ( '<=' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:205:7: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:206:4: ( '==' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:206:6: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:207:5: ( '!=' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:207:7: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:208:5: ( '!' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:208:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:210:9: ( '=' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:210:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:211:8: ( ':' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:211:10: ':'
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

    // $ANTLR start "SEMI_COLON"
    public final void mSEMI_COLON() throws RecognitionException {
        try {
            int _type = SEMI_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:212:12: ( ';' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:212:15: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI_COLON"

    // $ANTLR start "OPEN_PAREN"
    public final void mOPEN_PAREN() throws RecognitionException {
        try {
            int _type = OPEN_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:214:13: ( '(' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:214:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_PAREN"

    // $ANTLR start "CLOSE_PAREN"
    public final void mCLOSE_PAREN() throws RecognitionException {
        try {
            int _type = CLOSE_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:215:13: ( ')' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:215:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_PAREN"

    // $ANTLR start "OPEN_BRACE"
    public final void mOPEN_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:217:12: ( '{' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:217:14: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_BRACE"

    // $ANTLR start "CLOSE_BRACE"
    public final void mCLOSE_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:218:13: ( '}' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:218:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_BRACE"

    // $ANTLR start "OPEN_BOX"
    public final void mOPEN_BOX() throws RecognitionException {
        try {
            int _type = OPEN_BOX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:220:10: ( '[' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:220:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_BOX"

    // $ANTLR start "CLOSE_BOX"
    public final void mCLOSE_BOX() throws RecognitionException {
        try {
            int _type = CLOSE_BOX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:221:11: ( ']' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:221:13: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_BOX"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:227:2: ( ( '0' .. '9' )+ )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:227:4: ( '0' .. '9' )+
            {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:227:4: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:227:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:232:2: ( ( INTEGER )+ '.' ( INTEGER )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:232:4: ( INTEGER )+ '.' ( INTEGER )*
            {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:232:4: ( INTEGER )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:232:4: INTEGER
            	    {
            	    mINTEGER(); 

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

            match('.'); 
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:232:17: ( INTEGER )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:232:17: INTEGER
            	    {
            	    mINTEGER(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:237:2: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "LETTER"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:243:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:243:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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

        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:8: ( NUMBER | STRING | BOOLEAN | ID | COMMENT | WHITESPACE | COMMA | PERIOD | PLUS | MINUS | MULTIPLY | DIVIDE | MODULUS | POWER | OR | AND | GT | GTEQ | LT | LTEQ | EQ | NEQ | NOT | ASSIGN | COLON | SEMI_COLON | OPEN_PAREN | CLOSE_PAREN | OPEN_BRACE | CLOSE_BRACE | OPEN_BOX | CLOSE_BOX )
        int alt12=32;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:10: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 2 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:17: STRING
                {
                mSTRING(); 

                }
                break;
            case 3 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:24: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 4 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:32: ID
                {
                mID(); 

                }
                break;
            case 5 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:35: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 6 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:43: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 7 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:54: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 8 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:60: PERIOD
                {
                mPERIOD(); 

                }
                break;
            case 9 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:67: PLUS
                {
                mPLUS(); 

                }
                break;
            case 10 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:72: MINUS
                {
                mMINUS(); 

                }
                break;
            case 11 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:78: MULTIPLY
                {
                mMULTIPLY(); 

                }
                break;
            case 12 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:87: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 13 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:94: MODULUS
                {
                mMODULUS(); 

                }
                break;
            case 14 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:102: POWER
                {
                mPOWER(); 

                }
                break;
            case 15 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:108: OR
                {
                mOR(); 

                }
                break;
            case 16 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:111: AND
                {
                mAND(); 

                }
                break;
            case 17 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:115: GT
                {
                mGT(); 

                }
                break;
            case 18 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:118: GTEQ
                {
                mGTEQ(); 

                }
                break;
            case 19 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:123: LT
                {
                mLT(); 

                }
                break;
            case 20 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:126: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 21 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:131: EQ
                {
                mEQ(); 

                }
                break;
            case 22 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:134: NEQ
                {
                mNEQ(); 

                }
                break;
            case 23 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:138: NOT
                {
                mNOT(); 

                }
                break;
            case 24 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:142: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 25 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:149: COLON
                {
                mCOLON(); 

                }
                break;
            case 26 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:155: SEMI_COLON
                {
                mSEMI_COLON(); 

                }
                break;
            case 27 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:166: OPEN_PAREN
                {
                mOPEN_PAREN(); 

                }
                break;
            case 28 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:177: CLOSE_PAREN
                {
                mCLOSE_PAREN(); 

                }
                break;
            case 29 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:189: OPEN_BRACE
                {
                mOPEN_BRACE(); 

                }
                break;
            case 30 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:200: CLOSE_BRACE
                {
                mCLOSE_BRACE(); 

                }
                break;
            case 31 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:212: OPEN_BOX
                {
                mOPEN_BOX(); 

                }
                break;
            case 32 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:1:221: CLOSE_BOX
                {
                mCLOSE_BOX(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA12 dfa12 = new DFA12(this);
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
            return "165:1: NUMBER : ( INTEGER | FLOAT );";
        }
    }
    static final String DFA12_eotS =
        "\3\uffff\2\5\1\uffff\1\40\12\uffff\1\42\1\44\1\46\1\50\10\uffff"+
        "\2\5\12\uffff\2\5\1\55\1\5\1\uffff\1\55";
    static final String DFA12_eofS =
        "\57\uffff";
    static final String DFA12_minS =
        "\1\11\2\uffff\1\162\1\141\1\uffff\1\52\12\uffff\4\75\10\uffff\1"+
        "\165\1\154\12\uffff\1\145\1\163\1\60\1\145\1\uffff\1\60";
    static final String DFA12_maxS =
        "\1\175\2\uffff\1\162\1\141\1\uffff\1\57\12\uffff\4\75\10\uffff"+
        "\1\165\1\154\12\uffff\1\145\1\163\1\172\1\145\1\uffff\1\172";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\15\1\16\1\17\1\20\4\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
        "\1\40\2\uffff\1\5\1\14\1\22\1\21\1\24\1\23\1\25\1\30\1\26\1\27\4"+
        "\uffff\1\3\1\uffff";
    static final String DFA12_specialS =
        "\57\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\7\2\uffff\1\7\22\uffff\1\7\1\24\1\2\2\uffff\1\15\1\20\1"+
            "\uffff\1\27\1\30\1\14\1\12\1\10\1\13\1\11\1\6\12\1\1\25\1\26"+
            "\1\22\1\23\1\21\2\uffff\32\5\1\33\1\uffff\1\34\1\16\1\5\1\uffff"+
            "\5\5\1\4\15\5\1\3\6\5\1\31\1\17\1\32",
            "",
            "",
            "\1\35",
            "\1\36",
            "",
            "\1\37\4\uffff\1\37",
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
            "\1\41",
            "\1\43",
            "\1\45",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
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
            "\1\53",
            "\1\54",
            "\12\5\7\uffff\32\5\4\uffff\1\5\1\uffff\32\5",
            "\1\56",
            "",
            "\12\5\7\uffff\32\5\4\uffff\1\5\1\uffff\32\5"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( NUMBER | STRING | BOOLEAN | ID | COMMENT | WHITESPACE | COMMA | PERIOD | PLUS | MINUS | MULTIPLY | DIVIDE | MODULUS | POWER | OR | AND | GT | GTEQ | LT | LTEQ | EQ | NEQ | NOT | ASSIGN | COLON | SEMI_COLON | OPEN_PAREN | CLOSE_PAREN | OPEN_BRACE | CLOSE_BRACE | OPEN_BOX | CLOSE_BOX );";
        }
    }
 

}