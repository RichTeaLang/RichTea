// $ANTLR 3.4 /home/richard/Programming/RichTea/antlr/RichTea.g 2012-02-07 00:59:31
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ASSIGN", "ATTRIBUTE", "ATTRIBUTES", "BOOLEAN", "BRANCH", "BRANCHES", "CHILDREN", "CLOSE_BOX", "CLOSE_BRACE", "CLOSE_PAREN", "COLON", "COMMA", "COMMENT", "DIVIDE", "DIVIDE_EQUALS", "EQ", "ESC_SEQ", "FLOAT", "FUNCTION", "GT", "GTEQ", "HASH", "ID", "INTEGER", "LETTER", "LT", "LTEQ", "MINUS", "MINUS_EQUALS", "MODULUS", "MULTIPLY", "MULTIPLY_EQUALS", "NAME", "NEGATE", "NEQ", "NOT", "NUMBER", "OPEN_BOX", "OPEN_BRACE", "OPEN_PAREN", "OR", "PERIOD", "PLUS", "PLUS_EQUALS", "POWER", "QUESTION_MARK", "SEMI_COLON", "STRING", "TERNARY_OPERATOR", "VALUE", "VARIABLE", "WHITESPACE"
    };

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
    public String getGrammarFileName() { return "/home/richard/Programming/RichTea/antlr/RichTea.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /home/richard/Programming/RichTea/antlr/RichTea.g:18:1: program : function_scope ;
    public final RichTeaParser.program_return program() throws RecognitionException {
        RichTeaParser.program_return retval = new RichTeaParser.program_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        RichTeaParser.function_scope_return function_scope1 =null;



        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:19:2: ( function_scope )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:19:4: function_scope
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_function_scope_in_program132);
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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:22:1: function_scope : ( function | OPEN_PAREN function_data CLOSE_PAREN ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data ) );
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:23:2: ( function | OPEN_PAREN function_data CLOSE_PAREN ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data ) )
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
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:23:4: function
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_function_scope145);
                    function2=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function2.getTree());

                    }
                    break;
                case 2 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:24:5: OPEN_PAREN function_data CLOSE_PAREN ( SEMI_COLON )?
                    {
                    OPEN_PAREN3=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function_scope151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN3);


                    pushFollow(FOLLOW_function_data_in_function_scope153);
                    function_data4=function_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_data.add(function_data4.getTree());

                    CLOSE_PAREN5=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function_scope155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN5);


                    // /home/richard/Programming/RichTea/antlr/RichTea.g:24:42: ( SEMI_COLON )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==SEMI_COLON) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /home/richard/Programming/RichTea/antlr/RichTea.g:24:42: SEMI_COLON
                            {
                            SEMI_COLON6=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function_scope157); if (state.failed) return retval; 
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
                        // /home/richard/Programming/RichTea/antlr/RichTea.g:25:7: ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(FUNCTION, "FUNCTION")
                        , root_1);

                        // /home/richard/Programming/RichTea/antlr/RichTea.g:25:18: ^( NAME ID[\"scope\"] )
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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:28:1: function : ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN ) ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ( function_data )? ) ;
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:29:2: ( ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN ) ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ( function_data )? ) )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:29:4: ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN ) ( SEMI_COLON )?
            {
            ID7=(Token)match(input,ID,FOLLOW_ID_in_function188); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID7);


            // /home/richard/Programming/RichTea/antlr/RichTea.g:29:7: ( OPEN_PAREN ( function_data )? CLOSE_PAREN )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:29:8: OPEN_PAREN ( function_data )? CLOSE_PAREN
            {
            OPEN_PAREN8=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN8);


            // /home/richard/Programming/RichTea/antlr/RichTea.g:29:19: ( function_data )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==BOOLEAN||LA3_0==COMMA||(LA3_0 >= HASH && LA3_0 <= ID)||LA3_0==MINUS||(LA3_0 >= NOT && LA3_0 <= OPEN_PAREN)||LA3_0==STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==CLOSE_PAREN) ) {
                int LA3_12 = input.LA(2);

                if ( (synpred3_RichTea()) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:29:19: function_data
                    {
                    pushFollow(FOLLOW_function_data_in_function193);
                    function_data9=function_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_data.add(function_data9.getTree());

                    }
                    break;

            }


            CLOSE_PAREN10=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function196); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN10);


            }


            // /home/richard/Programming/RichTea/antlr/RichTea.g:29:47: ( SEMI_COLON )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMI_COLON) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:29:47: SEMI_COLON
                    {
                    SEMI_COLON11=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON11);


                    }
                    break;

            }


            // AST REWRITE
            // elements: function_data, ID
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
                // /home/richard/Programming/RichTea/antlr/RichTea.g:30:7: ^( FUNCTION ^( NAME ID ) ( function_data )? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(FUNCTION, "FUNCTION")
                , root_1);

                // /home/richard/Programming/RichTea/antlr/RichTea.g:30:18: ^( NAME ID )
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

                // /home/richard/Programming/RichTea/antlr/RichTea.g:30:29: ( function_data )?
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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:33:1: function_data : attribute_list branch_list ;
    public final RichTeaParser.function_data_return function_data() throws RecognitionException {
        RichTeaParser.function_data_return retval = new RichTeaParser.function_data_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        RichTeaParser.attribute_list_return attribute_list12 =null;

        RichTeaParser.branch_list_return branch_list13 =null;



        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:34:2: ( attribute_list branch_list )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:34:4: attribute_list branch_list
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_attribute_list_in_function_data229);
            attribute_list12=attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute_list12.getTree());

            pushFollow(FOLLOW_branch_list_in_function_data231);
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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:37:1: attribute_list : (attributes+= implicitAttribute )? ( ( COMMA )? attributes+= attribute )* -> ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* ) ;
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:38:2: ( (attributes+= implicitAttribute )? ( ( COMMA )? attributes+= attribute )* -> ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* ) )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:38:4: (attributes+= implicitAttribute )? ( ( COMMA )? attributes+= attribute )*
            {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:38:14: (attributes+= implicitAttribute )?
            int alt5=2;
            switch ( input.LA(1) ) {
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
                        int LA5_25 = input.LA(3);

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
                        int LA5_42 = input.LA(3);

                        if ( (synpred5_RichTea()) ) {
                            alt5=1;
                        }
                    }
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:38:14: attributes+= implicitAttribute
                    {
                    pushFollow(FOLLOW_implicitAttribute_in_attribute_list246);
                    attributes=implicitAttribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicitAttribute.add(attributes.getTree());
                    if (list_attributes==null) list_attributes=new ArrayList();
                    list_attributes.add(attributes.getTree());


                    }
                    break;

            }


            // /home/richard/Programming/RichTea/antlr/RichTea.g:38:35: ( ( COMMA )? attributes+= attribute )*
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
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:38:36: ( COMMA )? attributes+= attribute
            	    {
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:38:36: ( COMMA )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==COMMA) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /home/richard/Programming/RichTea/antlr/RichTea.g:38:36: COMMA
            	            {
            	            COMMA14=(Token)match(input,COMMA,FOLLOW_COMMA_in_attribute_list250); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA14);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_attribute_in_attribute_list255);
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
                // /home/richard/Programming/RichTea/antlr/RichTea.g:39:7: ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES")
                , root_1);

                // /home/richard/Programming/RichTea/antlr/RichTea.g:39:20: ( ^( ATTRIBUTE $attributes) )*
                while ( stream_attributes.hasNext() ) {
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:39:20: ^( ATTRIBUTE $attributes)
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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:42:1: attribute : ID ( COLON | ASSIGN ) ! datatype -> ^( NAME ID ) ^( VALUE datatype ) ;
    public final RichTeaParser.attribute_return attribute() throws RecognitionException {
        RichTeaParser.attribute_return retval = new RichTeaParser.attribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID15=null;
        Token COLON16=null;
        Token ASSIGN17=null;
        RichTeaParser.datatype_return datatype18 =null;


        Tree ID15_tree=null;
        Tree COLON16_tree=null;
        Tree ASSIGN17_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:43:2: ( ID ( COLON | ASSIGN ) ! datatype -> ^( NAME ID ) ^( VALUE datatype ) )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:43:4: ID ( COLON | ASSIGN ) ! datatype
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_attribute286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID15);


            // /home/richard/Programming/RichTea/antlr/RichTea.g:43:7: ( COLON | ASSIGN )
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
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:43:8: COLON
                    {
                    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_attribute289); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON16);


                    }
                    break;
                case 2 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:43:16: ASSIGN
                    {
                    ASSIGN17=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attribute293); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN17);


                    }
                    break;

            }


            pushFollow(FOLLOW_datatype_in_attribute297);
            datatype18=datatype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_datatype.add(datatype18.getTree());

            // AST REWRITE
            // elements: datatype, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 44:4: -> ^( NAME ID ) ^( VALUE datatype )
            {
                // /home/richard/Programming/RichTea/antlr/RichTea.g:44:7: ^( NAME ID )
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

                // /home/richard/Programming/RichTea/antlr/RichTea.g:44:18: ^( VALUE datatype )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(VALUE, "VALUE")
                , root_1);

                adaptor.addChild(root_1, stream_datatype.nextTree());

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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:47:1: implicitAttribute : datatype -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) ;
    public final RichTeaParser.implicitAttribute_return implicitAttribute() throws RecognitionException {
        RichTeaParser.implicitAttribute_return retval = new RichTeaParser.implicitAttribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        RichTeaParser.datatype_return datatype19 =null;


        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:48:2: ( datatype -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:48:4: datatype
            {
            pushFollow(FOLLOW_datatype_in_implicitAttribute326);
            datatype19=datatype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_datatype.add(datatype19.getTree());

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
            // 49:4: -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype )
            {
                // /home/richard/Programming/RichTea/antlr/RichTea.g:49:7: ^( NAME ID[\"implicitAttribute\"] )
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

                // /home/richard/Programming/RichTea/antlr/RichTea.g:49:39: ^( VALUE datatype )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(VALUE, "VALUE")
                , root_1);

                adaptor.addChild(root_1, stream_datatype.nextTree());

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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:52:1: branch_list : (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )* -> ^( BRANCHES ( ^( BRANCH $branches) )* ) ;
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:53:2: ( (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )* -> ^( BRANCHES ( ^( BRANCH $branches) )* ) )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:53:4: (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )*
            {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:53:12: (branches+= implicitBranch )?
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
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:53:12: branches+= implicitBranch
                    {
                    pushFollow(FOLLOW_implicitBranch_in_branch_list359);
                    branches=implicitBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicitBranch.add(branches.getTree());
                    if (list_branches==null) list_branches=new ArrayList();
                    list_branches.add(branches.getTree());


                    }
                    break;

            }


            // /home/richard/Programming/RichTea/antlr/RichTea.g:53:30: ( ( COMMA )? branches+= branch )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA||(LA11_0 >= HASH && LA11_0 <= ID)||LA11_0==STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:53:31: ( COMMA )? branches+= branch
            	    {
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:53:31: ( COMMA )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==COMMA) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // /home/richard/Programming/RichTea/antlr/RichTea.g:53:31: COMMA
            	            {
            	            COMMA20=(Token)match(input,COMMA,FOLLOW_COMMA_in_branch_list363); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA20);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_branch_in_branch_list368);
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
                // /home/richard/Programming/RichTea/antlr/RichTea.g:54:7: ^( BRANCHES ( ^( BRANCH $branches) )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(BRANCHES, "BRANCHES")
                , root_1);

                // /home/richard/Programming/RichTea/antlr/RichTea.g:54:18: ( ^( BRANCH $branches) )*
                while ( stream_branches.hasNext() ) {
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:54:18: ^( BRANCH $branches)
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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:57:1: branch : ( HASH )? (name= ID |name= STRING ) OPEN_BRACE ( function_scope )* CLOSE_BRACE -> ^( NAME $name) ^( CHILDREN ( function_scope )* ) ;
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:58:2: ( ( HASH )? (name= ID |name= STRING ) OPEN_BRACE ( function_scope )* CLOSE_BRACE -> ^( NAME $name) ^( CHILDREN ( function_scope )* ) )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:58:4: ( HASH )? (name= ID |name= STRING ) OPEN_BRACE ( function_scope )* CLOSE_BRACE
            {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:58:4: ( HASH )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==HASH) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:58:4: HASH
                    {
                    HASH21=(Token)match(input,HASH,FOLLOW_HASH_in_branch400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HASH.add(HASH21);


                    }
                    break;

            }


            // /home/richard/Programming/RichTea/antlr/RichTea.g:58:10: (name= ID |name= STRING )
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
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:58:11: name= ID
                    {
                    name=(Token)match(input,ID,FOLLOW_ID_in_branch406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(name);


                    }
                    break;
                case 2 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:58:21: name= STRING
                    {
                    name=(Token)match(input,STRING,FOLLOW_STRING_in_branch412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(name);


                    }
                    break;

            }


            OPEN_BRACE22=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_branch415); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE22);


            // /home/richard/Programming/RichTea/antlr/RichTea.g:58:45: ( function_scope )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID||LA14_0==OPEN_PAREN) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:58:45: function_scope
            	    {
            	    pushFollow(FOLLOW_function_scope_in_branch417);
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


            CLOSE_BRACE24=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_branch420); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE24);


            // AST REWRITE
            // elements: function_scope, name
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
                // /home/richard/Programming/RichTea/antlr/RichTea.g:59:7: ^( NAME $name)
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // /home/richard/Programming/RichTea/antlr/RichTea.g:59:21: ^( CHILDREN ( function_scope )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(CHILDREN, "CHILDREN")
                , root_1);

                // /home/richard/Programming/RichTea/antlr/RichTea.g:59:32: ( function_scope )*
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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:62:1: implicitBranch : ( HASH )? OPEN_BRACE ( function_scope )* CLOSE_BRACE -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function_scope )* ) ;
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
            // /home/richard/Programming/RichTea/antlr/RichTea.g:63:2: ( ( HASH )? OPEN_BRACE ( function_scope )* CLOSE_BRACE -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function_scope )* ) )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:63:4: ( HASH )? OPEN_BRACE ( function_scope )* CLOSE_BRACE
            {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:63:4: ( HASH )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==HASH) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:63:4: HASH
                    {
                    HASH25=(Token)match(input,HASH,FOLLOW_HASH_in_implicitBranch451); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HASH.add(HASH25);


                    }
                    break;

            }


            OPEN_BRACE26=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_implicitBranch454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE26);


            // /home/richard/Programming/RichTea/antlr/RichTea.g:63:21: ( function_scope )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ID||LA16_0==OPEN_PAREN) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:63:21: function_scope
            	    {
            	    pushFollow(FOLLOW_function_scope_in_implicitBranch456);
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


            CLOSE_BRACE28=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_implicitBranch459); if (state.failed) return retval; 
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
                // /home/richard/Programming/RichTea/antlr/RichTea.g:64:7: ^( NAME ID[\"implicitBranch\"] )
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

                // /home/richard/Programming/RichTea/antlr/RichTea.g:64:36: ^( CHILDREN ( function_scope )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(CHILDREN, "CHILDREN")
                , root_1);

                // /home/richard/Programming/RichTea/antlr/RichTea.g:64:47: ( function_scope )*
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


    public static class datatype_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "datatype"
    // /home/richard/Programming/RichTea/antlr/RichTea.g:67:1: datatype : ( expression | function | array );
    public final RichTeaParser.datatype_return datatype() throws RecognitionException {
        RichTeaParser.datatype_return retval = new RichTeaParser.datatype_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        RichTeaParser.expression_return expression29 =null;

        RichTeaParser.function_return function30 =null;

        RichTeaParser.array_return array31 =null;



        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:68:2: ( expression | function | array )
            int alt17=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
            case MINUS:
            case NOT:
            case NUMBER:
            case OPEN_PAREN:
            case STRING:
                {
                alt17=1;
                }
                break;
            case ID:
                {
                int LA17_4 = input.LA(2);

                if ( (LA17_4==EOF||LA17_4==AND||LA17_4==CLOSE_BOX||LA17_4==CLOSE_PAREN||LA17_4==COMMA||(LA17_4 >= DIVIDE && LA17_4 <= EQ)||(LA17_4 >= GT && LA17_4 <= ID)||(LA17_4 >= LT && LA17_4 <= MULTIPLY_EQUALS)||LA17_4==NEQ||LA17_4==OPEN_BRACE||(LA17_4 >= OR && LA17_4 <= QUESTION_MARK)||LA17_4==STRING) ) {
                    alt17=1;
                }
                else if ( (LA17_4==OPEN_PAREN) ) {
                    int LA17_18 = input.LA(3);

                    if ( (synpred17_RichTea()) ) {
                        alt17=1;
                    }
                    else if ( (synpred18_RichTea()) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 18, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;

                }
                }
                break;
            case OPEN_BOX:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:68:4: expression
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_datatype489);
                    expression29=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression29.getTree());

                    }
                    break;
                case 2 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:69:4: function
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_datatype494);
                    function30=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function30.getTree());

                    }
                    break;
                case 3 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:70:5: array
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_datatype500);
                    array31=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array31.getTree());

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
    // $ANTLR end "datatype"


    public static class array_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // /home/richard/Programming/RichTea/antlr/RichTea.g:73:1: array : OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX -> ^( ARRAY ( datatype )* ) ;
    public final RichTeaParser.array_return array() throws RecognitionException {
        RichTeaParser.array_return retval = new RichTeaParser.array_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OPEN_BOX32=null;
        Token COMMA34=null;
        Token CLOSE_BOX36=null;
        RichTeaParser.datatype_return datatype33 =null;

        RichTeaParser.datatype_return datatype35 =null;


        Tree OPEN_BOX32_tree=null;
        Tree COMMA34_tree=null;
        Tree CLOSE_BOX36_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BOX=new RewriteRuleTokenStream(adaptor,"token CLOSE_BOX");
        RewriteRuleTokenStream stream_OPEN_BOX=new RewriteRuleTokenStream(adaptor,"token OPEN_BOX");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:74:2: ( OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX -> ^( ARRAY ( datatype )* ) )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:74:4: OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX
            {
            OPEN_BOX32=(Token)match(input,OPEN_BOX,FOLLOW_OPEN_BOX_in_array511); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BOX.add(OPEN_BOX32);


            // /home/richard/Programming/RichTea/antlr/RichTea.g:74:13: ( datatype ( COMMA datatype )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==BOOLEAN||LA19_0==ID||LA19_0==MINUS||(LA19_0 >= NOT && LA19_0 <= OPEN_BOX)||LA19_0==OPEN_PAREN||LA19_0==STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:74:14: datatype ( COMMA datatype )*
                    {
                    pushFollow(FOLLOW_datatype_in_array514);
                    datatype33=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_datatype.add(datatype33.getTree());

                    // /home/richard/Programming/RichTea/antlr/RichTea.g:74:23: ( COMMA datatype )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/richard/Programming/RichTea/antlr/RichTea.g:74:24: COMMA datatype
                    	    {
                    	    COMMA34=(Token)match(input,COMMA,FOLLOW_COMMA_in_array517); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA34);


                    	    pushFollow(FOLLOW_datatype_in_array519);
                    	    datatype35=datatype();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_datatype.add(datatype35.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }


            CLOSE_BOX36=(Token)match(input,CLOSE_BOX,FOLLOW_CLOSE_BOX_in_array526); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BOX.add(CLOSE_BOX36);


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
            // 75:4: -> ^( ARRAY ( datatype )* )
            {
                // /home/richard/Programming/RichTea/antlr/RichTea.g:75:7: ^( ARRAY ( datatype )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                // /home/richard/Programming/RichTea/antlr/RichTea.g:75:15: ( datatype )*
                while ( stream_datatype.hasNext() ) {
                    adaptor.addChild(root_1, stream_datatype.nextTree());

                }
                stream_datatype.reset();

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


    public static class expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /home/richard/Programming/RichTea/antlr/RichTea.g:80:1: expression : ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression );
    public final RichTeaParser.expression_return expression() throws RecognitionException {
        RichTeaParser.expression_return retval = new RichTeaParser.expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token QUESTION_MARK38=null;
        Token COLON40=null;
        RichTeaParser.logical_expression_return logical_expression37 =null;

        RichTeaParser.logical_expression_return logical_expression39 =null;

        RichTeaParser.logical_expression_return logical_expression41 =null;

        RichTeaParser.logical_expression_return logical_expression42 =null;


        Tree QUESTION_MARK38_tree=null;
        Tree COLON40_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_logical_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_expression");
        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:81:2: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:81:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
                    {
                    pushFollow(FOLLOW_logical_expression_in_expression554);
                    logical_expression37=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression37.getTree());

                    // /home/richard/Programming/RichTea/antlr/RichTea.g:81:23: ( QUESTION_MARK logical_expression COLON logical_expression )
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:81:24: QUESTION_MARK logical_expression COLON logical_expression
                    {
                    QUESTION_MARK38=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_expression557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK38);


                    pushFollow(FOLLOW_logical_expression_in_expression559);
                    logical_expression39=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression39.getTree());

                    COLON40=(Token)match(input,COLON,FOLLOW_COLON_in_expression561); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON40);


                    pushFollow(FOLLOW_logical_expression_in_expression563);
                    logical_expression41=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression41.getTree());

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
                    // 81:83: -> ^( TERNARY_OPERATOR ( logical_expression )+ )
                    {
                        // /home/richard/Programming/RichTea/antlr/RichTea.g:81:86: ^( TERNARY_OPERATOR ( logical_expression )+ )
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
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:82:4: logical_expression
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_logical_expression_in_expression578);
                    logical_expression42=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression42.getTree());

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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:85:1: logical_expression : boolean_expression ( OR ^ boolean_expression )* ;
    public final RichTeaParser.logical_expression_return logical_expression() throws RecognitionException {
        RichTeaParser.logical_expression_return retval = new RichTeaParser.logical_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OR44=null;
        RichTeaParser.boolean_expression_return boolean_expression43 =null;

        RichTeaParser.boolean_expression_return boolean_expression45 =null;


        Tree OR44_tree=null;

        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:86:2: ( boolean_expression ( OR ^ boolean_expression )* )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:86:4: boolean_expression ( OR ^ boolean_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_boolean_expression_in_logical_expression590);
            boolean_expression43=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression43.getTree());

            // /home/richard/Programming/RichTea/antlr/RichTea.g:86:23: ( OR ^ boolean_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==OR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:86:24: OR ^ boolean_expression
            	    {
            	    OR44=(Token)match(input,OR,FOLLOW_OR_in_logical_expression593); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR44_tree = 
            	    (Tree)adaptor.create(OR44)
            	    ;
            	    root_0 = (Tree)adaptor.becomeRoot(OR44_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_boolean_expression_in_logical_expression596);
            	    boolean_expression45=boolean_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression45.getTree());

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
    // $ANTLR end "logical_expression"


    public static class boolean_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_expression"
    // /home/richard/Programming/RichTea/antlr/RichTea.g:89:1: boolean_expression : equality_expression ( AND ^ equality_expression )* ;
    public final RichTeaParser.boolean_expression_return boolean_expression() throws RecognitionException {
        RichTeaParser.boolean_expression_return retval = new RichTeaParser.boolean_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token AND47=null;
        RichTeaParser.equality_expression_return equality_expression46 =null;

        RichTeaParser.equality_expression_return equality_expression48 =null;


        Tree AND47_tree=null;

        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:90:2: ( equality_expression ( AND ^ equality_expression )* )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:90:4: equality_expression ( AND ^ equality_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_boolean_expression609);
            equality_expression46=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression46.getTree());

            // /home/richard/Programming/RichTea/antlr/RichTea.g:90:24: ( AND ^ equality_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==AND) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:90:25: AND ^ equality_expression
            	    {
            	    AND47=(Token)match(input,AND,FOLLOW_AND_in_boolean_expression612); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND47_tree = 
            	    (Tree)adaptor.create(AND47)
            	    ;
            	    root_0 = (Tree)adaptor.becomeRoot(AND47_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equality_expression_in_boolean_expression615);
            	    equality_expression48=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression48.getTree());

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
    // $ANTLR end "boolean_expression"


    public static class equality_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_expression"
    // /home/richard/Programming/RichTea/antlr/RichTea.g:93:1: equality_expression : relational_expression ( ( EQ | NEQ ) ^ relational_expression )* ;
    public final RichTeaParser.equality_expression_return equality_expression() throws RecognitionException {
        RichTeaParser.equality_expression_return retval = new RichTeaParser.equality_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set50=null;
        RichTeaParser.relational_expression_return relational_expression49 =null;

        RichTeaParser.relational_expression_return relational_expression51 =null;


        Tree set50_tree=null;

        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:94:2: ( relational_expression ( ( EQ | NEQ ) ^ relational_expression )* )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:94:4: relational_expression ( ( EQ | NEQ ) ^ relational_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression629);
            relational_expression49=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression49.getTree());

            // /home/richard/Programming/RichTea/antlr/RichTea.g:94:26: ( ( EQ | NEQ ) ^ relational_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==EQ||LA23_0==NEQ) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:94:27: ( EQ | NEQ ) ^ relational_expression
            	    {
            	    set50=(Token)input.LT(1);

            	    set50=(Token)input.LT(1);

            	    if ( input.LA(1)==EQ||input.LA(1)==NEQ ) {
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


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression643);
            	    relational_expression51=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression51.getTree());

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
    // $ANTLR end "equality_expression"


    public static class relational_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_expression"
    // /home/richard/Programming/RichTea/antlr/RichTea.g:97:1: relational_expression : additive_expression ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )* ;
    public final RichTeaParser.relational_expression_return relational_expression() throws RecognitionException {
        RichTeaParser.relational_expression_return retval = new RichTeaParser.relational_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set53=null;
        RichTeaParser.additive_expression_return additive_expression52 =null;

        RichTeaParser.additive_expression_return additive_expression54 =null;


        Tree set53_tree=null;

        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:98:2: ( additive_expression ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )* )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:98:4: additive_expression ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_relational_expression657);
            additive_expression52=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression52.getTree());

            // /home/richard/Programming/RichTea/antlr/RichTea.g:98:24: ( ( LT | LTEQ | GT | GTEQ ) ^ additive_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= GT && LA24_0 <= GTEQ)||(LA24_0 >= LT && LA24_0 <= LTEQ)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:98:25: ( LT | LTEQ | GT | GTEQ ) ^ additive_expression
            	    {
            	    set53=(Token)input.LT(1);

            	    set53=(Token)input.LT(1);

            	    if ( (input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot(
            	        (Tree)adaptor.create(set53)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additive_expression_in_relational_expression679);
            	    additive_expression54=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression54.getTree());

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
    // $ANTLR end "relational_expression"


    public static class additive_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additive_expression"
    // /home/richard/Programming/RichTea/antlr/RichTea.g:101:1: additive_expression : multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )* ;
    public final RichTeaParser.additive_expression_return additive_expression() throws RecognitionException {
        RichTeaParser.additive_expression_return retval = new RichTeaParser.additive_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set56=null;
        RichTeaParser.multiplicative_expression_return multiplicative_expression55 =null;

        RichTeaParser.multiplicative_expression_return multiplicative_expression57 =null;


        Tree set56_tree=null;

        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:102:2: ( multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )* )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:102:4: multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression693);
            multiplicative_expression55=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression55.getTree());

            // /home/richard/Programming/RichTea/antlr/RichTea.g:102:30: ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0 >= MINUS && LA25_0 <= MINUS_EQUALS)||(LA25_0 >= PLUS && LA25_0 <= PLUS_EQUALS)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:102:31: ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) ^ multiplicative_expression
            	    {
            	    set56=(Token)input.LT(1);

            	    set56=(Token)input.LT(1);

            	    if ( (input.LA(1) >= MINUS && input.LA(1) <= MINUS_EQUALS)||(input.LA(1) >= PLUS && input.LA(1) <= PLUS_EQUALS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot(
            	        (Tree)adaptor.create(set56)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression715);
            	    multiplicative_expression57=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression57.getTree());

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
    // $ANTLR end "additive_expression"


    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicative_expression"
    // /home/richard/Programming/RichTea/antlr/RichTea.g:105:1: multiplicative_expression : power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )* ;
    public final RichTeaParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        RichTeaParser.multiplicative_expression_return retval = new RichTeaParser.multiplicative_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set59=null;
        RichTeaParser.power_expression_return power_expression58 =null;

        RichTeaParser.power_expression_return power_expression60 =null;


        Tree set59_tree=null;

        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:106:2: ( power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )* )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:106:4: power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_power_expression_in_multiplicative_expression729);
            power_expression58=power_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression58.getTree());

            // /home/richard/Programming/RichTea/antlr/RichTea.g:106:21: ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0 >= DIVIDE && LA26_0 <= DIVIDE_EQUALS)||(LA26_0 >= MODULUS && LA26_0 <= MULTIPLY_EQUALS)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:106:22: ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) ^ power_expression
            	    {
            	    set59=(Token)input.LT(1);

            	    set59=(Token)input.LT(1);

            	    if ( (input.LA(1) >= DIVIDE && input.LA(1) <= DIVIDE_EQUALS)||(input.LA(1) >= MODULUS && input.LA(1) <= MULTIPLY_EQUALS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot(
            	        (Tree)adaptor.create(set59)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_power_expression_in_multiplicative_expression755);
            	    power_expression60=power_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression60.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:109:1: power_expression : unary_expression ( POWER ^ unary_expression )* ;
    public final RichTeaParser.power_expression_return power_expression() throws RecognitionException {
        RichTeaParser.power_expression_return retval = new RichTeaParser.power_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token POWER62=null;
        RichTeaParser.unary_expression_return unary_expression61 =null;

        RichTeaParser.unary_expression_return unary_expression63 =null;


        Tree POWER62_tree=null;

        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:110:2: ( unary_expression ( POWER ^ unary_expression )* )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:110:4: unary_expression ( POWER ^ unary_expression )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_unary_expression_in_power_expression769);
            unary_expression61=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression61.getTree());

            // /home/richard/Programming/RichTea/antlr/RichTea.g:110:21: ( POWER ^ unary_expression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==POWER) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:110:23: POWER ^ unary_expression
            	    {
            	    POWER62=(Token)match(input,POWER,FOLLOW_POWER_in_power_expression773); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER62_tree = 
            	    (Tree)adaptor.create(POWER62)
            	    ;
            	    root_0 = (Tree)adaptor.becomeRoot(POWER62_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_unary_expression_in_power_expression776);
            	    unary_expression63=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression63.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:113:1: unary_expression : ( primary_expression | NOT ^ primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) );
    public final RichTeaParser.unary_expression_return unary_expression() throws RecognitionException {
        RichTeaParser.unary_expression_return retval = new RichTeaParser.unary_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token NOT65=null;
        Token MINUS67=null;
        RichTeaParser.primary_expression_return primary_expression64 =null;

        RichTeaParser.primary_expression_return primary_expression66 =null;

        RichTeaParser.primary_expression_return primary_expression68 =null;


        Tree NOT65_tree=null;
        Tree MINUS67_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:114:2: ( primary_expression | NOT ^ primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
            case ID:
            case NUMBER:
            case OPEN_PAREN:
            case STRING:
                {
                alt28=1;
                }
                break;
            case NOT:
                {
                alt28=2;
                }
                break;
            case MINUS:
                {
                alt28=3;
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
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:114:4: primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_primary_expression_in_unary_expression789);
                    primary_expression64=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression64.getTree());

                    }
                    break;
                case 2 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:115:4: NOT ^ primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();


                    NOT65=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT65_tree = 
                    (Tree)adaptor.create(NOT65)
                    ;
                    root_0 = (Tree)adaptor.becomeRoot(NOT65_tree, root_0);
                    }

                    pushFollow(FOLLOW_primary_expression_in_unary_expression797);
                    primary_expression66=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression66.getTree());

                    }
                    break;
                case 3 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:116:4: MINUS primary_expression
                    {
                    MINUS67=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression802); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS67);


                    pushFollow(FOLLOW_primary_expression_in_unary_expression804);
                    primary_expression68=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression68.getTree());

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
                    // 116:29: -> ^( NEGATE primary_expression )
                    {
                        // /home/richard/Programming/RichTea/antlr/RichTea.g:116:32: ^( NEGATE primary_expression )
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
    // /home/richard/Programming/RichTea/antlr/RichTea.g:119:1: primary_expression : ( expression_value | OPEN_PAREN ! logical_expression CLOSE_PAREN !);
    public final RichTeaParser.primary_expression_return primary_expression() throws RecognitionException {
        RichTeaParser.primary_expression_return retval = new RichTeaParser.primary_expression_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OPEN_PAREN70=null;
        Token CLOSE_PAREN72=null;
        RichTeaParser.expression_value_return expression_value69 =null;

        RichTeaParser.logical_expression_return logical_expression71 =null;


        Tree OPEN_PAREN70_tree=null;
        Tree CLOSE_PAREN72_tree=null;

        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:120:2: ( expression_value | OPEN_PAREN ! logical_expression CLOSE_PAREN !)
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==BOOLEAN||LA29_0==ID||LA29_0==NUMBER||LA29_0==STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==OPEN_PAREN) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:120:4: expression_value
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_expression_value_in_primary_expression824);
                    expression_value69=expression_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_value69.getTree());

                    }
                    break;
                case 2 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:121:4: OPEN_PAREN ! logical_expression CLOSE_PAREN !
                    {
                    root_0 = (Tree)adaptor.nil();


                    OPEN_PAREN70=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_primary_expression829); if (state.failed) return retval;

                    pushFollow(FOLLOW_logical_expression_in_primary_expression832);
                    logical_expression71=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression71.getTree());

                    CLOSE_PAREN72=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_primary_expression834); if (state.failed) return retval;

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


    public static class expression_value_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_value"
    // /home/richard/Programming/RichTea/antlr/RichTea.g:124:1: expression_value : ( NUMBER | BOOLEAN | STRING | variable | function );
    public final RichTeaParser.expression_value_return expression_value() throws RecognitionException {
        RichTeaParser.expression_value_return retval = new RichTeaParser.expression_value_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token NUMBER73=null;
        Token BOOLEAN74=null;
        Token STRING75=null;
        RichTeaParser.variable_return variable76 =null;

        RichTeaParser.function_return function77 =null;


        Tree NUMBER73_tree=null;
        Tree BOOLEAN74_tree=null;
        Tree STRING75_tree=null;

        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:125:2: ( NUMBER | BOOLEAN | STRING | variable | function )
            int alt30=5;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt30=1;
                }
                break;
            case BOOLEAN:
                {
                alt30=2;
                }
                break;
            case STRING:
                {
                alt30=3;
                }
                break;
            case ID:
                {
                int LA30_4 = input.LA(2);

                if ( (LA30_4==EOF||LA30_4==AND||LA30_4==CLOSE_BOX||(LA30_4 >= CLOSE_PAREN && LA30_4 <= COMMA)||(LA30_4 >= DIVIDE && LA30_4 <= EQ)||(LA30_4 >= GT && LA30_4 <= ID)||(LA30_4 >= LT && LA30_4 <= MULTIPLY_EQUALS)||LA30_4==NEQ||LA30_4==OPEN_BRACE||(LA30_4 >= OR && LA30_4 <= QUESTION_MARK)||LA30_4==STRING) ) {
                    alt30=4;
                }
                else if ( (LA30_4==OPEN_PAREN) ) {
                    alt30=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:125:4: NUMBER
                    {
                    root_0 = (Tree)adaptor.nil();


                    NUMBER73=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expression_value846); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER73_tree = 
                    (Tree)adaptor.create(NUMBER73)
                    ;
                    adaptor.addChild(root_0, NUMBER73_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:126:4: BOOLEAN
                    {
                    root_0 = (Tree)adaptor.nil();


                    BOOLEAN74=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expression_value851); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN74_tree = 
                    (Tree)adaptor.create(BOOLEAN74)
                    ;
                    adaptor.addChild(root_0, BOOLEAN74_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:127:4: STRING
                    {
                    root_0 = (Tree)adaptor.nil();


                    STRING75=(Token)match(input,STRING,FOLLOW_STRING_in_expression_value856); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING75_tree = 
                    (Tree)adaptor.create(STRING75)
                    ;
                    adaptor.addChild(root_0, STRING75_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:128:5: variable
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_variable_in_expression_value862);
                    variable76=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable76.getTree());

                    }
                    break;
                case 5 :
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:129:4: function
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_expression_value867);
                    function77=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function77.getTree());

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
    // $ANTLR end "expression_value"


    public static class variable_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // /home/richard/Programming/RichTea/antlr/RichTea.g:132:1: variable : ( ID ( PERIOD ID )* ) -> ^( VARIABLE ( ^( ID ) )+ ) ;
    public final RichTeaParser.variable_return variable() throws RecognitionException {
        RichTeaParser.variable_return retval = new RichTeaParser.variable_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID78=null;
        Token PERIOD79=null;
        Token ID80=null;

        Tree ID78_tree=null;
        Tree PERIOD79_tree=null;
        Tree ID80_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:133:2: ( ( ID ( PERIOD ID )* ) -> ^( VARIABLE ( ^( ID ) )+ ) )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:133:4: ( ID ( PERIOD ID )* )
            {
            // /home/richard/Programming/RichTea/antlr/RichTea.g:133:4: ( ID ( PERIOD ID )* )
            // /home/richard/Programming/RichTea/antlr/RichTea.g:133:5: ID ( PERIOD ID )*
            {
            ID78=(Token)match(input,ID,FOLLOW_ID_in_variable880); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID78);


            // /home/richard/Programming/RichTea/antlr/RichTea.g:133:8: ( PERIOD ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==PERIOD) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/richard/Programming/RichTea/antlr/RichTea.g:133:9: PERIOD ID
            	    {
            	    PERIOD79=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_variable883); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD79);


            	    ID80=(Token)match(input,ID,FOLLOW_ID_in_variable885); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID80);


            	    }
            	    break;

            	default :
            	    break loop31;
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
            // 134:4: -> ^( VARIABLE ( ^( ID ) )+ )
            {
                // /home/richard/Programming/RichTea/antlr/RichTea.g:134:7: ^( VARIABLE ( ^( ID ) )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(VARIABLE, "VARIABLE")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    // /home/richard/Programming/RichTea/antlr/RichTea.g:134:18: ^( ID )
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

    // $ANTLR start synpred3_RichTea
    public final void synpred3_RichTea_fragment() throws RecognitionException {
        // /home/richard/Programming/RichTea/antlr/RichTea.g:29:19: ( function_data )
        // /home/richard/Programming/RichTea/antlr/RichTea.g:29:19: function_data
        {
        pushFollow(FOLLOW_function_data_in_synpred3_RichTea193);
        function_data();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_RichTea

    // $ANTLR start synpred5_RichTea
    public final void synpred5_RichTea_fragment() throws RecognitionException {
        List list_=null;
        RuleReturnScope attributes  = null;
        // /home/richard/Programming/RichTea/antlr/RichTea.g:38:14: (attributes+= implicitAttribute )
        // /home/richard/Programming/RichTea/antlr/RichTea.g:38:14: attributes+= implicitAttribute
        {
        pushFollow(FOLLOW_implicitAttribute_in_synpred5_RichTea246);
        attributes=implicitAttribute();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_RichTea

    // $ANTLR start synpred7_RichTea
    public final void synpred7_RichTea_fragment() throws RecognitionException {
        List list_=null;
        RuleReturnScope attributes = null;
        // /home/richard/Programming/RichTea/antlr/RichTea.g:38:36: ( ( COMMA )? attributes+= attribute )
        // /home/richard/Programming/RichTea/antlr/RichTea.g:38:36: ( COMMA )? attributes+= attribute
        {
        // /home/richard/Programming/RichTea/antlr/RichTea.g:38:36: ( COMMA )?
        int alt32=2;
        int LA32_0 = input.LA(1);

        if ( (LA32_0==COMMA) ) {
            alt32=1;
        }
        switch (alt32) {
            case 1 :
                // /home/richard/Programming/RichTea/antlr/RichTea.g:38:36: COMMA
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred7_RichTea250); if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_attribute_in_synpred7_RichTea255);
        attributes=attribute();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_RichTea

    // $ANTLR start synpred17_RichTea
    public final void synpred17_RichTea_fragment() throws RecognitionException {
        // /home/richard/Programming/RichTea/antlr/RichTea.g:68:4: ( expression )
        // /home/richard/Programming/RichTea/antlr/RichTea.g:68:4: expression
        {
        pushFollow(FOLLOW_expression_in_synpred17_RichTea489);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_RichTea

    // $ANTLR start synpred18_RichTea
    public final void synpred18_RichTea_fragment() throws RecognitionException {
        // /home/richard/Programming/RichTea/antlr/RichTea.g:69:4: ( function )
        // /home/richard/Programming/RichTea/antlr/RichTea.g:69:4: function
        {
        pushFollow(FOLLOW_function_in_synpred18_RichTea494);
        function();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_RichTea

    // $ANTLR start synpred21_RichTea
    public final void synpred21_RichTea_fragment() throws RecognitionException {
        // /home/richard/Programming/RichTea/antlr/RichTea.g:81:4: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) )
        // /home/richard/Programming/RichTea/antlr/RichTea.g:81:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
        {
        pushFollow(FOLLOW_logical_expression_in_synpred21_RichTea554);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        // /home/richard/Programming/RichTea/antlr/RichTea.g:81:23: ( QUESTION_MARK logical_expression COLON logical_expression )
        // /home/richard/Programming/RichTea/antlr/RichTea.g:81:24: QUESTION_MARK logical_expression COLON logical_expression
        {
        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred21_RichTea557); if (state.failed) return ;

        pushFollow(FOLLOW_logical_expression_in_synpred21_RichTea559);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred21_RichTea561); if (state.failed) return ;

        pushFollow(FOLLOW_logical_expression_in_synpred21_RichTea563);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred21_RichTea

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
    public final boolean synpred21_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_RichTea_fragment(); // can never throw exception
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


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\133\uffff";
    static final String DFA20_eofS =
        "\1\uffff\4\20\126\uffff";
    static final String DFA20_minS =
        "\1\11\4\4\3\11\7\0\11\uffff\7\0\11\uffff\7\0\11\uffff\10\0\1\uffff"+
        "\1\0\10\uffff\21\0";
    static final String DFA20_maxS =
        "\10\65\7\0\11\uffff\7\0\11\uffff\7\0\11\uffff\10\0\1\uffff\1\0\10"+
        "\uffff\21\0";
    static final String DFA20_acceptS =
        "\17\uffff\1\1\1\2\112\uffff";
    static final String DFA20_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\11\uffff\1\7\1\10\1\11\1\12"+
        "\1\13\1\14\1\15\11\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\11\uffff"+
        "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\uffff\1\35\10\uffff\1"+
        "\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
        "\1\53\1\54\1\55\1\56}>";
    static final String[] DFA20_transitionS = {
            "\1\2\22\uffff\1\4\4\uffff\1\7\7\uffff\1\6\1\1\2\uffff\1\5\7"+
            "\uffff\1\3",
            "\1\15\10\uffff\1\20\1\uffff\1\20\1\uffff\1\20\1\uffff\2\11"+
            "\1\14\3\uffff\2\13\2\20\2\uffff\2\13\2\12\3\11\2\uffff\1\14"+
            "\3\uffff\1\20\1\uffff\1\16\1\uffff\2\12\1\10\1\17\1\uffff\1"+
            "\20",
            "\1\35\10\uffff\1\20\1\uffff\1\20\1\uffff\1\20\1\uffff\2\31"+
            "\1\34\3\uffff\2\33\2\20\2\uffff\2\33\2\32\3\31\2\uffff\1\34"+
            "\3\uffff\1\20\1\uffff\1\36\1\uffff\2\32\1\30\1\17\1\uffff\1"+
            "\20",
            "\1\55\10\uffff\1\20\1\uffff\1\20\1\uffff\1\20\1\uffff\2\51"+
            "\1\54\3\uffff\2\53\2\20\2\uffff\2\53\2\52\3\51\2\uffff\1\54"+
            "\3\uffff\1\20\1\uffff\1\56\1\uffff\2\52\1\50\1\17\1\uffff\1"+
            "\20",
            "\1\76\10\uffff\1\20\1\uffff\1\20\1\uffff\1\20\1\uffff\2\72"+
            "\1\75\3\uffff\2\74\2\20\2\uffff\2\74\2\73\3\72\2\uffff\1\75"+
            "\3\uffff\1\20\1\101\1\77\1\70\2\73\1\71\1\17\1\uffff\1\20",
            "\1\113\22\uffff\1\115\4\uffff\1\120\7\uffff\1\117\1\112\2\uffff"+
            "\1\116\7\uffff\1\114",
            "\1\122\22\uffff\1\124\15\uffff\1\121\2\uffff\1\125\7\uffff"+
            "\1\123",
            "\1\127\22\uffff\1\131\15\uffff\1\126\2\uffff\1\132\7\uffff"+
            "\1\130",
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
            "\1\uffff"
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
            return "80:1: expression : ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_8);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA20_9 = input.LA(1);

                         
                        int index20_9 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_9);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA20_10 = input.LA(1);

                         
                        int index20_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_10);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA20_11 = input.LA(1);

                         
                        int index20_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_11);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA20_12 = input.LA(1);

                         
                        int index20_12 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_12);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA20_13 = input.LA(1);

                         
                        int index20_13 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_13);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA20_14 = input.LA(1);

                         
                        int index20_14 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_14);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA20_24 = input.LA(1);

                         
                        int index20_24 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_24);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA20_25 = input.LA(1);

                         
                        int index20_25 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_25);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA20_26 = input.LA(1);

                         
                        int index20_26 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_26);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA20_27 = input.LA(1);

                         
                        int index20_27 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_27);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA20_28 = input.LA(1);

                         
                        int index20_28 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_28);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA20_29 = input.LA(1);

                         
                        int index20_29 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_29);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA20_30 = input.LA(1);

                         
                        int index20_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_30);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA20_40 = input.LA(1);

                         
                        int index20_40 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_40);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA20_41 = input.LA(1);

                         
                        int index20_41 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_41);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA20_42 = input.LA(1);

                         
                        int index20_42 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_42);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA20_43 = input.LA(1);

                         
                        int index20_43 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_43);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA20_44 = input.LA(1);

                         
                        int index20_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_44);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA20_45 = input.LA(1);

                         
                        int index20_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_45);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA20_46 = input.LA(1);

                         
                        int index20_46 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_46);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA20_56 = input.LA(1);

                         
                        int index20_56 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_56);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA20_57 = input.LA(1);

                         
                        int index20_57 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_57);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA20_58 = input.LA(1);

                         
                        int index20_58 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_58);

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA20_59 = input.LA(1);

                         
                        int index20_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_59);

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA20_60 = input.LA(1);

                         
                        int index20_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_60);

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA20_61 = input.LA(1);

                         
                        int index20_61 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_61);

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA20_62 = input.LA(1);

                         
                        int index20_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_62);

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA20_63 = input.LA(1);

                         
                        int index20_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_63);

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA20_65 = input.LA(1);

                         
                        int index20_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_65);

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA20_74 = input.LA(1);

                         
                        int index20_74 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_74);

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA20_75 = input.LA(1);

                         
                        int index20_75 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_75);

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA20_76 = input.LA(1);

                         
                        int index20_76 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_76);

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA20_77 = input.LA(1);

                         
                        int index20_77 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_77);

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA20_78 = input.LA(1);

                         
                        int index20_78 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_78);

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA20_79 = input.LA(1);

                         
                        int index20_79 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_79);

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA20_80 = input.LA(1);

                         
                        int index20_80 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_80);

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA20_81 = input.LA(1);

                         
                        int index20_81 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_81);

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA20_82 = input.LA(1);

                         
                        int index20_82 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_82);

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA20_83 = input.LA(1);

                         
                        int index20_83 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_83);

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA20_84 = input.LA(1);

                         
                        int index20_84 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_84);

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA20_85 = input.LA(1);

                         
                        int index20_85 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_85);

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA20_86 = input.LA(1);

                         
                        int index20_86 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_86);

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA20_87 = input.LA(1);

                         
                        int index20_87 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_87);

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA20_88 = input.LA(1);

                         
                        int index20_88 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_88);

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA20_89 = input.LA(1);

                         
                        int index20_89 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_89);

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA20_90 = input.LA(1);

                         
                        int index20_90 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred21_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index20_90);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_function_scope_in_program132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_function_scope145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function_scope151 = new BitSet(new long[]{0x00203E0218020200L});
    public static final BitSet FOLLOW_function_data_in_function_scope153 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function_scope155 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function_scope157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function188 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function191 = new BitSet(new long[]{0x00203E0218028200L});
    public static final BitSet FOLLOW_function_data_in_function193 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function196 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_list_in_function_data229 = new BitSet(new long[]{0x0020100018020000L});
    public static final BitSet FOLLOW_branch_list_in_function_data231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitAttribute_in_attribute_list246 = new BitSet(new long[]{0x0000000010020002L});
    public static final BitSet FOLLOW_COMMA_in_attribute_list250 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_attribute_in_attribute_list255 = new BitSet(new long[]{0x0000000010020002L});
    public static final BitSet FOLLOW_ID_in_attribute286 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_COLON_in_attribute289 = new BitSet(new long[]{0x00202E0210000200L});
    public static final BitSet FOLLOW_ASSIGN_in_attribute293 = new BitSet(new long[]{0x00202E0210000200L});
    public static final BitSet FOLLOW_datatype_in_attribute297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_implicitAttribute326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBranch_in_branch_list359 = new BitSet(new long[]{0x0020000018020002L});
    public static final BitSet FOLLOW_COMMA_in_branch_list363 = new BitSet(new long[]{0x0020000018000000L});
    public static final BitSet FOLLOW_branch_in_branch_list368 = new BitSet(new long[]{0x0020000018020002L});
    public static final BitSet FOLLOW_HASH_in_branch400 = new BitSet(new long[]{0x0020000010000000L});
    public static final BitSet FOLLOW_ID_in_branch406 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_STRING_in_branch412 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_branch415 = new BitSet(new long[]{0x0000200010004000L});
    public static final BitSet FOLLOW_function_scope_in_branch417 = new BitSet(new long[]{0x0000200010004000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_branch420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_implicitBranch451 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_implicitBranch454 = new BitSet(new long[]{0x0000200010004000L});
    public static final BitSet FOLLOW_function_scope_in_implicitBranch456 = new BitSet(new long[]{0x0000200010004000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_implicitBranch459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_datatype489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_datatype494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_datatype500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BOX_in_array511 = new BitSet(new long[]{0x00202E0210002200L});
    public static final BitSet FOLLOW_datatype_in_array514 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_COMMA_in_array517 = new BitSet(new long[]{0x00202E0210000200L});
    public static final BitSet FOLLOW_datatype_in_array519 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_CLOSE_BOX_in_array526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression554 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_expression557 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_logical_expression_in_expression559 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_expression561 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_logical_expression_in_expression563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression590 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_OR_in_logical_expression593 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression596 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression609 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolean_expression612 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression615 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression629 = new BitSet(new long[]{0x0000010000200002L});
    public static final BitSet FOLLOW_set_in_equality_expression632 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression643 = new BitSet(new long[]{0x0000010000200002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression657 = new BitSet(new long[]{0x0000000186000002L});
    public static final BitSet FOLLOW_set_in_relational_expression660 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression679 = new BitSet(new long[]{0x0000000186000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression693 = new BitSet(new long[]{0x0003000600000002L});
    public static final BitSet FOLLOW_set_in_additive_expression696 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression715 = new BitSet(new long[]{0x0003000600000002L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression729 = new BitSet(new long[]{0x0000003800180002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression732 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression755 = new BitSet(new long[]{0x0000003800180002L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression769 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_POWER_in_power_expression773 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression776 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expression794 = new BitSet(new long[]{0x0020240010000200L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression802 = new BitSet(new long[]{0x0020240010000200L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_value_in_primary_expression824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_primary_expression829 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_logical_expression_in_primary_expression832 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_primary_expression834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expression_value846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_expression_value851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expression_value856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_expression_value862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_expression_value867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable880 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_PERIOD_in_variable883 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_variable885 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_function_data_in_synpred3_RichTea193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitAttribute_in_synpred5_RichTea246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred7_RichTea250 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_attribute_in_synpred7_RichTea255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred17_RichTea489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred18_RichTea494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_synpred21_RichTea554 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred21_RichTea557 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_logical_expression_in_synpred21_RichTea559 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_synpred21_RichTea561 = new BitSet(new long[]{0x0020260210000200L});
    public static final BitSet FOLLOW_logical_expression_in_synpred21_RichTea563 = new BitSet(new long[]{0x0000000000000002L});

}