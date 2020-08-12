package Fecha;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JOptionPane;


public class Ejemplos {

	public static void main(String[] args) {
		
	    LocalDate FechaLocal = LocalDate.now(); 		// Crear objeto fecha con LocalDate
	    LocalTime FechaT = LocalTime.now();				// Crear objeto fecha con LocalTime
	    LocalDateTime FechaD = LocalDateTime.now(); 	// Crear objeto fecha con LocalDateTime
	    DateTimeFormatter FechaFormato = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // Crear objeto fecha con DateTimeFormatter
	    
	    Date Fecha=null;
	    String DatoFecha = JOptionPane.showInputDialog(null, "Introduzca la fecha con formato dd/mm/yyyy", "Ingresar Fecha", JOptionPane.QUESTION_MESSAGE);
	    SimpleDateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	    try {
			Fecha = FormatoFecha.parse(DatoFecha);			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
	    // Mostrar cada una de los objetos fechas creados
	    System.out.println("*** Fechas de sistema ***");
	    System.out.println("Fecha LocalDate: "+FechaLocal); 	
	    System.out.println("Fecha LocalTime: "+FechaT);
	    System.out.println("Fecha LocalDateTime: "+FechaD);
	    
	    // cambiar formato de fecha y mostrar
	    String formattedDate = FechaLocal.format(FechaFormato);
	    System.out.println("Fecha local con formato: " + formattedDate);
	    
	    System.out.println("*** Fechas ingresada ***");
	    System.out.println("La fecha ingresada es: "+DateFormat.getDateInstance().format(Fecha));
	}

}
