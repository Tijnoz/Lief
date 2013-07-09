$var$															$! Load operand on the stack !$
dup                                                             $! Duplicate the operand so it remains on the stack !$
ifeq LBL$lbl$_1                                                 $! If it equals 0, go to label 1 !$
ldc ":)"                                                        $! Load the truth-string !$
goto LBL$lbl$_2                                                 $! Goto the end of the switch !$
LBL$lbl$_1:														$! Label 1, denotes false-evaluation !$
ldc ":("														$! Load the false-string !$
LBL$lbl$_2:														$! Label 2, the end label !$
getstatic java/lang/System/out Ljava/io/PrintStream;			$! Loads system.out !$
swap															$! Swap System.out and the boolean to set the right order for print(String s) !$
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V	$! Print the boolean value !$