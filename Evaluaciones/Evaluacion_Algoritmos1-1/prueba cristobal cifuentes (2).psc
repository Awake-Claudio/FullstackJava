	subproceso funcion1
		definir a1 Como Entero
		definir b1 Como Entero
		definir c1 Como Entero
		definir d1 Como Entero
		
		Escribir "ingrese primer numero"
		leer a1
		Escribir "ingrese segundo numero"
		leer b1
		Escribir "ingrese tercer numero"
		leer c1
		d1=(a1+b1+c1)/3
		escribir "el promedio es " d
	FinSubProceso
	
	SubProceso funcion2
		definir a2 Como Caracter
		definir b2 como entero
		escribir "ingrese su nombre"
		leer a2
		escribir "si su genero es masculino digite 1, si es femenino digite 2"
		leer b2
		si b2= 1
			escribir a2 " dirigase al baño de hombres"
		SiNo
			si b2 = 2
				escribir a2 " dirigase al baño de damas"
			sino 
				escribir a2 " a ingresado mal el indicador de genero"
			FinSi
		FinSi
FinSubProceso

subproceso funcion4
	definir a4 Como Entero
	escribir "ingrese un numero entre 1 y 10"
	leer n
	Segun n hacer
		1: escribir "uno"
		2: escribir "dos"
		3: escribir "tres"
		4: escribir "cuatro"
		5: escribir "cinco"
		6: escribir "seis"
		7: escribir "siete"
		8: escribir "ocho"
		9: escribir "nueve"
		10: escribir "diez"
	FinSegun
FinSubProceso

Algoritmo sin_titulo
	
FinAlgoritmo 