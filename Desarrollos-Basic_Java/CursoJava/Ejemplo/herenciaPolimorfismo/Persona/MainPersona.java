package herenciaPolimorfismo.Persona;

import java.util.Date;
import javax.swing.JOptionPane;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainPersona {
	public static Alumno A;
	public static Funcionario F;

	public static void CrearAlumno() {
		String[] carreras = {
	            "Ingeniería de Ejecución de Empresas",
	            "Ingeniería de Ejecución en Computación e Informatica",
	            "Auditoria",
	            "Ingeniería Civil en Computación e Informatica",
	            "Ingenieria Comercial"
	        };
		String[] facultad = {
	            "FACE",
	            "FEN",
	            "FEC"
	        };
		Boolean Regular;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String Nombre = JOptionPane.showInputDialog(null, "Ingresar nombre del Alumno", "Crear Alumno", JOptionPane.QUESTION_MESSAGE);
		String ApPat = JOptionPane.showInputDialog(null, "Ingresar Apellido Paterno del Alumno", "Crear Alumno", JOptionPane.QUESTION_MESSAGE);
		String ApMat = JOptionPane.showInputDialog(null, "Ingresar Apellido Materno del Alumno", "Crear Alumno", JOptionPane.QUESTION_MESSAGE);
		Date FechaNac = null;
		try {
			FechaNac = formato.parse((JOptionPane.showInputDialog(null, "Ingresar Fecha Nacimiento del Alumno", "Crear Alumno", JOptionPane.QUESTION_MESSAGE)));
		} catch (HeadlessException | ParseException e) {
			e.printStackTrace();
		}
		String Carrera = (String) JOptionPane.showInputDialog(null, "Seleccione carrera del Alumno", "Crear Alumno", JOptionPane.QUESTION_MESSAGE, null, carreras, carreras[0]);
		String Facultad = (String) JOptionPane.showInputDialog(null, "Seleccione facultad del Alumno", "Crear Alumno", JOptionPane.QUESTION_MESSAGE, null, facultad, facultad[0]);
		int Reg = JOptionPane.showConfirmDialog(null, "¿Es Alumno Regular?", "Crear Alumno", JOptionPane.YES_NO_OPTION);
		if (Reg ==0) Regular = true;
		else Regular = false;
		
		A = new Alumno(Nombre, ApPat, ApMat, FechaNac, Carrera, Facultad, Regular);
		A.Consultar();
	}
	
	public static void CrearFuncionario() {
		String nombre = "Nombre";
		String apPaterno = "Paterno";
		String apMaterno = "Materno";
		Date fechaNac = null;
		String depto = "Depto";
		String area = "Area";
		Date fechaIngreso = null;
		F = new Funcionario(nombre, apPaterno, apMaterno, fechaNac, depto, area, fechaIngreso);
		F.Consultar();
	}
	
	public static void main(String[] args) {
		String[] options = {"Ingresar Alumno", "Ingresar Funcionario", "Salir"};
		int seleccion = 0;
		while (seleccion != 2) {
			seleccion = JOptionPane.showOptionDialog(null, "Selecione una de las siguntes opciones", "Crear Usuario", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			switch (seleccion) {
			case 0: CrearAlumno();break;
			case 1: CrearFuncionario(); break;
			case 2: JOptionPane.showMessageDialog(null, "Fin del Programa", "Crear Usuario", JOptionPane.INFORMATION_MESSAGE);break;
			}
		}
	
	}

}
