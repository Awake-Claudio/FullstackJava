package Arreglos;
import java.util.*;

import javax.swing.JOptionPane;

public class HashMap1 {

	public static void main(String[] args) {
	// Declaracion HashMap(Clave - Valor)
	HashMap<String, String> CapitalRegional = new HashMap<String, String>();
	int resp = 0;
	String[] options = {"Agregar", "Eliminar", "Consultar", "Modificar", "Cambiar Clave", "Salir"};
	
	
	//inicializacion (Regi�n - CapitalRegional)
	CapitalRegional.put("VI - O'Higgins", "Rancagua");
	CapitalRegional.put("V - Valpara�so", "Valpara�so");
	CapitalRegional.put("VII - Maule", "Talca");
	CapitalRegional.put("VIII - B�o-B�o", "Concepci�n");
	
	while (resp!=5) {
		Recorre(CapitalRegional);
		resp = JOptionPane.showOptionDialog(null, "Seleccione acci�n", "HashMap", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		switch (resp) {
		case 0: Agregar(CapitalRegional); break;
		case 1:Eliminar(CapitalRegional); break;
		case 2: Consulta(CapitalRegional); break;
		case 3: Modificar(CapitalRegional); break;
		case 4: Cambiarkey(CapitalRegional); break;
		default: System.out.println("Fin");
		}
	}
	
	}
	public static void Consulta (HashMap<String, String> CapitalRegional) {
		String Region=JOptionPane.showInputDialog("Ingrese Regi�n a Consultar");
		System.out.println("La Region ingresada es: "+Region+ " y su Capital Regional es: "+CapitalRegional.get(Region));
		System.out.println("***************");
	}
	
	public static HashMap<String, String> Eliminar (HashMap<String, String> CapitalRegional) {
		String Region=JOptionPane.showInputDialog("Ingrese Regi�n a Consultar");
		System.out.println("La Regi�n a eliminar es: "+CapitalRegional.get(Region));
		System.out.println("***************");
		CapitalRegional.remove(Region);
		return CapitalRegional;
	}
	
	public static void Recorre (HashMap<String, String> CapitalRegional) {
		for (String i : CapitalRegional.keySet()) {
			System.out.println("Regi�n: " + i + " | Comuna: " + CapitalRegional.get(i));
			}
		System.out.println("existen "+CapitalRegional.size()+" registros");
		System.out.println("***************");
	}
	
	public static HashMap<String, String> Agregar (HashMap<String, String> CapitalRegional) {
		String Region=JOptionPane.showInputDialog("Ingrese Regi�n a Crear");
		String Comuna=JOptionPane.showInputDialog("Ingrese Comuna de la Regi�n "+Region+" a crear");
		
		CapitalRegional.put(Region, Comuna);
		return CapitalRegional;
	}
	
	public static HashMap<String, String> Modificar (HashMap<String, String> CapitalRegional) {
		String Region=JOptionPane.showInputDialog("Ingrese Regi�n a Buscar");
		String Comuna=JOptionPane.showInputDialog("Ingrese nuevo nombre de la Comuna de la Regi�n "+Region+" a modificar");
		CapitalRegional.replace(Region, Comuna);
		return CapitalRegional;
	}
	
	public static HashMap<String, String> Cambiarkey (HashMap<String, String> CapitalRegional) {
		String Region=JOptionPane.showInputDialog("Ingrese Regi�n a Consultar");
		String Comuna=CapitalRegional.get(Region);
		Eliminar(CapitalRegional);
		String NewRegion=JOptionPane.showInputDialog("Ingrese nuevo Nombre Regi�n a Modificar");
				
		CapitalRegional.put(NewRegion, Comuna);
		return CapitalRegional;
	}
}
