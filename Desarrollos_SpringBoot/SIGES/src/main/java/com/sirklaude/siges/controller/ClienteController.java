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

import com.sirklaude.siges.interfaceService.IClienteService;
import com.sirklaude.siges.model.Cliente;

@Controller
@RequestMapping
public class ClienteController {
	@Autowired
	private IClienteService service;
	
	
	// llamar vista de Listar Cliente
	@RequestMapping(value = {"/admin/listarClientes", "/admin/listarClientes/{param}"}, method = RequestMethod.GET)
	public String listar(Model model, @PathVariable(value="param", required = false)String param) {
		List<Cliente>clientes = null;
		if (param!=null) {
			//resultado de busqueda con parametro
		} else {
			clientes=service.listar();
		}
		model.addAttribute("clientes", clientes);
		return "/admin/clientes"; //pagina para mostrar los usuarios
	}
	
	// llamar vista de Crear Cliente
	@GetMapping("/admin/crearClientes")
	public String agregar(Model model) {
		model.addAttribute("cliente", new Cliente());	
		return "/admin/new_cliente"; //pagina para crear/editar
	}
	
	// realizar el registro (nuevo o actualización) de Cliente
	@PostMapping("/save")
	public String save(@Validated Cliente c, Model model) {
	
		service.save(c); 
				
		return "redirect:/admin/listarClientes";
	}
	
	// llamar vista de Crear Cliente para editar
	@GetMapping("/editar-cli/{id}")
	public String editar(@PathVariable("id") int id, Model model) {
		Optional<Cliente>cliente=service.listarId(id);
		model.addAttribute("cliente", cliente);	
		return "/admin/new_cliente"; //pagina para crear/editar
	}
		
	@GetMapping("/eliminar-cli/{id}")
	public String borrar (@PathVariable("id") int id, Model model) {
		service.delete(id);
		return "redirect:/admin/listarClientes";
	}
	
	// llamar vista de ficha Cliente
		@GetMapping("/mostrar-cli/{id}")
		public String mostrar(@PathVariable("id") int id, Model model) {
			Optional<Cliente>cliente=service.listarId(id);
			model.addAttribute("cliente", cliente);	
			return "/admin/ficha_cliente"; //pagina para crear/editar
		}
}
