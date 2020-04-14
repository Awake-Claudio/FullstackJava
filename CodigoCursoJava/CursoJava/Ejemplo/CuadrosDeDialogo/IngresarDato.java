package CuadrosDeDialogo;
import javax.swing.*;

/*
 * Este método permite ingresar (digitar) un dato en el cuadro de dialogo, es algo diferente al caso del mensaje 
 * informativo, sus parametros son:
 * - Primer parámetro: Componente padre, su utilización sería solo para remplazar el mensaje por algun otro 
 *   componente. Si no es el caso se coloca null
 * - Segundo parámetro: Corresponde el texto o etiqueta del campo del cuadro de dialogo que se desa mostrar 
 * - Tercer parámetro: Corresponde al título del cuadro de dialogo
 * - ultimo parámetro: se usa para seleccionar el icono por defecto: 
 * 		INFORMATION_MESSAGE , WARNING_MESSAGE , QUESTION_MESSAGE , PLAIN_MESSAGE, ERROR_MESSAGE
 */

public class IngresarDato {

	public static void main(String[] args) {
		String respuesta; // usaremos esta variable para recepcionar el dato
		
		// metodo simple sin los 4 parametros
		respuesta = JOptionPane.showInputDialog("Escribe tu nombre"); 
		// mostramos los que se ingreso
		JOptionPane.showMessageDialog(null, respuesta, "Dato ingresado", JOptionPane.PLAIN_MESSAGE);
		
		//ahora usaremos el metodo con los 4 parametros, pero sin componente padre
		respuesta = JOptionPane.showInputDialog(null, "Escriba nuevamente su nombre", "Ingreso de dato en ventana", JOptionPane.QUESTION_MESSAGE);
		
		// mostramos los que se ingreso en este ultimo metodo
		JOptionPane.showMessageDialog(null, respuesta, "Dato ingresado", JOptionPane.PLAIN_MESSAGE);
	}

}
