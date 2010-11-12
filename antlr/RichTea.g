grammar RichTea;

options	{ 	output=AST;
			ASTLabelType=Tree;
			language=Java;
			backtrack=true; }
						
tokens {	FUNCTION; CHILDREN; ATTRIBUTES;
			ATTRIBUTE; NAME; VALUE;
			ARRAY; VARIABLE; TERNARY_OPERATOR; NEGATE;	}
			
@header {package richTea.antlr;}
@lexer::header {package richTea.antlr;}

program
	: function
	;
	
function
	:	ID (OPEN_PAREN datatype? COMMA? attribute_list? CLOSE_PAREN)? (OPEN_BRACE function* CLOSE_BRACE)? SEMI_COLON?
			-> ^(FUNCTION ^(NAME ID) ^(ATTRIBUTES ^(ATTRIBUTE ^(NAME ID["implicitAttribute"]) ^(VALUE datatype))? attribute_list?) ^(CHILDREN function*))
			
	|	(OPEN_PAREN attribute_list? CLOSE_PAREN)? OPEN_BRACE function* CLOSE_BRACE
			->	^(FUNCTION ^(NAME ID["scope"]) ^(ATTRIBUTES attribute_list?) ^(CHILDREN function*))
	;
	
attribute_list
	:	attribute (COMMA? attribute)*	
			->	^(ATTRIBUTE attribute)*
	;
	
attribute
	:	ID (COLON | ASSIGN)! datatype	
			->	^(NAME ID) ^(VALUE datatype)
	;	

datatype
	:	expression
	|	function
	| 	array
	;

array
	:	OPEN_BOX (datatype (COMMA datatype)* )? CLOSE_BOX
			->	^(ARRAY datatype*)
	;
	
/*	EXPRESSION EVALUATION	*/
	
expression
	:	logical_expression (QUESTION_MARK logical_expression COLON logical_expression) -> ^(TERNARY_OPERATOR logical_expression+)
	|	logical_expression
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
	:	multiplicative_expression (( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS )^ multiplicative_expression)*
	;
	
multiplicative_expression
	:	power_expression (( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS )^ power_expression)*
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
	| 	variable
	;
	
variable
	:	(ID (PERIOD ID)* ) 
			-> ^(VARIABLE ^(ID)+)
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
	:	('\r' | '\n' | '\r\n' | ' ' | '\t' ) {$channel=HIDDEN;} 
	;

COMMA	:	','	;
PERIOD	:	'.'	;

PLUS_EQUALS		:	PLUS ASSIGN;
MULTIPLY_EQUALS	:	MULTIPLY ASSIGN;
MINUS_EQUALS	:	MINUS ASSIGN;
DIVIDE_EQUALS	:	DIVIDE ASSIGN;

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
QUESTION_MARK	:	'?';

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