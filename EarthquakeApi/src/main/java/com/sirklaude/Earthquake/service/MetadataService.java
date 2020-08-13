package com.sirklaude.Earthquake.service;

import java.util.List;

import com.sirklaude.Earthquake.model.Metadata;

public interface MetadataService {
	Metadata registrar(Metadata m); //Guarda uno
	List<Metadata> listar();
	Iterable<Metadata> registrar(List<Metadata> metadatas); // Guarda varios
}
