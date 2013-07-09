.source grote_test.lief 									
.class Grote_test									
.super java/lang/Object								
.method public static main([Ljava/lang/String;)V	
	.limit locals 100							
	.limit stack 50							
	.line 14	
	iconst_0			 
	istore 1				
					
	.line 15	
	iconst_0			 
	istore 2				
					
	.line 17	
	ldc 0				
	dup					
	istore 2				
	dup					
	istore 1					
	pop		
					
	.line 19	
	iconst_0			 
	istore 3				
					
	.line 21	
										
	ldc 100																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 101																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 108																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 101																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 114																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 115																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 118																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 97																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 110																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 105																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 116																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 47																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 109																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 63																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
					
	invokestatic java/lang/System/console()Ljava/io/Console;		
	invokevirtual java/io/Console/readLine()Ljava/lang/String;		
	invokestatic java/lang/Integer/parseInt(Ljava/lang/String;)I	
	dup																
	istore 3																																	
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(I)V								
	pop					
										
	getstatic java/lang/System/out Ljava/io/PrintStream;	
	invokevirtual java/io/PrintStream/println()V						
					
	.line 24	
	LBL7_1:					
	.line 25	
	iconst_0			 
	istore 4				
					
	.line 26	
	iload 1							
	ldc 0							
	if_icmpge LBL0_1	
	iconst_0				
	goto LBL0_2			
	LBL0_1: 			
	iconst_1				
	LBL0_2:									
	ifeq LBL2_1				 
	.line 27	
	iload 1							
	iload 3							
	if_icmplt LBL1_1	
	iconst_0				
	goto LBL1_2			
	LBL1_1: 			
	iconst_1				
	LBL1_2:						
	dup					
	istore 4					
	pop		
							
	goto LBL2_2				
	LBL2_1:					
	.line 29	
				
	iconst_0							
	dup					
	istore 4					
	pop		
						
	LBL2_2:								
					
	.line 31	
	iload 4					
	pop		
					  					
	ifeq LBL7_2				
	.line 34	
										
	ldc 100																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 101																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 108																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 101																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 114																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 115																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 118																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 97																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 110																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
										
	getstatic java/lang/System/out Ljava/io/PrintStream;	
	invokevirtual java/io/PrintStream/println()V						
					
	.line 36	
					
	iload 1																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(I)V							
					
	getstatic java/lang/System/out Ljava/io/PrintStream;	
	invokevirtual java/io/PrintStream/println()V					 
	iload 1				
	ineg						 
	iadd				 
	ldc 2				 
	iadd				
	dup					
	istore 2					
	pop		
					
	.line 37	
	LBL6_1:					
	iload 2							
	iload 1							
	if_icmplt LBL3_1	
	iconst_0				
	goto LBL3_2			
	LBL3_1: 			
	iconst_1				
	LBL3_2:									
	ifeq LBL6_2				
	.line 38	
	iload 1				 
	iload 2				 
	irem							
	ldc 0							
	if_icmpeq LBL4_1	
	iconst_0				
	goto LBL4_2			
	LBL4_1: 			
	iconst_1				
	LBL4_2:									
	ifeq LBL5_1				 
	.line 39	
										
	ldc 106																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 40																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	iload 2																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(I)V								
	pop					
	ldc 41																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 105																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 115																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 101																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 101																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 110																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 100																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 101																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 108																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 101																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 114																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 118																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 97																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 110																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 32																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 105																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 40																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	iload 1																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(I)V								
	pop					
	ldc 41																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 33																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
										
	getstatic java/lang/System/out Ljava/io/PrintStream;	
	invokevirtual java/io/PrintStream/println()V						
							
	goto LBL5_2				
	LBL5_1:					
	.line 43	
	nop				
						
	LBL5_2:								
					
	.line 45	
	iload 2				 
	ldc 1				 
	iadd				
	dup					
	istore 2					
	pop		
						
	goto LBL6_1				
	LBL6_2:								
					
	.line 47	
	iload 1				 
	ldc 1				 
	iadd				
	dup					
	istore 1					
	pop		
						
	goto LBL7_1				
	LBL7_2:								
					
	.line 60	
	iconst_0			 
	istore 5				
					
	.line 61	
	iconst_0			 
	istore 6				
					
	.line 63	
	iconst_0			 
	istore 7				
					
	.line 64	
	.line 65	
	iconst_0			 
	istore 8				
					
	.line 66	
	iconst_0			 
	istore 9				
					
	.line 67	
	iconst_0			 
	istore 10				
					
	.line 68	
										
	ldc 120																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 44																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 121																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 44																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 99																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 44																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	ldc 98																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
										
	getstatic java/lang/System/out Ljava/io/PrintStream;	
	invokevirtual java/io/PrintStream/println()V						
					
	.line 69	
							
	invokestatic java/lang/System/console()Ljava/io/Console;		
	invokevirtual java/io/Console/readLine()Ljava/lang/String;		
	invokestatic java/lang/Integer/parseInt(Ljava/lang/String;)I	
	dup																
	istore 9																			
	pop					
	invokestatic java/lang/System/console()Ljava/io/Console;		
	invokevirtual java/io/Console/readLine()Ljava/lang/String;		
	invokestatic java/lang/Integer/parseInt(Ljava/lang/String;)I	
	dup																
	istore 10																			
	pop					
	invokestatic java/lang/System/console()Ljava/io/Console;		
	invokevirtual java/io/Console/readLine()Ljava/lang/String;      
	iconst_0                                                        
	invokevirtual java/lang/String/charAt(I)C                       	
	dup                                                             
	istore 5                                                    						
	pop					
	invokestatic java/lang/System/console()Ljava/io/Console;		
	invokevirtual java/io/Console/readLine()Ljava/lang/String;      
	ldc ":)"                                                        
	invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z      	
	dup                                                             
	istore 6																			
	pop					
													
					
	.line 70	
	LBL9_1:					
	iload 9							
	iload 10							
	if_icmpge LBL8_1	
	iconst_0				
	goto LBL8_2			
	LBL8_1: 			
	iconst_1				
	LBL8_2:									
	ifeq LBL9_2				
	.line 71	
	iload 8				 
	ldc 1				 
	iadd				
	dup					
	istore 8					
	pop		
					
	.line 72	
	iload 9				 
	iload 10		        
	isub        		
	dup					
	istore 9					
	pop		
						
	goto LBL9_1				
	LBL9_2:								
					
	.line 74	
	iload 8					
	pop		
					  		
	dup					
	istore 7					
	pop		
					
	.line 77	
										
	iload 7																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(I)V								
	pop					
	iload 5																
	dup															
	getstatic java/lang/System/out Ljava/io/PrintStream;		
	swap														
	invokevirtual java/io/PrintStream/print(C)V								
	pop					
	iload 6																	
	dup                                                             
	ifeq LBL10_1                                                 
	ldc ":)"                                                        
	goto LBL10_2                                                 
	LBL10_1:														
	ldc ":("														
	LBL10_2:														
	getstatic java/lang/System/out Ljava/io/PrintStream;			
	swap															
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V				
	pop					
										
	getstatic java/lang/System/out Ljava/io/PrintStream;	
	invokevirtual java/io/PrintStream/println()V						
											
	return											
.end method											