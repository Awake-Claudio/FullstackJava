package herenciaPolimorfismo.Vehiculo;

//import javax.swing.JOptionPane;

public class Moto extends Vehiculo{
	//Atributos Propios de Clase Hija
	String Cilindrada;
	String TipoPista;
	
	//Constructores Heredados
	public Moto() {
		super();
	}
	public Moto(String patente, int aņoFabricacion, String modelo) {
		super(patente, aņoFabricacion, modelo);
	}
	public Moto(String patente, int aņoFabricacion, String modelo, String cilindrada, String tipoPista) {
		super(patente, aņoFabricacion, modelo);
		Cilindrada = cilindrada;
		TipoPista = tipoPista;
	}
	
	// Getters y Setters Propios
	public String getCilindrada() {
		return Cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		Cilindrada = cilindrada;
	}
	public String getTipoPista() {
		return TipoPista;
	}
	public void setTipoPista(String tipoPista) {
		TipoPista = tipoPista;
	}
	
	// Tosting
	@Override
	public String toString() {
		return "Moto [\nCilindrada=" + Cilindrada + "\n TipoPista=" + TipoPista + "\n Patente=" + Patente
				+ "\n AņoFabricacion=" + AņoFabricacion + "\n Modelo=" + Modelo + "]";
	}
	
	
	
	
	// Metodos heredados re-escritos
	@Override
	public void Imprimir() {
		super.Imprimir();
		//JOptionPane.showMessageDialog(null, "Los datos del auto son: "+toString(), "Antecedentes de Vehiculos", JOptionPane.INFORMATION_MESSAGE);
	}	
	
}
