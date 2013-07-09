invokestatic java/lang/System/console()Ljava/io/Console;		$! Load the System Console on the stack !$
invokevirtual java/io/Console/readLine()Ljava/lang/String;		$! Performs a readLine() on the Console !$
invokestatic java/lang/Integer/parseInt(Ljava/lang/String;)I	$! Tries parseInt() on the String !$
dup																$! Duplicates the int on the stack !$
istore $var$													$! Stores the int on the given address !$
