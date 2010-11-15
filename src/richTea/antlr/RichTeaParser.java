// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g 2010-11-15 23:42:43
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "CHILDREN", "ATTRIBUTES", "ATTRIBUTE", "NAME", "VALUE", "BRANCHES", "BRANCH", "ARRAY", "VARIABLE", "TERNARY_OPERATOR", "NEGATE", "ID", "OPEN_PAREN", "CLOSE_PAREN", "SEMI_COLON", "COMMA", "COLON", "ASSIGN", "HASH", "STRING", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BOX", "CLOSE_BOX", "QUESTION_MARK", "OR", "AND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "PLUS_EQUALS", "MINUS_EQUALS", "PLUS", "MINUS", "MULTIPLY_EQUALS", "DIVIDE_EQUALS", "MULTIPLY", "DIVIDE", "MODULUS", "POWER", "NOT", "NUMBER", "BOOLEAN", "PERIOD", "INTEGER", "FLOAT", "ESC_SEQ", "LETTER", "COMMENT", "WHITESPACE"
    };
    public static final int FUNCTION=4;
    public static final int MINUS_EQUALS=39;
    public static final int LT=34;
    public static final int ATTRIBUTES=6;
    public static final int CHILDREN=5;
    public static final int LETTER=55;
    public static final int ATTRIBUTE=7;
    public static final int LTEQ=35;
    public static final int FLOAT=53;
    public static final int NOT=48;
    public static final int BRANCHES=10;
    public static final int ID=16;
    public static final int AND=31;
    public static final int EOF=-1;
    public static final int NAME=8;
    public static final int ESC_SEQ=54;
    public static final int BOOLEAN=50;
    public static final int MULTIPLY=44;
    public static final int COMMA=20;
    public static final int MULTIPLY_EQUALS=42;
    public static final int QUESTION_MARK=29;
    public static final int PLUS=40;
    public static final int CLOSE_PAREN=18;
    public static final int EQ=32;
    public static final int COMMENT=56;
    public static final int ARRAY=12;
    public static final int DIVIDE=45;
    public static final int INTEGER=52;
    public static final int TERNARY_OPERATOR=14;
    public static final int PERIOD=51;
    public static final int NUMBER=49;
    public static final int HASH=23;
    public static final int WHITESPACE=57;
    public static final int POWER=47;
    public static final int OPEN_PAREN=17;
    public static final int NEGATE=15;
    public static final int SEMI_COLON=19;
    public static final int CLOSE_BRACE=26;
    public static final int VALUE=9;
    public static final int GTEQ=37;
    public static final int MINUS=41;
    public static final int DIVIDE_EQUALS=43;
    public static final int OPEN_BOX=27;
    public static final int COLON=21;
    public static final int CLOSE_BOX=28;
    public static final int NEQ=33;
    public static final int VARIABLE=13;
    public static final int MODULUS=46;
    public static final int OR=30;
    public static final int BRANCH=11;
    public static final int ASSIGN=22;
    public static final int GT=36;
    public static final int PLUS_EQUALS=38;
    public static final int OPEN_BRACE=25;
    public static final int STRING=24;

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:18:1: program : function ;
    public final RichTeaParser.program_return program() throws RecognitionException {
        RichTeaParser.program_return retval = new RichTeaParser.program_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.function_return function1 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:19:2: ( function )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:19:4: function
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_function_in_program132);
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:22:1: function : ( ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ( function_data )? ) | OPEN_PAREN function_data CLOSE_PAREN ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data ) );
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
        RichTeaParser.function_data_return function_data4 = null;

        RichTeaParser.function_data_return function_data8 = null;


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
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:2: ( ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ( function_data )? ) | OPEN_PAREN function_data CLOSE_PAREN ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data ) )
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:4: ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN )? ( SEMI_COLON )?
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_function144); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID2);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:7: ( OPEN_PAREN ( function_data )? CLOSE_PAREN )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:8: OPEN_PAREN ( function_data )? CLOSE_PAREN
                            {
                            OPEN_PAREN3=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function147); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN3);

                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:19: ( function_data )?
                            int alt1=2;
                            alt1 = dfa1.predict(input);
                            switch (alt1) {
                                case 1 :
                                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function_data
                                    {
                                    pushFollow(FOLLOW_function_data_in_function149);
                                    function_data4=function_data();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_function_data.add(function_data4.getTree());

                                    }
                                    break;

                            }

                            CLOSE_PAREN5=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function152); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN5);


                            }
                            break;

                    }

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:48: ( SEMI_COLON )?
                    int alt3=2;
                    alt3 = dfa3.predict(input);
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: SEMI_COLON
                            {
                            SEMI_COLON6=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function156); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON6);


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
                    // 24:4: -> ^( FUNCTION ^( NAME ID ) ( function_data )? )
                    {
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:7: ^( FUNCTION ^( NAME ID ) ( function_data )? )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:18: ^( NAME ID )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ID.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:29: ( function_data )?
                        if ( stream_function_data.hasNext() ) {
                            adaptor.addChild(root_1, stream_function_data.nextTree());

                        }
                        stream_function_data.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:26:4: OPEN_PAREN function_data CLOSE_PAREN ( SEMI_COLON )?
                    {
                    OPEN_PAREN7=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN7);

                    pushFollow(FOLLOW_function_data_in_function186);
                    function_data8=function_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_data.add(function_data8.getTree());
                    CLOSE_PAREN9=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN9);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:26:41: ( SEMI_COLON )?
                    int alt4=2;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: SEMI_COLON
                            {
                            SEMI_COLON10=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function190); if (state.failed) return retval; 
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
                    // 27:4: -> ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data )
                    {
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:27:7: ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:27:18: ^( NAME ID[\"scope\"] )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, (Tree)adaptor.create(ID, "scope"));

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_function_data.nextTree());

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

    public static class function_data_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_data"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:30:1: function_data : attribute_list branch_list ;
    public final RichTeaParser.function_data_return function_data() throws RecognitionException {
        RichTeaParser.function_data_return retval = new RichTeaParser.function_data_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.attribute_list_return attribute_list11 = null;

        RichTeaParser.branch_list_return branch_list12 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:31:2: ( attribute_list branch_list )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:31:4: attribute_list branch_list
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_attribute_list_in_function_data220);
            attribute_list11=attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute_list11.getTree());
            pushFollow(FOLLOW_branch_list_in_function_data222);
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
        }
        return retval;
    }
    // $ANTLR end "function_data"

    public static class attribute_list_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute_list"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:34:1: attribute_list : (attributes+= implicitAttribute )? ( ( COMMA )? attributes+= attribute )* -> ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* ) ;
    public final RichTeaParser.attribute_list_return attribute_list() throws RecognitionException {
        RichTeaParser.attribute_list_return retval = new RichTeaParser.attribute_list_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token COMMA13=null;
        List list_attributes=null;
        RuleReturnScope attributes = null;
        Tree COMMA13_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_implicitAttribute=new RewriteRuleSubtreeStream(adaptor,"rule implicitAttribute");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:2: ( (attributes+= implicitAttribute )? ( ( COMMA )? attributes+= attribute )* -> ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:4: (attributes+= implicitAttribute )? ( ( COMMA )? attributes+= attribute )*
            {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:14: (attributes+= implicitAttribute )?
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: attributes+= implicitAttribute
                    {
                    pushFollow(FOLLOW_implicitAttribute_in_attribute_list237);
                    attributes=implicitAttribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicitAttribute.add(attributes.getTree());
                    if (list_attributes==null) list_attributes=new ArrayList();
                    list_attributes.add(attributes.getTree());


                    }
                    break;

            }

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:35: ( ( COMMA )? attributes+= attribute )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:36: ( COMMA )? attributes+= attribute
            	    {
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:36: ( COMMA )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==COMMA) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
            	            {
            	            COMMA13=(Token)match(input,COMMA,FOLLOW_COMMA_in_attribute_list241); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA13);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_attribute_in_attribute_list246);
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
            // 36:4: -> ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:36:7: ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:36:20: ( ^( ATTRIBUTE $attributes) )*
                while ( stream_attributes.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:36:20: ^( ATTRIBUTE $attributes)
                    {
                    Tree root_2 = (Tree)adaptor.nil();
                    root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_2);

                    adaptor.addChild(root_2, stream_attributes.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_attributes.reset();

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
    // $ANTLR end "attribute_list"

    public static class attribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:39:1: attribute : ID ( COLON | ASSIGN ) datatype -> ^( NAME ID ) ^( VALUE datatype ) ;
    public final RichTeaParser.attribute_return attribute() throws RecognitionException {
        RichTeaParser.attribute_return retval = new RichTeaParser.attribute_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID14=null;
        Token COLON15=null;
        Token ASSIGN16=null;
        RichTeaParser.datatype_return datatype17 = null;


        Tree ID14_tree=null;
        Tree COLON15_tree=null;
        Tree ASSIGN16_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:2: ( ID ( COLON | ASSIGN ) datatype -> ^( NAME ID ) ^( VALUE datatype ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:4: ID ( COLON | ASSIGN ) datatype
            {
            ID14=(Token)match(input,ID,FOLLOW_ID_in_attribute277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID14);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:7: ( COLON | ASSIGN )
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:8: COLON
                    {
                    COLON15=(Token)match(input,COLON,FOLLOW_COLON_in_attribute280); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON15);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:16: ASSIGN
                    {
                    ASSIGN16=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attribute284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN16);


                    }
                    break;

            }

            pushFollow(FOLLOW_datatype_in_attribute288);
            datatype17=datatype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_datatype.add(datatype17.getTree());


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
            // 41:4: -> ^( NAME ID ) ^( VALUE datatype )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:41:7: ^( NAME ID )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:41:18: ^( VALUE datatype )
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

    public static class implicitAttribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "implicitAttribute"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:44:1: implicitAttribute : datatype -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) ;
    public final RichTeaParser.implicitAttribute_return implicitAttribute() throws RecognitionException {
        RichTeaParser.implicitAttribute_return retval = new RichTeaParser.implicitAttribute_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.datatype_return datatype18 = null;


        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:45:2: ( datatype -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:45:4: datatype
            {
            pushFollow(FOLLOW_datatype_in_implicitAttribute317);
            datatype18=datatype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_datatype.add(datatype18.getTree());


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
            // 46:4: -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:46:7: ^( NAME ID[\"implicitAttribute\"] )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, (Tree)adaptor.create(ID, "implicitAttribute"));

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:46:39: ^( VALUE datatype )
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
    // $ANTLR end "implicitAttribute"

    public static class branch_list_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "branch_list"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:49:1: branch_list : (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )* -> ^( BRANCHES ( ^( BRANCH $branches) )* ) ;
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
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:2: ( (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )* -> ^( BRANCHES ( ^( BRANCH $branches) )* ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:4: (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )*
            {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:12: (branches+= implicitBranch )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: branches+= implicitBranch
                    {
                    pushFollow(FOLLOW_implicitBranch_in_branch_list350);
                    branches=implicitBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicitBranch.add(branches.getTree());
                    if (list_branches==null) list_branches=new ArrayList();
                    list_branches.add(branches.getTree());


                    }
                    break;

            }

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:30: ( ( COMMA )? branches+= branch )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ID||LA12_0==COMMA||(LA12_0>=HASH && LA12_0<=STRING)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:31: ( COMMA )? branches+= branch
            	    {
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:31: ( COMMA )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==COMMA) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
            	            {
            	            COMMA19=(Token)match(input,COMMA,FOLLOW_COMMA_in_branch_list354); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA19);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_branch_in_branch_list359);
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
            // 51:4: -> ^( BRANCHES ( ^( BRANCH $branches) )* )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:7: ^( BRANCHES ( ^( BRANCH $branches) )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(BRANCHES, "BRANCHES"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:18: ( ^( BRANCH $branches) )*
                while ( stream_branches.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:18: ^( BRANCH $branches)
                    {
                    Tree root_2 = (Tree)adaptor.nil();
                    root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(BRANCH, "BRANCH"), root_2);

                    adaptor.addChild(root_2, stream_branches.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_branches.reset();

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
    // $ANTLR end "branch_list"

    public static class branch_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "branch"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:54:1: branch : ( HASH )? (name= ID | name= STRING ) OPEN_BRACE ( function )* CLOSE_BRACE -> ^( NAME $name) ^( CHILDREN ( function )* ) ;
    public final RichTeaParser.branch_return branch() throws RecognitionException {
        RichTeaParser.branch_return retval = new RichTeaParser.branch_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token name=null;
        Token HASH20=null;
        Token OPEN_BRACE21=null;
        Token CLOSE_BRACE23=null;
        RichTeaParser.function_return function22 = null;


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
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:2: ( ( HASH )? (name= ID | name= STRING ) OPEN_BRACE ( function )* CLOSE_BRACE -> ^( NAME $name) ^( CHILDREN ( function )* ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:4: ( HASH )? (name= ID | name= STRING ) OPEN_BRACE ( function )* CLOSE_BRACE
            {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:4: ( HASH )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==HASH) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: HASH
                    {
                    HASH20=(Token)match(input,HASH,FOLLOW_HASH_in_branch391); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HASH.add(HASH20);


                    }
                    break;

            }

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:10: (name= ID | name= STRING )
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:11: name= ID
                    {
                    name=(Token)match(input,ID,FOLLOW_ID_in_branch397); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(name);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:21: name= STRING
                    {
                    name=(Token)match(input,STRING,FOLLOW_STRING_in_branch403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(name);


                    }
                    break;

            }

            OPEN_BRACE21=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_branch406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE21);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:45: ( function )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=ID && LA15_0<=OPEN_PAREN)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_branch408);
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

            CLOSE_BRACE23=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_branch411); if (state.failed) return retval; 
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
            // 56:4: -> ^( NAME $name) ^( CHILDREN ( function )* )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:56:7: ^( NAME $name)
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, stream_name.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:56:21: ^( CHILDREN ( function )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(CHILDREN, "CHILDREN"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:56:32: ( function )*
                while ( stream_function.hasNext() ) {
                    adaptor.addChild(root_1, stream_function.nextTree());

                }
                stream_function.reset();

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
    // $ANTLR end "branch"

    public static class implicitBranch_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "implicitBranch"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:59:1: implicitBranch : ( HASH )? OPEN_BRACE ( function )* CLOSE_BRACE -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function )* ) ;
    public final RichTeaParser.implicitBranch_return implicitBranch() throws RecognitionException {
        RichTeaParser.implicitBranch_return retval = new RichTeaParser.implicitBranch_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token HASH24=null;
        Token OPEN_BRACE25=null;
        Token CLOSE_BRACE27=null;
        RichTeaParser.function_return function26 = null;


        Tree HASH24_tree=null;
        Tree OPEN_BRACE25_tree=null;
        Tree CLOSE_BRACE27_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:2: ( ( HASH )? OPEN_BRACE ( function )* CLOSE_BRACE -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function )* ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:4: ( HASH )? OPEN_BRACE ( function )* CLOSE_BRACE
            {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:4: ( HASH )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==HASH) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: HASH
                    {
                    HASH24=(Token)match(input,HASH,FOLLOW_HASH_in_implicitBranch442); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HASH.add(HASH24);


                    }
                    break;

            }

            OPEN_BRACE25=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_implicitBranch445); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE25);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:21: ( function )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=ID && LA17_0<=OPEN_PAREN)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_implicitBranch447);
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

            CLOSE_BRACE27=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_implicitBranch450); if (state.failed) return retval; 
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
            // 61:4: -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function )* )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:61:7: ^( NAME ID[\"implicitBranch\"] )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, (Tree)adaptor.create(ID, "implicitBranch"));

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:61:36: ^( CHILDREN ( function )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(CHILDREN, "CHILDREN"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:61:47: ( function )*
                while ( stream_function.hasNext() ) {
                    adaptor.addChild(root_1, stream_function.nextTree());

                }
                stream_function.reset();

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
    // $ANTLR end "implicitBranch"

    public static class datatype_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:64:1: datatype : ( expression | function | array );
    public final RichTeaParser.datatype_return datatype() throws RecognitionException {
        RichTeaParser.datatype_return retval = new RichTeaParser.datatype_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.expression_return expression28 = null;

        RichTeaParser.function_return function29 = null;

        RichTeaParser.array_return array30 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:2: ( expression | function | array )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:4: expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_datatype480);
                    expression28=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression28.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:66:4: function
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_function_in_datatype485);
                    function29=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function29.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:67:5: array
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_array_in_datatype491);
                    array30=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array30.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:70:1: array : OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX -> ^( ARRAY ( datatype )* ) ;
    public final RichTeaParser.array_return array() throws RecognitionException {
        RichTeaParser.array_return retval = new RichTeaParser.array_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_BOX31=null;
        Token COMMA33=null;
        Token CLOSE_BOX35=null;
        RichTeaParser.datatype_return datatype32 = null;

        RichTeaParser.datatype_return datatype34 = null;


        Tree OPEN_BOX31_tree=null;
        Tree COMMA33_tree=null;
        Tree CLOSE_BOX35_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BOX=new RewriteRuleTokenStream(adaptor,"token CLOSE_BOX");
        RewriteRuleTokenStream stream_OPEN_BOX=new RewriteRuleTokenStream(adaptor,"token OPEN_BOX");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:2: ( OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX -> ^( ARRAY ( datatype )* ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:4: OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX
            {
            OPEN_BOX31=(Token)match(input,OPEN_BOX,FOLLOW_OPEN_BOX_in_array502); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BOX.add(OPEN_BOX31);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:13: ( datatype ( COMMA datatype )* )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:14: datatype ( COMMA datatype )*
                    {
                    pushFollow(FOLLOW_datatype_in_array505);
                    datatype32=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_datatype.add(datatype32.getTree());
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:23: ( COMMA datatype )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:24: COMMA datatype
                    	    {
                    	    COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_array508); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA33);

                    	    pushFollow(FOLLOW_datatype_in_array510);
                    	    datatype34=datatype();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_datatype.add(datatype34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            CLOSE_BOX35=(Token)match(input,CLOSE_BOX,FOLLOW_CLOSE_BOX_in_array517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BOX.add(CLOSE_BOX35);



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
            // 72:4: -> ^( ARRAY ( datatype )* )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:7: ^( ARRAY ( datatype )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ARRAY, "ARRAY"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:15: ( datatype )*
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:77:1: expression : ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression );
    public final RichTeaParser.expression_return expression() throws RecognitionException {
        RichTeaParser.expression_return retval = new RichTeaParser.expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token QUESTION_MARK37=null;
        Token COLON39=null;
        RichTeaParser.logical_expression_return logical_expression36 = null;

        RichTeaParser.logical_expression_return logical_expression38 = null;

        RichTeaParser.logical_expression_return logical_expression40 = null;

        RichTeaParser.logical_expression_return logical_expression41 = null;


        Tree QUESTION_MARK37_tree=null;
        Tree COLON39_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_logical_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_expression");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:2: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
                    {
                    pushFollow(FOLLOW_logical_expression_in_expression545);
                    logical_expression36=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression36.getTree());
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:23: ( QUESTION_MARK logical_expression COLON logical_expression )
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:24: QUESTION_MARK logical_expression COLON logical_expression
                    {
                    QUESTION_MARK37=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_expression548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK37);

                    pushFollow(FOLLOW_logical_expression_in_expression550);
                    logical_expression38=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression38.getTree());
                    COLON39=(Token)match(input,COLON,FOLLOW_COLON_in_expression552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON39);

                    pushFollow(FOLLOW_logical_expression_in_expression554);
                    logical_expression40=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression40.getTree());

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
                    // 78:83: -> ^( TERNARY_OPERATOR ( logical_expression )+ )
                    {
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:86: ^( TERNARY_OPERATOR ( logical_expression )+ )
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:79:4: logical_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_logical_expression_in_expression569);
                    logical_expression41=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression41.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:1: logical_expression : boolean_expression ( OR boolean_expression )* ;
    public final RichTeaParser.logical_expression_return logical_expression() throws RecognitionException {
        RichTeaParser.logical_expression_return retval = new RichTeaParser.logical_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OR43=null;
        RichTeaParser.boolean_expression_return boolean_expression42 = null;

        RichTeaParser.boolean_expression_return boolean_expression44 = null;


        Tree OR43_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:2: ( boolean_expression ( OR boolean_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:4: boolean_expression ( OR boolean_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_boolean_expression_in_logical_expression581);
            boolean_expression42=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression42.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:23: ( OR boolean_expression )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:24: OR boolean_expression
            	    {
            	    OR43=(Token)match(input,OR,FOLLOW_OR_in_logical_expression584); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR43_tree = (Tree)adaptor.create(OR43);
            	    root_0 = (Tree)adaptor.becomeRoot(OR43_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_boolean_expression_in_logical_expression587);
            	    boolean_expression44=boolean_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression44.getTree());

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
    // $ANTLR end "logical_expression"

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:86:1: boolean_expression : equality_expression ( AND equality_expression )* ;
    public final RichTeaParser.boolean_expression_return boolean_expression() throws RecognitionException {
        RichTeaParser.boolean_expression_return retval = new RichTeaParser.boolean_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token AND46=null;
        RichTeaParser.equality_expression_return equality_expression45 = null;

        RichTeaParser.equality_expression_return equality_expression47 = null;


        Tree AND46_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:2: ( equality_expression ( AND equality_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:4: equality_expression ( AND equality_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_boolean_expression600);
            equality_expression45=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression45.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:24: ( AND equality_expression )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:25: AND equality_expression
            	    {
            	    AND46=(Token)match(input,AND,FOLLOW_AND_in_boolean_expression603); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND46_tree = (Tree)adaptor.create(AND46);
            	    root_0 = (Tree)adaptor.becomeRoot(AND46_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expression_in_boolean_expression606);
            	    equality_expression47=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression47.getTree());

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
    // $ANTLR end "boolean_expression"

    public static class equality_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:90:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final RichTeaParser.equality_expression_return equality_expression() throws RecognitionException {
        RichTeaParser.equality_expression_return retval = new RichTeaParser.equality_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set49=null;
        RichTeaParser.relational_expression_return relational_expression48 = null;

        RichTeaParser.relational_expression_return relational_expression50 = null;


        Tree set49_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:4: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression620);
            relational_expression48=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression48.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:26: ( ( EQ | NEQ ) relational_expression )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:27: ( EQ | NEQ ) relational_expression
            	    {
            	    set49=(Token)input.LT(1);
            	    set49=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set49), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression634);
            	    relational_expression50=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression50.getTree());

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
    // $ANTLR end "equality_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:94:1: relational_expression : additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* ;
    public final RichTeaParser.relational_expression_return relational_expression() throws RecognitionException {
        RichTeaParser.relational_expression_return retval = new RichTeaParser.relational_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set52=null;
        RichTeaParser.additive_expression_return additive_expression51 = null;

        RichTeaParser.additive_expression_return additive_expression53 = null;


        Tree set52_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:95:2: ( additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:95:4: additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_relational_expression648);
            additive_expression51=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression51.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:95:24: ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:95:25: ( LT | LTEQ | GT | GTEQ ) additive_expression
            	    {
            	    set52=(Token)input.LT(1);
            	    set52=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT && input.LA(1)<=GTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set52), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expression_in_relational_expression670);
            	    additive_expression53=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression53.getTree());

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
    // $ANTLR end "relational_expression"

    public static class additive_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:98:1: additive_expression : multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )* ;
    public final RichTeaParser.additive_expression_return additive_expression() throws RecognitionException {
        RichTeaParser.additive_expression_return retval = new RichTeaParser.additive_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set55=null;
        RichTeaParser.multiplicative_expression_return multiplicative_expression54 = null;

        RichTeaParser.multiplicative_expression_return multiplicative_expression56 = null;


        Tree set55_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:99:2: ( multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:99:4: multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression684);
            multiplicative_expression54=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression54.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:99:30: ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:99:31: ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression
            	    {
            	    set55=(Token)input.LT(1);
            	    set55=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS_EQUALS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set55), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression706);
            	    multiplicative_expression56=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression56.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:1: multiplicative_expression : power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )* ;
    public final RichTeaParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        RichTeaParser.multiplicative_expression_return retval = new RichTeaParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set58=null;
        RichTeaParser.power_expression_return power_expression57 = null;

        RichTeaParser.power_expression_return power_expression59 = null;


        Tree set58_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:2: ( power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:4: power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_power_expression_in_multiplicative_expression720);
            power_expression57=power_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression57.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:21: ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:22: ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression
            	    {
            	    set58=(Token)input.LT(1);
            	    set58=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULTIPLY_EQUALS && input.LA(1)<=MODULUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set58), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_power_expression_in_multiplicative_expression746);
            	    power_expression59=power_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression59.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"

    public static class power_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "power_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:106:1: power_expression : unary_expression ( POWER unary_expression )* ;
    public final RichTeaParser.power_expression_return power_expression() throws RecognitionException {
        RichTeaParser.power_expression_return retval = new RichTeaParser.power_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token POWER61=null;
        RichTeaParser.unary_expression_return unary_expression60 = null;

        RichTeaParser.unary_expression_return unary_expression62 = null;


        Tree POWER61_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:2: ( unary_expression ( POWER unary_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:4: unary_expression ( POWER unary_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_power_expression760);
            unary_expression60=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression60.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:21: ( POWER unary_expression )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:23: POWER unary_expression
            	    {
            	    POWER61=(Token)match(input,POWER,FOLLOW_POWER_in_power_expression764); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER61_tree = (Tree)adaptor.create(POWER61);
            	    root_0 = (Tree)adaptor.becomeRoot(POWER61_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_power_expression767);
            	    unary_expression62=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression62.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:110:1: unary_expression : ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) );
    public final RichTeaParser.unary_expression_return unary_expression() throws RecognitionException {
        RichTeaParser.unary_expression_return retval = new RichTeaParser.unary_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token NOT64=null;
        Token MINUS66=null;
        RichTeaParser.primary_expression_return primary_expression63 = null;

        RichTeaParser.primary_expression_return primary_expression65 = null;

        RichTeaParser.primary_expression_return primary_expression67 = null;


        Tree NOT64_tree=null;
        Tree MINUS66_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:111:2: ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case ID:
            case OPEN_PAREN:
            case STRING:
            case NUMBER:
            case BOOLEAN:
                {
                alt29=1;
                }
                break;
            case NOT:
                {
                alt29=2;
                }
                break;
            case MINUS:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:111:4: primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_primary_expression_in_unary_expression780);
                    primary_expression63=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression63.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:112:4: NOT primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    NOT64=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression785); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT64_tree = (Tree)adaptor.create(NOT64);
                    root_0 = (Tree)adaptor.becomeRoot(NOT64_tree, root_0);
                    }
                    pushFollow(FOLLOW_primary_expression_in_unary_expression788);
                    primary_expression65=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression65.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:113:4: MINUS primary_expression
                    {
                    MINUS66=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS66);

                    pushFollow(FOLLOW_primary_expression_in_unary_expression795);
                    primary_expression67=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression67.getTree());


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
                    // 113:29: -> ^( NEGATE primary_expression )
                    {
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:113:32: ^( NEGATE primary_expression )
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:116:1: primary_expression : ( expression_value | OPEN_PAREN logical_expression CLOSE_PAREN );
    public final RichTeaParser.primary_expression_return primary_expression() throws RecognitionException {
        RichTeaParser.primary_expression_return retval = new RichTeaParser.primary_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_PAREN69=null;
        Token CLOSE_PAREN71=null;
        RichTeaParser.expression_value_return expression_value68 = null;

        RichTeaParser.logical_expression_return logical_expression70 = null;


        Tree OPEN_PAREN69_tree=null;
        Tree CLOSE_PAREN71_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:117:2: ( expression_value | OPEN_PAREN logical_expression CLOSE_PAREN )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID||LA30_0==STRING||(LA30_0>=NUMBER && LA30_0<=BOOLEAN)) ) {
                alt30=1;
            }
            else if ( (LA30_0==OPEN_PAREN) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:117:4: expression_value
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expression_value_in_primary_expression815);
                    expression_value68=expression_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_value68.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:118:4: OPEN_PAREN logical_expression CLOSE_PAREN
                    {
                    root_0 = (Tree)adaptor.nil();

                    OPEN_PAREN69=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_primary_expression820); if (state.failed) return retval;
                    pushFollow(FOLLOW_logical_expression_in_primary_expression823);
                    logical_expression70=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression70.getTree());
                    CLOSE_PAREN71=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_primary_expression825); if (state.failed) return retval;

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:121:1: expression_value : ( NUMBER | BOOLEAN | STRING | variable );
    public final RichTeaParser.expression_value_return expression_value() throws RecognitionException {
        RichTeaParser.expression_value_return retval = new RichTeaParser.expression_value_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token NUMBER72=null;
        Token BOOLEAN73=null;
        Token STRING74=null;
        RichTeaParser.variable_return variable75 = null;


        Tree NUMBER72_tree=null;
        Tree BOOLEAN73_tree=null;
        Tree STRING74_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:122:2: ( NUMBER | BOOLEAN | STRING | variable )
            int alt31=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt31=1;
                }
                break;
            case BOOLEAN:
                {
                alt31=2;
                }
                break;
            case STRING:
                {
                alt31=3;
                }
                break;
            case ID:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:122:4: NUMBER
                    {
                    root_0 = (Tree)adaptor.nil();

                    NUMBER72=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expression_value837); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER72_tree = (Tree)adaptor.create(NUMBER72);
                    adaptor.addChild(root_0, NUMBER72_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:123:4: BOOLEAN
                    {
                    root_0 = (Tree)adaptor.nil();

                    BOOLEAN73=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expression_value842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN73_tree = (Tree)adaptor.create(BOOLEAN73);
                    adaptor.addChild(root_0, BOOLEAN73_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:124:4: STRING
                    {
                    root_0 = (Tree)adaptor.nil();

                    STRING74=(Token)match(input,STRING,FOLLOW_STRING_in_expression_value847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING74_tree = (Tree)adaptor.create(STRING74);
                    adaptor.addChild(root_0, STRING74_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:125:5: variable
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_expression_value853);
                    variable75=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable75.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:128:1: variable : ( ID ( PERIOD ID )* ) -> ^( VARIABLE ( ^( ID ) )+ ) ;
    public final RichTeaParser.variable_return variable() throws RecognitionException {
        RichTeaParser.variable_return retval = new RichTeaParser.variable_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID76=null;
        Token PERIOD77=null;
        Token ID78=null;

        Tree ID76_tree=null;
        Tree PERIOD77_tree=null;
        Tree ID78_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:2: ( ( ID ( PERIOD ID )* ) -> ^( VARIABLE ( ^( ID ) )+ ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:4: ( ID ( PERIOD ID )* )
            {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:4: ( ID ( PERIOD ID )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:5: ID ( PERIOD ID )*
            {
            ID76=(Token)match(input,ID,FOLLOW_ID_in_variable866); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID76);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:8: ( PERIOD ID )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:9: PERIOD ID
            	    {
            	    PERIOD77=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_variable869); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD77);

            	    ID78=(Token)match(input,ID,FOLLOW_ID_in_variable871); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID78);


            	    }
            	    break;

            	default :
            	    break loop32;
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
            // 130:4: -> ^( VARIABLE ( ^( ID ) )+ )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:130:7: ^( VARIABLE ( ^( ID ) )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:130:18: ^( ID )
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

    // $ANTLR start synpred1_RichTea
    public final void synpred1_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:19: ( function_data )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:19: function_data
        {
        pushFollow(FOLLOW_function_data_in_synpred1_RichTea149);
        function_data();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_RichTea

    // $ANTLR start synpred2_RichTea
    public final void synpred2_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:8: ( OPEN_PAREN ( function_data )? CLOSE_PAREN )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:8: OPEN_PAREN ( function_data )? CLOSE_PAREN
        {
        match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_synpred2_RichTea147); if (state.failed) return ;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:19: ( function_data )?
        int alt33=2;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function_data
                {
                pushFollow(FOLLOW_function_data_in_synpred2_RichTea149);
                function_data();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_synpred2_RichTea152); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_RichTea

    // $ANTLR start synpred6_RichTea
    public final void synpred6_RichTea_fragment() throws RecognitionException {   
        List list_attributes=null;
        RuleReturnScope attributes = null;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:14: (attributes+= implicitAttribute )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:14: attributes+= implicitAttribute
        {
        pushFollow(FOLLOW_implicitAttribute_in_synpred6_RichTea237);
        attributes=implicitAttribute();

        state._fsp--;
        if (state.failed) return ;
        if (list_attributes==null) list_attributes=new ArrayList();
        list_attributes.add(attributes);


        }
    }
    // $ANTLR end synpred6_RichTea

    // $ANTLR start synpred8_RichTea
    public final void synpred8_RichTea_fragment() throws RecognitionException {   
        List list_attributes=null;
        RuleReturnScope attributes = null;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:36: ( ( COMMA )? attributes+= attribute )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:36: ( COMMA )? attributes+= attribute
        {
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:36: ( COMMA )?
        int alt37=2;
        int LA37_0 = input.LA(1);

        if ( (LA37_0==COMMA) ) {
            alt37=1;
        }
        switch (alt37) {
            case 1 :
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred8_RichTea241); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_attribute_in_synpred8_RichTea246);
        attributes=attribute();

        state._fsp--;
        if (state.failed) return ;
        if (list_attributes==null) list_attributes=new ArrayList();
        list_attributes.add(attributes);


        }
    }
    // $ANTLR end synpred8_RichTea

    // $ANTLR start synpred18_RichTea
    public final void synpred18_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:4: ( expression )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:4: expression
        {
        pushFollow(FOLLOW_expression_in_synpred18_RichTea480);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_RichTea

    // $ANTLR start synpred19_RichTea
    public final void synpred19_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:66:4: ( function )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:66:4: function
        {
        pushFollow(FOLLOW_function_in_synpred19_RichTea485);
        function();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_RichTea

    // $ANTLR start synpred22_RichTea
    public final void synpred22_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:4: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
        {
        pushFollow(FOLLOW_logical_expression_in_synpred22_RichTea545);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:23: ( QUESTION_MARK logical_expression COLON logical_expression )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:24: QUESTION_MARK logical_expression COLON logical_expression
        {
        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred22_RichTea548); if (state.failed) return ;
        pushFollow(FOLLOW_logical_expression_in_synpred22_RichTea550);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred22_RichTea552); if (state.failed) return ;
        pushFollow(FOLLOW_logical_expression_in_synpred22_RichTea554);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_RichTea

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
    public final boolean synpred2_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_RichTea_fragment(); // can never throw exception
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
    public final boolean synpred22_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA2_eotS =
        "\31\uffff";
    static final String DFA2_eofS =
        "\1\2\30\uffff";
    static final String DFA2_minS =
        "\2\20\12\uffff\14\0\1\uffff";
    static final String DFA2_maxS =
        "\1\34\1\62\12\uffff\14\0\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\25\uffff\1\1";
    static final String DFA2_specialS =
        "\14\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\1\3\2\2\uffff\4\2\1\uffff\1\2",
            "\1\17\1\20\1\27\1\uffff\1\24\2\uffff\1\25\1\16\1\26\1\uffff"+
            "\1\23\15\uffff\1\22\6\uffff\1\21\1\14\1\15",
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
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "23:7: ( OPEN_PAREN ( function_data )? CLOSE_PAREN )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_13 = input.LA(1);

                         
                        int index2_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_14 = input.LA(1);

                         
                        int index2_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_15 = input.LA(1);

                         
                        int index2_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_16 = input.LA(1);

                         
                        int index2_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_17 = input.LA(1);

                         
                        int index2_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_18 = input.LA(1);

                         
                        int index2_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_18);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_19 = input.LA(1);

                         
                        int index2_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_19);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_20 = input.LA(1);

                         
                        int index2_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_21 = input.LA(1);

                         
                        int index2_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_21);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_22 = input.LA(1);

                         
                        int index2_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_22);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_23 = input.LA(1);

                         
                        int index2_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA1_eotS =
        "\31\uffff";
    static final String DFA1_eofS =
        "\31\uffff";
    static final String DFA1_minS =
        "\1\20\13\uffff\1\0\14\uffff";
    static final String DFA1_maxS =
        "\1\62\13\uffff\1\0\14\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\26\uffff\1\2";
    static final String DFA1_specialS =
        "\14\uffff\1\0\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\2\1\1\14\1\uffff\1\1\2\uffff\3\1\1\uffff\1\1\15\uffff\1\1"+
            "\6\uffff\3\1",
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
            return "23:19: ( function_data )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_RichTea()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA3_eotS =
        "\14\uffff";
    static final String DFA3_eofS =
        "\1\2\13\uffff";
    static final String DFA3_minS =
        "\1\20\13\uffff";
    static final String DFA3_maxS =
        "\1\34\13\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\11\uffff";
    static final String DFA3_specialS =
        "\14\uffff}>";
    static final String[] DFA3_transitionS = {
            "\3\2\1\1\1\2\2\uffff\4\2\1\uffff\1\2",
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
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "23:48: ( SEMI_COLON )?";
        }
    }
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\1\2\13\uffff";
    static final String DFA4_minS =
        "\1\20\13\uffff";
    static final String DFA4_maxS =
        "\1\34\13\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\11\uffff";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\3\2\1\1\1\2\2\uffff\4\2\1\uffff\1\2",
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
            return "26:41: ( SEMI_COLON )?";
        }
    }
    static final String DFA6_eotS =
        "\61\uffff";
    static final String DFA6_eofS =
        "\1\11\2\uffff\2\1\54\uffff";
    static final String DFA6_minS =
        "\1\20\2\uffff\2\20\23\uffff\1\0\13\uffff\1\0\14\uffff";
    static final String DFA6_maxS =
        "\1\62\2\uffff\1\57\1\63\23\uffff\1\0\13\uffff\1\0\14\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\47\uffff";
    static final String DFA6_specialS =
        "\30\uffff\1\0\13\uffff\1\1\14\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\4\1\1\1\11\1\uffff\1\11\2\uffff\1\11\1\3\1\11\1\uffff\1"+
            "\1\15\uffff\1\1\6\uffff\3\1",
            "",
            "",
            "\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\30\3\uffff\23\1",
            "\5\1\2\11\2\1\1\44\3\uffff\23\1\3\uffff\1\1",
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
            "",
            "",
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
            return "35:14: (attributes+= implicitAttribute )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_24 = input.LA(1);

                         
                        int index6_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_RichTea()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_24);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_36 = input.LA(1);

                         
                        int index6_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_RichTea()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_36);
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
    static final String DFA8_eotS =
        "\16\uffff";
    static final String DFA8_eofS =
        "\1\1\15\uffff";
    static final String DFA8_minS =
        "\1\20\2\uffff\1\20\1\25\3\uffff\1\0\5\uffff";
    static final String DFA8_maxS =
        "\1\31\2\uffff\1\30\1\31\3\uffff\1\0\5\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\11\uffff\1\1\2\uffff";
    static final String DFA8_specialS =
        "\10\uffff\1\0\5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\4\1\uffff\1\1\1\uffff\1\3\2\uffff\3\1",
            "",
            "",
            "\1\10\6\uffff\2\1",
            "\2\13\2\uffff\1\1",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 35:35: ( ( COMMA )? attributes+= attribute )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_RichTea()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\13\uffff";
    static final String DFA10_eofS =
        "\1\3\12\uffff";
    static final String DFA10_minS =
        "\2\20\11\uffff";
    static final String DFA10_maxS =
        "\2\31\11\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\1\1\2\7\uffff";
    static final String DFA10_specialS =
        "\13\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\1\1\3\1\2",
            "\1\3\7\uffff\1\3\1\2",
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

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "50:12: (branches+= implicitBranch )?";
        }
    }
    static final String DFA18_eotS =
        "\51\uffff";
    static final String DFA18_eofS =
        "\51\uffff";
    static final String DFA18_minS =
        "\1\20\3\uffff\1\0\1\20\27\uffff\7\0\5\uffff";
    static final String DFA18_maxS =
        "\1\62\3\uffff\1\0\1\62\27\uffff\7\0\5\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\23\uffff\1\2\14\uffff";
    static final String DFA18_specialS =
        "\4\uffff\1\0\30\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\4\1\5\6\uffff\1\1\2\uffff\1\10\15\uffff\1\1\6\uffff\3\1",
            "",
            "",
            "",
            "\1\uffff",
            "\1\40\1\41\1\34\1\uffff\1\34\2\uffff\1\34\1\37\1\34\1\uffff"+
            "\1\34\15\uffff\1\43\6\uffff\1\42\1\35\1\36",
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
            return "64:1: datatype : ( expression | function | array );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 1;}

                        else if ( (synpred19_RichTea()) ) {s = 28;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_29 = input.LA(1);

                         
                        int index18_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 1;}

                        else if ( (synpred19_RichTea()) ) {s = 28;}

                         
                        input.seek(index18_29);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_30 = input.LA(1);

                         
                        int index18_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 1;}

                        else if ( (synpred19_RichTea()) ) {s = 28;}

                         
                        input.seek(index18_30);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_31 = input.LA(1);

                         
                        int index18_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 1;}

                        else if ( (synpred19_RichTea()) ) {s = 28;}

                         
                        input.seek(index18_31);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_32 = input.LA(1);

                         
                        int index18_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 1;}

                        else if ( (synpred19_RichTea()) ) {s = 28;}

                         
                        input.seek(index18_32);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_33 = input.LA(1);

                         
                        int index18_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 1;}

                        else if ( (synpred19_RichTea()) ) {s = 28;}

                         
                        input.seek(index18_33);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_34 = input.LA(1);

                         
                        int index18_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 1;}

                        else if ( (synpred19_RichTea()) ) {s = 28;}

                         
                        input.seek(index18_34);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_35 = input.LA(1);

                         
                        int index18_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_RichTea()) ) {s = 1;}

                        else if ( (synpred19_RichTea()) ) {s = 28;}

                         
                        input.seek(index18_35);
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
    static final String DFA20_eotS =
        "\12\uffff";
    static final String DFA20_eofS =
        "\12\uffff";
    static final String DFA20_minS =
        "\1\20\11\uffff";
    static final String DFA20_maxS =
        "\1\62\11\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\7\uffff\1\2";
    static final String DFA20_specialS =
        "\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\1\6\uffff\1\1\2\uffff\1\1\1\11\14\uffff\1\1\6\uffff\3\1",
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
            return "71:13: ( datatype ( COMMA datatype )* )?";
        }
    }
    static final String DFA21_eotS =
        "\132\uffff";
    static final String DFA21_eofS =
        "\1\uffff\4\17\125\uffff";
    static final String DFA21_minS =
        "\10\20\7\0\11\uffff\7\0\11\uffff\7\0\11\uffff\10\0\11\uffff\21"+
        "\0";
    static final String DFA21_maxS =
        "\1\62\3\57\1\63\3\62\7\0\11\uffff\7\0\11\uffff\7\0\11\uffff\10"+
        "\0\11\uffff\21\0";
    static final String DFA21_acceptS =
        "\17\uffff\1\2\7\uffff\1\1\102\uffff";
    static final String DFA21_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\11\uffff\1\7\1\10\1\11\1"+
        "\12\1\13\1\14\1\15\11\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\11"+
        "\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\11\uffff\1\35\1\36"+
        "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
        "\1\54\1\55}>";
    static final String[] DFA21_transitionS = {
            "\1\4\1\5\6\uffff\1\3\20\uffff\1\7\6\uffff\1\6\1\1\1\2",
            "\1\17\1\uffff\1\17\1\uffff\1\17\2\uffff\3\17\2\uffff\1\17"+
            "\1\27\1\16\1\15\2\14\4\13\4\12\5\11\1\10",
            "\1\17\1\uffff\1\17\1\uffff\1\17\2\uffff\3\17\2\uffff\1\17"+
            "\1\27\1\36\1\35\2\34\4\33\4\32\5\31\1\30",
            "\1\17\1\uffff\1\17\1\uffff\1\17\2\uffff\3\17\2\uffff\1\17"+
            "\1\27\1\56\1\55\2\54\4\53\4\52\5\51\1\50",
            "\1\17\1\uffff\1\17\1\uffff\1\17\2\uffff\3\17\2\uffff\1\17"+
            "\1\27\1\77\1\76\2\75\4\74\4\73\5\72\1\71\3\uffff\1\70",
            "\1\114\1\115\6\uffff\1\113\20\uffff\1\117\6\uffff\1\116\1"+
            "\111\1\112",
            "\1\123\1\124\6\uffff\1\122\30\uffff\1\120\1\121",
            "\1\130\1\131\6\uffff\1\127\30\uffff\1\125\1\126",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "77:1: expression : ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_9 = input.LA(1);

                         
                        int index21_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_10 = input.LA(1);

                         
                        int index21_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_11 = input.LA(1);

                         
                        int index21_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_12 = input.LA(1);

                         
                        int index21_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_13 = input.LA(1);

                         
                        int index21_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_14 = input.LA(1);

                         
                        int index21_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_24 = input.LA(1);

                         
                        int index21_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_25 = input.LA(1);

                         
                        int index21_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_26 = input.LA(1);

                         
                        int index21_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_26);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_27 = input.LA(1);

                         
                        int index21_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_27);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA21_28 = input.LA(1);

                         
                        int index21_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_28);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA21_29 = input.LA(1);

                         
                        int index21_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_29);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA21_30 = input.LA(1);

                         
                        int index21_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_30);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA21_40 = input.LA(1);

                         
                        int index21_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_40);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA21_41 = input.LA(1);

                         
                        int index21_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_41);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA21_42 = input.LA(1);

                         
                        int index21_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_42);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA21_43 = input.LA(1);

                         
                        int index21_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_43);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA21_44 = input.LA(1);

                         
                        int index21_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_44);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA21_45 = input.LA(1);

                         
                        int index21_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_45);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA21_46 = input.LA(1);

                         
                        int index21_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_46);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA21_56 = input.LA(1);

                         
                        int index21_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_56);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA21_57 = input.LA(1);

                         
                        int index21_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_57);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA21_58 = input.LA(1);

                         
                        int index21_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_58);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA21_59 = input.LA(1);

                         
                        int index21_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_59);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA21_60 = input.LA(1);

                         
                        int index21_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_60);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA21_61 = input.LA(1);

                         
                        int index21_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_61);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA21_62 = input.LA(1);

                         
                        int index21_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_62);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA21_63 = input.LA(1);

                         
                        int index21_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_63);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA21_73 = input.LA(1);

                         
                        int index21_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_73);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA21_74 = input.LA(1);

                         
                        int index21_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_74);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA21_75 = input.LA(1);

                         
                        int index21_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_75);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA21_76 = input.LA(1);

                         
                        int index21_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_76);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA21_77 = input.LA(1);

                         
                        int index21_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_77);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA21_78 = input.LA(1);

                         
                        int index21_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_78);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA21_79 = input.LA(1);

                         
                        int index21_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_79);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA21_80 = input.LA(1);

                         
                        int index21_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_80);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA21_81 = input.LA(1);

                         
                        int index21_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_81);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA21_82 = input.LA(1);

                         
                        int index21_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_82);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA21_83 = input.LA(1);

                         
                        int index21_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_83);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA21_84 = input.LA(1);

                         
                        int index21_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_84);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA21_85 = input.LA(1);

                         
                        int index21_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_85);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA21_86 = input.LA(1);

                         
                        int index21_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_86);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA21_87 = input.LA(1);

                         
                        int index21_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_87);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA21_88 = input.LA(1);

                         
                        int index21_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_88);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA21_89 = input.LA(1);

                         
                        int index21_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index21_89);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\14\uffff";
    static final String DFA22_eofS =
        "\1\1\13\uffff";
    static final String DFA22_minS =
        "\1\20\13\uffff";
    static final String DFA22_maxS =
        "\1\36\13\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA22_specialS =
        "\14\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\3\1\2\uffff\2\1\1\13",
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
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()* loopback of 83:23: ( OR boolean_expression )*";
        }
    }
    static final String DFA23_eotS =
        "\15\uffff";
    static final String DFA23_eofS =
        "\1\1\14\uffff";
    static final String DFA23_minS =
        "\1\20\14\uffff";
    static final String DFA23_maxS =
        "\1\37\14\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\12\uffff\1\1";
    static final String DFA23_specialS =
        "\15\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\3\1\2\uffff\3\1\1\14",
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
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 87:24: ( AND equality_expression )*";
        }
    }
    static final String DFA24_eotS =
        "\16\uffff";
    static final String DFA24_eofS =
        "\1\1\15\uffff";
    static final String DFA24_minS =
        "\1\20\15\uffff";
    static final String DFA24_maxS =
        "\1\41\15\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA24_specialS =
        "\16\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\3\1\2\uffff\4\1\2\15",
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
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()* loopback of 91:26: ( ( EQ | NEQ ) relational_expression )*";
        }
    }
    static final String DFA25_eotS =
        "\17\uffff";
    static final String DFA25_eofS =
        "\1\1\16\uffff";
    static final String DFA25_minS =
        "\1\20\16\uffff";
    static final String DFA25_maxS =
        "\1\45\16\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\14\uffff\1\1";
    static final String DFA25_specialS =
        "\17\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\3\1\2\uffff\6\1\4\16",
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
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()* loopback of 95:24: ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*";
        }
    }
    static final String DFA26_eotS =
        "\20\uffff";
    static final String DFA26_eofS =
        "\1\1\17\uffff";
    static final String DFA26_minS =
        "\1\20\17\uffff";
    static final String DFA26_maxS =
        "\1\51\17\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA26_specialS =
        "\20\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\3\1\2\uffff\12\1\4\17",
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
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 99:30: ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*";
        }
    }
    static final String DFA27_eotS =
        "\21\uffff";
    static final String DFA27_eofS =
        "\1\1\20\uffff";
    static final String DFA27_minS =
        "\1\20\20\uffff";
    static final String DFA27_maxS =
        "\1\56\20\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\16\uffff\1\1";
    static final String DFA27_specialS =
        "\21\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\3\1\2\uffff\16\1\5\20",
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
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 103:21: ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*";
        }
    }
    static final String DFA28_eotS =
        "\22\uffff";
    static final String DFA28_eofS =
        "\1\1\21\uffff";
    static final String DFA28_minS =
        "\1\20\21\uffff";
    static final String DFA28_maxS =
        "\1\57\21\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\2\17\uffff\1\1";
    static final String DFA28_specialS =
        "\22\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\3\1\2\uffff\23\1\1\21",
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
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 107:21: ( POWER unary_expression )*";
        }
    }
    static final String DFA32_eotS =
        "\23\uffff";
    static final String DFA32_eofS =
        "\1\1\22\uffff";
    static final String DFA32_minS =
        "\1\20\22\uffff";
    static final String DFA32_maxS =
        "\1\63\22\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\20\uffff\1\1";
    static final String DFA32_specialS =
        "\23\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\3\1\2\uffff\24\1\3\uffff"+
            "\1\22",
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
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 129:8: ( PERIOD ID )*";
        }
    }
    static final String DFA33_eotS =
        "\17\uffff";
    static final String DFA33_eofS =
        "\17\uffff";
    static final String DFA33_minS =
        "\1\20\13\uffff\1\0\2\uffff";
    static final String DFA33_maxS =
        "\1\62\13\uffff\1\0\2\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\14\uffff\1\2";
    static final String DFA33_specialS =
        "\14\uffff\1\0\2\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\1\1\14\1\uffff\1\1\2\uffff\3\1\1\uffff\1\1\15\uffff\1\1"+
            "\6\uffff\3\1",
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
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "23:19: ( function_data )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_12 = input.LA(1);

                         
                        int index33_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_RichTea()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index33_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_function_in_program132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function144 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function147 = new BitSet(new long[]{0x000702000B970000L});
    public static final BitSet FOLLOW_function_data_in_function149 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function152 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function184 = new BitSet(new long[]{0x000702000B930000L});
    public static final BitSet FOLLOW_function_data_in_function186 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function188 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_list_in_function_data220 = new BitSet(new long[]{0x0000000003910000L});
    public static final BitSet FOLLOW_branch_list_in_function_data222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitAttribute_in_attribute_list237 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_COMMA_in_attribute_list241 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_attribute_in_attribute_list246 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_ID_in_attribute277 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_COLON_in_attribute280 = new BitSet(new long[]{0x0007020009030000L});
    public static final BitSet FOLLOW_ASSIGN_in_attribute284 = new BitSet(new long[]{0x0007020009030000L});
    public static final BitSet FOLLOW_datatype_in_attribute288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_implicitAttribute317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBranch_in_branch_list350 = new BitSet(new long[]{0x0000000001910002L});
    public static final BitSet FOLLOW_COMMA_in_branch_list354 = new BitSet(new long[]{0x0000000001910000L});
    public static final BitSet FOLLOW_branch_in_branch_list359 = new BitSet(new long[]{0x0000000001910002L});
    public static final BitSet FOLLOW_HASH_in_branch391 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_ID_in_branch397 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_STRING_in_branch403 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_branch406 = new BitSet(new long[]{0x0000000004030000L});
    public static final BitSet FOLLOW_function_in_branch408 = new BitSet(new long[]{0x0000000004030000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_branch411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_implicitBranch442 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_implicitBranch445 = new BitSet(new long[]{0x0000000004030000L});
    public static final BitSet FOLLOW_function_in_implicitBranch447 = new BitSet(new long[]{0x0000000004030000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_implicitBranch450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_datatype480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_datatype485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_datatype491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BOX_in_array502 = new BitSet(new long[]{0x0007020019030000L});
    public static final BitSet FOLLOW_datatype_in_array505 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_COMMA_in_array508 = new BitSet(new long[]{0x0007020009030000L});
    public static final BitSet FOLLOW_datatype_in_array510 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_CLOSE_BOX_in_array517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression545 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_expression548 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_logical_expression_in_expression550 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_expression552 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_logical_expression_in_expression554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression581 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_OR_in_logical_expression584 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression587 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression600 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_AND_in_boolean_expression603 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression606 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression620 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_set_in_equality_expression623 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression634 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression648 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_set_in_relational_expression651 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression670 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression684 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_set_in_additive_expression687 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression706 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression720 = new BitSet(new long[]{0x00007C0000000002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression723 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression746 = new BitSet(new long[]{0x00007C0000000002L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression760 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_POWER_in_power_expression764 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression767 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expression785 = new BitSet(new long[]{0x0006000001030000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression793 = new BitSet(new long[]{0x0006000001030000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_value_in_primary_expression815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_primary_expression820 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_logical_expression_in_primary_expression823 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_primary_expression825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expression_value837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_expression_value842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expression_value847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_expression_value853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable866 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_variable869 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_variable871 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_function_data_in_synpred1_RichTea149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_synpred2_RichTea147 = new BitSet(new long[]{0x000702000B970000L});
    public static final BitSet FOLLOW_function_data_in_synpred2_RichTea149 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_synpred2_RichTea152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitAttribute_in_synpred6_RichTea237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred8_RichTea241 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_attribute_in_synpred8_RichTea246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred18_RichTea480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred19_RichTea485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_synpred22_RichTea545 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred22_RichTea548 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_logical_expression_in_synpred22_RichTea550 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_synpred22_RichTea552 = new BitSet(new long[]{0x0007020001030000L});
    public static final BitSet FOLLOW_logical_expression_in_synpred22_RichTea554 = new BitSet(new long[]{0x0000000000000002L});

}