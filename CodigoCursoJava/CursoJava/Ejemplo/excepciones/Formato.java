package excepciones;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Formato {

	public static void main(String[] args) {
		Numeros();
		Fechas();
	}
	
	public static void Numeros () {
		String respuesta = JOptionPane.showInputDialog("Ingrese un numero");
		try {
			int Numero = Integer.parseInt(respuesta);
			System.out.println("Se ingreso el numero: "+Numero);
			
		}catch (NumberFormatException exger){
			System.out.println("NO Se ingreso un numero, se ingreso: "+respuesta);
		}
	}
	
	public static void Fechas () {
		String FechaIn = JOptionPane.showInputDialog("Introduzca la fecha con formato dd/mm/yyyy");
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date DatoFecha = null;
		try{
			DatoFecha = df.parse(FechaIn); 
            System.out.println("Se ingreso la fecha, "+DateFormat.getDateInstance().format(DatoFecha));
        } catch (Exception e){ System.out.println("Se ingreso fecha con formato invalido ->"+FechaIn);} // en caso de error formato
		
	}
		
	
	

}
