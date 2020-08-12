SubAlgoritmo Secuencial
	Definir n,i,prom,acu como Entero;
	Dimension n[3];
	acu<-0;
	prom<-0;
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Escribir 'Digite numero';
		Leer n[i];
		acu=acu+n[i];
	Fin Para
	prom<-acu/3;
	Escribir 'El promedio de los numeros es: ',+prom;
FinSubAlgoritmo

SubAlgoritmo CondicionalSi
	Definir nom,sex Como Caracter;
	Escribir 'Digite su nombre';
	Leer nom;
	Repetir
		Escribir 'Digite su sexo'
		Leer sex;
		Escribir 'Señor/a :',+nom;
		Si sex='hombre' Entonces
			Escribir 'Debe ir al baño de Hombres';
		FinSi
		Si sex='mujer' Entonces
			Escribir 'Debe ir al baño de Mujeres';
		SiNo
			Escribir 'ERROR: Digite un sexo correcto'
		Fin Si
	Hasta Que sex='hombre' o sex='mujer';
FinSubAlgoritmo

SubAlgoritmo CondicionalSiAnidado
	Definir n como caracter
	Escribir '¿Va a usar baño o ducha?';
	Leer n;
	Si n='baño' Entonces
		Escribir 'Costo: $250';
	SiNo
		Escribir 'Costo: $2000';
	Fin Si
FinSubAlgoritmo

SubAlgoritmo CondicionalSegun
	Definir n Como Entero;
	Repetir
		Escribir 'Digite un numero de 1 a 10';
		Leer n;
		Segun n Hacer
			1:
				Escribir 'Uno';
			2:
				Escribir 'Dos';
			3:
				Escribir 'Tres';
			4:
				Escribir 'Cuatro';
			5:
				Escribir 'Cinco';
			6:
				Escribir 'Seis';
			7:
				Escribir 'Siete';
			8:
				Escribir 'Ocho';
			9:
				Escribir 'Nueve';
			10:
				Escribir 'Diez';
			De Otro Modo:
				Escribir 'ERROR: Digite un numero de 1 a 10';
		Fin Segun
	Hasta Que n>=1 y n<=10
FinSubAlgoritmo

SubAlgoritmo RepetitivaMientras
	Definir n,acu,suma como entero
	Definir prom como real;
	acu<-0;
	Escribir 'Digite un numero, cuando desee parar de ingresar digite 0';
	suma<-0;
	prom<-0;
	Repetir
		Leer n
		acu=acu+1;
		Si n=0 Entonces
			acu=acu-1;
		SiNo
			suma=suma+n;
		Fin Si
	Hasta Que n=0
	prom=suma/acu;
	Escribir 'Cantidad de numeros ingresados: ',+acu;
	Escribir 'Promedio de numeros ingresados: ',+prom;
FinSubAlgoritmo

SubAlgoritmo RepetitivaRepetir
	Definir j Como Caracter
	Definir acu Como Entero
	acu<-0;
	Repetir
		Escribir 'Digite un nombre que comience con J';
		Leer j;
		acu=acu+1;
		Si j='juan' o j='Juan' Entonces
			Escribir 'GANASTE!';
		Fin Si
		Escribir 'Nombres ingresados: ',+acu;
	Hasta Que j='juan' o j='Juan'
FinSubAlgoritmo

SubAlgoritmo RepetitivaPara
	Definir i,x Como Entero
	Definir n Como Caracter
	Dimension n[10]
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir 'Digite Nombre';
		Leer n[i];
		Para x<-1 Hasta 9 Con Paso 1 Hacer
			Si n[i]=n[x+1] Entonces
				Escribir 'Hay coincidencia de nombre';
			SiNo
				Escribir 'No hay coincidencia de nombre';
			Fin Si
		Fin Para
	Fin Para
FinSubAlgoritmo

SubAlgoritmo ArregloSimple
	Definir n,i,x Como Entero
	Definir nom Como Caracter
	Escribir '¿Cuantos nombres desea ingresar?';
	Leer x;
	Dimension nom[x];
	Para i<-1 Hasta x Con Paso 1 Hacer
		Escribir 'Ingrese nombre del Talento Digital N°',i;
		Leer nom[i];
	Fin Para
	Para i<-1 Hasta x Con Paso 1 Hacer
		Escribir 'Nombres Talentos Digitales: ',nom[i];
	Fin Para
FinSubAlgoritmo

SubAlgoritmo ArregloBidimensional
	Definir nom,ape,mail como Caracter
	Definir i, fono,x Como Entero
	Escribir 'Cantidad de Participantes';
	Leer x;
	Dimension nom[x];
	Dimension ape[x];
	Dimension fono[x];
	Dimension mail[x];
	Para i<-1 Hasta x Con Paso 1 Hacer
		Escribir 'Digite el Nombre';
		Leer nom[i];
		Escribir 'Digite el Apellido';
		Leer ape[i];
		Escribir 'Digite el Fono';
		Leer fono[i];
		Escribir 'Digite el Mail';
		Leer mail[i];
		Escribir 'Alumno N°',i,': ',nom[i],' ',ape[i],' ',fono[i],' ',mail[i];
	Fin Para
FinSubAlgoritmo

Algoritmo Principal
	Definir op Como Entero
	Repetir
		Escribir '----------MENÚ PRINCIPAL--------';
		Escribir 'Digite una Opcion para Continuar';
		Escribir '1. Secuencial';
		Escribir '2. CondicionalSiEntonces';
		Escribir '3. CondicionalSiAnidado';
		Escribir '4. CondicionalSegun';
		Escribir '5. RepetitivaMientras';
		Escribir '6. RepetitivaRepetir';
		Escribir '7. RepetitivaPara';
		Escribir '8. ArregloSimple';
		Escribir '9. ArregloBidimensional';
		Escribir '10. Salir';
		Leer op;
		Segun op Hacer
			1:
				Secuencial
			2:
				CondicionalSi
			3:
				CondicionalSiAnidado
			4:
				CondicionalSegun
			5:
				RepetitivaMientras
			6:
				RepetitivaRepetir
			7:
				RepetitivaPara
			8:
				ArregloSimple
			9:
				ArregloBidimensional
			10:
				Escribir 'ADIOS!'
			De Otro Modo:
				Escribir 'Digite una opcion valida';
		Fin Segun
	Hasta Que op=10;
FinAlgoritmo