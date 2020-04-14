package archivos;

import java.io.File;  // Importar la clase archivo (manipular)
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Importar la clase IOException para manejar errores
import java.util.Scanner;


public class Archivo {
	
	String NombreArchivo;
	String Contenido;
	String RutaArchivo;
	boolean EsEscribible;
	boolean EsLeible;
	long TamanoArchivo;

	//Constructores
	public Archivo() {
	}
	
	// Getters y Setters
	
	
	public String getNombreArchivo() {
		return NombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		NombreArchivo = nombreArchivo;
	}

	public String getContenido() {
		return Contenido;
	}

	public void setContenido(String contenido) {
		Contenido = contenido;
	}

	public String getRutaArchivo() {
		return RutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		RutaArchivo = rutaArchivo;
	}

	public boolean isEsEscribible() {
		return EsEscribible;
	}

	public void setEsEscribible(boolean esEscribible) {
		EsEscribible = esEscribible;
	}

	public boolean isEsLeible() {
		return EsLeible;
	}

	public void setEsLeible(boolean esLeible) {
		EsLeible = esLeible;
	}

	public long getTamanoArchivo() {
		return TamanoArchivo;
	}

	public void setTamanoArchivo(long l) {
		TamanoArchivo = l;
	}


	@Override
	public String toString() {
		return "Datos Archivo [\n NombreArchivo = " + NombreArchivo + "\n Contenido = " + Contenido + "\n RutaArchivo = " + RutaArchivo
				+ "\n EsEscribible = " + EsEscribible + "\n EsLeible = " + EsLeible + "\n TamanoArchivo = " + TamanoArchivo
				+ "bytes \n ]";
	}

	//Metodos
	public void Crear(String NombreArchivo) {
		//Crear un Archivo Vacio
		try {
		      File myObj = new File("D:/Claudio/FullStackJava/FullStakeJava/Recursos/"+NombreArchivo);
		      if (myObj.createNewFile()) {
		        System.out.println("Archivo Crerado: " + myObj.getName());
		      } else {
		        System.out.println("El Archivo ya existe");
		      }
		    } catch (IOException e) {
		      System.out.println("Ha ocurrido un error!!");
		      e.printStackTrace();
		    }
	}
	
	public boolean existe(String NombreArchivo) {
		File myObj = new File("D:/Claudio/FullStackJava/FullStakeJava/Recursos/"+NombreArchivo);
		return myObj.exists(); 
	}
	
	public void Eliminar(String NombreArchivo) {
		//Eliminar un Archivo
		File myObj = new File("D:/Claudio/FullStackJava/FullStakeJava/Recursos/"+NombreArchivo); 
	    if (myObj.delete()) { 
	      System.out.println("Se borró el archivo: " + myObj.getName());
	    } else {
	      System.out.println("Plop!!... error al intentar borrar el archivo");
	    } 

	}
	
	public void Escribir(String Mensaje, String NombreArchivo) {
		//Escribir el contenido de un archivo existente
		try {
		      FileWriter myWriter = new FileWriter("D:/Claudio/FullStackJava/FullStakeJava/Recursos/"+NombreArchivo);
		      myWriter.write(Mensaje);
		      myWriter.close();
		      System.out.println("Se escribio bien sobre el archivo!!");
		    } catch (IOException e) {
		      System.out.println("ups!! algo salio mal");
		      e.printStackTrace();
		    }
		  }
	public void InfoArchivo(String NombreArchivo) {
		//Obtener y mostrar los atributos de un archivo
		File myObj = new File("D:/Claudio/FullStackJava/FullStakeJava/Recursos/"+NombreArchivo);
	    if (myObj.exists()) {
	    	setNombreArchivo(myObj.getName());
	    	setRutaArchivo(myObj.getAbsolutePath());
	    	setEsEscribible(myObj.canWrite());
	    	setEsLeible(myObj.canRead());
	    	setTamanoArchivo(myObj.length());
	    } else {
	      System.out.println("Nop!!... el Archivo no existe!!");
	    }

	}	
	
	public void Leer(String NombreArchivo) {
		// ller el contenido de un archivos
		try {
		      File myObj = new File("D:/Claudio/FullStackJava/FullStakeJava/Recursos/"+NombreArchivo);
		      if (myObj.exists()){
		    	  Scanner myReader = new Scanner(myObj);
		    	  while (myReader.hasNextLine()) {
		    		  String data = myReader.nextLine();
		    		  System.out.println(data);
		    	  }
		    	  myReader.close();
		      } else System.out.println("El Archivo no Existe");
		    } catch (FileNotFoundException e) {
		      System.out.println("Chucha!!... ocurrio un error weon!!");
		      e.printStackTrace();
		    }

	}

}
