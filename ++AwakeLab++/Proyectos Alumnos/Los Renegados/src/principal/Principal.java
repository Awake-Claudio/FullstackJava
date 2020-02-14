package principal;

import interfaces.Menu;

public class Principal {
	
	public static void main(String[] args) {
		
		Menu menu = new MainMenu();
		
		HpAscensor ascensor = new HpAscensor();
		
		IgnacioTecnico tec = new IgnacioTecnico();
		
		int respuesta = menu.menu();
		
		menu.seleccion(respuesta, ascensor,tec);

	}

}
