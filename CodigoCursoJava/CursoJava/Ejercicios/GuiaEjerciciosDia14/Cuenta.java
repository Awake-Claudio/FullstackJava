package GuiaEjerciciosDia14;
import javax.swing.*;

public class Cuenta {
	String titular;
	Double cantidad;

	// Constructores
	
	public Cuenta(String titular, Double cantidad) {
		
		this.titular = titular;
		this.cantidad = cantidad;
	}
	public Cuenta(String titular) {
		
		this.titular = titular;
	}
	
	// Getters, Setters y toString
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	// Metodos
	public void Ingresar(Double cantidad) {
		if (cantidad>0) {
			this.cantidad = this.cantidad + cantidad;
		}
			
	}
	
	public void Retirar(Double cantidad) {
		Double saldo;
		saldo = getCantidad();
		saldo = saldo - cantidad;
		if (saldo <0) {
			setCantidad(0.0);
		}else setCantidad(saldo);
	}
	
	// Programa Principal
	
	public static void main(String[] args) {
		
		Double SaldoInicial= (Math.random()*100); // Define un saldo inicial aleatorio
		
		String TitularCuenta=JOptionPane.showInputDialog("Ingrese Nombre del Titular de la Cuenta");
		
		Cuenta CtaCte = new Cuenta(TitularCuenta); // crear clase solo con titular
		
		CtaCte.setCantidad(SaldoInicial);			// se establece el saldo inicial en clase
		
		System.out.println(CtaCte.toString());
		
		String Operacion="";
		
		do {
			Operacion=JOptionPane.showInputDialog("Desea ingresar <I>, Retirar <R> o Salir <S>?");
			
		switch (Operacion) 
		{
		case "I": {
			System.out.println("Operación --> Ingreso");
			Double Monto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Monto a ingresar"));
			CtaCte.Ingresar(Monto);
			System.out.println("Informacipn Saldo Actual: ");
			System.out.println(CtaCte.toString());
		} break;
		case "R":{
			System.out.println("Operación --> Retiro"); 
			Double Monto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Monto a Retirar"));
			CtaCte.Retirar(Monto);
			System.out.println("Informacipn Saldo Actual: ");
			System.out.println(CtaCte.toString());
		}break;
				}
		} while (Operacion=="S");
		System.out.println("Fin Operación");
		
		
		
		
	}
}
