package Fecha;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IngresaFecha {
    public static void main (String[]args) {
 
        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        // leer fecha desde teclado asumiendo que usuario entendio formato
        Scanner sc = new Scanner(System.in);		
        String fecha = sc.nextLine();
        
        // se crea objeto fecha para aceder a sus metodos
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        // Variable fecha para mostrar su valor despues de aplicar metodos fecha
        Date testDate = null;
        
        // La fecha ingresada se asigna al string date 
        String date = fecha;
        
        // para controlar la validación de formato de metodos fecha
        try{
            testDate = df.parse(date); // String date se transforma en Date y muestra resultado
            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+testDate);
            System.out.println("Fecha: "+DateFormat.getInstance().format(testDate)); // opcion 1 de formato
            System.out.println("Fecha2: "+DateFormat.getDateInstance().format(testDate)); // opcion 2 de formato
        } catch (Exception e){ System.out.println("invalid format");} // en caso de error formato
 
        if (!df.format(testDate).equals(date)){
            System.out.println("invalid date!!");
        } else {
            System.out.println("valid date");
        }
        sc.close();
 
    }
}
