invokestatic java/lang/System/console()Ljava/io/Console;		$! Load the System Console on the stack !$
invokevirtual java/io/Console/readLine()Ljava/lang/String;      $! Performs a readLine() on the Console !$
iconst_0                                                        $! Loads an argument for the next function, 0 !$
invokevirtual java/lang/String/charAt(I)C                       $! Gets the first character from the read String !$	
dup                                                             $! Duplicates the character on the stack !$
istore $var$                                                    $! Stores the character on the given address !$
