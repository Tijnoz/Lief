$var$														$! Load operand on the stack !$
dup															$! Duplicate the operand so it remains on the stack !$
getstatic java/lang/System/out Ljava/io/PrintStream;		$! Load System.out !$
swap														$! Swap System.out and the character to set the right order for print(I) !$
invokevirtual java/io/PrintStream/print(C)V					$! Print character on System.out !$
