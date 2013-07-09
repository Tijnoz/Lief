.source goed.lief
.class Goed
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
	.limit locals 100
	.limit stack 50
	.line 1
	ldc 0
	istore 1
	.line 2
	ldc 0
	dup
	istore 1
	pop
	.line 4
	LBL1_1:
	iload 1
	ldc 5
	if_icmplt LBL0_1
	iconst_0
	goto LBL0_2
	LBL0_1: 
	iconst_1
	LBL0_2:
	ifeq LBL1_2
	.line 6
	iload 1
	dup
	getstatic java/lang/System/out Ljava/io/PrintStream;
	swap
	invokevirtual java/io/PrintStream/println(I)V
	ldc 1
	iadd
	dup
	istore 1
	pop
	goto LBL1_1
	LBL1_2:
	return
.end method