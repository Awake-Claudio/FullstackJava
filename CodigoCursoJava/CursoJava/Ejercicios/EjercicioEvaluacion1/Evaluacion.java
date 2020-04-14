package EjercicioEvaluacion1;
//import java.util.*;
import javax.swing.*;

public class Evaluacion {
	// ----- Funciones -----
	public static void Funcion1() {
		int Numeros[] = new int [3];
		Double Promedio =0.0;
		for(int i=0;i<Numeros.length;i++) {
			Numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
			Promedio = Promedio + Numeros[i];
		}
		System.out.println("Suma: "+Promedio);
		
		Promedio = Promedio / Numeros.length;
		
		System.out.println("Primedio: "+Promedio);	
		
	}	
	public static void Funcion2() {
		String[] sexo = {"Seleccione", "Masculino","Femenino"};						// Dominio de valores para seleccionar genero
		String Nombre = JOptionPane.showInputDialog("Ingrese Nombre de Persona");	// ingresar nombre en ventana emergente
		
		String Genero = (String) JOptionPane.showInputDialog(null, "Seleccione genero de la Persona", 
				                 "Servicio Baños Publico", JOptionPane.DEFAULT_OPTION, null, sexo, sexo[0]); // Permite seleccionar genero en ventana emergente
		Persona P = new Persona(Genero,Nombre);
		if (P.Genero=="Masculino") System.out.println("La Persona "+P.Nombre+" se deriva a Baño de Hombres");
		else System.out.println("La Persona "+P.Nombre+" se deriva  a Baño de Mujeres");
	}
	public static void Funcion3() {
		Funcion2();
		String[] tiposervicio = {"Seleccione", "Baño","Ducha"};						// Dominio de valores para seleccionar servicio de baño
		
		String servicio = (String) JOptionPane.showInputDialog(null, "Seleccione Servicio a usar", 
                "Servicio Baños Publico", JOptionPane.DEFAULT_OPTION, null, tiposervicio, tiposervicio[0]); // Permite seleccionar Tipo de servicio del baño en ventana emergente
		if (servicio=="Baño") System.out.println("El valor del servicio "+servicio+" es de: $250");
		else System.out.println("El valor del servicio "+servicio+" es de: $2.500");
	}
	public static void Funcion4() {
		int numero=11;
		while (numero!=0) {													// Mientras el numero ingresado no sea 0...
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 10, use el 0 para salir")); // Leer Nombre ingresado
			System.out.println("El numero ingresado fue: "+numero);
			switch (numero) {												// sentebncia Case
				case 1: System.out.println("El numero ingresado fue el: Uno"); break;
				case 2: System.out.println("El numero ingresado fue el: Dos"); break;
				case 3: System.out.println("El numero ingresado fue el: Tres"); break;
				case 4: System.out.println("El numero ingresado fue el: Cuatro"); break;
				case 5: System.out.println("El numero ingresado fue el: Cinco"); break;
				case 6: System.out.println("El numero ingresado fue el: Seis"); break;
				case 7: System.out.println("El numero ingresado fue el: Siete"); break;
				case 8: System.out.println("El numero ingresado fue el: Ocho"); break;
				case 9: System.out.println("El numero ingresado fue el: Nueve"); break;
				case 10: System.out.println("El numero ingresado fue el: Diez"); break;
				case 0: System.out.println("Bye Bye... vuelva pronto"); break;
				default: System.out.println("Eleccion invalida, vuelva a ingresar una opción entre 1 y 10");
			 }
			}
		
	}
	public static void Funcion5() {
		int numero=1, cant=0;
		double promedio=0.0;
		
		while (numero!=0) {										// mientras el numero no sea 0, repetir
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
			if (numero!=0) {
				promedio=promedio+numero;						// Usar promedio para sumar
				cant++;											// contar iteraciones
			}
			System.out.println("Numero ingresado: "+numero+" - Sumatoria: "+promedio); 
		}
		promedio=promedio/cant;									// calcula promedio
		System.out.println("El promedio de un total de "+cant+" numeros ingreados es: "+promedio);
	}
	public static void Funcion6() {
		String Nombre;
		Persona P;
		
		int cuenta=0;
		do {													// do while
			Nombre = JOptionPane.showInputDialog("Ingrese Nombre de Persona");  	// leer nombre
			P = new Persona(Nombre);												// Crear Persona con nombre ingresado
			
			if (P.getNombre().charAt(0)=='J') cuenta++;									// Si el primer caracter de la cadena es J, contar
			System.out.println("intento N°: "+cuenta+" Nombre ingresado: "+P.getNombre());	
		
		} while (!P.getNombre().equals("Juan"));											// Mientras Nombre sea distinto de Juan, repetir
		System.out.println("Ganaste!!.... al intento N°: "+cuenta);
		
	}
	public static void Funcion7() {
		String Nombre;
		int largo = 10;
		int NumRepetido =0;																// para contar Repetidos
		Persona ListadoPersona[]=new Persona[largo]; 									// Listado de 10 personas
		Persona Repetido[] = new Persona[largo];												// listado de personas con nombre repetidos
		for (int i=0;i<ListadoPersona.length;i++) {
			Nombre = JOptionPane.showInputDialog("Ingrese Nombre de Persona");  	// leer nombre
			ListadoPersona[i]=new Persona(Nombre);									// Crear Persona con nombre ingresado y agrega al listado
		}
		
																	
		for(int i=0;i<ListadoPersona.length-1;i++){									// recorrer listado de personas
            for(int j=i+1;j<ListadoPersona.length;j++){								// Recorre desde el siguiente indice
                if(ListadoPersona[i].getNombre().equals(ListadoPersona[j].getNombre())){ // compara nombre segun indices
                	Repetido[NumRepetido]=ListadoPersona[i];							// el repetido pasa al listado de repetidos
                	NumRepetido++;														// cuenta personas repetidas
                }
            }
		}
		
		System.out.println("La cantidad de nombres repetidos son: "+NumRepetido);
		System.out.println("Los nombres Repetidos son: ");
		for (int i=0; i<Repetido.length;i++) {											// recorre listado de repetidos
			System.out.println("Nombre: "+Repetido[i].getNombre());					// muestra el nombre repetido
		}
	}
	public static void Funcion8() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de nombres a ingresar"));
		Persona ListadoTalentos[]=new Persona[numero];
		int cuenta=0;
		
		for (int i=0;i<ListadoTalentos.length;i++) {
			String Nombre = JOptionPane.showInputDialog("Ingrese Nombre del Talento");  	// leer nombre
			ListadoTalentos[i]=new Persona(Nombre);	   										// Crear Persona con nombre ingresado y agrega al listado
		}
		System.out.println("----- Listado de Talentos ingresados-----");
		for (int i=0;i<ListadoTalentos.length;i++) {
			System.out.print(" --> "+ListadoTalentos[i].getNombre());
			cuenta++;
			if (cuenta==5) {
				System.out.println();
				cuenta=0;
			}
			
		}
	}
	public static void Funcion9() {
		String[] sexo = {"Seleccione", "Masculino","Femenino"};
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Alumnos del curso a ingresar"));
		Persona ListadoAlumnos[]=new Persona[numero];
		
		for (int i=0;i<ListadoAlumnos.length;i++) {
			String Nombre = JOptionPane.showInputDialog("Ingrese Nombre del Alumno");  	// leer nombre
			String Ape = JOptionPane.showInputDialog("Ingrese Apellido del Alumno");  	// leer Appellido
			int Fone = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Fono del Alumno"));  	// leer nombre
			String Email = JOptionPane.showInputDialog("Ingrese Email del Alumno");  	// leer nombre
			String Genero = (String) JOptionPane.showInputDialog(null, "Seleccione genero del Alumno", 
	                 "curso Full Satck Java Trainee", JOptionPane.DEFAULT_OPTION, null, sexo, sexo[0]);
			ListadoAlumnos[i] = new Persona(Nombre, Ape, Genero,Fone, Email);	   										// Crear Persona con nombre ingresado y agrega al listado
		}
		System.out.println("---- listado Alumnos ----");
		for (int i=0; i<ListadoAlumnos.length;i++) {
			System.out.println(ListadoAlumnos[i].toString());
		}
	}
	// Programa Principal
	public static void main(String[] args) {
		System.out.println("| ---- Menu Principal---- ");
		System.out.println("|- 1.Secuencial:");
		System.out.println("|- 2.Condicional Si entonces:");
		System.out.println("|- 3.Condicional Si entonces anidado: ");
		System.out.println("|- 4.Condicional según:");
		System.out.println("|- 5.Repetitiva Mientras");
		System.out.println("|- 6.Repetitiva Repetir");
		System.out.println("|- 7.repetitiva Para");
		System.out.println("|- 8.Arreglo Simple");
		System.out.println("|- 9.Arreglo Bidimensional");
		System.out.println("|- 10.Salir");
		
		int Ops=0;
		
		while (Ops!=10) {
		Ops = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
		switch (Ops) {
			case 1: Funcion1(); break;
			case 2: Funcion2(); break;
			case 3: Funcion3(); break;
			case 4: Funcion4(); break;
			case 5: Funcion5(); break;
			case 6: Funcion6(); break;
			case 7: Funcion7(); break;
			case 8: Funcion8(); break;
			case 9: Funcion9(); break;
			case 10: System.out.println("Fin Programa"); break;
			default: System.out.println("Eleccion invalida, vuelva a ingresar una opción entre 1 y 10");
		 }
		}
	}

}
