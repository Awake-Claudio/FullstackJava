package excepciones;

public class Numero {

	public static void main(String[] args) {

		int cant=0;
		int i=0; 
		String texto[]={"cero","Uno","Dos","Tres","Cuatro","Cinco"};
		while(cant<10){
		 try{
		 i=(int) Math.round(Math.random()*9);
		 System.out.println("valor de indice: "+i+" Valor Arreglo: "+texto[i]);
		}catch(ArrayIndexOutOfBoundsException exc){
		 System.out.println("Fallo en el índice, su valor fue: "+i);
		}
		 cant=cant+1;
		} 
	}

}
