package herenciaPolimorfismo.Vehiculo;

import javax.swing.JOptionPane;

public class Vehiculo {
	// Atributos
	String Patente;
	int A�oFabricacion;
	String Modelo;
	
	//Constructores

	public Vehiculo() {
		super();
	}
	public Vehiculo(String patente, int a�oFabricacion, String modelo) {
		Patente = patente;
		A�oFabricacion = a�oFabricacion;
		Modelo = modelo;
	}
	
	// Getters y Setters

	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}

	public int getA�oFabricacion() {
		return A�oFabricacion;
	}

	public void setA�oFabricacion(int a�oFabricacion) {
		A�oFabricacion = a�oFabricacion;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	// ToString
	public String toString() {
		return "Vehiculo [Patente=" + Patente + "\n A�oFabricacion=" + A�oFabricacion + "\n Modelo=" + Modelo + "]";
	}

	// Metodos
	
	public void Imprimir() {
		JOptionPane.showMessageDialog(null, "Los datos del Vehiculo son: "+toString(), "Antecedentes de Vehiculos", JOptionPane.INFORMATION_MESSAGE);
	}

	
}
