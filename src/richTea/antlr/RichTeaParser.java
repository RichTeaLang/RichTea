// $ANTLR 3.4 D:\\Programming\\RichTea\\antlr\\RichTea.g 2012-06-06 18:31:53
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ASSIGN", "AT", "ATTRIBUTE", "ATTRIBUTES", "BOOLEAN", "BRANCH", "BRANCHES", "CHILDREN", "CLOSE_BOX", "CLOSE_BRACE", "CLOSE_PAREN", "COLON", "COMMA", "COMMENT", "DIVIDE", "DIVIDE_EQUALS", "EQ", "ESC_SEQ", "EXECUTABLE_FUNCTION_ATTRIBUTE", "FLOAT", "FUNCTION", "GT", "GTEQ", "HASH", "ID", "INTEGER", "LETTER", "LT", "LTEQ", "MINUS", "MINUS_EQUALS", "MODULUS", "MULTIPLY", "MULTIPLY_EQUALS", "NAME", "NEGATE", "NEQ", "NOT", "NUMBER", "OPEN_BOX", "OPEN_BRACE", "OPEN_PAREN", "OR", "PERIOD", "PLUS", "PLUS_EQUALS", "POWER", "QUESTION_MARK", "SEMI_COLON", "STRING", "TERNARY_OPERATOR", "VALUE", "VARIABLE", "WHITESPACE"
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
    public static final int LETTER=32;
    public static final int LT=33;
    public static final int LTEQ=34;
    public static final int MINUS=35;
    public static final int MINUS_EQUALS=36;
    public static final int MODULUS=37;
    public static final int MULTIPLY=38;
    public static final int MULTIPLY_EQUALS=39;
    public static final int NAME=40;
    public static final int NEGATE=41;
    public static final int NEQ=42;
    public static final int NOT=43;
    public static final int NUMBER=44;
    public static final int OPEN_BOX=45;
    public static final int OPEN_BRACE=46;
    public static final int OPEN_PAREN=47;
    public static final int OR=48;
    public static final int PERIOD=49;
    public static final int PLUS=50;
    public static final int PLUS_EQUALS=51;
    public static final int POWER=52;
    public static final int QUESTION_MARK=53;
    public static final int SEMI_COLON=54;
    public static final int STRING=55;
    public static final int TERNARY_OPERATOR=56;
    public static final int VALUE=57;
    public static final int VARIABLE=58;
    public static final int WHITESPACE=59;

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
    public String getGrammarFileName() { return "D:\\Programming\\RichTea\\antlr\\RichTea.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:18:1: program : function_scope ;
    public final RichTeaParser.program_return program() throws RecognitionException {
        RichTeaParser.program_return retval = new RichTeaParser.program_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        RichTeaParser.function_scope_return function_scope1 =null;



        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:19:2: ( function_scope )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:19:4: function_scope
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_function_scope_in_program127);
            function_scope1=function_scope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, function_scope1.getTree());

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


    public static class function_scope_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_scope"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:22:1: function_scope : ( function | OPEN_PAREN function_data CLOSE_PAREN ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data ) );
    public final RichTeaParser.function_scope_return function_scope() throws RecognitionException {
        RichTeaParser.function_scope_return retval = new RichTeaParser.function_scope_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OPEN_PAREN3=null;
        Token CLOSE_PAREN5=null;
        Token SEMI_COLON6=null;
        RichTeaParser.function_return function2 =null;

        RichTeaParser.function_data_return function_data4 =null;


        Tree OPEN_PAREN3_tree=null;
        Tree CLOSE_PAREN5_tree=null;
        Tree SEMI_COLON6_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleSubtreeStream stream_function_data=new RewriteRuleSubtreeStream(adaptor,"rule function_data");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:23:2: ( function | OPEN_PAREN function_data CLOSE_PAREN ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==OPEN_PAREN) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:23:4: function
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_function_scope140);
                    function2=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function2.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:24:5: OPEN_PAREN function_data CLOSE_PAREN ( SEMI_COLON )?
                    {
                    OPEN_PAREN3=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function_scope146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN3);


                    pushFollow(FOLLOW_function_data_in_function_scope148);
                    function_data4=function_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_data.add(function_data4.getTree());

                    CLOSE_PAREN5=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function_scope150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN5);


                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:24:42: ( SEMI_COLON )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==SEMI_COLON) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // D:\\Programming\\RichTea\\antlr\\RichTea.g:24:42: SEMI_COLON
                            {
                            SEMI_COLON6=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function_scope152); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON6);


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
                    // 25:4: -> ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data )
                    {
                        // D:\\Programming\\RichTea\\antlr\\RichTea.g:25:7: ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(FUNCTION, "FUNCTION")
                        , root_1);

                        // D:\\Programming\\RichTea\\antlr\\RichTea.g:25:18: ^( NAME ID[\"scope\"] )
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

                        adaptor.addChild(root_1, stream_function_data.nextTree());

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
    // $ANTLR end "function_scope"


    public static class function_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:28:1: function : ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN ) ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ( function_data )? ) ;
    public final RichTeaParser.function_return function() throws RecognitionException {
        RichTeaParser.function_return retval = new RichTeaParser.function_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID7=null;
        Token OPEN_PAREN8=null;
        Token CLOSE_PAREN10=null;
        Token SEMI_COLON11=null;
        RichTeaParser.function_data_return function_data9 =null;


        Tree ID7_tree=null;
        Tree OPEN_PAREN8_tree=null;
        Tree CLOSE_PAREN10_tree=null;
        Tree SEMI_COLON11_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_function_data=new RewriteRuleSubtreeStream(adaptor,"rule function_data");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:29:2: ( ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN ) ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ( function_data )? ) )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:29:4: ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN ) ( SEMI_COLON )?
            {
            ID7=(Token)match(input,ID,FOLLOW_ID_in_function183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID7);


            // D:\\Programming\\RichTea\\antlr\\RichTea.g:29:7: ( OPEN_PAREN ( function_data )? CLOSE_PAREN )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:29:8: OPEN_PAREN ( function_data )? CLOSE_PAREN
            {
            OPEN_PAREN8=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function186); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN8);


            // D:\\Programming\\RichTea\\antlr\\RichTea.g:29:19: ( function_data )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==AT||LA3_0==BOOLEAN||LA3_0==COMMA||(LA3_0 >= HASH && LA3_0 <= ID)||LA3_0==MINUS||(LA3_0 >= NOT && LA3_0 <= OPEN_PAREN)||LA3_0==STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==CLOSE_PAREN) ) {
                int LA3_13 = input.LA(2);

                if ( (synpred3_RichTea()) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:29:19: function_data
                    {
                    pushFollow(FOLLOW_function_data_in_function188);
                    function_data9=function_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_data.add(function_data9.getTree());

                    }
                    break;

            }


            CLOSE_PAREN10=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN10);


            }


            // D:\\Programming\\RichTea\\antlr\\RichTea.g:29:47: ( SEMI_COLON )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMI_COLON) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:29:47: SEMI_COLON
                    {
                    SEMI_COLON11=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function194); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON11);


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
            // 30:4: -> ^( FUNCTION ^( NAME ID ) ( function_data )? )
            {
                // D:\\Programming\\RichTea\\antlr\\RichTea.g:30:7: ^( FUNCTION ^( NAME ID ) ( function_data )? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(FUNCTION, "FUNCTION")
                , root_1);

                // D:\\Programming\\RichTea\\antlr\\RichTea.g:30:18: ^( NAME ID )
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

                // D:\\Programming\\RichTea\\antlr\\RichTea.g:30:29: ( function_data )?
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
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:33:1: function_data : attribute_list branch_list ;
    public final RichTeaParser.function_data_return function_data() throws RecognitionException {
        RichTeaParser.function_data_return retval = new RichTeaParser.function_data_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        RichTeaParser.attribute_list_return attribute_list12 =null;

        RichTeaParser.branch_list_return branch_list13 =null;



        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:34:2: ( attribute_list branch_list )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:34:4: attribute_list branch_list
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_attribute_list_in_function_data224);
            attribute_list12=attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute_list12.getTree());

            pushFollow(FOLLOW_branch_list_in_function_data226);
            branch_list13=branch_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, branch_list13.getTree());

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
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:37:1: attribute_list : (attributes+= implicitAttribute )? ( ( COMMA )? attributes+= attribute )* -> ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* ) ;
    public final RichTeaParser.attribute_list_return attribute_list() throws RecognitionException {
        RichTeaParser.attribute_list_return retval = new RichTeaParser.attribute_list_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token COMMA14=null;
        List list_attributes=null;
        RuleReturnScope attributes = null;
        Tree COMMA14_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_implicitAttribute=new RewriteRuleSubtreeStream(adaptor,"rule implicitAttribute");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:2: ( (attributes+= implicitAttribute )? ( ( COMMA )? attributes+= attribute )* -> ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* ) )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:4: (attributes+= implicitAttribute )? ( ( COMMA )? attributes+= attribute )*
            {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:14: (attributes+= implicitAttribute )?
            int alt5=2;
            switch ( input.LA(1) ) {
                case AT:
                case BOOLEAN:
                case MINUS:
                case NOT:
                case NUMBER:
                case OPEN_BOX:
                case OPEN_PAREN:
                    {
                    alt5=1;
                    }
                    break;
                case STRING:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (LA5_3==EOF||LA5_3==AND||LA5_3==CLOSE_PAREN||LA5_3==COMMA||(LA5_3 >= DIVIDE && LA5_3 <= EQ)||(LA5_3 >= GT && LA5_3 <= ID)||(LA5_3 >= LT && LA5_3 <= MULTIPLY_EQUALS)||LA5_3==NEQ||LA5_3==OR||(LA5_3 >= PLUS && LA5_3 <= QUESTION_MARK)||LA5_3==STRING) ) {
                        alt5=1;
                    }
                    else if ( (LA5_3==OPEN_BRACE) ) {
                        int LA5_26 = input.LA(3);

                        if ( (synpred5_RichTea()) ) {
                            alt5=1;
                        }
                    }
                    }
                    break;
                case ID:
                    {
                    int LA5_4 = input.LA(2);

                    if ( (LA5_4==EOF||LA5_4==AND||LA5_4==CLOSE_PAREN||LA5_4==COMMA||(LA5_4 >= DIVIDE && LA5_4 <= EQ)||(LA5_4 >= GT && LA5_4 <= ID)||(LA5_4 >= LT && LA5_4 <= MULTIPLY_EQUALS)||LA5_4==NEQ||(LA5_4 >= OPEN_PAREN && LA5_4 <= QUESTION_MARK)||LA5_4==STRING) ) {
                        alt5=1;
                    }
                    else if ( (LA5_4==OPEN_BRACE) ) {
                        int LA5_43 = input.LA(3);

                        if ( (synpred5_RichTea()) ) {
                            alt5=1;
                        }
                    }
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:14: attributes+= implicitAttribute
                    {
                    pushFollow(FOLLOW_implicitAttribute_in_attribute_list241);
                    attributes=implicitAttribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicitAttribute.add(attributes.getTree());
                    if (list_attributes==null) list_attributes=new ArrayList();
                    list_attributes.add(attributes.getTree());


                    }
                    break;

            }


            // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:35: ( ( COMMA )? attributes+= attribute )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    int LA7_3 = input.LA(2);

                    if ( (LA7_3==ID) ) {
                        int LA7_9 = input.LA(3);

                        if ( (synpred7_RichTea()) ) {
                            alt7=1;
                        }


                    }


                }
                else if ( (LA7_0==ID) ) {
                    int LA7_4 = input.LA(2);

                    if ( (LA7_4==ASSIGN||LA7_4==COLON) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:36: ( COMMA )? attributes+= attribute
            	    {
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:36: ( COMMA )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==COMMA) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:36: COMMA
            	            {
            	            COMMA14=(Token)match(input,COMMA,FOLLOW_COMMA_in_attribute_list245); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA14);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_attribute_in_attribute_list250);
            	    attributes=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_attribute.add(attributes.getTree());
            	    if (list_attributes==null) list_attributes=new ArrayList();
            	    list_attributes.add(attributes.getTree());


            	    }
            	    break;

            	default :
            	    break loop7;
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
                // D:\\Programming\\RichTea\\antlr\\RichTea.g:39:7: ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES")
                , root_1);

                // D:\\Programming\\RichTea\\antlr\\RichTea.g:39:20: ( ^( ATTRIBUTE $attributes) )*
                while ( stream_attributes.hasNext() ) {
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:39:20: ^( ATTRIBUTE $attributes)
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
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:42:1: attribute : ID ( COLON | ASSIGN ) ! expression -> ^( NAME ID ) ^( VALUE expression ) ;
    public final RichTeaParser.attribute_return attribute() throws RecognitionException {
        RichTeaParser.attribute_return retval = new RichTeaParser.attribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID15=null;
        Token COLON16=null;
        Token ASSIGN17=null;
        RichTeaParser.expression_return expression18 =null;


        Tree ID15_tree=null;
        Tree COLON16_tree=null;
        Tree ASSIGN17_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:43:2: ( ID ( COLON | ASSIGN ) ! expression -> ^( NAME ID ) ^( VALUE expression ) )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:43:4: ID ( COLON | ASSIGN ) ! expression
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_attribute281); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID15);


            // D:\\Programming\\RichTea\\antlr\\RichTea.g:43:7: ( COLON | ASSIGN )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==COLON) ) {
                alt8=1;
            }
            else if ( (LA8_0==ASSIGN) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:43:8: COLON
                    {
                    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_attribute284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON16);


                    }
                    break;
                case 2 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:43:16: ASSIGN
                    {
                    ASSIGN17=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attribute288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN17);


                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_attribute292);
            expression18=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression18.getTree());

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
                // D:\\Programming\\RichTea\\antlr\\RichTea.g:44:7: ^( NAME ID )
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

                // D:\\Programming\\RichTea\\antlr\\RichTea.g:44:18: ^( VALUE expression )
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


    public static class implicitAttribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implicitAttribute"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:47:1: implicitAttribute : expression -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE expression ) ;
    public final RichTeaParser.implicitAttribute_return implicitAttribute() throws RecognitionException {
        RichTeaParser.implicitAttribute_return retval = new RichTeaParser.implicitAttribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        RichTeaParser.expression_return expression19 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:48:2: ( expression -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE expression ) )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:48:4: expression
            {
            pushFollow(FOLLOW_expression_in_implicitAttribute321);
            expression19=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression19.getTree());

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
                // D:\\Programming\\RichTea\\antlr\\RichTea.g:49:7: ^( NAME ID[\"implicitAttribute\"] )
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

                // D:\\Programming\\RichTea\\antlr\\RichTea.g:49:39: ^( VALUE expression )
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
    // $ANTLR end "implicitAttribute"


    public static class branch_list_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "branch_list"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:52:1: branch_list : (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )* -> ^( BRANCHES ( ^( BRANCH $branches) )* ) ;
    public final RichTeaParser.branch_list_return branch_list() throws RecognitionException {
        RichTeaParser.branch_list_return retval = new RichTeaParser.branch_list_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token COMMA20=null;
        List list_branches=null;
        RuleReturnScope branches = null;
        Tree COMMA20_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_implicitBranch=new RewriteRuleSubtreeStream(adaptor,"rule implicitBranch");
        RewriteRuleSubtreeStream stream_branch=new RewriteRuleSubtreeStream(adaptor,"rule branch");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:53:2: ( (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )* -> ^( BRANCHES ( ^( BRANCH $branches) )* ) )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:53:4: (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )*
            {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:53:12: (branches+= implicitBranch )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==HASH) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==OPEN_BRACE) ) {
                    alt9=1;
                }
            }
            else if ( (LA9_0==OPEN_BRACE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:53:12: branches+= implicitBranch
                    {
                    pushFollow(FOLLOW_implicitBranch_in_branch_list354);
                    branches=implicitBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicitBranch.add(branches.getTree());
                    if (list_branches==null) list_branches=new ArrayList();
                    list_branches.add(branches.getTree());


                    }
                    break;

            }


            // D:\\Programming\\RichTea\\antlr\\RichTea.g:53:30: ( ( COMMA )? branches+= branch )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA||(LA11_0 >= HASH && LA11_0 <= ID)||LA11_0==STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:53:31: ( COMMA )? branches+= branch
            	    {
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:53:31: ( COMMA )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==COMMA) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // D:\\Programming\\RichTea\\antlr\\RichTea.g:53:31: COMMA
            	            {
            	            COMMA20=(Token)match(input,COMMA,FOLLOW_COMMA_in_branch_list358); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA20);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_branch_in_branch_list363);
            	    branches=branch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_branch.add(branches.getTree());
            	    if (list_branches==null) list_branches=new ArrayList();
            	    list_branches.add(branches.getTree());


            	    }
            	    break;

            	default :
            	    break loop11;
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
                // D:\\Programming\\RichTea\\antlr\\RichTea.g:54:7: ^( BRANCHES ( ^( BRANCH $branches) )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(BRANCHES, "BRANCHES")
                , root_1);

                // D:\\Programming\\RichTea\\antlr\\RichTea.g:54:18: ( ^( BRANCH $branches) )*
                while ( stream_branches.hasNext() ) {
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:54:18: ^( BRANCH $branches)
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
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:57:1: branch : ( HASH )? (name= ID |name= STRING ) OPEN_BRACE ( function_scope )* CLOSE_BRACE -> ^( NAME $name) ^( CHILDREN ( function_scope )* ) ;
    public final RichTeaParser.branch_return branch() throws RecognitionException {
        RichTeaParser.branch_return retval = new RichTeaParser.branch_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token name=null;
        Token HASH21=null;
        Token OPEN_BRACE22=null;
        Token CLOSE_BRACE24=null;
        RichTeaParser.function_scope_return function_scope23 =null;


        Tree name_tree=null;
        Tree HASH21_tree=null;
        Tree OPEN_BRACE22_tree=null;
        Tree CLOSE_BRACE24_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_function_scope=new RewriteRuleSubtreeStream(adaptor,"rule function_scope");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:58:2: ( ( HASH )? (name= ID |name= STRING ) OPEN_BRACE ( function_scope )* CLOSE_BRACE -> ^( NAME $name) ^( CHILDREN ( function_scope )* ) )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:58:4: ( HASH )? (name= ID |name= STRING ) OPEN_BRACE ( function_scope )* CLOSE_BRACE
            {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:58:4: ( HASH )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==HASH) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:58:4: HASH
                    {
                    HASH21=(Token)match(input,HASH,FOLLOW_HASH_in_branch395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HASH.add(HASH21);


                    }
                    break;

            }


            // D:\\Programming\\RichTea\\antlr\\RichTea.g:58:10: (name= ID |name= STRING )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==STRING) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:58:11: name= ID
                    {
                    name=(Token)match(input,ID,FOLLOW_ID_in_branch401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(name);


                    }
                    break;
                case 2 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:58:21: name= STRING
                    {
                    name=(Token)match(input,STRING,FOLLOW_STRING_in_branch407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(name);


                    }
                    break;

            }


            OPEN_BRACE22=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_branch410); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE22);


            // D:\\Programming\\RichTea\\antlr\\RichTea.g:58:45: ( function_scope )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID||LA14_0==OPEN_PAREN) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:58:45: function_scope
            	    {
            	    pushFollow(FOLLOW_function_scope_in_branch412);
            	    function_scope23=function_scope();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_scope.add(function_scope23.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            CLOSE_BRACE24=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_branch415); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE24);


            // AST REWRITE
            // elements: name, function_scope
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
            // 59:4: -> ^( NAME $name) ^( CHILDREN ( function_scope )* )
            {
                // D:\\Programming\\RichTea\\antlr\\RichTea.g:59:7: ^( NAME $name)
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Programming\\RichTea\\antlr\\RichTea.g:59:21: ^( CHILDREN ( function_scope )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(CHILDREN, "CHILDREN")
                , root_1);

                // D:\\Programming\\RichTea\\antlr\\RichTea.g:59:32: ( function_scope )*
                while ( stream_function_scope.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_scope.nextTree());

                }
                stream_function_scope.reset();

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
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:62:1: implicitBranch : ( HASH )? OPEN_BRACE ( function_scope )* CLOSE_BRACE -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function_scope )* ) ;
    public final RichTeaParser.implicitBranch_return implicitBranch() throws RecognitionException {
        RichTeaParser.implicitBranch_return retval = new RichTeaParser.implicitBranch_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token HASH25=null;
        Token OPEN_BRACE26=null;
        Token CLOSE_BRACE28=null;
        RichTeaParser.function_scope_return function_scope27 =null;


        Tree HASH25_tree=null;
        Tree OPEN_BRACE26_tree=null;
        Tree CLOSE_BRACE28_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_function_scope=new RewriteRuleSubtreeStream(adaptor,"rule function_scope");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:63:2: ( ( HASH )? OPEN_BRACE ( function_scope )* CLOSE_BRACE -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function_scope )* ) )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:63:4: ( HASH )? OPEN_BRACE ( function_scope )* CLOSE_BRACE
            {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:63:4: ( HASH )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==HASH) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:63:4: HASH
                    {
                    HASH25=(Token)match(input,HASH,FOLLOW_HASH_in_implicitBranch446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HASH.add(HASH25);


                    }
                    break;

            }


            OPEN_BRACE26=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_implicitBranch449); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE26);


            // D:\\Programming\\RichTea\\antlr\\RichTea.g:63:21: ( function_scope )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ID||LA16_0==OPEN_PAREN) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:63:21: function_scope
            	    {
            	    pushFollow(FOLLOW_function_scope_in_implicitBranch451);
            	    function_scope27=function_scope();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_scope.add(function_scope27.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            CLOSE_BRACE28=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_implicitBranch454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE28);


            // AST REWRITE
            // elements: function_scope
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 64:4: -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function_scope )* )
            {
                // D:\\Programming\\RichTea\\antlr\\RichTea.g:64:7: ^( NAME ID[\"implicitBranch\"] )
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

                // D:\\Programming\\RichTea\\antlr\\RichTea.g:64:36: ^( CHILDREN ( function_scope )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(CHILDREN, "CHILDREN")
                , root_1);

                // D:\\Programming\\RichTea\\antlr\\RichTea.g:64:47: ( function_scope )*
                while ( stream_function_scope.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_scope.nextTree());

                }
                stream_function_scope.reset();

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
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:69:1: expression : ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression );
    public final RichTeaParser.expression_return expression() throws RecognitionException {
        RichTeaParser.expression_return retval = new RichTeaParser.expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token QUESTION_MARK30=null;
        Token COLON32=null;
        RichTeaParser.logical_expression_return logical_expression29 =null;

        RichTeaParser.logical_expression_return logical_expression31 =null;

        RichTeaParser.logical_expression_return logical_expression33 =null;

        RichTeaParser.logical_expression_return logical_expression34 =null;


        Tree QUESTION_MARK30_tree=null;
        Tree COLON32_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_logical_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_expression");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:70:2: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:70:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
                    {
                    pushFollow(FOLLOW_logical_expression_in_expression489);
                    logical_expression29=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression29.getTree());

                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:70:23: ( QUESTION_MARK logical_expression COLON logical_expression )
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:70:24: QUESTION_MARK logical_expression COLON logical_expression
                    {
                    QUESTION_MARK30=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_expression492); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK30);


                    pushFollow(FOLLOW_logical_expression_in_expression494);
                    logical_expression31=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression31.getTree());

                    COLON32=(Token)match(input,COLON,FOLLOW_COLON_in_expression496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON32);


                    pushFollow(FOLLOW_logical_expression_in_expression498);
                    logical_expression33=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression33.getTree());

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
                        // D:\\Programming\\RichTea\\antlr\\RichTea.g:70:86: ^( TERNARY_OPERATOR ( logical_expression )+ )
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
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:71:4: logical_expression
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_logical_expression_in_expression513);
                    logical_expression34=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression34.getTree());

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
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:74:1: logical_expression : boolean_expression ( OR ^ boolean_expression )* ;
    public final RichTeaParser.logical_expression_return logical_expression() throws RecognitionException {
        RichTeaParser.logical_expression_return retval = new RichTeaParser.logical_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OR36=null;
        RichTeaParser.boolean_expression_return boolean_expression35 =null;

        RichTeaParser.boolean_expression_return boolean_expression37 =null;


        Tree OR36_tree=null;

        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:75:2: ( boolean_expression ( OR ^ boolean_expression )* )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:75:4: boolean_expression ( OR ^ boolean_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_boolean_expression_in_logical_expression525);
            boolean_expression35=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression35.getTree());

            // D:\\Programming\\RichTea\\antlr\\RichTea.g:75:23: ( OR ^ boolean_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==OR) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:75:24: OR ^ boolean_expression
            	    {
            	    OR36=(Token)match(input,OR,FOLLOW_OR_in_logical_expression528); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR36_tree = 
            	    (Tree)adaptor.create(OR36)
            	    ;
            	    root_0 = (Tree)adaptor.becomeRoot(OR36_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_boolean_expression_in_logical_expression531);
            	    boolean_expression37=boolean_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression37.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:78:1: boolean_expression : equality_expression ( AND ^ equality_expression )* ;
    public final RichTeaParser.boolean_expression_return boolean_expression() throws RecognitionException {
        RichTeaParser.boolean_expression_return retval = new RichTeaParser.boolean_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token AND39=null;
        RichTeaParser.equality_expression_return equality_expression38 =null;

        RichTeaParser.equality_expression_return equality_expression40 =null;


        Tree AND39_tree=null;

        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:79:2: ( equality_expression ( AND ^ equality_expression )* )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:79:4: equality_expression ( AND ^ equality_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_boolean_expression544);
            equality_expression38=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression38.getTree());

            // D:\\Programming\\RichTea\\antlr\\RichTea.g:79:24: ( AND ^ equality_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==AND) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:79:25: AND ^ equality_expression
            	    {
            	    AND39=(Token)match(input,AND,FOLLOW_AND_in_boolean_expression547); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND39_tree = 
            	    (Tree)adaptor.create(AND39)
            	    ;
            	    root_0 = (Tree)adaptor.becomeRoot(AND39_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_boolean_expression550);
            	    equality_expression40=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression40.getTree());

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
    // $ANTLR end "boolean_expression"


    public static class equality_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_expression"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:82:1: equality_expression : relational_expression ( ( EQ | NEQ ) ^ relational_expression )* ;
    public final RichTeaParser.equality_expression_return equality_expression() throws RecognitionException {
        RichTeaParser.equality_expression_return retval = new RichTeaParser.equality_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set42=null;
        RichTeaParser.relational_expression_return relational_expression41 =null;

        RichTeaParser.relational_expression_return relational_expression43 =null;


        Tree set42_tree=null;

        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:83:2: ( relational_expression ( ( EQ | NEQ ) ^ relational_expression )* )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:83:4: relational_expression ( ( EQ | NEQ ) ^ relational_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression564);
            relational_expression41=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression41.getTree());

            // D:\\Programming\\RichTea\\antlr\\RichTea.g:83:26: ( ( EQ | NEQ ) ^ relational_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EQ||LA20_0==NEQ) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:83:27: ( EQ | NEQ ) ^ relational_expression
            	    {
            	    set42=(Token)input.LT(1);

            	    set42=(Token)input.LT(1);

            	    if ( input.LA(1)==EQ||input.LA(1)==NEQ ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot(
            	        (Tree)adaptor.create(set42)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression578);
            	    relational_expression43=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression43.getTree());

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
    // $ANTLR end "equality_expression"


    public static class relational_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_expression"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:86:1: relational_expression : additive_expression ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )* ;
    public final RichTeaParser.relational_expression_return relational_expression() throws RecognitionException {
        RichTeaParser.relational_expression_return retval = new RichTeaParser.relational_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set45=null;
        RichTeaParser.additive_expression_return additive_expression44 =null;

        RichTeaParser.additive_expression_return additive_expression46 =null;


        Tree set45_tree=null;

        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:87:2: ( additive_expression ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )* )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:87:4: additive_expression ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_relational_expression592);
            additive_expression44=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression44.getTree());

            // D:\\Programming\\RichTea\\antlr\\RichTea.g:87:24: ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= GT && LA21_0 <= GTEQ)||(LA21_0 >= LT && LA21_0 <= LTEQ)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:87:25: ( LT | LTEQ | GT | GTEQ ) ^ additive_expression
            	    {
            	    set45=(Token)input.LT(1);

            	    set45=(Token)input.LT(1);

            	    if ( (input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot(
            	        (Tree)adaptor.create(set45)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additive_expression_in_relational_expression614);
            	    additive_expression46=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression46.getTree());

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
    // $ANTLR end "relational_expression"


    public static class additive_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additive_expression"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:90:1: additive_expression : multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )* ;
    public final RichTeaParser.additive_expression_return additive_expression() throws RecognitionException {
        RichTeaParser.additive_expression_return retval = new RichTeaParser.additive_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set48=null;
        RichTeaParser.multiplicative_expression_return multiplicative_expression47 =null;

        RichTeaParser.multiplicative_expression_return multiplicative_expression49 =null;


        Tree set48_tree=null;

        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:91:2: ( multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )* )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:91:4: multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression628);
            multiplicative_expression47=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression47.getTree());

            // D:\\Programming\\RichTea\\antlr\\RichTea.g:91:30: ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= MINUS && LA22_0 <= MINUS_EQUALS)||(LA22_0 >= PLUS && LA22_0 <= PLUS_EQUALS)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:91:31: ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression
            	    {
            	    set48=(Token)input.LT(1);

            	    set48=(Token)input.LT(1);

            	    if ( (input.LA(1) >= MINUS && input.LA(1) <= MINUS_EQUALS)||(input.LA(1) >= PLUS && input.LA(1) <= PLUS_EQUALS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot(
            	        (Tree)adaptor.create(set48)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression650);
            	    multiplicative_expression49=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression49.getTree());

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
    // $ANTLR end "additive_expression"


    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicative_expression"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:94:1: multiplicative_expression : power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )* ;
    public final RichTeaParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        RichTeaParser.multiplicative_expression_return retval = new RichTeaParser.multiplicative_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set51=null;
        RichTeaParser.power_expression_return power_expression50 =null;

        RichTeaParser.power_expression_return power_expression52 =null;


        Tree set51_tree=null;

        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:95:2: ( power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )* )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:95:4: power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_power_expression_in_multiplicative_expression664);
            power_expression50=power_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression50.getTree());

            // D:\\Programming\\RichTea\\antlr\\RichTea.g:95:21: ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0 >= DIVIDE && LA23_0 <= DIVIDE_EQUALS)||(LA23_0 >= MODULUS && LA23_0 <= MULTIPLY_EQUALS)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:95:22: ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression
            	    {
            	    set51=(Token)input.LT(1);

            	    set51=(Token)input.LT(1);

            	    if ( (input.LA(1) >= DIVIDE && input.LA(1) <= DIVIDE_EQUALS)||(input.LA(1) >= MODULUS && input.LA(1) <= MULTIPLY_EQUALS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot(
            	        (Tree)adaptor.create(set51)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_power_expression_in_multiplicative_expression690);
            	    power_expression52=power_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression52.getTree());

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
    // $ANTLR end "multiplicative_expression"


    public static class power_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "power_expression"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:98:1: power_expression : unary_expression ( POWER ^ unary_expression )* ;
    public final RichTeaParser.power_expression_return power_expression() throws RecognitionException {
        RichTeaParser.power_expression_return retval = new RichTeaParser.power_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token POWER54=null;
        RichTeaParser.unary_expression_return unary_expression53 =null;

        RichTeaParser.unary_expression_return unary_expression55 =null;


        Tree POWER54_tree=null;

        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:99:2: ( unary_expression ( POWER ^ unary_expression )* )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:99:4: unary_expression ( POWER ^ unary_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_unary_expression_in_power_expression704);
            unary_expression53=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression53.getTree());

            // D:\\Programming\\RichTea\\antlr\\RichTea.g:99:21: ( POWER ^ unary_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==POWER) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:99:23: POWER ^ unary_expression
            	    {
            	    POWER54=(Token)match(input,POWER,FOLLOW_POWER_in_power_expression708); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER54_tree = 
            	    (Tree)adaptor.create(POWER54)
            	    ;
            	    root_0 = (Tree)adaptor.becomeRoot(POWER54_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_unary_expression_in_power_expression711);
            	    unary_expression55=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression55.getTree());

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
    // $ANTLR end "power_expression"


    public static class unary_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expression"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:102:1: unary_expression : ( primary_expression | NOT ^ primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) );
    public final RichTeaParser.unary_expression_return unary_expression() throws RecognitionException {
        RichTeaParser.unary_expression_return retval = new RichTeaParser.unary_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token NOT57=null;
        Token MINUS59=null;
        RichTeaParser.primary_expression_return primary_expression56 =null;

        RichTeaParser.primary_expression_return primary_expression58 =null;

        RichTeaParser.primary_expression_return primary_expression60 =null;


        Tree NOT57_tree=null;
        Tree MINUS59_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:103:2: ( primary_expression | NOT ^ primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case AT:
            case BOOLEAN:
            case ID:
            case NUMBER:
            case OPEN_BOX:
            case OPEN_PAREN:
            case STRING:
                {
                alt25=1;
                }
                break;
            case NOT:
                {
                alt25=2;
                }
                break;
            case MINUS:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:103:4: primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_primary_expression_in_unary_expression724);
                    primary_expression56=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression56.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:104:4: NOT ^ primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();


                    NOT57=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression729); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT57_tree = 
                    (Tree)adaptor.create(NOT57)
                    ;
                    root_0 = (Tree)adaptor.becomeRoot(NOT57_tree, root_0);
                    }

                    pushFollow(FOLLOW_primary_expression_in_unary_expression732);
                    primary_expression58=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression58.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:105:4: MINUS primary_expression
                    {
                    MINUS59=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS59);


                    pushFollow(FOLLOW_primary_expression_in_unary_expression739);
                    primary_expression60=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression60.getTree());

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
                        // D:\\Programming\\RichTea\\antlr\\RichTea.g:105:32: ^( NEGATE primary_expression )
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
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:108:1: primary_expression : ( data_type | OPEN_PAREN ! logical_expression CLOSE_PAREN !);
    public final RichTeaParser.primary_expression_return primary_expression() throws RecognitionException {
        RichTeaParser.primary_expression_return retval = new RichTeaParser.primary_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OPEN_PAREN62=null;
        Token CLOSE_PAREN64=null;
        RichTeaParser.data_type_return data_type61 =null;

        RichTeaParser.logical_expression_return logical_expression63 =null;


        Tree OPEN_PAREN62_tree=null;
        Tree CLOSE_PAREN64_tree=null;

        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:109:2: ( data_type | OPEN_PAREN ! logical_expression CLOSE_PAREN !)
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==AT||LA26_0==BOOLEAN||LA26_0==ID||(LA26_0 >= NUMBER && LA26_0 <= OPEN_BOX)||LA26_0==STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==OPEN_PAREN) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:109:4: data_type
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_data_type_in_primary_expression759);
                    data_type61=data_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_type61.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:110:4: OPEN_PAREN ! logical_expression CLOSE_PAREN !
                    {
                    root_0 = (Tree)adaptor.nil();


                    OPEN_PAREN62=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_primary_expression764); if (state.failed) return retval;

                    pushFollow(FOLLOW_logical_expression_in_primary_expression767);
                    logical_expression63=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression63.getTree());

                    CLOSE_PAREN64=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_primary_expression769); if (state.failed) return retval;

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
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:113:1: data_type : ( NUMBER | BOOLEAN | STRING | variable | array | function | executable_function_attribute );
    public final RichTeaParser.data_type_return data_type() throws RecognitionException {
        RichTeaParser.data_type_return retval = new RichTeaParser.data_type_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token NUMBER65=null;
        Token BOOLEAN66=null;
        Token STRING67=null;
        RichTeaParser.variable_return variable68 =null;

        RichTeaParser.array_return array69 =null;

        RichTeaParser.function_return function70 =null;

        RichTeaParser.executable_function_attribute_return executable_function_attribute71 =null;


        Tree NUMBER65_tree=null;
        Tree BOOLEAN66_tree=null;
        Tree STRING67_tree=null;

        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:114:2: ( NUMBER | BOOLEAN | STRING | variable | array | function | executable_function_attribute )
            int alt27=7;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt27=1;
                }
                break;
            case BOOLEAN:
                {
                alt27=2;
                }
                break;
            case STRING:
                {
                alt27=3;
                }
                break;
            case ID:
                {
                int LA27_4 = input.LA(2);

                if ( (LA27_4==EOF||LA27_4==AND||LA27_4==CLOSE_BOX||(LA27_4 >= CLOSE_PAREN && LA27_4 <= COMMA)||(LA27_4 >= DIVIDE && LA27_4 <= EQ)||(LA27_4 >= GT && LA27_4 <= ID)||(LA27_4 >= LT && LA27_4 <= MULTIPLY_EQUALS)||LA27_4==NEQ||LA27_4==OPEN_BRACE||(LA27_4 >= OR && LA27_4 <= QUESTION_MARK)||LA27_4==STRING) ) {
                    alt27=4;
                }
                else if ( (LA27_4==OPEN_PAREN) ) {
                    alt27=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 4, input);

                    throw nvae;

                }
                }
                break;
            case OPEN_BOX:
                {
                alt27=5;
                }
                break;
            case AT:
                {
                alt27=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:114:4: NUMBER
                    {
                    root_0 = (Tree)adaptor.nil();


                    NUMBER65=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_data_type783); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER65_tree = 
                    (Tree)adaptor.create(NUMBER65)
                    ;
                    adaptor.addChild(root_0, NUMBER65_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:115:4: BOOLEAN
                    {
                    root_0 = (Tree)adaptor.nil();


                    BOOLEAN66=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_data_type788); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN66_tree = 
                    (Tree)adaptor.create(BOOLEAN66)
                    ;
                    adaptor.addChild(root_0, BOOLEAN66_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:116:4: STRING
                    {
                    root_0 = (Tree)adaptor.nil();


                    STRING67=(Token)match(input,STRING,FOLLOW_STRING_in_data_type793); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING67_tree = 
                    (Tree)adaptor.create(STRING67)
                    ;
                    adaptor.addChild(root_0, STRING67_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:117:5: variable
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_variable_in_data_type799);
                    variable68=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable68.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:118:4: array
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_data_type804);
                    array69=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array69.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:119:4: function
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_data_type809);
                    function70=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function70.getTree());

                    }
                    break;
                case 7 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:120:4: executable_function_attribute
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_executable_function_attribute_in_data_type814);
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


    public static class variable_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:123:1: variable : ( ID ( PERIOD ID )* ) -> ^( VARIABLE ( ^( ID ) )+ ) ;
    public final RichTeaParser.variable_return variable() throws RecognitionException {
        RichTeaParser.variable_return retval = new RichTeaParser.variable_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID72=null;
        Token PERIOD73=null;
        Token ID74=null;

        Tree ID72_tree=null;
        Tree PERIOD73_tree=null;
        Tree ID74_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:124:2: ( ( ID ( PERIOD ID )* ) -> ^( VARIABLE ( ^( ID ) )+ ) )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:124:4: ( ID ( PERIOD ID )* )
            {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:124:4: ( ID ( PERIOD ID )* )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:124:5: ID ( PERIOD ID )*
            {
            ID72=(Token)match(input,ID,FOLLOW_ID_in_variable827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID72);


            // D:\\Programming\\RichTea\\antlr\\RichTea.g:124:8: ( PERIOD ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==PERIOD) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:124:9: PERIOD ID
            	    {
            	    PERIOD73=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_variable830); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD73);


            	    ID74=(Token)match(input,ID,FOLLOW_ID_in_variable832); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID74);


            	    }
            	    break;

            	default :
            	    break loop28;
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
            // 125:4: -> ^( VARIABLE ( ^( ID ) )+ )
            {
                // D:\\Programming\\RichTea\\antlr\\RichTea.g:125:7: ^( VARIABLE ( ^( ID ) )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(VARIABLE, "VARIABLE")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:125:18: ^( ID )
                    {
                    Tree root_2 = (Tree)adaptor.nil();
                    root_2 = (Tree)adaptor.becomeRoot(
                    stream_ID.nextNode()
                    , root_2);

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ID.reset();

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


    public static class array_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:129:1: array : OPEN_BOX ( expression ( COMMA expression )* )? CLOSE_BOX -> ^( ARRAY ( expression )* ) ;
    public final RichTeaParser.array_return array() throws RecognitionException {
        RichTeaParser.array_return retval = new RichTeaParser.array_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OPEN_BOX75=null;
        Token COMMA77=null;
        Token CLOSE_BOX79=null;
        RichTeaParser.expression_return expression76 =null;

        RichTeaParser.expression_return expression78 =null;


        Tree OPEN_BOX75_tree=null;
        Tree COMMA77_tree=null;
        Tree CLOSE_BOX79_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BOX=new RewriteRuleTokenStream(adaptor,"token CLOSE_BOX");
        RewriteRuleTokenStream stream_OPEN_BOX=new RewriteRuleTokenStream(adaptor,"token OPEN_BOX");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:130:2: ( OPEN_BOX ( expression ( COMMA expression )* )? CLOSE_BOX -> ^( ARRAY ( expression )* ) )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:130:4: OPEN_BOX ( expression ( COMMA expression )* )? CLOSE_BOX
            {
            OPEN_BOX75=(Token)match(input,OPEN_BOX,FOLLOW_OPEN_BOX_in_array863); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BOX.add(OPEN_BOX75);


            // D:\\Programming\\RichTea\\antlr\\RichTea.g:130:13: ( expression ( COMMA expression )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==AT||LA30_0==BOOLEAN||LA30_0==ID||LA30_0==MINUS||(LA30_0 >= NOT && LA30_0 <= OPEN_BOX)||LA30_0==OPEN_PAREN||LA30_0==STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:130:14: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_array866);
                    expression76=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression76.getTree());

                    // D:\\Programming\\RichTea\\antlr\\RichTea.g:130:25: ( COMMA expression )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==COMMA) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // D:\\Programming\\RichTea\\antlr\\RichTea.g:130:26: COMMA expression
                    	    {
                    	    COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_array869); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA77);


                    	    pushFollow(FOLLOW_expression_in_array871);
                    	    expression78=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression78.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }


            CLOSE_BOX79=(Token)match(input,CLOSE_BOX,FOLLOW_CLOSE_BOX_in_array878); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BOX.add(CLOSE_BOX79);


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
            // 131:4: -> ^( ARRAY ( expression )* )
            {
                // D:\\Programming\\RichTea\\antlr\\RichTea.g:131:7: ^( ARRAY ( expression )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // D:\\Programming\\RichTea\\antlr\\RichTea.g:131:15: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

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


    public static class executable_function_attribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "executable_function_attribute"
    // D:\\Programming\\RichTea\\antlr\\RichTea.g:134:1: executable_function_attribute : AT function -> ^( EXECUTABLE_FUNCTION_ATTRIBUTE function ) ;
    public final RichTeaParser.executable_function_attribute_return executable_function_attribute() throws RecognitionException {
        RichTeaParser.executable_function_attribute_return retval = new RichTeaParser.executable_function_attribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token AT80=null;
        RichTeaParser.function_return function81 =null;


        Tree AT80_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:135:2: ( AT function -> ^( EXECUTABLE_FUNCTION_ATTRIBUTE function ) )
            // D:\\Programming\\RichTea\\antlr\\RichTea.g:135:5: AT function
            {
            AT80=(Token)match(input,AT,FOLLOW_AT_in_executable_function_attribute903); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AT.add(AT80);


            pushFollow(FOLLOW_function_in_executable_function_attribute905);
            function81=function();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function.add(function81.getTree());

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
            // 136:4: -> ^( EXECUTABLE_FUNCTION_ATTRIBUTE function )
            {
                // D:\\Programming\\RichTea\\antlr\\RichTea.g:136:7: ^( EXECUTABLE_FUNCTION_ATTRIBUTE function )
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

    // $ANTLR start synpred3_RichTea
    public final void synpred3_RichTea_fragment() throws RecognitionException {
        // D:\\Programming\\RichTea\\antlr\\RichTea.g:29:19: ( function_data )
        // D:\\Programming\\RichTea\\antlr\\RichTea.g:29:19: function_data
        {
        pushFollow(FOLLOW_function_data_in_synpred3_RichTea188);
        function_data();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_RichTea

    // $ANTLR start synpred5_RichTea
    public final void synpred5_RichTea_fragment() throws RecognitionException {
        List list_=null;
       // RuleReturnScope  = null;
        // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:14: (attributes+= implicitAttribute )
        // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:14: attributes+= implicitAttribute
        {
        pushFollow(FOLLOW_implicitAttribute_in_synpred5_RichTea241);
        //attributes=implicitAttribute();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_RichTea

    // $ANTLR start synpred7_RichTea
    public final void synpred7_RichTea_fragment() throws RecognitionException {
        List list_=null;
       // RuleReturnScope  = null;
        // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:36: ( ( COMMA )? attributes+= attribute )
        // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:36: ( COMMA )? attributes+= attribute
        {
        // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:36: ( COMMA )?
        int alt31=2;
        int LA31_0 = input.LA(1);

        if ( (LA31_0==COMMA) ) {
            alt31=1;
        }
        switch (alt31) {
            case 1 :
                // D:\\Programming\\RichTea\\antlr\\RichTea.g:38:36: COMMA
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred7_RichTea245); if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_attribute_in_synpred7_RichTea250);
        //attributes=attribute();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_RichTea

    // $ANTLR start synpred17_RichTea
    public final void synpred17_RichTea_fragment() throws RecognitionException {
        // D:\\Programming\\RichTea\\antlr\\RichTea.g:70:4: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) )
        // D:\\Programming\\RichTea\\antlr\\RichTea.g:70:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
        {
        pushFollow(FOLLOW_logical_expression_in_synpred17_RichTea489);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        // D:\\Programming\\RichTea\\antlr\\RichTea.g:70:23: ( QUESTION_MARK logical_expression COLON logical_expression )
        // D:\\Programming\\RichTea\\antlr\\RichTea.g:70:24: QUESTION_MARK logical_expression COLON logical_expression
        {
        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred17_RichTea492); if (state.failed) return ;

        pushFollow(FOLLOW_logical_expression_in_synpred17_RichTea494);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred17_RichTea496); if (state.failed) return ;

        pushFollow(FOLLOW_logical_expression_in_synpred17_RichTea498);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred17_RichTea

    // Delegated rules

    public final boolean synpred5_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\156\uffff";
    static final String DFA17_eofS =
        "\1\uffff\4\22\151\uffff";
    static final String DFA17_minS =
        "\1\7\4\4\1\7\1\36\3\7\7\0\11\uffff\7\0\11\uffff\7\0\11\uffff\10"+
        "\0\1\uffff\1\0\10\uffff\42\0";
    static final String DFA17_maxS =
        "\6\67\1\36\3\67\7\0\11\uffff\7\0\11\uffff\7\0\11\uffff\10\0\1\uffff"+
        "\1\0\10\uffff\42\0";
    static final String DFA17_acceptS =
        "\21\uffff\1\1\1\2\133\uffff";
    static final String DFA17_specialS =
        "\12\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\11\uffff\1\7\1\10\1\11\1\12"+
        "\1\13\1\14\1\15\11\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\11\uffff"+
        "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\uffff\1\35\10\uffff\1"+
        "\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
        "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
        "\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77}>";
    static final String[] DFA17_transitionS = {
            "\1\6\2\uffff\1\2\23\uffff\1\4\4\uffff\1\11\7\uffff\1\10\1\1"+
            "\1\5\1\uffff\1\7\7\uffff\1\3",
            "\1\17\11\uffff\1\22\1\uffff\1\22\1\uffff\1\22\1\uffff\2\13"+
            "\1\16\4\uffff\2\15\2\22\2\uffff\2\15\2\14\3\13\2\uffff\1\16"+
            "\3\uffff\1\22\1\uffff\1\20\1\uffff\2\14\1\12\1\21\1\uffff\1"+
            "\22",
            "\1\37\11\uffff\1\22\1\uffff\1\22\1\uffff\1\22\1\uffff\2\33"+
            "\1\36\4\uffff\2\35\2\22\2\uffff\2\35\2\34\3\33\2\uffff\1\36"+
            "\3\uffff\1\22\1\uffff\1\40\1\uffff\2\34\1\32\1\21\1\uffff\1"+
            "\22",
            "\1\57\11\uffff\1\22\1\uffff\1\22\1\uffff\1\22\1\uffff\2\53"+
            "\1\56\4\uffff\2\55\2\22\2\uffff\2\55\2\54\3\53\2\uffff\1\56"+
            "\3\uffff\1\22\1\uffff\1\60\1\uffff\2\54\1\52\1\21\1\uffff\1"+
            "\22",
            "\1\100\11\uffff\1\22\1\uffff\1\22\1\uffff\1\22\1\uffff\2\74"+
            "\1\77\4\uffff\2\76\2\22\2\uffff\2\76\2\75\3\74\2\uffff\1\77"+
            "\3\uffff\1\22\1\103\1\101\1\72\2\75\1\73\1\21\1\uffff\1\22",
            "\1\121\2\uffff\1\115\3\uffff\1\125\17\uffff\1\117\4\uffff\1"+
            "\124\7\uffff\1\123\1\114\1\120\1\uffff\1\122\7\uffff\1\116",
            "\1\126",
            "\1\134\2\uffff\1\130\23\uffff\1\132\4\uffff\1\137\7\uffff\1"+
            "\136\1\127\1\133\1\uffff\1\135\7\uffff\1\131",
            "\1\145\2\uffff\1\141\23\uffff\1\143\15\uffff\1\140\1\144\1"+
            "\uffff\1\146\7\uffff\1\142",
            "\1\154\2\uffff\1\150\23\uffff\1\152\15\uffff\1\147\1\153\1"+
            "\uffff\1\155\7\uffff\1\151",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "69:1: expression : ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_10);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA17_11 = input.LA(1);

                         
                        int index17_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_11);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA17_12 = input.LA(1);

                         
                        int index17_12 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_12);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_13);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA17_14 = input.LA(1);

                         
                        int index17_14 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_14);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA17_15 = input.LA(1);

                         
                        int index17_15 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_15);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA17_16 = input.LA(1);

                         
                        int index17_16 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_16);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA17_26 = input.LA(1);

                         
                        int index17_26 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_26);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA17_27 = input.LA(1);

                         
                        int index17_27 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_27);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA17_28 = input.LA(1);

                         
                        int index17_28 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_28);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA17_29 = input.LA(1);

                         
                        int index17_29 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_29);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA17_30 = input.LA(1);

                         
                        int index17_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_30);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA17_31 = input.LA(1);

                         
                        int index17_31 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_31);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA17_32 = input.LA(1);

                         
                        int index17_32 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_32);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA17_42 = input.LA(1);

                         
                        int index17_42 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_42);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA17_43 = input.LA(1);

                         
                        int index17_43 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_43);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA17_44 = input.LA(1);

                         
                        int index17_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_44);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA17_45 = input.LA(1);

                         
                        int index17_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_45);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA17_46 = input.LA(1);

                         
                        int index17_46 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_46);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA17_47 = input.LA(1);

                         
                        int index17_47 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_47);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA17_48 = input.LA(1);

                         
                        int index17_48 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_48);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA17_58 = input.LA(1);

                         
                        int index17_58 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_58);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA17_59 = input.LA(1);

                         
                        int index17_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_59);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA17_60 = input.LA(1);

                         
                        int index17_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_60);

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA17_61 = input.LA(1);

                         
                        int index17_61 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_61);

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA17_62 = input.LA(1);

                         
                        int index17_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_62);

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA17_63 = input.LA(1);

                         
                        int index17_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_63);

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA17_64 = input.LA(1);

                         
                        int index17_64 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_64);

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA17_65 = input.LA(1);

                         
                        int index17_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_65);

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA17_67 = input.LA(1);

                         
                        int index17_67 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_67);

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA17_76 = input.LA(1);

                         
                        int index17_76 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_76);

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA17_77 = input.LA(1);

                         
                        int index17_77 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_77);

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA17_78 = input.LA(1);

                         
                        int index17_78 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_78);

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA17_79 = input.LA(1);

                         
                        int index17_79 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_79);

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA17_80 = input.LA(1);

                         
                        int index17_80 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_80);

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA17_81 = input.LA(1);

                         
                        int index17_81 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_81);

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA17_82 = input.LA(1);

                         
                        int index17_82 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_82);

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA17_83 = input.LA(1);

                         
                        int index17_83 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_83);

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA17_84 = input.LA(1);

                         
                        int index17_84 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_84);

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA17_85 = input.LA(1);

                         
                        int index17_85 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_85);

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA17_86 = input.LA(1);

                         
                        int index17_86 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_86);

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA17_87 = input.LA(1);

                         
                        int index17_87 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_87);

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA17_88 = input.LA(1);

                         
                        int index17_88 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_88);

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA17_89 = input.LA(1);

                         
                        int index17_89 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_89);

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA17_90 = input.LA(1);

                         
                        int index17_90 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_90);

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA17_91 = input.LA(1);

                         
                        int index17_91 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_91);

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA17_92 = input.LA(1);

                         
                        int index17_92 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_92);

                        if ( s>=0 ) return s;
                        break;

                    case 47 : 
                        int LA17_93 = input.LA(1);

                         
                        int index17_93 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_93);

                        if ( s>=0 ) return s;
                        break;

                    case 48 : 
                        int LA17_94 = input.LA(1);

                         
                        int index17_94 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_94);

                        if ( s>=0 ) return s;
                        break;

                    case 49 : 
                        int LA17_95 = input.LA(1);

                         
                        int index17_95 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_95);

                        if ( s>=0 ) return s;
                        break;

                    case 50 : 
                        int LA17_96 = input.LA(1);

                         
                        int index17_96 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_96);

                        if ( s>=0 ) return s;
                        break;

                    case 51 : 
                        int LA17_97 = input.LA(1);

                         
                        int index17_97 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_97);

                        if ( s>=0 ) return s;
                        break;

                    case 52 : 
                        int LA17_98 = input.LA(1);

                         
                        int index17_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_98);

                        if ( s>=0 ) return s;
                        break;

                    case 53 : 
                        int LA17_99 = input.LA(1);

                         
                        int index17_99 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_99);

                        if ( s>=0 ) return s;
                        break;

                    case 54 : 
                        int LA17_100 = input.LA(1);

                         
                        int index17_100 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_100);

                        if ( s>=0 ) return s;
                        break;

                    case 55 : 
                        int LA17_101 = input.LA(1);

                         
                        int index17_101 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_101);

                        if ( s>=0 ) return s;
                        break;

                    case 56 : 
                        int LA17_102 = input.LA(1);

                         
                        int index17_102 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_102);

                        if ( s>=0 ) return s;
                        break;

                    case 57 : 
                        int LA17_103 = input.LA(1);

                         
                        int index17_103 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_103);

                        if ( s>=0 ) return s;
                        break;

                    case 58 : 
                        int LA17_104 = input.LA(1);

                         
                        int index17_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_104);

                        if ( s>=0 ) return s;
                        break;

                    case 59 : 
                        int LA17_105 = input.LA(1);

                         
                        int index17_105 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_105);

                        if ( s>=0 ) return s;
                        break;

                    case 60 : 
                        int LA17_106 = input.LA(1);

                         
                        int index17_106 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_106);

                        if ( s>=0 ) return s;
                        break;

                    case 61 : 
                        int LA17_107 = input.LA(1);

                         
                        int index17_107 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_107);

                        if ( s>=0 ) return s;
                        break;

                    case 62 : 
                        int LA17_108 = input.LA(1);

                         
                        int index17_108 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_108);

                        if ( s>=0 ) return s;
                        break;

                    case 63 : 
                        int LA17_109 = input.LA(1);

                         
                        int index17_109 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred17_RichTea()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index17_109);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_function_scope_in_program127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_function_scope140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function_scope146 = new BitSet(new long[]{0x0080F80860040480L});
    public static final BitSet FOLLOW_function_data_in_function_scope148 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function_scope150 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function_scope152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function183 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function186 = new BitSet(new long[]{0x0080F80860050480L});
    public static final BitSet FOLLOW_function_data_in_function188 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function191 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_list_in_function_data224 = new BitSet(new long[]{0x0080400060040000L});
    public static final BitSet FOLLOW_branch_list_in_function_data226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitAttribute_in_attribute_list241 = new BitSet(new long[]{0x0000000040040002L});
    public static final BitSet FOLLOW_COMMA_in_attribute_list245 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_attribute_in_attribute_list250 = new BitSet(new long[]{0x0000000040040002L});
    public static final BitSet FOLLOW_ID_in_attribute281 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_COLON_in_attribute284 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_ASSIGN_in_attribute288 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_expression_in_attribute292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_implicitAttribute321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBranch_in_branch_list354 = new BitSet(new long[]{0x0080000060040002L});
    public static final BitSet FOLLOW_COMMA_in_branch_list358 = new BitSet(new long[]{0x0080000060000000L});
    public static final BitSet FOLLOW_branch_in_branch_list363 = new BitSet(new long[]{0x0080000060040002L});
    public static final BitSet FOLLOW_HASH_in_branch395 = new BitSet(new long[]{0x0080000040000000L});
    public static final BitSet FOLLOW_ID_in_branch401 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_STRING_in_branch407 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_branch410 = new BitSet(new long[]{0x0000800040008000L});
    public static final BitSet FOLLOW_function_scope_in_branch412 = new BitSet(new long[]{0x0000800040008000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_branch415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_implicitBranch446 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_implicitBranch449 = new BitSet(new long[]{0x0000800040008000L});
    public static final BitSet FOLLOW_function_scope_in_implicitBranch451 = new BitSet(new long[]{0x0000800040008000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_implicitBranch454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression489 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_expression492 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_logical_expression_in_expression494 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_expression496 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_logical_expression_in_expression498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression525 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_OR_in_logical_expression528 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression531 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression544 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolean_expression547 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression550 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression564 = new BitSet(new long[]{0x0000040000400002L});
    public static final BitSet FOLLOW_set_in_equality_expression567 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression578 = new BitSet(new long[]{0x0000040000400002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression592 = new BitSet(new long[]{0x0000000618000002L});
    public static final BitSet FOLLOW_set_in_relational_expression595 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression614 = new BitSet(new long[]{0x0000000618000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression628 = new BitSet(new long[]{0x000C001800000002L});
    public static final BitSet FOLLOW_set_in_additive_expression631 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression650 = new BitSet(new long[]{0x000C001800000002L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression664 = new BitSet(new long[]{0x000000E000300002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression667 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression690 = new BitSet(new long[]{0x000000E000300002L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression704 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_POWER_in_power_expression708 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression711 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expression729 = new BitSet(new long[]{0x0080B00040000480L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression737 = new BitSet(new long[]{0x0080B00040000480L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_type_in_primary_expression759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_primary_expression764 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_logical_expression_in_primary_expression767 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_primary_expression769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_data_type783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_data_type788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_data_type793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_data_type799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_data_type804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_data_type809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executable_function_attribute_in_data_type814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable827 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_variable830 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_variable832 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_OPEN_BOX_in_array863 = new BitSet(new long[]{0x0080B80840004480L});
    public static final BitSet FOLLOW_expression_in_array866 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_COMMA_in_array869 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_expression_in_array871 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_CLOSE_BOX_in_array878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_executable_function_attribute903 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_function_in_executable_function_attribute905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_data_in_synpred3_RichTea188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitAttribute_in_synpred5_RichTea241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred7_RichTea245 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_attribute_in_synpred7_RichTea250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_synpred17_RichTea489 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred17_RichTea492 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_logical_expression_in_synpred17_RichTea494 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_synpred17_RichTea496 = new BitSet(new long[]{0x0080B80840000480L});
    public static final BitSet FOLLOW_logical_expression_in_synpred17_RichTea498 = new BitSet(new long[]{0x0000000000000002L});

}