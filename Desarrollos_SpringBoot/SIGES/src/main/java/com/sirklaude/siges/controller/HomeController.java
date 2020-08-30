package com.sirklaude.siges.controller;

/*
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
*/

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class HomeController { //de Tipo y ValorTipo
	
	// llamar vista de home
	@RequestMapping(value = {"/home"}, method = RequestMethod.GET)
	public String home() {
		return "/home/home"; //pagina para mostrar los usuarios
	}
	
}
