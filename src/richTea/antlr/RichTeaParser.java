// $ANTLR 3.4 C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g 2012-07-17 14:41:49
package richTea.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class RichTeaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ASSIGN", "AT", "ATTRIBUTE", "ATTRIBUTES", "BOOLEAN", "BRANCH", "BRANCHES", "CHILDREN", "CLOSE_BOX", "CLOSE_BRACE", "CLOSE_PAREN", "COLON", "COMMA", "COMMENT", "DIVIDE", "DIVIDE_EQUALS", "EQ", "ESC_SEQ", "EXECUTABLE_FUNCTION_ATTRIBUTE", "FLOAT", "FUNCTION", "GT", "GTEQ", "HASH", "ID", "INTEGER", "LAST_RETURNED_VALUE", "LETTER", "LT", "LTEQ", "MINUS", "MINUS_EQUALS", "MODULUS", "MULTIPLY", "MULTIPLY_EQUALS", "NAME", "NATIVE_METHOD_CALL", "NEGATE", "NEQ", "NOT", "NUMBER", "OPEN_BOX", "OPEN_BRACE", "OPEN_PAREN", "OR", "PERIOD", "PLUS", "PLUS_EQUALS", "POWER", "PROPERTY_LOOKUP", "QUESTION_MARK", "SEMI_COLON", "STRING", "TERNARY_OPERATOR", "UNDERSCORE", "VALUE", "VARIABLE", "WHITESPACE"
    };

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
    public static final int NUMBER=46;
    public static final int OPEN_BOX=47;
    public static final int OPEN_BRACE=48;
    public static final int OPEN_PAREN=49;
    public static final int OR=50;
    public static final int PERIOD=51;
    public static final int PLUS=52;
    public static final int PLUS_EQUALS=53;
    public static final int POWER=54;
    public static final int PROPERTY_LOOKUP=55;
    public static final int QUESTION_MARK=56;
    public static final int SEMI_COLON=57;
    public static final int STRING=58;
    public static final int TERNARY_OPERATOR=59;
    public static final int UNDERSCORE=60;
    public static final int VALUE=61;
    public static final int VARIABLE=62;
    public static final int WHITESPACE=63;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

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
    public String getGrammarFileName() { return "C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:22:1: program : function ;
    public final RichTeaParser.program_return program() throws RecognitionException {
        RichTeaParser.program_return retval = new RichTeaParser.program_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        RichTeaParser.function_return function1 =null;



        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:23:2: ( function )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:23:5: function
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_function_in_program148);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class function_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:26:1: function : ( ID OPEN_PAREN ( function_data )? CLOSE_PAREN ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ( function_data )? ) | OPEN_PAREN ( function_data )? CLOSE_PAREN ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID[\"scope\"] ) ( function_data )? ) );
    public final RichTeaParser.function_return function() throws RecognitionException {
        RichTeaParser.function_return retval = new RichTeaParser.function_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID2=null;
        Token OPEN_PAREN3=null;
        Token CLOSE_PAREN5=null;
        Token SEMI_COLON6=null;
        Token OPEN_PAREN7=null;
        Token CLOSE_PAREN9=null;
        Token SEMI_COLON10=null;
        RichTeaParser.function_data_return function_data4 =null;

        RichTeaParser.function_data_return function_data8 =null;


        Tree ID2_tree=null;
        Tree OPEN_PAREN3_tree=null;
        Tree CLOSE_PAREN5_tree=null;
        Tree SEMI_COLON6_tree=null;
        Tree OPEN_PAREN7_tree=null;
        Tree CLOSE_PAREN9_tree=null;
        Tree SEMI_COLON10_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_function_data=new RewriteRuleSubtreeStream(adaptor,"rule function_data");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:27:2: ( ID OPEN_PAREN ( function_data )? CLOSE_PAREN ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ( function_data )? ) | OPEN_PAREN ( function_data )? CLOSE_PAREN ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID[\"scope\"] ) ( function_data )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==OPEN_PAREN) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:27:4: ID OPEN_PAREN ( function_data )? CLOSE_PAREN ( SEMI_COLON )?
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_function160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID2);


                    OPEN_PAREN3=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN3);


                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:27:18: ( function_data )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==AT||LA1_0==BOOLEAN||LA1_0==COMMA||(LA1_0 >= HASH && LA1_0 <= ID)||LA1_0==MINUS||(LA1_0 >= NOT && LA1_0 <= OPEN_PAREN)||LA1_0==STRING||LA1_0==UNDERSCORE) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==CLOSE_PAREN) ) {
                        int LA1_14 = input.LA(2);

                        if ( (synpred1_RichTea()) ) {
                            alt1=1;
                        }
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:27:18: function_data
                            {
                            pushFollow(FOLLOW_function_data_in_function164);
                            function_data4=function_data();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_function_data.add(function_data4.getTree());

                            }
                            break;

                    }


                    CLOSE_PAREN5=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN5);


                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:27:45: ( SEMI_COLON )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==SEMI_COLON) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:27:45: SEMI_COLON
                            {
                            SEMI_COLON6=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function169); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON6);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ID, function_data
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 28:4: -> ^( FUNCTION ^( NAME ID ) ( function_data )? )
                    {
                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:28:7: ^( FUNCTION ^( NAME ID ) ( function_data )? )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(FUNCTION, "FUNCTION")
                        , root_1);

                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:28:18: ^( NAME ID )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(NAME, "NAME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:28:29: ( function_data )?
                        if ( stream_function_data.hasNext() ) {
                            adaptor.addChild(root_1, stream_function_data.nextTree());

                        }
                        stream_function_data.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:29:4: OPEN_PAREN ( function_data )? CLOSE_PAREN ( SEMI_COLON )?
                    {
                    OPEN_PAREN7=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function193); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN7);


                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:29:15: ( function_data )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==AT||LA3_0==BOOLEAN||LA3_0==COMMA||(LA3_0 >= HASH && LA3_0 <= ID)||LA3_0==MINUS||(LA3_0 >= NOT && LA3_0 <= OPEN_PAREN)||LA3_0==STRING||LA3_0==UNDERSCORE) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==CLOSE_PAREN) ) {
                        int LA3_14 = input.LA(2);

                        if ( (synpred4_RichTea()) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:29:15: function_data
                            {
                            pushFollow(FOLLOW_function_data_in_function195);
                            function_data8=function_data();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_function_data.add(function_data8.getTree());

                            }
                            break;

                    }


                    CLOSE_PAREN9=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function198); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN9);


                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:29:42: ( SEMI_COLON )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==SEMI_COLON) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:29:42: SEMI_COLON
                            {
                            SEMI_COLON10=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function200); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON10);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: function_data
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 30:4: -> ^( FUNCTION ^( NAME ID[\"scope\"] ) ( function_data )? )
                    {
                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:30:7: ^( FUNCTION ^( NAME ID[\"scope\"] ) ( function_data )? )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(FUNCTION, "FUNCTION")
                        , root_1);

                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:30:18: ^( NAME ID[\"scope\"] )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(NAME, "NAME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        (Tree)adaptor.create(ID, "scope")
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:30:38: ( function_data )?
                        if ( stream_function_data.hasNext() ) {
                            adaptor.addChild(root_1, stream_function_data.nextTree());

                        }
                        stream_function_data.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class function_data_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_data"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:33:1: function_data : attribute_list branch_list ;
    public final RichTeaParser.function_data_return function_data() throws RecognitionException {
        RichTeaParser.function_data_return retval = new RichTeaParser.function_data_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        RichTeaParser.attribute_list_return attribute_list11 =null;

        RichTeaParser.branch_list_return branch_list12 =null;



        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:34:2: ( attribute_list branch_list )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:34:4: attribute_list branch_list
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_attribute_list_in_function_data231);
            attribute_list11=attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute_list11.getTree());

            pushFollow(FOLLOW_branch_list_in_function_data233);
            branch_list12=branch_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, branch_list12.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_data"


    public static class attribute_list_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_list"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:37:1: attribute_list : (attributes+= implicit_attribute )? ( ( COMMA )? attributes+= attribute )* -> ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* ) ;
    public final RichTeaParser.attribute_list_return attribute_list() throws RecognitionException {
        RichTeaParser.attribute_list_return retval = new RichTeaParser.attribute_list_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token COMMA13=null;
        List list_attributes=null;
        RuleReturnScope attributes = null;
        Tree COMMA13_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_implicit_attribute=new RewriteRuleSubtreeStream(adaptor,"rule implicit_attribute");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:2: ( (attributes+= implicit_attribute )? ( ( COMMA )? attributes+= attribute )* -> ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* ) )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:4: (attributes+= implicit_attribute )? ( ( COMMA )? attributes+= attribute )*
            {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:14: (attributes+= implicit_attribute )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case AT:
                case BOOLEAN:
                case MINUS:
                case NOT:
                case NUMBER:
                case OPEN_BOX:
                case OPEN_PAREN:
                case UNDERSCORE:
                    {
                    alt6=1;
                    }
                    break;
                case STRING:
                    {
                    int LA6_4 = input.LA(2);

                    if ( (LA6_4==EOF||LA6_4==AND||LA6_4==CLOSE_PAREN||LA6_4==COMMA||(LA6_4 >= DIVIDE && LA6_4 <= EQ)||(LA6_4 >= GT && LA6_4 <= ID)||(LA6_4 >= LT && LA6_4 <= MULTIPLY_EQUALS)||LA6_4==NEQ||LA6_4==OR||(LA6_4 >= PLUS && LA6_4 <= POWER)||LA6_4==QUESTION_MARK||LA6_4==STRING) ) {
                        alt6=1;
                    }
                    else if ( (LA6_4==OPEN_BRACE) ) {
                        int LA6_27 = input.LA(3);

                        if ( (synpred6_RichTea()) ) {
                            alt6=1;
                        }
                    }
                    }
                    break;
                case ID:
                    {
                    int LA6_6 = input.LA(2);

                    if ( (LA6_6==EOF||LA6_6==AND||LA6_6==CLOSE_PAREN||LA6_6==COMMA||(LA6_6 >= DIVIDE && LA6_6 <= EQ)||(LA6_6 >= GT && LA6_6 <= ID)||(LA6_6 >= LT && LA6_6 <= MULTIPLY_EQUALS)||LA6_6==NEQ||(LA6_6 >= OPEN_PAREN && LA6_6 <= POWER)||LA6_6==QUESTION_MARK||LA6_6==STRING) ) {
                        alt6=1;
                    }
                    else if ( (LA6_6==OPEN_BRACE) ) {
                        int LA6_44 = input.LA(3);

                        if ( (synpred6_RichTea()) ) {
                            alt6=1;
                        }
                    }
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:14: attributes+= implicit_attribute
                    {
                    pushFollow(FOLLOW_implicit_attribute_in_attribute_list248);
                    attributes=implicit_attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicit_attribute.add(attributes.getTree());
                    if (list_attributes==null) list_attributes=new ArrayList();
                    list_attributes.add(attributes.getTree());


                    }
                    break;

            }


            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:36: ( ( COMMA )? attributes+= attribute )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    int LA8_3 = input.LA(2);

                    if ( (LA8_3==ID) ) {
                        int LA8_9 = input.LA(3);

                        if ( (synpred8_RichTea()) ) {
                            alt8=1;
                        }


                    }


                }
                else if ( (LA8_0==ID) ) {
                    int LA8_4 = input.LA(2);

                    if ( (LA8_4==ASSIGN||LA8_4==COLON) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:37: ( COMMA )? attributes+= attribute
            	    {
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:37: ( COMMA )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==COMMA) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:37: COMMA
            	            {
            	            COMMA13=(Token)match(input,COMMA,FOLLOW_COMMA_in_attribute_list252); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA13);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_attribute_in_attribute_list257);
            	    attributes=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_attribute.add(attributes.getTree());
            	    if (list_attributes==null) list_attributes=new ArrayList();
            	    list_attributes.add(attributes.getTree());


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // AST REWRITE
            // elements: attributes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: attributes
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_attributes=new RewriteRuleSubtreeStream(adaptor,"token attributes",list_attributes);
            root_0 = (Tree)adaptor.nil();
            // 39:4: -> ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* )
            {
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:39:7: ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES")
                , root_1);

                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:39:20: ( ^( ATTRIBUTE $attributes) )*
                while ( stream_attributes.hasNext() ) {
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:39:20: ^( ATTRIBUTE $attributes)
                    {
                    Tree root_2 = (Tree)adaptor.nil();
                    root_2 = (Tree)adaptor.becomeRoot(
                    (Tree)adaptor.create(ATTRIBUTE, "ATTRIBUTE")
                    , root_2);

                    adaptor.addChild(root_2, stream_attributes.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_attributes.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute_list"


    public static class attribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:42:1: attribute : ID ( COLON | ASSIGN ) ! expression -> ^( NAME ID ) ^( VALUE expression ) ;
    public final RichTeaParser.attribute_return attribute() throws RecognitionException {
        RichTeaParser.attribute_return retval = new RichTeaParser.attribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID14=null;
        Token COLON15=null;
        Token ASSIGN16=null;
        RichTeaParser.expression_return expression17 =null;


        Tree ID14_tree=null;
        Tree COLON15_tree=null;
        Tree ASSIGN16_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:43:2: ( ID ( COLON | ASSIGN ) ! expression -> ^( NAME ID ) ^( VALUE expression ) )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:43:4: ID ( COLON | ASSIGN ) ! expression
            {
            ID14=(Token)match(input,ID,FOLLOW_ID_in_attribute288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID14);


            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:43:7: ( COLON | ASSIGN )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==COLON) ) {
                alt9=1;
            }
            else if ( (LA9_0==ASSIGN) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:43:8: COLON
                    {
                    COLON15=(Token)match(input,COLON,FOLLOW_COLON_in_attribute291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON15);


                    }
                    break;
                case 2 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:43:16: ASSIGN
                    {
                    ASSIGN16=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attribute295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN16);


                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_attribute299);
            expression17=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression17.getTree());

            // AST REWRITE
            // elements: expression, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 44:4: -> ^( NAME ID ) ^( VALUE expression )
            {
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:44:7: ^( NAME ID )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:44:18: ^( VALUE expression )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(VALUE, "VALUE")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class implicit_attribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implicit_attribute"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:47:1: implicit_attribute : expression -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE expression ) ;
    public final RichTeaParser.implicit_attribute_return implicit_attribute() throws RecognitionException {
        RichTeaParser.implicit_attribute_return retval = new RichTeaParser.implicit_attribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        RichTeaParser.expression_return expression18 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:48:2: ( expression -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE expression ) )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:48:4: expression
            {
            pushFollow(FOLLOW_expression_in_implicit_attribute328);
            expression18=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression18.getTree());

            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 49:4: -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE expression )
            {
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:49:7: ^( NAME ID[\"implicitAttribute\"] )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, 
                (Tree)adaptor.create(ID, "implicitAttribute")
                );

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:49:39: ^( VALUE expression )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(VALUE, "VALUE")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "implicit_attribute"


    public static class branch_list_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "branch_list"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:52:1: branch_list : (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )* -> ^( BRANCHES ( ^( BRANCH $branches) )* ) ;
    public final RichTeaParser.branch_list_return branch_list() throws RecognitionException {
        RichTeaParser.branch_list_return retval = new RichTeaParser.branch_list_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token COMMA19=null;
        List list_branches=null;
        RuleReturnScope branches = null;
        Tree COMMA19_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_implicitBranch=new RewriteRuleSubtreeStream(adaptor,"rule implicitBranch");
        RewriteRuleSubtreeStream stream_branch=new RewriteRuleSubtreeStream(adaptor,"rule branch");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:53:2: ( (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )* -> ^( BRANCHES ( ^( BRANCH $branches) )* ) )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:53:4: (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )*
            {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:53:12: (branches+= implicitBranch )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==HASH) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==OPEN_BRACE) ) {
                    alt10=1;
                }
            }
            else if ( (LA10_0==OPEN_BRACE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:53:12: branches+= implicitBranch
                    {
                    pushFollow(FOLLOW_implicitBranch_in_branch_list361);
                    branches=implicitBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicitBranch.add(branches.getTree());
                    if (list_branches==null) list_branches=new ArrayList();
                    list_branches.add(branches.getTree());


                    }
                    break;

            }


            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:53:30: ( ( COMMA )? branches+= branch )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA||(LA12_0 >= HASH && LA12_0 <= ID)||LA12_0==STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:53:31: ( COMMA )? branches+= branch
            	    {
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:53:31: ( COMMA )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==COMMA) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:53:31: COMMA
            	            {
            	            COMMA19=(Token)match(input,COMMA,FOLLOW_COMMA_in_branch_list365); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA19);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_branch_in_branch_list370);
            	    branches=branch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_branch.add(branches.getTree());
            	    if (list_branches==null) list_branches=new ArrayList();
            	    list_branches.add(branches.getTree());


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // AST REWRITE
            // elements: branches
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: branches
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_branches=new RewriteRuleSubtreeStream(adaptor,"token branches",list_branches);
            root_0 = (Tree)adaptor.nil();
            // 54:4: -> ^( BRANCHES ( ^( BRANCH $branches) )* )
            {
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:54:7: ^( BRANCHES ( ^( BRANCH $branches) )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(BRANCHES, "BRANCHES")
                , root_1);

                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:54:18: ( ^( BRANCH $branches) )*
                while ( stream_branches.hasNext() ) {
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:54:18: ^( BRANCH $branches)
                    {
                    Tree root_2 = (Tree)adaptor.nil();
                    root_2 = (Tree)adaptor.becomeRoot(
                    (Tree)adaptor.create(BRANCH, "BRANCH")
                    , root_2);

                    adaptor.addChild(root_2, stream_branches.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_branches.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "branch_list"


    public static class branch_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "branch"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:57:1: branch : ( HASH )? (name= ID |name= STRING ) OPEN_BRACE ( function )* CLOSE_BRACE -> ^( NAME $name) ^( CHILDREN ( function )* ) ;
    public final RichTeaParser.branch_return branch() throws RecognitionException {
        RichTeaParser.branch_return retval = new RichTeaParser.branch_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token name=null;
        Token HASH20=null;
        Token OPEN_BRACE21=null;
        Token CLOSE_BRACE23=null;
        RichTeaParser.function_return function22 =null;


        Tree name_tree=null;
        Tree HASH20_tree=null;
        Tree OPEN_BRACE21_tree=null;
        Tree CLOSE_BRACE23_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:58:2: ( ( HASH )? (name= ID |name= STRING ) OPEN_BRACE ( function )* CLOSE_BRACE -> ^( NAME $name) ^( CHILDREN ( function )* ) )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:58:4: ( HASH )? (name= ID |name= STRING ) OPEN_BRACE ( function )* CLOSE_BRACE
            {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:58:4: ( HASH )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==HASH) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:58:4: HASH
                    {
                    HASH20=(Token)match(input,HASH,FOLLOW_HASH_in_branch401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HASH.add(HASH20);


                    }
                    break;

            }


            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:58:10: (name= ID |name= STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==STRING) ) {
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
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:58:11: name= ID
                    {
                    name=(Token)match(input,ID,FOLLOW_ID_in_branch407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(name);


                    }
                    break;
                case 2 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:58:21: name= STRING
                    {
                    name=(Token)match(input,STRING,FOLLOW_STRING_in_branch413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(name);


                    }
                    break;

            }


            OPEN_BRACE21=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_branch416); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE21);


            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:58:45: ( function )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ID||LA15_0==OPEN_PAREN) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:58:45: function
            	    {
            	    pushFollow(FOLLOW_function_in_branch418);
            	    function22=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function.add(function22.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            CLOSE_BRACE23=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_branch421); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE23);


            // AST REWRITE
            // elements: function, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 59:4: -> ^( NAME $name) ^( CHILDREN ( function )* )
            {
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:59:7: ^( NAME $name)
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:59:21: ^( CHILDREN ( function )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(CHILDREN, "CHILDREN")
                , root_1);

                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:59:32: ( function )*
                while ( stream_function.hasNext() ) {
                    adaptor.addChild(root_1, stream_function.nextTree());

                }
                stream_function.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "branch"


    public static class implicitBranch_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implicitBranch"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:62:1: implicitBranch : ( HASH )? OPEN_BRACE ( function )* CLOSE_BRACE -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function )* ) ;
    public final RichTeaParser.implicitBranch_return implicitBranch() throws RecognitionException {
        RichTeaParser.implicitBranch_return retval = new RichTeaParser.implicitBranch_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token HASH24=null;
        Token OPEN_BRACE25=null;
        Token CLOSE_BRACE27=null;
        RichTeaParser.function_return function26 =null;


        Tree HASH24_tree=null;
        Tree OPEN_BRACE25_tree=null;
        Tree CLOSE_BRACE27_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:63:2: ( ( HASH )? OPEN_BRACE ( function )* CLOSE_BRACE -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function )* ) )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:63:4: ( HASH )? OPEN_BRACE ( function )* CLOSE_BRACE
            {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:63:4: ( HASH )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==HASH) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:63:4: HASH
                    {
                    HASH24=(Token)match(input,HASH,FOLLOW_HASH_in_implicitBranch452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HASH.add(HASH24);


                    }
                    break;

            }


            OPEN_BRACE25=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_implicitBranch455); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE25);


            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:63:21: ( function )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID||LA17_0==OPEN_PAREN) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:63:21: function
            	    {
            	    pushFollow(FOLLOW_function_in_implicitBranch457);
            	    function26=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function.add(function26.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            CLOSE_BRACE27=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_implicitBranch460); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE27);


            // AST REWRITE
            // elements: function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 64:4: -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function )* )
            {
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:64:7: ^( NAME ID[\"implicitBranch\"] )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, 
                (Tree)adaptor.create(ID, "implicitBranch")
                );

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:64:36: ^( CHILDREN ( function )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(CHILDREN, "CHILDREN")
                , root_1);

                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:64:47: ( function )*
                while ( stream_function.hasNext() ) {
                    adaptor.addChild(root_1, stream_function.nextTree());

                }
                stream_function.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "implicitBranch"


    public static class expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:69:1: expression : ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression );
    public final RichTeaParser.expression_return expression() throws RecognitionException {
        RichTeaParser.expression_return retval = new RichTeaParser.expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token QUESTION_MARK29=null;
        Token COLON31=null;
        RichTeaParser.logical_expression_return logical_expression28 =null;

        RichTeaParser.logical_expression_return logical_expression30 =null;

        RichTeaParser.logical_expression_return logical_expression32 =null;

        RichTeaParser.logical_expression_return logical_expression33 =null;


        Tree QUESTION_MARK29_tree=null;
        Tree COLON31_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_logical_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_expression");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:70:2: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:70:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
                    {
                    pushFollow(FOLLOW_logical_expression_in_expression495);
                    logical_expression28=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression28.getTree());

                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:70:23: ( QUESTION_MARK logical_expression COLON logical_expression )
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:70:24: QUESTION_MARK logical_expression COLON logical_expression
                    {
                    QUESTION_MARK29=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_expression498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK29);


                    pushFollow(FOLLOW_logical_expression_in_expression500);
                    logical_expression30=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression30.getTree());

                    COLON31=(Token)match(input,COLON,FOLLOW_COLON_in_expression502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON31);


                    pushFollow(FOLLOW_logical_expression_in_expression504);
                    logical_expression32=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression32.getTree());

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
                    // 70:83: -> ^( TERNARY_OPERATOR ( logical_expression )+ )
                    {
                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:70:86: ^( TERNARY_OPERATOR ( logical_expression )+ )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(TERNARY_OPERATOR, "TERNARY_OPERATOR")
                        , root_1);

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


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:71:4: logical_expression
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_logical_expression_in_expression519);
                    logical_expression33=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression33.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class logical_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_expression"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:74:1: logical_expression : boolean_expression ( OR ^ boolean_expression )* ;
    public final RichTeaParser.logical_expression_return logical_expression() throws RecognitionException {
        RichTeaParser.logical_expression_return retval = new RichTeaParser.logical_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OR35=null;
        RichTeaParser.boolean_expression_return boolean_expression34 =null;

        RichTeaParser.boolean_expression_return boolean_expression36 =null;


        Tree OR35_tree=null;

        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:75:2: ( boolean_expression ( OR ^ boolean_expression )* )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:75:4: boolean_expression ( OR ^ boolean_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_boolean_expression_in_logical_expression531);
            boolean_expression34=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression34.getTree());

            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:75:23: ( OR ^ boolean_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==OR) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:75:24: OR ^ boolean_expression
            	    {
            	    OR35=(Token)match(input,OR,FOLLOW_OR_in_logical_expression534); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR35_tree = 
            	    (Tree)adaptor.create(OR35)
            	    ;
            	    root_0 = (Tree)adaptor.becomeRoot(OR35_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_boolean_expression_in_logical_expression537);
            	    boolean_expression36=boolean_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression36.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_expression"


    public static class boolean_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_expression"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:78:1: boolean_expression : equality_expression ( AND ^ equality_expression )* ;
    public final RichTeaParser.boolean_expression_return boolean_expression() throws RecognitionException {
        RichTeaParser.boolean_expression_return retval = new RichTeaParser.boolean_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token AND38=null;
        RichTeaParser.equality_expression_return equality_expression37 =null;

        RichTeaParser.equality_expression_return equality_expression39 =null;


        Tree AND38_tree=null;

        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:79:2: ( equality_expression ( AND ^ equality_expression )* )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:79:4: equality_expression ( AND ^ equality_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_boolean_expression550);
            equality_expression37=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression37.getTree());

            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:79:24: ( AND ^ equality_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AND) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:79:25: AND ^ equality_expression
            	    {
            	    AND38=(Token)match(input,AND,FOLLOW_AND_in_boolean_expression553); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND38_tree = 
            	    (Tree)adaptor.create(AND38)
            	    ;
            	    root_0 = (Tree)adaptor.becomeRoot(AND38_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_boolean_expression556);
            	    equality_expression39=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression39.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_expression"


    public static class equality_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_expression"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:82:1: equality_expression : relational_expression ( ( EQ | NEQ ) ^ relational_expression )* ;
    public final RichTeaParser.equality_expression_return equality_expression() throws RecognitionException {
        RichTeaParser.equality_expression_return retval = new RichTeaParser.equality_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set41=null;
        RichTeaParser.relational_expression_return relational_expression40 =null;

        RichTeaParser.relational_expression_return relational_expression42 =null;


        Tree set41_tree=null;

        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:83:2: ( relational_expression ( ( EQ | NEQ ) ^ relational_expression )* )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:83:4: relational_expression ( ( EQ | NEQ ) ^ relational_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression570);
            relational_expression40=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression40.getTree());

            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:83:26: ( ( EQ | NEQ ) ^ relational_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==EQ||LA21_0==NEQ) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:83:27: ( EQ | NEQ ) ^ relational_expression
            	    {
            	    set41=(Token)input.LT(1);

            	    set41=(Token)input.LT(1);

            	    if ( input.LA(1)==EQ||input.LA(1)==NEQ ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot(
            	        (Tree)adaptor.create(set41)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression584);
            	    relational_expression42=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression42.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equality_expression"


    public static class relational_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_expression"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:86:1: relational_expression : additive_expression ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )* ;
    public final RichTeaParser.relational_expression_return relational_expression() throws RecognitionException {
        RichTeaParser.relational_expression_return retval = new RichTeaParser.relational_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set44=null;
        RichTeaParser.additive_expression_return additive_expression43 =null;

        RichTeaParser.additive_expression_return additive_expression45 =null;


        Tree set44_tree=null;

        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:87:2: ( additive_expression ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )* )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:87:4: additive_expression ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_relational_expression598);
            additive_expression43=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression43.getTree());

            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:87:24: ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= GT && LA22_0 <= GTEQ)||(LA22_0 >= LT && LA22_0 <= LTEQ)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:87:25: ( LT | LTEQ | GT | GTEQ ) ^ additive_expression
            	    {
            	    set44=(Token)input.LT(1);

            	    set44=(Token)input.LT(1);

            	    if ( (input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot(
            	        (Tree)adaptor.create(set44)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additive_expression_in_relational_expression620);
            	    additive_expression45=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression45.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_expression"


    public static class additive_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additive_expression"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:90:1: additive_expression : multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )* ;
    public final RichTeaParser.additive_expression_return additive_expression() throws RecognitionException {
        RichTeaParser.additive_expression_return retval = new RichTeaParser.additive_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set47=null;
        RichTeaParser.multiplicative_expression_return multiplicative_expression46 =null;

        RichTeaParser.multiplicative_expression_return multiplicative_expression48 =null;


        Tree set47_tree=null;

        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:91:2: ( multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )* )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:91:4: multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression634);
            multiplicative_expression46=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression46.getTree());

            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:91:30: ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0 >= MINUS && LA23_0 <= MINUS_EQUALS)||(LA23_0 >= PLUS && LA23_0 <= PLUS_EQUALS)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:91:31: ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression
            	    {
            	    set47=(Token)input.LT(1);

            	    set47=(Token)input.LT(1);

            	    if ( (input.LA(1) >= MINUS && input.LA(1) <= MINUS_EQUALS)||(input.LA(1) >= PLUS && input.LA(1) <= PLUS_EQUALS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot(
            	        (Tree)adaptor.create(set47)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression656);
            	    multiplicative_expression48=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression48.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additive_expression"


    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicative_expression"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:94:1: multiplicative_expression : power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )* ;
    public final RichTeaParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        RichTeaParser.multiplicative_expression_return retval = new RichTeaParser.multiplicative_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set50=null;
        RichTeaParser.power_expression_return power_expression49 =null;

        RichTeaParser.power_expression_return power_expression51 =null;


        Tree set50_tree=null;

        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:95:2: ( power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )* )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:95:4: power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_power_expression_in_multiplicative_expression670);
            power_expression49=power_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression49.getTree());

            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:95:21: ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= DIVIDE && LA24_0 <= DIVIDE_EQUALS)||(LA24_0 >= MODULUS && LA24_0 <= MULTIPLY_EQUALS)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:95:22: ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression
            	    {
            	    set50=(Token)input.LT(1);

            	    set50=(Token)input.LT(1);

            	    if ( (input.LA(1) >= DIVIDE && input.LA(1) <= DIVIDE_EQUALS)||(input.LA(1) >= MODULUS && input.LA(1) <= MULTIPLY_EQUALS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot(
            	        (Tree)adaptor.create(set50)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_power_expression_in_multiplicative_expression696);
            	    power_expression51=power_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression51.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"


    public static class power_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "power_expression"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:98:1: power_expression : unary_expression ( POWER ^ unary_expression )* ;
    public final RichTeaParser.power_expression_return power_expression() throws RecognitionException {
        RichTeaParser.power_expression_return retval = new RichTeaParser.power_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token POWER53=null;
        RichTeaParser.unary_expression_return unary_expression52 =null;

        RichTeaParser.unary_expression_return unary_expression54 =null;


        Tree POWER53_tree=null;

        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:99:2: ( unary_expression ( POWER ^ unary_expression )* )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:99:4: unary_expression ( POWER ^ unary_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_unary_expression_in_power_expression710);
            unary_expression52=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression52.getTree());

            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:99:21: ( POWER ^ unary_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==POWER) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:99:23: POWER ^ unary_expression
            	    {
            	    POWER53=(Token)match(input,POWER,FOLLOW_POWER_in_power_expression714); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER53_tree = 
            	    (Tree)adaptor.create(POWER53)
            	    ;
            	    root_0 = (Tree)adaptor.becomeRoot(POWER53_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_unary_expression_in_power_expression717);
            	    unary_expression54=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression54.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "power_expression"


    public static class unary_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expression"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:102:1: unary_expression : ( primary_expression | NOT ^ primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) );
    public final RichTeaParser.unary_expression_return unary_expression() throws RecognitionException {
        RichTeaParser.unary_expression_return retval = new RichTeaParser.unary_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token NOT56=null;
        Token MINUS58=null;
        RichTeaParser.primary_expression_return primary_expression55 =null;

        RichTeaParser.primary_expression_return primary_expression57 =null;

        RichTeaParser.primary_expression_return primary_expression59 =null;


        Tree NOT56_tree=null;
        Tree MINUS58_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:103:2: ( primary_expression | NOT ^ primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case AT:
            case BOOLEAN:
            case ID:
            case NUMBER:
            case OPEN_BOX:
            case OPEN_PAREN:
            case STRING:
            case UNDERSCORE:
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
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:103:4: primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_primary_expression_in_unary_expression730);
                    primary_expression55=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression55.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:104:4: NOT ^ primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();


                    NOT56=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression735); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT56_tree = 
                    (Tree)adaptor.create(NOT56)
                    ;
                    root_0 = (Tree)adaptor.becomeRoot(NOT56_tree, root_0);
                    }

                    pushFollow(FOLLOW_primary_expression_in_unary_expression738);
                    primary_expression57=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression57.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:105:4: MINUS primary_expression
                    {
                    MINUS58=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS58);


                    pushFollow(FOLLOW_primary_expression_in_unary_expression745);
                    primary_expression59=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression59.getTree());

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
                    // 105:29: -> ^( NEGATE primary_expression )
                    {
                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:105:32: ^( NEGATE primary_expression )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(NEGATE, "NEGATE")
                        , root_1);

                        adaptor.addChild(root_1, stream_primary_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_expression"


    public static class primary_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expression"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:108:1: primary_expression : ( OPEN_PAREN ! logical_expression CLOSE_PAREN !| data_type );
    public final RichTeaParser.primary_expression_return primary_expression() throws RecognitionException {
        RichTeaParser.primary_expression_return retval = new RichTeaParser.primary_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OPEN_PAREN60=null;
        Token CLOSE_PAREN62=null;
        RichTeaParser.logical_expression_return logical_expression61 =null;

        RichTeaParser.data_type_return data_type63 =null;


        Tree OPEN_PAREN60_tree=null;
        Tree CLOSE_PAREN62_tree=null;

        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:109:2: ( OPEN_PAREN ! logical_expression CLOSE_PAREN !| data_type )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==OPEN_PAREN) ) {
                switch ( input.LA(2) ) {
                case OPEN_PAREN:
                    {
                    int LA27_9 = input.LA(3);

                    if ( (synpred39_RichTea()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 9, input);

                        throw nvae;

                    }
                    }
                    break;
                case NUMBER:
                    {
                    int LA27_10 = input.LA(3);

                    if ( (synpred39_RichTea()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 10, input);

                        throw nvae;

                    }
                    }
                    break;
                case BOOLEAN:
                    {
                    int LA27_11 = input.LA(3);

                    if ( (synpred39_RichTea()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 11, input);

                        throw nvae;

                    }
                    }
                    break;
                case STRING:
                    {
                    int LA27_12 = input.LA(3);

                    if ( (synpred39_RichTea()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 12, input);

                        throw nvae;

                    }
                    }
                    break;
                case UNDERSCORE:
                    {
                    int LA27_13 = input.LA(3);

                    if ( (synpred39_RichTea()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 13, input);

                        throw nvae;

                    }
                    }
                    break;
                case ID:
                    {
                    int LA27_14 = input.LA(3);

                    if ( (synpred39_RichTea()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 14, input);

                        throw nvae;

                    }
                    }
                    break;
                case OPEN_BOX:
                    {
                    int LA27_15 = input.LA(3);

                    if ( (synpred39_RichTea()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 15, input);

                        throw nvae;

                    }
                    }
                    break;
                case AT:
                    {
                    int LA27_16 = input.LA(3);

                    if ( (synpred39_RichTea()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 16, input);

                        throw nvae;

                    }
                    }
                    break;
                case NOT:
                    {
                    int LA27_17 = input.LA(3);

                    if ( (synpred39_RichTea()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 17, input);

                        throw nvae;

                    }
                    }
                    break;
                case MINUS:
                    {
                    int LA27_18 = input.LA(3);

                    if ( (synpred39_RichTea()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 18, input);

                        throw nvae;

                    }
                    }
                    break;
                case CLOSE_PAREN:
                case COMMA:
                case HASH:
                case OPEN_BRACE:
                    {
                    alt27=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA27_0==AT||LA27_0==BOOLEAN||LA27_0==ID||(LA27_0 >= NUMBER && LA27_0 <= OPEN_BOX)||LA27_0==STRING||LA27_0==UNDERSCORE) ) {
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
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:109:4: OPEN_PAREN ! logical_expression CLOSE_PAREN !
                    {
                    root_0 = (Tree)adaptor.nil();


                    OPEN_PAREN60=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_primary_expression765); if (state.failed) return retval;

                    pushFollow(FOLLOW_logical_expression_in_primary_expression768);
                    logical_expression61=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression61.getTree());

                    CLOSE_PAREN62=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_primary_expression770); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:110:4: data_type
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_data_type_in_primary_expression776);
                    data_type63=data_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_type63.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primary_expression"


    public static class data_type_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "data_type"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:113:1: data_type : ( NUMBER | BOOLEAN | STRING | last_returned_value | variable | array | function | executable_function_attribute );
    public final RichTeaParser.data_type_return data_type() throws RecognitionException {
        RichTeaParser.data_type_return retval = new RichTeaParser.data_type_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token NUMBER64=null;
        Token BOOLEAN65=null;
        Token STRING66=null;
        RichTeaParser.last_returned_value_return last_returned_value67 =null;

        RichTeaParser.variable_return variable68 =null;

        RichTeaParser.array_return array69 =null;

        RichTeaParser.function_return function70 =null;

        RichTeaParser.executable_function_attribute_return executable_function_attribute71 =null;


        Tree NUMBER64_tree=null;
        Tree BOOLEAN65_tree=null;
        Tree STRING66_tree=null;

        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:114:2: ( NUMBER | BOOLEAN | STRING | last_returned_value | variable | array | function | executable_function_attribute )
            int alt28=8;
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
            case UNDERSCORE:
                {
                alt28=4;
                }
                break;
            case ID:
                {
                int LA28_5 = input.LA(2);

                if ( (LA28_5==OPEN_PAREN) ) {
                    alt28=7;
                }
                else if ( (LA28_5==EOF||LA28_5==AND||(LA28_5 >= CLOSE_BOX && LA28_5 <= COMMA)||(LA28_5 >= DIVIDE && LA28_5 <= EQ)||(LA28_5 >= GT && LA28_5 <= ID)||(LA28_5 >= LT && LA28_5 <= MULTIPLY_EQUALS)||LA28_5==NEQ||LA28_5==OPEN_BRACE||(LA28_5 >= OR && LA28_5 <= POWER)||LA28_5==QUESTION_MARK||LA28_5==STRING) ) {
                    alt28=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 5, input);

                    throw nvae;

                }
                }
                break;
            case OPEN_BOX:
                {
                alt28=6;
                }
                break;
            case OPEN_PAREN:
                {
                alt28=7;
                }
                break;
            case AT:
                {
                alt28=8;
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
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:114:4: NUMBER
                    {
                    root_0 = (Tree)adaptor.nil();


                    NUMBER64=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_data_type789); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER64_tree = 
                    (Tree)adaptor.create(NUMBER64)
                    ;
                    adaptor.addChild(root_0, NUMBER64_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:115:4: BOOLEAN
                    {
                    root_0 = (Tree)adaptor.nil();


                    BOOLEAN65=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_data_type794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN65_tree = 
                    (Tree)adaptor.create(BOOLEAN65)
                    ;
                    adaptor.addChild(root_0, BOOLEAN65_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:116:4: STRING
                    {
                    root_0 = (Tree)adaptor.nil();


                    STRING66=(Token)match(input,STRING,FOLLOW_STRING_in_data_type799); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING66_tree = 
                    (Tree)adaptor.create(STRING66)
                    ;
                    adaptor.addChild(root_0, STRING66_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:117:4: last_returned_value
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_last_returned_value_in_data_type804);
                    last_returned_value67=last_returned_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, last_returned_value67.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:118:5: variable
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_variable_in_data_type810);
                    variable68=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable68.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:119:4: array
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_data_type815);
                    array69=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array69.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:120:4: function
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_data_type820);
                    function70=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function70.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:121:4: executable_function_attribute
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_executable_function_attribute_in_data_type825);
                    executable_function_attribute71=executable_function_attribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, executable_function_attribute71.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "data_type"


    public static class last_returned_value_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "last_returned_value"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:124:1: last_returned_value : UNDERSCORE -> LAST_RETURNED_VALUE ;
    public final RichTeaParser.last_returned_value_return last_returned_value() throws RecognitionException {
        RichTeaParser.last_returned_value_return retval = new RichTeaParser.last_returned_value_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token UNDERSCORE72=null;

        Tree UNDERSCORE72_tree=null;
        RewriteRuleTokenStream stream_UNDERSCORE=new RewriteRuleTokenStream(adaptor,"token UNDERSCORE");

        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:125:2: ( UNDERSCORE -> LAST_RETURNED_VALUE )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:125:4: UNDERSCORE
            {
            UNDERSCORE72=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_last_returned_value837); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UNDERSCORE.add(UNDERSCORE72);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 126:4: -> LAST_RETURNED_VALUE
            {
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(LAST_RETURNED_VALUE, "LAST_RETURNED_VALUE")
                );

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "last_returned_value"


    public static class variable_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:129:1: variable :elements+= lookup_chain_root ( PERIOD elements+= lookup_chain_element )* -> ^( VARIABLE ( $elements)+ ) ;
    public final RichTeaParser.variable_return variable() throws RecognitionException {
        RichTeaParser.variable_return retval = new RichTeaParser.variable_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token PERIOD73=null;
        List list_elements=null;
        RuleReturnScope elements = null;
        Tree PERIOD73_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_lookup_chain_element=new RewriteRuleSubtreeStream(adaptor,"rule lookup_chain_element");
        RewriteRuleSubtreeStream stream_lookup_chain_root=new RewriteRuleSubtreeStream(adaptor,"rule lookup_chain_root");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:130:2: (elements+= lookup_chain_root ( PERIOD elements+= lookup_chain_element )* -> ^( VARIABLE ( $elements)+ ) )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:130:4: elements+= lookup_chain_root ( PERIOD elements+= lookup_chain_element )*
            {
            pushFollow(FOLLOW_lookup_chain_root_in_variable859);
            elements=lookup_chain_root();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lookup_chain_root.add(elements.getTree());
            if (list_elements==null) list_elements=new ArrayList();
            list_elements.add(elements.getTree());


            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:130:32: ( PERIOD elements+= lookup_chain_element )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==PERIOD) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:130:33: PERIOD elements+= lookup_chain_element
            	    {
            	    PERIOD73=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_variable862); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD73);


            	    pushFollow(FOLLOW_lookup_chain_element_in_variable866);
            	    elements=lookup_chain_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_lookup_chain_element.add(elements.getTree());
            	    if (list_elements==null) list_elements=new ArrayList();
            	    list_elements.add(elements.getTree());


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            // AST REWRITE
            // elements: elements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: elements
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_elements=new RewriteRuleSubtreeStream(adaptor,"token elements",list_elements);
            root_0 = (Tree)adaptor.nil();
            // 131:4: -> ^( VARIABLE ( $elements)+ )
            {
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:131:7: ^( VARIABLE ( $elements)+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(VARIABLE, "VARIABLE")
                , root_1);

                if ( !(stream_elements.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_elements.hasNext() ) {
                    adaptor.addChild(root_1, stream_elements.nextTree());

                }
                stream_elements.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable"


    public static class lookup_chain_root_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lookup_chain_root"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:134:1: lookup_chain_root : ID -> ^( PROPERTY_LOOKUP STRING['\"' + $ID.text + '\"'] ) ;
    public final RichTeaParser.lookup_chain_root_return lookup_chain_root() throws RecognitionException {
        RichTeaParser.lookup_chain_root_return retval = new RichTeaParser.lookup_chain_root_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID74=null;

        Tree ID74_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:135:2: ( ID -> ^( PROPERTY_LOOKUP STRING['\"' + $ID.text + '\"'] ) )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:135:4: ID
            {
            ID74=(Token)match(input,ID,FOLLOW_ID_in_lookup_chain_root892); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID74);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 136:4: -> ^( PROPERTY_LOOKUP STRING['\"' + $ID.text + '\"'] )
            {
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:136:7: ^( PROPERTY_LOOKUP STRING['\"' + $ID.text + '\"'] )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(PROPERTY_LOOKUP, "PROPERTY_LOOKUP")
                , root_1);

                adaptor.addChild(root_1, 
                (Tree)adaptor.create(STRING, '"' + (ID74!=null?ID74.getText():null) + '"')
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lookup_chain_root"


    public static class lookup_chain_element_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lookup_chain_element"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:139:1: lookup_chain_element : ( lookup_chain_root | ID OPEN_PAREN ( expression_list )? CLOSE_PAREN -> ^( NATIVE_METHOD_CALL ^( NAME ID ) ^( ATTRIBUTES ( expression_list )? ) ) | OPEN_BRACE expression CLOSE_BRACE -> ^( PROPERTY_LOOKUP expression ) );
    public final RichTeaParser.lookup_chain_element_return lookup_chain_element() throws RecognitionException {
        RichTeaParser.lookup_chain_element_return retval = new RichTeaParser.lookup_chain_element_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID76=null;
        Token OPEN_PAREN77=null;
        Token CLOSE_PAREN79=null;
        Token OPEN_BRACE80=null;
        Token CLOSE_BRACE82=null;
        RichTeaParser.lookup_chain_root_return lookup_chain_root75 =null;

        RichTeaParser.expression_list_return expression_list78 =null;

        RichTeaParser.expression_return expression81 =null;


        Tree ID76_tree=null;
        Tree OPEN_PAREN77_tree=null;
        Tree CLOSE_PAREN79_tree=null;
        Tree OPEN_BRACE80_tree=null;
        Tree CLOSE_BRACE82_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule expression_list");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:140:2: ( lookup_chain_root | ID OPEN_PAREN ( expression_list )? CLOSE_PAREN -> ^( NATIVE_METHOD_CALL ^( NAME ID ) ^( ATTRIBUTES ( expression_list )? ) ) | OPEN_BRACE expression CLOSE_BRACE -> ^( PROPERTY_LOOKUP expression ) )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ID) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==OPEN_PAREN) ) {
                    alt31=2;
                }
                else if ( (LA31_1==EOF||LA31_1==AND||(LA31_1 >= CLOSE_BOX && LA31_1 <= COMMA)||(LA31_1 >= DIVIDE && LA31_1 <= EQ)||(LA31_1 >= GT && LA31_1 <= ID)||(LA31_1 >= LT && LA31_1 <= MULTIPLY_EQUALS)||LA31_1==NEQ||LA31_1==OPEN_BRACE||(LA31_1 >= OR && LA31_1 <= POWER)||LA31_1==QUESTION_MARK||LA31_1==STRING) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA31_0==OPEN_BRACE) ) {
                alt31=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:140:4: lookup_chain_root
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_lookup_chain_root_in_lookup_chain_element916);
                    lookup_chain_root75=lookup_chain_root();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lookup_chain_root75.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:141:4: ID OPEN_PAREN ( expression_list )? CLOSE_PAREN
                    {
                    ID76=(Token)match(input,ID,FOLLOW_ID_in_lookup_chain_element921); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID76);


                    OPEN_PAREN77=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_lookup_chain_element923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN77);


                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:141:18: ( expression_list )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==AT||LA30_0==BOOLEAN||LA30_0==ID||LA30_0==MINUS||(LA30_0 >= NOT && LA30_0 <= OPEN_BOX)||LA30_0==OPEN_PAREN||LA30_0==STRING||LA30_0==UNDERSCORE) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:141:18: expression_list
                            {
                            pushFollow(FOLLOW_expression_list_in_lookup_chain_element925);
                            expression_list78=expression_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression_list.add(expression_list78.getTree());

                            }
                            break;

                    }


                    CLOSE_PAREN79=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_lookup_chain_element928); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN79);


                    // AST REWRITE
                    // elements: expression_list, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 142:4: -> ^( NATIVE_METHOD_CALL ^( NAME ID ) ^( ATTRIBUTES ( expression_list )? ) )
                    {
                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:142:7: ^( NATIVE_METHOD_CALL ^( NAME ID ) ^( ATTRIBUTES ( expression_list )? ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(NATIVE_METHOD_CALL, "NATIVE_METHOD_CALL")
                        , root_1);

                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:142:28: ^( NAME ID )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(NAME, "NAME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:142:39: ^( ATTRIBUTES ( expression_list )? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES")
                        , root_2);

                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:142:52: ( expression_list )?
                        if ( stream_expression_list.hasNext() ) {
                            adaptor.addChild(root_2, stream_expression_list.nextTree());

                        }
                        stream_expression_list.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:143:4: OPEN_BRACE expression CLOSE_BRACE
                    {
                    OPEN_BRACE80=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_lookup_chain_element955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE80);


                    pushFollow(FOLLOW_expression_in_lookup_chain_element957);
                    expression81=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression81.getTree());

                    CLOSE_BRACE82=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_lookup_chain_element959); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE82);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 144:4: -> ^( PROPERTY_LOOKUP expression )
                    {
                        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:144:7: ^( PROPERTY_LOOKUP expression )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(PROPERTY_LOOKUP, "PROPERTY_LOOKUP")
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lookup_chain_element"


    public static class array_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:147:1: array : OPEN_BOX ( expression_list )? CLOSE_BOX -> ^( ARRAY ( expression_list )? ) ;
    public final RichTeaParser.array_return array() throws RecognitionException {
        RichTeaParser.array_return retval = new RichTeaParser.array_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OPEN_BOX83=null;
        Token CLOSE_BOX85=null;
        RichTeaParser.expression_list_return expression_list84 =null;


        Tree OPEN_BOX83_tree=null;
        Tree CLOSE_BOX85_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BOX=new RewriteRuleTokenStream(adaptor,"token CLOSE_BOX");
        RewriteRuleTokenStream stream_OPEN_BOX=new RewriteRuleTokenStream(adaptor,"token OPEN_BOX");
        RewriteRuleSubtreeStream stream_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule expression_list");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:148:2: ( OPEN_BOX ( expression_list )? CLOSE_BOX -> ^( ARRAY ( expression_list )? ) )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:148:4: OPEN_BOX ( expression_list )? CLOSE_BOX
            {
            OPEN_BOX83=(Token)match(input,OPEN_BOX,FOLLOW_OPEN_BOX_in_array982); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BOX.add(OPEN_BOX83);


            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:148:13: ( expression_list )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==AT||LA32_0==BOOLEAN||LA32_0==ID||LA32_0==MINUS||(LA32_0 >= NOT && LA32_0 <= OPEN_BOX)||LA32_0==OPEN_PAREN||LA32_0==STRING||LA32_0==UNDERSCORE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:148:13: expression_list
                    {
                    pushFollow(FOLLOW_expression_list_in_array984);
                    expression_list84=expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression_list.add(expression_list84.getTree());

                    }
                    break;

            }


            CLOSE_BOX85=(Token)match(input,CLOSE_BOX,FOLLOW_CLOSE_BOX_in_array987); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BOX.add(CLOSE_BOX85);


            // AST REWRITE
            // elements: expression_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 149:4: -> ^( ARRAY ( expression_list )? )
            {
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:149:7: ^( ARRAY ( expression_list )? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:149:15: ( expression_list )?
                if ( stream_expression_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression_list.nextTree());

                }
                stream_expression_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array"


    public static class expression_list_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_list"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:152:1: expression_list : ( expression ( COMMA expression )* ) -> ( expression )* ;
    public final RichTeaParser.expression_list_return expression_list() throws RecognitionException {
        RichTeaParser.expression_list_return retval = new RichTeaParser.expression_list_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token COMMA87=null;
        RichTeaParser.expression_return expression86 =null;

        RichTeaParser.expression_return expression88 =null;


        Tree COMMA87_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:153:2: ( ( expression ( COMMA expression )* ) -> ( expression )* )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:153:4: ( expression ( COMMA expression )* )
            {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:153:4: ( expression ( COMMA expression )* )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:153:5: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expression_list1011);
            expression86=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression86.getTree());

            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:153:16: ( COMMA expression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==COMMA) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:153:17: COMMA expression
            	    {
            	    COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression_list1014); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA87);


            	    pushFollow(FOLLOW_expression_in_expression_list1016);
            	    expression88=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression88.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 154:4: -> ( expression )*
            {
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:154:7: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression_list"


    public static class executable_function_attribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "executable_function_attribute"
    // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:157:1: executable_function_attribute : AT function -> ^( EXECUTABLE_FUNCTION_ATTRIBUTE function ) ;
    public final RichTeaParser.executable_function_attribute_return executable_function_attribute() throws RecognitionException {
        RichTeaParser.executable_function_attribute_return retval = new RichTeaParser.executable_function_attribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token AT89=null;
        RichTeaParser.function_return function90 =null;


        Tree AT89_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:158:2: ( AT function -> ^( EXECUTABLE_FUNCTION_ATTRIBUTE function ) )
            // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:158:5: AT function
            {
            AT89=(Token)match(input,AT,FOLLOW_AT_in_executable_function_attribute1041); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AT.add(AT89);


            pushFollow(FOLLOW_function_in_executable_function_attribute1043);
            function90=function();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function.add(function90.getTree());

            // AST REWRITE
            // elements: function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 159:4: -> ^( EXECUTABLE_FUNCTION_ATTRIBUTE function )
            {
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:159:7: ^( EXECUTABLE_FUNCTION_ATTRIBUTE function )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(EXECUTABLE_FUNCTION_ATTRIBUTE, "EXECUTABLE_FUNCTION_ATTRIBUTE")
                , root_1);

                adaptor.addChild(root_1, stream_function.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "executable_function_attribute"

    // $ANTLR start synpred1_RichTea
    public final void synpred1_RichTea_fragment() throws RecognitionException {
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:27:18: ( function_data )
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:27:18: function_data
        {
        pushFollow(FOLLOW_function_data_in_synpred1_RichTea164);
        function_data();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_RichTea

    // $ANTLR start synpred4_RichTea
    public final void synpred4_RichTea_fragment() throws RecognitionException {
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:29:15: ( function_data )
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:29:15: function_data
        {
        pushFollow(FOLLOW_function_data_in_synpred4_RichTea195);
        function_data();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_RichTea

    // $ANTLR start synpred6_RichTea
    public final void synpred6_RichTea_fragment() throws RecognitionException {
        List list_=null;
       // RuleReturnScope  = null;
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:14: (attributes+= implicit_attribute )
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:14: attributes+= implicit_attribute
        {
        pushFollow(FOLLOW_implicit_attribute_in_synpred6_RichTea248);
        implicit_attribute();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_RichTea

    // $ANTLR start synpred8_RichTea
    public final void synpred8_RichTea_fragment() throws RecognitionException {
        List list_=null;
        //RuleReturnScope  = null;
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:37: ( ( COMMA )? attributes+= attribute )
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:37: ( COMMA )? attributes+= attribute
        {
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:37: ( COMMA )?
        int alt36=2;
        int LA36_0 = input.LA(1);

        if ( (LA36_0==COMMA) ) {
            alt36=1;
        }
        switch (alt36) {
            case 1 :
                // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:38:37: COMMA
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred8_RichTea252); if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_attribute_in_synpred8_RichTea257);
        attribute();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_RichTea

    // $ANTLR start synpred18_RichTea
    public final void synpred18_RichTea_fragment() throws RecognitionException {
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:70:4: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) )
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:70:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
        {
        pushFollow(FOLLOW_logical_expression_in_synpred18_RichTea495);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:70:23: ( QUESTION_MARK logical_expression COLON logical_expression )
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:70:24: QUESTION_MARK logical_expression COLON logical_expression
        {
        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred18_RichTea498); if (state.failed) return ;

        pushFollow(FOLLOW_logical_expression_in_synpred18_RichTea500);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred18_RichTea502); if (state.failed) return ;

        pushFollow(FOLLOW_logical_expression_in_synpred18_RichTea504);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred18_RichTea

    // $ANTLR start synpred39_RichTea
    public final void synpred39_RichTea_fragment() throws RecognitionException {
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:109:4: ( OPEN_PAREN logical_expression CLOSE_PAREN )
        // C:\\Users\\richard.walton\\Documents\\Other\\RichTea\\antlr\\RichTea.g:109:4: OPEN_PAREN logical_expression CLOSE_PAREN
        {
        match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_synpred39_RichTea765); if (state.failed) return ;

        pushFollow(FOLLOW_logical_expression_in_synpred39_RichTea768);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_synpred39_RichTea770); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred39_RichTea

    // Delegated rules

    public final boolean synpred18_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_RichTea_fragment(); // can never throw exception
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
    public final boolean synpred1_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_RichTea_fragment(); // can never throw exception
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
    public final boolean synpred8_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\u008d\uffff";
    static final String DFA18_eofS =
        "\2\uffff\5\41\u0086\uffff";
    static final String DFA18_minS =
        "\2\7\5\4\1\7\1\36\2\7\25\0\12\uffff\7\0\12\uffff\7\0\12\uffff\7"+
        "\0\12\uffff\11\0\12\uffff\35\0";
    static final String DFA18_maxS =
        "\2\74\5\72\1\74\1\61\2\74\25\0\12\uffff\7\0\12\uffff\7\0\12\uffff"+
        "\7\0\12\uffff\11\0\12\uffff\35\0";
    static final String DFA18_acceptS =
        "\40\uffff\1\1\1\2\153\uffff";
    static final String DFA18_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\12\uffff\1\25\1\26\1"+
        "\27\1\30\1\31\1\32\1\33\12\uffff\1\34\1\35\1\36\1\37\1\40\1\41\1"+
        "\42\12\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\51\12\uffff\1\52\1"+
        "\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\12\uffff\1\63\1\64\1\65\1"+
        "\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102"+
        "\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115"+
        "\1\116\1\117}>";
    static final String[] DFA18_transitionS = {
            "\1\10\2\uffff\1\3\23\uffff\1\6\5\uffff\1\12\10\uffff\1\11\1"+
            "\2\1\7\1\uffff\1\1\10\uffff\1\4\1\uffff\1\5",
            "\1\22\2\uffff\1\15\5\uffff\1\30\1\uffff\1\25\12\uffff\1\26"+
            "\1\20\5\uffff\1\24\10\uffff\1\23\1\14\1\21\1\27\1\13\10\uffff"+
            "\1\16\1\uffff\1\17",
            "\1\36\11\uffff\3\41\1\uffff\1\41\1\uffff\2\32\1\35\4\uffff"+
            "\2\34\2\41\3\uffff\2\34\2\33\3\32\3\uffff\1\35\3\uffff\1\41"+
            "\1\uffff\1\37\1\uffff\2\33\1\31\1\uffff\1\40\1\uffff\1\41",
            "\1\57\11\uffff\3\41\1\uffff\1\41\1\uffff\2\53\1\56\4\uffff"+
            "\2\55\2\41\3\uffff\2\55\2\54\3\53\3\uffff\1\56\3\uffff\1\41"+
            "\1\uffff\1\60\1\uffff\2\54\1\52\1\uffff\1\40\1\uffff\1\41",
            "\1\100\11\uffff\3\41\1\uffff\1\41\1\uffff\2\74\1\77\4\uffff"+
            "\2\76\2\41\3\uffff\2\76\2\75\3\74\3\uffff\1\77\3\uffff\1\41"+
            "\1\uffff\1\101\1\uffff\2\75\1\73\1\uffff\1\40\1\uffff\1\41",
            "\1\121\11\uffff\3\41\1\uffff\1\41\1\uffff\2\115\1\120\4\uffff"+
            "\2\117\2\41\3\uffff\2\117\2\116\3\115\3\uffff\1\120\3\uffff"+
            "\1\41\1\uffff\1\122\1\uffff\2\116\1\114\1\uffff\1\40\1\uffff"+
            "\1\41",
            "\1\144\11\uffff\3\41\1\uffff\1\41\1\uffff\2\140\1\143\4\uffff"+
            "\2\142\2\41\3\uffff\2\142\2\141\3\140\3\uffff\1\143\3\uffff"+
            "\1\41\1\135\1\145\1\136\2\141\1\137\1\uffff\1\40\1\uffff\1\41",
            "\1\167\2\uffff\1\162\3\uffff\1\172\17\uffff\1\165\5\uffff\1"+
            "\171\10\uffff\1\170\1\161\1\166\1\uffff\1\160\10\uffff\1\163"+
            "\1\uffff\1\164",
            "\1\173\22\uffff\1\174",
            "\1\u0084\2\uffff\1\177\23\uffff\1\u0082\17\uffff\1\176\1\u0083"+
            "\1\uffff\1\175\10\uffff\1\u0080\1\uffff\1\u0081",
            "\1\u008c\2\uffff\1\u0087\23\uffff\1\u008a\17\uffff\1\u0086"+
            "\1\u008b\1\uffff\1\u0085\10\uffff\1\u0088\1\uffff\1\u0089",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
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
            return "69:1: expression : ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_11 = input.LA(1);

                         
                        int index18_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_11);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA18_12 = input.LA(1);

                         
                        int index18_12 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_12);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA18_13 = input.LA(1);

                         
                        int index18_13 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_13);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA18_14 = input.LA(1);

                         
                        int index18_14 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_14);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA18_15 = input.LA(1);

                         
                        int index18_15 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_15);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA18_16 = input.LA(1);

                         
                        int index18_16 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_16);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA18_17 = input.LA(1);

                         
                        int index18_17 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_17);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA18_18 = input.LA(1);

                         
                        int index18_18 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_18);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA18_19 = input.LA(1);

                         
                        int index18_19 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_19);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA18_20 = input.LA(1);

                         
                        int index18_20 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_20);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA18_21 = input.LA(1);

                         
                        int index18_21 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_21);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA18_22 = input.LA(1);

                         
                        int index18_22 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_22);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA18_23 = input.LA(1);

                         
                        int index18_23 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_23);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA18_24 = input.LA(1);

                         
                        int index18_24 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_24);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA18_25 = input.LA(1);

                         
                        int index18_25 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_25);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA18_26 = input.LA(1);

                         
                        int index18_26 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_26);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA18_27 = input.LA(1);

                         
                        int index18_27 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_27);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA18_28 = input.LA(1);

                         
                        int index18_28 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_28);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA18_29 = input.LA(1);

                         
                        int index18_29 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_29);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA18_30 = input.LA(1);

                         
                        int index18_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_30);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA18_31 = input.LA(1);

                         
                        int index18_31 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_31);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA18_42 = input.LA(1);

                         
                        int index18_42 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_42);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA18_43 = input.LA(1);

                         
                        int index18_43 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_43);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA18_44 = input.LA(1);

                         
                        int index18_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_44);

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA18_45 = input.LA(1);

                         
                        int index18_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_45);

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA18_46 = input.LA(1);

                         
                        int index18_46 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_46);

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA18_47 = input.LA(1);

                         
                        int index18_47 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_47);

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA18_48 = input.LA(1);

                         
                        int index18_48 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_48);

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA18_59 = input.LA(1);

                         
                        int index18_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_59);

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA18_60 = input.LA(1);

                         
                        int index18_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_60);

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA18_61 = input.LA(1);

                         
                        int index18_61 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_61);

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA18_62 = input.LA(1);

                         
                        int index18_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_62);

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA18_63 = input.LA(1);

                         
                        int index18_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_63);

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA18_64 = input.LA(1);

                         
                        int index18_64 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_64);

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA18_65 = input.LA(1);

                         
                        int index18_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_65);

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA18_76 = input.LA(1);

                         
                        int index18_76 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_76);

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA18_77 = input.LA(1);

                         
                        int index18_77 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_77);

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA18_78 = input.LA(1);

                         
                        int index18_78 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_78);

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA18_79 = input.LA(1);

                         
                        int index18_79 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_79);

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA18_80 = input.LA(1);

                         
                        int index18_80 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_80);

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA18_81 = input.LA(1);

                         
                        int index18_81 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_81);

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA18_82 = input.LA(1);

                         
                        int index18_82 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_82);

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA18_93 = input.LA(1);

                         
                        int index18_93 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_93);

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA18_94 = input.LA(1);

                         
                        int index18_94 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_94);

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA18_95 = input.LA(1);

                         
                        int index18_95 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_95);

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA18_96 = input.LA(1);

                         
                        int index18_96 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_96);

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA18_97 = input.LA(1);

                         
                        int index18_97 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_97);

                        if ( s>=0 ) return s;
                        break;

                    case 47 : 
                        int LA18_98 = input.LA(1);

                         
                        int index18_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_98);

                        if ( s>=0 ) return s;
                        break;

                    case 48 : 
                        int LA18_99 = input.LA(1);

                         
                        int index18_99 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_99);

                        if ( s>=0 ) return s;
                        break;

                    case 49 : 
                        int LA18_100 = input.LA(1);

                         
                        int index18_100 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_100);

                        if ( s>=0 ) return s;
                        break;

                    case 50 : 
                        int LA18_101 = input.LA(1);

                         
                        int index18_101 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_101);

                        if ( s>=0 ) return s;
                        break;

                    case 51 : 
                        int LA18_112 = input.LA(1);

                         
                        int index18_112 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_112);

                        if ( s>=0 ) return s;
                        break;

                    case 52 : 
                        int LA18_113 = input.LA(1);

                         
                        int index18_113 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_113);

                        if ( s>=0 ) return s;
                        break;

                    case 53 : 
                        int LA18_114 = input.LA(1);

                         
                        int index18_114 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_114);

                        if ( s>=0 ) return s;
                        break;

                    case 54 : 
                        int LA18_115 = input.LA(1);

                         
                        int index18_115 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_115);

                        if ( s>=0 ) return s;
                        break;

                    case 55 : 
                        int LA18_116 = input.LA(1);

                         
                        int index18_116 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_116);

                        if ( s>=0 ) return s;
                        break;

                    case 56 : 
                        int LA18_117 = input.LA(1);

                         
                        int index18_117 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_117);

                        if ( s>=0 ) return s;
                        break;

                    case 57 : 
                        int LA18_118 = input.LA(1);

                         
                        int index18_118 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_118);

                        if ( s>=0 ) return s;
                        break;

                    case 58 : 
                        int LA18_119 = input.LA(1);

                         
                        int index18_119 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_119);

                        if ( s>=0 ) return s;
                        break;

                    case 59 : 
                        int LA18_120 = input.LA(1);

                         
                        int index18_120 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_120);

                        if ( s>=0 ) return s;
                        break;

                    case 60 : 
                        int LA18_121 = input.LA(1);

                         
                        int index18_121 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_121);

                        if ( s>=0 ) return s;
                        break;

                    case 61 : 
                        int LA18_122 = input.LA(1);

                         
                        int index18_122 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_122);

                        if ( s>=0 ) return s;
                        break;

                    case 62 : 
                        int LA18_123 = input.LA(1);

                         
                        int index18_123 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_123);

                        if ( s>=0 ) return s;
                        break;

                    case 63 : 
                        int LA18_124 = input.LA(1);

                         
                        int index18_124 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_124);

                        if ( s>=0 ) return s;
                        break;

                    case 64 : 
                        int LA18_125 = input.LA(1);

                         
                        int index18_125 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_125);

                        if ( s>=0 ) return s;
                        break;

                    case 65 : 
                        int LA18_126 = input.LA(1);

                         
                        int index18_126 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_126);

                        if ( s>=0 ) return s;
                        break;

                    case 66 : 
                        int LA18_127 = input.LA(1);

                         
                        int index18_127 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_127);

                        if ( s>=0 ) return s;
                        break;

                    case 67 : 
                        int LA18_128 = input.LA(1);

                         
                        int index18_128 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_128);

                        if ( s>=0 ) return s;
                        break;

                    case 68 : 
                        int LA18_129 = input.LA(1);

                         
                        int index18_129 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_129);

                        if ( s>=0 ) return s;
                        break;

                    case 69 : 
                        int LA18_130 = input.LA(1);

                         
                        int index18_130 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_130);

                        if ( s>=0 ) return s;
                        break;

                    case 70 : 
                        int LA18_131 = input.LA(1);

                         
                        int index18_131 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_131);

                        if ( s>=0 ) return s;
                        break;

                    case 71 : 
                        int LA18_132 = input.LA(1);

                         
                        int index18_132 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_132);

                        if ( s>=0 ) return s;
                        break;

                    case 72 : 
                        int LA18_133 = input.LA(1);

                         
                        int index18_133 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_133);

                        if ( s>=0 ) return s;
                        break;

                    case 73 : 
                        int LA18_134 = input.LA(1);

                         
                        int index18_134 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_134);

                        if ( s>=0 ) return s;
                        break;

                    case 74 : 
                        int LA18_135 = input.LA(1);

                         
                        int index18_135 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_135);

                        if ( s>=0 ) return s;
                        break;

                    case 75 : 
                        int LA18_136 = input.LA(1);

                         
                        int index18_136 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_136);

                        if ( s>=0 ) return s;
                        break;

                    case 76 : 
                        int LA18_137 = input.LA(1);

                         
                        int index18_137 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_137);

                        if ( s>=0 ) return s;
                        break;

                    case 77 : 
                        int LA18_138 = input.LA(1);

                         
                        int index18_138 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_138);

                        if ( s>=0 ) return s;
                        break;

                    case 78 : 
                        int LA18_139 = input.LA(1);

                         
                        int index18_139 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_139);

                        if ( s>=0 ) return s;
                        break;

                    case 79 : 
                        int LA18_140 = input.LA(1);

                         
                        int index18_140 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index18_140);

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
 

    public static final BitSet FOLLOW_function_in_program148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function160 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function162 = new BitSet(new long[]{0x1403E01060050480L});
    public static final BitSet FOLLOW_function_data_in_function164 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function167 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function193 = new BitSet(new long[]{0x1403E01060050480L});
    public static final BitSet FOLLOW_function_data_in_function195 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function198 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_list_in_function_data231 = new BitSet(new long[]{0x0401000060040000L});
    public static final BitSet FOLLOW_branch_list_in_function_data233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicit_attribute_in_attribute_list248 = new BitSet(new long[]{0x0000000040040002L});
    public static final BitSet FOLLOW_COMMA_in_attribute_list252 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_attribute_in_attribute_list257 = new BitSet(new long[]{0x0000000040040002L});
    public static final BitSet FOLLOW_ID_in_attribute288 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_COLON_in_attribute291 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_ASSIGN_in_attribute295 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_expression_in_attribute299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_implicit_attribute328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBranch_in_branch_list361 = new BitSet(new long[]{0x0400000060040002L});
    public static final BitSet FOLLOW_COMMA_in_branch_list365 = new BitSet(new long[]{0x0400000060000000L});
    public static final BitSet FOLLOW_branch_in_branch_list370 = new BitSet(new long[]{0x0400000060040002L});
    public static final BitSet FOLLOW_HASH_in_branch401 = new BitSet(new long[]{0x0400000040000000L});
    public static final BitSet FOLLOW_ID_in_branch407 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_STRING_in_branch413 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_branch416 = new BitSet(new long[]{0x0002000040008000L});
    public static final BitSet FOLLOW_function_in_branch418 = new BitSet(new long[]{0x0002000040008000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_branch421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_implicitBranch452 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_implicitBranch455 = new BitSet(new long[]{0x0002000040008000L});
    public static final BitSet FOLLOW_function_in_implicitBranch457 = new BitSet(new long[]{0x0002000040008000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_implicitBranch460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression495 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_expression498 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_logical_expression_in_expression500 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_expression502 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_logical_expression_in_expression504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression531 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_OR_in_logical_expression534 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression537 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression550 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolean_expression553 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression556 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression570 = new BitSet(new long[]{0x0000100000400002L});
    public static final BitSet FOLLOW_set_in_equality_expression573 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression584 = new BitSet(new long[]{0x0000100000400002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression598 = new BitSet(new long[]{0x0000000C18000002L});
    public static final BitSet FOLLOW_set_in_relational_expression601 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression620 = new BitSet(new long[]{0x0000000C18000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression634 = new BitSet(new long[]{0x0030003000000002L});
    public static final BitSet FOLLOW_set_in_additive_expression637 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression656 = new BitSet(new long[]{0x0030003000000002L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression670 = new BitSet(new long[]{0x000001C000300002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression673 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression696 = new BitSet(new long[]{0x000001C000300002L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression710 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_POWER_in_power_expression714 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression717 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expression735 = new BitSet(new long[]{0x1402C00040000480L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression743 = new BitSet(new long[]{0x1402C00040000480L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_primary_expression765 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_logical_expression_in_primary_expression768 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_primary_expression770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_type_in_primary_expression776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_data_type789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_data_type794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_data_type799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_last_returned_value_in_data_type804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_data_type810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_data_type815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_data_type820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executable_function_attribute_in_data_type825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_last_returned_value837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_chain_root_in_variable859 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_variable862 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_lookup_chain_element_in_variable866 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ID_in_lookup_chain_root892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_chain_root_in_lookup_chain_element916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lookup_chain_element921 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_lookup_chain_element923 = new BitSet(new long[]{0x1402E01040010480L});
    public static final BitSet FOLLOW_expression_list_in_lookup_chain_element925 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_lookup_chain_element928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_lookup_chain_element955 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_expression_in_lookup_chain_element957 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_lookup_chain_element959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BOX_in_array982 = new BitSet(new long[]{0x1402E01040004480L});
    public static final BitSet FOLLOW_expression_list_in_array984 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_BOX_in_array987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list1011 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_expression_list1014 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_expression_in_expression_list1016 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_AT_in_executable_function_attribute1041 = new BitSet(new long[]{0x0002000040000000L});
    public static final BitSet FOLLOW_function_in_executable_function_attribute1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_data_in_synpred1_RichTea164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_data_in_synpred4_RichTea195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicit_attribute_in_synpred6_RichTea248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred8_RichTea252 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_attribute_in_synpred8_RichTea257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_synpred18_RichTea495 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred18_RichTea498 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_logical_expression_in_synpred18_RichTea500 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_synpred18_RichTea502 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_logical_expression_in_synpred18_RichTea504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_synpred39_RichTea765 = new BitSet(new long[]{0x1402E01040000480L});
    public static final BitSet FOLLOW_logical_expression_in_synpred39_RichTea768 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_synpred39_RichTea770 = new BitSet(new long[]{0x0000000000000002L});

}