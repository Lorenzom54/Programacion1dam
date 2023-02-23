Algoritmo seis
	contador=1
	limite=0
	Escribir "introduce un número: "
	Leer limite
	Si limite<0 Entonces
		Escribir "Solo se aceptan numero naturales"
	SiNo
		Mientras contador<=limite Hacer
			Escribir contador
			contador=contador+1
		FinMientras
	Fin Si
FinAlgoritmo