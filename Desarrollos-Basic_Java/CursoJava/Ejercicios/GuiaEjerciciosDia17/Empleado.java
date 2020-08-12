package GuiaEjerciciosDia17;

public abstract class Empleado {
	private String Nombre;
	private String Apellido;
	private int Edad; 
	private int Salario;
	private int Bono;
	
	
	public int getBono() {
		return Bono;
	}
	
	public void setBono(int bono) {
		Bono = bono;
	}

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
		if (Edad >= 40) setBono(100000);
	}
	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		Salario = salario;
	}
	
	public Empleado() {
		
	}
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param salario
	 */
	public Empleado(String nombre, String apellido, int edad, int salario) {
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
		Salario = salario;
		if (Edad >= 40) Bono = 100000;
	}
	
	@Override
	public String toString() {
		return "Datos del Empleado \n Nombre = " + Nombre + "\n Apellido = " + Apellido + "\n Edad = " + Edad + "\n Salario = $" + String.format("%,d", Salario)
				+ "\n Bono = $" + String.format("%,d", Bono); 
	}
	

}
