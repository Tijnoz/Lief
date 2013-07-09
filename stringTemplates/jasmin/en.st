$ex1$					$! Evaluate the first expression !$ 
$ex2$					$! Evaluate the expression expression !$
iadd					$! Combine the two expressions !$
iconst_2				$! Load the integer two !$
if_icmpeq LBL$lbl$_1	$! Compare the expression its sum with two !$
iconst_0				$! Push 0 if this is not true !$
goto LBL$lbl$_2			$! Go to the end !$
LBL$lbl$_1: 			$! Label for the not-true case !$
iconst_1				$! Push 1 if this is true !$
LBL$lbl$_2:				$! Label for the end !$