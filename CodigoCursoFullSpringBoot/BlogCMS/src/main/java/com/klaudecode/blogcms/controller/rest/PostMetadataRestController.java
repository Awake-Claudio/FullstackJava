package com.klaudecode.blogcms.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klaudecode.blogcms.model.PostMetadata;
import com.klaudecode.blogcms.model.common.RepBase;
import com.klaudecode.blogcms.repository.PostMetadataRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/postmetadata")
public class PostMetadataRestController {
    @Autowired
    private PostMetadataRepository repository;

    @PutMapping
    public ResponseEntity<RepBase> save(@RequestBody PostMetadata postMetadata){
        return ResponseEntity.ok(new RepBase(repository.save(postMetadata)));
    }

    @PostMapping
    public ResponseEntity<RepBase> update(@RequestBody PostMetadata postMetadata){
        return ResponseEntity.ok(new RepBase(repository.update(postMetadata)));
    }

    @GetMapping
    public ResponseEntity<List<PostMetadata>> findAll(SpringDataWebProperties.Pageable pageable){
        return ResponseEntity.ok(repository.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostMetadata> findById(@PathVariable int id){
        return ResponseEntity.ok(repository.findById(id));
    }
}
