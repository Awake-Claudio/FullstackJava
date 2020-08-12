package com.sirklaude.Earthquake.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sirklaude.Earthquake.model.Sismo;
import com.sirklaude.Earthquake.repository.SismoRepository;

@Service
@Transactional
public class SismoServiceImpl implements SismoService{

	@Autowired
	private SismoRepository sismoRepo;
	@Override
	public Sismo registrar(Sismo s) {
		return sismoRepo.save(s);
	}

	@Override
	public List<Sismo> listar() {
		return this.sismoRepo.findAll();
	}

	@Override
	public Iterable<Sismo> registrar(List<Sismo> sismos) {
		return sismoRepo.saveAll(sismos);
	}

}
