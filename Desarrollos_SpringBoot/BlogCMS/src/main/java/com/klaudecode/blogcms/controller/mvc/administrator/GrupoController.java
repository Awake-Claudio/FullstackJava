package com.klaudecode.blogcms.controller.mvc.administrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.klaudecode.blogcms.model.Grupo;
import com.klaudecode.blogcms.model.GrupoPermiso;
import com.klaudecode.blogcms.repository.GrupoPermisoRepository;
import com.klaudecode.blogcms.repository.GrupoRepository;
import com.klaudecode.blogcms.repository.PermisoRepository;

@Controller
@RequestMapping("/admin/grupo")
public class GrupoController {

    @Autowired
    private GrupoRepository grupoRepository;

    @Autowired
    private PermisoRepository permisoRepository;

    @Autowired
    private GrupoPermisoRepository grupoPermisoRepository;

    @GetMapping
    public ModelAndView getHome(
            @RequestParam(defaultValue = "all", required = false) String view_name,
            @RequestParam(defaultValue = "0", required = false) long id,
            SpringDataWebProperties.Pageable pageable
    ){
        ModelAndView modelAndView = new ModelAndView("administrator/grupo");
        switch (view_name){
            case "all":
                modelAndView.addObject("grupos", grupoRepository.findAll(pageable));
                break;
            case "new":
                modelAndView.addObject("grupo", new Grupo());
                break;
            case "update":
                modelAndView.addObject("grupo", grupoRepository.findById(id));
                modelAndView.addObject("update", true);
                modelAndView.addObject("permisos", permisoRepository.findByIdGrupo(id));
                modelAndView.addObject("permisos_disponibles", permisoRepository.findByNotIdGrupo(id));
                break;
        }
        return modelAndView;
    }

    @PostMapping
    public String newAndUpdate(
            @ModelAttribute Grupo grupo
    ){
        if (grupo.getIdGrupo() > 0){
            grupoRepository.update(grupo);
        } else {
            grupoRepository.save(grupo);
        }
        return "redirect:/admin/grupo";
    }

    @PostMapping("/addPermiso")
    public String addPermiso(@RequestParam long idGrupo,
                             @RequestParam long idPermiso){
        GrupoPermiso grupoPermiso = new GrupoPermiso();
        grupoPermiso.setIdPermiso(idPermiso);
        grupoPermiso.setIdGrupo(idGrupo);
        grupoPermisoRepository.save(grupoPermiso);
        return "redirect:/admin/grupo?view_name=update&id=" + idGrupo;
    }
}
