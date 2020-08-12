package com.arquitecturaJava.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaController {
	@RequestMapping("/hola")
	
	public String hola(){
		//vista de retorno
		return "mensaje";
	}

}
