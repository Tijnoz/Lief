$if(rest(var))$
getstatic java/lang/System/out Ljava/io/PrintStream;
$var:{dup
$it$ 
invokevirtual java/io/PrintStream/println(I)V
}$pop
$else$
$first(var)$
dup
getstatic java/lang/System/out Ljava/io/PrintStream;
swap
invokevirtual java/io/PrintStream/println(I)V
$endif$

