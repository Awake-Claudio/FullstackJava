package com.springboot2.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springboot2.DemoConsolaApplication;

//Anotacion que indica el stereotipo que representa un acceso a datos y/o repositorios
@Repository 
@Qualifier("persona2")
public class PersonaRepoImpl2 implements IPersonaRepo{
	
	private static Logger Log = LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		String Msg = "Se muestra a : "+nombre;
		Log.info(Msg);
		
	}

}
