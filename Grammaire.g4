grammar Grammaire;

compileUnit                                        //dfa state initial s
 : block_statement EOF
 ;

block_statement
 : OPENBLOCK statement+ CLOSEBLOCK #blockStatement
 ;

statement
 : if_statement             #ifStatement
 | while_statement          #whileStatement
 | for_statement            #forStatement
 | null_statement           #nullStatement         //sentinel statement
 | expr                     #exprStatement
 ;

null_statement
 : SEMICOLON
 ;

if_statement
  : IF condExpr block_statement (ELSE block_statement)? // should include else if as else block_statement can contains if
  ;

condExpr
  : OPAR expr CPAR
  ;

while_statement
  : WHILE condExpr block_statement
  ;

for_statement
  : FOR OPAR expr expr expr CPAR block_statement
  ;




//switch_statement
//  : block_statement
//  ;


//return
// : RETURN expr SCOL
// ;
//

//method
// : FUNC ID '(' arguments? ')' OBRACE block return? CBRACE
// ;
//
//arguments
// : expr ( ',' expr )*
// ;

refExpression
 : lval=IDENTIFIER                                       #refValExpr //if no exisitng ref allocate memory
 | op='&' lval=refExpression                             #refAdrExpr
 | lval=refExpression op='='  rval=expr                  #refConstAssignExpr
 | lval=refExpression op='=>' rval=block_statement expr  #refStmtAssignExpr
 ;

// ADD BITWISE MAYBE?
arithmeticExpression
 : SUB arithmeticExpression                                                         #numUnaryExpr
 | lval=arithmeticExpression op=(MUL | DIV | MOD)       rval=arithmeticExpression   #numMultiplicativeExpr
 | lval=arithmeticExpression op=(ADD | SUB)             rval=arithmeticExpression   #numAdditiveExpr
 | lval=arithmeticExpression op=(LTEQ | GTEQ | LT | GT) rval=arithmeticExpression   #numRelationalExpr
 | lval=arithmeticExpression op=(EQ | NEQ)              rval=arithmeticExpression   #numRelationalExpr
 | (INTEGER | REAL)                                                                 #numConstantExpr
 ;

booleanExpression
 : lval=booleanExpression op=(EQ|NEQ) rval=booleanExpression    #booleanRelExpr
 | lval=booleanExpression op=(AND|OR) rval=booleanExpression    #booleanBinaryExpr
 | op=NOT lval=booleanExpression                                #booleanUnaryExpr
 | (TRUE | FALSE)                                               #booleanConstExpr
 ;

textExpression
 : lval=textExpression op=ADD        rval=textExpression        #textConcatExpr
 | lval=textExpression op=SUB        rval=textExpression        #textSubstituteExpr
 | lval=textExpression op=(EQ|NEQ)   rval=textExpression        #textRelationExpr
 | lvaĺ=TEXT                                                    #textConstExpr
 ;

expr
 : OPAR expr CPAR           #parExpr
 | booleanExpression        #logicalExpr
 | arithmeticExpression     #numericalExpr
 | textExpression           #literalExpr
 | refExpression            #refExpr
 | expr null_statement      #stmtExpr
 ;

IF : 'if';
ELSE : 'else';
FOR : 'for';
WHILE : 'while';

TRUE : 'true';
FALSE : 'false';

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';   // greater than OR equal
LTEQ : '<=';   // lower than OR equal
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';
NOT : '!';


SEMICOLON : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OPENBLOCK : '{';
CLOSEBLOCK : '}';

IDENTIFIER
 : [a-zA-Z_] [a-zA-Z_0-9]*   // maybe: _functionDefinitionPassedByRef
 ;

INTEGER
 : DIGIT // todo : add binary, octal, decimal, hexadecimal, vigesimal, base 32, base 64 representation
 ;

REAL
 : DIGIT '.' DIGIT
 | '.' DIGIT
 ;

DIGIT
 : [0-9]+
 ;

TEXT
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

WHITESPACE
 : [ \t\r\n] -> skip
 ;



