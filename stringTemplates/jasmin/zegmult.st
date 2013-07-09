$if(rest(var))$		$! If there is more than one zeg statement !$							
$var:{$it$			$! For every statement, print zeg !$
pop					$! Also print a pop, to pop the statement its result !$
}$					$! End the forloop !$
$else$				$! If there is a single zeg statement !$
$first(var)$		$! Print the statement. !$

$endif$				$! End the stringtemplate if statement !$
getstatic java/lang/System/out Ljava/io/PrintStream;	$! Get System.out to print a newline !$
invokevirtual java/io/PrintStream/println()V			$! Print the newline !$
