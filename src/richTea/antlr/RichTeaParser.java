// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g 2010-11-14 19:19:07
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "CHILDREN", "ATTRIBUTES", "ATTRIBUTE", "NAME", "VALUE", "BRANCHES", "BRANCH", "ARRAY", "VARIABLE", "TERNARY_OPERATOR", "NEGATE", "ID", "OPEN_PAREN", "CLOSE_PAREN", "COMMA", "COLON", "ASSIGN", "HASH", "STRING", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BOX", "CLOSE_BOX", "QUESTION_MARK", "OR", "AND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "PLUS_EQUALS", "MINUS_EQUALS", "PLUS", "MINUS", "MULTIPLY_EQUALS", "DIVIDE_EQUALS", "MULTIPLY", "DIVIDE", "MODULUS", "POWER", "NOT", "NUMBER", "BOOLEAN", "PERIOD", "INTEGER", "FLOAT", "ESC_SEQ", "LETTER", "COMMENT", "WHITESPACE", "SEMI_COLON"
    };
    public static final int FUNCTION=4;
    public static final int MINUS_EQUALS=38;
    public static final int LT=33;
    public static final int ATTRIBUTES=6;
    public static final int CHILDREN=5;
    public static final int LETTER=54;
    public static final int ATTRIBUTE=7;
    public static final int LTEQ=34;
    public static final int FLOAT=52;
    public static final int NOT=47;
    public static final int BRANCHES=10;
    public static final int ID=16;
    public static final int AND=30;
    public static final int EOF=-1;
    public static final int NAME=8;
    public static final int ESC_SEQ=53;
    public static final int BOOLEAN=49;
    public static final int MULTIPLY=43;
    public static final int COMMA=19;
    public static final int MULTIPLY_EQUALS=41;
    public static final int QUESTION_MARK=28;
    public static final int PLUS=39;
    public static final int CLOSE_PAREN=18;
    public static final int EQ=31;
    public static final int COMMENT=55;
    public static final int ARRAY=12;
    public static final int DIVIDE=44;
    public static final int INTEGER=51;
    public static final int TERNARY_OPERATOR=14;
    public static final int PERIOD=50;
    public static final int NUMBER=48;
    public static final int HASH=22;
    public static final int WHITESPACE=56;
    public static final int POWER=46;
    public static final int OPEN_PAREN=17;
    public static final int NEGATE=15;
    public static final int SEMI_COLON=57;
    public static final int CLOSE_BRACE=25;
    public static final int VALUE=9;
    public static final int GTEQ=36;
    public static final int MINUS=40;
    public static final int DIVIDE_EQUALS=42;
    public static final int OPEN_BOX=26;
    public static final int COLON=20;
    public static final int CLOSE_BOX=27;
    public static final int NEQ=32;
    public static final int VARIABLE=13;
    public static final int MODULUS=45;
    public static final int OR=29;
    public static final int BRANCH=11;
    public static final int ASSIGN=21;
    public static final int GT=35;
    public static final int PLUS_EQUALS=37;
    public static final int OPEN_BRACE=24;
    public static final int STRING=23;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "synpred34_RichTea", "function_data", "synpred16_RichTea", 
        "synpred8_RichTea", "synpred31_RichTea", "synpred1_RichTea", "datatype", 
        "synpred7_RichTea", "synpred6_RichTea", "synpred17_RichTea", "synpred37_RichTea", 
        "implicitAttribute", "synpred44_RichTea", "synpred13_RichTea", "synpred25_RichTea", 
        "synpred23_RichTea", "synpred29_RichTea", "multiplicative_expression", 
        "synpred45_RichTea", "synpred40_RichTea", "synpred10_RichTea", "branch_list", 
        "program", "unary_expression", "synpred4_RichTea", "synpred41_RichTea", 
        "synpred5_RichTea", "synpred36_RichTea", "synpred30_RichTea", "additive_expression", 
        "implicitBranch", "synpred11_RichTea", "synpred32_RichTea", "synpred18_RichTea", 
        "array", "synpred28_RichTea", "synpred20_RichTea", "synpred9_RichTea", 
        "synpred35_RichTea", "synpred43_RichTea", "relational_expression", 
        "expression", "expression_value", "synpred27_RichTea", "branch", 
        "logical_expression", "boolean_expression", "variable", "equality_expression", 
        "synpred14_RichTea", "synpred21_RichTea", "synpred2_RichTea", "synpred24_RichTea", 
        "attribute_list", "synpred26_RichTea", "synpred33_RichTea", "synpred38_RichTea", 
        "synpred12_RichTea", "attribute", "synpred42_RichTea", "primary_expression", 
        "synpred15_RichTea", "power_expression", "function", "synpred19_RichTea", 
        "synpred39_RichTea", "synpred22_RichTea", "synpred3_RichTea"
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



        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:19:2: ( function )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:19:4: function
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(19,4);
            pushFollow(FOLLOW_function_in_program131);
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
        dbg.location(20, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:22:1: function : ( ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN )? -> ^( FUNCTION ^( NAME ID ) ( function_data )? ) | OPEN_PAREN function_data CLOSE_PAREN -> ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data ) );
    public final RichTeaParser.function_return function() throws RecognitionException {
        RichTeaParser.function_return retval = new RichTeaParser.function_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID2=null;
        Token OPEN_PAREN3=null;
        Token CLOSE_PAREN5=null;
        Token OPEN_PAREN6=null;
        Token CLOSE_PAREN8=null;
        RichTeaParser.function_data_return function_data4 = null;

        RichTeaParser.function_data_return function_data7 = null;


        Tree ID2_tree=null;
        Tree OPEN_PAREN3_tree=null;
        Tree CLOSE_PAREN5_tree=null;
        Tree OPEN_PAREN6_tree=null;
        Tree CLOSE_PAREN8_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_function_data=new RewriteRuleSubtreeStream(adaptor,"rule function_data");
        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:2: ( ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN )? -> ^( FUNCTION ^( NAME ID ) ( function_data )? ) | OPEN_PAREN function_data CLOSE_PAREN -> ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data ) )
            int alt3=2;
            try { dbg.enterDecision(3);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==OPEN_PAREN) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:4: ID ( OPEN_PAREN ( function_data )? CLOSE_PAREN )?
                    {
                    dbg.location(23,4);
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_function143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID2);

                    dbg.location(23,7);
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:7: ( OPEN_PAREN ( function_data )? CLOSE_PAREN )?
                    int alt2=2;
                    try { dbg.enterSubRule(2);
                    try { dbg.enterDecision(2);

                    try {
                        isCyclicDecision = true;
                        alt2 = dfa2.predict(input);
                    }
                    catch (NoViableAltException nvae) {
                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(2);}

                    switch (alt2) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:8: OPEN_PAREN ( function_data )? CLOSE_PAREN
                            {
                            dbg.location(23,8);
                            OPEN_PAREN3=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function146); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN3);

                            dbg.location(23,19);
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:19: ( function_data )?
                            int alt1=2;
                            try { dbg.enterSubRule(1);
                            try { dbg.enterDecision(1);

                            try {
                                isCyclicDecision = true;
                                alt1 = dfa1.predict(input);
                            }
                            catch (NoViableAltException nvae) {
                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(1);}

                            switch (alt1) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function_data
                                    {
                                    dbg.location(23,19);
                                    pushFollow(FOLLOW_function_data_in_function148);
                                    function_data4=function_data();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_function_data.add(function_data4.getTree());

                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(1);}

                            dbg.location(23,34);
                            CLOSE_PAREN5=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function151); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN5);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(2);}



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
                    // 24:4: -> ^( FUNCTION ^( NAME ID ) ( function_data )? )
                    {
                        dbg.location(24,7);
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:7: ^( FUNCTION ^( NAME ID ) ( function_data )? )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        dbg.location(24,9);
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                        dbg.location(24,18);
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:18: ^( NAME ID )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        dbg.location(24,20);
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_2);

                        dbg.location(24,25);
                        adaptor.addChild(root_2, stream_ID.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(24,29);
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:24:29: ( function_data )?
                        if ( stream_function_data.hasNext() ) {
                            dbg.location(24,29);
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
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:26:4: OPEN_PAREN function_data CLOSE_PAREN
                    {
                    dbg.location(26,4);
                    OPEN_PAREN6=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN6);

                    dbg.location(26,15);
                    pushFollow(FOLLOW_function_data_in_function182);
                    function_data7=function_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_data.add(function_data7.getTree());
                    dbg.location(26,29);
                    CLOSE_PAREN8=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN8);



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
                        dbg.location(27,7);
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:27:7: ^( FUNCTION ^( NAME ID[\"scope\"] ) function_data )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        dbg.location(27,9);
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                        dbg.location(27,18);
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:27:18: ^( NAME ID[\"scope\"] )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        dbg.location(27,20);
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_2);

                        dbg.location(27,25);
                        adaptor.addChild(root_2, (Tree)adaptor.create(ID, "scope"));

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(27,38);
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
        dbg.location(28, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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

        RichTeaParser.attribute_list_return attribute_list9 = null;

        RichTeaParser.branch_list_return branch_list10 = null;



        try { dbg.enterRule(getGrammarFileName(), "function_data");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:31:2: ( attribute_list branch_list )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:31:4: attribute_list branch_list
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(31,4);
            pushFollow(FOLLOW_attribute_list_in_function_data213);
            attribute_list9=attribute_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute_list9.getTree());
            dbg.location(31,19);
            pushFollow(FOLLOW_branch_list_in_function_data215);
            branch_list10=branch_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, branch_list10.getTree());

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
            dbg.exitRule(getGrammarFileName(), "function_data");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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

        Token COMMA11=null;
        List list_attributes=null;
        RuleReturnScope attributes = null;
        Tree COMMA11_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_implicitAttribute=new RewriteRuleSubtreeStream(adaptor,"rule implicitAttribute");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try { dbg.enterRule(getGrammarFileName(), "attribute_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:2: ( (attributes+= implicitAttribute )? ( ( COMMA )? attributes+= attribute )* -> ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:4: (attributes+= implicitAttribute )? ( ( COMMA )? attributes+= attribute )*
            {
            dbg.location(35,14);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:14: (attributes+= implicitAttribute )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            try {
                isCyclicDecision = true;
                alt4 = dfa4.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: attributes+= implicitAttribute
                    {
                    dbg.location(35,14);
                    pushFollow(FOLLOW_implicitAttribute_in_attribute_list230);
                    attributes=implicitAttribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicitAttribute.add(attributes.getTree());
                    if (list_attributes==null) list_attributes=new ArrayList();
                    list_attributes.add(attributes.getTree());


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(35,35);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:35: ( ( COMMA )? attributes+= attribute )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                try {
                    isCyclicDecision = true;
                    alt6 = dfa6.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:36: ( COMMA )? attributes+= attribute
            	    {
            	    dbg.location(35,36);
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:36: ( COMMA )?
            	    int alt5=2;
            	    try { dbg.enterSubRule(5);
            	    try { dbg.enterDecision(5);

            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==COMMA) ) {
            	        alt5=1;
            	    }
            	    } finally {dbg.exitDecision(5);}

            	    switch (alt5) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
            	            {
            	            dbg.location(35,36);
            	            COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_attribute_list234); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA11);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(5);}

            	    dbg.location(35,53);
            	    pushFollow(FOLLOW_attribute_in_attribute_list239);
            	    attributes=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_attribute.add(attributes.getTree());
            	    if (list_attributes==null) list_attributes=new ArrayList();
            	    list_attributes.add(attributes.getTree());


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}



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
                dbg.location(36,7);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:36:7: ^( ATTRIBUTES ( ^( ATTRIBUTE $attributes) )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(36,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES"), root_1);

                dbg.location(36,20);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:36:20: ( ^( ATTRIBUTE $attributes) )*
                while ( stream_attributes.hasNext() ) {
                    dbg.location(36,20);
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:36:20: ^( ATTRIBUTE $attributes)
                    {
                    Tree root_2 = (Tree)adaptor.nil();
                    dbg.location(36,22);
                    root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_2);

                    dbg.location(36,32);
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
        dbg.location(37, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:39:1: attribute : ID ( COLON | ASSIGN ) datatype -> ^( NAME ID ) ^( VALUE datatype ) ;
    public final RichTeaParser.attribute_return attribute() throws RecognitionException {
        RichTeaParser.attribute_return retval = new RichTeaParser.attribute_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID12=null;
        Token COLON13=null;
        Token ASSIGN14=null;
        RichTeaParser.datatype_return datatype15 = null;


        Tree ID12_tree=null;
        Tree COLON13_tree=null;
        Tree ASSIGN14_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try { dbg.enterRule(getGrammarFileName(), "attribute");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:2: ( ID ( COLON | ASSIGN ) datatype -> ^( NAME ID ) ^( VALUE datatype ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:4: ID ( COLON | ASSIGN ) datatype
            {
            dbg.location(40,4);
            ID12=(Token)match(input,ID,FOLLOW_ID_in_attribute270); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID12);

            dbg.location(40,7);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:7: ( COLON | ASSIGN )
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==COLON) ) {
                alt7=1;
            }
            else if ( (LA7_0==ASSIGN) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:8: COLON
                    {
                    dbg.location(40,8);
                    COLON13=(Token)match(input,COLON,FOLLOW_COLON_in_attribute273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON13);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:40:16: ASSIGN
                    {
                    dbg.location(40,16);
                    ASSIGN14=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attribute277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN14);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(40,25);
            pushFollow(FOLLOW_datatype_in_attribute281);
            datatype15=datatype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_datatype.add(datatype15.getTree());


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
            // 41:4: -> ^( NAME ID ) ^( VALUE datatype )
            {
                dbg.location(41,7);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:41:7: ^( NAME ID )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(41,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                dbg.location(41,14);
                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(41,18);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:41:18: ^( VALUE datatype )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(41,20);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VALUE, "VALUE"), root_1);

                dbg.location(41,26);
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
        dbg.location(42, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attribute");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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

        RichTeaParser.datatype_return datatype16 = null;


        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try { dbg.enterRule(getGrammarFileName(), "implicitAttribute");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:45:2: ( datatype -> ^( NAME ID[\"implicitAttribute\"] ) ^( VALUE datatype ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:45:4: datatype
            {
            dbg.location(45,4);
            pushFollow(FOLLOW_datatype_in_implicitAttribute310);
            datatype16=datatype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_datatype.add(datatype16.getTree());


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
                dbg.location(46,7);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:46:7: ^( NAME ID[\"implicitAttribute\"] )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(46,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                dbg.location(46,14);
                adaptor.addChild(root_1, (Tree)adaptor.create(ID, "implicitAttribute"));

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(46,39);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:46:39: ^( VALUE datatype )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(46,41);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VALUE, "VALUE"), root_1);

                dbg.location(46,47);
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
        dbg.location(47, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "implicitAttribute");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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

        Token COMMA17=null;
        List list_branches=null;
        RuleReturnScope branches = null;
        Tree COMMA17_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_implicitBranch=new RewriteRuleSubtreeStream(adaptor,"rule implicitBranch");
        RewriteRuleSubtreeStream stream_branch=new RewriteRuleSubtreeStream(adaptor,"rule branch");
        try { dbg.enterRule(getGrammarFileName(), "branch_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:2: ( (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )* -> ^( BRANCHES ( ^( BRANCH $branches) )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:4: (branches+= implicitBranch )? ( ( COMMA )? branches+= branch )*
            {
            dbg.location(50,12);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:12: (branches+= implicitBranch )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            try {
                isCyclicDecision = true;
                alt8 = dfa8.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: branches+= implicitBranch
                    {
                    dbg.location(50,12);
                    pushFollow(FOLLOW_implicitBranch_in_branch_list343);
                    branches=implicitBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicitBranch.add(branches.getTree());
                    if (list_branches==null) list_branches=new ArrayList();
                    list_branches.add(branches.getTree());


                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(50,30);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:30: ( ( COMMA )? branches+= branch )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==COMMA||(LA10_0>=HASH && LA10_0<=STRING)) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:31: ( COMMA )? branches+= branch
            	    {
            	    dbg.location(50,31);
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:50:31: ( COMMA )?
            	    int alt9=2;
            	    try { dbg.enterSubRule(9);
            	    try { dbg.enterDecision(9);

            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==COMMA) ) {
            	        alt9=1;
            	    }
            	    } finally {dbg.exitDecision(9);}

            	    switch (alt9) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
            	            {
            	            dbg.location(50,31);
            	            COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_branch_list347); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA17);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(9);}

            	    dbg.location(50,46);
            	    pushFollow(FOLLOW_branch_in_branch_list352);
            	    branches=branch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_branch.add(branches.getTree());
            	    if (list_branches==null) list_branches=new ArrayList();
            	    list_branches.add(branches.getTree());


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}



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
                dbg.location(51,7);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:7: ^( BRANCHES ( ^( BRANCH $branches) )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(51,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(BRANCHES, "BRANCHES"), root_1);

                dbg.location(51,18);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:18: ( ^( BRANCH $branches) )*
                while ( stream_branches.hasNext() ) {
                    dbg.location(51,18);
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:51:18: ^( BRANCH $branches)
                    {
                    Tree root_2 = (Tree)adaptor.nil();
                    dbg.location(51,20);
                    root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(BRANCH, "BRANCH"), root_2);

                    dbg.location(51,27);
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
        dbg.location(52, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "branch_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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
        Token HASH18=null;
        Token OPEN_BRACE19=null;
        Token CLOSE_BRACE21=null;
        RichTeaParser.function_return function20 = null;


        Tree name_tree=null;
        Tree HASH18_tree=null;
        Tree OPEN_BRACE19_tree=null;
        Tree CLOSE_BRACE21_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try { dbg.enterRule(getGrammarFileName(), "branch");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:2: ( ( HASH )? (name= ID | name= STRING ) OPEN_BRACE ( function )* CLOSE_BRACE -> ^( NAME $name) ^( CHILDREN ( function )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:4: ( HASH )? (name= ID | name= STRING ) OPEN_BRACE ( function )* CLOSE_BRACE
            {
            dbg.location(55,4);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:4: ( HASH )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==HASH) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: HASH
                    {
                    dbg.location(55,4);
                    HASH18=(Token)match(input,HASH,FOLLOW_HASH_in_branch384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HASH.add(HASH18);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(55,10);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:10: (name= ID | name= STRING )
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==STRING) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:11: name= ID
                    {
                    dbg.location(55,15);
                    name=(Token)match(input,ID,FOLLOW_ID_in_branch390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(name);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:21: name= STRING
                    {
                    dbg.location(55,25);
                    name=(Token)match(input,STRING,FOLLOW_STRING_in_branch396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(name);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}

            dbg.location(55,34);
            OPEN_BRACE19=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_branch399); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE19);

            dbg.location(55,45);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:55:45: ( function )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=ID && LA13_0<=OPEN_PAREN)) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function
            	    {
            	    dbg.location(55,45);
            	    pushFollow(FOLLOW_function_in_branch401);
            	    function20=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function.add(function20.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}

            dbg.location(55,55);
            CLOSE_BRACE21=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_branch404); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE21);



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
                dbg.location(56,7);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:56:7: ^( NAME $name)
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(56,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                dbg.location(56,14);
                adaptor.addChild(root_1, stream_name.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(56,21);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:56:21: ^( CHILDREN ( function )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(56,23);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(CHILDREN, "CHILDREN"), root_1);

                dbg.location(56,32);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:56:32: ( function )*
                while ( stream_function.hasNext() ) {
                    dbg.location(56,32);
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
        dbg.location(57, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "branch");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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

        Token HASH22=null;
        Token OPEN_BRACE23=null;
        Token CLOSE_BRACE25=null;
        RichTeaParser.function_return function24 = null;


        Tree HASH22_tree=null;
        Tree OPEN_BRACE23_tree=null;
        Tree CLOSE_BRACE25_tree=null;
        RewriteRuleTokenStream stream_HASH=new RewriteRuleTokenStream(adaptor,"token HASH");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try { dbg.enterRule(getGrammarFileName(), "implicitBranch");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:2: ( ( HASH )? OPEN_BRACE ( function )* CLOSE_BRACE -> ^( NAME ID[\"implicitBranch\"] ) ^( CHILDREN ( function )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:4: ( HASH )? OPEN_BRACE ( function )* CLOSE_BRACE
            {
            dbg.location(60,4);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:4: ( HASH )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==HASH) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: HASH
                    {
                    dbg.location(60,4);
                    HASH22=(Token)match(input,HASH,FOLLOW_HASH_in_implicitBranch435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HASH.add(HASH22);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}

            dbg.location(60,10);
            OPEN_BRACE23=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_implicitBranch438); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE23);

            dbg.location(60,21);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:21: ( function )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=ID && LA15_0<=OPEN_PAREN)) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function
            	    {
            	    dbg.location(60,21);
            	    pushFollow(FOLLOW_function_in_implicitBranch440);
            	    function24=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function.add(function24.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}

            dbg.location(60,31);
            CLOSE_BRACE25=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_implicitBranch443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE25);



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
                dbg.location(61,7);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:61:7: ^( NAME ID[\"implicitBranch\"] )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(61,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                dbg.location(61,14);
                adaptor.addChild(root_1, (Tree)adaptor.create(ID, "implicitBranch"));

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(61,36);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:61:36: ^( CHILDREN ( function )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(61,38);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(CHILDREN, "CHILDREN"), root_1);

                dbg.location(61,47);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:61:47: ( function )*
                while ( stream_function.hasNext() ) {
                    dbg.location(61,47);
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
        dbg.location(62, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "implicitBranch");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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

        RichTeaParser.expression_return expression26 = null;

        RichTeaParser.function_return function27 = null;

        RichTeaParser.array_return array28 = null;



        try { dbg.enterRule(getGrammarFileName(), "datatype");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:2: ( expression | function | array )
            int alt16=3;
            try { dbg.enterDecision(16);

            try {
                isCyclicDecision = true;
                alt16 = dfa16.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:4: expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(65,4);
                    pushFollow(FOLLOW_expression_in_datatype473);
                    expression26=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression26.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:66:4: function
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(66,4);
                    pushFollow(FOLLOW_function_in_datatype478);
                    function27=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function27.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:67:5: array
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(67,5);
                    pushFollow(FOLLOW_array_in_datatype484);
                    array28=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array28.getTree());

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
        dbg.location(68, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:70:1: array : OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX -> ^( ARRAY ( datatype )* ) ;
    public final RichTeaParser.array_return array() throws RecognitionException {
        RichTeaParser.array_return retval = new RichTeaParser.array_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_BOX29=null;
        Token COMMA31=null;
        Token CLOSE_BOX33=null;
        RichTeaParser.datatype_return datatype30 = null;

        RichTeaParser.datatype_return datatype32 = null;


        Tree OPEN_BOX29_tree=null;
        Tree COMMA31_tree=null;
        Tree CLOSE_BOX33_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BOX=new RewriteRuleTokenStream(adaptor,"token CLOSE_BOX");
        RewriteRuleTokenStream stream_OPEN_BOX=new RewriteRuleTokenStream(adaptor,"token OPEN_BOX");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try { dbg.enterRule(getGrammarFileName(), "array");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:2: ( OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX -> ^( ARRAY ( datatype )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:4: OPEN_BOX ( datatype ( COMMA datatype )* )? CLOSE_BOX
            {
            dbg.location(71,4);
            OPEN_BOX29=(Token)match(input,OPEN_BOX,FOLLOW_OPEN_BOX_in_array495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BOX.add(OPEN_BOX29);

            dbg.location(71,13);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:13: ( datatype ( COMMA datatype )* )?
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18);

            try {
                isCyclicDecision = true;
                alt18 = dfa18.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:14: datatype ( COMMA datatype )*
                    {
                    dbg.location(71,14);
                    pushFollow(FOLLOW_datatype_in_array498);
                    datatype30=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_datatype.add(datatype30.getTree());
                    dbg.location(71,23);
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:23: ( COMMA datatype )*
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:24: COMMA datatype
                    	    {
                    	    dbg.location(71,24);
                    	    COMMA31=(Token)match(input,COMMA,FOLLOW_COMMA_in_array501); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA31);

                    	    dbg.location(71,30);
                    	    pushFollow(FOLLOW_datatype_in_array503);
                    	    datatype32=datatype();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_datatype.add(datatype32.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(17);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}

            dbg.location(71,44);
            CLOSE_BOX33=(Token)match(input,CLOSE_BOX,FOLLOW_CLOSE_BOX_in_array510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BOX.add(CLOSE_BOX33);



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
                dbg.location(72,7);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:7: ^( ARRAY ( datatype )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(72,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ARRAY, "ARRAY"), root_1);

                dbg.location(72,15);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:15: ( datatype )*
                while ( stream_datatype.hasNext() ) {
                    dbg.location(72,15);
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
        dbg.location(73, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "array");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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

        Token QUESTION_MARK35=null;
        Token COLON37=null;
        RichTeaParser.logical_expression_return logical_expression34 = null;

        RichTeaParser.logical_expression_return logical_expression36 = null;

        RichTeaParser.logical_expression_return logical_expression38 = null;

        RichTeaParser.logical_expression_return logical_expression39 = null;


        Tree QUESTION_MARK35_tree=null;
        Tree COLON37_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_logical_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_expression");
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:2: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression )
            int alt19=2;
            try { dbg.enterDecision(19);

            try {
                isCyclicDecision = true;
                alt19 = dfa19.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
                    {
                    dbg.location(78,4);
                    pushFollow(FOLLOW_logical_expression_in_expression538);
                    logical_expression34=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression34.getTree());
                    dbg.location(78,23);
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:23: ( QUESTION_MARK logical_expression COLON logical_expression )
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:24: QUESTION_MARK logical_expression COLON logical_expression
                    {
                    dbg.location(78,24);
                    QUESTION_MARK35=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_expression541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK35);

                    dbg.location(78,38);
                    pushFollow(FOLLOW_logical_expression_in_expression543);
                    logical_expression36=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression36.getTree());
                    dbg.location(78,57);
                    COLON37=(Token)match(input,COLON,FOLLOW_COLON_in_expression545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON37);

                    dbg.location(78,63);
                    pushFollow(FOLLOW_logical_expression_in_expression547);
                    logical_expression38=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_expression.add(logical_expression38.getTree());

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
                        dbg.location(78,86);
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:86: ^( TERNARY_OPERATOR ( logical_expression )+ )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        dbg.location(78,88);
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(TERNARY_OPERATOR, "TERNARY_OPERATOR"), root_1);

                        dbg.location(78,105);
                        if ( !(stream_logical_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_logical_expression.hasNext() ) {
                            dbg.location(78,105);
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
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:79:4: logical_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(79,4);
                    pushFollow(FOLLOW_logical_expression_in_expression562);
                    logical_expression39=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression39.getTree());

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
        dbg.location(80, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:1: logical_expression : boolean_expression ( OR boolean_expression )* ;
    public final RichTeaParser.logical_expression_return logical_expression() throws RecognitionException {
        RichTeaParser.logical_expression_return retval = new RichTeaParser.logical_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OR41=null;
        RichTeaParser.boolean_expression_return boolean_expression40 = null;

        RichTeaParser.boolean_expression_return boolean_expression42 = null;


        Tree OR41_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "logical_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:2: ( boolean_expression ( OR boolean_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:4: boolean_expression ( OR boolean_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(83,4);
            pushFollow(FOLLOW_boolean_expression_in_logical_expression574);
            boolean_expression40=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression40.getTree());
            dbg.location(83,23);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:23: ( OR boolean_expression )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                try {
                    isCyclicDecision = true;
                    alt20 = dfa20.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:24: OR boolean_expression
            	    {
            	    dbg.location(83,26);
            	    OR41=(Token)match(input,OR,FOLLOW_OR_in_logical_expression577); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR41_tree = (Tree)adaptor.create(OR41);
            	    root_0 = (Tree)adaptor.becomeRoot(OR41_tree, root_0);
            	    }
            	    dbg.location(83,28);
            	    pushFollow(FOLLOW_boolean_expression_in_logical_expression580);
            	    boolean_expression42=boolean_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression42.getTree());

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
        dbg.location(84, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:86:1: boolean_expression : equality_expression ( AND equality_expression )* ;
    public final RichTeaParser.boolean_expression_return boolean_expression() throws RecognitionException {
        RichTeaParser.boolean_expression_return retval = new RichTeaParser.boolean_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token AND44=null;
        RichTeaParser.equality_expression_return equality_expression43 = null;

        RichTeaParser.equality_expression_return equality_expression45 = null;


        Tree AND44_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "boolean_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:2: ( equality_expression ( AND equality_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:4: equality_expression ( AND equality_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(87,4);
            pushFollow(FOLLOW_equality_expression_in_boolean_expression593);
            equality_expression43=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression43.getTree());
            dbg.location(87,24);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:24: ( AND equality_expression )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                try {
                    isCyclicDecision = true;
                    alt21 = dfa21.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:25: AND equality_expression
            	    {
            	    dbg.location(87,28);
            	    AND44=(Token)match(input,AND,FOLLOW_AND_in_boolean_expression596); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND44_tree = (Tree)adaptor.create(AND44);
            	    root_0 = (Tree)adaptor.becomeRoot(AND44_tree, root_0);
            	    }
            	    dbg.location(87,30);
            	    pushFollow(FOLLOW_equality_expression_in_boolean_expression599);
            	    equality_expression45=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression45.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}


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
        dbg.location(88, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:90:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final RichTeaParser.equality_expression_return equality_expression() throws RecognitionException {
        RichTeaParser.equality_expression_return retval = new RichTeaParser.equality_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set47=null;
        RichTeaParser.relational_expression_return relational_expression46 = null;

        RichTeaParser.relational_expression_return relational_expression48 = null;


        Tree set47_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equality_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:4: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(91,4);
            pushFollow(FOLLOW_relational_expression_in_equality_expression613);
            relational_expression46=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression46.getTree());
            dbg.location(91,26);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:26: ( ( EQ | NEQ ) relational_expression )*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22);

                try {
                    isCyclicDecision = true;
                    alt22 = dfa22.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:27: ( EQ | NEQ ) relational_expression
            	    {
            	    dbg.location(91,27);
            	    set47=(Token)input.LT(1);
            	    set47=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
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

            	    dbg.location(91,41);
            	    pushFollow(FOLLOW_relational_expression_in_equality_expression627);
            	    relational_expression48=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression48.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);
            } finally {dbg.exitSubRule(22);}


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
        dbg.location(92, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:94:1: relational_expression : additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* ;
    public final RichTeaParser.relational_expression_return relational_expression() throws RecognitionException {
        RichTeaParser.relational_expression_return retval = new RichTeaParser.relational_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set50=null;
        RichTeaParser.additive_expression_return additive_expression49 = null;

        RichTeaParser.additive_expression_return additive_expression51 = null;


        Tree set50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "relational_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:95:2: ( additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:95:4: additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(95,4);
            pushFollow(FOLLOW_additive_expression_in_relational_expression641);
            additive_expression49=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression49.getTree());
            dbg.location(95,24);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:95:24: ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                try {
                    isCyclicDecision = true;
                    alt23 = dfa23.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:95:25: ( LT | LTEQ | GT | GTEQ ) additive_expression
            	    {
            	    dbg.location(95,25);
            	    set50=(Token)input.LT(1);
            	    set50=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT && input.LA(1)<=GTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set50), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(95,52);
            	    pushFollow(FOLLOW_additive_expression_in_relational_expression663);
            	    additive_expression51=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression51.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}


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
        dbg.location(96, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:98:1: additive_expression : multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )* ;
    public final RichTeaParser.additive_expression_return additive_expression() throws RecognitionException {
        RichTeaParser.additive_expression_return retval = new RichTeaParser.additive_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set53=null;
        RichTeaParser.multiplicative_expression_return multiplicative_expression52 = null;

        RichTeaParser.multiplicative_expression_return multiplicative_expression54 = null;


        Tree set53_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "additive_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:99:2: ( multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:99:4: multiplicative_expression ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(99,4);
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression677);
            multiplicative_expression52=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression52.getTree());
            dbg.location(99,30);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:99:30: ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24);

                try {
                    isCyclicDecision = true;
                    alt24 = dfa24.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:99:31: ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression
            	    {
            	    dbg.location(99,31);
            	    set53=(Token)input.LT(1);
            	    set53=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS_EQUALS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set53), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(99,78);
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression699);
            	    multiplicative_expression54=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression54.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}


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
        dbg.location(100, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:1: multiplicative_expression : power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )* ;
    public final RichTeaParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        RichTeaParser.multiplicative_expression_return retval = new RichTeaParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set56=null;
        RichTeaParser.power_expression_return power_expression55 = null;

        RichTeaParser.power_expression_return power_expression57 = null;


        Tree set56_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "multiplicative_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:2: ( power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:4: power_expression ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(103,4);
            pushFollow(FOLLOW_power_expression_in_multiplicative_expression713);
            power_expression55=power_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression55.getTree());
            dbg.location(103,21);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:21: ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                try {
                    isCyclicDecision = true;
                    alt25 = dfa25.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:22: ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression
            	    {
            	    dbg.location(103,22);
            	    set56=(Token)input.LT(1);
            	    set56=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULTIPLY_EQUALS && input.LA(1)<=MODULUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set56), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(103,89);
            	    pushFollow(FOLLOW_power_expression_in_multiplicative_expression739);
            	    power_expression57=power_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression57.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}


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
        dbg.location(104, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:106:1: power_expression : unary_expression ( POWER unary_expression )* ;
    public final RichTeaParser.power_expression_return power_expression() throws RecognitionException {
        RichTeaParser.power_expression_return retval = new RichTeaParser.power_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token POWER59=null;
        RichTeaParser.unary_expression_return unary_expression58 = null;

        RichTeaParser.unary_expression_return unary_expression60 = null;


        Tree POWER59_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "power_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:2: ( unary_expression ( POWER unary_expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:4: unary_expression ( POWER unary_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            dbg.location(107,4);
            pushFollow(FOLLOW_unary_expression_in_power_expression753);
            unary_expression58=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression58.getTree());
            dbg.location(107,21);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:21: ( POWER unary_expression )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                try {
                    isCyclicDecision = true;
                    alt26 = dfa26.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:23: POWER unary_expression
            	    {
            	    dbg.location(107,28);
            	    POWER59=(Token)match(input,POWER,FOLLOW_POWER_in_power_expression757); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER59_tree = (Tree)adaptor.create(POWER59);
            	    root_0 = (Tree)adaptor.becomeRoot(POWER59_tree, root_0);
            	    }
            	    dbg.location(107,30);
            	    pushFollow(FOLLOW_unary_expression_in_power_expression760);
            	    unary_expression60=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression60.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}


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
        dbg.location(108, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:110:1: unary_expression : ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) );
    public final RichTeaParser.unary_expression_return unary_expression() throws RecognitionException {
        RichTeaParser.unary_expression_return retval = new RichTeaParser.unary_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token NOT62=null;
        Token MINUS64=null;
        RichTeaParser.primary_expression_return primary_expression61 = null;

        RichTeaParser.primary_expression_return primary_expression63 = null;

        RichTeaParser.primary_expression_return primary_expression65 = null;


        Tree NOT62_tree=null;
        Tree MINUS64_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try { dbg.enterRule(getGrammarFileName(), "unary_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:111:2: ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) )
            int alt27=3;
            try { dbg.enterDecision(27);

            switch ( input.LA(1) ) {
            case ID:
            case OPEN_PAREN:
            case STRING:
            case NUMBER:
            case BOOLEAN:
                {
                alt27=1;
                }
                break;
            case NOT:
                {
                alt27=2;
                }
                break;
            case MINUS:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:111:4: primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(111,4);
                    pushFollow(FOLLOW_primary_expression_in_unary_expression773);
                    primary_expression61=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression61.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:112:4: NOT primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(112,7);
                    NOT62=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression778); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT62_tree = (Tree)adaptor.create(NOT62);
                    root_0 = (Tree)adaptor.becomeRoot(NOT62_tree, root_0);
                    }
                    dbg.location(112,9);
                    pushFollow(FOLLOW_primary_expression_in_unary_expression781);
                    primary_expression63=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression63.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:113:4: MINUS primary_expression
                    {
                    dbg.location(113,4);
                    MINUS64=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression786); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS64);

                    dbg.location(113,10);
                    pushFollow(FOLLOW_primary_expression_in_unary_expression788);
                    primary_expression65=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression65.getTree());


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
                        dbg.location(113,32);
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:113:32: ^( NEGATE primary_expression )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        dbg.location(113,34);
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NEGATE, "NEGATE"), root_1);

                        dbg.location(113,41);
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
        dbg.location(114, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:116:1: primary_expression : ( expression_value | OPEN_PAREN logical_expression CLOSE_PAREN );
    public final RichTeaParser.primary_expression_return primary_expression() throws RecognitionException {
        RichTeaParser.primary_expression_return retval = new RichTeaParser.primary_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_PAREN67=null;
        Token CLOSE_PAREN69=null;
        RichTeaParser.expression_value_return expression_value66 = null;

        RichTeaParser.logical_expression_return logical_expression68 = null;


        Tree OPEN_PAREN67_tree=null;
        Tree CLOSE_PAREN69_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "primary_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:117:2: ( expression_value | OPEN_PAREN logical_expression CLOSE_PAREN )
            int alt28=2;
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID||LA28_0==STRING||(LA28_0>=NUMBER && LA28_0<=BOOLEAN)) ) {
                alt28=1;
            }
            else if ( (LA28_0==OPEN_PAREN) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:117:4: expression_value
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(117,4);
                    pushFollow(FOLLOW_expression_value_in_primary_expression808);
                    expression_value66=expression_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_value66.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:118:4: OPEN_PAREN logical_expression CLOSE_PAREN
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(118,14);
                    OPEN_PAREN67=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_primary_expression813); if (state.failed) return retval;
                    dbg.location(118,16);
                    pushFollow(FOLLOW_logical_expression_in_primary_expression816);
                    logical_expression68=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression68.getTree());
                    dbg.location(118,46);
                    CLOSE_PAREN69=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_primary_expression818); if (state.failed) return retval;

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
        dbg.location(119, 2);

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:121:1: expression_value : ( NUMBER | BOOLEAN | STRING | variable );
    public final RichTeaParser.expression_value_return expression_value() throws RecognitionException {
        RichTeaParser.expression_value_return retval = new RichTeaParser.expression_value_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token NUMBER70=null;
        Token BOOLEAN71=null;
        Token STRING72=null;
        RichTeaParser.variable_return variable73 = null;


        Tree NUMBER70_tree=null;
        Tree BOOLEAN71_tree=null;
        Tree STRING72_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:122:2: ( NUMBER | BOOLEAN | STRING | variable )
            int alt29=4;
            try { dbg.enterDecision(29);

            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt29=1;
                }
                break;
            case BOOLEAN:
                {
                alt29=2;
                }
                break;
            case STRING:
                {
                alt29=3;
                }
                break;
            case ID:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:122:4: NUMBER
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(122,4);
                    NUMBER70=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expression_value830); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER70_tree = (Tree)adaptor.create(NUMBER70);
                    adaptor.addChild(root_0, NUMBER70_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:123:4: BOOLEAN
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(123,4);
                    BOOLEAN71=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expression_value835); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN71_tree = (Tree)adaptor.create(BOOLEAN71);
                    adaptor.addChild(root_0, BOOLEAN71_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:124:4: STRING
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(124,4);
                    STRING72=(Token)match(input,STRING,FOLLOW_STRING_in_expression_value840); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING72_tree = (Tree)adaptor.create(STRING72);
                    adaptor.addChild(root_0, STRING72_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:125:5: variable
                    {
                    root_0 = (Tree)adaptor.nil();

                    dbg.location(125,5);
                    pushFollow(FOLLOW_variable_in_expression_value846);
                    variable73=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable73.getTree());

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
        dbg.location(126, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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

        Token ID74=null;
        Token PERIOD75=null;
        Token ID76=null;

        Tree ID74_tree=null;
        Tree PERIOD75_tree=null;
        Tree ID76_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try { dbg.enterRule(getGrammarFileName(), "variable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:2: ( ( ID ( PERIOD ID )* ) -> ^( VARIABLE ( ^( ID ) )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:4: ( ID ( PERIOD ID )* )
            {
            dbg.location(129,4);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:4: ( ID ( PERIOD ID )* )
            dbg.enterAlt(1);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:5: ID ( PERIOD ID )*
            {
            dbg.location(129,5);
            ID74=(Token)match(input,ID,FOLLOW_ID_in_variable859); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID74);

            dbg.location(129,8);
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:8: ( PERIOD ID )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30);

                try {
                    isCyclicDecision = true;
                    alt30 = dfa30.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:9: PERIOD ID
            	    {
            	    dbg.location(129,9);
            	    PERIOD75=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_variable862); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD75);

            	    dbg.location(129,16);
            	    ID76=(Token)match(input,ID,FOLLOW_ID_in_variable864); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID76);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}


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
                dbg.location(130,7);
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:130:7: ^( VARIABLE ( ^( ID ) )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                dbg.location(130,9);
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                dbg.location(130,18);
                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    dbg.location(130,18);
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:130:18: ^( ID )
                    {
                    Tree root_2 = (Tree)adaptor.nil();
                    dbg.location(130,20);
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
        dbg.location(131, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variable"

    // $ANTLR start synpred1_RichTea
    public final void synpred1_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:19: ( function_data )
        dbg.enterAlt(1);

        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:19: function_data
        {
        dbg.location(23,19);
        pushFollow(FOLLOW_function_data_in_synpred1_RichTea148);
        function_data();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_RichTea

    // $ANTLR start synpred2_RichTea
    public final void synpred2_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:8: ( OPEN_PAREN ( function_data )? CLOSE_PAREN )
        dbg.enterAlt(1);

        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:8: OPEN_PAREN ( function_data )? CLOSE_PAREN
        {
        dbg.location(23,8);
        match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_synpred2_RichTea146); if (state.failed) return ;
        dbg.location(23,19);
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:23:19: ( function_data )?
        int alt31=2;
        try { dbg.enterSubRule(31);
        try { dbg.enterDecision(31);

        try {
            isCyclicDecision = true;
            alt31 = dfa31.predict(input);
        }
        catch (NoViableAltException nvae) {
            dbg.recognitionException(nvae);
            throw nvae;
        }
        } finally {dbg.exitDecision(31);}

        switch (alt31) {
            case 1 :
                dbg.enterAlt(1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function_data
                {
                dbg.location(23,19);
                pushFollow(FOLLOW_function_data_in_synpred2_RichTea148);
                function_data();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(31);}

        dbg.location(23,34);
        match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_synpred2_RichTea151); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_RichTea

    // $ANTLR start synpred4_RichTea
    public final void synpred4_RichTea_fragment() throws RecognitionException {   
        List list_attributes=null;
        RuleReturnScope attributes = null;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:14: (attributes+= implicitAttribute )
        dbg.enterAlt(1);

        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:14: attributes+= implicitAttribute
        {
        dbg.location(35,14);
        pushFollow(FOLLOW_implicitAttribute_in_synpred4_RichTea230);
        attributes=implicitAttribute();

        state._fsp--;
        if (state.failed) return ;
        if (list_attributes==null) list_attributes=new ArrayList();
        list_attributes.add(attributes);


        }
    }
    // $ANTLR end synpred4_RichTea

    // $ANTLR start synpred6_RichTea
    public final void synpred6_RichTea_fragment() throws RecognitionException {   
        List list_attributes=null;
        RuleReturnScope attributes = null;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:36: ( ( COMMA )? attributes+= attribute )
        dbg.enterAlt(1);

        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:36: ( COMMA )? attributes+= attribute
        {
        dbg.location(35,36);
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:35:36: ( COMMA )?
        int alt34=2;
        try { dbg.enterSubRule(34);
        try { dbg.enterDecision(34);

        int LA34_0 = input.LA(1);

        if ( (LA34_0==COMMA) ) {
            alt34=1;
        }
        } finally {dbg.exitDecision(34);}

        switch (alt34) {
            case 1 :
                dbg.enterAlt(1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
                {
                dbg.location(35,36);
                match(input,COMMA,FOLLOW_COMMA_in_synpred6_RichTea234); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(34);}

        dbg.location(35,53);
        pushFollow(FOLLOW_attribute_in_synpred6_RichTea239);
        attributes=attribute();

        state._fsp--;
        if (state.failed) return ;
        if (list_attributes==null) list_attributes=new ArrayList();
        list_attributes.add(attributes);


        }
    }
    // $ANTLR end synpred6_RichTea

    // $ANTLR start synpred16_RichTea
    public final void synpred16_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:4: ( expression )
        dbg.enterAlt(1);

        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:4: expression
        {
        dbg.location(65,4);
        pushFollow(FOLLOW_expression_in_synpred16_RichTea473);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_RichTea

    // $ANTLR start synpred17_RichTea
    public final void synpred17_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:66:4: ( function )
        dbg.enterAlt(1);

        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:66:4: function
        {
        dbg.location(66,4);
        pushFollow(FOLLOW_function_in_synpred17_RichTea478);
        function();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_RichTea

    // $ANTLR start synpred20_RichTea
    public final void synpred20_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:4: ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) )
        dbg.enterAlt(1);

        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:4: logical_expression ( QUESTION_MARK logical_expression COLON logical_expression )
        {
        dbg.location(78,4);
        pushFollow(FOLLOW_logical_expression_in_synpred20_RichTea538);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(78,23);
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:23: ( QUESTION_MARK logical_expression COLON logical_expression )
        dbg.enterAlt(1);

        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:24: QUESTION_MARK logical_expression COLON logical_expression
        {
        dbg.location(78,24);
        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred20_RichTea541); if (state.failed) return ;
        dbg.location(78,38);
        pushFollow(FOLLOW_logical_expression_in_synpred20_RichTea543);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(78,57);
        match(input,COLON,FOLLOW_COLON_in_synpred20_RichTea545); if (state.failed) return ;
        dbg.location(78,63);
        pushFollow(FOLLOW_logical_expression_in_synpred20_RichTea547);
        logical_expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_RichTea

    // Delegated rules

    public final boolean synpred6_RichTea() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred6_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_RichTea() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_RichTea() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred16_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_RichTea() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred4_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_RichTea() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_RichTea() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred20_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_RichTea() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred17_RichTea_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA2_eotS =
        "\30\uffff";
    static final String DFA2_eofS =
        "\1\2\27\uffff";
    static final String DFA2_minS =
        "\2\20\11\uffff\14\0\1\uffff";
    static final String DFA2_maxS =
        "\1\33\1\61\11\uffff\14\0\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\24\uffff\1\1";
    static final String DFA2_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\1\2\2\2\uffff\4\2\1\uffff\1\2",
            "\1\16\1\17\1\26\1\23\2\uffff\1\24\1\15\1\25\1\uffff\1\22\15"+
            "\uffff\1\21\6\uffff\1\20\1\13\1\14",
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
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_13 = input.LA(1);

                         
                        int index2_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_14 = input.LA(1);

                         
                        int index2_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_15 = input.LA(1);

                         
                        int index2_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_16 = input.LA(1);

                         
                        int index2_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_17 = input.LA(1);

                         
                        int index2_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_18 = input.LA(1);

                         
                        int index2_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_19 = input.LA(1);

                         
                        int index2_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_20 = input.LA(1);

                         
                        int index2_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_20);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_21 = input.LA(1);

                         
                        int index2_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_21);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_22 = input.LA(1);

                         
                        int index2_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_RichTea()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_22);
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
        "\30\uffff";
    static final String DFA1_eofS =
        "\30\uffff";
    static final String DFA1_minS =
        "\1\20\13\uffff\1\0\13\uffff";
    static final String DFA1_maxS =
        "\1\61\13\uffff\1\0\13\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\25\uffff\1\2";
    static final String DFA1_specialS =
        "\14\uffff\1\0\13\uffff}>";
    static final String[] DFA1_transitionS = {
            "\2\1\1\14\1\1\2\uffff\3\1\1\uffff\1\1\15\uffff\1\1\6\uffff"+
            "\3\1",
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
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
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

                        else if ( (true) ) {s = 23;}

                         
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
    static final String DFA4_eotS =
        "\60\uffff";
    static final String DFA4_eofS =
        "\1\11\2\uffff\2\1\53\uffff";
    static final String DFA4_minS =
        "\1\20\2\uffff\2\20\11\uffff\1\0\22\uffff\1\0\16\uffff";
    static final String DFA4_maxS =
        "\1\61\2\uffff\1\56\1\62\11\uffff\1\0\22\uffff\1\0\16\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\46\uffff";
    static final String DFA4_specialS =
        "\16\uffff\1\0\22\uffff\1\1\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\1\1\2\11\2\uffff\1\11\1\3\1\11\1\uffff\1\1\15\uffff\1"+
            "\1\6\uffff\3\1",
            "",
            "",
            "\1\1\1\uffff\2\1\2\uffff\2\1\1\16\3\uffff\23\1",
            "\4\1\2\11\2\1\1\41\3\uffff\23\1\3\uffff\1\1",
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
            return "35:14: (attributes+= implicitAttribute )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_14 = input.LA(1);

                         
                        int index4_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_RichTea()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_33 = input.LA(1);

                         
                        int index4_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_RichTea()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_33);
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
        "\16\uffff";
    static final String DFA6_eofS =
        "\1\1\15\uffff";
    static final String DFA6_minS =
        "\1\20\2\uffff\1\20\1\24\3\uffff\1\0\5\uffff";
    static final String DFA6_maxS =
        "\1\30\2\uffff\1\27\1\30\3\uffff\1\0\5\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\2\12\uffff\1\1\1\uffff";
    static final String DFA6_specialS =
        "\10\uffff\1\0\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\4\1\uffff\1\1\1\3\2\uffff\3\1",
            "",
            "",
            "\1\10\5\uffff\2\1",
            "\2\14\2\uffff\1\1",
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
            return "()* loopback of 35:35: ( ( COMMA )? attributes+= attribute )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_8 = input.LA(1);

                         
                        int index6_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_RichTea()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_8);
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
        "\13\uffff";
    static final String DFA8_eofS =
        "\1\3\12\uffff";
    static final String DFA8_minS =
        "\2\20\11\uffff";
    static final String DFA8_maxS =
        "\2\30\11\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\1\1\2\7\uffff";
    static final String DFA8_specialS =
        "\13\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\3\1\uffff\2\3\2\uffff\1\1\1\3\1\2",
            "\1\3\6\uffff\1\3\1\2",
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
            return "50:12: (branches+= implicitBranch )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA16_eotS =
        "\50\uffff";
    static final String DFA16_eofS =
        "\50\uffff";
    static final String DFA16_minS =
        "\1\20\3\uffff\1\0\1\20\26\uffff\7\0\5\uffff";
    static final String DFA16_maxS =
        "\1\61\3\uffff\1\0\1\61\26\uffff\7\0\5\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\22\uffff\1\2\14\uffff";
    static final String DFA16_specialS =
        "\4\uffff\1\0\27\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\4\1\5\5\uffff\1\1\2\uffff\1\10\15\uffff\1\1\6\uffff\3\1",
            "",
            "",
            "",
            "\1\uffff",
            "\1\37\1\40\2\33\2\uffff\1\33\1\36\1\33\1\uffff\1\33\15\uffff"+
            "\1\42\6\uffff\1\41\1\34\1\35",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "64:1: datatype : ( expression | function | array );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_RichTea()) ) {s = 1;}

                        else if ( (synpred17_RichTea()) ) {s = 27;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_28 = input.LA(1);

                         
                        int index16_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_RichTea()) ) {s = 1;}

                        else if ( (synpred17_RichTea()) ) {s = 27;}

                         
                        input.seek(index16_28);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_29 = input.LA(1);

                         
                        int index16_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_RichTea()) ) {s = 1;}

                        else if ( (synpred17_RichTea()) ) {s = 27;}

                         
                        input.seek(index16_29);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_30 = input.LA(1);

                         
                        int index16_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_RichTea()) ) {s = 1;}

                        else if ( (synpred17_RichTea()) ) {s = 27;}

                         
                        input.seek(index16_30);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_31 = input.LA(1);

                         
                        int index16_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_RichTea()) ) {s = 1;}

                        else if ( (synpred17_RichTea()) ) {s = 27;}

                         
                        input.seek(index16_31);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_32 = input.LA(1);

                         
                        int index16_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_RichTea()) ) {s = 1;}

                        else if ( (synpred17_RichTea()) ) {s = 27;}

                         
                        input.seek(index16_32);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_33 = input.LA(1);

                         
                        int index16_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_RichTea()) ) {s = 1;}

                        else if ( (synpred17_RichTea()) ) {s = 27;}

                         
                        input.seek(index16_33);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_34 = input.LA(1);

                         
                        int index16_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_RichTea()) ) {s = 1;}

                        else if ( (synpred17_RichTea()) ) {s = 27;}

                         
                        input.seek(index16_34);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\12\uffff";
    static final String DFA18_eofS =
        "\12\uffff";
    static final String DFA18_minS =
        "\1\20\11\uffff";
    static final String DFA18_maxS =
        "\1\61\11\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\7\uffff\1\2";
    static final String DFA18_specialS =
        "\12\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\1\5\uffff\1\1\2\uffff\1\1\1\11\14\uffff\1\1\6\uffff\3\1",
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
            return "71:13: ( datatype ( COMMA datatype )* )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA19_eotS =
        "\132\uffff";
    static final String DFA19_eofS =
        "\1\uffff\4\20\125\uffff";
    static final String DFA19_minS =
        "\10\20\7\0\11\uffff\7\0\11\uffff\7\0\11\uffff\10\0\11\uffff\21"+
        "\0";
    static final String DFA19_maxS =
        "\1\61\3\56\1\62\3\61\7\0\11\uffff\7\0\11\uffff\7\0\11\uffff\10"+
        "\0\11\uffff\21\0";
    static final String DFA19_acceptS =
        "\17\uffff\1\1\1\2\111\uffff";
    static final String DFA19_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\11\uffff\1\7\1\10\1\11\1"+
        "\12\1\13\1\14\1\15\11\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\11"+
        "\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\11\uffff\1\35\1\36"+
        "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
        "\1\54\1\55}>";
    static final String[] DFA19_transitionS = {
            "\1\4\1\5\5\uffff\1\3\20\uffff\1\7\6\uffff\1\6\1\1\1\2",
            "\1\20\1\uffff\2\20\2\uffff\3\20\2\uffff\1\20\1\17\1\16\1\15"+
            "\2\14\4\13\4\12\5\11\1\10",
            "\1\20\1\uffff\2\20\2\uffff\3\20\2\uffff\1\20\1\17\1\36\1\35"+
            "\2\34\4\33\4\32\5\31\1\30",
            "\1\20\1\uffff\2\20\2\uffff\3\20\2\uffff\1\20\1\17\1\56\1\55"+
            "\2\54\4\53\4\52\5\51\1\50",
            "\1\20\1\uffff\2\20\2\uffff\3\20\2\uffff\1\20\1\17\1\77\1\76"+
            "\2\75\4\74\4\73\5\72\1\71\3\uffff\1\70",
            "\1\114\1\115\5\uffff\1\113\20\uffff\1\117\6\uffff\1\116\1"+
            "\111\1\112",
            "\1\123\1\124\5\uffff\1\122\30\uffff\1\120\1\121",
            "\1\130\1\131\5\uffff\1\127\30\uffff\1\125\1\126",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "77:1: expression : ( logical_expression ( QUESTION_MARK logical_expression COLON logical_expression ) -> ^( TERNARY_OPERATOR ( logical_expression )+ ) | logical_expression );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_9 = input.LA(1);

                         
                        int index19_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_10 = input.LA(1);

                         
                        int index19_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_11 = input.LA(1);

                         
                        int index19_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_12 = input.LA(1);

                         
                        int index19_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_13 = input.LA(1);

                         
                        int index19_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_14 = input.LA(1);

                         
                        int index19_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_24 = input.LA(1);

                         
                        int index19_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_25 = input.LA(1);

                         
                        int index19_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_26 = input.LA(1);

                         
                        int index19_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_26);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_27 = input.LA(1);

                         
                        int index19_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_27);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA19_28 = input.LA(1);

                         
                        int index19_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_28);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA19_29 = input.LA(1);

                         
                        int index19_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_29);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA19_30 = input.LA(1);

                         
                        int index19_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_30);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA19_40 = input.LA(1);

                         
                        int index19_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_40);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA19_41 = input.LA(1);

                         
                        int index19_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_41);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA19_42 = input.LA(1);

                         
                        int index19_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_42);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA19_43 = input.LA(1);

                         
                        int index19_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_43);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA19_44 = input.LA(1);

                         
                        int index19_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_44);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA19_45 = input.LA(1);

                         
                        int index19_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_45);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA19_46 = input.LA(1);

                         
                        int index19_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_46);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA19_56 = input.LA(1);

                         
                        int index19_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_56);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA19_57 = input.LA(1);

                         
                        int index19_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_57);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA19_58 = input.LA(1);

                         
                        int index19_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_58);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA19_59 = input.LA(1);

                         
                        int index19_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_59);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA19_60 = input.LA(1);

                         
                        int index19_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_60);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA19_61 = input.LA(1);

                         
                        int index19_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_61);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA19_62 = input.LA(1);

                         
                        int index19_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_62);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA19_63 = input.LA(1);

                         
                        int index19_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_63);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA19_73 = input.LA(1);

                         
                        int index19_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_73);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA19_74 = input.LA(1);

                         
                        int index19_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_74);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA19_75 = input.LA(1);

                         
                        int index19_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_75);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA19_76 = input.LA(1);

                         
                        int index19_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_76);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA19_77 = input.LA(1);

                         
                        int index19_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_77);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA19_78 = input.LA(1);

                         
                        int index19_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_78);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA19_79 = input.LA(1);

                         
                        int index19_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_79);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA19_80 = input.LA(1);

                         
                        int index19_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_80);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA19_81 = input.LA(1);

                         
                        int index19_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_81);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA19_82 = input.LA(1);

                         
                        int index19_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_82);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA19_83 = input.LA(1);

                         
                        int index19_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_83);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA19_84 = input.LA(1);

                         
                        int index19_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_84);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA19_85 = input.LA(1);

                         
                        int index19_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_85);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA19_86 = input.LA(1);

                         
                        int index19_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_86);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA19_87 = input.LA(1);

                         
                        int index19_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_87);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA19_88 = input.LA(1);

                         
                        int index19_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_88);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA19_89 = input.LA(1);

                         
                        int index19_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index19_89);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\14\uffff";
    static final String DFA20_eofS =
        "\1\1\13\uffff";
    static final String DFA20_minS =
        "\1\20\13\uffff";
    static final String DFA20_maxS =
        "\1\35\13\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA20_specialS =
        "\14\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\uffff\3\1\1\uffff\3\1\2\uffff\2\1\1\13",
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
            return "()* loopback of 83:23: ( OR boolean_expression )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA21_eotS =
        "\15\uffff";
    static final String DFA21_eofS =
        "\1\1\14\uffff";
    static final String DFA21_minS =
        "\1\20\14\uffff";
    static final String DFA21_maxS =
        "\1\36\14\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\12\uffff\1\1";
    static final String DFA21_specialS =
        "\15\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\1\uffff\3\1\1\uffff\3\1\2\uffff\3\1\1\14",
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
            return "()* loopback of 87:24: ( AND equality_expression )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA22_eotS =
        "\16\uffff";
    static final String DFA22_eofS =
        "\1\1\15\uffff";
    static final String DFA22_minS =
        "\1\20\15\uffff";
    static final String DFA22_maxS =
        "\1\40\15\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA22_specialS =
        "\16\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\uffff\3\1\1\uffff\3\1\2\uffff\4\1\2\15",
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
            return "()* loopback of 91:26: ( ( EQ | NEQ ) relational_expression )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA23_eotS =
        "\17\uffff";
    static final String DFA23_eofS =
        "\1\1\16\uffff";
    static final String DFA23_minS =
        "\1\20\16\uffff";
    static final String DFA23_maxS =
        "\1\44\16\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\14\uffff\1\1";
    static final String DFA23_specialS =
        "\17\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\1\uffff\3\1\1\uffff\3\1\2\uffff\6\1\4\16",
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
            return "()* loopback of 95:24: ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA24_eotS =
        "\20\uffff";
    static final String DFA24_eofS =
        "\1\1\17\uffff";
    static final String DFA24_minS =
        "\1\20\17\uffff";
    static final String DFA24_maxS =
        "\1\50\17\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA24_specialS =
        "\20\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\uffff\3\1\1\uffff\3\1\2\uffff\12\1\4\17",
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
            return "()* loopback of 99:30: ( ( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS ) multiplicative_expression )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA25_eotS =
        "\21\uffff";
    static final String DFA25_eofS =
        "\1\1\20\uffff";
    static final String DFA25_minS =
        "\1\20\20\uffff";
    static final String DFA25_maxS =
        "\1\55\20\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\16\uffff\1\1";
    static final String DFA25_specialS =
        "\21\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\uffff\3\1\1\uffff\3\1\2\uffff\16\1\5\20",
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
            return "()* loopback of 103:21: ( ( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS ) power_expression )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA26_eotS =
        "\22\uffff";
    static final String DFA26_eofS =
        "\1\1\21\uffff";
    static final String DFA26_minS =
        "\1\20\21\uffff";
    static final String DFA26_maxS =
        "\1\56\21\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\17\uffff\1\1";
    static final String DFA26_specialS =
        "\22\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\1\uffff\3\1\1\uffff\3\1\2\uffff\23\1\1\21",
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
            return "()* loopback of 107:21: ( POWER unary_expression )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA30_eotS =
        "\23\uffff";
    static final String DFA30_eofS =
        "\1\1\22\uffff";
    static final String DFA30_minS =
        "\1\20\22\uffff";
    static final String DFA30_maxS =
        "\1\62\22\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\2\20\uffff\1\1";
    static final String DFA30_specialS =
        "\23\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\1\uffff\3\1\1\uffff\3\1\2\uffff\24\1\3\uffff\1\22",
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "()* loopback of 129:8: ( PERIOD ID )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA31_eotS =
        "\17\uffff";
    static final String DFA31_eofS =
        "\17\uffff";
    static final String DFA31_minS =
        "\1\20\13\uffff\1\0\2\uffff";
    static final String DFA31_maxS =
        "\1\61\13\uffff\1\0\2\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\14\uffff\1\2";
    static final String DFA31_specialS =
        "\14\uffff\1\0\2\uffff}>";
    static final String[] DFA31_transitionS = {
            "\2\1\1\14\1\1\2\uffff\3\1\1\uffff\1\1\15\uffff\1\1\6\uffff"+
            "\3\1",
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "23:19: ( function_data )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_RichTea()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index31_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_function_in_program131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function143 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function146 = new BitSet(new long[]{0x0003810005CF0000L});
    public static final BitSet FOLLOW_function_data_in_function148 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function180 = new BitSet(new long[]{0x0003810005CB0000L});
    public static final BitSet FOLLOW_function_data_in_function182 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_list_in_function_data213 = new BitSet(new long[]{0x0000000001C90000L});
    public static final BitSet FOLLOW_branch_list_in_function_data215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitAttribute_in_attribute_list230 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_COMMA_in_attribute_list234 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_attribute_in_attribute_list239 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_ID_in_attribute270 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_COLON_in_attribute273 = new BitSet(new long[]{0x0003810004830000L});
    public static final BitSet FOLLOW_ASSIGN_in_attribute277 = new BitSet(new long[]{0x0003810004830000L});
    public static final BitSet FOLLOW_datatype_in_attribute281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_implicitAttribute310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBranch_in_branch_list343 = new BitSet(new long[]{0x0000000000C90002L});
    public static final BitSet FOLLOW_COMMA_in_branch_list347 = new BitSet(new long[]{0x0000000000C90000L});
    public static final BitSet FOLLOW_branch_in_branch_list352 = new BitSet(new long[]{0x0000000000C90002L});
    public static final BitSet FOLLOW_HASH_in_branch384 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_ID_in_branch390 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_STRING_in_branch396 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_branch399 = new BitSet(new long[]{0x0000000002030000L});
    public static final BitSet FOLLOW_function_in_branch401 = new BitSet(new long[]{0x0000000002030000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_branch404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_implicitBranch435 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_implicitBranch438 = new BitSet(new long[]{0x0000000002030000L});
    public static final BitSet FOLLOW_function_in_implicitBranch440 = new BitSet(new long[]{0x0000000002030000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_implicitBranch443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_datatype473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_datatype478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_datatype484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BOX_in_array495 = new BitSet(new long[]{0x000381000C830000L});
    public static final BitSet FOLLOW_datatype_in_array498 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_COMMA_in_array501 = new BitSet(new long[]{0x0003810004830000L});
    public static final BitSet FOLLOW_datatype_in_array503 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_CLOSE_BOX_in_array510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression538 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_expression541 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_logical_expression_in_expression543 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COLON_in_expression545 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_logical_expression_in_expression547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression574 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_OR_in_logical_expression577 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression580 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression593 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_AND_in_boolean_expression596 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression599 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression613 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_set_in_equality_expression616 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression627 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression641 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_set_in_relational_expression644 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression663 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression677 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_set_in_additive_expression680 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression699 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression713 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression716 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression739 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression753 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_POWER_in_power_expression757 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression760 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expression778 = new BitSet(new long[]{0x0003000000830000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression786 = new BitSet(new long[]{0x0003000000830000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_value_in_primary_expression808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_primary_expression813 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_logical_expression_in_primary_expression816 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_primary_expression818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expression_value830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_expression_value835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expression_value840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_expression_value846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable859 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_variable862 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_variable864 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_function_data_in_synpred1_RichTea148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_synpred2_RichTea146 = new BitSet(new long[]{0x0003810005CF0000L});
    public static final BitSet FOLLOW_function_data_in_synpred2_RichTea148 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_synpred2_RichTea151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitAttribute_in_synpred4_RichTea230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred6_RichTea234 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_attribute_in_synpred6_RichTea239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred16_RichTea473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred17_RichTea478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_synpred20_RichTea538 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred20_RichTea541 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_logical_expression_in_synpred20_RichTea543 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COLON_in_synpred20_RichTea545 = new BitSet(new long[]{0x0003810000830000L});
    public static final BitSet FOLLOW_logical_expression_in_synpred20_RichTea547 = new BitSet(new long[]{0x0000000000000002L});

}