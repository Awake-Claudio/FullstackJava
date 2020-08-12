package GuiaEjerciciosDia17;

public class Vendedor extends Empleado{

	public Vendedor() {
		super();
	}
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param salario
	 */
	public Vendedor(String nombre, String apellido, int edad, int salario) {
		super(nombre, apellido, edad, salario);
	}

	@Override
	public String toString() {
		return super.toString();
	}


}
