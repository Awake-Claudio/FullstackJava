package EjercicioEvaluacion1;

public class Persona {
	
	public Persona(String nombre, String apellido, String genero, int fono, String email) {
		
		Nombre = nombre;
		Apellido = apellido;
		Genero = genero;
		Fono = fono;
		Email = email;
	}

	String Nombre;
	String Apellido;
	String Genero;
	int Fono;
	String Email;

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getFono() {
		return Fono;
	}

	public void setFono(int fono) {
		Fono = fono;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Persona() {
	}

	public Persona(String genero, String nombre) {
		
		Genero = genero;
		Nombre = nombre;
	}
	
public Persona(String nombre) {
		
		Nombre = nombre;
	}

@Override
public String toString() {
	return "Persona [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Genero=" + Genero + ", Fono=" + Fono + ", Email="
			+ Email + "]";
}

}
