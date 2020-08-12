package com.klaudecode.blogcms.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
// Cache para cargar/introducir datos en BD más rapido 
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
//------------
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klaudecode.blogcms.model.Categoria;
import com.klaudecode.blogcms.model.common.RepBase;
import com.klaudecode.blogcms.repository.CategoriaRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaRestController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @PutMapping
    @CacheEvict(value="categorias", allEntries = true)
    public ResponseEntity<RepBase> save(@RequestBody @Valid Categoria categoria){
        return ResponseEntity.ok(new RepBase(categoriaRepository.save(categoria)));
    }

    @PostMapping
    @CacheEvict(value="categorias", allEntries = true)
    public ResponseEntity<RepBase> update(@RequestBody @Valid Categoria categoria){
        return ResponseEntity.ok(new RepBase(categoriaRepository.update(categoria)));
    }

    @DeleteMapping("/{id}")
    @CacheEvict(value="categorias", allEntries = true)
    public ResponseEntity<RepBase> delete(@PathVariable long id){
        return ResponseEntity.ok(new RepBase(categoriaRepository.deleteById(id)));
    }

    @GetMapping
    @Cacheable(value="categorias")
    public ResponseEntity<List<Categoria>> findAll(SpringDataWebProperties.Pageable pageable){
        return ResponseEntity.ok(categoriaRepository.findAll(pageable));
    }

    @GetMapping("/{id}")
    @Cacheable(value="categorias")
    public ResponseEntity<Categoria> findById(@PathVariable long id){
        return ResponseEntity.ok(categoriaRepository.findById(id));
    }
}
