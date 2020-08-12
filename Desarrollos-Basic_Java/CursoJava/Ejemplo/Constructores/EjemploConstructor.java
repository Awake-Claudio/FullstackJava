package Constructores;

public class EjemploConstructor {
	int Numero;
	String Texto;
	double Decimal;
	float Flotante;
	
	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getTexto() {
		return Texto;
	}

	public void setTexto(String texto) {
		Texto = texto;
	}

	public double getDecimal() {
		return Decimal;
	}

	public void setDecimal(double decimal) {
		Decimal = decimal;
	}

	public float getFlotante() {
		return Flotante;
	}

	public void setFlotante(float flotante) {
		Flotante = flotante;
	}

	public EjemploConstructor(int numero, String texto, double decimal, float flotante) {
		
		Numero = numero;
		Texto = texto;
		Decimal = decimal;
		Flotante = flotante;
	}
	
	public EjemploConstructor() {
	
	}

	public static void main(String[] args) {
		EjemploConstructor P = new EjemploConstructor();
		P.getDecimal();
	}

}
