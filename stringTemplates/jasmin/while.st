LBL$lbl$_1:					$! Condition label, jump to re-evaluate !$
$condition$					$! Evaluate the condition !$
ifeq LBL$lbl$_2				$! Jump to the end if the condition is 0 !$
$sentence; separator="\n"$	$! Print all the sentences in this whileloop !$
goto LBL$lbl$_1				$! After executing commands, go back to the evaluation !$
LBL$lbl$_2:					$! Label indicating the end of the whileloop !$