package interfaces;

import principal.HpAscensor;
import principal.IgnacioTecnico;

public interface Menu {
	/*
	 * Desplega el menu para seleccionar opcion, 
	 * debe retornar un valor INT para entregar 
	 * como parametro al metodo seleccion 
	 */
	public int menu(); 
	/*
	 * Asocia a los metodos de clase que permitiran 
	 * la funcionalidad del programa
	 */
	public void seleccion(int respuesta, HpAscensor ascensor, IgnacioTecnico tec);
	
}
