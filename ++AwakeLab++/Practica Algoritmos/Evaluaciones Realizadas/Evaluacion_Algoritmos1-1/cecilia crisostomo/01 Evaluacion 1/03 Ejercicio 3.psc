Algoritmo ej3_cobrobanos
	definir nombre Como caracter

	escribir "---Ingrese el nombre de la persona---"
	leer nombre
	escribir "Uso de baño o ducha"
	leer servicio
	
	Mientras servicio<>0 Hacer
		si servicio=ducha Entonces
			escribir "Cobro 2.500"
			si servicio=bano Entonces
				escribir "Cobro 250"
			FinSi
		FinSi
		
	FinMientras
	

	
	
FinAlgoritmo


