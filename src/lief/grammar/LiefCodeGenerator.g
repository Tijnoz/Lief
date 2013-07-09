tree grammar LiefCodeGenerator;

options {
  tokenVocab=Lief;                    // import tokens from Calc.tokens
  ASTLabelType=LiefTree;            // AST nodes are of type CommonTree
  output=template;
}

@header {
	package lief.grammar;
}

@members {
  int localStore = 0;
  int lblNum     = 0;
  private int lblNum() { return lblNum++; }
  private boolean returnsVoid(LiefTree t) {return t.getLiefType().equals(CheckerFunc.VOID_TYPE) || t.getLiefType().equals(CheckerFunc.NO_TYPE);}
  //Returns a boolean array with r[0] if type is an int, r[1] if it is a char, r[2] if it is a boolean
  private boolean[] type(LiefTree t) { return new boolean[] {t.getLiefType().equals(CheckerFunc.GETALLETJE),
                                                             t.getLiefType().equals(CheckerFunc.LETTERTJE),
                                                             t.getLiefType().equals(CheckerFunc.SMILEY)};  }
}

program
  :   ^(PROGRAM  (s+=sentence)+ ) 
      -> program(filename={Lief.getFilename()}, classname={Lief.getClassname()}, locals={100}, stack={50}, sentence = {$s})
  ;
  
sentence
  :   (d=declaration)   -> sentence(sentence={$d.st},linenumber={$d.start.getLine()},pop={!returnsVoid($d.start) && !$d.start.shouldReturn()})
  |   (c=command)       -> sentence(sentence={$c.st},linenumber={$c.start.getLine()},pop={!returnsVoid($c.start) && !$c.start.shouldReturn()})
  ;

declaration
  :   ^(HARTJE name=IDENTIFIER type=IDENTIFIER) {localStore++; name.setAddress(localStore);} 
      -> declaration(type={$type.text},address={localStore})
  |  ^(STEENTJE name=IDENTIFIER value=expression){localStore++; name.setAddress(localStore);}
      -> steentje(ex={$value.st},address={localStore})
  ;
  
command
  :   (e=expression)    -> {$e.st} 
  |   (i=ifCommand)     -> {$i.st}
  |   (w=whileCommand)  -> {$w.st}
  |   (ec=emptyCommand) -> {$ec.st} 
  ;
  
ifCommand
  :   ^(BLIJE e1=expression DAN (s1+=sentence)+ ANDERS (s2+=sentence)+) 
      -> ifthenelse(condition={$e1.st}, dan={$s1}, anders={$s2}, lbl={lblNum()})
  ;
    
emptyCommand  
  :   LAAT -> nop()
  ;
    
whileCommand
  :   ^(ZOLANG e1=expression (s+=sentence)+)   
      -> while(condition={$e1.st}, sentence={$s}, lbl={lblNum()})
  ;
    
expression
  :   ^(WORDT var=variable ex=expression)       -> wordt    (var={$var.st},expression={$ex.st})
  |   ^(NEGATIEF  ex=expression)                -> negatief (expression={$ex.st})
  |   ^(POSITIEF  ex=expression)                -> positief (expression={$ex.st})  
  |   ^(NIET      ex=expression)                -> niet     (expression={$ex.st})
  |   ^(EN        ex1=expression ex2=expression)-> en       (ex1={$ex1.st},ex2={$ex2.st},lbl={lblNum()})
  |   ^(OF        ex1=expression ex2=expression)-> of       (ex1={$ex1.st},ex2={$ex2.st},lbl={lblNum()})
  |   ^(MULTIPLY  ex1=expression ex2=expression)-> multiply (ex1={$ex1.st},ex2={$ex2.st})
  |   ^(DIVIDE    ex1=expression ex2=expression)-> divide   (ex1={$ex1.st},ex2={$ex2.st})
  |   ^(MODULO    ex1=expression ex2=expression)-> modulo   (ex1={$ex1.st},ex2={$ex2.st})  
  |   ^(PLUS      ex1=expression ex2=expression)-> plus     (ex1={$ex1.st},ex2={$ex2.st})
  |   ^(MIN       ex1=expression ex2=expression)-> min      (ex1={$ex1.st},ex2={$ex2.st})
  |   ^(KLEINST   ex1=expression ex2=expression)-> kleinst  (ex1={$ex1.st},ex2={$ex2.st},lbl={lblNum()})
  |   ^(GROOTST   ex1=expression ex2=expression)-> grootst  (ex1={$ex1.st},ex2={$ex2.st},lbl={lblNum()})
  |   ^(KLEINER   ex1=expression ex2=expression)-> kleiner  (ex1={$ex1.st},ex2={$ex2.st},lbl={lblNum()})
  |   ^(GROTER    ex1=expression ex2=expression)-> groter   (ex1={$ex1.st},ex2={$ex2.st},lbl={lblNum()})
  |   ^(ZOALS     ex1=expression ex2=expression)-> zoals    (ex1={$ex1.st},ex2={$ex2.st},lbl={lblNum()})
  |   ^(ANDERS    ex1=expression ex2=expression)-> anders   (ex1={$ex1.st},ex2={$ex2.st},lbl={lblNum()})
  |   (c=compoundExpression)                    -> {$c.st} 
  |   (o=operand)                               -> {$o.st}
  ;

compoundExpression
  :   ^(BEGIN (s+=sentence)+) -> compound(sentence={$s})
  ;
   
operand
  :   (n=NUMBER)               -> number(value={$n.text})
  |   ^(LPAREN e=expression)   -> {$e.st}
  |   (id=variable)            -> variable(address={$id.st})
  |   (s=SMILEY)               -> smiley(value={$s.text.equals(":)") ? true : false})
  |   (c=CHARACTER)            -> number(value={(int) $c.text.charAt(1)})
  |   ^(ZEG   (op+=zegop)+)    -> zegmult(var={$op})
  |   ^(VRAAG (vv+=vraagvar)+) -> vraagmult(var={$vv})
  ;
  
variable
  : (v=VARIABLE) -> address(address={$v.getAddress()})
  ;
  
vraagvar
  : (v=variable) {boolean[] b = type($v.start);} -> {b[1]}?  vraagchar(var={$v.st})
                                                 -> {b[2]}?  vraagbool(var={$v.st})
                                                 ->          vraagint (var={$v.st})
  ;
  
zegop
  : (v=operand) {boolean[] b = type($v.start);} -> {b[1]}?  zegchar(var={$v.st})
                                                -> {b[2]}?  zegbool(var={$v.st},lbl={lblNum()})
                                                ->          zegint (var={$v.st})
  ;