package com.springboot2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot2.service.IPersonaService;

/*
 * Esta aplicacion hace la simulacion de una aplicacion que se conecta a "Service" (Ej. Capa negocio) y este a su vez a
 * un "Repository" (Ej. BD), mediante la inyeccion de dependencias.
 */

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner{
	
	private static Logger Log = LoggerFactory.getLogger(DemoConsolaApplication.class);
	@Autowired
	private IPersonaService Service;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String Msg ="Hola a todos desde la consola de SpringBoot";
		String War = "Mensaje de Alerta desde la consola de SpringBoot";
		String Nombre = "MitoCode";
		System.out.println(Msg);
		Log.info(Msg);
		Log.warn(War);
		//Service = new PersonaServiceImpl(); las instancias serán entregadas por el framework por medio del autowired
		Service.registrar(Nombre);
		
	}

}
