package com.klaudecode.blogcms.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klaudecode.blogcms.model.Grupo;
import com.klaudecode.blogcms.model.common.RepBase;
import com.klaudecode.blogcms.repository.GrupoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/grupo")
public class GrupoRestController {
    @Autowired
    private GrupoRepository repository;

    @PutMapping
    public ResponseEntity<RepBase> save(@RequestBody Grupo grupo){
        return ResponseEntity.ok(new RepBase(repository.save(grupo)));
    }

    @PostMapping
    public ResponseEntity<RepBase> update(@RequestBody Grupo grupo){
        return ResponseEntity.ok(new RepBase(repository.update(grupo)));
    }

    @GetMapping
    public ResponseEntity<List<Grupo>> findAll(SpringDataWebProperties.Pageable pageable){
        return ResponseEntity.ok(repository.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grupo> findById(@PathVariable int id){
        return ResponseEntity.ok(repository.findById(id));
    }
}
