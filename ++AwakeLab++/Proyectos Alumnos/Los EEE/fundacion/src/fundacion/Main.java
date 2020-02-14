package fundacion;
import java.util.ArrayList;
import java.util.InputMismatchException;
//import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static Mascotas registroMascotas(int e) {
		Scanner leer = new Scanner(System.in);
		String nombre, especie, sexo = "";
		int año = 0;
		boolean adoptado=false, operado = false;
		int opc = 0;

			System.out.println("Ingrese el Nombre de la Mascota");
			nombre = leer.next();
			
			System.out.println("Ingrese Especie de la Mascota");
			especie = leer.next();
		
			System.out.println("Ingrese sexo animal");
			sexo = leer.next();
	
			System.out.println("Ingrese el Año de nacimiento");
			año = leer.nextInt();
	
			System.out.println("¿El Animal fue adoptado?");
			System.out.println("Ingrese 1 - Si fue adoptado");
			System.out.println("Ingrese 2 - Si la mascota no ha sido adoptada");
			opc = leer.nextInt();
				if(opc==1) {
					adoptado=true;
				}else if(opc==2) {
					adoptado=false;
				}

			System.out.println("¿El Animal está operado?");
			System.out.println("Ingrese 1 - Si");
			System.out.println("Ingrese 2 - No");
			opc = leer.nextInt();
				if(opc==1) {
					operado=true;
				}else if(opc==2) {
					operado=false;
				}
			
			Mascotas animal = new Mascotas(nombre, especie, sexo, e, año, adoptado, operado);
			return animal;
			
			}
	
		public static void main(String[] args) {
			Scanner leer = new Scanner(System.in);
			ArrayList<Mascotas> listo = new ArrayList();
			boolean exit = false;
			int borrar;
			int op = 0;
			while (!exit) {
				System.out.println("---------------------------------------------------");
				System.out.println("1.- Registro de Mascotas");
				System.out.println("2.- Listar Mascotas");
				System.out.println("3.- Borrar Mascotas");
				System.out.println("4.- Salir");
				System.out.println("---------------------------------------------------");

			try {
				System.out.println("Ingrese la Opción");
				op = leer.nextInt();
				
				switch (op) {
					case 1:
					System.out.println("Has seleccionado la opcion 1 - Registre la Mascota");
					int e = listo.size();
					Mascotas animal=registroMascotas(e);
					listo.add(animal);
					for (Mascotas We : listo) {
						System.out.println("Se registró una nueva mascota! Nombre: " + We.getNombreM());

				}
					break;
					case 2:
				
						System.out.println("Has seleccionado la opcion 2 - Lista Mascotas");
						for (Mascotas w : listo) {
							System.out.println(w.listarDatos());

						}
					break;
						case 3:
							System.out.println("Has seleccionado la opcion 3 - Borrar Mascota");
							for (Mascotas l : listo) {
								System.out.println(l.borrarDatos());
							}
								
							System.out.println("Escriba la ID de la Mascota a Eliminar");
								borrar = leer.nextInt();
								listo.remove(borrar);
								System.out.println("Mascota Eliminada!");
								for (Mascotas k: listo) {
									System.out.println(k.borrarDatos());
									
								}
						break;
						case 4:
							System.out.println("Hasta pronto!");
						exit = true;
						break;
						default:
							System.out.println("Ingrese solo números entre 1 y 4");
				}
				} catch (InputMismatchException e) {
					System.out.println("- - Seleccione información válida - -");
					leer.next();
					}


			}
		}


}
