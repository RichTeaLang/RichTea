grammar RichTea;

options {
    output=AST;
    k=2; // Needed to correctly match implicitAttributes in the attribute_list rule
    ASTLabelType=Tree;
    language=Java;
    backtrack=true;
}

tokens {
    FUNCTION; 
    CHILDREN; ATTRIBUTES;
    ATTRIBUTE; NAME; VALUE;
    BRANCHES; BRANCH;
    ARRAY; VARIABLE; STRING;
    PROPERTY_LOOKUP; NATIVE_METHOD_CALL; 
    THIS; LAST_RETURNED_VALUE;
    TERNARY_OPERATOR; NEGATE;
}

@header         { package richTea.compiler; }
@lexer::header  { package richTea.compiler; }
@lexer::members { final int NOT_LEXING_STRING = 0;
                  final int LEXING_STRING = 1;
                  final int ESCAPING_CHARACTER = 2;
                  final int INTERPOLATING_STRING = 3;
                  int stringLexingState = NOT_LEXING_STRING; }


/*    PARSER RULES   */


program
    :    function function+
             // Wrap root-level function lists inside an anon scope function so we have a single entry point to the program
             ->    ^(FUNCTION ^(NAME ID["scope"]) ^(ATTRIBUTES) ^(BRANCHES ^(BRANCH ^(NAME ID["implicitBranch"]) ^(CHILDREN function+))))
    |    function // No need to wrap
    ;

function
    :    ID OPEN_PAREN function_data? CLOSE_PAREN SEMI_COLON?
             ->    ^(FUNCTION ^(NAME ID) function_data?)
    |    OPEN_PAREN function_data? CLOSE_PAREN SEMI_COLON?
             ->    ^(FUNCTION ^(NAME ID["scope"]) function_data?)
    ;

function_data
    :    attribute_list branch_list
    ;

attribute_list
    :    attributes+=implicit_attribute? (COMMA? attributes+=attribute)*
             ->    ^(ATTRIBUTES ^(ATTRIBUTE $attributes)*)
    ;

attribute
    :    ID COLON expression
             ->    ^(NAME ID) ^(VALUE expression)
    ;

implicit_attribute
    :    expression
             ->    ^(NAME ID["implicitAttribute"]) ^(VALUE expression)
    ;

branch_list
    :    branches+=implicitBranch? (COMMA? branches+=branch)*
             ->    ^(BRANCHES ^(BRANCH $branches)*)
    ;

branch
    :    branch_name COLON? OPEN_BRACE function* CLOSE_BRACE
             ->    ^(NAME branch_name) ^(CHILDREN function*)
    ;

branch_name 
    :     HASH!? (ID | string)
    ;

implicitBranch 
    :    HASH? OPEN_BRACE function* CLOSE_BRACE
             ->    ^(NAME ID["implicitBranch"]) ^(CHILDREN function*)
    ;

/*    EXPRESSION EVALUATION    */

expression
    :    logical_expression (QUESTION_MARK logical_expression COLON logical_expression) -> ^(TERNARY_OPERATOR logical_expression+)
    |    variable ASSIGN^ logical_expression
    |    logical_expression
    ;

logical_expression
    :    boolean_expression (OR^ boolean_expression)*
    ;

boolean_expression
    :    equality_expression (AND^ equality_expression)*
    ;

equality_expression
    : relational_expression (( EQ | NEQ )^ relational_expression)*
    ;

relational_expression
    :    additive_expression (( LT | LTEQ | GT | GTEQ )^ additive_expression)*
    ;

additive_expression
    :    multiplicative_expression (( PLUS_EQUALS | MINUS_EQUALS | PLUS | MINUS )^ multiplicative_expression)*
    ;

multiplicative_expression
    :    power_expression (( MULTIPLY_EQUALS | DIVIDE_EQUALS | MULTIPLY | DIVIDE | MODULUS )^ power_expression)*
    ;

power_expression
    :    unary_expression ( POWER^ unary_expression)*
    ;

unary_expression
    :    primary_expression
    |    NOT^ primary_expression
    |    MINUS primary_expression -> ^(NEGATE primary_expression)
    ;

primary_expression
    :    OPEN_PAREN! logical_expression CLOSE_PAREN!
    |    data_type
    ;

data_type 
    :    INTEGER
    |    DOUBLE
    |    BOOLEAN
    |    NULL
    |    string
    |    array
    |    function
    |    node_reference_attribute
    |    variable
    ;

string
    :    STRING_START string_content* STRING_END
             ->    ^(STRING string_content*)
    ;

string_content
    :    STRING_CHARACTERS
    |    STRING_INTERPOLATION_START! expression STRING_INTERPOLATION_END!
    ;

variable
    :    elements+=variable_root (PERIOD elements+=variable_element)*
             ->    ^(VARIABLE $elements+)
    ;

variable_root
    :    REFERENCE? variable_roots
             -> { $REFERENCE != null }? ^(REFERENCE variable_roots)
             ->                         ^(VALUE variable_roots)
    ;

variable_element
    :    REFERENCE? variable_elements
             -> { $REFERENCE != null }? ^(REFERENCE variable_elements)
             ->                         ^(VALUE variable_elements)
    ;

variable_roots
    :    ID { $ID.text.equals("this") }?
             ->    THIS
    |    UNDERSCORE
             ->    LAST_RETURNED_VALUE
    |    property_lookup
    ;

variable_elements
    :    OPEN_BRACE expression CLOSE_BRACE
             ->    ^(PROPERTY_LOOKUP expression)
    |    ID OPEN_PAREN expression_list? CLOSE_PAREN
             ->    ^(NATIVE_METHOD_CALL ^(NAME ID) ^(ATTRIBUTES expression_list?))
    |    property_lookup
    ;

property_lookup
    :    ID
             ->    ^(PROPERTY_LOOKUP STRING_CHARACTERS[$ID.text])
    ;

array
    :    OPEN_BOX expression_list? CLOSE_BOX
             ->    ^(ARRAY expression_list?)
    ;

expression_list
    :    expression (COMMA expression)*
             ->    expression*
    ;

node_reference_attribute
    :    REFERENCE function
             ->    ^(REFERENCE function)
    ;


/*    LEXER RULES   */


STRING_START
    :    { stringLexingState == NOT_LEXING_STRING }? => '"'
         { stringLexingState = LEXING_STRING; }
    ;

STRING_END
    :    { stringLexingState == LEXING_STRING }? => '"'
         { stringLexingState = NOT_LEXING_STRING; }
    ;

STRING_INTERPOLATION_START
    :    { stringLexingState == LEXING_STRING }? => '{'
         { stringLexingState = INTERPOLATING_STRING; }
    ;

STRING_INTERPOLATION_END
    :    { stringLexingState == INTERPOLATING_STRING }? => '}'
         { stringLexingState = LEXING_STRING; }
    ;

ESCAPE_CHARACTER
    :    { stringLexingState == LEXING_STRING }? => '\\'
         { stringLexingState = ESCAPING_CHARACTER; $channel = HIDDEN; }
    ;

STRING_CHARACTERS
@init    { int lastMark = 0; }
    :    { stringLexingState == LEXING_STRING }? =>
         { lastMark = input.mark(); } 
         (~('{'|'"'|'\\') { lastMark = input.mark(); })* ('{'|'"'|'\\')
         { input.rewind(lastMark); } // Avoid consuming the delimiter character so that it is matched in a different rule
    |    { stringLexingState == ESCAPING_CHARACTER }? => . { stringLexingState = LEXING_STRING; }
    ;

INTEGER: '0'..'9'+;
DOUBLE:  INTEGER+ '.' INTEGER*;
BOOLEAN: 'true' | 'false';
NULL:    'null';
ID:      UNDERSCORE? LETTER (LETTER | INTEGER | UNDERSCORE)* ;

COMMENT
    :    '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |    '/*' ( options {greedy=false;} : . )* '*/' { $channel=HIDDEN; }
    ;

WHITESPACE: ('\r' | '\n' | '\r\n' | ' ' | '\t' ) { $channel=HIDDEN; };

COMMA:      ',';
PERIOD:     '.';
HASH:       '#';
REFERENCE:  '@';
UNDERSCORE: '_';

PLUS_EQUALS:     PLUS ASSIGN;
MULTIPLY_EQUALS: MULTIPLY ASSIGN;
MINUS_EQUALS:    MINUS ASSIGN;
DIVIDE_EQUALS:   DIVIDE ASSIGN;

PLUS:     '+';
MINUS:    '-';
MULTIPLY: '*';
DIVIDE:   '/';
MODULUS:  '%';
POWER:    '^';

OR:   '||';
AND:  '&&';
GT:   '>' ;
GTEQ: '>=';
LT:   '<' ;
LTEQ: '<=';
EQ:   '==';
NEQ:  '!=';
NOT:  '!' ;

ASSIGN:        '=';
COLON:         ':';
SEMI_COLON:    ';';
QUESTION_MARK: '?';
OPEN_PAREN:    '(';
CLOSE_PAREN:   ')';
OPEN_BRACE:    '{';
CLOSE_BRACE:   '}';
OPEN_BOX:      '[';
CLOSE_BOX:     ']';

fragment
LETTER
    :    'a'..'z'
    |    'A'..'Z'
    ;
