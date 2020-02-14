package interfaces;

import principal.HpAscensor;

public interface Tecnico {

	/*
	 * Permite mantener un registro de veces 
	 * que ha sido llamado
	 */
	public void llamarTecnico(HpAscensor ascensor);
		
	/*
	 * Permite saber cuantas veces ha sido llamado
	 */
	public int vecesLlamado();
}
