.source temp.lief
.class Temp
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
	.limit locals 100
	.limit stack 50
	.line 1
	ldc 0
	istore 1
	.line 3
	ldc 97
	dup
	getstatic java/lang/System/out Ljava/io/PrintStream;
	swap
	invokevirtual java/io/PrintStream/println(C)V
	pop
	ldc 98
	dup
	getstatic java/lang/System/out Ljava/io/PrintStream;
	swap
	invokevirtual java/io/PrintStream/println(C)V
	pop


	return
.end method