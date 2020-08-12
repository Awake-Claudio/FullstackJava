package com.klaudecode.blogcms.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klaudecode.blogcms.model.Contenido;
import com.klaudecode.blogcms.model.common.RepBase;
import com.klaudecode.blogcms.repository.ContenidoRepository;

@RestController
@RequestMapping("/api/v1/contenido")
public class ContenidoRestController {
	@Autowired
	private ContenidoRepository repository;
	
	@PutMapping
	public ResponseEntity<RepBase> save(@RequestBody Contenido contenido) {
		return ResponseEntity.ok(new RepBase(repository.save(contenido)));
	}
	
	@PostMapping
	public ResponseEntity<RepBase> update(@RequestBody Contenido contenido) {
		return ResponseEntity.ok(new RepBase(repository.update(contenido)));
	}

	@GetMapping
	public ResponseEntity<List<Contenido>> findAll(SpringDataWebProperties.Pageable pageable){
		return ResponseEntity.ok(repository.findAll(pageable));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Contenido> findById(@PathVariable long id){
		return ResponseEntity.ok(repository.findById(id));
	}
}
