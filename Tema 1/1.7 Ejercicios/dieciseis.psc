Algoritmo dieciseis
	num1=0
	num2=0
	aux=0
	sumtotal=0
	sumpares=0
	totalimpar=0

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
		
		sumtotal=sumtotal+1
		
		si num1%2=0 //calcular la cantidad de numeros pares
			sumpares=sumpares+1
		SiNo
			totalimpar=totalimpar+num1 //suma los impares
		FinSi
		num1=num1+1
	FinMientras
	Escribir "Total numeros", sumtotal
	escribir "Total pares", sumpares
	Escribir "Suma impares", totalimpar

FinAlgoritmo
