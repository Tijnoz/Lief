.source $filename$ 									$! Defineert het sourcebestand !$
.class $classname$									$! Defineert het klassebestand !$
.super java/lang/Object								$! Zet de superklasse van deze klasse !$
.method public static main([Ljava/lang/String;)V	$! Zet deze klasse als main methode !$
	.limit locals $locals$							$! Limiteert het aantal local variablen !$
	.limit stack $stack$							$! Limiteert de stackgrootte!$
	$sentence; separator="\n"$						$! Parsed de senteces die meegegeven worden met een linebreak !$
	return											$! Beindigd de main methode !$
.end method											$! Einde van de methode voor jasmin!$