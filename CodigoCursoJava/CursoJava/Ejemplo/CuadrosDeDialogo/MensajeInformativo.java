package CuadrosDeDialogo;
import javax.swing.*;

/*
 * El funcionamiento de este método es un poco diferente, pero más útil:
 *
 * - Primer Parámetro: El componente padre sobre el cual se mostrará la ventana de dialogo.
 * - Segundo Parámetro: El mensaje que se mostrará dentro de la ventana.
 * - Tercer Parámetro: El mensaje que se mostrará en la barra de titulo.
 * - Cuarto Parámetro: Una variable Int contenida por JOptionPane, que representa el icono que 
 *    se mostrará en la ventana, algunos de los valores posibles son: 
 *    INFORMATION_MESSAGE , WARNING_MESSAGE , QUESTION_MESSAGE , PLAIN_MESSAGE, ERROR_MESSAGE
 */


public class MensajeInformativo {
	public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Mensaje de tipo informativo a mostrar en el cuadro de dialogo", "Titulo del cuadro de dialogo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje de tipo Alerta a mostrar en el cuadro de dialogo", "Titulo del cuadro de dialogo", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje de tipo Consulta  a mostrar en el cuadro de dialogo", "Titulo del cuadro de dialogo", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje de tipo plano  a mostrar en el cuadro de dialogo", "Titulo del cuadro de dialogo", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje de tipo Error  a mostrar en el cuadro de dialogo", "Titulo del cuadro de dialogo", JOptionPane.ERROR_MESSAGE);
        
	}
}
