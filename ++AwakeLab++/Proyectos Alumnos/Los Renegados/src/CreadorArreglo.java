
public class CreadorArreglo {
	
	public int[] numeros;
	public int largoNumeros;
	
	
	 public void Redactor(int largoNumeros) {
		 numeros = new int[largoNumeros];
		 for(int a = 0; a<largoNumeros; a++) {
			 numeros[a]= a+1;
		 }
		 for(int x : numeros) {
			 System.out.println(x);
		 }
	 }
	 
}
