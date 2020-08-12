package CuadrosDeDialogo;
import javax.swing.*;

/*
 * ahora vamos a usar el showConfirmDialog, el componente padre pues como anteriormente mencionamos es aquel sobre 
 * el cual se mostrará el mensaje, y el mensaje es lo que dirá el mensaje, como es un dialogo de confirmación, 
 * este, por default mostrará las opciones si, no y cancelar, y devolverá un entero con la opción seleccionada como 
 * si estuvieramos en un vector, es decir, si seleccionamos si retornará un cero, si es no un 1 y si es cancelar un 2.


 */

public class SeleccionarOpcion {

	public static void main(String[] args) {
		// Ejemplo1
		int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
		
		JOptionPane.showMessageDialog(null, "la opcion elegida fue: "+resp, "Seleción de opciones", JOptionPane.INFORMATION_MESSAGE);
	/*
	 * El resultado de este metodo será 0, 1 o 2, donde:
	 * 0: fue la primera opcion "yes"
	 * 1: fue la segunda opcion "no"
	 * 2: fue la tercera opcion "cancelar"
	 */
	
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		// Ejemplo2
		/*
		 * Este ejemplo es un poco mas completo que el anterior, se mantiene las primeras dos opciones, pero agregamos 
		 * tal y como antes el titulo de cuadro de dialogo, y un parámetro nuevo, el tipo de selección, es decir, que 
		 * tipo de dialogo será, si es un dialogo de si y no, o si tiene las opciones si, no y cancelar por defecto
		 */
		
		int resp2 = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null, "la opcion elegida fue: "+resp2, "Seleción de opciones", JOptionPane.INFORMATION_MESSAGE);
		/*
		 * El resultado de este metodo será 0 o 1 donde:
		 * 0: fue la primera opcion "yes"
		 * 1: fue la segunda opcion "no"
		 */
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		// Ejemplo3
		/*
		 * Este ejemplo es identico al anterior, solo que se le agrega el tipo de mensaje para que nos reconozca un 
		 * icono por defecto, tal y como lo hicimos con el InputDialog y el MessageDialog
		 * INFORMATION_MESSAGE , WARNING_MESSAGE , QUESTION_MESSAGE , PLAIN_MESSAGE, ERROR_MESSAGE
		 */
		
		int resp3 = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "la opcion elegida fue: "+resp3, "Seleción de opciones", JOptionPane.INFORMATION_MESSAGE);
		/*
		 * El resultado de este metodo será 0 o 1 donde:
		 * 0: fue la primera opcion "yes"
		 * 1: fue la segunda opcion "no"
		 */
		
		// Ejemplo 4
		/*
		 * JOptionPane.showOptionDialog(padre, mensaje, titulo, tipo de seleccion, tipo de mensaje, icono, opciones, 
		 * valor inicial);
		 * INFORMATION_MESSAGE , WARNING_MESSAGE , QUESTION_MESSAGE , PLAIN_MESSAGE, ERROR_MESSAGE
		 */
		
		String[] options = {"Opcion A", "Opcion B", "Opcion C", "Opcion D"};
		int seleccion = JOptionPane.showOptionDialog(null, "Selecione una de las siguntes opciones", "Seleccion de opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		JOptionPane.showMessageDialog(null, "la opcion elegida fue: "+seleccion, "Seleción de opciones", JOptionPane.INFORMATION_MESSAGE);
	}

}
