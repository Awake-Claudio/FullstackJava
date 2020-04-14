package com.springboot2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springboot2.repository.IPersonaRepo;

// anotacion para indicar stereotipo que representa a logica de negocio
@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	@Qualifier("persona1") //para llamar a PersonaRepoImpl1 que tiene @Qualifier("persona1")
	private IPersonaRepo Repo;

	@Override
	public void registrar(String nombre) {
		/*Repo = new PersonaRepoImpl(); las intancias ya no son necesarias con las anotaciones, 
		 * dado que las instancias seran dadas por el framework por medio de la anotacion Autowired
		 */
		Repo.registrar(nombre);
		
	}

}
