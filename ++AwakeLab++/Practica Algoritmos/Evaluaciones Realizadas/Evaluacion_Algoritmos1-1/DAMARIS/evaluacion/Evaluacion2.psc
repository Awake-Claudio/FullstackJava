SubProceso Secuencial()
	Definir n1, n2, n3 como Entero;
	Definir prom como Real;
	Escribir 'Ingrese el Número 1';
	leer n1;
	Escribir 'Ingrese el Número 2';
	leer n2;
	Escribir 'Ingrese el Número 3';
	leer n3;
	prom<-(prom+n1+n2+n3)/3;
	
	Escribir 'El promedio de los números ingresados es el siguiente: ',prom;
	
FinSubProceso

SubProceso CondicionalSiEntonces()
	//En un lugar tradicional antiguo se pedirá 
	//Nombre y Género de la persona, siendo el género determinante para derivarlo al baño de mujeres u hombres.
	Definir N, G como Caracter;
	Escribir 'Ingrese el Nombre de la Persona'
	Leer N;
	Escribir 'Ingrese el Género de la Persona'
	Escribir 'Favor escribir Mujer u Hombre'
	Leer G;
	Si G=='Mujer'
		Escribir 'Favor Ingresar al Baño de Mujeres';
	FinSi
	Si G=='Hombre'
		Escribir 'Favor Ingresar al Baño de Hombres';
	FinSi
	Si G<>'Mujer' y G<>'Hombre'
		Escribir 'Favor Ingrese una de las opciones válidas'
	FinSi
	
FinSubProceso

SubProceso Anidado()
	// Considerar función 2, y adicionar cobro de $250 si desea utilizar 
	//el baño o $ 2.500 si desea utilizar la ducha.
	Definir N, G como Caracter;
	Definir R1, R2 como Entero;
	Escribir 'Ingrese el Nombre de la Persona'
	Leer N;
	Escribir 'Ingrese el Género de la Persona'
	Escribir 'Favor escribir Mujer u Hombre'
	Leer G;
	//Escribir 'Desea Utilizar el Baño? Seleccione 1 para Si y 2 Para No'
	//Leer R1;
	//Escribir 'Desea Utilizar la Ducha? Seleccione 1 para Si y 2 Para No'
	//Leer R2;
	//Si G=='Mujer' Entonces
	//Segun R1
	//1: 
	//Escribir 'Favor Ingresar al Baño de Mujeres, el costo será de $250, solo baño';
	//2: 
	//Escribir 'Favor Ingresar al Baño de Mujeres';
	//FinSegun
	//	Segun R2
	//		1:
	//			Escribir 'Favor Ingresar al Baño de Mujeres, el costo será de $2500, solo ducha';
	//		2:
	//			Escribir 'Favor Ingresar al Baño de Mujeres';
	//	FinSegun
	//Escribir 'Ingrese Valores Correctos'
	//	FinSi
	//Si R1<>'Si' y R2<>'No'
	//Escribir 'Favor Ingrese una de las opciones válidas'
	//FinSi
	//Si G=='Mujer' y R1=1
	//Escribir 'Favor Ingresar al Baño de Mujeres, el costo será de $250, solo baño';
	//SiNo
	//Escribir 'Favor Ingresar al Baño de Mujeres, el costo será de $2500 por ducha';
	//FinSi
	//	Si G=='Hombre' Entonces
	//		Segun R1
	//			1: 
	//				Escribir 'Favor Ingresar al Baño de Hombres, el costo será de $250, solo baño';
	//			2: 
	//				Escribir 'Favor Ingresar al Baño de Hombres';
	//		FinSegun
	//		Segun R2
	//			1:
	//				Escribir 'Favor Ingresar al Baño de Hombres, el costo será de $2500, solo ducha';
	//			2:
	//				Escribir 'Favor Ingresar al Baño de Hombres';
	//		FinSegun
	//SiNo
	//Escribir 'Ingrese Valores Correctos'
	//	FinSi
	Si G<>'Mujer' y G<>'Hombre'
		Escribir 'Favor Ingrese una de las opciones válidas'
	FinSi
	
	
	
FinSubProceso

SubProceso Condicional() 
	Definir num como Entero;
	Repetir
		Escribir 'Ingrese un número del 1 al 10'
		Leer num;
		Segun num
			1: Escribir 'El Número es Uno';
			2: Escribir 'El Número es Dos';
			3: Escribir 'El Número es Tres';
			4: Escribir 'El Número es Cuatro';
			5: Escribir 'El Número es Cinco';
			6: Escribir 'El Número es Seis';
			7: Escribir 'El Número es Siete';
			8: Escribir 'El Número es Ocho';
			9: Escribir 'El Número es Nueve';
			10: Escribir 'El Número es Diez';
		FinSegun
	Hasta Que num>0 y num<11
FinSubProceso

SubProceso RepetitivaMientras()
	Definir num4 Como Entero;
	//Ingresar N números, detener el ingreso al digitar un cero, terminado el proceso mostrar 
	//la cantidad de números ingresados excluyendo el 0, finalmente, calcular el promedio de estos números.
	Escribir 'Ingrese el número que desea';
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
	//Ingresar N nombres con “J”, 
	//cuando ingrese el nombre "Juan" me diga “Ganaste” y muestre la cantidad de intentos antes de haber ganado.
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
	//Para un máximo de 10 personas preguntar su nombre y 
	//mostrar los que repiten más de 1 vez, en caso que los nombres no se repitan mostrar que no existen nombres repetidos
	Para i=0 hasta 10-1 con paso 1 Hacer
		Escribir 'Ingrese su Nombre'
		Leer Nombre7;
	FinPara
	//Para i=0 hasta 10-1 con paso 1 Hacer
		//Si Nombre7==aux7 Entonces
		//Escribir 'El nombre: ', Nombre7, ' se repite';
		//Si Nombre7<>Nombre7 entonces
		//	Escribir 'Ningún nombre se repitió'
		//FinSi
	//FinSi
//FinPara
	
	
FinSubProceso ------aqui quede

SubProceso ArregloSimple()
	Definir cant Como Entero;
	//Pedir el tamaño de un arreglo en el cual debo ingresar la lista de Talentos Digitales Full Satck Java 
	//para luego desplegarlos en pantalla con un máximo de 5 alumnos por línea
	Escribir 'Ingrese la Cantidad de Alumnos'
	Leer cant;
	Dimension Alumnos[cant];
	Para i=0 hasta cant-1 con paso 1 Hacer
		Escribir 'Ingrese el nombre del Alumno Nº: ',i+1;
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
	//Full Satck Java Trainee, mostrar todos los datos de cada alumno en 1 línea
	Escribir 'Ingrese cantidad de Alumnos'
	Leer cant8;
	Dimension Alumnos8[cant8]
	
FinSubProceso

Algoritmo Evaluacion
	Repetir
        //Menu
        Limpiar Pantalla
        Escribir "Menú Evaluación Curso FULL STACK JAVA TRAINEE"
        Escribir "--- 1) Secuencial"
        Escribir "--- 2) Condicional Si Entonces"
        Escribir "--- 3) Condicional Si Entonces Anidado"
        Escribir "--- 4) Condicional Según"
        Escribir "--- 5) Repetitiva Mientras"
		Escribir "--- 6) Repetitiva Repetir"
		Escribir "--- 7) Repetitiva Para"
		Escribir "--- 8) Arreglo Simple"
		Escribir "--- 9) Arreglo Bidimensional"
		Escribir "--- 10) Salir"
		
        //Opcion
        Escribir "Seleccione la Opción a Visualizar: "
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
                Escribir 'Está saliendo del programa'
            De otro modo:
                Escribir "Esta Opción no se encuentra dentro del Menú"
        FinSegun
        Escribir "Presione Enter Para Volver al Menú"
        Esperar Tecla
    Hasta Que alt=10
	
FinAlgoritmo
