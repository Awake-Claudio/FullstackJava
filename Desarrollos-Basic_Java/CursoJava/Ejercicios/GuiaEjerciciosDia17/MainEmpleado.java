package GuiaEjerciciosDia17;
import javax.swing.*;

public class MainEmpleado {

	public static void main(String[] args) {
		String[] options = {"Vendedor", "Repartidor", "Salir"};
		int op=0;
		
		while (op!=2) {
			op = JOptionPane.showOptionDialog(null, "Seleccione tipo empleado a crear", "Empleados", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			switch (op) {
				case 0: CrearVendedor(); break;
				case 1: CrearRepartidor(); break;
				case 2: JOptionPane.showMessageDialog(null, "Fin"); break;	
			}
		}

	}
	public static void CrearVendedor() {
		Vendedor v = new Vendedor();
		v.setNombre(JOptionPane.showInputDialog(null, "Ingresar Nombre", "Creaci�n Vendedor", JOptionPane.QUESTION_MESSAGE));
		v.setApellido(JOptionPane.showInputDialog(null, "Ingresar Apellido", "Creaci�n Vendedor", JOptionPane.QUESTION_MESSAGE));
		v.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar Edad", "Creaci�n Vendedor", JOptionPane.QUESTION_MESSAGE)));
		v.setSalario(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar Salario", "Creaci�n Vendedor", JOptionPane.QUESTION_MESSAGE)));
		
		// mostrar creaci�n
		JOptionPane.showMessageDialog(null, v.toString(), "Creaci�n Vendedor", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void CrearRepartidor() {
		Repartidor R = new Repartidor();
		R.setNombre(JOptionPane.showInputDialog(null, "Ingresar Nombre", "Creaci�n Vendedor", JOptionPane.QUESTION_MESSAGE));
		R.setApellido(JOptionPane.showInputDialog(null, "Ingresar Apellido", "Creaci�n Vendedor", JOptionPane.QUESTION_MESSAGE));
		R.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar Edad", "Creaci�n Vendedor", JOptionPane.QUESTION_MESSAGE)));
		R.setSalario(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar Salario", "Creaci�n Vendedor", JOptionPane.QUESTION_MESSAGE)));
		
		// mostrar creaci�n
		JOptionPane.showMessageDialog(null, R.toString(), "Creaci�n Vendedor", JOptionPane.INFORMATION_MESSAGE);
	}

}
