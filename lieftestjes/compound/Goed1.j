.source goed1.lief
.class Goed1
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
	.limit locals 100
	.limit stack 50
	.line 1
	ldc 0
	istore 1

	.line 3
	.line 4
	ldc 4
	ldc 8
	if_icmpne LBL0_1
	iconst_0
	goto LBL0_2
	LBL0_1: 
	iconst_1
	LBL0_2:
	pop
	.line 5
	ldc 5

	dup
	istore 1
	pop
	return
.end method