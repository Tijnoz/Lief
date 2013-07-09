invokestatic java/lang/System/console()Ljava/io/Console;		$! Load the System Console on the stack !$
invokevirtual java/io/Console/readLine()Ljava/lang/String;      $! Performs a readLine() on the Console !$
ldc ":)"                                                        $! Loads a truth-String on the stack !$
invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z      $! Compares the truth-String to the read string !$	
dup                                                             $! Duplicates the boolean on the stack !$
istore $var$													$! Stores the boolean on the given address !$
