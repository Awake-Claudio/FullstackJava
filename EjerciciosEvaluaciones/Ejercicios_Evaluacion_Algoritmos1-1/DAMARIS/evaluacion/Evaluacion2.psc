SubProceso Secuencial()
	Definir n1, n2, n3 como Entero;
	Definir prom como Real;
	Escribir 'Ingrese el N�mero 1';
	leer n1;
	Escribir 'Ingrese el N�mero 2';
	leer n2;
	Escribir 'Ingrese el N�mero 3';
	leer n3;
	prom<-(prom+n1+n2+n3)/3;
	
	Escribir 'El promedio de los n�meros ingresados es el siguiente: ',prom;
	
FinSubProceso

SubProceso CondicionalSiEntonces()
	//En un lugar tradicional antiguo se pedir� 
	//Nombre y G�nero de la persona, siendo el g�nero determinante para derivarlo al ba�o de mujeres u hombres.
	Definir N, G como Caracter;
	Escribir 'Ingrese el Nombre de la Persona'
	Leer N;
	Escribir 'Ingrese el G�nero de la Persona'
	Escribir 'Favor escribir Mujer u Hombre'
	Leer G;
	Si G=='Mujer'
		Escribir 'Favor Ingresar al Ba�o de Mujeres';
	FinSi
	Si G=='Hombre'
		Escribir 'Favor Ingresar al Ba�o de Hombres';
	FinSi
	Si G<>'Mujer' y G<>'Hombre'
		Escribir 'Favor Ingrese una de las opciones v�lidas'
	FinSi
	
FinSubProceso

SubProceso Anidado()
	// Considerar funci�n 2, y adicionar cobro de $250 si desea utilizar 
	//el ba�o o $ 2.500 si desea utilizar la ducha.
	Definir N, G como Caracter;
	Definir R1, R2 como Entero;
	Escribir 'Ingrese el Nombre de la Persona'
	Leer N;
	Escribir 'Ingrese el G�nero de la Persona'
	Escribir 'Favor escribir Mujer u Hombre'
	Leer G;
	//Escribir 'Desea Utilizar el Ba�o? Seleccione 1 para Si y 2 Para No'
	//Leer R1;
	//Escribir 'Desea Utilizar la Ducha? Seleccione 1 para Si y 2 Para No'
	//Leer R2;
	//Si G=='Mujer' Entonces
	//Segun R1
	//1: 
	//Escribir 'Favor Ingresar al Ba�o de Mujeres, el costo ser� de $250, solo ba�o';
	//2: 
	//Escribir 'Favor Ingresar al Ba�o de Mujeres';
	//FinSegun
	//	Segun R2
	//		1:
	//			Escribir 'Favor Ingresar al Ba�o de Mujeres, el costo ser� de $2500, solo ducha';
	//		2:
	//			Escribir 'Favor Ingresar al Ba�o de Mujeres';
	//	FinSegun
	//Escribir 'Ingrese Valores Correctos'
	//	FinSi
	//Si R1<>'Si' y R2<>'No'
	//Escribir 'Favor Ingrese una de las opciones v�lidas'
	//FinSi
	//Si G=='Mujer' y R1=1
	//Escribir 'Favor Ingresar al Ba�o de Mujeres, el costo ser� de $250, solo ba�o';
	//SiNo
	//Escribir 'Favor Ingresar al Ba�o de Mujeres, el costo ser� de $2500 por ducha';
	//FinSi
	//	Si G=='Hombre' Entonces
	//		Segun R1
	//			1: 
	//				Escribir 'Favor Ingresar al Ba�o de Hombres, el costo ser� de $250, solo ba�o';
	//			2: 
	//				Escribir 'Favor Ingresar al Ba�o de Hombres';
	//		FinSegun
	//		Segun R2
	//			1:
	//				Escribir 'Favor Ingresar al Ba�o de Hombres, el costo ser� de $2500, solo ducha';
	//			2:
	//				Escribir 'Favor Ingresar al Ba�o de Hombres';
	//		FinSegun
	//SiNo
	//Escribir 'Ingrese Valores Correctos'
	//	FinSi
	Si G<>'Mujer' y G<>'Hombre'
		Escribir 'Favor Ingrese una de las opciones v�lidas'
	FinSi
	
	
	
FinSubProceso

SubProceso Condicional() 
	Definir num como Entero;
	Repetir
		Escribir 'Ingrese un n�mero del 1 al 10'
		Leer num;
		Segun num
			1: Escribir 'El N�mero es Uno';
			2: Escribir 'El N�mero es Dos';
			3: Escribir 'El N�mero es Tres';
			4: Escribir 'El N�mero es Cuatro';
			5: Escribir 'El N�mero es Cinco';
			6: Escribir 'El N�mero es Seis';
			7: Escribir 'El N�mero es Siete';
			8: Escribir 'El N�mero es Ocho';
			9: Escribir 'El N�mero es Nueve';
			10: Escribir 'El N�mero es Diez';
		FinSegun
	Hasta Que num>0 y num<11
FinSubProceso

SubProceso RepetitivaMientras()
	Definir num4 Como Entero;
	//Ingresar N n�meros, detener el ingreso al digitar un cero, terminado el proceso mostrar 
	//la cantidad de n�meros ingresados excluyendo el 0, finalmente, calcular el promedio de estos n�meros.
	Escribir 'Ingrese el n�mero que desea';
	Leer num4;	
	sumar<-0;
	Mientras num4 <> 0 Hacer
        sumar <- sumar + num4
        Escribir "Dime otro numero"
        Leer num4;
		aux<-aux+1;
		Si num4=0 Entonces
			Escribir 'Al ingresar un 0 el programa se finaliza'
			Escribir 'El promedio de los numeros ingresados es: ',sumar/aux;			
		FinSi
    FinMientras
	
FinSubProceso

SubProceso RepetitivaRepetir()
	Definir Nombre como Caracter
	aux6<-0;
	//Ingresar N nombres con �J�, 
	//cuando ingrese el nombre "Juan" me diga �Ganaste� y muestre la cantidad de intentos antes de haber ganado.
	Repetir
		Escribir 'Ingrese Nombres con J'
		Leer Nombre;
		aux6<-aux6+1;
		//SubCadena(J,1,1)
	Hasta Que Nombre=='Juan'
	Escribir 'Ganaste!';
	Escribir 'Hiciste ', aux6 ,' intentos hasta dar con el nombre Juan';
FinSubProceso

SubProceso RepetitivaPara()
	Definir Nombre7 Como Caracter;
	//Para un m�ximo de 10 personas preguntar su nombre y 
	//mostrar los que repiten m�s de 1 vez, en caso que los nombres no se repitan mostrar que no existen nombres repetidos
	Para i=0 hasta 10-1 con paso 1 Hacer
		Escribir 'Ingrese su Nombre'
		Leer Nombre7;
	FinPara
	//Para i=0 hasta 10-1 con paso 1 Hacer
		//Si Nombre7==aux7 Entonces
		//Escribir 'El nombre: ', Nombre7, ' se repite';
		//Si Nombre7<>Nombre7 entonces
		//	Escribir 'Ning�n nombre se repiti�'
		//FinSi
	//FinSi
//FinPara
	
	
FinSubProceso ------aqui quede

SubProceso ArregloSimple()
	Definir cant Como Entero;
	//Pedir el tama�o de un arreglo en el cual debo ingresar la lista de Talentos Digitales Full Satck Java 
	//para luego desplegarlos en pantalla con un m�ximo de 5 alumnos por l�nea
	Escribir 'Ingrese la Cantidad de Alumnos'
	Leer cant;
	Dimension Alumnos[cant];
	Para i=0 hasta cant-1 con paso 1 Hacer
		Escribir 'Ingrese el nombre del Alumno N�: ',i+1;
		Leer Alumnos[i];
		
	FinPara
	//cont=0;
	Para i=0 hasta cant-1 con paso 1 hacer
		
		//cont<-cont+1;
		//Si cont<6
			//Escribir Sin Saltar 'Los Alumnos son: ',Alumnos[i],'---';
			//Si cont=5
				Escribir 'Los Alumnos son: ',Alumnos[i];
			//FinSi
		//FinSi
	FinPara

FinSubProceso

SubProceso ArregloBidimensional()
	//Ingresar nombre, apellido, fono y email de cada participante del curso 
	//Full Satck Java Trainee, mostrar todos los datos de cada alumno en 1 l�nea
	Escribir 'Ingrese cantidad de Alumnos'
	Leer cant8;
	Dimension Alumnos8[cant8]
	
FinSubProceso

Algoritmo Evaluacion
	Repetir
        //Menu
        Limpiar Pantalla
        Escribir "Men� Evaluaci�n Curso FULL STACK JAVA TRAINEE"
        Escribir "--- 1) Secuencial"
        Escribir "--- 2) Condicional Si Entonces"
        Escribir "--- 3) Condicional Si Entonces Anidado"
        Escribir "--- 4) Condicional Seg�n"
        Escribir "--- 5) Repetitiva Mientras"
		Escribir "--- 6) Repetitiva Repetir"
		Escribir "--- 7) Repetitiva Para"
		Escribir "--- 8) Arreglo Simple"
		Escribir "--- 9) Arreglo Bidimensional"
		Escribir "--- 10) Salir"
		
        //Opcion
        Escribir "Seleccione la Opci�n a Visualizar: "
        Leer alt
        
        Segun alt Hacer
            1:
                Secuencial();
            2:
                CondicionalSiEntonces();
            3:
                Anidado();
            4:
                Condicional()
            5:
				RepetitivaMientras()
			6:
				RepetitivaRepetir()
			7:
				RepetitivaPara()
			8:
				ArregloSimple()
			9:
				ArregloBidimensional()
			10:
                Escribir 'Est� saliendo del programa'
            De otro modo:
                Escribir "Esta Opci�n no se encuentra dentro del Men�"
        FinSegun
        Escribir "Presione Enter Para Volver al Men�"
        Esperar Tecla
    Hasta Que alt=10
	
FinAlgoritmo
