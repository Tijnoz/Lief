tree grammar LiefChecker;

options {
    tokenVocab=Lief;                    // import tokens from Lief.tokens
    ASTLabelType=LiefTree;            // AST nodes are of type CommonTree
    rewrite=true;
    output=AST; 
}

@header {
package lief.grammar;

import lief.grammar.symboltable.*;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
}

// Alter code generation so catch-clauses get replaced with this action. 
// This disables ANTLR error handling: CalcExceptions are propagated upwards.
@rulecatch { 
    catch (RecognitionException e) { 
        throw e; 
    }
}

@members {
    CheckerFunc cf = new CheckerFunc();
}


program
@init{
  cf.openScope();
}
@after{
  cf.closeScope();
}
    :   ^(PROGRAM sentence+)
    ;
    
sentence
    :   command
    |   declaration 
    ;
    
command
    :   expression
    |   ifCommand
    |   whileCommand
    |   emptyCommand
    ;
    
ifCommand
    :   ^(r=BLIJE 
            e1=expression 
	            DAN     { cf.openScope(); } sentence+ { cf.closeScope(); }
	            ANDERS  { cf.openScope(); } sentence+ { cf.closeScope(); }
         ){
            cf.checkIf(r, $e1.tree);
         } 
    ;
    
whileCommand
    : ^(r=ZOLANG e1=expression { cf.openScope(); } sentence+ { cf.closeScope(); }){
        cf.checkWhile(r, $e1.tree);
      }
    ;
    
emptyCommand
    : (r=LAAT) {
        cf.checkEmptyCommand(r);
      }
    ;
      
declaration
    :   ^(r=HARTJE id=IDENTIFIER t=IDENTIFIER){
          cf.checkDeclaration(r, id, t);
        }
     |  ^(r=STEENTJE id=IDENTIFIER val=expression){
          cf.checkConstant(r, id, $val.tree);
        }
     ;
    
expression
    :   ^(r=WORDT id=VARIABLE ex=expression) {
            cf.checkExprAssign(r, id, $ex.tree);
			  }
		|   (ec=compoundExpression){
		        cf.checkExprCompound($ec.tree);
        }
    |   ^(r=(NEGATIEF | POSITIEF) ex=expression){
            cf.checkExprNegate(r, $ex.tree); 
        }
    |   ^(r=NIET ex=expression){
            cf.checkExprNot(r, $ex.tree);
        }
    |   ^(r=(MULTIPLY | DIVIDE | MODULO | PLUS | MIN) e1=expression e2=expression){
            cf.checkExprMath(r, $e1.tree, $e2.tree);
        }
    |   ^(r=(KLEINST | GROOTST | KLEINER | GROTER) e1=expression e2=expression){
            cf.checkExprCompNumber(r, $e1.tree, $e2.tree);
        }
    |  ^(r=(ZOALS | ANDERS) e1=expression e2=expression){
            cf.checkExprCompThing(r, $e1.tree, $e2.tree);
        }
    |  ^(r=(EN | OF) e1=expression e2=expression){
            cf.checkExprBin(r, $e1.tree, $e2.tree);
    }
    |   operand
    ;
    
compoundExpression
    : ^(r=BEGIN { cf.openScope(); } (s=sentence{
          cf.checkCompoundExpr(r, $s.tree);
         })+ { cf.shouldReturn($s.tree); cf.closeScope(); } ) 
    ;
    
    
operand
    : (n=NUMBER) {
        cf.checkOperandNumber(n);
    }
    | ^(r=LPAREN ex=expression){
        cf.checkOperandLparen(r, $ex.tree);
      }
    | (id=VARIABLE) {
        cf.checkOperandVariable(id); 
    }
    | (s=SMILEY) {
        cf.checkOperandSmiley(s);
    }
    | (c=CHARACTER) {
        cf.checkOperandChar(c);
    }
    |   ^(r=ZEG (op=operand { cf.checkExprZegSingle(r, $op.tree);}) 
                (op=operand    { cf.checkExprZegMultiple(r, $op.tree);  })* //when multiple operands are printed, this expression has type void
         )
    |   ^(r=VRAAG   (id=VARIABLE { cf.checkExprVraagSingle(r, id); })
                    (id=VARIABLE { cf.checkExprVraagMultiple(r, id); })* //when multiple ids are asked, this expression has type void
         )
    ; 