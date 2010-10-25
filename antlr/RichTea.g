grammar RichTea;

options	{ 	output=AST;
			ASTLabelType=Tree;
			language=Java;
			backtrack=true; }
						
tokens {	FUNCTION; CHILDREN;
			ATTRIBUTE; ATTRIBUTES; NAME; VALUE;
			ARRAY; ARRAY_ELEMENT; LOOKUP; NEGATE;}
			
@header {package richTea.antlr;}
@lexer::header {package richTea.antlr;}
			
@members {
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
}

program
	: function EOF!
	;

function
	:	(implicitAttributes+=datatype PERIOD)? (implicitAttributes+=chained_function PERIOD)* root=function_end { orderFunctionChain((Tree) $root.tree, $implicitAttributes); } 
			->	$root
	;
	
chained_function
	:	ID (OPEN_PAREN attribute_list? CLOSE_PAREN)?
			-> ^(FUNCTION ^(NAME ID) ^(ATTRIBUTES attribute_list?) ^(CHILDREN))
	;
	
function_end
	:	ID (OPEN_PAREN attribute_list? CLOSE_PAREN)? (OPEN_BRACE function* CLOSE_BRACE)? SEMI_COLON?
			-> ^(FUNCTION ^(NAME ID) ^(ATTRIBUTES attribute_list?) ^(CHILDREN function*))
	;
	
attribute_list
	:	attribute (COMMA? attribute)*	
			->	^(ATTRIBUTE attribute)*
	;
	
attribute
	:	ID (COLON | ASSIGN)! attribute_data	
			->	^(NAME ID) ^(VALUE attribute_data)
	;
	
attribute_data
	:	function
	|	datatype
	;
	

datatype
	:	expression
	|	array
	| 	lookup
	;

array
	:	OPEN_BOX (attribute_data (COMMA attribute_data)* )? CLOSE_BOX
			->	^(ARRAY attribute_data*)
	;
	
lookup
	:	OPEN_BRACE (ID (PERIOD ID)* ) CLOSE_BRACE
			-> ^(LOOKUP ^(ID)+)
	;

/*	EXPRESSION EVALUATION	*/
	
expression
	:	logical_expression
	;
	
logical_expression
	:	boolean_expression (OR^ boolean_expression)*
	;

boolean_expression
	:	equality_expression (AND^ equality_expression)*
	;
	
equality_expression
	: relational_expression (( EQ | NEQ )^ relational_expression)*
	;
	
relational_expression
	:	additive_expression (( LT | LTEQ | GT | GTEQ )^ additive_expression)*
	;
	
additive_expression
	:	multiplicative_expression (( PLUS | MINUS )^ multiplicative_expression)*
	;
	
multiplicative_expression
	:	power_expression (( MULTIPLY | DIVIDE | MODULUS )^ power_expression)*
	;
	
power_expression
	:	unary_expression ( POWER^ unary_expression)*
	;

unary_expression
	:	primary_expression
	|	NOT^ primary_expression
	|	MINUS primary_expression -> ^(NEGATE primary_expression)
	;
	
primary_expression
	:	OPEN_PAREN! logical_expression CLOSE_PAREN!
	| 	expression_value
	;

expression_value
	:	NUMBER
	|	BOOLEAN
	|	STRING
	;

/*	TOKENS	*/

NUMBER
 	:	INTEGER | FLOAT
 	;
 	
STRING
    :	'"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

BOOLEAN
 	:	'true' 
 	|	'false'
	;

ID  :	(LETTER | '_') (LETTER | INTEGER | '_')*
    ;

COMMENT
	:	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WHITESPACE
	:	(' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;} 
	;

COMMA	:	','	;
PERIOD	:	'.'	;

PLUS	:	'+'	;
MINUS	:	'-'	;
MULTIPLY:	'*'	;
DIVIDE	:	'/'	;
MODULUS	:	'%'	;
POWER	:	'^'	;

OR	:	'||'	;
AND	:	'&&'	;
GT	:	'>'		;
GTEQ:	'>='	;
LT	:	'<'		;
LTEQ:	'<='	;
EQ	:	'=='	;
NEQ	:	'!='	;
NOT	:	'!'		;

ASSIGN		:	'=' ;
COLON		:	':'	;
SEMI_COLON	: 	';'	;

OPEN_PAREN 	:	'(' ;
CLOSE_PAREN :	')' ;

OPEN_BRACE	:	'{'	;
CLOSE_BRACE	:	'}'	;

OPEN_BOX	:	'['	;
CLOSE_BOX	:	']'	;

/*	FRAGMENTS	*/

fragment
INTEGER
	:	'0'..'9'+
	;
	
fragment
FLOAT
	:	INTEGER+ '.' INTEGER*
	;
	
fragment
LETTER
	:	'a'..'z'
	|	'A'..'Z'
	;
	
fragment
ESC_SEQ 
	:	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
	;