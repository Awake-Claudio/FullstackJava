package principal;
import java.util.Scanner;
import principal.HpAscensor;

import interfaces.Menu;

public class MainMenu implements Menu{
	
	public MainMenu() {
		super();
	}

	@Override
	public int menu() {	
		int resultado;
		Scanner scan = new Scanner(System.in);
		System.out.println( "------------------------------------------------------------ \n"
				+ 		    "------------------MENU ASISTENCIA ASCENSOR------------------ \n"
				+ 		    "------------------------------------------------------------ \n"
				+ 		    "1) INGRESAR PERSONAS A ASCENSOR \n"
				+			"2) MOSTRAR ESTADISTICAS DE USO  \n"
				+			"3) LLAMAR A TECNICO             \n"
				+			"4) SALIR                        \n \n"
				+			"> INGRESE SU OPCION:            \n"
				);
		
		while (true) {
			String ingreso;
	        ingreso = scan.nextLine();
		    try {
		        resultado = Integer.parseInt(ingreso);
		    } 
		    catch(Exception e) {
		        System.out.println("INGRESO INVALIDO, POR FAVOR SELECCIONE UNA OPCION:");
		        continue;
		    }
		    if (resultado != 1 && resultado != 2 && resultado != 3 && resultado !=4) {
		        System.out.println("INGRESO INVALIDO, POR FAVOR SELECCIONE UNA OPCION: \n");
		        continue;
		    }
		    else if (resultado == 4) {
		    	System.out.println("SALIENDO DEL PROGRAMA. ADIOS!");
		    	System.exit(0);
		    }
		    else {
		        break;
		    }
		    
		}
		return resultado;
		
	}

	@Override
	public void seleccion(int respuesta, HpAscensor ascensor, IgnacioTecnico tec) {
		switch(respuesta) {
		case 1: ascensor.subirPersona();
				int respuestaAux = menu();
				seleccion(respuestaAux, ascensor, tec);
				break;
		case 2: ascensor.estadisticasIngreso();
				int respuestaAux2 = menu();
				seleccion(respuestaAux2, ascensor, tec);
				break;
		case 3: tec.llamarTecnico(ascensor);
				break;

		}
	}

}
