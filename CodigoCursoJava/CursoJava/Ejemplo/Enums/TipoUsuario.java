package Enums;

public enum TipoUsuario {
	// Valores de la Enumeracion y su representacion como string
	Alumno ("Alumno"),
	ExAlumno ("Ex-Alumno"),
	Funcionario ("Funcionario"),
	Externo ("Externo");
	
	String  tipousuario; //Atributo String
	
	// Getter y Setters
	TipoUsuario(String tipousuario){
	    this.tipousuario = tipousuario;
	}
	
	public String getTipoUsuario(){
	    return this.tipousuario;
	}
	
	//Metodo para devolver valores en string
	@Override
	public String toString() {
	    return tipousuario;
	}
}
