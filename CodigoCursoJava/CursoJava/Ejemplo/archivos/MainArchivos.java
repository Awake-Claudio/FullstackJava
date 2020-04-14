package archivos;
import javax.swing.*;
public class MainArchivos {

	public static void main(String[] args) {
		int Sel = -2;
		String[] Op = {"Crear Archivo", "Escribir Archivo", "Leer Archivo", "Mostrar Datos Archivo", "Eliminar Archivo"};
		Archivo archivo=new Archivo(); 		
		while (Sel!=-1) {
			Sel = JOptionPane.showOptionDialog(null, "Selecione una de las siguntes opciones", "Mantenedor Archivos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Op, Op[0]);
			switch (Sel) {
				case 0: 
						Crear(archivo);
						break;
				case 1: 
						Escribir(archivo);
						break;
				case 2: 
						archivo.Leer(archivo.getNombreArchivo());
						break;
				case 3: 
						Mostrar(archivo);
						break;
				case 4: 
						archivo.Eliminar(archivo.getNombreArchivo());
						break;
				default: System.out.println("Fin del Programa ->"+Sel);
			}
		}

	}
	
	public static void Crear(Archivo C) {
		String Nombre = null; 
		Nombre = JOptionPane.showInputDialog("Escribe Nombre del Archivo");
		if (Nombre == null) {
			System.out.println("No se ingreso el nombre del Archivo");
		} else {
			Nombre=Nombre+".txt";
			C.Crear(Nombre);
			C.setNombreArchivo(Nombre);
			System.out.println("Se creo el Archivo: "+Nombre);
		}
	}

	public static void Escribir(Archivo C) {
		if (C.existe(C.getNombreArchivo())) {
			String Texto = JOptionPane.showInputDialog("Escribe texto a escribir en el archivo");
			C.Escribir(Texto, C.getNombreArchivo());
		} else System.out.println("El Archivo "+C.getNombreArchivo()+ " No existe");
	}
	
	public static void Mostrar(Archivo C) {
		C.InfoArchivo(C.getNombreArchivo());
		JOptionPane.showMessageDialog(null, "Datos del Archivo"+C.toString(), "Mantenedor Archivos", JOptionPane.INFORMATION_MESSAGE);
	}
}
