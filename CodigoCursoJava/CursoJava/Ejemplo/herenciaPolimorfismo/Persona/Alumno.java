package herenciaPolimorfismo.Persona;

import java.util.Date;

public class Alumno extends Persona{
	private String Carrera;
	private String Facultad;
	private Boolean AlumnoRegular;

	// Constructor
	/**
	 * @param nombre
	 * @param apPaterno
	 * @param apMaterno
	 * @param fechaNac
	 * @param carrera
	 * @param facultad
	 * @param alumnoRegular
	 */
	public Alumno(String nombre, String apPaterno, String apMaterno, Date fechaNac, String carrera, String facultad,
			Boolean alumnoRegular) {
		super(nombre, apPaterno, apMaterno, fechaNac);
		Carrera = carrera;
		Facultad = facultad;
		AlumnoRegular = alumnoRegular;
	}

	//Geters y Setters
	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

	public String getFacultad() {
		return Facultad;
	}

	public void setFacultad(String facultad) {
		Facultad = facultad;
	}

	public Boolean getAlumnoRegular() {
		return AlumnoRegular;
	}

	public void setAlumnoRegular(Boolean alumnoRegular) {
		AlumnoRegular = alumnoRegular;
	}

	// toStrig
	@Override
	public String toString() {
		return "Alumno [" + super.toString() +" Carrera=" + Carrera + ", Facultad=" + Facultad + ", AlumnoRegular=" + AlumnoRegular
				+ ", toString()=]";
	}

	// Metodos
	@Override
	public void Consultar() {
		super.Consultar();
	}

}
