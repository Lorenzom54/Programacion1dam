
Algoritmo Prueba_examen
	consumo100=0
	consumo=0
	media=0
	totalkm=0
	preciogas=0
	totalgas=0
	duracion=0
	litros=0

	
	Escribir "Cuantos KM has recorrido: "
	Leer totalkm
	Escribir "Cuantas horas ha durado el viaje"
	Leer duracion
	Escribir "Cual es el precio de la gasolina"
	Leer preciogas
	Escribir "Cuantos litros has hechado"
	leer litros
	
	
	litros=totalgas/preciogas
	
	Escribir "Tu consumo a los 100km ha sido: " consumo100, "Y su precio ha sido de: " litros 
	
	consumo100= totalkm/litros
	
	Escribir "Tu consumo por km ha sido de: " consumo100
	
	Escribir "La velocidad media ha sido" media
	
	vmedia=totalkm/duracion
	

	
	
FinAlgoritmo
