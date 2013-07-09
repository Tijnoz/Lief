$if(rest(var))$		$! If there is more than one vraag statement !$				
$var:{$it$			$! For every statement, print vraag !$			
pop					$! Also print a pop, to pop the statement its result !$
}$					$! End the forloop !$
$else$				$! If there is a single vraag statement !$
$first(var)$		$! Print the statement. !$
$endif$				$! End the stringtemplate if statement !$
