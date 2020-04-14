package Fecha;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class IngresaCampoFecha {

	public static void main(String[] args) {
		// leer fecha desde teclado asumiendo que usuario entendio formato
		String DatoFecha = JOptionPane.showInputDialog(null, "Introduzca la fecha con formato dd/mm/yyyy", "Ingresar Fecha", JOptionPane.QUESTION_MESSAGE);
		
		// se crea objeto fecha para aceder a sus metodos
        SimpleDateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        
     // Variable fecha que recibira el valor ingresado
        Date Fecha = null;
        
     // controlar la validación de formato de metodos fecha
        try{
            Fecha = FormatoFecha.parse(DatoFecha); // Fecha ingresada se convierte en tipo Date
            // Mostrar fecha con formato dd-mm-yyy
            JOptionPane.showMessageDialog(null, "La fecha ingresada es: "+DateFormat.getDateInstance().format(Fecha), "Ingresar Fecha", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){ System.out.println("invalid format");} // en caso de error formato
	}

}
