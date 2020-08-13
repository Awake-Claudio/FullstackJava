package com.sirklaude.Earthquake.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirklaude.Earthquake.model.Metadata;

public interface MetadataRepository extends JpaRepository<Metadata, Integer>{

}
