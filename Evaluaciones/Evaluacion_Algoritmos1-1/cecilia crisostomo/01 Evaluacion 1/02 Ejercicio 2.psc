Algoritmo ej2_banos
	definir nombre Como Caracter
	definir genero como caracter
	
	escribir "---Ingrese el nombre de la persona---"
	leer nombre
	escribir "---Ingrese g�nero---"
	leer genero
	
	si genero<>femenino Entonces
		escribir "---Dirigirse al ba�o:---"
		mostrar "bano_hombres"
	sino 
		mostrar "bano_mujeres"
		
	FinSi
	
	
FinAlgoritmo
