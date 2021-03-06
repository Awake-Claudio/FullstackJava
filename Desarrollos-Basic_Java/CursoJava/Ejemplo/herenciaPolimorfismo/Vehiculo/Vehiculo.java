package herenciaPolimorfismo.Vehiculo;

import javax.swing.JOptionPane;

public class Vehiculo {
	// Atributos
	String Patente;
	int AņoFabricacion;
	String Modelo;
	
	//Constructores

	public Vehiculo() {
		super();
	}
	public Vehiculo(String patente, int aņoFabricacion, String modelo) {
		Patente = patente;
		AņoFabricacion = aņoFabricacion;
		Modelo = modelo;
	}
	
	// Getters y Setters

	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}

	public int getAņoFabricacion() {
		return AņoFabricacion;
	}

	public void setAņoFabricacion(int aņoFabricacion) {
		AņoFabricacion = aņoFabricacion;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	// ToString
	public String toString() {
		return "Vehiculo [Patente=" + Patente + "\n AņoFabricacion=" + AņoFabricacion + "\n Modelo=" + Modelo + "]";
	}

	// Metodos
	
	public void Imprimir() {
		JOptionPane.showMessageDialog(null, "Los datos del Vehiculo son: "+toString(), "Antecedentes de Vehiculos", JOptionPane.INFORMATION_MESSAGE);
	}

	
}
