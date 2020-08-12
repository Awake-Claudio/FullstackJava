package herenciaPolimorfismo.Vehiculo;

import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		
		String[] Tipo = {"Seleccione tipo Vehiculo", "Auto", "Moto"};
		String resp = "";   
		Vehiculo V = new Vehiculo();
	    
	    while (resp!=null) {
	    	resp = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de Vehiculo a crear", "Vehiculos", JOptionPane.QUESTION_MESSAGE, null, Tipo, Tipo[0]);
	    	if (resp!=null)
	    		switch (resp) {
	    			case "Auto" : Mostrar(CreaAuto(V)); break;
	    			case "Moto" : Mostrar(CreaMoto(V)); break;
	    			default: JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de vehiculo", "Antecedentes de Vehiculos", JOptionPane.ERROR_MESSAGE);
	    		}
	    }
	    System.out.println("el resultado final es: "+resp);
	   
	}
	
	public static Vehiculo CreaVehiculo(Vehiculo v) {
		v.setPatente(JOptionPane.showInputDialog("Ingrese Patente del Vehiculo"));
		v.setAñoFabricacion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año de Fabricacion del Vehiculo")));
		v.setModelo(JOptionPane.showInputDialog("Ingrese modelo del Vehiculo"));
		return v;
	}
	
	public static Vehiculo CreaAuto(Vehiculo v) {
		CreaVehiculo(v);
		int puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de puertas del auto"));
		String version = JOptionPane.showInputDialog("Ingrese version del auto");
		Vehiculo a = new Auto(v.getPatente(), v.getAñoFabricacion(), v.getModelo(), puertas, version);
		
		return a;
		
	}
	public static Vehiculo CreaMoto(Vehiculo v) {
		CreaVehiculo(v);
		String tipoPista = JOptionPane.showInputDialog("Ingrese Tipo de Pista de la moto");
		String cilindrada = JOptionPane.showInputDialog("Ingrese cilindrada de la moto");
		Vehiculo m = new Moto(v.getPatente(), v.getAñoFabricacion(), v.getModelo(), cilindrada, tipoPista);
		
		return m;
	}
	
	public static void Mostrar (Vehiculo v) {
		v.Imprimir();
	}
}
