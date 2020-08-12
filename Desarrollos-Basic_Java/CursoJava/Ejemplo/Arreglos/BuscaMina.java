package Arreglos;

import java.util.Random;

import javax.swing.JOptionPane;;

public class BuscaMina {

	public static void main(String[] args) {
		int Dim=0;
		
		while (Dim<4 || Dim>10) {
		Dim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dimencion de Cuadricula (entre 4 y 10)"));
		if (Dim<4 || Dim>10) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un numero entre 4 y 10", "BuscaMinas", JOptionPane.ERROR_MESSAGE);
		}
		}
		
		int Campo[][]  = new int [Dim][Dim];
		Random rnd = new Random();
		for(int i=0;i<Campo.length;i++) 
			for(int j=0;j<Campo.length;j++) {
				Campo[j][i]= (int)(rnd.nextDouble() * 2);
			}
		for(int x=0;x<Dim;x++) {
			System.out.print(x+"  ");
		}
			
		for(int i=0;i<Dim;i++) 
			for(int j=0;j<Dim;j++) {
				if (j==0)System.out.print("\n");
				System.out.print(Campo[j][i]+"  ");
			}
		int F=0,C=0;
		while (F>=0) {
		F = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Fila"));
		C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna"));
		
		if (Campo[C][F]==1) {
			JOptionPane.showMessageDialog(null, "En la celda hay un: "+Campo[C][F]+"\n Perdiste!!!", "Busca Minas", JOptionPane.INFORMATION_MESSAGE);
		}
		else JOptionPane.showMessageDialog(null, "En la celda hay un: "+Campo[C][F]+"\n Ganaste!!!", "Busca Minas", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("FIN");
		}	
	}

}
