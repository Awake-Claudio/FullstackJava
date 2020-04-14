Algoritmo ej2_banos
	definir nombre Como Caracter
	definir genero como caracter
	
	escribir "---Ingrese el nombre de la persona---"
	leer nombre
	escribir "---Ingrese género---"
	leer genero
	
	si genero<>femenino Entonces
		escribir "---Dirigirse al baño:---"
		mostrar "bano_hombres"
	sino 
		mostrar "bano_mujeres"
		
	FinSi
	
	
FinAlgoritmo
