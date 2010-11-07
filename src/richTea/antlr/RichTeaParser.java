// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g 2010-11-07 18:27:35
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "CHILDREN", "ATTRIBUTES", "ATTRIBUTE", "NAME", "VALUE", "ARRAY", "LOOKUP", "NEGATE", "ID", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", "SEMI_COLON", "COMMA", "COLON", "ASSIGN", "OPEN_BOX", "CLOSE_BOX", "PERIOD", "OR", "AND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "PLUS_EQUALS", "MINUS_EQUALS", "PLUS", "MINUS", "MULTIPLY_EQUALS", "DIVIDE_EQUALS", "MULTIPLY", "DIVIDE", "MODULUS", "POWER", "NOT", "NUMBER", "BOOLEAN", "STRING", "INTEGER", "FLOAT", "ESC_SEQ", "LETTER", "COMMENT", "WHITESPACE"
    };
    public static final int FUNCTION=4;
    public static final int MINUS_EQUALS=34;
    public static final int LT=29;
    public static final int ATTRIBUTES=6;
    public static final int CHILDREN=5;
    public static final int LETTER=50;
    public static final int ATTRIBUTE=7;
    public static final int LTEQ=30;
    public static final int FLOAT=48;
    public static final int NOT=43;
    public static final int ID=13;
    public static final int AND=26;
    public static final int EOF=-1;
    public static final int NAME=8;
    public static final int ESC_SEQ=49;
    public static final int BOOLEAN=45;
    public static final int MULTIPLY=39;
    public static final int COMMA=19;
    public static final int MULTIPLY_EQUALS=37;
    public static final int PLUS=35;
    public static final int CLOSE_PAREN=15;
    public static final int EQ=27;
    public static final int COMMENT=51;
    public static final int ARRAY=10;
    public static final int DIVIDE=40;
    public static final int INTEGER=47;
    public static final int PERIOD=24;
    public static final int NUMBER=44;
    public static final int WHITESPACE=52;
    public static final int OPEN_PAREN=14;
    public static final int NEGATE=12;
    public static final int POWER=42;
    public static final int SEMI_COLON=18;
    public static final int CLOSE_BRACE=17;
    public static final int VALUE=9;
    public static final int GTEQ=32;
    public static final int MINUS=36;
    public static final int DIVIDE_EQUALS=38;
    public static final int OPEN_BOX=22;
    public static final int COLON=20;
    public static final int LOOKUP=11;
    public static final int CLOSE_BOX=23;
    public static final int NEQ=28;
    public static final int MODULUS=41;
    public static final int OR=25;
    public static final int ASSIGN=21;
    public static final int GT=31;
    public static final int PLUS_EQUALS=33;
    public static final int OPEN_BRACE=16;
    public static final int STRING=46;

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

            pushFollow(FOLLOW_function_in_program107);
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:19:1: function : ID ( OPEN_PAREN ( attribute_data )? ( attribute_list )? CLOSE_PAREN ) ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) ) )? ( attribute_list )? ) ^( CHILDREN ( function )* ) ) ;
    public final RichTeaParser.function_return function() throws RecognitionException {
        RichTeaParser.function_return retval = new RichTeaParser.function_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID2=null;
        Token OPEN_PAREN3=null;
        Token CLOSE_PAREN6=null;
        Token OPEN_BRACE7=null;
        Token CLOSE_BRACE9=null;
        Token SEMI_COLON10=null;
        RichTeaParser.attribute_data_return attribute_data4 = null;

        RichTeaParser.attribute_list_return attribute_list5 = null;

        RichTeaParser.function_return function8 = null;


        Tree ID2_tree=null;
        Tree OPEN_PAREN3_tree=null;
        Tree CLOSE_PAREN6_tree=null;
        Tree OPEN_BRACE7_tree=null;
        Tree CLOSE_BRACE9_tree=null;
        Tree SEMI_COLON10_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_attribute_list=new RewriteRuleSubtreeStream(adaptor,"rule attribute_list");
        RewriteRuleSubtreeStream stream_attribute_data=new RewriteRuleSubtreeStream(adaptor,"rule attribute_data");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:2: ( ID ( OPEN_PAREN ( attribute_data )? ( attribute_list )? CLOSE_PAREN ) ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) ) )? ( attribute_list )? ) ^( CHILDREN ( function )* ) ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:4: ID ( OPEN_PAREN ( attribute_data )? ( attribute_list )? CLOSE_PAREN ) ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )?
            {
            ID2=(Token)match(input,ID,FOLLOW_ID_in_function119); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID2);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:7: ( OPEN_PAREN ( attribute_data )? ( attribute_list )? CLOSE_PAREN )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:8: OPEN_PAREN ( attribute_data )? ( attribute_list )? CLOSE_PAREN
            {
            OPEN_PAREN3=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function122); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN3);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:19: ( attribute_data )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==OPEN_PAREN||LA1_0==OPEN_BOX||LA1_0==MINUS||(LA1_0>=NOT && LA1_0<=STRING)) ) {
                alt1=1;
            }
            else if ( (LA1_0==ID) ) {
                int LA1_2 = input.LA(2);

                if ( ((LA1_2>=ID && LA1_2<=CLOSE_PAREN)||(LA1_2>=PERIOD && LA1_2<=POWER)) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: attribute_data
                    {
                    pushFollow(FOLLOW_attribute_data_in_function124);
                    attribute_data4=attribute_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data4.getTree());

                    }
                    break;

            }

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:35: ( attribute_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: attribute_list
                    {
                    pushFollow(FOLLOW_attribute_list_in_function127);
                    attribute_list5=attribute_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute_list.add(attribute_list5.getTree());

                    }
                    break;

            }

            CLOSE_PAREN6=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function130); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN6);


            }

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:64: ( OPEN_BRACE ( function )* CLOSE_BRACE )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==OPEN_BRACE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:65: OPEN_BRACE ( function )* CLOSE_BRACE
                    {
                    OPEN_BRACE7=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_function134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE7);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:76: ( function )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function
                    	    {
                    	    pushFollow(FOLLOW_function_in_function136);
                    	    function8=function();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_function.add(function8.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    CLOSE_BRACE9=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_function139); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE9);


                    }
                    break;

            }

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:20:100: ( SEMI_COLON )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==SEMI_COLON) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: SEMI_COLON
                    {
                    SEMI_COLON10=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON10);


                    }
                    break;

            }



            // AST REWRITE
            // elements: function, ID, attribute_list, ID, attribute_data
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 21:4: -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) ) )? ( attribute_list )? ) ^( CHILDREN ( function )* ) )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:7: ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) ) )? ( attribute_list )? ) ^( CHILDREN ( function )* ) )
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
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:29: ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) ) )? ( attribute_list )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES"), root_2);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:42: ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) ) )?
                if ( stream_ID.hasNext()||stream_attribute_data.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:42: ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) )
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:86: ^( VALUE attribute_data )
                    {
                    Tree root_4 = (Tree)adaptor.nil();
                    root_4 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VALUE, "VALUE"), root_4);

                    adaptor.addChild(root_4, stream_attribute_data.nextTree());

                    adaptor.addChild(root_3, root_4);
                    }

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_ID.reset();
                stream_attribute_data.reset();
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:112: ( attribute_list )?
                if ( stream_attribute_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_attribute_list.nextTree());

                }
                stream_attribute_list.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:129: ^( CHILDREN ( function )* )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(CHILDREN, "CHILDREN"), root_2);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:21:140: ( function )*
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:1: attribute_list : attribute ( ( COMMA )? attribute )* -> ( ^( ATTRIBUTE attribute ) )* ;
    public final RichTeaParser.attribute_list_return attribute_list() throws RecognitionException {
        RichTeaParser.attribute_list_return retval = new RichTeaParser.attribute_list_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token COMMA12=null;
        RichTeaParser.attribute_return attribute11 = null;

        RichTeaParser.attribute_return attribute13 = null;


        Tree COMMA12_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:25:2: ( attribute ( ( COMMA )? attribute )* -> ( ^( ATTRIBUTE attribute ) )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:25:4: attribute ( ( COMMA )? attribute )*
            {
            pushFollow(FOLLOW_attribute_in_attribute_list203);
            attribute11=attribute();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attribute.add(attribute11.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:25:14: ( ( COMMA )? attribute )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID||LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:25:15: ( COMMA )? attribute
            	    {
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:25:15: ( COMMA )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==COMMA) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
            	            {
            	            COMMA12=(Token)match(input,COMMA,FOLLOW_COMMA_in_attribute_list206); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA12);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_attribute_in_attribute_list209);
            	    attribute13=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_attribute.add(attribute13.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // 26:4: -> ( ^( ATTRIBUTE attribute ) )*
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:26:7: ( ^( ATTRIBUTE attribute ) )*
                while ( stream_attribute.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:26:7: ^( ATTRIBUTE attribute )
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:29:1: attribute : ID ( COLON | ASSIGN ) attribute_data -> ^( NAME ID ) ^( VALUE attribute_data ) ;
    public final RichTeaParser.attribute_return attribute() throws RecognitionException {
        RichTeaParser.attribute_return retval = new RichTeaParser.attribute_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID14=null;
        Token COLON15=null;
        Token ASSIGN16=null;
        RichTeaParser.attribute_data_return attribute_data17 = null;


        Tree ID14_tree=null;
        Tree COLON15_tree=null;
        Tree ASSIGN16_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_attribute_data=new RewriteRuleSubtreeStream(adaptor,"rule attribute_data");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:30:2: ( ID ( COLON | ASSIGN ) attribute_data -> ^( NAME ID ) ^( VALUE attribute_data ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:30:4: ID ( COLON | ASSIGN ) attribute_data
            {
            ID14=(Token)match(input,ID,FOLLOW_ID_in_attribute236); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID14);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:30:7: ( COLON | ASSIGN )
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:30:8: COLON
                    {
                    COLON15=(Token)match(input,COLON,FOLLOW_COLON_in_attribute239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON15);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:30:16: ASSIGN
                    {
                    ASSIGN16=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attribute243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN16);


                    }
                    break;

            }

            pushFollow(FOLLOW_attribute_data_in_attribute247);
            attribute_data17=attribute_data();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data17.getTree());


            // AST REWRITE
            // elements: attribute_data, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 31:4: -> ^( NAME ID ) ^( VALUE attribute_data )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:31:7: ^( NAME ID )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:31:18: ^( VALUE attribute_data )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VALUE, "VALUE"), root_1);

                adaptor.addChild(root_1, stream_attribute_data.nextTree());

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

    public static class attribute_data_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute_data"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:34:1: attribute_data : ( datatype | function );
    public final RichTeaParser.attribute_data_return attribute_data() throws RecognitionException {
        RichTeaParser.attribute_data_return retval = new RichTeaParser.attribute_data_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.datatype_return datatype18 = null;

        RichTeaParser.function_return function19 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:2: ( datatype | function )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==OPEN_PAREN||LA9_0==OPEN_BOX||LA9_0==MINUS||(LA9_0>=NOT && LA9_0<=STRING)) ) {
                alt9=1;
            }
            else if ( (LA9_0==ID) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==EOF||LA9_2==ID||LA9_2==CLOSE_PAREN||LA9_2==COMMA||(LA9_2>=CLOSE_BOX && LA9_2<=POWER)) ) {
                    alt9=1;
                }
                else if ( (LA9_2==OPEN_PAREN) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:4: datatype
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_datatype_in_attribute_data277);
                    datatype18=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype18.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:36:4: function
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_function_in_attribute_data282);
                    function19=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function19.getTree());

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
    // $ANTLR end "attribute_data"

    public static class datatype_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:1: datatype : ( expression | array );
    public final RichTeaParser.datatype_return datatype() throws RecognitionException {
        RichTeaParser.datatype_return retval = new RichTeaParser.datatype_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.expression_return expression20 = null;

        RichTeaParser.array_return array21 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:41:2: ( expression | array )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=ID && LA10_0<=OPEN_PAREN)||LA10_0==MINUS||(LA10_0>=NOT && LA10_0<=STRING)) ) {
                alt10=1;
            }
            else if ( (LA10_0==OPEN_BOX) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:41:4: expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_datatype295);
                    expression20=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression20.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:42:5: array
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_array_in_datatype301);
                    array21=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array21.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:45:1: array : OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX -> ^( ARRAY ( attribute_data )* ) ;
    public final RichTeaParser.array_return array() throws RecognitionException {
        RichTeaParser.array_return retval = new RichTeaParser.array_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_BOX22=null;
        Token COMMA24=null;
        Token CLOSE_BOX26=null;
        RichTeaParser.attribute_data_return attribute_data23 = null;

        RichTeaParser.attribute_data_return attribute_data25 = null;


        Tree OPEN_BOX22_tree=null;
        Tree COMMA24_tree=null;
        Tree CLOSE_BOX26_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BOX=new RewriteRuleTokenStream(adaptor,"token CLOSE_BOX");
        RewriteRuleTokenStream stream_OPEN_BOX=new RewriteRuleTokenStream(adaptor,"token OPEN_BOX");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_attribute_data=new RewriteRuleSubtreeStream(adaptor,"rule attribute_data");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:46:2: ( OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX -> ^( ARRAY ( attribute_data )* ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:46:4: OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX
            {
            OPEN_BOX22=(Token)match(input,OPEN_BOX,FOLLOW_OPEN_BOX_in_array312); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BOX.add(OPEN_BOX22);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:46:13: ( attribute_data ( COMMA attribute_data )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=ID && LA12_0<=OPEN_PAREN)||LA12_0==OPEN_BOX||LA12_0==MINUS||(LA12_0>=NOT && LA12_0<=STRING)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:46:14: attribute_data ( COMMA attribute_data )*
                    {
                    pushFollow(FOLLOW_attribute_data_in_array315);
                    attribute_data23=attribute_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data23.getTree());
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:46:29: ( COMMA attribute_data )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:46:30: COMMA attribute_data
                    	    {
                    	    COMMA24=(Token)match(input,COMMA,FOLLOW_COMMA_in_array318); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA24);

                    	    pushFollow(FOLLOW_attribute_data_in_array320);
                    	    attribute_data25=attribute_data();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data25.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            CLOSE_BOX26=(Token)match(input,CLOSE_BOX,FOLLOW_CLOSE_BOX_in_array327); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BOX.add(CLOSE_BOX26);



            // AST REWRITE
            // elements: attribute_data
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 47:4: -> ^( ARRAY ( attribute_data )* )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:47:7: ^( ARRAY ( attribute_data )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ARRAY, "ARRAY"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:47:15: ( attribute_data )*
                while ( stream_attribute_data.hasNext() ) {
                    adaptor.addChild(root_1, stream_attribute_data.nextTree());

                }
                stream_attribute_data.reset();

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

    public static class lookup_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lookup"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:1: lookup : ( ID ( PERIOD ID )* ) -> ^( LOOKUP ( ^( ID ) )+ ) ;
    public final RichTeaParser.lookup_return lookup() throws RecognitionException {
        RichTeaParser.lookup_return retval = new RichTeaParser.lookup_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID27=null;
        Token PERIOD28=null;
        Token ID29=null;

        Tree ID27_tree=null;
        Tree PERIOD28_tree=null;
        Tree ID29_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:2: ( ( ID ( PERIOD ID )* ) -> ^( LOOKUP ( ^( ID ) )+ ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:4: ( ID ( PERIOD ID )* )
            {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:4: ( ID ( PERIOD ID )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:5: ID ( PERIOD ID )*
            {
            ID27=(Token)match(input,ID,FOLLOW_ID_in_lookup352); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID27);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:8: ( PERIOD ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==PERIOD) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:9: PERIOD ID
            	    {
            	    PERIOD28=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_lookup355); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD28);

            	    ID29=(Token)match(input,ID,FOLLOW_ID_in_lookup357); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID29);


            	    }
            	    break;

            	default :
            	    break loop13;
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
            // 52:4: -> ^( LOOKUP ( ^( ID ) )+ )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:52:7: ^( LOOKUP ( ^( ID ) )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:52:16: ^( ID )
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
    // $ANTLR end "lookup"

    public static class expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:57:1: expression : logical_expression ;
    public final RichTeaParser.expression_return expression() throws RecognitionException {
        RichTeaParser.expression_return retval = new RichTeaParser.expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.logical_expression_return logical_expression30 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:58:2: ( logical_expression )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:58:4: logical_expression
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_logical_expression_in_expression391);
            logical_expression30=logical_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression30.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:61:1: logical_expression : boolean_expression ( OR boolean_expression )* ;
    public final RichTeaParser.logical_expression_return logical_expression() throws RecognitionException {
        RichTeaParser.logical_expression_return retval = new RichTeaParser.logical_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OR32=null;
        RichTeaParser.boolean_expression_return boolean_expression31 = null;

        RichTeaParser.boolean_expression_return boolean_expression33 = null;


        Tree OR32_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:62:2: ( boolean_expression ( OR boolean_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:62:4: boolean_expression ( OR boolean_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_boolean_expression_in_logical_expression403);
            boolean_expression31=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression31.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:62:23: ( OR boolean_expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==OR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:62:24: OR boolean_expression
            	    {
            	    OR32=(Token)match(input,OR,FOLLOW_OR_in_logical_expression406); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR32_tree = (Tree)adaptor.create(OR32);
            	    root_0 = (Tree)adaptor.becomeRoot(OR32_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_boolean_expression_in_logical_expression409);
            	    boolean_expression33=boolean_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression33.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:1: boolean_expression : equality_expression ( AND equality_expression )* ;
    public final RichTeaParser.boolean_expression_return boolean_expression() throws RecognitionException {
        RichTeaParser.boolean_expression_return retval = new RichTeaParser.boolean_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token AND35=null;
        RichTeaParser.equality_expression_return equality_expression34 = null;

        RichTeaParser.equality_expression_return equality_expression36 = null;


        Tree AND35_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:66:2: ( equality_expression ( AND equality_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:66:4: equality_expression ( AND equality_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_boolean_expression422);
            equality_expression34=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression34.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:66:24: ( AND equality_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:66:25: AND equality_expression
            	    {
            	    AND35=(Token)match(input,AND,FOLLOW_AND_in_boolean_expression425); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND35_tree = (Tree)adaptor.create(AND35);
            	    root_0 = (Tree)adaptor.becomeRoot(AND35_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expression_in_boolean_expression428);
            	    equality_expression36=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression36.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:69:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final RichTeaParser.equality_expression_return equality_expression() throws RecognitionException {
        RichTeaParser.equality_expression_return retval = new RichTeaParser.equality_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set38=null;
        RichTeaParser.relational_expression_return relational_expression37 = null;

        RichTeaParser.relational_expression_return relational_expression39 = null;


        Tree set38_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:70:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:70:4: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression442);
            relational_expression37=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression37.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:70:26: ( ( EQ | NEQ ) relational_expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=EQ && LA16_0<=NEQ)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:70:27: ( EQ | NEQ ) relational_expression
            	    {
            	    set38=(Token)input.LT(1);
            	    set38=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set38), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression456);
            	    relational_expression39=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression39.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:73:1: relational_expression : additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* ;
    public final RichTeaParser.relational_expression_return relational_expression() throws RecognitionException {
        RichTeaParser.relational_expression_return retval = new RichTeaParser.relational_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set41=null;
        RichTeaParser.additive_expression_return additive_expression40 = null;

        RichTeaParser.additive_expression_return additive_expression42 = null;


        Tree set41_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:74:2: ( additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:74:4: additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_relational_expression470);
            additive_expression40=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression40.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:74:24: ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=LT && LA17_0<=GTEQ)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:74:25: ( LT | LTEQ | GT | GTEQ ) additive_expression
            	    {
            	    set41=(Token)input.LT(1);
            	    set41=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT && input.LA(1)<=GTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set41), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expression_in_relational_expression492);
            	    additive_expression42=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression42.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:77:1: additive_expression : multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )* ;
    public final RichTeaParser.additive_expression_return additive_expression() throws RecognitionException {
        RichTeaParser.additive_expression_return retval = new RichTeaParser.additive_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set44=null;
        RichTeaParser.multiplicative_expression_return multiplicative_expression43 = null;

        RichTeaParser.multiplicative_expression_return multiplicative_expression45 = null;


        Tree set44_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:2: ( multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:4: multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression506);
            multiplicative_expression43=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression43.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:30: ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=PLUS_EQUALS && LA18_0<=MINUS)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:31: ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression
            	    {
            	    set44=(Token)input.LT(1);
            	    set44=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS_EQUALS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set44), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression528);
            	    multiplicative_expression45=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression45.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:81:1: multiplicative_expression : power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )* ;
    public final RichTeaParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        RichTeaParser.multiplicative_expression_return retval = new RichTeaParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set47=null;
        RichTeaParser.power_expression_return power_expression46 = null;

        RichTeaParser.power_expression_return power_expression48 = null;


        Tree set47_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:2: ( power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:4: power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_power_expression_in_multiplicative_expression542);
            power_expression46=power_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression46.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:21: ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=MULTIPLY_EQUALS && LA19_0<=MODULUS)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:22: ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression
            	    {
            	    set47=(Token)input.LT(1);
            	    set47=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULTIPLY_EQUALS && input.LA(1)<=MODULUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set47), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_power_expression_in_multiplicative_expression568);
            	    power_expression48=power_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression48.getTree());

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
    // $ANTLR end "multiplicative_expression"

    public static class power_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "power_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:85:1: power_expression : unary_expression ( POWER unary_expression )* ;
    public final RichTeaParser.power_expression_return power_expression() throws RecognitionException {
        RichTeaParser.power_expression_return retval = new RichTeaParser.power_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token POWER50=null;
        RichTeaParser.unary_expression_return unary_expression49 = null;

        RichTeaParser.unary_expression_return unary_expression51 = null;


        Tree POWER50_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:86:2: ( unary_expression ( POWER unary_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:86:4: unary_expression ( POWER unary_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_power_expression582);
            unary_expression49=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression49.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:86:21: ( POWER unary_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==POWER) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:86:23: POWER unary_expression
            	    {
            	    POWER50=(Token)match(input,POWER,FOLLOW_POWER_in_power_expression586); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER50_tree = (Tree)adaptor.create(POWER50);
            	    root_0 = (Tree)adaptor.becomeRoot(POWER50_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_power_expression589);
            	    unary_expression51=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression51.getTree());

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
    // $ANTLR end "power_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:89:1: unary_expression : ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) );
    public final RichTeaParser.unary_expression_return unary_expression() throws RecognitionException {
        RichTeaParser.unary_expression_return retval = new RichTeaParser.unary_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token NOT53=null;
        Token MINUS55=null;
        RichTeaParser.primary_expression_return primary_expression52 = null;

        RichTeaParser.primary_expression_return primary_expression54 = null;

        RichTeaParser.primary_expression_return primary_expression56 = null;


        Tree NOT53_tree=null;
        Tree MINUS55_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:90:2: ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case ID:
            case OPEN_PAREN:
            case NUMBER:
            case BOOLEAN:
            case STRING:
                {
                alt21=1;
                }
                break;
            case NOT:
                {
                alt21=2;
                }
                break;
            case MINUS:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:90:4: primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_primary_expression_in_unary_expression602);
                    primary_expression52=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression52.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:4: NOT primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    NOT53=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT53_tree = (Tree)adaptor.create(NOT53);
                    root_0 = (Tree)adaptor.becomeRoot(NOT53_tree, root_0);
                    }
                    pushFollow(FOLLOW_primary_expression_in_unary_expression610);
                    primary_expression54=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression54.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:92:4: MINUS primary_expression
                    {
                    MINUS55=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS55);

                    pushFollow(FOLLOW_primary_expression_in_unary_expression617);
                    primary_expression56=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression56.getTree());


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
                    // 92:29: -> ^( NEGATE primary_expression )
                    {
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:92:32: ^( NEGATE primary_expression )
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:95:1: primary_expression : ( OPEN_PAREN logical_expression CLOSE_PAREN | expression_value );
    public final RichTeaParser.primary_expression_return primary_expression() throws RecognitionException {
        RichTeaParser.primary_expression_return retval = new RichTeaParser.primary_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_PAREN57=null;
        Token CLOSE_PAREN59=null;
        RichTeaParser.logical_expression_return logical_expression58 = null;

        RichTeaParser.expression_value_return expression_value60 = null;


        Tree OPEN_PAREN57_tree=null;
        Tree CLOSE_PAREN59_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:96:2: ( OPEN_PAREN logical_expression CLOSE_PAREN | expression_value )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==OPEN_PAREN) ) {
                alt22=1;
            }
            else if ( (LA22_0==ID||(LA22_0>=NUMBER && LA22_0<=STRING)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:96:4: OPEN_PAREN logical_expression CLOSE_PAREN
                    {
                    root_0 = (Tree)adaptor.nil();

                    OPEN_PAREN57=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_primary_expression637); if (state.failed) return retval;
                    pushFollow(FOLLOW_logical_expression_in_primary_expression640);
                    logical_expression58=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression58.getTree());
                    CLOSE_PAREN59=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_primary_expression642); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:97:5: expression_value
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expression_value_in_primary_expression649);
                    expression_value60=expression_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_value60.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:100:1: expression_value : ( NUMBER | BOOLEAN | STRING | lookup );
    public final RichTeaParser.expression_value_return expression_value() throws RecognitionException {
        RichTeaParser.expression_value_return retval = new RichTeaParser.expression_value_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token NUMBER61=null;
        Token BOOLEAN62=null;
        Token STRING63=null;
        RichTeaParser.lookup_return lookup64 = null;


        Tree NUMBER61_tree=null;
        Tree BOOLEAN62_tree=null;
        Tree STRING63_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:101:2: ( NUMBER | BOOLEAN | STRING | lookup )
            int alt23=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt23=1;
                }
                break;
            case BOOLEAN:
                {
                alt23=2;
                }
                break;
            case STRING:
                {
                alt23=3;
                }
                break;
            case ID:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:101:4: NUMBER
                    {
                    root_0 = (Tree)adaptor.nil();

                    NUMBER61=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expression_value660); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER61_tree = (Tree)adaptor.create(NUMBER61);
                    adaptor.addChild(root_0, NUMBER61_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:4: BOOLEAN
                    {
                    root_0 = (Tree)adaptor.nil();

                    BOOLEAN62=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expression_value665); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN62_tree = (Tree)adaptor.create(BOOLEAN62);
                    adaptor.addChild(root_0, BOOLEAN62_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:4: STRING
                    {
                    root_0 = (Tree)adaptor.nil();

                    STRING63=(Token)match(input,STRING,FOLLOW_STRING_in_expression_value670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING63_tree = (Tree)adaptor.create(STRING63);
                    adaptor.addChild(root_0, STRING63_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:104:5: lookup
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_lookup_in_expression_value676);
                    lookup64=lookup();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lookup64.getTree());

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

    // Delegated rules


 

    public static final BitSet FOLLOW_function_in_program107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function119 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function122 = new BitSet(new long[]{0x000078100040E000L});
    public static final BitSet FOLLOW_attribute_data_in_function124 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_attribute_list_in_function127 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function130 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_function134 = new BitSet(new long[]{0x0000781000426000L});
    public static final BitSet FOLLOW_function_in_function136 = new BitSet(new long[]{0x0000781000426000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_function139 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attribute_list203 = new BitSet(new long[]{0x0000000000082002L});
    public static final BitSet FOLLOW_COMMA_in_attribute_list206 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_attribute_in_attribute_list209 = new BitSet(new long[]{0x0000000000082002L});
    public static final BitSet FOLLOW_ID_in_attribute236 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_COLON_in_attribute239 = new BitSet(new long[]{0x0000781000406000L});
    public static final BitSet FOLLOW_ASSIGN_in_attribute243 = new BitSet(new long[]{0x0000781000406000L});
    public static final BitSet FOLLOW_attribute_data_in_attribute247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_attribute_data277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_attribute_data282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_datatype295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_datatype301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BOX_in_array312 = new BitSet(new long[]{0x0000781000C06000L});
    public static final BitSet FOLLOW_attribute_data_in_array315 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_COMMA_in_array318 = new BitSet(new long[]{0x0000781000406000L});
    public static final BitSet FOLLOW_attribute_data_in_array320 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_CLOSE_BOX_in_array327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lookup352 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_PERIOD_in_lookup355 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_lookup357 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression403 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_OR_in_logical_expression406 = new BitSet(new long[]{0x0000781000006000L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression409 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression422 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_AND_in_boolean_expression425 = new BitSet(new long[]{0x0000781000006000L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression428 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression442 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_set_in_equality_expression445 = new BitSet(new long[]{0x0000781000006000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression456 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression470 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_set_in_relational_expression473 = new BitSet(new long[]{0x0000781000006000L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression492 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression506 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_set_in_additive_expression509 = new BitSet(new long[]{0x0000781000006000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression528 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression542 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression545 = new BitSet(new long[]{0x0000781000006000L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression568 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression582 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_POWER_in_power_expression586 = new BitSet(new long[]{0x0000781000006000L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression589 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expression607 = new BitSet(new long[]{0x0000700000006000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression615 = new BitSet(new long[]{0x0000700000006000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_primary_expression637 = new BitSet(new long[]{0x0000781000006000L});
    public static final BitSet FOLLOW_logical_expression_in_primary_expression640 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_primary_expression642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_value_in_primary_expression649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expression_value660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_expression_value665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expression_value670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_expression_value676 = new BitSet(new long[]{0x0000000000000002L});

}