package principal;


import java.util.HashMap;
import java.util.Map;

import interfaces.Tecnico;

public class IgnacioTecnico implements Tecnico {
	int cantidad1, cantidad2, cantidad3;
	int cantidad4, cantidad5, cantidad6;

	@Override
	public void llamarTecnico(HpAscensor ascensor) {
		Map<String, Integer> coleccion = new HashMap<String,Integer>();
		coleccion.put(ascensor.tramos.get(1),ascensor.getCantidadTramo1());
		coleccion.put(ascensor.tramos.get(2),ascensor.getCantidadTramo2());
		coleccion.put(ascensor.tramos.get(3),ascensor.getCantidadTramo3());
		coleccion.put(ascensor.tramos.get(4),ascensor.getCantidadTramo4());
		coleccion.put(ascensor.tramos.get(5),ascensor.getCantidadTramo5());
		coleccion.put(ascensor.tramos.get(6),ascensor.getCantidadTramo6());
		Integer min = coleccion.entrySet()
	            .stream()
	            .min((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
	            .get()
	            .getValue();
		String key = coleccion.entrySet()
	            .stream()
	            .min((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
	            .get()
	            .getKey();
		System.out.println("El menor flujo de gente fue:  "+min);
		System.out.println("Se sugiere llamar al tecnico en el siguiente horario: "+key);
		
	}

	@Override
	public int vecesLlamado() {
		// TODO Auto-generated method stub
		return 0;
	}

}
