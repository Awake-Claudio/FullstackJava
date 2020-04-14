package CuadrosDeDialogo;
import javax.swing.*;

/*
 * En este funcionamiento del metodo, se puede pasar como parametro un arreglo de objetos, lo que permite generar un JComboBox o lista desplegable (listbox) 
 * donde se muestra las posibles selecciones de datos,el dato obtenido será el que sea seleccionado. Los parametros son:
 * Componente padre, Mensaje o etiqueta del campo, Titulo del cuadro de dialogo, Tipo De Mensaje, Icono personalizado, Arreglo de opciones y finalmente 
 * Seleccion por defecto del listado
 */

public class SeleccionarDato {

	public static void main(String[] args) {
		String[] carreras = {
	            "Ingeniería en sistemas computacionales",
	            "Ingeniería industrial",
	            "Ingeniería en mecatrónica",
	            "Ingeniería en informatica",
	            "Ingeniería petroquímica"
	        };
	       // MyIcon icon = new MyIcon(); // instanciamos a la clase MyIcon que hemos creado donde extrae la imagen
	        
	       /*En los parametros que usaremos serán:
	        * Componente padre(null), Mensaje o etiqueta del campo, Titulo del cuadro de dialogo, Tipo De Mensaje,
	        * Icono personalizado (null), Arreglo de opciones y finalmente Seleccion por defecto del listado
	        */
	        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carreras Profesionales", JOptionPane.QUESTION_MESSAGE, null, carreras, carreras[0]);
	        
	        JOptionPane.showMessageDialog(null, "La carrera selecionada fue: "+resp, "Carreras Profesionales", JOptionPane.INFORMATION_MESSAGE);                               
	}

}
