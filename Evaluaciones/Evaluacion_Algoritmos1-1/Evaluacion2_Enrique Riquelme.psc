Algoritmo Principal
	
	
	Escribir "Menú "
	Escribir "   1.Secuencial"
	Escribir "   2.Condicion si entonces" 
	Escribir "   3. Condicional Si entonces anidado"
	Escribir "   4. Condicional segun"
	Escribir "   5. Repetitivas Mientras"
	Escribir "   6. Repetitiva Repetir"
	Escribir "   7. Repetitiva Para"
	Escribir "   8. Arreglo simple"
	Escribir "   9. Arreglo Bidimencional"
	Escribir "   10.salir
	
	
	Escribir "Elija una opción (1-10): "
	Leer OP

	
	subAlgoritmo funcion1
		suma<-0
		
		Para i<-1 Hasta 3 Hacer
			Escribir "Ingrese el numero ",i,":"
			Leer numero
			suma<-suma+numero
		FinPara
		prom<-suma/3
		
		Escribir "El promedio de los tres numeros es: ",prom
		
    FinsubAlgoritmo
	
	
	subalgoritmo Funcion2
	
		definir F,M como caracter
		escribir "ingrese su nombre" 
		leer nombre
		escribir "ingrese su genero, F(femenino) o M(masculino)"
		leer gen
		
		si gen=F Entonces
			escribir "Por favor " nombre " Vaya al baño de mujeres"
		SiNo
			escribir "Por favor " nombre " Vaya al baño de hombres"
		FinSi
		
    FinsubAlgoritmo


	subAlgoritmo Funcion3
		Funcion2
		
		escribir "Quiere ocupar solo baño ??, escribe B"
		leer baño
		escribir "Debes pagar $ 250"
		
		escribir "Quieres ocupar ducha ??, escribe D"
		leer ducha
		escribir "Debes pagar $ 2500"
		
    FinSubAlgoritmo

	
	SubAlgoritmo Funcion4
		
		Repetir
			Limpiar Pantalla
			
			Escribir "Elija una opción (1-10): "
			Leer OP
			
			Segun OP Hacer
				1:Escribir " Diez"
				2:Escribir " Dos"				
				3:Escribir " Tres"
				4:Escribir "Cuatro"
				5:Escribir " Cinco"
				6:Escribir " Seis"
				7:Escribir "Siete"
			    8:Escribir " Ocho"
				9:Escribir " Nueve"
				10:Escribir " Diez"
				De otro modo:
					Escribir "Opción de 1 a 10"
			FinSegun
			Escribir "Presione enter para continuar"
			Esperar Tecla
		Hasta Que OP=10
		
    FinsubAlgoritmo


	SubAlgoritmo Funcion5
		Definir num,sum, acum como entero
		sum=0
		acum=1
		
		Escribir "Ingrese un numero cualquiera:"
		Leer num
		Mientras num<>0 hacer
			sum=sum+num
			acum=acum+1
			prom=sum/acum
			
			escribir "La suma de sus numeros es " sum
			escribir "El promedio es " prom
		FinMientras
    FinsubAlgoritmo	
	
	SubAlgoritmo funcion6
		definir nom como caracter
		
		Repetir
			
			Limpiar Pantalla
			
			Escribir "Ingresa nombre con J "
			Leer nom
			
			si nom=Juan
				escribir "Ganaste"
			sino
				Escribir "Escribe otro nombre con J"
			FinSi
			Escribir "Presione enter para continuar"
			Esperar Tecla
			
		Hasta Que nom=Juan
		
    FinsubAlgoritmo
	
	
	SubAlgoritmo funcion7
		
		Dimension[10]
		Escribir "Ingrese Nombre, ingrese blanco para terminar"
		
		cant=0
		Leer nombre
		Mientras nombre<>"" Hacer
			cant<-cant+1
			lista[cant]=nombre
			Repetir 
				Leer nombre
				se_repite<-Verdadero
				Para i<-1 Hasta cant Hacer
					Si nombre=lista[i] Entonces
						se_repite<-Verdadero
					FinSi
				FinPara
			Hasta Que NO se_repite
		FinMientras
finsubalgoritmo

	
FinProceso

