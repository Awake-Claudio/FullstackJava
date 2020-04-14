package GuiaEjerciciosDia13;
import java.util.*; 

public class PassMain {

	public static void main(String[] args) {
		int largo=0;
		int cantidad=0;
		
		Scanner dato = new Scanner(System.in);
		
		System.out.println("Ingrese el largo de la Password: "); 
		
		largo=dato.nextInt();
		
		System.out.println("Ingrese cantidad de Password a crear: "); 
		
		cantidad=dato.nextInt();
		
		ArrayList<Password> Coleccion = new ArrayList<Password>(); // declara arreglos de password
		ArrayList<Boolean> Coleccion2 = new ArrayList<Boolean>(); // declara arreglos de booleanos 
		
		for (int i=0; i<cantidad;i++)
		{
			Password Pass = new Password(largo);		// instanciar objeto password
			Coleccion.add(i, Pass);						// guardar objeto password en arreglo de password
			Coleccion2.add(i, Pass.esfuerte());			// guardar resultado en arreglo booleano
		}
		
		for (int j=0; j<cantidad;j++)
		{
			System.out.println("La Password -> "+Coleccion.get(j).getContraseña()+" -> "+Coleccion2.get(j));
		}
		dato.close();
		
		
		/*System.out.println("La password que se ha creado es: "+Pass.getContraseña());
		
		if (Pass.esfuerte())
		{
			System.out.println("La password es Fuerte");
		} else System.out.println("La password es Debil"); */
	}

}
