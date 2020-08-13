package com.sirklaude.Earthquake.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sirklaude.Earthquake.model.Metadata;
import com.sirklaude.Earthquake.repository.MetadataRepository;

@Service
@Transactional
public class MetadataServiceImpl implements MetadataService{

	@Autowired
	private MetadataRepository metadatRepo;
	@Override
	public Metadata registrar(Metadata m) {
		return metadatRepo.save(m);
	}

	@Override
	public List<Metadata> listar() {
		return this.metadatRepo.findAll();
	}

	@Override
	public Iterable<Metadata> registrar(List<Metadata> metadats) {
		return metadatRepo.saveAll(metadats);
	}

}
