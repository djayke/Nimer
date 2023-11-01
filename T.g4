grammar T;

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : assignment
 | declare
 | if_stat
 | while_stat
 | for_stat
 | method
 | log
 | atom_stat
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

declare
 : VAR ID SCOL
 ;

assignment
 : ID ASSIGN expr SCOL
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : expr stat_block
 ;

stat_block
 : OBRACE block CBRACE
 | stat
 ;

return
 : RETURN expr SCOL
 ;

for_stat
 : FOR  assignment expr SCOL assignment stat_block
 ;

while_stat
 : WHILE expr stat_block
 ;

method
 : FUNC ID '(' arguments? ')' OBRACE block return? CBRACE
 ;

arguments
 : expr ( ',' expr )*
 ;

log
 : LOG expr SCOL
 ;

atom_stat
 : atom SCOL
 ;

expr
 : expr POW<assoc=right> expr           #powExpr
 | MINUS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
 | method                               #funcExpr
 ;

atom
 : OPAR expr CPAR             #parExpr
 | (INT | FLOAT)              #numberAtom
 | (TRUE | FALSE)             #booleanAtom
 | ID                         #idAtom
 | ID OPAR arguments? CPAR    #funcAtom
 | STRING                     #stringAtom
 | NIL                        #nilAtom
 ;

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';

SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
FUNC : 'func';
RETURN : 'return';
LOG : 'log';
VAR : 'var';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : .
 ;