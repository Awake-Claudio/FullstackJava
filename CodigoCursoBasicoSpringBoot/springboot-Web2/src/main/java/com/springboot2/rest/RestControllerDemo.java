package com.springboot2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.springboot2.model.Persona;
import com.springboot2.repo.IPersonaRepo;

@RestController //define controlador Rest
@RequestMapping("/personas") // en la URL se agrega /personas para que se comunique con el controlador 
public class RestControllerDemo {

	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping // con la peticion GET realiza el listado de datos
	public List<Persona> Listar(){
		return repo.findAll();
	}
	
	@PostMapping // con la peticion POST realiza la insercion de datos
	public void insertar(@RequestBody Persona per) {
		repo.save(per);
	}
	
	@PutMapping // con la peticion Put realiza la modificacion de datos
	public void modificar(@RequestBody Persona per) {
		repo.save(per);
	}
	
	@DeleteMapping(value = "/{id}") // con la peticion DELETE realiza la eliminacion, es necesario pasar el id en la URL
	public void eliminar(@PathVariable("id")Integer id) { 
		repo.deleteById(id);
	}
	
}
