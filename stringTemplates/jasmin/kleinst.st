$ex1$					$! Evaluate the first expression !$
$ex2$					$! Evaluate the second expression !$
if_icmplt LBL$lbl$_1	$! Compare the two values using less-than !$
iconst_0				$! If not true, push 0 on the stack !$
goto LBL$lbl$_2			$! Go to the end !$
LBL$lbl$_1: 			$! Label for true section !$
iconst_1				$! Push 1 on the stack if true !$
LBL$lbl$_2:				$! Label for the end !$
