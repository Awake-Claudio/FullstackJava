package principal;

import java.util.Scanner;
import interfaces.Ascensor;
import java.util.HashMap;
import java.util.Map;


public class HpAscensor implements Ascensor{

	int cantidadTramo1=0, cantidadTramo2=0, cantidadTramo3=0;
	int cantidadTramo4=0, cantidadTramo5=0, cantidadTramo6=0;
	protected Map<Integer,String> tramos = new HashMap<Integer,String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
		put(1,"[9:00 - 10:30] hrs.");
		put(2,"]10:30 - 12:30] hrs.");
		put(3,"]12:30 - 14:00] hrs.");
		put(4,"]14:00 - 15:30] hrs.");
		put(5,"]15:30 - 17:30] hrs.");
		put(6,"]17:30 - 20:00] hrs.");
		}
	};
	/*
	 * SE LEERA INT TRAMO -  INT CANTIDAD DE PERSONAS 
	 */
	
	public HpAscensor() {
		super();
	}

	@Override
	public void subirPersona() {
		Scanner scan = new Scanner(System.in);
		int personas,tramo;
		System.out.println("Ingrese numero de personas que subiran: \n");
		while (true) {
			String numero;
			numero = scan.next();
		    try {
		    	personas = Integer.parseInt(numero);
		    } 
		    catch(Exception e) {
		        System.out.println("INGRESO INVALIDO, POR FAVOR SELECCIONE NUMERO NATURAL: \n");
		        continue;
		    }
		    if (personas <= 0) {
		        System.out.println("INGRESO INVALIDO, POR FAVOR SELECCIONE NUMERO NATURAL: \n");
		        continue;
		    }
		    else {
		        break;
		    }
		}
		System.out.println( "Ingrese el rango horario en el que suben: \n"
				+			"1) TRAMO 1:"+tramos.get(1)+"\n"
				+			"2) TRAMO 2:"+tramos.get(2)+"\n"
				+			"3) TRAMO 3:"+tramos.get(3)+"\n"
				+			"4) TRAMO 4:"+tramos.get(4)+"\n"
				+			"5) TRAMO 5:"+tramos.get(5)+"\n"
				+			"6) TRAMO 6:"+tramos.get(6)+"\n"
				);
		while (true) {
			String numero;
			numero = scan.next();
		    try {
		    	tramo = Integer.parseInt(numero);
		    } 
		    catch(Exception e) {
		        System.out.println("INGRESO INVALIDO, POR FAVOR SELECCIONE OPCION CORRECTA: \n");
		        continue;
		    }
		    if (tramo !=1 && tramo!=2 && tramo !=3 && tramo!=4 && tramo!=5 && tramo!=6) {
		        System.out.println("INGRESO INVALIDO, POR FAVOR SELECCIONE OPCION CORRECTA: \n");
		        continue;
		    }
		    else {
		        break;
		    }
		}
		switch(tramo) {
			case 1: cantidadTramo1 += personas;
					break;
			case 2: cantidadTramo2 += personas;
					break;
			case 3: cantidadTramo3 += personas;
					break;
			case 4: cantidadTramo4 += personas;
					break;
			case 5: cantidadTramo5 += personas;
					break;
			case 6: cantidadTramo6 += personas;
					break;
		}
	}

	@Override
	public void estadisticasIngreso() {
		System.out.println("------------------------------------------------------------ ");
		System.out.println("-------------------RESUMEN DE ESTADISTICAS------------------ ");
		System.out.println("------------------------------------------------------------ ");
		System.out.println(" ");
		System.out.println("Cantidad de personas por tramo: ");
		System.out.println(" ");
		System.out.println("Tramo:  "+tramos.get(1)+"  : "+cantidadTramo1);
		System.out.println("Tramo:  "+tramos.get(2)+" : "+cantidadTramo2);
		System.out.println("Tramo:  "+tramos.get(3)+" : "+cantidadTramo3);
		System.out.println("Tramo:  "+tramos.get(4)+" : "+cantidadTramo4);
		System.out.println("Tramo:  "+tramos.get(5)+" : "+cantidadTramo5);
		System.out.println("Tramo:  "+tramos.get(6)+" : "+cantidadTramo6);
		System.out.println(" ");
	}
	public int getCantidadTramo1() {
		return cantidadTramo1;
	}


	public int getCantidadTramo2() {
		return cantidadTramo2;
	}

	public int getCantidadTramo3() {
		return cantidadTramo3;
	}


	public int getCantidadTramo4() {
		return cantidadTramo4;
	}

	public int getCantidadTramo5() {
		return cantidadTramo5;
	}


	public int getCantidadTramo6() {
		return cantidadTramo6;
	}


}
