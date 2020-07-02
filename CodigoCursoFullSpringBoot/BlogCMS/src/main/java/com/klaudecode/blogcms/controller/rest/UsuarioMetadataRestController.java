package com.klaudecode.blogcms.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klaudecode.blogcms.model.UsuarioMetadata;
import com.klaudecode.blogcms.model.common.RepBase;
import com.klaudecode.blogcms.repository.UsuarioMetadataRepository;

@RestController
@RequestMapping("/api/v1/usuariometaData")
public class UsuarioMetadataRestController {
	@Autowired
	private UsuarioMetadataRepository repository;
	
	@PutMapping
	public ResponseEntity<RepBase> save(@RequestBody UsuarioMetadata usuariometaData) {
		return ResponseEntity.ok(new RepBase(repository.save(usuariometaData)));
	}
	
	@PostMapping
	public ResponseEntity<RepBase> update(@RequestBody UsuarioMetadata usuariometaData) {
		return ResponseEntity.ok(new RepBase(repository.update(usuariometaData)));
	}

	@GetMapping
	public ResponseEntity<List<UsuarioMetadata>> findAll(SpringDataWebProperties.Pageable pageable){
		return ResponseEntity.ok(repository.findAll(pageable));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UsuarioMetadata> findById(@PathVariable long id){
		return ResponseEntity.ok(repository.findById(id));
	}
}
