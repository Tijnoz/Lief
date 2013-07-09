$condition$					$! Eerst wordt de conditie geevalueerd en op de stack gezet !$
ifeq LBL$lbl$_1				$! Als de conditie 0 is wordt er naar <anders> gejumped !$ 
$dan; separator="\n"$		$! Als er niet wordt gejumped is de conditie dus 1 en wordt het <dan> deel uitgevoerd !$
goto LBL$lbl$_2				$! Als <dan> is uitgevoerd, jump naar het einde !$
LBL$lbl$_1:					$! Label 1 wordt aangegeven !$
$anders; separator="\n"$	$! De code voor <anders> kan hier staan !$
LBL$lbl$_2:					$! Label 2 wordt aangegeven als einde van deze functie !$
