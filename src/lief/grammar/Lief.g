grammar Lief;

options {
	  k=1; 
	  language = Java;
	  output = AST;
}

tokens {
    PERIOD      =   '.'     ;
    LPAREN      =   '('     ;
    RPAREN      =   ')'     ;

    // operators
    PLUS        =   'plus'  ;
    MIN         =   'min'   ;
    DIVIDE      =   'delen' ;
    BY          =   'door'  ;
    MULTIPLY    =   'maal'  ;
    WORDT       =   'wordt' ;
    MODULO      =   'modulo';
    POSITIEF    =   'positief';
    NEGATIEF    =   'negatief';
    NIET        =   'niet';
    
    //Expression (commands)
    ZEG         =   'zeg'   ;
    VRAAG       =   'vraag' ;
    
    //Comp operators
    KLEINST     = 'kleinst' ;
    GROOTST     = 'grootst' ;
    KLEINER     = 'kleiner' ;
    GROTER      = 'groter'  ;
    ZOALS       = 'zoals'   ;
    ANDERS      = 'anders'  ;
    DAN         = 'dan'     ;
    OF          = 'of';

    // keywords
    HARTJE      =   'hartje'    ;
    STEENTJE    =   'steentje'  ;
    IS          =   'is'        ;
    EEN         =   'een'       ;
    //H         =   '\u2665'    ;
    PROGRAM     =   'program'   ;
    BEGIN       =   'begin'     ;
    KLAAR       =   'klaar'     ;
    EN          =   'en'        ;
    BLIJE       =   'blije'     ; //if
    LAAT        =   'laat'      ;
    MAAR        =   'maar'      ;
    ZOLANG      =   'zolang'    ; //while
}

@lexer::header {
package lief.grammar;
}

@header {
package lief.grammar;
}

// Parser rules
program
    :   (sentence)* EOF
            ->  ^(PROGRAM sentence*)
    ;
    
sentence
    :   ((command | declaration) PERIOD!)
    ;
    
command
    :   expression
    |   ifCommand
    |   emptyCommand
    |   whileCommand
    ;

declaration
    :   HARTJE^ IDENTIFIER IS! EEN! type
    |   STEENTJE^ IDENTIFIER WORDT! expression
    ;
    
ifCommand
    :   BLIJE^ exprBin (DAN sentence+) (ANDERS sentence+) KLAAR!
    ; 
    
emptyCommand  
    :   LAAT^ MAAR!
    ;
    
whileCommand
    :   ZOLANG^ exprBin DAN! sentence+ KLAAR!
    ;
    
  
expression
    :  exprBin (WORDT^ expression)?
    ;
    
exprBin
    : exprComp ((EN^ | OF^) exprComp)*
    ;
    
exprComp  
  : exprAddSub (binop^ exprAddSub)*
  ;
  
binop
  : KLEINST^
  | GROOTST^
  | KLEINER^
  | GROTER^ 
  | ZOALS^ 
  | ANDERS^ DAN!
  ;
    
exprAddSub
  : exprModulo ((PLUS^ | MIN^) exprModulo )*  
  ;

exprModulo
  : muldiv ((MODULO^) muldiv)*
  ;

muldiv
  : unary ((MULTIPLY^ | (DIVIDE^ BY!)) unary)*
  ;

unary
  : (NEGATIEF^ | POSITIEF^ | NIET^) unary
  | operand
  ;

operand
    :   NUMBER
    |   LPAREN^ expression RPAREN!
    |   VARIABLE
    |   SMILEY
    |   CHARACTER
    |   zegExpr
    |   vraagExpr
    |   BEGIN^ sentence+ KLAAR!
    ;
    
zegExpr 
    : ZEG^ LPAREN! operand (EN! operand)* RPAREN!
    ;
    
vraagExpr
    : VRAAG^ LPAREN! VARIABLE (EN! VARIABLE)* RPAREN!
    ;

type
    :   IDENTIFIER
    ;


// Lexer rules

IDENTIFIER  : LETTER (LETTER | DIGIT)*;

VARIABLE    : H IDENTIFIER;

NUMBER      : DIGIT+;

SMILEY      : ':)'
            | ':('
            ;

CHARACTER   : QUOT ('!'..'~') QUOT //all letters, numbers and special (visible) characters
            | QUOT WS QUOT
            ;

COMMENT     : '@#%' .* '\n'  
              { $channel=HIDDEN; }
            ;
    
ML_COMMENT  : 'mama' (options {greedy=false;} : .)* 'onee grapje' 
              { $channel=HIDDEN; }
            ;

WS          : (' ' | '\t' | '\f' | '\r' | '\n')+
                { $channel=HIDDEN; }
            ;

fragment DIGIT  :   ('0'..'9') ;
fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER | '_';
fragment H      :   '\u2665';
fragment QUOT   :   '\u0027';

// EOF