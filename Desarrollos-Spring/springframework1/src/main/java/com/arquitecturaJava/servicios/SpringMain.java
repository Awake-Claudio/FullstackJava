package com.arquitecturaJava.servicios;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// Crear un contexto para anotaciones
		AnnotationConfigApplicationContext Contexto = new AnnotationConfigApplicationContext();
		
		//registrar los archivos de anotaciones que son de configuracion con Component Scan
		Contexto.register(SpringConfigurador.class);
		
		// refrescar el contexto
		Contexto.refresh();
		
		//invocar el Bean
		Servicio Miservicio = Contexto.getBean(Servicio.class);
		System.out.println("Atención: "+Miservicio.Mensaje());
		Contexto.close();

	}

}
