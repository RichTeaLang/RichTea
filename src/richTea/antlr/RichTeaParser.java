// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g 2010-11-12 00:28:14
package richTea.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class RichTeaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "CHILDREN", "ATTRIBUTES", "ATTRIBUTE", "NAME", "VALUE", "ARRAY", "VARIABLE", "TERNARY_OPERATOR", "NEGATE", "ID", "OPEN_PAREN", "COMMA", "CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", "SEMI_COLON", "COLON", "ASSIGN", "OPEN_BOX", "CLOSE_BOX", "QUESTION_MARK", "OR", "AND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "PLUS_EQUALS", "MINUS_EQUALS", "PLUS", "MINUS", "MULTIPLY_EQUALS", "DIVIDE_EQUALS", "MULTIPLY", "DIVIDE", "MODULUS", "POWER", "NOT", "NUMBER", "BOOLEAN", "STRING", "PERIOD", "INTEGER", "FLOAT", "ESC_SEQ", "LETTER", "COMMENT", "WHITESPACE"
    };
    public static final int FUNCTION=4;
    public static final int MINUS_EQUALS=35;
    public static final int LT=30;
    public static final int ATTRIBUTES=6;
    public static final int CHILDREN=5;
    public static final int LETTER=52;
    public static final int ATTRIBUTE=7;
    public static final int LTEQ=31;
    public static final int FLOAT=50;
    public static final int NOT=44;
    public static final int ID=14;
    public static final int AND=27;
    public static final int EOF=-1;
    public static final int NAME=8;
    public static final int ESC_SEQ=51;
    public static final int BOOLEAN=46;
    public static final int MULTIPLY=40;
    public static final int COMMA=16;
    public static final int MULTIPLY_EQUALS=38;
    public static final int QUESTION_MARK=25;
    public static final int PLUS=36;
    public static final int CLOSE_PAREN=17;
    public static final int EQ=28;
    public static final int COMMENT=53;
    public static final int ARRAY=10;
    public static final int DIVIDE=41;
    public static final int INTEGER=49;
    public static final int TERNARY_OPERATOR=12;
    public static final int PERIOD=48;
    public static final int NUMBER=45;
    public static final int WHITESPACE=54;
    public static final int OPEN_PAREN=15;
    public static final int NEGATE=13;
    public static final int POWER=43;
    public static final int SEMI_COLON=20;
    public static final int CLOSE_BRACE=19;
    public static final int VALUE=9;
    public static final int GTEQ=33;
    public static final int MINUS=37;
    public static final int DIVIDE_EQUALS=39;
    public static final int OPEN_BOX=23;
    public static final int COLON=21;
    public static final int CLOSE_BOX=24;
    public static final int NEQ=29;
    public static final int VARIABLE=11;
    public static final int MODULUS=42;
    public static final int OR=26;
    public static final int ASSIGN=22;
    public static final int GT=32;
    public static final int PLUS_EQUALS=34;
    public static final int OPEN_BRACE=18;
    public static final int STRING=47;

    // delegates
    // delegators


        public RichTeaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RichTeaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return RichTeaParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:15:1: program : function ;
    public final RichTeaParser.program_return program() throws RecognitionException {
        RichTeaParser.program_return retval = new RichTeaParser.program_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.function_return function1 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:16:2: ( function )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:16:4: function
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_function_in_program110);
            function1=function();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, function1.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class function_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:19:1: function : ( ID ( OPEN_PAREN ( datatype )? ( COMMA )? ( attribute_list )? CLOSE_PAREN )? ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) ) )? ( attribute_list )? ) ^( CHILDREN ( function )* ) ) | ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? OPEN_BRACE ( function )* CLOSE_BRACE -> ^( FUNCTION ^( NAME ID[\"scope\"] ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) ) );
    public final RichTeaParser.function_return function() throws RecognitionException {
        RichTeaParser.function_return retval = new RichTeaParser.function_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID2=null;
        Token OPEN_PAREN3=null;
        Token COMMA5=null;
        Token CLOSE_PAREN7=null;
        Token OPEN_BRACE8=null;
        Token CLOSE_BRACE10=null;
        Token SEMI_COLON11=null;
        Token OPEN_PAREN12=null;
        Token CLOSE_PAREN14=null;
        Token OPEN_BRACE15=null;
        Token CLOSE_BRACE17=null;
        RichTeaParser.datatype_return datatype4 = null;

        RichTeaParser.attribute_list_return attribute_list6 = null;

        RichTeaParser.function_return function9 = null;

        RichTeaParser.attribute_list_return attribute_list13 = null;

        RichTeaParser.function_return function16 = null;


        Tree ID2_tree=null;
        Tree OPEN_PAREN3_tree=null;
        Tree COMMA5_tree=null;
        Tree CLOSE_PAREN7_tree=null;
        Tree OPEN_BRACE8_tree=null;
        Tree CLOSE_BRACE10_tree=null;
        Tree SEMI_COLON11_tree=null;
        Tree OPEN_PAREN12_tree=null;
        Tree CLOSE_PAREN14_tree=null;
        Tree OPEN_BRACE15_tree=null;
        Tree CLOSE_BRACE17_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_attribute_list=new RewriteRuleSubtreeStream(adaptor,"rule attribute_list");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:2: ( ID ( OPEN_PAREN ( datatype )? ( COMMA )? ( attribute_list )? CLOSE_PAREN )? ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) ) )? ( attribute_list )? ) ^( CHILDREN ( function )* ) ) | ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? OPEN_BRACE ( function )* CLOSE_BRACE -> ^( FUNCTION ^( NAME ID[\"scope\"] ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==OPEN_PAREN||LA11_0==OPEN_BRACE) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:4: ID ( OPEN_PAREN ( datatype )? ( COMMA )? ( attribute_list )? CLOSE_PAREN )? ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )?
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_function122); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID2);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:7: ( OPEN_PAREN ( datatype )? ( COMMA )? ( attribute_list )? CLOSE_PAREN )?
                    int alt4=2;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:8: OPEN_PAREN ( datatype )? ( COMMA )? ( attribute_list )? CLOSE_PAREN
                            {
                            OPEN_PAREN3=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function125); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN3);

                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:19: ( datatype )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==OPEN_PAREN||LA1_0==OPEN_BRACE||LA1_0==OPEN_BOX||LA1_0==MINUS||(LA1_0>=NOT && LA1_0<=STRING)) ) {
                                alt1=1;
                            }
                            else if ( (LA1_0==ID) ) {
                                int LA1_2 = input.LA(2);

                                if ( ((LA1_2>=ID && LA1_2<=OPEN_BRACE)||LA1_2==SEMI_COLON||(LA1_2>=QUESTION_MARK && LA1_2<=POWER)||LA1_2==PERIOD) ) {
                                    alt1=1;
                                }
                            }
                            switch (alt1) {
                                case 1 :
                                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: datatype
                                    {
                                    pushFollow(FOLLOW_datatype_in_function127);
                                    datatype4=datatype();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_datatype.add(datatype4.getTree());

                                    }
                                    break;

                            }

                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:29: ( COMMA )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==COMMA) ) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
                                    {
                                    COMMA5=(Token)match(input,COMMA,FOLLOW_COMMA_in_function130); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA5);


                                    }
                                    break;

                            }

                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:36: ( attribute_list )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==ID) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: attribute_list
                                    {
                                    pushFollow(FOLLOW_attribute_list_in_function133);
                                    attribute_list6=attribute_list();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_attribute_list.add(attribute_list6.getTree());

                                    }
                                    break;

                            }

                            CLOSE_PAREN7=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function136); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN7);


                            }
                            break;

                    }

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:66: ( OPEN_BRACE ( function )* CLOSE_BRACE )?
                    int alt6=2;
                    alt6 = dfa6.predict(input);
                    switch (alt6) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:67: OPEN_BRACE ( function )* CLOSE_BRACE
                            {
                            OPEN_BRACE8=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_function141); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE8);

                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:78: ( function )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>=ID && LA5_0<=OPEN_PAREN)||LA5_0==OPEN_BRACE) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function
                            	    {
                            	    pushFollow(FOLLOW_function_in_function143);
                            	    function9=function();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_function.add(function9.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);

                            CLOSE_BRACE10=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_function146); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE10);


                            }
                            break;

                    }

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:102: ( SEMI_COLON )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==SEMI_COLON) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: SEMI_COLON
                            {
                            SEMI_COLON11=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function150); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON11);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: function, ID, ID, datatype, attribute_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 21:4: -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) ) )? ( attribute_list )? ) ^( CHILDREN ( function )* ) )
                    {
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:7: ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) ) )? ( attribute_list )? ) ^( CHILDREN ( function )* ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:18: ^( NAME ID )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ID.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:29: ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) ) )? ( attribute_list )? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES"), root_2);

                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:42: ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) ) )?
                        if ( stream_ID.hasNext()||stream_datatype.hasNext() ) {
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:42: ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) )
                            {
                            Tree root_3 = (Tree)adaptor.nil();
                            root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_3);

                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:54: ^( NAME ID[\"implicitAttribute\"] )
                            {
                            Tree root_4 = (Tree)adaptor.nil();
                            root_4 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_4);

                            adaptor.addChild(root_4, (Tree)adaptor.create(ID, "implicitAttribute"));

                            adaptor.addChild(root_3, root_4);
                            }
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:86: ^( VALUE datatype )
                            {
                            Tree root_4 = (Tree)adaptor.nil();
                            root_4 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VALUE, "VALUE"), root_4);

                            adaptor.addChild(root_4, stream_datatype.nextTree());

                            adaptor.addChild(root_3, root_4);
                            }

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_ID.reset();
                        stream_datatype.reset();
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:106: ( attribute_list )?
                        if ( stream_attribute_list.hasNext() ) {
                            adaptor.addChild(root_2, stream_attribute_list.nextTree());

                        }
                        stream_attribute_list.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:123: ^( CHILDREN ( function )* )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(CHILDREN, "CHILDREN"), root_2);

                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:134: ( function )*
                        while ( stream_function.hasNext() ) {
                            adaptor.addChild(root_2, stream_function.nextTree());

                        }
                        stream_function.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:4: ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? OPEN_BRACE ( function )* CLOSE_BRACE
                    {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:4: ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==OPEN_PAREN) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:5: OPEN_PAREN ( attribute_list )? CLOSE_PAREN
                            {
                            OPEN_PAREN12=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function208); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN12);

                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:16: ( attribute_list )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==ID) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: attribute_list
                                    {
                                    pushFollow(FOLLOW_attribute_list_in_function210);
                                    attribute_list13=attribute_list();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_attribute_list.add(attribute_list13.getTree());

                                    }
                                    break;

                            }

                            CLOSE_PAREN14=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function213); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN14);


                            }
                            break;

                    }

                    OPEN_BRACE15=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_function217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE15);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:57: ( function )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=ID && LA10_0<=OPEN_PAREN)||LA10_0==OPEN_BRACE) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function
                    	    {
                    	    pushFollow(FOLLOW_function_in_function219);
                    	    function16=function();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_function.add(function16.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    CLOSE_BRACE17=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_function222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE17);



                    // AST REWRITE
                    // elements: function, attribute_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 24:4: -> ^( FUNCTION ^( NAME ID[\"scope\"] ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) )
                    {
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:7: ^( FUNCTION ^( NAME ID[\"scope\"] ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:18: ^( NAME ID[\"scope\"] )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, (Tree)adaptor.create(ID, "scope"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:38: ^( ATTRIBUTES ( attribute_list )? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES"), root_2);

                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:51: ( attribute_list )?
                        if ( stream_attribute_list.hasNext() ) {
                            adaptor.addChild(root_2, stream_attribute_list.nextTree());

                        }
                        stream_attribute_list.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:68: ^( CHILDREN ( function )* )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(CHILDREN, "CHILDREN"), root_2);

                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:79: ( function )*
                        while ( stream_function.hasNext() ) {
                            adaptor.addChild(root_2, stream_function.nextTree());

                        }
                        stream_function.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class attribute_list_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute_list"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:27:1: attribute_list : attribute ( ( COMMA )? attribute )* -> ( ^( ATTRIBUTE attribute ) )* ;
    public final RichTeaParser.attribute_list_return attribute_list() throws RecognitionException {
        RichTeaParser.attribute_list_return retval = new RichTeaParser.attribute_list_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token COMMA19=null;
        RichTeaParser.attribute_return attribute18 = null;

        RichTeaParser.attribute_return attribute20 = null;


        Tree COMMA19_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:28:2: ( attribute ( ( COMMA )? attribute )* -> ( ^( ATTRIBUTE attribute ) )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:28:4: attribute ( ( COMMA )? attribute )*
            {
            pushFollow(FOLLOW_attribute_in_attribute_list264);
            attribute18=attribute();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attribute.add(attribute18.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:28:14: ( ( COMMA )? attribute )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ID||LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:28:15: ( COMMA )? attribute
            	    {
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:28:15: ( COMMA )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==COMMA) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
            	            {
            	            COMMA19=(Token)match(input,COMMA,FOLLOW_COMMA_in_attribute_list267); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA19);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_attribute_in_attribute_list270);
            	    attribute20=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_attribute.add(attribute20.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



            // AST REWRITE
            // elements: attribute
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 29:4: -> ( ^( ATTRIBUTE attribute ) )*
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:29:7: ( ^( ATTRIBUTE attribute ) )*
                while ( stream_attribute.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:29:7: ^( ATTRIBUTE attribute )
                    {
                    Tree root_1 = (Tree)adaptor.nil();
                    root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_1);

                    adaptor.addChild(root_1, stream_attribute.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_attribute.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribute_list"

    public static class attribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:32:1: attribute : ID ( COLON | ASSIGN ) datatype -> ^( NAME ID ) ^( VALUE datatype ) ;
    public final RichTeaParser.attribute_return attribute() throws RecognitionException {
        RichTeaParser.attribute_return retval = new RichTeaParser.attribute_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID21=null;
        Token COLON22=null;
        Token ASSIGN23=null;
        RichTeaParser.datatype_return datatype24 = null;


        Tree ID21_tree=null;
        Tree COLON22_tree=null;
        Tree ASSIGN23_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:33:2: ( ID ( COLON | ASSIGN ) datatype -> ^( NAME ID ) ^( VALUE datatype ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:33:4: ID ( COLON | ASSIGN ) datatype
            {
            ID21=(Token)match(input,ID,FOLLOW_ID_in_attribute297); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID21);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:33:7: ( COLON | ASSIGN )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON) ) {
                alt14=1;
            }
            else if ( (LA14_0==ASSIGN) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:33:8: COLON
                    {
                    COLON22=(Token)match(input,COLON,FOLLOW_COLON_in_attribute300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON22);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:33:16: ASSIGN
                    {
                    ASSIGN23=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attribute304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN23);


                    }
                    break;

            }

            pushFollow(FOLLOW_datatype_in_attribute308);
            datatype24=datatype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_datatype.add(datatype24.getTree());


            // AST REWRITE
            // elements: ID, datatype
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 34:4: -> ^( NAME ID ) ^( VALUE datatype )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:34:7: ^( NAME ID )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:34:18: ^( VALUE datatype )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VALUE, "VALUE"), root_1);

                adaptor.addChild(root_1, stream_datatype.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribute"

    public static class datatype_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:37:1: datatype : ( expression | function | array );
    public final RichTeaParser.datatype_return datatype() throws RecognitionException {
        RichTeaParser.datatype_return retval = new RichTeaParser.datatype_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.expression_return expression25 = null;

        RichTeaParser.function_return function26 = null;

        RichTeaParser.array_return array27 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:38:2: ( expression | function | array )
            int alt15=3;
            switch ( input.LA(1) ) {
            case OPEN_PAREN:
                {
                switch ( input.LA(2) ) {
                case OPEN_PAREN:
                case MINUS:
                case NOT:
                case NUMBER:
                case BOOLEAN:
                case STRING:
                    {
                    alt15=1;
                    }
                    break;
                case ID:
                    {
                    int LA15_6 = input.LA(3);

                    if ( ((LA15_6>=COLON && LA15_6<=ASSIGN)) ) {
                        alt15=2;
                    }
                    else if ( (LA15_6==CLOSE_PAREN||(LA15_6>=OR && LA15_6<=POWER)||LA15_6==PERIOD) ) {
                        alt15=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case CLOSE_PAREN:
                    {
                    alt15=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }

                }
                break;
            case MINUS:
            case NOT:
            case NUMBER:
            case BOOLEAN:
            case STRING:
                {
                alt15=1;
                }
                break;
            case ID:
                {
                int LA15_3 = input.LA(2);

                if ( (synpred15_RichTea()) ) {
                    alt15=1;
                }
                else if ( (synpred16_RichTea()) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            case OPEN_BRACE:
                {
                alt15=2;
                }
                break;
            case OPEN_BOX:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:38:4: expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_datatype338);
                    expression25=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression25.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:39:4: function
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_function_in_datatype343);
                    function26=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function26.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:5: array
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_array_in_datatype349);
                    array27=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array27.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "datatype"

    public static class array_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:43:1: array : OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX -> ^( ARRAY ( datatype )* ) ;
    public final RichTeaParser.array_return array() throws RecognitionException {
        RichTeaParser.array_return retval = new RichTeaParser.array_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_BOX28=null;
        Token COMMA30=null;
        Token CLOSE_BOX32=null;
        RichTeaParser.datatype_return datatype29 = null;

        RichTeaParser.datatype_return datatype31 = null;


        Tree OPEN_BOX28_tree=null;
        Tree COMMA30_tree=null;
        Tree CLOSE_BOX32_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BOX=new RewriteRuleTokenStream(adaptor,"token CLOSE_BOX");
        RewriteRuleTokenStream stream_OPEN_BOX=new RewriteRuleTokenStream(adaptor,"token OPEN_BOX");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:44:2: ( OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX -> ^( ARRAY ( datatype )* ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:44:4: OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX
            {
            OPEN_BOX28=(Token)match(input,OPEN_BOX,FOLLOW_OPEN_BOX_in_array360); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BOX.add(OPEN_BOX28);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:44:13: ( datatype ( COMMA datatype )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=ID && LA17_0<=OPEN_PAREN)||LA17_0==OPEN_BRACE||LA17_0==OPEN_BOX||LA17_0==MINUS||(LA17_0>=NOT && LA17_0<=STRING)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:44:14: datatype ( COMMA datatype )*
                    {
                    pushFollow(FOLLOW_datatype_in_array363);
                    datatype29=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_datatype.add(datatype29.getTree());
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:44:23: ( COMMA datatype )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:44:24: COMMA datatype
                    	    {
                    	    COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_array366); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA30);

                    	    pushFollow(FOLLOW_datatype_in_array368);
                    	    datatype31=datatype();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_datatype.add(datatype31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            CLOSE_BOX32=(Token)match(input,CLOSE_BOX,FOLLOW_CLOSE_BOX_in_array375); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BOX.add(CLOSE_BOX32);



            // AST REWRITE
            // elements: datatype
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 45:4: -> ^( ARRAY ( datatype )* )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:45:7: ^( ARRAY ( datatype )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ARRAY, "ARRAY"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:45:15: ( datatype )*
                while ( stream_datatype.hasNext() ) {
                    adaptor.addChild(root_1, stream_datatype.nextTree());

                }
                stream_datatype.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "array"

    public static class expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:1: expression : ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression );
    public final RichTeaParser.expression_return expression() throws RecognitionException {
        RichTeaParser.expression_return retval = new RichTeaParser.expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token QUESTION_MARK34=null;
        Token COLON36=null;
        RichTeaParser.logical_expression_return logical_expression33 = null;

        RichTeaParser.logical_expression_return logical_expression35 = null;

        RichTeaParser.logical_expression_return logical_expression37 = null;

        RichTeaParser.logical_expression_return logical_expression38 = null;


        Tree QUESTION_MARK34_tree=null;
        Tree COLON36_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_logical_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_expression");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:2: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
                    {
                    pushFollow(FOLLOW_logical_expression_in_expression403);
                    logical_expression33=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression33.getTree());
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:23: ( QUESTION_MARK logical_expression COLON logical_expression )
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:24: QUESTION_MARK logical_expression COLON logical_expression
                    {
                    QUESTION_MARK34=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_expression406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK34);

                    pushFollow(FOLLOW_logical_expression_in_expression408);
                    logical_expression35=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression35.getTree());
                    COLON36=(Token)match(input,COLON,FOLLOW_COLON_in_expression410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON36);

                    pushFollow(FOLLOW_logical_expression_in_expression412);
                    logical_expression37=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression37.getTree());

                    }



                    // AST REWRITE
                    // elements: logical_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 51:83: -> ^( TERNARY_OPERATOR ( logical_expression )+ )
                    {
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:86: ^( TERNARY_OPERATOR ( logical_expression )+ )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TERNARY_OPERATOR, "TERNARY_OPERATOR"), root_1);

                        if ( !(stream_logical_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_logical_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_logical_expression.nextTree());

                        }
                        stream_logical_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:52:4: logical_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_logical_expression_in_expression427);
                    logical_expression38=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression38.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class logical_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:1: logical_expression : boolean_expression ( OR boolean_expression )* ;
    public final RichTeaParser.logical_expression_return logical_expression() throws RecognitionException {
        RichTeaParser.logical_expression_return retval = new RichTeaParser.logical_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OR40=null;
        RichTeaParser.boolean_expression_return boolean_expression39 = null;

        RichTeaParser.boolean_expression_return boolean_expression41 = null;


        Tree OR40_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:56:2: ( boolean_expression ( OR boolean_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:56:4: boolean_expression ( OR boolean_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_boolean_expression_in_logical_expression439);
            boolean_expression39=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression39.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:56:23: ( OR boolean_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==OR) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:56:24: OR boolean_expression
            	    {
            	    OR40=(Token)match(input,OR,FOLLOW_OR_in_logical_expression442); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR40_tree = (Tree)adaptor.create(OR40);
            	    root_0 = (Tree)adaptor.becomeRoot(OR40_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_boolean_expression_in_logical_expression445);
            	    boolean_expression41=boolean_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression41.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logical_expression"

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:59:1: boolean_expression : equality_expression ( AND equality_expression )* ;
    public final RichTeaParser.boolean_expression_return boolean_expression() throws RecognitionException {
        RichTeaParser.boolean_expression_return retval = new RichTeaParser.boolean_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token AND43=null;
        RichTeaParser.equality_expression_return equality_expression42 = null;

        RichTeaParser.equality_expression_return equality_expression44 = null;


        Tree AND43_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:2: ( equality_expression ( AND equality_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:4: equality_expression ( AND equality_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_boolean_expression458);
            equality_expression42=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression42.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:24: ( AND equality_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AND) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:25: AND equality_expression
            	    {
            	    AND43=(Token)match(input,AND,FOLLOW_AND_in_boolean_expression461); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND43_tree = (Tree)adaptor.create(AND43);
            	    root_0 = (Tree)adaptor.becomeRoot(AND43_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expression_in_boolean_expression464);
            	    equality_expression44=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression44.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolean_expression"

    public static class equality_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:63:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final RichTeaParser.equality_expression_return equality_expression() throws RecognitionException {
        RichTeaParser.equality_expression_return retval = new RichTeaParser.equality_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set46=null;
        RichTeaParser.relational_expression_return relational_expression45 = null;

        RichTeaParser.relational_expression_return relational_expression47 = null;


        Tree set46_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:64:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:64:4: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression478);
            relational_expression45=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression45.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:64:26: ( ( EQ | NEQ ) relational_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=EQ && LA21_0<=NEQ)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:64:27: ( EQ | NEQ ) relational_expression
            	    {
            	    set46=(Token)input.LT(1);
            	    set46=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set46), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression492);
            	    relational_expression47=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression47.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equality_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:67:1: relational_expression : additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* ;
    public final RichTeaParser.relational_expression_return relational_expression() throws RecognitionException {
        RichTeaParser.relational_expression_return retval = new RichTeaParser.relational_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set49=null;
        RichTeaParser.additive_expression_return additive_expression48 = null;

        RichTeaParser.additive_expression_return additive_expression50 = null;


        Tree set49_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:68:2: ( additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:68:4: additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_relational_expression506);
            additive_expression48=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression48.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:68:24: ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=LT && LA22_0<=GTEQ)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:68:25: ( LT | LTEQ | GT | GTEQ ) additive_expression
            	    {
            	    set49=(Token)input.LT(1);
            	    set49=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT && input.LA(1)<=GTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set49), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expression_in_relational_expression528);
            	    additive_expression50=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression50.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relational_expression"

    public static class additive_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:1: additive_expression : multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )* ;
    public final RichTeaParser.additive_expression_return additive_expression() throws RecognitionException {
        RichTeaParser.additive_expression_return retval = new RichTeaParser.additive_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set52=null;
        RichTeaParser.multiplicative_expression_return multiplicative_expression51 = null;

        RichTeaParser.multiplicative_expression_return multiplicative_expression53 = null;


        Tree set52_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:2: ( multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:4: multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression542);
            multiplicative_expression51=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression51.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:30: ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=PLUS_EQUALS && LA23_0<=MINUS)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:31: ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression
            	    {
            	    set52=(Token)input.LT(1);
            	    set52=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS_EQUALS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set52), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression564);
            	    multiplicative_expression53=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression53.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:1: multiplicative_expression : power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )* ;
    public final RichTeaParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        RichTeaParser.multiplicative_expression_return retval = new RichTeaParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set55=null;
        RichTeaParser.power_expression_return power_expression54 = null;

        RichTeaParser.power_expression_return power_expression56 = null;


        Tree set55_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:76:2: ( power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:76:4: power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_power_expression_in_multiplicative_expression578);
            power_expression54=power_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression54.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:76:21: ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=MULTIPLY_EQUALS && LA24_0<=MODULUS)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:76:22: ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression
            	    {
            	    set55=(Token)input.LT(1);
            	    set55=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULTIPLY_EQUALS && input.LA(1)<=MODULUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set55), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_power_expression_in_multiplicative_expression604);
            	    power_expression56=power_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression56.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"

    public static class power_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "power_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:79:1: power_expression : unary_expression ( POWER unary_expression )* ;
    public final RichTeaParser.power_expression_return power_expression() throws RecognitionException {
        RichTeaParser.power_expression_return retval = new RichTeaParser.power_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token POWER58=null;
        RichTeaParser.unary_expression_return unary_expression57 = null;

        RichTeaParser.unary_expression_return unary_expression59 = null;


        Tree POWER58_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:80:2: ( unary_expression ( POWER unary_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:80:4: unary_expression ( POWER unary_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_power_expression618);
            unary_expression57=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression57.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:80:21: ( POWER unary_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==POWER) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:80:23: POWER unary_expression
            	    {
            	    POWER58=(Token)match(input,POWER,FOLLOW_POWER_in_power_expression622); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER58_tree = (Tree)adaptor.create(POWER58);
            	    root_0 = (Tree)adaptor.becomeRoot(POWER58_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_power_expression625);
            	    unary_expression59=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression59.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "power_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:1: unary_expression : ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) );
    public final RichTeaParser.unary_expression_return unary_expression() throws RecognitionException {
        RichTeaParser.unary_expression_return retval = new RichTeaParser.unary_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token NOT61=null;
        Token MINUS63=null;
        RichTeaParser.primary_expression_return primary_expression60 = null;

        RichTeaParser.primary_expression_return primary_expression62 = null;

        RichTeaParser.primary_expression_return primary_expression64 = null;


        Tree NOT61_tree=null;
        Tree MINUS63_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:84:2: ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case ID:
            case OPEN_PAREN:
            case NUMBER:
            case BOOLEAN:
            case STRING:
                {
                alt26=1;
                }
                break;
            case NOT:
                {
                alt26=2;
                }
                break;
            case MINUS:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:84:4: primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_primary_expression_in_unary_expression638);
                    primary_expression60=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression60.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:85:4: NOT primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    NOT61=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT61_tree = (Tree)adaptor.create(NOT61);
                    root_0 = (Tree)adaptor.becomeRoot(NOT61_tree, root_0);
                    }
                    pushFollow(FOLLOW_primary_expression_in_unary_expression646);
                    primary_expression62=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression62.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:86:4: MINUS primary_expression
                    {
                    MINUS63=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS63);

                    pushFollow(FOLLOW_primary_expression_in_unary_expression653);
                    primary_expression64=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression64.getTree());


                    // AST REWRITE
                    // elements: primary_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 86:29: -> ^( NEGATE primary_expression )
                    {
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:86:32: ^( NEGATE primary_expression )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NEGATE, "NEGATE"), root_1);

                        adaptor.addChild(root_1, stream_primary_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_expression"

    public static class primary_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:89:1: primary_expression : ( OPEN_PAREN logical_expression CLOSE_PAREN | expression_value );
    public final RichTeaParser.primary_expression_return primary_expression() throws RecognitionException {
        RichTeaParser.primary_expression_return retval = new RichTeaParser.primary_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_PAREN65=null;
        Token CLOSE_PAREN67=null;
        RichTeaParser.logical_expression_return logical_expression66 = null;

        RichTeaParser.expression_value_return expression_value68 = null;


        Tree OPEN_PAREN65_tree=null;
        Tree CLOSE_PAREN67_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:90:2: ( OPEN_PAREN logical_expression CLOSE_PAREN | expression_value )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==OPEN_PAREN) ) {
                alt27=1;
            }
            else if ( (LA27_0==ID||(LA27_0>=NUMBER && LA27_0<=STRING)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:90:4: OPEN_PAREN logical_expression CLOSE_PAREN
                    {
                    root_0 = (Tree)adaptor.nil();

                    OPEN_PAREN65=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_primary_expression673); if (state.failed) return retval;
                    pushFollow(FOLLOW_logical_expression_in_primary_expression676);
                    logical_expression66=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression66.getTree());
                    CLOSE_PAREN67=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_primary_expression678); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:5: expression_value
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expression_value_in_primary_expression685);
                    expression_value68=expression_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_value68.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary_expression"

    public static class expression_value_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_value"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:94:1: expression_value : ( NUMBER | BOOLEAN | STRING | variable );
    public final RichTeaParser.expression_value_return expression_value() throws RecognitionException {
        RichTeaParser.expression_value_return retval = new RichTeaParser.expression_value_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token NUMBER69=null;
        Token BOOLEAN70=null;
        Token STRING71=null;
        RichTeaParser.variable_return variable72 = null;


        Tree NUMBER69_tree=null;
        Tree BOOLEAN70_tree=null;
        Tree STRING71_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:95:2: ( NUMBER | BOOLEAN | STRING | variable )
            int alt28=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt28=1;
                }
                break;
            case BOOLEAN:
                {
                alt28=2;
                }
                break;
            case STRING:
                {
                alt28=3;
                }
                break;
            case ID:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:95:4: NUMBER
                    {
                    root_0 = (Tree)adaptor.nil();

                    NUMBER69=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expression_value696); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER69_tree = (Tree)adaptor.create(NUMBER69);
                    adaptor.addChild(root_0, NUMBER69_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:96:4: BOOLEAN
                    {
                    root_0 = (Tree)adaptor.nil();

                    BOOLEAN70=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expression_value701); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN70_tree = (Tree)adaptor.create(BOOLEAN70);
                    adaptor.addChild(root_0, BOOLEAN70_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:97:4: STRING
                    {
                    root_0 = (Tree)adaptor.nil();

                    STRING71=(Token)match(input,STRING,FOLLOW_STRING_in_expression_value706); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING71_tree = (Tree)adaptor.create(STRING71);
                    adaptor.addChild(root_0, STRING71_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:98:5: variable
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_expression_value712);
                    variable72=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable72.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression_value"

    public static class variable_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:101:1: variable : ( ID ( PERIOD ID )* ) -> ^( VARIABLE ( ^( ID ) )+ ) ;
    public final RichTeaParser.variable_return variable() throws RecognitionException {
        RichTeaParser.variable_return retval = new RichTeaParser.variable_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID73=null;
        Token PERIOD74=null;
        Token ID75=null;

        Tree ID73_tree=null;
        Tree PERIOD74_tree=null;
        Tree ID75_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:2: ( ( ID ( PERIOD ID )* ) -> ^( VARIABLE ( ^( ID ) )+ ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:4: ( ID ( PERIOD ID )* )
            {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:4: ( ID ( PERIOD ID )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:5: ID ( PERIOD ID )*
            {
            ID73=(Token)match(input,ID,FOLLOW_ID_in_variable725); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID73);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:8: ( PERIOD ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==PERIOD) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:9: PERIOD ID
            	    {
            	    PERIOD74=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_variable728); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD74);

            	    ID75=(Token)match(input,ID,FOLLOW_ID_in_variable730); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID75);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 103:4: -> ^( VARIABLE ( ^( ID ) )+ )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:7: ^( VARIABLE ( ^( ID ) )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:18: ^( ID )
                    {
                    Tree root_2 = (Tree)adaptor.nil();
                    root_2 = (Tree)adaptor.becomeRoot(stream_ID.nextNode(), root_2);

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    // $ANTLR start synpred4_RichTea
    public final void synpred4_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:8: ( OPEN_PAREN ( datatype )? ( COMMA )? ( attribute_list )? CLOSE_PAREN )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:8: OPEN_PAREN ( datatype )? ( COMMA )? ( attribute_list )? CLOSE_PAREN
        {
        match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_synpred4_RichTea125); if (state.failed) return ;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:19: ( datatype )?
        int alt30=2;
        int LA30_0 = input.LA(1);

        if ( (LA30_0==OPEN_PAREN||LA30_0==OPEN_BRACE||LA30_0==OPEN_BOX||LA30_0==MINUS||(LA30_0>=NOT && LA30_0<=STRING)) ) {
            alt30=1;
        }
        else if ( (LA30_0==ID) ) {
            int LA30_2 = input.LA(2);

            if ( ((LA30_2>=ID && LA30_2<=OPEN_BRACE)||LA30_2==SEMI_COLON||(LA30_2>=QUESTION_MARK && LA30_2<=POWER)||LA30_2==PERIOD) ) {
                alt30=1;
            }
        }
        switch (alt30) {
            case 1 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: datatype
                {
                pushFollow(FOLLOW_datatype_in_synpred4_RichTea127);
                datatype();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:29: ( COMMA )?
        int alt31=2;
        int LA31_0 = input.LA(1);

        if ( (LA31_0==COMMA) ) {
            alt31=1;
        }
        switch (alt31) {
            case 1 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred4_RichTea130); if (state.failed) return ;

                }
                break;

        }

        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:36: ( attribute_list )?
        int alt32=2;
        int LA32_0 = input.LA(1);

        if ( (LA32_0==ID) ) {
            alt32=1;
        }
        switch (alt32) {
            case 1 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: attribute_list
                {
                pushFollow(FOLLOW_attribute_list_in_synpred4_RichTea133);
                attribute_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_synpred4_RichTea136); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_RichTea

    // $ANTLR start synpred6_RichTea
    public final void synpred6_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:67: ( OPEN_BRACE ( function )* CLOSE_BRACE )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:67: OPEN_BRACE ( function )* CLOSE_BRACE
        {
        match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_synpred6_RichTea141); if (state.failed) return ;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:78: ( function )*
        loop33:
        do {
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=ID && LA33_0<=OPEN_PAREN)||LA33_0==OPEN_BRACE) ) {
                alt33=1;
            }


            switch (alt33) {
        	case 1 :
        	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function
        	    {
        	    pushFollow(FOLLOW_function_in_synpred6_RichTea143);
        	    function();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop33;
            }
        } while (true);

        match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_synpred6_RichTea146); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_RichTea

    // $ANTLR start synpred15_RichTea
    public final void synpred15_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:38:4: ( expression )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:38:4: expression
        {
        pushFollow(FOLLOW_expression_in_synpred15_RichTea338);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_RichTea

    // $ANTLR start synpred16_RichTea
    public final void synpred16_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:39:4: ( function )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:39:4: function
        {
        pushFollow(FOLLOW_function_in_synpred16_RichTea343);
        function();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_RichTea

    // $ANTLR start synpred19_RichTea
    public final void synpred19_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:4: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
        {
        pushFollow(FOLLOW_logical_expression_in_synpred19_RichTea403);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:23: ( QUESTION_MARK logical_expression COLON logical_expression )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:24: QUESTION_MARK logical_expression COLON logical_expression
        {
        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred19_RichTea406); if (state.failed) return ;
        pushFollow(FOLLOW_logical_expression_in_synpred19_RichTea408);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred19_RichTea410); if (state.failed) return ;
        pushFollow(FOLLOW_logical_expression_in_synpred19_RichTea412);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_RichTea

    // Delegated rules

    public final boolean synpred15_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\1\2\12\uffff";
    static final String DFA4_minS =
        "\1\16\1\0\11\uffff";
    static final String DFA4_maxS =
        "\1\30\1\0\11\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\7\uffff\1\1";
    static final String DFA4_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\1\5\2\3\uffff\1\2",
            "\1\uffff",
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "20:7: ( OPEN_PAREN ( datatype )? ( COMMA )? ( attribute_list )? CLOSE_PAREN )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_RichTea()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA6_eotS =
        "\13\uffff";
    static final String DFA6_eofS =
        "\1\2\12\uffff";
    static final String DFA6_minS =
        "\1\16\1\0\11\uffff";
    static final String DFA6_maxS =
        "\1\30\1\0\11\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\7\uffff\1\1";
    static final String DFA6_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA6_transitionS = {
            "\4\2\1\1\2\2\3\uffff\1\2",
            "\1\uffff",
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "20:66: ( OPEN_BRACE ( function )* CLOSE_BRACE )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_RichTea()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\12\uffff";
    static final String DFA18_eofS =
        "\12\uffff";
    static final String DFA18_minS =
        "\1\16\7\0\2\uffff";
    static final String DFA18_maxS =
        "\1\57\7\0\2\uffff";
    static final String DFA18_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA18_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\5\1\1\25\uffff\1\7\6\uffff\1\6\1\2\1\3\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "50:1: expression : ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_function_in_program110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function122 = new BitSet(new long[]{0x0000000000148002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function125 = new BitSet(new long[]{0x0000F0200087C000L});
    public static final BitSet FOLLOW_datatype_in_function127 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_COMMA_in_function130 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_attribute_list_in_function133 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function136 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_function141 = new BitSet(new long[]{0x00000000000CC000L});
    public static final BitSet FOLLOW_function_in_function143 = new BitSet(new long[]{0x00000000000CC000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_function146 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function208 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_attribute_list_in_function210 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function213 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_function217 = new BitSet(new long[]{0x00000000000CC000L});
    public static final BitSet FOLLOW_function_in_function219 = new BitSet(new long[]{0x00000000000CC000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_function222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attribute_list264 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_COMMA_in_attribute_list267 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_attribute_in_attribute_list270 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_ID_in_attribute297 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_COLON_in_attribute300 = new BitSet(new long[]{0x0000F0200084C000L});
    public static final BitSet FOLLOW_ASSIGN_in_attribute304 = new BitSet(new long[]{0x0000F0200084C000L});
    public static final BitSet FOLLOW_datatype_in_attribute308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_datatype338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_datatype343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_datatype349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BOX_in_array360 = new BitSet(new long[]{0x0000F0200184C000L});
    public static final BitSet FOLLOW_datatype_in_array363 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_COMMA_in_array366 = new BitSet(new long[]{0x0000F0200084C000L});
    public static final BitSet FOLLOW_datatype_in_array368 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_CLOSE_BOX_in_array375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression403 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_expression406 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_logical_expression_in_expression408 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_expression410 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_logical_expression_in_expression412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression439 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_OR_in_logical_expression442 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression445 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression458 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_AND_in_boolean_expression461 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression464 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression478 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_set_in_equality_expression481 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression492 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression506 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_set_in_relational_expression509 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression528 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression542 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_set_in_additive_expression545 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression564 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression578 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression581 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression604 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression618 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_POWER_in_power_expression622 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression625 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expression643 = new BitSet(new long[]{0x0000E0000000C000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression651 = new BitSet(new long[]{0x0000E0000000C000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_primary_expression673 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_logical_expression_in_primary_expression676 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_primary_expression678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_value_in_primary_expression685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expression_value696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_expression_value701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expression_value706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_expression_value712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable725 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_variable728 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_variable730 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_synpred4_RichTea125 = new BitSet(new long[]{0x0000F0200087C000L});
    public static final BitSet FOLLOW_datatype_in_synpred4_RichTea127 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_COMMA_in_synpred4_RichTea130 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_attribute_list_in_synpred4_RichTea133 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_synpred4_RichTea136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_synpred6_RichTea141 = new BitSet(new long[]{0x00000000000CC000L});
    public static final BitSet FOLLOW_function_in_synpred6_RichTea143 = new BitSet(new long[]{0x00000000000CC000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_synpred6_RichTea146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred15_RichTea338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred16_RichTea343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_synpred19_RichTea403 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred19_RichTea406 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_logical_expression_in_synpred19_RichTea408 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_synpred19_RichTea410 = new BitSet(new long[]{0x0000F0200000C000L});
    public static final BitSet FOLLOW_logical_expression_in_synpred19_RichTea412 = new BitSet(new long[]{0x0000000000000002L});

}