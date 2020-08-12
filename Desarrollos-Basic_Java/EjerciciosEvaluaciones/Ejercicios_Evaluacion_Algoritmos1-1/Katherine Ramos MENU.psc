SubAlgoritmo  funcion1
	Escribir "Ingresa dato"
	Leer n1
	Escribir "Ingresa dato"
	Leer n2
	Escribir "Ingresa dato"
	Leer n3
	
	suma=n1+n2+n3
	promedio=suma/3
	mostrar promedio
FinSubAlgoritmo

subAlgoritmo funcion2
	dimension Nombres[5]
	dimension Genero[5]
	
	definir Nombres, Genero como texto
	definir i,j como entero
	i=0
	j=0
	c1=0
	c2=0
	Repetir
		Escribir "Ingrese nombre ",i+1
		leer nom
		Escribir "Ingrese género (M=Masculino,F=Femenino) ", j+1
		leer gen
		Si gen= "M" escribir "Baño de hombres"
			c1=c1+1
		SiNo escribir "Baño de Mujeres"
			c2=c2+1
		FinSi
		i=i+1
		j=j+1
	Hasta que i=5 y j=5
	
	Escribir "la cantidad de hombres es ",c1
	Escribir "la cantidad de mujeres es ",c2
	
finsubAlgoritmo

SUBAlgoritmo funcion4
	Escribir "Escribe un numero entre 1 y 10"
	Leer n
	Segun n Hacer
		1:
			Escribir "uno"
		2:
			Escribir "dos"
		3:
			Escribir "tres"
		4:
			Escribir "cuatro"
		5:
			Escribir "cinco"
		6:
			Escribir "seis"
		7:
			Escribir "siete"
		8:
			Escribir "ocho"
		9:
			Escribir "nueve"
		10:
			Escribir "diez"
		De Otro Modo:
			Escribir "Recuerde ingresar numero entre 1-10"
	Fin Segun
FINSUBAlgoritmo

subAlgoritmo funcion5
	dimension Digitos[n]
	definir digitos como entero
	definir c,suma como enteros
	c=0
	suma=0
	
	Repetir
		escribir "Ingrese un dígito"
		leer num
		c=c+1
		suma=suma+1
	Hasta Que num=0
	
	Escribir "el promedio es igual a ", suma/c
	
	
FinsubAlgoritmo

subAlgoritmo funcion6
	c=0
	Repetir
		Escribir "Ingrese nombre con J"
		leer nombre
		c=c+1
	Hasta Que nombre = "juan"
	Escribir "Ganaste a los ", c, " intentos"
FinsubAlgoritmo

subAlgoritmo funcion7
	Dimension nombres[10] 
	c=0
	Para x=0 hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese su nombre"
		leer nom
	Fin Para
	
	Para i=0 hasta 9 Con Paso 1 Hacer
		si nombres[x]=nombres[x+1] entonces
			c=c+1
		FinSi
	FinPara
	
	Escribir "los nombres se repitieron ", c, " veces"
	
FinsubAlgoritmo

subAlgoritmo funcion8
	
	Escribir "Ingresar cantidad de alumnos"
	definir n Como Entero
	leer n
	Dimension alumnos[n]
	definir x como entero
	
	Para x=0 Hasta n-1 Con Paso 1 Hacer
		
		Escribir "Ingresar nombre del alumno "
		leer nom
		alumnos[x]<-nom		
	Fin Para
	
	Mientras x=5 Hacer
		mostrar alumnos[x]
	Fin Mientras
	
FinsubAlgoritmo

subAlgoritmo funcion9
	Dimension alumnos[10,10,10,10] 
	
	definir i,j,k,l como entero
	
	definir nom,ape,fono,mail como caracter
	Para i=0 hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese su nombre"
		leer nom
		Para j=0 Hasta 9 Con Paso 1 Hacer
			Escribir "Ingrese su apellido"
			leer ape
			Para k=0 Hasta 9 Con Paso 1 Hacer
				escribir "Ingrese su telefono"
				leer fono
				Para l=0 Hasta 9 Con Paso 1 Hacer
					escribir "Ingrese su mail"
					leer mail
				Fin Para
			Fin Para
		Fin Para
	Fin Para
FinsubAlgoritmo

Algoritmo menu
	escribir "Ingrese numero del 1 al 9"
	leer x
	Segun x Hacer
		1:
			funcion1
		2:
			funcion2
		3:
			Escribir "no se encuentra"
		4:
			funcion4
		5:
			funcion5
		6:
			funcion6
		7:
			funcion7
		8:
			funcion8
		9:
			funcion9
			
		De Otro Modo:
			Escribir "ingrse una opción válida"
	finsegun
	
	
	
FinAlgoritmo
