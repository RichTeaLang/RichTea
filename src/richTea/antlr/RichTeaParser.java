// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g 2010-10-24 14:56:20
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:64:1: function : (implicitAttribute= datatype PERIOD root= function_chain -> $root | function_chain -> function_chain );
    public final RichTeaParser.function_return function() throws RecognitionException {
        RichTeaParser.function_return retval = new RichTeaParser.function_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token PERIOD3=null;
        RichTeaParser.datatype_return implicitAttribute = null;

        RichTeaParser.function_chain_return root = null;

        RichTeaParser.function_chain_return function_chain4 = null;


        Tree PERIOD3_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_function_chain=new RewriteRuleSubtreeStream(adaptor,"rule function_chain");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:2: (implicitAttribute= datatype PERIOD root= function_chain -> $root | function_chain -> function_chain )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==OPEN_PAREN||LA1_0==OPEN_BRACE||LA1_0==OPEN_BOX||LA1_0==MINUS||(LA1_0>=NOT && LA1_0<=STRING)) ) {
                alt1=1;
            }
            else if ( (LA1_0==ID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:65:4: implicitAttribute= datatype PERIOD root= function_chain
                    {
                    pushFollow(FOLLOW_datatype_in_function135);
                    implicitAttribute=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_datatype.add(implicitAttribute.getTree());
                    PERIOD3=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_function137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD3);

                    pushFollow(FOLLOW_function_chain_in_function141);
                    root=function_chain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_chain.add(root.getTree());
                    if ( state.backtracking==0 ) {
                       injectImplicitAttribute((Tree) (root!=null?((Tree)root.tree):null), (CommonTree) (implicitAttribute!=null?((Tree)implicitAttribute.tree):null)); 
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
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:67:4: function_chain
                    {
                    pushFollow(FOLLOW_function_chain_in_function156);
                    function_chain4=function_chain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_chain.add(function_chain4.getTree());


                    // AST REWRITE
                    // elements: function_chain
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 68:4: -> function_chain
                    {
                        adaptor.addChild(root_0, stream_function_chain.nextTree());

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

    public static class function_chain_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_chain"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:71:1: function_chain : (implicitAttributes+= chained_function PERIOD )* root= function_end -> $root;
    public final RichTeaParser.function_chain_return function_chain() throws RecognitionException {
        RichTeaParser.function_chain_return retval = new RichTeaParser.function_chain_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token PERIOD5=null;
        List list_implicitAttributes=null;
        RichTeaParser.function_end_return root = null;

        RuleReturnScope implicitAttributes = null;
        Tree PERIOD5_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_chained_function=new RewriteRuleSubtreeStream(adaptor,"rule chained_function");
        RewriteRuleSubtreeStream stream_function_end=new RewriteRuleSubtreeStream(adaptor,"rule function_end");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:2: ( (implicitAttributes+= chained_function PERIOD )* root= function_end -> $root)
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:4: (implicitAttributes+= chained_function PERIOD )* root= function_end
            {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:4: (implicitAttributes+= chained_function PERIOD )*
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
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:5: implicitAttributes+= chained_function PERIOD
            	    {
            	    pushFollow(FOLLOW_chained_function_in_function_chain177);
            	    implicitAttributes=chained_function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_chained_function.add(implicitAttributes.getTree());
            	    if (list_implicitAttributes==null) list_implicitAttributes=new ArrayList();
            	    list_implicitAttributes.add(implicitAttributes.getTree());

            	    PERIOD5=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_function_chain179); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD5);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_function_end_in_function_chain185);
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
            // 73:4: -> $root
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
    // $ANTLR end "function_chain"

    public static class chained_function_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "chained_function"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:76:1: chained_function : ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ) ;
    public final RichTeaParser.chained_function_return chained_function() throws RecognitionException {
        RichTeaParser.chained_function_return retval = new RichTeaParser.chained_function_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID6=null;
        Token OPEN_PAREN7=null;
        Token CLOSE_PAREN9=null;
        RichTeaParser.attribute_list_return attribute_list8 = null;


        Tree ID6_tree=null;
        Tree OPEN_PAREN7_tree=null;
        Tree CLOSE_PAREN9_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_attribute_list=new RewriteRuleSubtreeStream(adaptor,"rule attribute_list");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:77:2: ( ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:77:4: ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )?
            {
            ID6=(Token)match(input,ID,FOLLOW_ID_in_chained_function208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID6);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:77:7: ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==OPEN_PAREN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:77:8: OPEN_PAREN ( attribute_list )? CLOSE_PAREN
                    {
                    OPEN_PAREN7=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_chained_function211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN7);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:77:19: ( attribute_list )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==ID) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: attribute_list
                            {
                            pushFollow(FOLLOW_attribute_list_in_chained_function213);
                            attribute_list8=attribute_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attribute_list.add(attribute_list8.getTree());

                            }
                            break;

                    }

                    CLOSE_PAREN9=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_chained_function216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN9);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, attribute_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 78:4: -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:7: ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:18: ^( NAME ID )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_ID.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:29: ^( ATTRIBUTES ( attribute_list )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES"), root_2);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:78:42: ( attribute_list )?
                if ( stream_attribute_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_attribute_list.nextTree());

                }
                stream_attribute_list.reset();

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:81:1: function_end : ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) ) ;
    public final RichTeaParser.function_end_return function_end() throws RecognitionException {
        RichTeaParser.function_end_return retval = new RichTeaParser.function_end_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID10=null;
        Token OPEN_PAREN11=null;
        Token CLOSE_PAREN13=null;
        Token OPEN_BRACE14=null;
        Token CLOSE_BRACE16=null;
        Token SEMI_COLON17=null;
        RichTeaParser.attribute_list_return attribute_list12 = null;

        RichTeaParser.function_return function15 = null;


        Tree ID10_tree=null;
        Tree OPEN_PAREN11_tree=null;
        Tree CLOSE_PAREN13_tree=null;
        Tree OPEN_BRACE14_tree=null;
        Tree CLOSE_BRACE16_tree=null;
        Tree SEMI_COLON17_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_attribute_list=new RewriteRuleSubtreeStream(adaptor,"rule attribute_list");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:2: ( ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )? -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:4: ID ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )? ( OPEN_BRACE ( function )* CLOSE_BRACE )? ( SEMI_COLON )?
            {
            ID10=(Token)match(input,ID,FOLLOW_ID_in_function_end252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID10);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:7: ( OPEN_PAREN ( attribute_list )? CLOSE_PAREN )?
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:8: OPEN_PAREN ( attribute_list )? CLOSE_PAREN
                    {
                    OPEN_PAREN11=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function_end255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_PAREN.add(OPEN_PAREN11);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:19: ( attribute_list )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ID) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: attribute_list
                            {
                            pushFollow(FOLLOW_attribute_list_in_function_end257);
                            attribute_list12=attribute_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_attribute_list.add(attribute_list12.getTree());

                            }
                            break;

                    }

                    CLOSE_PAREN13=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function_end260); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_PAREN.add(CLOSE_PAREN13);


                    }
                    break;

            }

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:49: ( OPEN_BRACE ( function )* CLOSE_BRACE )?
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:50: OPEN_BRACE ( function )* CLOSE_BRACE
                    {
                    OPEN_BRACE14=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_function_end265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE14);

                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:61: ( function )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=ID && LA7_0<=OPEN_PAREN)||LA7_0==OPEN_BRACE||LA7_0==OPEN_BOX||LA7_0==MINUS||(LA7_0>=NOT && LA7_0<=STRING)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: function
                    	    {
                    	    pushFollow(FOLLOW_function_in_function_end267);
                    	    function15=function();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_function.add(function15.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    CLOSE_BRACE16=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_function_end270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE16);


                    }
                    break;

            }

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:82:85: ( SEMI_COLON )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==SEMI_COLON) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: SEMI_COLON
                    {
                    SEMI_COLON17=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_function_end274); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON17);


                    }
                    break;

            }



            // AST REWRITE
            // elements: function, attribute_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 83:4: -> ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:7: ^( FUNCTION ^( NAME ID ) ^( ATTRIBUTES ( attribute_list )? ) ^( CHILDREN ( function )* ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:18: ^( NAME ID )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_ID.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:29: ^( ATTRIBUTES ( attribute_list )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ATTRIBUTES, "ATTRIBUTES"), root_2);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:42: ( attribute_list )?
                if ( stream_attribute_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_attribute_list.nextTree());

                }
                stream_attribute_list.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:59: ^( CHILDREN ( function )* )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(CHILDREN, "CHILDREN"), root_2);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:83:70: ( function )*
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:86:1: attribute_list : attribute ( ( COMMA )? attribute )* -> ( ^( ATTRIBUTE attribute ) )* ;
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
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:2: ( attribute ( ( COMMA )? attribute )* -> ( ^( ATTRIBUTE attribute ) )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:4: attribute ( ( COMMA )? attribute )*
            {
            pushFollow(FOLLOW_attribute_in_attribute_list316);
            attribute18=attribute();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attribute.add(attribute18.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:14: ( ( COMMA )? attribute )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ID||LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:15: ( COMMA )? attribute
            	    {
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:87:15: ( COMMA )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==COMMA) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:0:0: COMMA
            	            {
            	            COMMA19=(Token)match(input,COMMA,FOLLOW_COMMA_in_attribute_list319); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA19);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_attribute_in_attribute_list322);
            	    attribute20=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_attribute.add(attribute20.getTree());

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
            // 88:4: -> ( ^( ATTRIBUTE attribute ) )*
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:88:7: ( ^( ATTRIBUTE attribute ) )*
                while ( stream_attribute.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:88:7: ^( ATTRIBUTE attribute )
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:91:1: attribute : ID ( COLON | ASSIGN ) attribute_data -> ^( NAME ID ) ^( VALUE attribute_data ) ;
    public final RichTeaParser.attribute_return attribute() throws RecognitionException {
        RichTeaParser.attribute_return retval = new RichTeaParser.attribute_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID21=null;
        Token COLON22=null;
        Token ASSIGN23=null;
        RichTeaParser.attribute_data_return attribute_data24 = null;


        Tree ID21_tree=null;
        Tree COLON22_tree=null;
        Tree ASSIGN23_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_attribute_data=new RewriteRuleSubtreeStream(adaptor,"rule attribute_data");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:92:2: ( ID ( COLON | ASSIGN ) attribute_data -> ^( NAME ID ) ^( VALUE attribute_data ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:92:4: ID ( COLON | ASSIGN ) attribute_data
            {
            ID21=(Token)match(input,ID,FOLLOW_ID_in_attribute349); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID21);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:92:7: ( COLON | ASSIGN )
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:92:8: COLON
                    {
                    COLON22=(Token)match(input,COLON,FOLLOW_COLON_in_attribute352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON22);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:92:16: ASSIGN
                    {
                    ASSIGN23=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attribute356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN23);


                    }
                    break;

            }

            pushFollow(FOLLOW_attribute_data_in_attribute360);
            attribute_data24=attribute_data();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data24.getTree());


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
            // 93:4: -> ^( NAME ID ) ^( VALUE attribute_data )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:93:7: ^( NAME ID )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:93:18: ^( VALUE attribute_data )
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:96:1: attribute_data : ( function | datatype );
    public final RichTeaParser.attribute_data_return attribute_data() throws RecognitionException {
        RichTeaParser.attribute_data_return retval = new RichTeaParser.attribute_data_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.function_return function25 = null;

        RichTeaParser.datatype_return datatype26 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:97:2: ( function | datatype )
            int alt13=2;
            switch ( input.LA(1) ) {
            case OPEN_PAREN:
                {
                int LA13_1 = input.LA(2);

                if ( (synpred13_RichTea()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case NUMBER:
            case BOOLEAN:
            case STRING:
                {
                int LA13_2 = input.LA(2);

                if ( (synpred13_RichTea()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case NOT:
                {
                int LA13_3 = input.LA(2);

                if ( (synpred13_RichTea()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case MINUS:
                {
                int LA13_4 = input.LA(2);

                if ( (synpred13_RichTea()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;
                }
                }
                break;
            case OPEN_BOX:
                {
                int LA13_5 = input.LA(2);

                if ( (synpred13_RichTea()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;
                }
                }
                break;
            case OPEN_BRACE:
                {
                int LA13_6 = input.LA(2);

                if ( (synpred13_RichTea()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 6, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt13=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:97:4: function
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_function_in_attribute_data390);
                    function25=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function25.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:98:4: datatype
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_datatype_in_attribute_data395);
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:102:1: datatype : ( expression | array | lookup );
    public final RichTeaParser.datatype_return datatype() throws RecognitionException {
        RichTeaParser.datatype_return retval = new RichTeaParser.datatype_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.expression_return expression27 = null;

        RichTeaParser.array_return array28 = null;

        RichTeaParser.lookup_return lookup29 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:2: ( expression | array | lookup )
            int alt14=3;
            switch ( input.LA(1) ) {
            case OPEN_PAREN:
            case MINUS:
            case NOT:
            case NUMBER:
            case BOOLEAN:
            case STRING:
                {
                alt14=1;
                }
                break;
            case OPEN_BOX:
                {
                alt14=2;
                }
                break;
            case OPEN_BRACE:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:103:4: expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_datatype408);
                    expression27=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression27.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:104:4: array
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_array_in_datatype413);
                    array28=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array28.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:105:5: lookup
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_lookup_in_datatype419);
                    lookup29=lookup();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lookup29.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:108:1: array : OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX -> ^( ARRAY ( attribute_data )* ) ;
    public final RichTeaParser.array_return array() throws RecognitionException {
        RichTeaParser.array_return retval = new RichTeaParser.array_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_BOX30=null;
        Token COMMA32=null;
        Token CLOSE_BOX34=null;
        RichTeaParser.attribute_data_return attribute_data31 = null;

        RichTeaParser.attribute_data_return attribute_data33 = null;


        Tree OPEN_BOX30_tree=null;
        Tree COMMA32_tree=null;
        Tree CLOSE_BOX34_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BOX=new RewriteRuleTokenStream(adaptor,"token CLOSE_BOX");
        RewriteRuleTokenStream stream_OPEN_BOX=new RewriteRuleTokenStream(adaptor,"token OPEN_BOX");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_attribute_data=new RewriteRuleSubtreeStream(adaptor,"rule attribute_data");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:109:2: ( OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX -> ^( ARRAY ( attribute_data )* ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:109:4: OPEN_BOX ( attribute_data ( COMMA attribute_data )* )? CLOSE_BOX
            {
            OPEN_BOX30=(Token)match(input,OPEN_BOX,FOLLOW_OPEN_BOX_in_array430); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BOX.add(OPEN_BOX30);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:109:13: ( attribute_data ( COMMA attribute_data )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=ID && LA16_0<=OPEN_PAREN)||LA16_0==OPEN_BRACE||LA16_0==OPEN_BOX||LA16_0==MINUS||(LA16_0>=NOT && LA16_0<=STRING)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:109:14: attribute_data ( COMMA attribute_data )*
                    {
                    pushFollow(FOLLOW_attribute_data_in_array433);
                    attribute_data31=attribute_data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data31.getTree());
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:109:29: ( COMMA attribute_data )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:109:30: COMMA attribute_data
                    	    {
                    	    COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_array436); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA32);

                    	    pushFollow(FOLLOW_attribute_data_in_array438);
                    	    attribute_data33=attribute_data();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_attribute_data.add(attribute_data33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            CLOSE_BOX34=(Token)match(input,CLOSE_BOX,FOLLOW_CLOSE_BOX_in_array445); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BOX.add(CLOSE_BOX34);



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
            // 110:4: -> ^( ARRAY ( attribute_data )* )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:110:7: ^( ARRAY ( attribute_data )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ARRAY, "ARRAY"), root_1);

                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:110:15: ( attribute_data )*
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:113:1: lookup : OPEN_BRACE ( ID ( PERIOD ID )* ) CLOSE_BRACE -> ^( LOOKUP ( ^( ID ) )+ ) ;
    public final RichTeaParser.lookup_return lookup() throws RecognitionException {
        RichTeaParser.lookup_return retval = new RichTeaParser.lookup_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_BRACE35=null;
        Token ID36=null;
        Token PERIOD37=null;
        Token ID38=null;
        Token CLOSE_BRACE39=null;

        Tree OPEN_BRACE35_tree=null;
        Tree ID36_tree=null;
        Tree PERIOD37_tree=null;
        Tree ID38_tree=null;
        Tree CLOSE_BRACE39_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:114:2: ( OPEN_BRACE ( ID ( PERIOD ID )* ) CLOSE_BRACE -> ^( LOOKUP ( ^( ID ) )+ ) )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:114:4: OPEN_BRACE ( ID ( PERIOD ID )* ) CLOSE_BRACE
            {
            OPEN_BRACE35=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_lookup469); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_BRACE.add(OPEN_BRACE35);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:114:15: ( ID ( PERIOD ID )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:114:16: ID ( PERIOD ID )*
            {
            ID36=(Token)match(input,ID,FOLLOW_ID_in_lookup472); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID36);

            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:114:19: ( PERIOD ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==PERIOD) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:114:20: PERIOD ID
            	    {
            	    PERIOD37=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_lookup475); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD37);

            	    ID38=(Token)match(input,ID,FOLLOW_ID_in_lookup477); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID38);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            CLOSE_BRACE39=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_lookup483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_BRACE.add(CLOSE_BRACE39);



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
            // 115:4: -> ^( LOOKUP ( ^( ID ) )+ )
            {
                // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:115:7: ^( LOOKUP ( ^( ID ) )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:115:16: ^( ID )
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:120:1: expression : logical_expression ;
    public final RichTeaParser.expression_return expression() throws RecognitionException {
        RichTeaParser.expression_return retval = new RichTeaParser.expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        RichTeaParser.logical_expression_return logical_expression40 = null;



        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:121:2: ( logical_expression )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:121:4: logical_expression
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_logical_expression_in_expression512);
            logical_expression40=logical_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression40.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:124:1: logical_expression : boolean_expression ( OR boolean_expression )* ;
    public final RichTeaParser.logical_expression_return logical_expression() throws RecognitionException {
        RichTeaParser.logical_expression_return retval = new RichTeaParser.logical_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OR42=null;
        RichTeaParser.boolean_expression_return boolean_expression41 = null;

        RichTeaParser.boolean_expression_return boolean_expression43 = null;


        Tree OR42_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:125:2: ( boolean_expression ( OR boolean_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:125:4: boolean_expression ( OR boolean_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_boolean_expression_in_logical_expression524);
            boolean_expression41=boolean_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression41.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:125:23: ( OR boolean_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==OR) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:125:24: OR boolean_expression
            	    {
            	    OR42=(Token)match(input,OR,FOLLOW_OR_in_logical_expression527); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR42_tree = (Tree)adaptor.create(OR42);
            	    root_0 = (Tree)adaptor.becomeRoot(OR42_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_boolean_expression_in_logical_expression530);
            	    boolean_expression43=boolean_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression43.getTree());

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
    // $ANTLR end "logical_expression"

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:128:1: boolean_expression : equality_expression ( AND equality_expression )* ;
    public final RichTeaParser.boolean_expression_return boolean_expression() throws RecognitionException {
        RichTeaParser.boolean_expression_return retval = new RichTeaParser.boolean_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token AND45=null;
        RichTeaParser.equality_expression_return equality_expression44 = null;

        RichTeaParser.equality_expression_return equality_expression46 = null;


        Tree AND45_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:2: ( equality_expression ( AND equality_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:4: equality_expression ( AND equality_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_boolean_expression543);
            equality_expression44=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression44.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:24: ( AND equality_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==AND) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:129:25: AND equality_expression
            	    {
            	    AND45=(Token)match(input,AND,FOLLOW_AND_in_boolean_expression546); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND45_tree = (Tree)adaptor.create(AND45);
            	    root_0 = (Tree)adaptor.becomeRoot(AND45_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expression_in_boolean_expression549);
            	    equality_expression46=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression46.getTree());

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
    // $ANTLR end "boolean_expression"

    public static class equality_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:132:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final RichTeaParser.equality_expression_return equality_expression() throws RecognitionException {
        RichTeaParser.equality_expression_return retval = new RichTeaParser.equality_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set48=null;
        RichTeaParser.relational_expression_return relational_expression47 = null;

        RichTeaParser.relational_expression_return relational_expression49 = null;


        Tree set48_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:133:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:133:4: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression563);
            relational_expression47=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression47.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:133:26: ( ( EQ | NEQ ) relational_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=EQ && LA20_0<=NEQ)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:133:27: ( EQ | NEQ ) relational_expression
            	    {
            	    set48=(Token)input.LT(1);
            	    set48=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set48), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression577);
            	    relational_expression49=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression49.getTree());

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
    // $ANTLR end "equality_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:136:1: relational_expression : additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* ;
    public final RichTeaParser.relational_expression_return relational_expression() throws RecognitionException {
        RichTeaParser.relational_expression_return retval = new RichTeaParser.relational_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set51=null;
        RichTeaParser.additive_expression_return additive_expression50 = null;

        RichTeaParser.additive_expression_return additive_expression52 = null;


        Tree set51_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:137:2: ( additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:137:4: additive_expression ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_relational_expression591);
            additive_expression50=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression50.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:137:24: ( ( LT | LTEQ | GT | GTEQ ) additive_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=LT && LA21_0<=GTEQ)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:137:25: ( LT | LTEQ | GT | GTEQ ) additive_expression
            	    {
            	    set51=(Token)input.LT(1);
            	    set51=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT && input.LA(1)<=GTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set51), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expression_in_relational_expression613);
            	    additive_expression52=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression52.getTree());

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
    // $ANTLR end "relational_expression"

    public static class additive_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:140:1: additive_expression : multiplicative_expression ( ( PLUS | MINUS ) multiplicative_expression )* ;
    public final RichTeaParser.additive_expression_return additive_expression() throws RecognitionException {
        RichTeaParser.additive_expression_return retval = new RichTeaParser.additive_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set54=null;
        RichTeaParser.multiplicative_expression_return multiplicative_expression53 = null;

        RichTeaParser.multiplicative_expression_return multiplicative_expression55 = null;


        Tree set54_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:141:2: ( multiplicative_expression ( ( PLUS | MINUS ) multiplicative_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:141:4: multiplicative_expression ( ( PLUS | MINUS ) multiplicative_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression627);
            multiplicative_expression53=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression53.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:141:30: ( ( PLUS | MINUS ) multiplicative_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=PLUS && LA22_0<=MINUS)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:141:31: ( PLUS | MINUS ) multiplicative_expression
            	    {
            	    set54=(Token)input.LT(1);
            	    set54=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set54), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression641);
            	    multiplicative_expression55=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression55.getTree());

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
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:144:1: multiplicative_expression : power_expression ( ( MULTIPLY | DIVIDE | MODULUS ) power_expression )* ;
    public final RichTeaParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        RichTeaParser.multiplicative_expression_return retval = new RichTeaParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set57=null;
        RichTeaParser.power_expression_return power_expression56 = null;

        RichTeaParser.power_expression_return power_expression58 = null;


        Tree set57_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:145:2: ( power_expression ( ( MULTIPLY | DIVIDE | MODULUS ) power_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:145:4: power_expression ( ( MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_power_expression_in_multiplicative_expression655);
            power_expression56=power_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression56.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:145:21: ( ( MULTIPLY | DIVIDE | MODULUS ) power_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=MULTIPLY && LA23_0<=MODULUS)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:145:22: ( MULTIPLY | DIVIDE | MODULUS ) power_expression
            	    {
            	    set57=(Token)input.LT(1);
            	    set57=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULTIPLY && input.LA(1)<=MODULUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(set57), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_power_expression_in_multiplicative_expression673);
            	    power_expression58=power_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expression58.getTree());

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
    // $ANTLR end "multiplicative_expression"

    public static class power_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "power_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:148:1: power_expression : unary_expression ( POWER unary_expression )* ;
    public final RichTeaParser.power_expression_return power_expression() throws RecognitionException {
        RichTeaParser.power_expression_return retval = new RichTeaParser.power_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token POWER60=null;
        RichTeaParser.unary_expression_return unary_expression59 = null;

        RichTeaParser.unary_expression_return unary_expression61 = null;


        Tree POWER60_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:149:2: ( unary_expression ( POWER unary_expression )* )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:149:4: unary_expression ( POWER unary_expression )*
            {
            root_0 = (Tree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_power_expression687);
            unary_expression59=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression59.getTree());
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:149:21: ( POWER unary_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==POWER) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:149:23: POWER unary_expression
            	    {
            	    POWER60=(Token)match(input,POWER,FOLLOW_POWER_in_power_expression691); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER60_tree = (Tree)adaptor.create(POWER60);
            	    root_0 = (Tree)adaptor.becomeRoot(POWER60_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_power_expression694);
            	    unary_expression61=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression61.getTree());

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
    // $ANTLR end "power_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:152:1: unary_expression : ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) );
    public final RichTeaParser.unary_expression_return unary_expression() throws RecognitionException {
        RichTeaParser.unary_expression_return retval = new RichTeaParser.unary_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token NOT63=null;
        Token MINUS65=null;
        RichTeaParser.primary_expression_return primary_expression62 = null;

        RichTeaParser.primary_expression_return primary_expression64 = null;

        RichTeaParser.primary_expression_return primary_expression66 = null;


        Tree NOT63_tree=null;
        Tree MINUS65_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:153:2: ( primary_expression | NOT primary_expression | MINUS primary_expression -> ^( NEGATE primary_expression ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case OPEN_PAREN:
            case NUMBER:
            case BOOLEAN:
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:153:4: primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_primary_expression_in_unary_expression707);
                    primary_expression62=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression62.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:154:4: NOT primary_expression
                    {
                    root_0 = (Tree)adaptor.nil();

                    NOT63=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression712); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT63_tree = (Tree)adaptor.create(NOT63);
                    root_0 = (Tree)adaptor.becomeRoot(NOT63_tree, root_0);
                    }
                    pushFollow(FOLLOW_primary_expression_in_unary_expression715);
                    primary_expression64=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression64.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:155:4: MINUS primary_expression
                    {
                    MINUS65=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS65);

                    pushFollow(FOLLOW_primary_expression_in_unary_expression722);
                    primary_expression66=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression66.getTree());


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
                    // 155:29: -> ^( NEGATE primary_expression )
                    {
                        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:155:32: ^( NEGATE primary_expression )
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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:158:1: primary_expression : ( OPEN_PAREN logical_expression CLOSE_PAREN | expression_value );
    public final RichTeaParser.primary_expression_return primary_expression() throws RecognitionException {
        RichTeaParser.primary_expression_return retval = new RichTeaParser.primary_expression_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token OPEN_PAREN67=null;
        Token CLOSE_PAREN69=null;
        RichTeaParser.logical_expression_return logical_expression68 = null;

        RichTeaParser.expression_value_return expression_value70 = null;


        Tree OPEN_PAREN67_tree=null;
        Tree CLOSE_PAREN69_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:159:2: ( OPEN_PAREN logical_expression CLOSE_PAREN | expression_value )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==OPEN_PAREN) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=NUMBER && LA26_0<=STRING)) ) {
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
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:159:4: OPEN_PAREN logical_expression CLOSE_PAREN
                    {
                    root_0 = (Tree)adaptor.nil();

                    OPEN_PAREN67=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_primary_expression742); if (state.failed) return retval;
                    pushFollow(FOLLOW_logical_expression_in_primary_expression745);
                    logical_expression68=logical_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_expression68.getTree());
                    CLOSE_PAREN69=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_primary_expression747); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:160:5: expression_value
                    {
                    root_0 = (Tree)adaptor.nil();

                    pushFollow(FOLLOW_expression_value_in_primary_expression754);
                    expression_value70=expression_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_value70.getTree());

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
    // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:163:1: expression_value : ( NUMBER | BOOLEAN | STRING );
    public final RichTeaParser.expression_value_return expression_value() throws RecognitionException {
        RichTeaParser.expression_value_return retval = new RichTeaParser.expression_value_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token set71=null;

        Tree set71_tree=null;

        try {
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:164:2: ( NUMBER | BOOLEAN | STRING )
            // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:
            {
            root_0 = (Tree)adaptor.nil();

            set71=(Token)input.LT(1);
            if ( (input.LA(1)>=NUMBER && input.LA(1)<=STRING) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Tree)adaptor.create(set71));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
        }
        return retval;
    }
    // $ANTLR end "expression_value"

    // $ANTLR start synpred2_RichTea
    public final void synpred2_RichTea_fragment() throws RecognitionException {   
        List list_implicitAttributes=null;
        RuleReturnScope implicitAttributes = null;
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:5: (implicitAttributes+= chained_function PERIOD )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:72:5: implicitAttributes+= chained_function PERIOD
        {
        pushFollow(FOLLOW_chained_function_in_synpred2_RichTea177);
        implicitAttributes=chained_function();

        state._fsp--;
        if (state.failed) return ;
        if (list_implicitAttributes==null) list_implicitAttributes=new ArrayList();
        list_implicitAttributes.add(implicitAttributes);

        match(input,PERIOD,FOLLOW_PERIOD_in_synpred2_RichTea179); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_RichTea

    // $ANTLR start synpred13_RichTea
    public final void synpred13_RichTea_fragment() throws RecognitionException {   
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:97:4: ( function )
        // C:\\Users\\Richard\\Documents\\RichTea\\antlr\\RichTea.g:97:4: function
        {
        pushFollow(FOLLOW_function_in_synpred13_RichTea390);
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


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\10\uffff";
    static final String DFA8_eofS =
        "\1\2\4\uffff\1\3\2\uffff";
    static final String DFA8_minS =
        "\2\17\2\uffff\2\16\1\17\1\16";
    static final String DFA8_maxS =
        "\2\53\2\uffff\2\53\1\17\1\53";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\1\4\uffff";
    static final String DFA8_specialS =
        "\10\uffff}>";
    static final String[] DFA8_transitionS = {
            "\3\2\1\1\3\2\2\uffff\2\2\11\uffff\1\2\4\uffff\4\2",
            "\1\4\1\3\1\uffff\2\3\4\uffff\1\3\12\uffff\1\3\4\uffff\4\3",
            "",
            "",
            "\1\6\2\3\1\uffff\1\3\1\5\1\3\3\uffff\1\3\12\uffff\1\3\4\uffff"+
            "\4\3",
            "\1\2\7\3\2\uffff\2\3\11\uffff\1\3\4\uffff\4\3",
            "\1\7",
            "\1\6\2\3\1\uffff\1\3\1\5\1\3\3\uffff\1\3\12\uffff\1\3\4\uffff"+
            "\4\3"
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
            return "82:49: ( OPEN_BRACE ( function )* CLOSE_BRACE )?";
        }
    }
 

    public static final BitSet FOLLOW_function_in_program118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_function135 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_PERIOD_in_function137 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_function_chain_in_function141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_chain_in_function156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chained_function_in_function_chain177 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_PERIOD_in_function_chain179 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_function_end_in_function_chain185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_chained_function208 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_chained_function211 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_attribute_list_in_chained_function213 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_chained_function216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_end252 = new BitSet(new long[]{0x0000000000150002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function_end255 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_attribute_list_in_function_end257 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function_end260 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_function_end265 = new BitSet(new long[]{0x00000F08010D8000L});
    public static final BitSet FOLLOW_function_in_function_end267 = new BitSet(new long[]{0x00000F08010D8000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_function_end270 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_function_end274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attribute_list316 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_COMMA_in_attribute_list319 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_attribute_in_attribute_list322 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_ID_in_attribute349 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_COLON_in_attribute352 = new BitSet(new long[]{0x00000F0801058000L});
    public static final BitSet FOLLOW_ASSIGN_in_attribute356 = new BitSet(new long[]{0x00000F0801058000L});
    public static final BitSet FOLLOW_attribute_data_in_attribute360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_attribute_data390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_attribute_data395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_datatype408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_datatype413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_datatype419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BOX_in_array430 = new BitSet(new long[]{0x00000F0803058000L});
    public static final BitSet FOLLOW_attribute_data_in_array433 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_COMMA_in_array436 = new BitSet(new long[]{0x00000F0801058000L});
    public static final BitSet FOLLOW_attribute_data_in_array438 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_CLOSE_BOX_in_array445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_lookup469 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_lookup472 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_PERIOD_in_lookup475 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_lookup477 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_lookup483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_in_expression512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression524 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_OR_in_logical_expression527 = new BitSet(new long[]{0x00000F0800010000L});
    public static final BitSet FOLLOW_boolean_expression_in_logical_expression530 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression543 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_AND_in_boolean_expression546 = new BitSet(new long[]{0x00000F0800010000L});
    public static final BitSet FOLLOW_equality_expression_in_boolean_expression549 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression563 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_set_in_equality_expression566 = new BitSet(new long[]{0x00000F0800010000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression577 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression591 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_set_in_relational_expression594 = new BitSet(new long[]{0x00000F0800010000L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression613 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression627 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_additive_expression630 = new BitSet(new long[]{0x00000F0800010000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression641 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression655 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression658 = new BitSet(new long[]{0x00000F0800010000L});
    public static final BitSet FOLLOW_power_expression_in_multiplicative_expression673 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression687 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_POWER_in_power_expression691 = new BitSet(new long[]{0x00000F0800010000L});
    public static final BitSet FOLLOW_unary_expression_in_power_expression694 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expression712 = new BitSet(new long[]{0x00000E0000010000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression720 = new BitSet(new long[]{0x00000E0000010000L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_primary_expression742 = new BitSet(new long[]{0x00000F0800010000L});
    public static final BitSet FOLLOW_logical_expression_in_primary_expression745 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_primary_expression747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_value_in_primary_expression754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expression_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chained_function_in_synpred2_RichTea177 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_PERIOD_in_synpred2_RichTea179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred13_RichTea390 = new BitSet(new long[]{0x0000000000000002L});

}