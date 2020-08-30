package com.sirklaude.siges.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sirklaude.siges.interfaceService.ITipoService;
import com.sirklaude.siges.interfaceService.IValorTipoService;
import com.sirklaude.siges.model.Tipo;
import com.sirklaude.siges.model.ValorTipo;

@Controller
@RequestMapping
public class TipoController { //de Tipo y ValorTipo
	@Autowired
	private ITipoService service;
	
	@Autowired
	private IValorTipoService valorservice;
	
	// llamar vista de Listar Tipo
	@RequestMapping(value = {"/admin/listarTipos"}, method = RequestMethod.GET)
	public String listar(Model model, @PathVariable(value="param", required = false)String param) {
		List<Tipo>tipos = null;
		if (param!=null) {
			//resultado de busqueda con parametro
		} else {
			tipos=service.listar();
		}
		model.addAttribute("tipos", tipos);
		return "/admin/tipos"; //pagina para mostrar los usuarios
	}
	
	// llamar vista de Crear Tipo
	@GetMapping("/admin/crearTipos")
	public String agregar(Model model) {
		model.addAttribute("tipo", new Tipo());	
		return "/admin/new_tipo"; //pagina para crear/editar
	}
	
	// realizar el registro (nuevo o actualización) de Tipo
	@PostMapping("/savet")
	public String save(@Validated Tipo c, Model model) {
	
		service.save(c); 
				
		return "redirect:/admin/listarTipos";
	}
	
	// llamar vista de Crear Tipo para editar
	@GetMapping("/editar-tip/{id}")
	public String editar(@PathVariable("id") int id, Model model) {
		Optional<Tipo>tipo=service.listarId(id);
		model.addAttribute("tipo", tipo);	
		return "/admin/new_tipo"; //pagina para crear/editar
	}
		
	@GetMapping("/eliminar-tip/{id}")
	public String borrar (@PathVariable("id") int id, Model model) {
		service.delete(id);
		return "redirect:/admin/listarTipos";
	}
	
	@GetMapping("/mostrar-val/{id}")
	public String mostrar(@PathVariable("id") int idTipo, Model model) {
		Optional<Tipo> tipo = service.listarId(idTipo); // Obtener el objeto tipo a partir de su id
		Tipo tipov = tipo.get(); // pasar el valor opcional<tipo> a objeto de Tipo
		List<ValorTipo>valorTipos = valorservice.listarxtipo(tipov); // Buscar los valores tipo del Tipo indicado
		model.addAttribute("valorTipos", valorTipos);
		return "/admin/valores_tipos"; //pagina para crear/editar
		}
	
	@GetMapping("/crear-val/{id}")
	public String crear(@PathVariable("id") int idTipo, Model model) {
		Optional<Tipo> tipo = service.listarId(idTipo); // Obtener el objeto tipo a partir de su id
		//Tipo tipov = tipo.get(); // pasar el valor opcional<tipo> a objeto de Tipo
		// llamar a crear vaalor tipo tomando el valor tipo
		return "/admin/new_valortipo"; //pagina para crear/editar
		}
	
	// llamar vista de Crear valor Tipo
		@GetMapping("/admin/crearValorTipo")
		public String agregarValor(Model model) {
			model.addAttribute("tipo", new Tipo());	
			return "/admin/new_valortipo"; //pagina para crear/editar
		}
	}
