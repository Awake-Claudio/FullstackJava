package herenciaPolimorfismo.Vehiculo;

//import javax.swing.JOptionPane;

public class Auto extends Vehiculo{
// Atributos propios de la clase hija
	int NumeroPuertas;
	String Version;
	
// Constructores con herencia
	public Auto() {
		super();
	}


	public Auto(String patente, int añoFabricacion, String modelo) {
		super(patente, añoFabricacion, modelo);
	}


	public Auto(String patente, int añoFabricacion, String modelo, int numeroPuertas, String version) {
		super(patente, añoFabricacion, modelo);
		NumeroPuertas = numeroPuertas;
		Version = version;
	}
// Getters y Setters propios
public int getNumeroPuertas() {
		return NumeroPuertas;
	}


	public void setNumeroPuertas(int numeroPuertas) {
		NumeroPuertas = numeroPuertas;
	}


	public String getVersion() {
		return Version;
	}


	public void setVersion(String version) {
		Version = version;
	}

// ToString
	@Override
	public String toString() {
		return "Auto [\nNumeroPuertas=" + NumeroPuertas + "\n Version=" + Version + "\n Patente=" + Patente
				+ "\n AñoFabricacion=" + AñoFabricacion + "\n  Modelo=" + Modelo + "]";
	}


	//Metodos heredados re-escritos
	@Override
	public void Imprimir() {
		super.Imprimir();
		//JOptionPane.showMessageDialog(null, "Los datos del auto son: "+toString(), "Antecedentes de Vehiculos", JOptionPane.INFORMATION_MESSAGE);
	}


}
