// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g 2010-11-07 18:22:43
package richTea.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class RichTeaParser extends DebugParser {
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

    public static final String[] ruleNames = new String[] {
        "invalidRule", "function", "attribute", "additive_expression", 
        "attribute_data", "synpred15_RichTea", "synpred34_RichTea", "array", 
        "synpred5_RichTea", "relational_expression", "power_expression", 
        "synpred22_RichTea", "synpred2_RichTea", "synpred9_RichTea", "synpred25_RichTea", 
        "synpred4_RichTea", "synpred23_RichTea", "synpred24_RichTea", "logical_expression", 
        "synpred11_RichTea", "program", "synpred37_RichTea", "synpred27_RichTea", 
        "synpred16_RichTea", "synpred26_RichTea", "synpred14_RichTea", "datatype", 
        "synpred21_RichTea", "synpred31_RichTea", "lookup", "boolean_expression", 
        "synpred19_RichTea", "expression", "synpred28_RichTea", "synpred1_RichTea", 
        "equality_expression", "synpred3_RichTea", "synpred17_RichTea", 
        "synpred29_RichTea", "primary_expression", "synpred7_RichTea", "synpred33_RichTea", 
        "multiplicative_expression", "synpred20_RichTea", "synpred13_RichTea", 
        "synpred35_RichTea", "synpred12_RichTea", "unary_expression", "synpred32_RichTea", 
        "synpred30_RichTea", "synpred18_RichTea", "synpred36_RichTea", "synpred6_RichTea", 
        "synpred8_RichTea", "synpred10_RichTea", "expression_value", "attribute_list"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public RichTeaParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public RichTeaParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public RichTeaParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return RichTeaParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:15:1: program : function ;
    public final RichTeaParser.program_return program() throws RecognitionException {
        RichTeaParser.program_return retval = new RichTeaParser.program_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.function_return function1 = null;



        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:16:2: ( function )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:16:4: function
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(16,4);
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
        dbg.location(17, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "program"

    public static class function_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:19:1: function : ID ( OPEN_PAREN ( attribute_data )? ( attribute_list )? CLOSE_PAREN ) ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) ) )? ( attribute_list )? ) ^( CHILDREN ( function )* ) ) ;
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
        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:20:2: ( ID ( OPEN_PAREN ( attribute_data )? ( attribute_list )? CLOSE_PAREN ) ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) ) )? ( attribute_list )? ) ^( CHILDREN ( function )* ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:20:4: ID ( OPEN_PAREN ( attribute_data )? ( attribute_list )? CLOSE_PAREN ) ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )?
            {
            dbg.location(20,4);
            ID2=(Token)match(input,ID,FOLLOW_ID_in_function119); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID2);

            dbg.location(20,7);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:20:7: ( OPEN_PAREN ( attribute_data )? ( attribute_list )? CLOSE_PAREN )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:20:8: OPEN_PAREN ( attribute_data )? ( attribute_list )? CLOSE_PAREN
            {
            dbg.location(20,8);
            OPEN_PAREN3=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function122); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN3);

            dbg.location(20,19);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:20:19: ( attribute_data )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1);

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
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:0:0: attribute_data
                    {
                    dbg.location(20,19);
                    pushFollow(FOLLOW_attribute_data_in_function124);
                    attribute_data4=attribute_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data4.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(20,35);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:20:35: ( attribute_list )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:0:0: attribute_list
                    {
                    dbg.location(20,35);
                    pushFollow(FOLLOW_attribute_list_in_function127);
                    attribute_list5=attribute_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute_list.add(attribute_list5.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(20,51);
            CLOSE_PAREN6=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function130); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN6);


            }

            dbg.location(20,64);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:20:64: ( OPEN_BRACE ( function )* CLOSE_BRACE )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==OPEN_BRACE) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:20:65: OPEN_BRACE ( function )* CLOSE_BRACE
                    {
                    dbg.location(20,65);
                    OPEN_BRACE7=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_function134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE7);

                    dbg.location(20,76);
                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:20:76: ( function )*
                    try { dbg.enterSubRule(3);

                    loop3:
                    do {
                        int alt3=2;
                        try { dbg.enterDecision(3);

                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==ID) ) {
                            alt3=1;
                        }


                        } finally {dbg.exitDecision(3);}

                        switch (alt3) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:0:0: function
                    	    {
                    	    dbg.location(20,76);
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
                    } finally {dbg.exitSubRule(3);}

                    dbg.location(20,86);
                    CLOSE_BRACE9=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_function139); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE9);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(20,100);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:20:100: ( SEMI_COLON )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==SEMI_COLON) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:0:0: SEMI_COLON
                    {
                    dbg.location(20,100);
                    SEMI_COLON10=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON10);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}



            // AST REWRITE
            // elements: attribute_list, ID, function, attribute_data, ID
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
                dbg.location(21,7);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:21:7: ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) ) )? ( attribute_list )? ) ^( CHILDREN ( function )* ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(21,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                dbg.location(21,18);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:21:18: ^( NAME ID )
                {
                Tree root_2 = (Tree)adaptor.nil();
                dbg.location(21,20);
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_2);

                dbg.location(21,25);
                adaptor.addChild(root_2, stream_ID.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(21,29);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:21:29: ^( ATTRIBUTES ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) ) )? ( attribute_list )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                dbg.location(21,31);
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES"), root_2);

                dbg.location(21,42);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:21:42: ( ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) ) )?
                if ( stream_attribute_data.hasNext()||stream_ID.hasNext() ) {
                    dbg.location(21,42);
                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:21:42: ^( ATTRIBUTE ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE attribute_data ) )
                    {
                    Tree root_3 = (Tree)adaptor.nil();
                    dbg.location(21,44);
                    root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_3);

                    dbg.location(21,54);
                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:21:54: ^( NAME ID[\"implicitAttribute\"] )
                    {
                    Tree root_4 = (Tree)adaptor.nil();
                    dbg.location(21,56);
                    root_4 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_4);

                    dbg.location(21,61);
                    adaptor.addChild(root_4, (Tree)adaptor.create(ID, "implicitAttribute"));

                    adaptor.addChild(root_3, root_4);
                    }
                    dbg.location(21,86);
                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:21:86: ^( VALUE attribute_data )
                    {
                    Tree root_4 = (Tree)adaptor.nil();
                    dbg.location(21,88);
                    root_4 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VALUE, "VALUE"), root_4);

                    dbg.location(21,94);
                    adaptor.addChild(root_4, stream_attribute_data.nextTree());

                    adaptor.addChild(root_3, root_4);
                    }

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_attribute_data.reset();
                stream_ID.reset();
                dbg.location(21,112);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:21:112: ( attribute_list )?
                if ( stream_attribute_list.hasNext() ) {
                    dbg.location(21,112);
                    adaptor.addChild(root_2, stream_attribute_list.nextTree());

                }
                stream_attribute_list.reset();

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(21,129);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:21:129: ^( CHILDREN ( function )* )
                {
                Tree root_2 = (Tree)adaptor.nil();
                dbg.location(21,131);
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(CHILDREN, "CHILDREN"), root_2);

                dbg.location(21,140);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:21:140: ( function )*
                while ( stream_function.hasNext() ) {
                    dbg.location(21,140);
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
        dbg.location(22, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function"

    public static class attribute_list_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute_list"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:24:1: attribute_list : attribute ( ( COMMA )? attribute )* -> ( ^( ATTRIBUTE attribute ) )* ;
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
        try { dbg.enterRule(getGrammarFileName(), "attribute_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:25:2: ( attribute ( ( COMMA )? attribute )* -> ( ^( ATTRIBUTE attribute ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:25:4: attribute ( ( COMMA )? attribute )*
            {
            dbg.location(25,4);
            pushFollow(FOLLOW_attribute_in_attribute_list203);
            attribute11=attribute();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attribute.add(attribute11.getTree());
            dbg.location(25,14);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:25:14: ( ( COMMA )? attribute )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID||LA7_0==COMMA) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:25:15: ( COMMA )? attribute
            	    {
            	    dbg.location(25,15);
            	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:25:15: ( COMMA )?
            	    int alt6=2;
            	    try { dbg.enterSubRule(6);
            	    try { dbg.enterDecision(6);

            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==COMMA) ) {
            	        alt6=1;
            	    }
            	    } finally {dbg.exitDecision(6);}

            	    switch (alt6) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:0:0: COMMA
            	            {
            	            dbg.location(25,15);
            	            COMMA12=(Token)match(input,COMMA,FOLLOW_COMMA_in_attribute_list206); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA12);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(6);}

            	    dbg.location(25,22);
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
            } finally {dbg.exitSubRule(7);}



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
                dbg.location(26,7);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:26:7: ( ^( ATTRIBUTE attribute ) )*
                while ( stream_attribute.hasNext() ) {
                    dbg.location(26,7);
                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:26:7: ^( ATTRIBUTE attribute )
                    {
                    Tree root_1 = (Tree)adaptor.nil();
                    dbg.location(26,9);
                    root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_1);

                    dbg.location(26,19);
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
        dbg.location(27, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attribute_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "attribute_list"

    public static class attribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:29:1: attribute : ID ( COLON | ASSIGN ) attribute_data -> ^( NAME ID ) ^( VALUE attribute_data ) ;
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
        try { dbg.enterRule(getGrammarFileName(), "attribute");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:30:2: ( ID ( COLON | ASSIGN ) attribute_data -> ^( NAME ID ) ^( VALUE attribute_data ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:30:4: ID ( COLON | ASSIGN ) attribute_data
            {
            dbg.location(30,4);
            ID14=(Token)match(input,ID,FOLLOW_ID_in_attribute236); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID14);

            dbg.location(30,7);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:30:7: ( COLON | ASSIGN )
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:30:8: COLON
                    {
                    dbg.location(30,8);
                    COLON15=(Token)match(input,COLON,FOLLOW_COLON_in_attribute239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON15);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:30:16: ASSIGN
                    {
                    dbg.location(30,16);
                    ASSIGN16=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attribute243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN16);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(30,25);
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
                dbg.location(31,7);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:31:7: ^( NAME ID )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(31,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                dbg.location(31,14);
                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(31,18);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:31:18: ^( VALUE attribute_data )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(31,20);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VALUE, "VALUE"), root_1);

                dbg.location(31,26);
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
        dbg.location(32, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attribute");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "attribute"

    public static class attribute_data_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute_data"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:34:1: attribute_data : ( datatype | function );
    public final RichTeaParser.attribute_data_return attribute_data() throws RecognitionException {
        RichTeaParser.attribute_data_return retval = new RichTeaParser.attribute_data_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.datatype_return datatype18 = null;

        RichTeaParser.function_return function19 = null;



        try { dbg.enterRule(getGrammarFileName(), "attribute_data");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:35:2: ( datatype | function )
            int alt9=2;
            try { dbg.enterDecision(9);

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

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:35:4: datatype
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(35,4);
                    pushFollow(FOLLOW_datatype_in_attribute_data277);
                    datatype18=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype18.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:36:4: function
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(36,4);
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
        dbg.location(37, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attribute_data");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "attribute_data"

    public static class datatype_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:40:1: datatype : ( expression | array );
    public final RichTeaParser.datatype_return datatype() throws RecognitionException {
        RichTeaParser.datatype_return retval = new RichTeaParser.datatype_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.expression_return expression20 = null;

        RichTeaParser.array_return array21 = null;



        try { dbg.enterRule(getGrammarFileName(), "datatype");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:41:2: ( expression | array )
            int alt10=2;
            try { dbg.enterDecision(10);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:41:4: expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(41,4);
                    pushFollow(FOLLOW_expression_in_datatype295);
                    expression20=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression20.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:42:5: array
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(42,5);
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
        dbg.location(43, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "datatype");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "datatype"

    public static class array_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:45:1: array : OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX -> ^( ARRAY ( attribute_data )* ) ;
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
        try { dbg.enterRule(getGrammarFileName(), "array");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:46:2: ( OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX -> ^( ARRAY ( attribute_data )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:46:4: OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX
            {
            dbg.location(46,4);
            OPEN_BOX22=(Token)match(input,OPEN_BOX,FOLLOW_OPEN_BOX_in_array312); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BOX.add(OPEN_BOX22);

            dbg.location(46,13);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:46:13: ( attribute_data ( COMMA attribute_data )* )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=ID && LA12_0<=OPEN_PAREN)||LA12_0==OPEN_BOX||LA12_0==MINUS||(LA12_0>=NOT && LA12_0<=STRING)) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:46:14: attribute_data ( COMMA attribute_data )*
                    {
                    dbg.location(46,14);
                    pushFollow(FOLLOW_attribute_data_in_array315);
                    attribute_data23=attribute_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data23.getTree());
                    dbg.location(46,29);
                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:46:29: ( COMMA attribute_data )*
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:46:30: COMMA attribute_data
                    	    {
                    	    dbg.location(46,30);
                    	    COMMA24=(Token)match(input,COMMA,FOLLOW_COMMA_in_array318); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA24);

                    	    dbg.location(46,36);
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
                    } finally {dbg.exitSubRule(11);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}

            dbg.location(46,56);
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
                dbg.location(47,7);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:47:7: ^( ARRAY ( attribute_data )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(47,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ARRAY, "ARRAY"), root_1);

                dbg.location(47,15);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:47:15: ( attribute_data )*
                while ( stream_attribute_data.hasNext() ) {
                    dbg.location(47,15);
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
        dbg.location(48, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "array");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "array"

    public static class lookup_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lookup"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:50:1: lookup : ( ID ( PERIOD ID )* ) -> ^( LOOKUP ( ^( ID ) )+ ) ;
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

        try { dbg.enterRule(getGrammarFileName(), "lookup");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:51:2: ( ( ID ( PERIOD ID )* ) -> ^( LOOKUP ( ^( ID ) )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:51:4: ( ID ( PERIOD ID )* )
            {
            dbg.location(51,4);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:51:4: ( ID ( PERIOD ID )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:51:5: ID ( PERIOD ID )*
            {
            dbg.location(51,5);
            ID27=(Token)match(input,ID,FOLLOW_ID_in_lookup352); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID27);

            dbg.location(51,8);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:51:8: ( PERIOD ID )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==PERIOD) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:51:9: PERIOD ID
            	    {
            	    dbg.location(51,9);
            	    PERIOD28=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_lookup355); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD28);

            	    dbg.location(51,16);
            	    ID29=(Token)match(input,ID,FOLLOW_ID_in_lookup357); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID29);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


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
                dbg.location(52,7);
                // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:52:7: ^( LOOKUP ( ^( ID ) )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(52,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                dbg.location(52,16);
                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    dbg.location(52,16);
                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:52:16: ^( ID )
                    {
                    Tree root_2 = (Tree)adaptor.nil();
                    dbg.location(52,18);
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
        dbg.location(53, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "lookup");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "lookup"

    public static class expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:57:1: expression : logical_expression ;
    public final RichTeaParser.expression_return expression() throws RecognitionException {
        RichTeaParser.expression_return retval = new RichTeaParser.expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.logical_expression_return logical_expression30 = null;



        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:58:2: ( logical_expression )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:58:4: logical_expression
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(58,4);
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
        dbg.location(59, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    public static class logical_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_expression"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:61:1: logical_expression : boolean_expression ( OR boolean_expression )* ;
    public final RichTeaParser.logical_expression_return logical_expression() throws RecognitionException {
        RichTeaParser.logical_expression_return retval = new RichTeaParser.logical_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OR32=null;
        RichTeaParser.boolean_expression_return boolean_expression31 = null;

        RichTeaParser.boolean_expression_return boolean_expression33 = null;


        Tree OR32_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "logical_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:62:2: ( boolean_expression ( OR boolean_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:62:4: boolean_expression ( OR boolean_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(62,4);
            pushFollow(FOLLOW_boolean_expression_in_logical_expression403);
            boolean_expression31=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression31.getTree());
            dbg.location(62,23);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:62:23: ( OR boolean_expression )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==OR) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:62:24: OR boolean_expression
            	    {
            	    dbg.location(62,26);
            	    OR32=(Token)match(input,OR,FOLLOW_OR_in_logical_expression406); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR32_tree = (Tree)adaptor.create(OR32);
            	    root_0 = (Tree)adaptor.becomeRoot(OR32_tree, root_0);
            	    }
            	    dbg.location(62,28);
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
            } finally {dbg.exitSubRule(14);}


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
        dbg.location(63, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logical_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "logical_expression"

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_expression"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:65:1: boolean_expression : equality_expression ( AND equality_expression )* ;
    public final RichTeaParser.boolean_expression_return boolean_expression() throws RecognitionException {
        RichTeaParser.boolean_expression_return retval = new RichTeaParser.boolean_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token AND35=null;
        RichTeaParser.equality_expression_return equality_expression34 = null;

        RichTeaParser.equality_expression_return equality_expression36 = null;


        Tree AND35_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "boolean_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:66:2: ( equality_expression ( AND equality_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:66:4: equality_expression ( AND equality_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(66,4);
            pushFollow(FOLLOW_equality_expression_in_boolean_expression422);
            equality_expression34=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression34.getTree());
            dbg.location(66,24);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:66:24: ( AND equality_expression )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:66:25: AND equality_expression
            	    {
            	    dbg.location(66,28);
            	    AND35=(Token)match(input,AND,FOLLOW_AND_in_boolean_expression425); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND35_tree = (Tree)adaptor.create(AND35);
            	    root_0 = (Tree)adaptor.becomeRoot(AND35_tree, root_0);
            	    }
            	    dbg.location(66,30);
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
            } finally {dbg.exitSubRule(15);}


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
        dbg.location(67, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolean_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "boolean_expression"

    public static class equality_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expression"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:69:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final RichTeaParser.equality_expression_return equality_expression() throws RecognitionException {
        RichTeaParser.equality_expression_return retval = new RichTeaParser.equality_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set38=null;
        RichTeaParser.relational_expression_return relational_expression37 = null;

        RichTeaParser.relational_expression_return relational_expression39 = null;


        Tree set38_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equality_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:70:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:70:4: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(70,4);
            pushFollow(FOLLOW_relational_expression_in_equality_expression442);
            relational_expression37=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression37.getTree());
            dbg.location(70,26);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:70:26: ( ( EQ | NEQ ) relational_expression )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16);

                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=EQ && LA16_0<=NEQ)) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:70:27: ( EQ | NEQ ) relational_expression
            	    {
            	    dbg.location(70,27);
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
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(70,41);
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
            } finally {dbg.exitSubRule(16);}


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
        dbg.location(71, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equality_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "equality_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:73:1: relational_expression : additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* ;
    public final RichTeaParser.relational_expression_return relational_expression() throws RecognitionException {
        RichTeaParser.relational_expression_return retval = new RichTeaParser.relational_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set41=null;
        RichTeaParser.additive_expression_return additive_expression40 = null;

        RichTeaParser.additive_expression_return additive_expression42 = null;


        Tree set41_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "relational_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:74:2: ( additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:74:4: additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(74,4);
            pushFollow(FOLLOW_additive_expression_in_relational_expression470);
            additive_expression40=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression40.getTree());
            dbg.location(74,24);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:74:24: ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=LT && LA17_0<=GTEQ)) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:74:25: ( LT | LTEQ | GT | GTEQ ) additive_expression
            	    {
            	    dbg.location(74,25);
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
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(74,52);
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
            } finally {dbg.exitSubRule(17);}


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
        dbg.location(75, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relational_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relational_expression"

    public static class additive_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:77:1: additive_expression : multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )* ;
    public final RichTeaParser.additive_expression_return additive_expression() throws RecognitionException {
        RichTeaParser.additive_expression_return retval = new RichTeaParser.additive_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set44=null;
        RichTeaParser.multiplicative_expression_return multiplicative_expression43 = null;

        RichTeaParser.multiplicative_expression_return multiplicative_expression45 = null;


        Tree set44_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "additive_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:78:2: ( multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:78:4: multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(78,4);
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression506);
            multiplicative_expression43=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression43.getTree());
            dbg.location(78,30);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:78:30: ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18);

                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=PLUS_EQUALS && LA18_0<=MINUS)) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:78:31: ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression
            	    {
            	    dbg.location(78,31);
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
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(78,78);
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
            } finally {dbg.exitSubRule(18);}


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
        dbg.location(79, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "additive_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:81:1: multiplicative_expression : power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )* ;
    public final RichTeaParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        RichTeaParser.multiplicative_expression_return retval = new RichTeaParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set47=null;
        RichTeaParser.power_expression_return power_expression46 = null;

        RichTeaParser.power_expression_return power_expression48 = null;


        Tree set47_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "multiplicative_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:82:2: ( power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:82:4: power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(82,4);
            pushFollow(FOLLOW_power_expression_in_multiplicative_expression542);
            power_expression46=power_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression46.getTree());
            dbg.location(82,21);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:82:21: ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19);

                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=MULTIPLY_EQUALS && LA19_0<=MODULUS)) ) {
                    alt19=1;
                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:82:22: ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression
            	    {
            	    dbg.location(82,22);
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
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(82,89);
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
            } finally {dbg.exitSubRule(19);}


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
        dbg.location(83, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multiplicative_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "multiplicative_expression"

    public static class power_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "power_expression"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:85:1: power_expression : unary_expression ( POWER unary_expression )* ;
    public final RichTeaParser.power_expression_return power_expression() throws RecognitionException {
        RichTeaParser.power_expression_return retval = new RichTeaParser.power_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token POWER50=null;
        RichTeaParser.unary_expression_return unary_expression49 = null;

        RichTeaParser.unary_expression_return unary_expression51 = null;


        Tree POWER50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "power_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:86:2: ( unary_expression ( POWER unary_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:86:4: unary_expression ( POWER unary_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(86,4);
            pushFollow(FOLLOW_unary_expression_in_power_expression582);
            unary_expression49=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression49.getTree());
            dbg.location(86,21);
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:86:21: ( POWER unary_expression )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==POWER) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:86:23: POWER unary_expression
            	    {
            	    dbg.location(86,28);
            	    POWER50=(Token)match(input,POWER,FOLLOW_POWER_in_power_expression586); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER50_tree = (Tree)adaptor.create(POWER50);
            	    root_0 = (Tree)adaptor.becomeRoot(POWER50_tree, root_0);
            	    }
            	    dbg.location(86,30);
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
            } finally {dbg.exitSubRule(20);}


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
        dbg.location(87, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "power_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "power_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:89:1: unary_expression : ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) );
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
        try { dbg.enterRule(getGrammarFileName(), "unary_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:90:2: ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) )
            int alt21=3;
            try { dbg.enterDecision(21);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:90:4: primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(90,4);
                    pushFollow(FOLLOW_primary_expression_in_unary_expression602);
                    primary_expression52=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression52.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:91:4: NOT primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(91,7);
                    NOT53=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT53_tree = (Tree)adaptor.create(NOT53);
                    root_0 = (Tree)adaptor.becomeRoot(NOT53_tree, root_0);
                    }
                    dbg.location(91,9);
                    pushFollow(FOLLOW_primary_expression_in_unary_expression610);
                    primary_expression54=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression54.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:92:4: MINUS primary_expression
                    {
                    dbg.location(92,4);
                    MINUS55=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS55);

                    dbg.location(92,10);
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
                        dbg.location(92,32);
                        // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:92:32: ^( NEGATE primary_expression )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        dbg.location(92,34);
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NEGATE, "NEGATE"), root_1);

                        dbg.location(92,41);
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
        dbg.location(93, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unary_expression"

    public static class primary_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary_expression"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:95:1: primary_expression : ( OPEN_PAREN logical_expression CLOSE_PAREN | expression_value );
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

        try { dbg.enterRule(getGrammarFileName(), "primary_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:96:2: ( OPEN_PAREN logical_expression CLOSE_PAREN | expression_value )
            int alt22=2;
            try { dbg.enterDecision(22);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:96:4: OPEN_PAREN logical_expression CLOSE_PAREN
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(96,14);
                    OPEN_PAREN57=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_primary_expression637); if (state.failed) return retval;
                    dbg.location(96,16);
                    pushFollow(FOLLOW_logical_expression_in_primary_expression640);
                    logical_expression58=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression58.getTree());
                    dbg.location(96,46);
                    CLOSE_PAREN59=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_primary_expression642); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:97:5: expression_value
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(97,5);
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
        dbg.location(98, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primary_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "primary_expression"

    public static class expression_value_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_value"
    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:100:1: expression_value : ( NUMBER | BOOLEAN | STRING | lookup );
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

        try { dbg.enterRule(getGrammarFileName(), "expression_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:101:2: ( NUMBER | BOOLEAN | STRING | lookup )
            int alt23=4;
            try { dbg.enterDecision(23);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:101:4: NUMBER
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(101,4);
                    NUMBER61=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expression_value660); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER61_tree = (Tree)adaptor.create(NUMBER61);
                    adaptor.addChild(root_0, NUMBER61_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:102:4: BOOLEAN
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(102,4);
                    BOOLEAN62=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expression_value665); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN62_tree = (Tree)adaptor.create(BOOLEAN62);
                    adaptor.addChild(root_0, BOOLEAN62_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:103:4: STRING
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(103,4);
                    STRING63=(Token)match(input,STRING,FOLLOW_STRING_in_expression_value670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING63_tree = (Tree)adaptor.create(STRING63);
                    adaptor.addChild(root_0, STRING63_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Richard\\Documents\\RicherTea\\src\\antlr\\RichTea.g:104:5: lookup
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(104,5);
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
        dbg.location(105, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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