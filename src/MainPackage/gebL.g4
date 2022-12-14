grammar gebL;
// SOMETHING LIKE THIS?
// file : list EOF ;
// list : (struct | function | class)* ;
// block : struct* ;

list
    : struct* EOF
    ;
struct
    : varHandler
    | decisionalStatements
    | loopStatements
    | print
    ;
varHandler
    : ID ASSIGN operation SCOL                                          # Assignvar
    | ID op=(MULTEQ | DIVEQ | MODEQ | ADDEQ | SUBEQ) operation SCOL     # Operassign
    ;

decisionalStatements
    : IF logicalExpression curlyBlock (ELSEIF logicalExpression curlyBlock)* (ELSE curlyBlock)?      # IfStatement
    | SWITCH LPAR ID RPAR LCURL (CASE LPAR operation RPAR curlyBlock)+ (DEFAULT curlyBlock)? RCURL   # SwitchStatement
    | logicalExpression QMARK (operation | varHandler) COL (operation | varHandler)        # TernaryStatement
    ;

curlyBlock
    : LCURL struct* RCURL
    ;

loopStatements
    : WHILE logicalExpression curlyBlock           # WhileLoop
    | DO curlyBlock WHILE logicalExpression        # DoWhileLoop
//    | FOR LPAR varHandler SCOL comparisonExpression SCOL varHandler RPAR decisionalAndLoopBlock   # ForLoop
//    | FOREACH LPAR types ID COL /*array or whatever*/ RPAR decisionalAndLoopBlock   # ForeachLoop
    ;

print
    : PRINT LPAR operation RPAR SCOL
    ;

comparisonExpression
    : operation op=(EQ | GT | LT | LTOE | GTOE | NEQ) operation
    ;

logicalExpression
    : LPAR comparisonExpression (op=(AND | OR) comparisonExpression)* RPAR
    ;


operation
    : LPAR operation RPAR                                       # Parenthesis
    | operation op=(MULT | DIV | MOD) operation                 # MultOp
    | operation op=(ADD | SUB) operation                        # AddOp
    | NUM                                                       # Num
    | ID                                                        # Id
    | STRING_VAL                                                # String
    ;

types
    : INT
    | FLOAT
    | STRING
    ;

//Separators
LCURL           : '{'  ;
RCURL           : '}'  ;
LSQBR           : ']'  ;
RSQBR           : '['  ;
LPAR            : '('  ;
RPAR            : ')'  ;
QUOTE           : '"'  ;
SQUOTE          : '\'' ;
SCOL            : ';'  ;
COL             : ':'  ;
QMARK           : '?'  ;
//Operators
MULT            : '*'  ;
DIV             : '/'  ;
MOD             : '%'  ;
ADD             : '+'  ;
SUB             : '-'  ;
MULTEQ          : '*=' ;
DIVEQ           : '/=' ;
MODEQ           : '%=' ;
ADDEQ           : '+=' ;
SUBEQ           : '-=' ;
ASSIGN          : '='  ;
GT              : '>'  ;
LT              : '<'  ;
GTOE            : '>=' ;
LTOE            : '<=' ;
EQ              : '==' ;
NEQ             : '!=' ;
AND             : '&&' ;
OR              : '||' ;
// Keywords
PRINT           : 'print'  ;
IF              : 'if'     ;
ELSEIF          : 'elseif' ;
ELSE            : 'else'   ;
SWITCH          : 'switch' ;
CASE            : 'case'   ;
BREAK           : 'break'  ;
WHILE           : 'while'  ;
DO              : 'do'     ;
FOR             : 'for'    ;
FOREACH         : 'foreach';
DEF             : 'def'    ;
RETURN          : 'return' ;
DEFAULT         : 'default';
// Types
INT             : 'int'    ;
FLOAT           : 'float'  ;
STRING          : 'string' ;
// Values
ID              : [a-zA-Z]+                                 ;
STRING_VAL      : '"' [a-zA-Z 0-9_*&^!-]+ '"'               ;
FUNC_NAME       : [a-zA-Z][a-zA-Z0-9]+                      ;
NUM             : [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)? ;
COMMENT         : '//' ~[\r\n]* -> skip                     ;
WS              : [ \t\r\n]+ -> skip                        ;