package herenciaPolimorfismo.Persona;
import java.util.*;

public class Funcionario extends Persona{
	private String Depto;
	private String Area;
	private Date FechaIngreso;
	
	// constructores
	/**
	 * @param nombre
	 * @param apPaterno
	 * @param apMaterno
	 * @param fechaNac
	 * @param depto
	 * @param area
	 * @param fechaIngreso
	 */
	public Funcionario(String nombre, String apPaterno, String apMaterno, Date fechaNac, String depto, String area,
			Date fechaIngreso) {
		super(nombre, apPaterno, apMaterno, fechaNac);
		Depto = depto;
		Area = area;
		FechaIngreso = fechaIngreso;
	}

	// getters y setters
	public String getDepto() {
		return Depto;
	}

	public void setDepto(String depto) {
		Depto = depto;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public Date getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Funcionario [Depto=" + Depto + ", Area=" + Area + ", FechaIngreso=" + FechaIngreso + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void Consultar() {
		super.Consultar();
	}
	
	
	
	

	

}
