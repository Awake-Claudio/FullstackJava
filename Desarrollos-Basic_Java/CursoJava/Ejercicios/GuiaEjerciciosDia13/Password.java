package GuiaEjerciciosDia13;

public class Password {
	private int longitud;
	private String Contraseña;

	public Password() { // Constructor Default
		
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public Password(int largo) { // Constructor para generar pass con largo definido y contraseña fuerte
		longitud = largo;
		Contraseña = GenerarContraseñaFuerte (largo);
	}
	
	public String generarPassword() {
		char[] universo   = {'0','1','2','3','4','5','6','7','8','9',
		'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z',
		'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		char[] conjunto = new char[longitud];
		String pass;
		int n=0;
		
		for(int i=0;i<longitud;i++) 
		{
				n = (int)(Math.random()*64);
				conjunto[i] = universo[n]; 
	    }
		pass = new String(conjunto);
		return pass;
	}
	
	public String GenerarContraseñaFuerte (int largo) { // ideal si largo es mayor a 10
		// +++++ universo de valores ++++++
		char[] numeros   = {'0','1','2','3','4','5','6','7','8','9'}; 
		char[] letrasmin = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] letrasmay = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		// +++++++++++
		int n=0; 
		int lmin=0;
		int lmay=0;
		char[] conjunto = new char[largo];
		String pass;
		
		for(int i=0;i<largo;i++) 
		{
			
			switch (i) 
			{ 
			case 0: case 1: case 2: case 3: case 4: case 5: // Ingresa primeros numeros  
				n = (int)(Math.random()*10);
			    conjunto[i] = numeros[n]; 
			break;
			case 6: case 7: // Ingresa minusculas
				lmin = (int)(Math.random()*27);
				conjunto[i] = letrasmin[lmin]; 
			break;
			default:
				lmay = (int)(Math.random()*27);
				conjunto[i] = letrasmay[lmay]; // Ingresa mayusculas
			break; 
			}
		}
		pass = new String(conjunto);
		return pass;
	}
	
	public boolean esfuerte() {
		boolean Resultado=false;
		int cuentanum=0;
		int cuentamin=0;
		int cuentamay=0;
		char[] toCharArray = Contraseña.toCharArray(); // transformar string en arreglo de caracteres
		
		for (int i=0; i<Contraseña.length();i++)
		{
			char Caracter = toCharArray[i];
			if (Character.isDigit(Caracter))  // saber si cada caracter es numerico
			{
				cuentanum=cuentanum+1;
			} else
				if (Character.isUpperCase(Caracter)) // saber si cada caracter es mayuscula
				{
					cuentamay=cuentamay+1;
				} else
					if (Character.isLowerCase(Caracter))
					{
						cuentamin=cuentamin+1;
					}
		}
		if (cuentanum>5 && cuentamay>2 && cuentamin>1)
		{
			Resultado = true;
		}
		return Resultado;
	}

}
