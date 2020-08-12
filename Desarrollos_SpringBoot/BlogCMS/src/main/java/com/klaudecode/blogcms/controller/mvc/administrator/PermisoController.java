package com.klaudecode.blogcms.controller.mvc.administrator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.klaudecode.blogcms.model.Permiso;
import com.klaudecode.blogcms.repository.PermisoRepository;

@Controller
@RequestMapping("/admin/permiso")
public class PermisoController {
    @Autowired
    private PermisoRepository permisoRepository;
    private Log log = LogFactory.getLog(getClass());

    @GetMapping
    public ModelAndView getHome(
            @RequestParam(defaultValue = "", required = false) String view_name,
            SpringDataWebProperties.Pageable pageable,
            @RequestParam(defaultValue = "0", required = false) long id
    ){
        ModelAndView modelAndView = new ModelAndView("administrator/permiso");
        switch (view_name){
            case "":
                modelAndView.addObject("permisos", permisoRepository.findAll(pageable));
                break;
            case "new":
                modelAndView.addObject("permiso", new Permiso());
                break;
            case "update":
                modelAndView.addObject("permiso", permisoRepository.findById(id));
                break;
            default:
                modelAndView.addObject("permisos", permisoRepository.findAll(pageable));
        }
        return modelAndView;
    }

    @PostMapping
    public String newAndUpdate(@ModelAttribute Permiso permiso){
        if (permiso.getIdPermiso() > 0){
            permisoRepository.update(permiso);
        } else {
            permisoRepository.save(permiso);
        }
        log.info(String.format("Permiso: {nombre:%s} agregado", permiso.getNombre()));
        return "redirect:/admin/permiso";
    }

    @DeleteMapping
    public String delete(
            @RequestParam long id
    ){
        permisoRepository.deleteById(id);
        return "redirect:/admin/permiso";
    }
}
