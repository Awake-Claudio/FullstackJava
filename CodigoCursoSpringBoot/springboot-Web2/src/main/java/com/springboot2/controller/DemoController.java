package com.springboot2.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot2.model.Persona;
import com.springboot2.repo.IPersonaRepo;

@Controller // controlar el redireccionamiento de la logica de negocio
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;

	@GetMapping("/inicio") 
	/* a traves de la petición GET (pagina web) se puede acceder al metodo a continuación
	*  "/inicio" es el dato que se ingresa en la URL para que ejecute este controlador 
	*/ 
	
   /* Controlador sin BD
	* 
	*
	*public String greeting(@RequestParam(name="name", required=false, defaultValue="FullStack Coder")String name, Model model) {
	*	String pagina="greetingpage"; //"linkpage"
	*	// name será el parametro que se usará en la pagina redireccionada
	*	model.addAttribute("name", name);
	*	//"greetingpage" será, por defecto, el nombre de la pagina a mostrar
	*	// linkpage es otra pagina
	*	return pagina;
	*}
	*/
	// Controlador con BD  , defaultValue="FullStack Coder"
	public String greeting(@RequestParam(name="name", required=false)String name, Model model) {
		String pagina="linkpage";
		Random rnd = new Random();
		String Nombre = name;
		int IdPers=rnd.nextInt(100);
		
		Persona p = new Persona();
		p.setIdPersona(IdPers);
		p.setNombre(Nombre);
		repo.save(p);
		model.addAttribute("name", name);
		return pagina;
	}
	@GetMapping("/listar")
	public String greeting(Model model) {
		String pagina="PageDB";
		model.addAttribute("personas", repo.findAll());
		return pagina;
	}
}
