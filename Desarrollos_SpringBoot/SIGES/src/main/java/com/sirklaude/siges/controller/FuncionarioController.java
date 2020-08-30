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

import com.sirklaude.siges.interfaceService.IFuncionarioService;
import com.sirklaude.siges.model.Funcionario;

@Controller
@RequestMapping
public class FuncionarioController {
	@Autowired
	private IFuncionarioService service;
	
	
	// llamar vista de Listar Funcionario
	@RequestMapping(value = {"/admin/listarFuncionarios", "/admin/listarFuncionarios/{param}"}, method = RequestMethod.GET)
	public String listar(Model model, @PathVariable(value="param", required = false)String param) {
		List<Funcionario>funcionarios = null;
		if (param!=null) {
			//resultado de busqueda con parametro
		} else {
			funcionarios=service.listar();
		}
		model.addAttribute("funcionarios", funcionarios);
		return "/admin/funcionarios"; //pagina para mostrar los usuarios
	}
	
	// llamar vista de Crear Funcionario
	@GetMapping("/admin/crearFuncionarios")
	public String agregar(Model model) {
		model.addAttribute("funcionario", new Funcionario());	
		return "/admin/new_funcionario"; //pagina para crear/editar
	}
	
	// realizar el registro (nuevo o actualización) de Funcionario
	@PostMapping("/savef")
	public String save(@Validated Funcionario c, Model model) {
	
		service.save(c); 
				
		return "redirect:/admin/listarFuncionarios";
	}
	
	// llamar vista de Crear Funcionario para editar
	@GetMapping("/editar-fun/{id}")
	public String editar(@PathVariable("id") int id, Model model) {
		Optional<Funcionario>funcionario=service.listarId(id);
		model.addAttribute("funcionario", funcionario);	
		return "/admin/new_funcionario"; //pagina para crear/editar
	}
		
	@GetMapping("/eliminar-fun/{id}")
	public String borrar (@PathVariable("id") int id, Model model) {
		service.delete(id);
		return "redirect:/admin/listarFuncionarios";
	}
	
	// llamar vista de ficha Funcionario
		@GetMapping("/mostrar-fun/{id}")
		public String mostrar(@PathVariable("id") int id, Model model) {
			Optional<Funcionario>funcionario=service.listarId(id);
			model.addAttribute("funcionario", funcionario);	
			return "/admin/ficha_funcionario"; //pagina para crear/editar
		}
}
