package com.sirklaude.Earthquake.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sirklaude.Earthquake.model.Application;
import com.sirklaude.Earthquake.model.Metadata;
import com.sirklaude.Earthquake.repository.ApplicationRepository;
import com.sirklaude.Earthquake.repository.MetadataRepository;

@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService{

	@Autowired
	private ApplicationRepository appRepo;
	@Autowired
	private MetadataRepository metadatRepo;
	
	private List<Metadata> metadats;
	
	@Override
	public Application registrar(Application s) {
		metadatRepo.save(s.getMetadata());
		return appRepo.save(s);
	}

	@Override
	public List<Application> listar() {
		return this.appRepo.findAll();
	}

	@Override
	public Iterable<Application> registrar(List<Application> apps) {
		for (int i=0;i==apps.size();i++) {
			metadats.add(apps.get(i).getMetadata());
		}
		metadatRepo.saveAll(metadats);
		return appRepo.saveAll(apps);
	}

}
