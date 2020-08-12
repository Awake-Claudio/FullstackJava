package varios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Ingresa un numero decimal");
		float n = reader.nextFloat();			// solo permite ingresar valores decimales, no permite caracteres
		System.out.println("El numero decimal ingresado es: "+n);
		
		System.out.println("Ingresa un numero entero");
		int a = reader.nextInt();				// solo permite ingresar valores enteros, no permite caracteres
		System.out.println("El numero entero ingresado es: "+a);
		
		System.out.println("Ingresa un texto");
		String t = reader.nextLine();				// permite ingresar una cadena de caracteres
		System.out.println("El texto ingresado es: "+t);
		
		System.out.println("Ingresa cualquier cosa");
		String x = reader.nextLine();				// permite ingresar una cadena de caracteres
		System.out.println("Todo lo que se ha ingresado fue: "+x+" - "+t+" - "+a+" - "+n);
		
	}

}
