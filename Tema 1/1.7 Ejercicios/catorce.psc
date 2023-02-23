Algoritmo catorce
	num1=0
	num2=0
	aux=0
	
	Escribir "Introduce número 1:"
	Leer num1
	Escribir "Introduce número 2:"
	leer num2
	//intercambiar valores
	si num1>num2 Entonces
		aux=num2
		num2=num1
		num1=aux
	FinSi
	num1=num1+1
	Mientras num1<num2 Hacer
		Escribir num1
		num1=num1+1
	FinMientras
	
FinAlgoritmo
