package herenciaPolimorfismo.Persona;
import java.util.*;

import javax.swing.*;

public abstract class Persona {
	// atributos
	private String Nombre;
	private String ApPaterno;
	private String ApMaterno;
	private Date FechaNac;
	
	// getters y setters
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApPaterno() {
		return ApPaterno;
	}
	public void setApPaterno(String apPaterno) {
		ApPaterno = apPaterno;
	}
	public String getApMaterno() {
		return ApMaterno;
	}
	public void setApMaterno(String apMaterno) {
		ApMaterno = apMaterno;
	}
	public Date getFechaNac() {
		return FechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		FechaNac = fechaNac;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", ApPaterno=" + ApPaterno + ", ApMaterno=" + ApMaterno + ", FechaNac="
				+ FechaNac + "]";
	}
	
	//constructores
	/**
	 * @param nombre
	 * @param apPaterno
	 * @param apMaterno
	 * @param fechaNac
	 */
	public Persona(String nombre, String apPaterno, String apMaterno, Date fechaNac) {
		super();
		Nombre = nombre;
		ApPaterno = apPaterno;
		ApMaterno = apMaterno;
		FechaNac = fechaNac;
	}
	
	// metodos
	public void Consultar() {
		JOptionPane.showMessageDialog(null, "Los datos de la Persona son: "+toString(), "Antecedentes de Usuario", JOptionPane.INFORMATION_MESSAGE);
	}

}
