grammar es1;

main : commands EOF ;

commands : exp                            # expression
         | VAR EQUAL exp COLON  commands  # declaration
         ;

exp  : INT                       # int
     | VAR                       # var
     | LPAR exp MOD   exp RPAR   # mod
     | LPAR exp MUL   exp RPAR   # mul
     | LPAR exp DIV   exp RPAR   # div
     | LPAR exp PLUS  exp RPAR   # plus
     | LPAR exp MINUS exp RPAR   # minus
     ;

INT  : '0' | '-' ? [1-9][0-9]* ;
VAR : [a-z]+;

LPAR : '(' ;
RPAR : ')' ;
PLUS : '+' ;
MUL  : '*' ;
MINUS: '-' ;
DIV  : '/' ;
MOD  : '%' ;
COLON: ';' ;
EQUAL: '=' ;

WS   : [ \t\n\r]+ -> skip ;