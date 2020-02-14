package modelo;

public class Alumno {
	
	private String rut;
	private String nom;
	private String ape;
	private int edad;
	private float nota1;
	private float nota2;
	private float nota3;
	private float nota4;
	
	
	public Alumno() {
		super();
	}


	public Alumno(String rut, String nom, String ape, int edad, float nota1, float nota2, float nota3, float nota4) {
		super();
		this.rut = rut;
		this.nom = nom;
		this.ape = ape;
		this.edad = edad;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getApe() {
		return ape;
	}


	public void setApe(String ape) {
		this.ape = ape;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public float getNota1() {
		return nota1;
	}


	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}


	public float getNota2() {
		return nota2;
	}


	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}


	public float getNota3() {
		return nota3;
	}


	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}


	public float getNota4() {
		return nota4;
	}


	public void setNota4(float nota4) {
		this.nota4 = nota4;
	}
	
	
	
	
	
	
	
	
	
	

}
