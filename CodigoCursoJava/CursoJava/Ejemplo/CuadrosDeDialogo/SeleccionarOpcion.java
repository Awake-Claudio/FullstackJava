package CuadrosDeDialogo;
import javax.swing.*;

/*
 * ahora vamos a usar el showConfirmDialog, el componente padre pues como anteriormente mencionamos es aquel sobre 
 * el cual se mostrar� el mensaje, y el mensaje es lo que dir� el mensaje, como es un dialogo de confirmaci�n, 
 * este, por default mostrar� las opciones si, no y cancelar, y devolver� un entero con la opci�n seleccionada como 
 * si estuvieramos en un vector, es decir, si seleccionamos si retornar� un cero, si es no un 1 y si es cancelar un 2.


 */

public class SeleccionarOpcion {

	public static void main(String[] args) {
		// Ejemplo1
		int resp = JOptionPane.showConfirmDialog(null, "�Est� seguro?");
		
		JOptionPane.showMessageDialog(null, "la opcion elegida fue: "+resp, "Seleci�n de opciones", JOptionPane.INFORMATION_MESSAGE);
	/*
	 * El resultado de este metodo ser� 0, 1 o 2, donde:
	 * 0: fue la primera opcion "yes"
	 * 1: fue la segunda opcion "no"
	 * 2: fue la tercera opcion "cancelar"
	 */
	
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		// Ejemplo2
		/*
		 * Este ejemplo es un poco mas completo que el anterior, se mantiene las primeras dos opciones, pero agregamos 
		 * tal y como antes el titulo de cuadro de dialogo, y un par�metro nuevo, el tipo de selecci�n, es decir, que 
		 * tipo de dialogo ser�, si es un dialogo de si y no, o si tiene las opciones si, no y cancelar por defecto
		 */
		
		int resp2 = JOptionPane.showConfirmDialog(null, "�Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null, "la opcion elegida fue: "+resp2, "Seleci�n de opciones", JOptionPane.INFORMATION_MESSAGE);
		/*
		 * El resultado de este metodo ser� 0 o 1 donde:
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
		
		int resp3 = JOptionPane.showConfirmDialog(null, "�Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "la opcion elegida fue: "+resp3, "Seleci�n de opciones", JOptionPane.INFORMATION_MESSAGE);
		/*
		 * El resultado de este metodo ser� 0 o 1 donde:
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
		JOptionPane.showMessageDialog(null, "la opcion elegida fue: "+seleccion, "Seleci�n de opciones", JOptionPane.INFORMATION_MESSAGE);
	}

}
