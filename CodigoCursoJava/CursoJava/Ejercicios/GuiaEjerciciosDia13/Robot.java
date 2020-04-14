package GuiaEjerciciosDia13;
import javax.swing.*;

public class Robot {
	
	// Atributos
	private int numero;
	private int PorcentajeVida;
	
	// Getters y Setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPorcentajeVida() {
		return PorcentajeVida;
	}
	public void setPorcentajeVida(int porcentajeVida) {
		PorcentajeVida = porcentajeVida;
	}
		
	// Constructores
	public Robot(int numero, int porcentajeVida) { // constructor con parametros para crear robot con atributos especificos
		this.numero = numero;
		PorcentajeVida = porcentajeVida;
	}
	
	public Robot() {								// constructor sin parametros para crear robot con atributos aleatorios
		numero = (int) (Math.random()*10);
		PorcentajeVida = (int) (Math.random()*100);
	}
	
	// Metodos
	public static void CreaLista(Robot ListadoRobot[]) {
		for (int i=0;i<ListadoRobot.length;i++){		// Crear listado de Robots
			  ListadoRobot[i]=new Robot();				// inserta cada robot en lista
		  }
	}
	
	public static void OrdenarLista(Robot ListadoRobot[]) {
		Robot Nrobot; 								// Robot a mover de la lista
		int indice=0;								// indice para mover robot
		for (int i =1; i<ListadoRobot.length;i++) { // Recorre lista para ordenar
			Nrobot = ListadoRobot[i];				// Toma el robot a mover
			/* -- El while hace la comparación de elementos para saber que robot debe mover  */										
			while ((indice<i)&& !(ListadoRobot[indice].getPorcentajeVida()>Nrobot.getPorcentajeVida())) {	
				indice++;
			}
			for (int j = i;j>indice;j--) {
				ListadoRobot[j] = ListadoRobot[j-1];
			}
			ListadoRobot[indice] = Nrobot;			// Robot removido a nueva posicion
		}
	}  
	
	public static void RecorreLista(Robot ListadoRobot[]) {
		for (int i=0;i<ListadoRobot.length;i++){									// recorrer listado de Robots
			  System.out.println("Robot N°"+i+" - Numero: "+ListadoRobot[i].getNumero()+" - Porcentaje vida: "+ListadoRobot[i].getPorcentajeVida()+"%");			  		  
		  }
	}
	
	public static void Robotsobre50(Robot ListadoRobot[]) {
		int cuenta=0;
		for (int i=0;i<ListadoRobot.length;i++){									
			if (ListadoRobot[i].getPorcentajeVida()>50) {
				cuenta++;
			}			  		  
		  }
		System.out.println("Cantidad de Robot con más de 50% de vida: "+cuenta);
	}
	
	public static void RobotConMayorVida(Robot ListadoRobot[]) {
		int fin=0;
		int inicio=0;
		inicio = ListadoRobot.length-1;
		fin = ListadoRobot.length-3;
		
		for (int i=inicio;i>=fin;i--){									// recorrer hacia atraz listado de Robots
			  System.out.println("Robot Numero: "+ListadoRobot[i].getNumero()+" - Porcentaje vida: "+ListadoRobot[i].getPorcentajeVida()+"%");			  		  
		  }
	}
	
	// Programa Principal Clase
	public static void main(String arg[]){
		int cant =0;
		
		String numero=JOptionPane.showInputDialog("Ingrese cantidad de Robot a crear"); // pide ingreso de cantidad en ventana
		cant=Integer.parseInt(numero);												// Cambia string a Int
		
		Robot ListadoRobot[]=new Robot[cant]; 										// Declaración arreglo de robots
		
		 CreaLista(ListadoRobot);					//Crea Listado de Robot
		  
		 RecorreLista(ListadoRobot);				//Muestra Listado de Robot
		  		  
		 OrdenarLista(ListadoRobot); 				//Ordena listado por Procentaje de Vida (atributo de Robot)
		 
		 System.out.println("------ Listado Ordenado ------");
		 
		 RecorreLista(ListadoRobot);
		 
		 System.out.println("------ Robot con más de 50% de vida ------");
		 
		 Robotsobre50(ListadoRobot);				// Cuenta la cantidad de Robot con más de 50% de vida (atributo de Robot)
		 
		 System.out.println("------ 3 Robot con el mayor porcentaje de vida ------");
		 
		 RobotConMayorVida(ListadoRobot);
	}
	
}
