package com.klaudecode.blogcms.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klaudecode.blogcms.model.GrupoPermiso;
import com.klaudecode.blogcms.model.common.RepBase;
import com.klaudecode.blogcms.repository.GrupoPermisoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/grupopermiso")
public class GrupoPermisoRestController {
    @Autowired
    private GrupoPermisoRepository repository;

    @PutMapping
    public ResponseEntity<RepBase> save(@RequestBody GrupoPermiso grupoPermiso){
        return ResponseEntity.ok(new RepBase(repository.save(grupoPermiso)));
    }

    @PostMapping
    public ResponseEntity<RepBase> update(@RequestBody GrupoPermiso grupoPermiso){
        return ResponseEntity.ok(new RepBase(repository.update(grupoPermiso)));
    }

    @GetMapping
    public ResponseEntity<List<GrupoPermiso>> findAll(SpringDataWebProperties.Pageable pageable){
        return ResponseEntity.ok(repository.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GrupoPermiso> findById(@PathVariable int id){
        return ResponseEntity.ok(repository.findById(id));
    }
}
