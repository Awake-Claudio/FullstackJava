package com.klaudecode.blogcms.controller.mvc.administrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.klaudecode.blogcms.model.Categoria;
import com.klaudecode.blogcms.repository.CategoriaRepository;

@Controller
@RequestMapping("/admin/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @GetMapping
    public ModelAndView getHome(
            @RequestParam(defaultValue = "all", required = false) String view_name,
            @RequestParam(defaultValue = "0", required = false) long id,
            SpringDataWebProperties.Pageable pageable
    ){
        ModelAndView modelAndView = new ModelAndView("administrator/categoria");
        switch (view_name){
            case "all":
                modelAndView.addObject("categorias", categoriaRepository.findAll(pageable));
                break;
            case "new":
                modelAndView.addObject("categoria", new Categoria());
                break;
            case "update":
                modelAndView.addObject("categoria", categoriaRepository.findById(id));
                break;
        }
        return modelAndView;
    }

    @PostMapping
    public String newAndUpdate(
            @ModelAttribute Categoria categoria
    ){
        if (categoria.getIdCategoria() > 0){
            categoriaRepository.update(categoria);
        } else {
            categoriaRepository.save(categoria);
        }
        return "redirect:/admin/categoria";
    }

    @DeleteMapping
    public String deleteById(
            @RequestParam long id
    ){
        categoriaRepository.deleteById(id);
        return "redirect:/admin/categoria";
    }
}
