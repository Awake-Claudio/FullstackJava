package CuadrosDeDialogo;
import javax.swing.*;

/*
 * Este m�todo permite ingresar (digitar) un dato en el cuadro de dialogo, es algo diferente al caso del mensaje 
 * informativo, sus parametros son:
 * - Primer par�metro: Componente padre, su utilizaci�n ser�a solo para remplazar el mensaje por algun otro 
 *   componente. Si no es el caso se coloca null
 * - Segundo par�metro: Corresponde el texto o etiqueta del campo del cuadro de dialogo que se desa mostrar 
 * - Tercer par�metro: Corresponde al t�tulo del cuadro de dialogo
 * - ultimo par�metro: se usa para seleccionar el icono por defecto: 
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
