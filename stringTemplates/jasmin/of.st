$ex1$				$! Expression one is evaluated !$
$ex2$				$! Expression two is evaluated !$
iadd				$! Add the two values together !$
ifgt LBL$lbl$_1		$! If one of the two is true, the result is greater than 0 !$
iconst_0			$! Load 0 on the stack if it is not true !$
goto LBL$lbl$_2		$! Go to the end of the program !$
LBL$lbl$_1: 		$! Indicate the true case !$
iconst_1			$! Load 1 on the stack !$
LBL$lbl$_2:			$! Indicate the end of the template !$	
