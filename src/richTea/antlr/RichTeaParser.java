// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g 2010-10-31 01:48:19
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION", "CHILDREN", "ATTRIBUTE", "ATTRIBUTES", "NAME", "VALUE", "ARRAY", "ARRAY_ELEMENT", "LOOKUP", "NEGATE", "PERIOD", "ID", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", "SEMI_COLON", "COMMA", "COLON", "ASSIGN", "OPEN_BOX", "CLOSE_BOX", "OR", "AND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULUS", "POWER", "NOT", "NUMBER", "BOOLEAN", "STRING", "INTEGER", "FLOAT", "ESC_SEQ", "LETTER", "COMMENT", "WHITESPACE"
    };
    public static final int FUNCTION=4;
    public static final int LT=30;
    public static final int ATTRIBUTES=7;
    public static final int CHILDREN=5;
    public static final int LETTER=47;
    public static final int ATTRIBUTE=6;
    public static final int LTEQ=31;
    public static final int FLOAT=45;
    public static final int NOT=40;
    public static final int ID=15;
    public static final int AND=27;
    public static final int EOF=-1;
    public static final int NAME=8;
    public static final int ESC_SEQ=46;
    public static final int BOOLEAN=42;
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
    public static final int ARRAY_ELEMENT=11;
    public static final int GT=32;
    public static final int OPEN_BRACE=18;
    public static final int STRING=43;

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


    	private void orderFunctionChain(Tree root, List nodes) {
    		if(nodes != null) {
    			for(int i = nodes.size() - 1; i >= 0; i--) {
    				Tree implicitAttributeTree = (Tree) nodes.get(i);
    						
    				injectImplicitAttribute(root, implicitAttributeTree);
    				
    				root = implicitAttributeTree;		
    			}
    		}
    	}
    	
    	private void injectImplicitAttribute(Tree root, Tree implicitAttributeTree) {
    		getAttributeList(root).addChild(createImplicitAttribute(implicitAttributeTree));
    	}
    	
    	private Tree getAttributeList(Tree functionNode) {
       		for(int i = 0; i < functionNode.getChildCount(); i++) {
       			Tree subTree = functionNode.getChild(i);
       			
       			if(subTree.getType() == ATTRIBUTES) return subTree;
       		}
       		
       		return null; // Won't ever happen if we have a valid AST.
       	}

    	private Tree createImplicitAttribute(Tree implicitAttribute) {
    		Tree attribute = createSubTree(ATTRIBUTE, "ATTRIBUTE");
    			Tree attributeName = createSubTree(NAME, "NAME");
    			Tree attributeValue = createSubTree(VALUE, "VALUE");
    			
    		attribute.addChild(attributeName);
    			attributeName.addChild(createSubTree(ID, "implicitAttribute"));
    		attribute.addChild(attributeValue);
    			attributeValue.addChild(implicitAttribute);
    				
    		return attribute;
    	}
    	
    	private Tree createSubTree(int tokenType, String tokenText) {
    		return (Tree) adaptor.create(new CommonToken(tokenType, tokenText));
    	} 


    public static class program_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:60:1: program : function EOF ;
    public final RichTeaParser.program_return program() throws RecognitionException {
        RichTeaParser.program_return retval = new RichTeaParser.program_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token EOF2=null;
        RichTeaParser.function_return function1 = null;


        Tree EOF2_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:61:2: ( function EOF )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:61:4: function EOF
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_function_in_program118);
            function1=function();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, function1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program120); if (state.failed) return retval;

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:64:1: function : (implicitAttributes+= datatype PERIOD )? (implicitAttributes+= chained_function PERIOD )* root= function_end -> $root;
    public final RichTeaParser.function_return function() throws RecognitionException {
        RichTeaParser.function_return retval = new RichTeaParser.function_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token PERIOD3=null;
        Token PERIOD4=null;
        List list_implicitAttributes=null;
        RichTeaParser.function_end_return root = null;

        RuleReturnScope implicitAttributes = null;
        Tree PERIOD3_tree=null;
        Tree PERIOD4_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_chained_function=new RewriteRuleSubtreeStream(adaptor,"rule chained_function");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        RewriteRuleSubtreeStream stream_function_end=new RewriteRuleSubtreeStream(adaptor,"rule function_end");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:2: ( (implicitAttributes+= datatype PERIOD )? (implicitAttributes+= chained_function PERIOD )* root= function_end -> $root)
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:4: (implicitAttributes+= datatype PERIOD )? (implicitAttributes+= chained_function PERIOD )* root= function_end
            {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:4: (implicitAttributes+= datatype PERIOD )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==OPEN_PAREN||LA1_0==OPEN_BRACE||LA1_0==MINUS||(LA1_0>=NOT && LA1_0<=STRING)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:5: implicitAttributes+= datatype PERIOD
                    {
                    pushFollow(FOLLOW_datatype_in_function135);
                    implicitAttributes=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_datatype.add(implicitAttributes.getTree());
                    if (list_implicitAttributes==null) list_implicitAttributes=new ArrayList();
                    list_implicitAttributes.add(implicitAttributes.getTree());

                    PERIOD3=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_function137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD3);


                    }
                    break;

            }

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:43: (implicitAttributes+= chained_function PERIOD )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    int LA2_1 = input.LA(2);

                    if ( (synpred2_RichTea()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:44: implicitAttributes+= chained_function PERIOD
            	    {
            	    pushFollow(FOLLOW_chained_function_in_function144);
            	    implicitAttributes=chained_function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_chained_function.add(implicitAttributes.getTree());
            	    if (list_implicitAttributes==null) list_implicitAttributes=new ArrayList();
            	    list_implicitAttributes.add(implicitAttributes.getTree());

            	    PERIOD4=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_function146); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD4);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_function_end_in_function152);
            root=function_end();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_end.add(root.getTree());
            if ( state.backtracking==0 ) {
               orderFunctionChain((Tree) (root!=null?((Tree)root.tree):null), list_implicitAttributes); 
            }


            // AST REWRITE
            // elements: root
            // token labels: 
            // rule labels: retval, root
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_root=new RewriteRuleSubtreeStream(adaptor,"rule root",root!=null?root.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 66:4: -> $root
            {
                adaptor.addChild(root_0, stream_root.nextTree());

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

    public static class chained_function_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "chained_function"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:69:1: chained_function : ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ) ) ;
    public final RichTeaParser.chained_function_return chained_function() throws RecognitionException {
        RichTeaParser.chained_function_return retval = new RichTeaParser.chained_function_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID5=null;
        Token OPEN_PAREN6=null;
        Token CLOSE_PAREN8=null;
        RichTeaParser.attribute_list_return attribute_list7 = null;


        Tree ID5_tree=null;
        Tree OPEN_PAREN6_tree=null;
        Tree CLOSE_PAREN8_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_attribute_list=new RewriteRuleSubtreeStream(adaptor,"rule attribute_list");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:70:2: ( ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ) ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:70:4: ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )?
            {
            ID5=(Token)match(input,ID,FOLLOW_ID_in_chained_function175); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID5);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:70:7: ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==OPEN_PAREN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:70:8: OPEN_PAREN ( attribute_list )? CLOSE_PAREN
                    {
                    OPEN_PAREN6=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_chained_function178); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN6);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:70:19: ( attribute_list )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==ID) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: attribute_list
                            {
                            pushFollow(FOLLOW_attribute_list_in_chained_function180);
                            attribute_list7=attribute_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attribute_list.add(attribute_list7.getTree());

                            }
                            break;

                    }

                    CLOSE_PAREN8=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_chained_function183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN8);


                    }
                    break;

            }



            // AST REWRITE
            // elements: attribute_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 71:4: -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ) )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:7: ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:18: ^( NAME ID )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_ID.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:29: ^( ATTRIBUTES ( attribute_list )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES"), root_2);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:42: ( attribute_list )?
                if ( stream_attribute_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_attribute_list.nextTree());

                }
                stream_attribute_list.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:59: ^( CHILDREN )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(CHILDREN, "CHILDREN"), root_2);

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
    // $ANTLR end "chained_function"

    public static class function_end_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_end"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:74:1: function_end : ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) ) ;
    public final RichTeaParser.function_end_return function_end() throws RecognitionException {
        RichTeaParser.function_end_return retval = new RichTeaParser.function_end_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID9=null;
        Token OPEN_PAREN10=null;
        Token CLOSE_PAREN12=null;
        Token OPEN_BRACE13=null;
        Token CLOSE_BRACE15=null;
        Token SEMI_COLON16=null;
        RichTeaParser.attribute_list_return attribute_list11 = null;

        RichTeaParser.function_return function14 = null;


        Tree ID9_tree=null;
        Tree OPEN_PAREN10_tree=null;
        Tree CLOSE_PAREN12_tree=null;
        Tree OPEN_BRACE13_tree=null;
        Tree CLOSE_BRACE15_tree=null;
        Tree SEMI_COLON16_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_attribute_list=new RewriteRuleSubtreeStream(adaptor,"rule attribute_list");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:2: ( ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:4: ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )?
            {
            ID9=(Token)match(input,ID,FOLLOW_ID_in_function_end223); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID9);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:7: ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==OPEN_PAREN) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ID||LA6_1==CLOSE_PAREN) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:8: OPEN_PAREN ( attribute_list )? CLOSE_PAREN
                    {
                    OPEN_PAREN10=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function_end226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN10);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:19: ( attribute_list )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ID) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: attribute_list
                            {
                            pushFollow(FOLLOW_attribute_list_in_function_end228);
                            attribute_list11=attribute_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attribute_list.add(attribute_list11.getTree());

                            }
                            break;

                    }

                    CLOSE_PAREN12=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function_end231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN12);


                    }
                    break;

            }

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:49: ( OPEN_BRACE ( function )* CLOSE_BRACE )?
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:50: OPEN_BRACE ( function )* CLOSE_BRACE
                    {
                    OPEN_BRACE13=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_function_end236); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE13);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:61: ( function )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=ID && LA7_0<=OPEN_PAREN)||LA7_0==OPEN_BRACE||LA7_0==MINUS||(LA7_0>=NOT && LA7_0<=STRING)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function
                    	    {
                    	    pushFollow(FOLLOW_function_in_function_end238);
                    	    function14=function();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_function.add(function14.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    CLOSE_BRACE15=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_function_end241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE15);


                    }
                    break;

            }

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:85: ( SEMI_COLON )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==SEMI_COLON) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: SEMI_COLON
                    {
                    SEMI_COLON16=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function_end245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON16);


                    }
                    break;

            }



            // AST REWRITE
            // elements: attribute_list, ID, function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 76:4: -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:76:7: ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:76:18: ^( NAME ID )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_ID.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:76:29: ^( ATTRIBUTES ( attribute_list )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES"), root_2);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:76:42: ( attribute_list )?
                if ( stream_attribute_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_attribute_list.nextTree());

                }
                stream_attribute_list.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:76:59: ^( CHILDREN ( function )* )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(CHILDREN, "CHILDREN"), root_2);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:76:70: ( function )*
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
    // $ANTLR end "function_end"

    public static class attribute_list_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute_list"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:79:1: attribute_list : attribute ( ( COMMA )? attribute )* -> ( ^( ATTRIBUTE attribute ) )* ;
    public final RichTeaParser.attribute_list_return attribute_list() throws RecognitionException {
        RichTeaParser.attribute_list_return retval = new RichTeaParser.attribute_list_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token COMMA18=null;
        RichTeaParser.attribute_return attribute17 = null;

        RichTeaParser.attribute_return attribute19 = null;


        Tree COMMA18_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:80:2: ( attribute ( ( COMMA )? attribute )* -> ( ^( ATTRIBUTE attribute ) )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:80:4: attribute ( ( COMMA )? attribute )*
            {
            pushFollow(FOLLOW_attribute_in_attribute_list287);
            attribute17=attribute();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attribute.add(attribute17.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:80:14: ( ( COMMA )? attribute )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ID||LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:80:15: ( COMMA )? attribute
            	    {
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:80:15: ( COMMA )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==COMMA) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
            	            {
            	            COMMA18=(Token)match(input,COMMA,FOLLOW_COMMA_in_attribute_list290); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA18);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_attribute_in_attribute_list293);
            	    attribute19=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_attribute.add(attribute19.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // 81:4: -> ( ^( ATTRIBUTE attribute ) )*
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:81:7: ( ^( ATTRIBUTE attribute ) )*
                while ( stream_attribute.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:81:7: ^( ATTRIBUTE attribute )
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:84:1: attribute : ID ( COLON | ASSIGN ) attribute_data -> ^( NAME ID ) ^( VALUE attribute_data ) ;
    public final RichTeaParser.attribute_return attribute() throws RecognitionException {
        RichTeaParser.attribute_return retval = new RichTeaParser.attribute_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID20=null;
        Token COLON21=null;
        Token ASSIGN22=null;
        RichTeaParser.attribute_data_return attribute_data23 = null;


        Tree ID20_tree=null;
        Tree COLON21_tree=null;
        Tree ASSIGN22_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_attribute_data=new RewriteRuleSubtreeStream(adaptor,"rule attribute_data");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:85:2: ( ID ( COLON | ASSIGN ) attribute_data -> ^( NAME ID ) ^( VALUE attribute_data ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:85:4: ID ( COLON | ASSIGN ) attribute_data
            {
            ID20=(Token)match(input,ID,FOLLOW_ID_in_attribute320); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID20);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:85:7: ( COLON | ASSIGN )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==COLON) ) {
                alt12=1;
            }
            else if ( (LA12_0==ASSIGN) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:85:8: COLON
                    {
                    COLON21=(Token)match(input,COLON,FOLLOW_COLON_in_attribute323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON21);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:85:16: ASSIGN
                    {
                    ASSIGN22=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attribute327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN22);


                    }
                    break;

            }

            pushFollow(FOLLOW_attribute_data_in_attribute331);
            attribute_data23=attribute_data();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data23.getTree());


            // AST REWRITE
            // elements: ID, attribute_data
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 86:4: -> ^( NAME ID ) ^( VALUE attribute_data )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:86:7: ^( NAME ID )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:86:18: ^( VALUE attribute_data )
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:89:1: attribute_data : ( function | array | datatype );
    public final RichTeaParser.attribute_data_return attribute_data() throws RecognitionException {
        RichTeaParser.attribute_data_return retval = new RichTeaParser.attribute_data_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.function_return function24 = null;

        RichTeaParser.array_return array25 = null;

        RichTeaParser.datatype_return datatype26 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:90:2: ( function | array | datatype )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:90:4: function
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_function_in_attribute_data361);
                    function24=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function24.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:4: array
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_array_in_attribute_data366);
                    array25=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array25.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:92:4: datatype
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_datatype_in_attribute_data371);
                    datatype26=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype26.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:96:1: datatype : expression ;
    public final RichTeaParser.datatype_return datatype() throws RecognitionException {
        RichTeaParser.datatype_return retval = new RichTeaParser.datatype_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.expression_return expression27 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:97:2: ( expression )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:97:4: expression
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_datatype384);
            expression27=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression27.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:101:1: array : OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX -> ^( ARRAY ( attribute_data )* ) ;
    public final RichTeaParser.array_return array() throws RecognitionException {
        RichTeaParser.array_return retval = new RichTeaParser.array_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_BOX28=null;
        Token COMMA30=null;
        Token CLOSE_BOX32=null;
        RichTeaParser.attribute_data_return attribute_data29 = null;

        RichTeaParser.attribute_data_return attribute_data31 = null;


        Tree OPEN_BOX28_tree=null;
        Tree COMMA30_tree=null;
        Tree CLOSE_BOX32_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BOX=new RewriteRuleTokenStream(adaptor,"token CLOSE_BOX");
        RewriteRuleTokenStream stream_OPEN_BOX=new RewriteRuleTokenStream(adaptor,"token OPEN_BOX");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_attribute_data=new RewriteRuleSubtreeStream(adaptor,"rule attribute_data");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:2: ( OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX -> ^( ARRAY ( attribute_data )* ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:4: OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX
            {
            OPEN_BOX28=(Token)match(input,OPEN_BOX,FOLLOW_OPEN_BOX_in_array396); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BOX.add(OPEN_BOX28);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:13: ( attribute_data ( COMMA attribute_data )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=ID && LA15_0<=OPEN_PAREN)||LA15_0==OPEN_BRACE||LA15_0==OPEN_BOX||LA15_0==MINUS||(LA15_0>=NOT && LA15_0<=STRING)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:14: attribute_data ( COMMA attribute_data )*
                    {
                    pushFollow(FOLLOW_attribute_data_in_array399);
                    attribute_data29=attribute_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data29.getTree());
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:29: ( COMMA attribute_data )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:30: COMMA attribute_data
                    	    {
                    	    COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_array402); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA30);

                    	    pushFollow(FOLLOW_attribute_data_in_array404);
                    	    attribute_data31=attribute_data();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            CLOSE_BOX32=(Token)match(input,CLOSE_BOX,FOLLOW_CLOSE_BOX_in_array411); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BOX.add(CLOSE_BOX32);



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
            // 103:4: -> ^( ARRAY ( attribute_data )* )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:7: ^( ARRAY ( attribute_data )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ARRAY, "ARRAY"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:15: ( attribute_data )*
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:106:1: lookup : OPEN_BRACE ( ID ( PERIOD ID )* ) CLOSE_BRACE -> ^( LOOKUP ( ^( ID ) )+ ) ;
    public final RichTeaParser.lookup_return lookup() throws RecognitionException {
        RichTeaParser.lookup_return retval = new RichTeaParser.lookup_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_BRACE33=null;
        Token ID34=null;
        Token PERIOD35=null;
        Token ID36=null;
        Token CLOSE_BRACE37=null;

        Tree OPEN_BRACE33_tree=null;
        Tree ID34_tree=null;
        Tree PERIOD35_tree=null;
        Tree ID36_tree=null;
        Tree CLOSE_BRACE37_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:2: ( OPEN_BRACE ( ID ( PERIOD ID )* ) CLOSE_BRACE -> ^( LOOKUP ( ^( ID ) )+ ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:4: OPEN_BRACE ( ID ( PERIOD ID )* ) CLOSE_BRACE
            {
            OPEN_BRACE33=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_lookup435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE33);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:15: ( ID ( PERIOD ID )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:16: ID ( PERIOD ID )*
            {
            ID34=(Token)match(input,ID,FOLLOW_ID_in_lookup438); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID34);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:19: ( PERIOD ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==PERIOD) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:107:20: PERIOD ID
            	    {
            	    PERIOD35=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_lookup441); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD35);

            	    ID36=(Token)match(input,ID,FOLLOW_ID_in_lookup443); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID36);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            CLOSE_BRACE37=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_lookup449); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE37);



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
            // 108:4: -> ^( LOOKUP ( ^( ID ) )+ )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:108:7: ^( LOOKUP ( ^( ID ) )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:108:16: ^( ID )
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:113:1: expression : logical_expression ;
    public final RichTeaParser.expression_return expression() throws RecognitionException {
        RichTeaParser.expression_return retval = new RichTeaParser.expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.logical_expression_return logical_expression38 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:114:2: ( logical_expression )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:114:4: logical_expression
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_logical_expression_in_expression478);
            logical_expression38=logical_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression38.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:117:1: logical_expression : boolean_expression ( OR boolean_expression )* ;
    public final RichTeaParser.logical_expression_return logical_expression() throws RecognitionException {
        RichTeaParser.logical_expression_return retval = new RichTeaParser.logical_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OR40=null;
        RichTeaParser.boolean_expression_return boolean_expression39 = null;

        RichTeaParser.boolean_expression_return boolean_expression41 = null;


        Tree OR40_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:118:2: ( boolean_expression ( OR boolean_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:118:4: boolean_expression ( OR boolean_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_boolean_expression_in_logical_expression490);
            boolean_expression39=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression39.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:118:23: ( OR boolean_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==OR) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:118:24: OR boolean_expression
            	    {
            	    OR40=(Token)match(input,OR,FOLLOW_OR_in_logical_expression493); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR40_tree = (Tree)adaptor.create(OR40);
            	    root_0 = (Tree)adaptor.becomeRoot(OR40_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_boolean_expression_in_logical_expression496);
            	    boolean_expression41=boolean_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression41.getTree());

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
    // $ANTLR end "logical_expression"

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:121:1: boolean_expression : equality_expression ( AND equality_expression )* ;
    public final RichTeaParser.boolean_expression_return boolean_expression() throws RecognitionException {
        RichTeaParser.boolean_expression_return retval = new RichTeaParser.boolean_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token AND43=null;
        RichTeaParser.equality_expression_return equality_expression42 = null;

        RichTeaParser.equality_expression_return equality_expression44 = null;


        Tree AND43_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:122:2: ( equality_expression ( AND equality_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:122:4: equality_expression ( AND equality_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_boolean_expression509);
            equality_expression42=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression42.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:122:24: ( AND equality_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==AND) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:122:25: AND equality_expression
            	    {
            	    AND43=(Token)match(input,AND,FOLLOW_AND_in_boolean_expression512); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND43_tree = (Tree)adaptor.create(AND43);
            	    root_0 = (Tree)adaptor.becomeRoot(AND43_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expression_in_boolean_expression515);
            	    equality_expression44=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression44.getTree());

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
    // $ANTLR end "boolean_expression"

    public static class equality_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:125:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final RichTeaParser.equality_expression_return equality_expression() throws RecognitionException {
        RichTeaParser.equality_expression_return retval = new RichTeaParser.equality_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set46=null;
        RichTeaParser.relational_expression_return relational_expression45 = null;

        RichTeaParser.relational_expression_return relational_expression47 = null;


        Tree set46_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:126:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:126:4: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression529);
            relational_expression45=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression45.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:126:26: ( ( EQ | NEQ ) relational_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=EQ && LA19_0<=NEQ)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:126:27: ( EQ | NEQ ) relational_expression
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

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression543);
            	    relational_expression47=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression47.getTree());

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
    // $ANTLR end "equality_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:1: relational_expression : additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* ;
    public final RichTeaParser.relational_expression_return relational_expression() throws RecognitionException {
        RichTeaParser.relational_expression_return retval = new RichTeaParser.relational_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set49=null;
        RichTeaParser.additive_expression_return additive_expression48 = null;

        RichTeaParser.additive_expression_return additive_expression50 = null;


        Tree set49_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:130:2: ( additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:130:4: additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_relational_expression557);
            additive_expression48=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression48.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:130:24: ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=LT && LA20_0<=GTEQ)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:130:25: ( LT | LTEQ | GT | GTEQ ) additive_expression
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

            	    pushFollow(FOLLOW_additive_expression_in_relational_expression579);
            	    additive_expression50=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression50.getTree());

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
    // $ANTLR end "relational_expression"

    public static class additive_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:133:1: additive_expression : multiplicative_expression ( ( PLUS | MINUS ) multiplicative_expression )* ;
    public final RichTeaParser.additive_expression_return additive_expression() throws RecognitionException {
        RichTeaParser.additive_expression_return retval = new RichTeaParser.additive_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set52=null;
        RichTeaParser.multiplicative_expression_return multiplicative_expression51 = null;

        RichTeaParser.multiplicative_expression_return multiplicative_expression53 = null;


        Tree set52_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:134:2: ( multiplicative_expression ( ( PLUS | MINUS ) multiplicative_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:134:4: multiplicative_expression ( ( PLUS | MINUS ) multiplicative_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression593);
            multiplicative_expression51=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression51.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:134:30: ( ( PLUS | MINUS ) multiplicative_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=PLUS && LA21_0<=MINUS)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:134:31: ( PLUS | MINUS ) multiplicative_expression
            	    {
            	    set52=(Token)input.LT(1);
            	    set52=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set52), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression607);
            	    multiplicative_expression53=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression53.getTree());

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
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:137:1: multiplicative_expression : power_expression ( ( MULTIPLY | DIVIDE | MODULUS ) power_expression )* ;
    public final RichTeaParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        RichTeaParser.multiplicative_expression_return retval = new RichTeaParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set55=null;
        RichTeaParser.power_expression_return power_expression54 = null;

        RichTeaParser.power_expression_return power_expression56 = null;


        Tree set55_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:138:2: ( power_expression ( ( MULTIPLY | DIVIDE | MODULUS ) power_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:138:4: power_expression ( ( MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_power_expression_in_multiplicative_expression621);
            power_expression54=power_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression54.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:138:21: ( ( MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=MULTIPLY && LA22_0<=MODULUS)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:138:22: ( MULTIPLY | DIVIDE | MODULUS ) power_expression
            	    {
            	    set55=(Token)input.LT(1);
            	    set55=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULTIPLY && input.LA(1)<=MODULUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set55), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_power_expression_in_multiplicative_expression639);
            	    power_expression56=power_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression56.getTree());

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
    // $ANTLR end "multiplicative_expression"

    public static class power_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "power_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:141:1: power_expression : unary_expression ( POWER unary_expression )* ;
    public final RichTeaParser.power_expression_return power_expression() throws RecognitionException {
        RichTeaParser.power_expression_return retval = new RichTeaParser.power_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token POWER58=null;
        RichTeaParser.unary_expression_return unary_expression57 = null;

        RichTeaParser.unary_expression_return unary_expression59 = null;


        Tree POWER58_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:142:2: ( unary_expression ( POWER unary_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:142:4: unary_expression ( POWER unary_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_power_expression653);
            unary_expression57=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression57.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:142:21: ( POWER unary_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==POWER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:142:23: POWER unary_expression
            	    {
            	    POWER58=(Token)match(input,POWER,FOLLOW_POWER_in_power_expression657); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER58_tree = (Tree)adaptor.create(POWER58);
            	    root_0 = (Tree)adaptor.becomeRoot(POWER58_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_power_expression660);
            	    unary_expression59=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression59.getTree());

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
    // $ANTLR end "power_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:145:1: unary_expression : ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) );
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
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:146:2: ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case OPEN_PAREN:
            case OPEN_BRACE:
            case NUMBER:
            case BOOLEAN:
            case STRING:
                {
                alt24=1;
                }
                break;
            case NOT:
                {
                alt24=2;
                }
                break;
            case MINUS:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:146:4: primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_primary_expression_in_unary_expression673);
                    primary_expression60=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression60.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:147:4: NOT primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    NOT61=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression678); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT61_tree = (Tree)adaptor.create(NOT61);
                    root_0 = (Tree)adaptor.becomeRoot(NOT61_tree, root_0);
                    }
                    pushFollow(FOLLOW_primary_expression_in_unary_expression681);
                    primary_expression62=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression62.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:148:4: MINUS primary_expression
                    {
                    MINUS63=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression686); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS63);

                    pushFollow(FOLLOW_primary_expression_in_unary_expression688);
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
                    // 148:29: -> ^( NEGATE primary_expression )
                    {
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:148:32: ^( NEGATE primary_expression )
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:151:1: primary_expression : ( OPEN_PAREN logical_expression CLOSE_PAREN | expression_value );
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
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:152:2: ( OPEN_PAREN logical_expression CLOSE_PAREN | expression_value )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==OPEN_PAREN) ) {
                alt25=1;
            }
            else if ( (LA25_0==OPEN_BRACE||(LA25_0>=NUMBER && LA25_0<=STRING)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:152:4: OPEN_PAREN logical_expression CLOSE_PAREN
                    {
                    root_0 = (Tree)adaptor.nil();

                    OPEN_PAREN65=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_primary_expression708); if (state.failed) return retval;
                    pushFollow(FOLLOW_logical_expression_in_primary_expression711);
                    logical_expression66=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression66.getTree());
                    CLOSE_PAREN67=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_primary_expression713); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:153:5: expression_value
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expression_value_in_primary_expression720);
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:156:1: expression_value : ( NUMBER | BOOLEAN | STRING | lookup );
    public final RichTeaParser.expression_value_return expression_value() throws RecognitionException {
        RichTeaParser.expression_value_return retval = new RichTeaParser.expression_value_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token NUMBER69=null;
        Token BOOLEAN70=null;
        Token STRING71=null;
        RichTeaParser.lookup_return lookup72 = null;


        Tree NUMBER69_tree=null;
        Tree BOOLEAN70_tree=null;
        Tree STRING71_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:157:2: ( NUMBER | BOOLEAN | STRING | lookup )
            int alt26=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt26=1;
                }
                break;
            case BOOLEAN:
                {
                alt26=2;
                }
                break;
            case STRING:
                {
                alt26=3;
                }
                break;
            case OPEN_BRACE:
                {
                alt26=4;
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:157:4: NUMBER
                    {
                    root_0 = (Tree)adaptor.nil();

                    NUMBER69=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expression_value731); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER69_tree = (Tree)adaptor.create(NUMBER69);
                    adaptor.addChild(root_0, NUMBER69_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:158:4: BOOLEAN
                    {
                    root_0 = (Tree)adaptor.nil();

                    BOOLEAN70=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expression_value736); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN70_tree = (Tree)adaptor.create(BOOLEAN70);
                    adaptor.addChild(root_0, BOOLEAN70_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:159:4: STRING
                    {
                    root_0 = (Tree)adaptor.nil();

                    STRING71=(Token)match(input,STRING,FOLLOW_STRING_in_expression_value741); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING71_tree = (Tree)adaptor.create(STRING71);
                    adaptor.addChild(root_0, STRING71_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:160:5: lookup
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_lookup_in_expression_value747);
                    lookup72=lookup();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lookup72.getTree());

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

    // $ANTLR start synpred2_RichTea
    public final void synpred2_RichTea_fragment() throws RecognitionException {   
        List list_implicitAttributes=null;
        RuleReturnScope implicitAttributes = null;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:44: (implicitAttributes+= chained_function PERIOD )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:44: implicitAttributes+= chained_function PERIOD
        {
        pushFollow(FOLLOW_chained_function_in_synpred2_RichTea144);
        implicitAttributes=chained_function();

        state._fsp--;
        if (state.failed) return ;
        if (list_implicitAttributes==null) list_implicitAttributes=new ArrayList();
        list_implicitAttributes.add(implicitAttributes);

        match(input,PERIOD,FOLLOW_PERIOD_in_synpred2_RichTea146); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_RichTea

    // $ANTLR start synpred8_RichTea
    public final void synpred8_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:50: ( OPEN_BRACE ( function )* CLOSE_BRACE )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:50: OPEN_BRACE ( function )* CLOSE_BRACE
        {
        match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_synpred8_RichTea236); if (state.failed) return ;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:75:61: ( function )*
        loop29:
        do {
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=ID && LA29_0<=OPEN_PAREN)||LA29_0==OPEN_BRACE||LA29_0==MINUS||(LA29_0>=NOT && LA29_0<=STRING)) ) {
                alt29=1;
            }


            switch (alt29) {
        	case 1 :
        	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function
        	    {
        	    pushFollow(FOLLOW_function_in_synpred8_RichTea238);
        	    function();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop29;
            }
        } while (true);

        match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_synpred8_RichTea241); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_RichTea

    // $ANTLR start synpred13_RichTea
    public final void synpred13_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:90:4: ( function )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:90:4: function
        {
        pushFollow(FOLLOW_function_in_synpred13_RichTea361);
        function();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_RichTea

    // Delegated rules

    public final boolean synpred13_RichTea() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_RichTea_fragment(); // can never throw exception
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA8_eotS =
        "\20\uffff";
    static final String DFA8_eofS =
        "\1\2\17\uffff";
    static final String DFA8_minS =
        "\1\17\1\0\16\uffff";
    static final String DFA8_maxS =
        "\1\53\1\0\16\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA8_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA8_transitionS = {
            "\3\2\1\1\3\2\3\uffff\1\2\11\uffff\1\2\4\uffff\4\2",
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
            return "75:49: ( OPEN_BRACE ( function )* CLOSE_BRACE )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_RichTea()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index8_1);
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
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\13\uffff";
    static final String DFA13_minS =
        "\1\17\7\0\3\uffff";
    static final String DFA13_maxS =
        "\1\53\7\0\3\uffff";
    static final String DFA13_acceptS =
        "\10\uffff\1\1\1\2\1\3";
    static final String DFA13_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\10\1\1\1\uffff\1\5\5\uffff\1\11\12\uffff\1\7\4\uffff\1\6"+
            "\1\2\1\3\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "89:1: attribute_data : ( function | array | datatype );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_RichTea()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_function_in_program118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_function135 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_PERIOD_in_function137 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_chained_function_in_function144 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_PERIOD_in_function146 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_function_end_in_function152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_chained_function175 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_chained_function178 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_attribute_list_in_chained_function180 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_chained_function183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_end223 = new BitSet(new long[]{0x0000000000150002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function_end226 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_attribute_list_in_function_end228 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function_end231 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_function_end236 = new BitSet(new long[]{0x00000F08000D8000L});
    public static final BitSet FOLLOW_function_in_function_end238 = new BitSet(new long[]{0x00000F08000D8000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_function_end241 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function_end245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attribute_list287 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_COMMA_in_attribute_list290 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_attribute_in_attribute_list293 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_ID_in_attribute320 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_COLON_in_attribute323 = new BitSet(new long[]{0x00000F0801058000L});
    public static final BitSet FOLLOW_ASSIGN_in_attribute327 = new BitSet(new long[]{0x00000F0801058000L});
    public static final BitSet FOLLOW_attribute_data_in_attribute331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_attribute_data361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_attribute_data366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_attribute_data371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_datatype384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BOX_in_array396 = new BitSet(new long[]{0x00000F0803058000L});
    public static final BitSet FOLLOW_attribute_data_in_array399 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_COMMA_in_array402 = new BitSet(new long[]{0x00000F0801058000L});
    public static final BitSet FOLLOW_attribute_data_in_array404 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_CLOSE_BOX_in_array411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_lookup435 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_lookup438 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_PERIOD_in_lookup441 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_lookup443 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_lookup449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression490 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_OR_in_logical_expression493 = new BitSet(new long[]{0x00000F0800050000L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression496 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression509 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_AND_in_boolean_expression512 = new BitSet(new long[]{0x00000F0800050000L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression515 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression529 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_set_in_equality_expression532 = new BitSet(new long[]{0x00000F0800050000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression543 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression557 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_set_in_relational_expression560 = new BitSet(new long[]{0x00000F0800050000L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression579 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression593 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_additive_expression596 = new BitSet(new long[]{0x00000F0800050000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression607 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression621 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression624 = new BitSet(new long[]{0x00000F0800050000L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression639 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression653 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_POWER_in_power_expression657 = new BitSet(new long[]{0x00000F0800050000L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression660 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expression678 = new BitSet(new long[]{0x00000E0000050000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression686 = new BitSet(new long[]{0x00000E0000050000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_primary_expression708 = new BitSet(new long[]{0x00000F0800050000L});
    public static final BitSet FOLLOW_logical_expression_in_primary_expression711 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_primary_expression713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_value_in_primary_expression720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expression_value731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_expression_value736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expression_value741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_expression_value747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chained_function_in_synpred2_RichTea144 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_PERIOD_in_synpred2_RichTea146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_synpred8_RichTea236 = new BitSet(new long[]{0x00000F08000D8000L});
    public static final BitSet FOLLOW_function_in_synpred8_RichTea238 = new BitSet(new long[]{0x00000F08000D8000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_synpred8_RichTea241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred13_RichTea361 = new BitSet(new long[]{0x0000000000000002L});

}