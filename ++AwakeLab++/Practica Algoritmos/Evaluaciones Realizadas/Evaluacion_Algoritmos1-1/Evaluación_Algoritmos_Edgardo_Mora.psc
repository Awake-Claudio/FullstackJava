Funcion funcionUno(n1,n2,n3)
	Escribir "Ingresa el primer n�mero: "
	Leer n1
	Escribir "Ingresa el segundo n�mero: "
	Leer n2
	Escribir "Ingresa el tercer n�mero: "
	Leer n3
	promedio=(n1+n2+n3)/3
	Escribir "El promedio es: " promedio
Fin Funcion

/////////////////////////////////

Funcion funcionDos(nombre,genero)
	Escribir "�Cu�l es su Nombre?: "
	Leer nombre
	Escribir "�Cual es su g�nero? Digite h o m: "
	Leer genero
	Si genero=="h" Entonces
		Mostrar  nombre " Debe entrar al ba�o de Hombres"
	SiNo 
		Mostrar nombre " Debe entrar al ba�o de Mujeres"
	FinSi
FinFuncion

////////////////////////////////

Funcion funcionTres(opcion1,opcion2)
	funcionDos(nombre,genero)
	Escribir "�Desea utilizar los servicios higienicos?: "
	Leer opcion1
	Si opcion1=="si" Entonces
			Escribir "�Va a ocupar el ba�o o la ducha?"
			Leer respuesta
			Si respuesta=="ba�o" Entonces
				mostrar "Debe pagar $250 por su uso"
				SiNo mostrar "Debe pagar $2.500 por su uso"
			FinSi
	SiNo Escribir "Gracias vuelva luego"
	FinSi	
FinFuncion

////////////////////////////////////

Funcion funcionCuatro(num)
	Escribir "Favor ingresar un n�mero del 1 al 10: "
	Leer num
	Segun num Hacer
		1: Escribir "UNO"
		2: Escribir "DOS"
		3: Escribir "TRES"	
		4: Escribir "CUATRO"	
		5: Escribir "CINCO"	
		6: Escribir "SEIS"
		7: Escribir "SIETE"
		8: Escribir "OCHO"
		9: Escribir "NUEVE"
		10: Escribir "DIEZ"	
	FinSegun
FinFuncion

////////////////////////////////////////
//Ingresar N n�meros, detener el ingreso al digitar un cero, 
//terminado el proceso mostrar la cantidad de n�meros ingresados
//excluyendo el 0, finalmente, calcular el promedio de estos 
//n�meros.
Funcion funcionCinco(Nu)
	contador=0
	suma=0
	Escribir "Favor ingresar un n�mero: "
	Leer Nu
	Mientras Nu!=0
		Leer Nu
		suma=suma+Nu
		contador=contador+1
		
	FinMientras
	Escribir "La cantidad de n�meros ingresados es: " contador
	Escribir "El promedio de los n�meros ingresados es: " suma/contador
	
FinFuncion

//////////////////////////////
//Ingresar N nombres con �J�, cuando ingrese el nombre "Juan" 
//me diga �Ganaste� y muestre la cantidad de intentos antes de 
//haber ganado.
Funcion funcionSeis(nombres)
	contador=0
	Repetir
		Escribir "Ingresa un nombre que comience con J: "
		Leer nombres
		contador=contador+1
	Hasta Que nombres=="Juan"
	
	Si nombres=="Juan"
		Escribir "Ganaste"
		Escribir "La cantidad de intentos antes de ganar fu� de: " contador-1
	FinSi	
FinFuncion

///////////////////////////////////////////////
//Para un m�ximo de 10 personas preguntar su nombre y mostrar los
//que repiten m�s de 1 vez, en caso que los nombres no se repitan
//mostrar que no existen nombres repetidos

Funcion funcionSiete(arregloNombres)
	
	
	arregloNombres[10]
	
	Para i=0 hasta 9 Con Paso 1 Hacer
		Escribir "�Cu�l es su nombre?: "
		Leer datos
		Si arregloNombres[i]!= arregloNombres[i+1] Entonces
			Escribir "NO existen nombres repetidos"
		FinSi
	FinPara
FinFuncion

////////////////////////////////////////
//Pedir el tama�o de un arreglo en el cual debo ingresar la lista
//de Talentos Digitales Full Satck Java para luego desplegarlos 
//en pantalla con un m�ximo de 5 alumnos por l�nea

Funcion funcionOcho(arregloFS)
	 
	Escribir "Indicar dimensi�n del arreglo a crear"
	Leer n
	Dimension arregloFS[n]
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Escribir "Ingresar nombre participante: "
		Leer participante
	FinPara
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Mostrar arregloFS[i]
		Para i=5 Hasta 9 Con Paso 1 Hacer
			Mostrar arregloFS[i]
			Para i=10 Hasta 14 Con Paso 1 Hacer
				Mostrar arregloFS[i]
				Para i=15 Hsta 19 Con Paso 1 Hacer
					Mostrar arregloFS[i]
				FinPara
			FinPara
		FinPara
FinFuncion
////////////////////////////////////////////////////////
//Ingresar nombre, apellido, fono y email de cada participante 
//del curso Full Satck Java Trainee, mostrar todos los datos de 
//cada alumno en 1 l�nea

Funcion funcionNueve(u)
	Definir arregloFS9 como numerico
	u=arregloFS9
	
	Definir x como numerico
	Definir z como numerico
	
	Dimension arreglo[25,25]
	
	Para z=0 Hasta 24 Con Paso 1 Hacer
		Para x=0 Hasta 24 Con Paso 1 Hacer
			Para u=0 hasta 24 con Paso 1 Hacer
				Para w=0 Hasta 24 Con Paso 1 Hacer
			
			Escribir arreglo[x,z]
	FinPara
	
FinFuncion
///////**************************************////////////////////


Algoritmo Evaluacion
	
	Escribir "Elija una opci�n del Men� entre 1 y 9: "
	
	Segun num Hacer
		1: Escribir "Eligio la FuncionUno"
		2: Escribir "Eligio la FuncionDos"	
		3: Escribir "Eligio la FuncionTres"	
		4: Escribir "Eligio la FuncionCuatro"	
		5: Escribir "Eligio la FuncionCinco"
		6: Escribir "Eligio la FuncionSeis"
		7: Escribir "Eligio la FuncionSiete"
		8: Escribir "Eligio la FuncionOcho"
	    9: Escribir "Eligio la FuncionNueve"
	FinSegun
	
	
	
	
FinAlgoritmo



