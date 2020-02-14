package fundacion;

public class Mascotas {
	String nombreM, especieM, sexoM, mostrar, mostrar1;
	int idM, añoM;
	boolean adopcionM, operacionM;
	
	public String getNombreM() {
		return nombreM;
	}
	public void setNombreM(String nombreM) {
		this.nombreM = nombreM;
	}
	public String getEspecieM() {
		return especieM;
	}
	public void setEspecieM(String especieM) {
		this.especieM = especieM;
	}
	public String getSexoM() {
		return sexoM;
	}
	public void setSexoM(String sexoM) {
		this.sexoM = sexoM;
	}
	public int getIdM() {
		return idM;
	}
	public void setIdM(int idM) {
		this.idM = idM;
	}
	public int getAñoM() {
		return añoM;
	}
	public void setAñoM(int añoM) {
		this.añoM = añoM;
	}
	public boolean isAdopcionM() {
		return adopcionM;
		
	}
	public void setAdopcionM(boolean adopcionM) {
		this.adopcionM = adopcionM;
	}
	public boolean isOperacionM() {
		return operacionM;
	}
	public void setOperacionM(boolean operacionM) {
		this.operacionM = operacionM;
	}
	
	public Mascotas(String nombreM, String especieM, String sexoM, int idM, int añoM, boolean adopcionM, boolean operacionM) {
		//super();
		this.nombreM = nombreM;
		this.especieM = especieM;
		this.sexoM = sexoM;
		this.idM = idM;
		this.añoM = añoM;
		this.adopcionM = adopcionM;
		this.operacionM = operacionM;
	}
	
	public String listarDatos() {
		if(adopcionM==true) {
			mostrar="Si";
		}else if(adopcionM==false) {
			mostrar="No";
		}
		if(operacionM==true) {
			mostrar1="Si";
		}else if(operacionM==false) {
			mostrar1="No";
		}
		return "Mascota: "+nombreM+" (Especie: "+especieM+" - Sexo: "+sexoM+") "
				+ "- Año Nac: "+añoM+" "
						+ "- Operación: "+mostrar1+" - Adopción: "+mostrar+"";
	}
	
	
	public String borrarDatos() {
	
		if(adopcionM==true) {
			mostrar="Si";
		}else if(adopcionM==false) {
			mostrar="No";
		}
		if(operacionM==true) {
			mostrar1="Si";
		}else if(operacionM==false) {
			mostrar1="No";
		}
		
		return "\n\n----"+idM+"----\n Mascota: "+nombreM+" (Especie: "+especieM+" - Sexo: "+sexoM+") "
				+ "- Año Nac: "+añoM+" "
						+ "- Operación: "+mostrar1+" - Adopción: "+mostrar+"";
	
	}
	

}

