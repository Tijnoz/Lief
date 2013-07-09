$if(value)$		$! If True has to be loaded on the stack !$
iconst_1		$! Load 1 on the stack !$
$else$			$! Otherwise load False on the stack !$
iconst_0		$! Load 0 on the stack !$
$endif$			$! End the stringtemplate if-statement !$