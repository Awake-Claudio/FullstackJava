Algoritmo Evaluacion
	menuPrincipal()
FinAlgoritmo

//MENU DE INICIO
Funcion menuPrincipal()
	definir opcionSel Como Entero
	Escribir "-- MENU --"
	Escribir ""
	Escribir "1.Secuencial:"
	Escribir "2.Condicional Si Entonces:"
	Escribir "3.Condicional Si Entonces anidado:"
	Escribir "4.Condicional Según:"
	Escribir "5.Repetitiva Mientras:"
	Escribir "6.Repetitiva Repetir:"
	Escribir "7.Repetitiva Para:"
	Escribir "8.Arreglo Simple:"
	Escribir "9.Arreglo Bidimensional:"
	Escribir "10.Salir"
	Escribir "--      --"
	Leer opcionSel
	Mientras (opcionSel<1 || opcionSel>10)
		Escribir "-- Ingrese nuevamente! --"
		Leer opcionSel
	FinMientras
	Segun opcionSel Hacer
		1:
			one()
		2:
			two()
		3:
			three("")
		4:
			four()
		5:
			five()
		6:
			six()
		7:
			seven()
		8:
			eight()
		9:
			nine()
		De Otro Modo:
			Escribir "Bye bye"
	Fin Segun
FinFuncion

//Funcion Menu Secuencial/Opcion 1
Funcion one
	Definir suma, n, contador Como Entero
	contador = 1
	Escribir "-- Menu 1 --"
	Mientras (contador<=3)
		Escribir "Ingrese numero ",contador
		Leer n
		suma = suma + n
		contador = contador + 1
	FinMientras
	Escribir "El promedio es: ",(suma/(contador-1))
	menuPrincipal()
FinFuncion

//Funcion Condicional Si Entonces/Opcion 2
Funcion two
	Escribir "-- Menu 2 --"
	Definir generoCliente Como Caracter
	Dimension datosCliente[2]
	datosCliente[0] = ""
	datosCliente[1] = ""
	Escribir "Ingrese su nombre:"
	Leer datosCliente[0]
	Escribir "Ingrese su genero:"
	Leer generoCliente
	datosCliente[1] = Minusculas(generoCliente)
	Si ((datosCliente[1]=="femenino") || (datosCliente[1]=="mujer"))
		Escribir "Baño de Mujeres"
		three(datosCliente[0])
	SiNo
		Escribir "Baño de Hombres"
		three(datosCliente[0])
	FinSi
	menuPrincipal()
FinFuncion

//Funcion Condicional Si Entonces anidado/Opcion 3
Funcion three(genero)
	Escribir "-- Menu 3 --"
	Definir opciones Como Entero
	Si (genero=="")
		Escribir "Por favor ingresar datos"
		two()
	SiNo
		Escribir "¿Que desea utilizar?"
		Escribir "1. Baño"
		Escribir "2. Ducha"
		Leer opciones
		Mientras (opciones<1 || opciones>2)
			Escribir "-- Ingrese nuevamente! --"
			Leer opciones
		FinMientras
		Escribir ""
		Si (opciones==1)
			Escribir "Valor de $250"
		SiNo
			Escribir "Valor de $2.500"
		FinSi
	FinSi
	menuPrincipal()
FinFuncion

//Funcion Condicional Segun/Opcion 4
Funcion four
	Escribir "-- Menu 4 --"
	Definir numIngresado Como Entero
	Para n<-1 Hasta 10 Con Paso 1
		Escribir n,". Ingrese un numero entre 1 y 10:"
		Leer  numIngresado
		Segun numIngresado Hacer
			1:
				Escribir "UNO"
			2:
				Escribir "DOS"
			3:
				Escribir "TRES"
			4:
				Escribir "CUATRO"
			5:
				Escribir "CINCO"
			6:
				Escribir "SEIS"
			7:
				Escribir "SIETE"
			8:
				Escribir "OCHO"
			9:
				Escribir "NUEVE"
			10:
				Escribir "DIEZ"
			De Otro Modo:
				n=n-1;
				Escribir "¡Ingrese numeros validos!"
		Fin Segun
	FinPara
	menuPrincipal()
FinFuncion

//Funcion Repetitiva Mientras/Opcion 5
Funcion five
	Escribir "-- Menu 5 --"
	Definir numIngresado, contador, suma Como Entero
	contador = 0
	suma = 0
	Escribir "Ingrese un numero"
	Leer numIngresado
	Si numIngresado==0
		Escribir "¡Proceso finalizado!"
		Escribir "Se ingresaron: 0 numeros"
		Escribir "El promedio es: 0"
	SiNo
		suma = suma + numIngresado
		contador = contador+1		
		Mientras (numIngresado!=0)
			Escribir "Ingrese un numero"
			Leer numIngresado
			suma = suma + numIngresado
			contador = contador+1
		FinMientras
		contador=contador-1
		Escribir "¡Proceso finalizado!"
		Escribir "Se ingresaron: ",contador," numeros"
		Escribir "El promedio es: ",(suma/contador)
	FinSi
	menuPrincipal
FinFuncion

//Funcion Repetitiva Repetir/Opcion 6
Funcion six
	Escribir "-- Menu 6 --"
	Definir nombre Como Caracter
	Definir contador Como Entero
	contador=0
	Repetir
		Escribir "Ingrese un nombre"
		Leer nombre
		contador=contador+1
	Hasta Que (Minusculas(nombre)=="juan")
	Escribir "¡Ganaste!"
	Escribir "Intentaste ",contador," veces"
	menuPrincipal()
FinFuncion

//Funcion Repetitiva Para/Opcion 7
Funcion seven
	Escribir "-- Menu 7 --"
	Dimension nombres[10]
	Definir nombre, nombreRepeat Como Caracter
	nombreRepeat=""
	Para n<-0 Hasta 9 Con Paso 1
		Escribir "Ingrese nombre ",(n+1)
		Leer nombre
		nombres[n]<-Minusculas(nombre)
	FinPara
	Definir contador Como Entero
	Definir validarRepeat Como Logico
	validarRepeat=Falso
	
	contador=0
	Para n1<-0 Hasta 9 Con Paso 1
		Para n2<-0 Hasta 9 Con Paso 1
			Si nombreRepeat==""
				Si (nombres[n1]==nombres[n2])
					contador=contador+1
				FinSi
				Si (contador!=0)
					
				FinSi
			FinSi
		FinPara
		Si (contador>1)
			validarRepeat=Verdadero
			Escribir "El nombre ",nombres[n1]," se repite ",contador," veces"
			nombreRepeat=nombres[n1]
		FinSi
		contador=0
	FinPara
	Si validarRepeat==Falso
		Escribir "No se repiten nombres"
	FinSi
	menuPrincipal()
FinFuncion

//Funcion Arreglo Simple/Opcion 8
Funcion eight
	Escribir "-- Menu 8 --"
	Definir sizeArreglo Como Entero
	Definir nombre Como Caracter
	
	Escribir "Ingrese el tamaño que tendrá el arreglo"
	Leer sizeArreglo
	Dimension alumnos[sizeArreglo]
	Para n<-0 Hasta sizeArreglo-1 Con Paso 1
		Escribir "Ingrese nombre ",n+1,":"
		Leer nombre
		alumnos[n]<-nombre
	FinPara
	Para  n1<-0 Hasta sizeArreglo-1 Con Paso 1
		Si (n1+4)<sizeArreglo-1
			Mostrar alumnos[n1]," - ", alumnos[n1+1]," - ", alumnos[n1+2]," - ", alumnos[n1+3]," - ", alumnos[n1+4]
			n1=n1+5
		FinSi
		Si (n1+4)<sizeArreglo-1
			Mostrar alumnos[n1]," - ", alumnos[n1+1]," - ", alumnos[n1+2]," - ", alumnos[n1+3]
			n1=n1+4
		FinSi
		Si (n1+3)<sizeArreglo-1
			Mostrar alumnos[n1]," - ", alumnos[n1+1]," - ", alumnos[n1+2]
			n1=n1+3
		FinSi
		Si (n1+2)<sizeArreglo-1
			Mostrar alumnos[n1]," - ", alumnos[n1+1]
			n1=n1+2
		FinSi
		Si n1<sizeArreglo-1
			Mostrar alumnos[n1]
		FinSi
	FinPara
	menuPrincipal()
FinFuncion

//Funcion Arreglo Bidimesional/Opcion 9
Funcion nine
	Escribir "-- Menu 9 --"
	Definir n Como Entero
	Escribir "Ingrese tamaño del listado"
	Leer n
	Dimension alumnos[n,4]
	Para n1<-0 Hasta n-1 Con Paso 1
		Escribir "Ingrese nombre del alumno ",n1+1,":"
		Leer alumnos[n1,0]
		Escribir "Ingrese apellido del alumno ",n1+1,":"
		Leer alumnos[n1, 1]
		Escribir "Ingrese fono del alumno ",n1+1,":"
		Leer  alumnos[n1,2]
		Escribir "Ingrese email del alumno ",n1+1,":"
		Leer alumnos[n1,3]
	FinPara
	Escribir "Los Participantes del curso son:"
	Escribir ""
	Para n2<-0 Hasta n-1 Con Paso 1
		Mostrar "Nombre: ", alumnos[n2,0],", Apellido: ",alumnos[n2,1],", Fono: ",alumnos[n2,2], ", Email: ",alumnos[n2,3]
	FinPara
	menuPrincipal()
FinFuncion




