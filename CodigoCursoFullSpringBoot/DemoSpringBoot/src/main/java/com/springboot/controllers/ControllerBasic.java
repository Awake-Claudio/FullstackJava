package com.springboot.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.configuration.Paginas;
import com.springboot.model.Post;

@Controller
@RequestMapping("/home")
public class ControllerBasic {
	
	public List <Post> getPosts(){
		ArrayList<Post> postt = new ArrayList<>();
		Post P = new Post();
		P.setId(1);
		P.setDescripcion("Diseño que representa la conexión espiritual entre una persona y su guía, ofreciendo comprensión en la mente subconsciente");
		P.setUrlImg("http://localhost/img/IMG_Spirit01.jpeg");
		P.setFecha(new Date());
		P.setTitulo("Imagen Tottem base");
		postt.add(P);
		/*
		postt.add(new Post(1,"Diseño que representa la conexión espiritual entre una persona y su guía, ofreciendo comprensión en la mente subconsciente","http://localhost/img/IMG_Spirit01.jpeg",new Date(),"Imagen Tottem base"));
		postt.add(new Post(2,"Diseño que representa la espiritualidad nativa y su conexion con animales sagrados","http://localhost/img/IMG_Spirit02.jpeg",new Date(),"Imagen Tottem Simple"));
		postt.add(new Post(3,"Diseño que representa la conexión espiritual entre una persona y su guía, ofreciendo comprensión en la mente subconsciente","http://localhost/img/IMG_Spirit01.jpeg",new Date(),"Imagen Tottem base"));
		postt.add(new Post(4,"Diseño que representa la espiritualidad nativa y su conexion con animales sagrados","http://localhost/img/IMG_Spirit02.jpeg",new Date(),"Imagen Tottem Simple"));
		*/
		return postt;
	}
	
	@GetMapping(path = {"/post","/"})
	//@GetMapping("/inicio")
	public String Saludar(Model model) {
		model.addAttribute("posts", this.getPosts());
		return "index";
	}

	@GetMapping("/public")
	public ModelAndView post() {
		ModelAndView mav = new ModelAndView(Paginas.Home);
		mav.addObject("posts", this.getPosts());
		return mav;
	}
	
	@GetMapping(path = {"/post"})
	public ModelAndView getPostIndividual(@RequestParam(defaultValue = "1", name="id", required = false) int id) {
		ModelAndView mav = new ModelAndView(Paginas.Post);
		List<Post> postFiltrado = this.getPosts().stream().filter( (p) -> {return p.getId() == id;}).collect(Collectors.toList());
		mav.addObject("post", postFiltrado.get(0));
		return mav;
	}
}
