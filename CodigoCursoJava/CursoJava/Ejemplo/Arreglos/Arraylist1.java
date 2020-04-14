package Arreglos;
import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) {
		//define Arraylist
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		// Pide cantidad de numeros a ingresar en arraylist
		System.out.println("Ingrese cantidad de numeros a ingresar: ");
		Scanner N = new Scanner(System.in);
		int cant = N.nextInt();
		
		// instanciar Random para optener numeros al azar hasta el 10
		Random r = new Random();
		
		//ingresar numeros aleatorios al arraylist
		for (int i=0;i<cant;i++) {
			num.add(r.nextInt(10));
		}
				
		//mostrar numeros ingresados
		Recorrer(num);
		
		//quitamos un valor dado una posicion determinada y vemos como quedo
		System.out.println("Ingrese la posicion a quitar: ");
		int pos = N.nextInt();
		num.remove(pos);
		Recorrer(num);
		pos=0;
		
		//Agreagamos un nuevo valor y vemos como quedo
		System.out.println("Ingrese numero a agregar: ");
		int dato = N.nextInt();
		num.add(dato);
		Recorrer(num);
		dato = 0;
		
		// Cambiamos el valor de una posicion
		System.out.println("Ingrese posicion del numero a sustituir: ");
		pos = N.nextInt();
		System.out.println("Ingrese nuevo numero a sustituir: ");
		dato = N.nextInt();
		num.set(pos, dato);
		Recorrer(num);
		
		// ordenar el arraylist
		System.out.println("**** Arreglo Ordenado *******");
		Collections.sort(num);
		Recorrer(num);
		
		// cerrar el scanner
				N.close();
				
		System.out.println("FIN");
	}
	public static void Recorrer(ArrayList<Integer> num) {
		for (int i=0; i<num.size();i++) {
			System.out.println("Posicion ["+i+"] - Valor: "+num.get(i));
		}
	}

}
