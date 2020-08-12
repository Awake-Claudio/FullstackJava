package herenciaPolimorfismo.Vehiculo;

import javax.swing.JOptionPane;

public class Vehiculo {
	// Atributos
	String Patente;
	int AñoFabricacion;
	String Modelo;
	
	//Constructores

	public Vehiculo() {
		super();
	}
	public Vehiculo(String patente, int añoFabricacion, String modelo) {
		Patente = patente;
		AñoFabricacion = añoFabricacion;
		Modelo = modelo;
	}
	
	// Getters y Setters

	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}

	public int getAñoFabricacion() {
		return AñoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		AñoFabricacion = añoFabricacion;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	// ToString
	public String toString() {
		return "Vehiculo [Patente=" + Patente + "\n AñoFabricacion=" + AñoFabricacion + "\n Modelo=" + Modelo + "]";
	}

	// Metodos
	
	public void Imprimir() {
		JOptionPane.showMessageDialog(null, "Los datos del Vehiculo son: "+toString(), "Antecedentes de Vehiculos", JOptionPane.INFORMATION_MESSAGE);
	}

	
}
