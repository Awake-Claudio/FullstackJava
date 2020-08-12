package Enums;

import javax.swing.JOptionPane;

public class MainEnum {
	/*
	 * TipoUsuario es una Enumeracion (Enum) que contiene constantes
	 */

	public static void main(String[] args) {
		int i=0;
		for (TipoUsuario Tipo : TipoUsuario.values()) { //Recorrer la Enumeración y mostrar lo que tiene			  
			System.out.println(Tipo+"-"+i);				// simulamos la posicion de cada enum
			i=i+1;
			}
		TipoUsuario[] Tipo = TipoUsuario.values(); // Se crear un arreglo que contendra los valores de la Enumeración
		
		// Mostramos los valores de la enumeracion como opciones a seleccionar (se comprueba sus valores)
		int User = JOptionPane.showOptionDialog(null, "Selecione un Tipo de Usuario", 
				"Adminsitración de Usuario", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
				Tipo, Tipo[0]); 
		
		// como sabemos que los Enums estan en un arreglo, la opcion elegida es la posicion en el arreglo
		JOptionPane.showMessageDialog(null, "la opcion elegida fue: "+Tipo[User], "Seleción de opciones", JOptionPane.INFORMATION_MESSAGE);

	}

}
