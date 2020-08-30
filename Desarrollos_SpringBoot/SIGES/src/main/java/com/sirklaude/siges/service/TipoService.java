package com.sirklaude.siges.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirklaude.siges.interfaceService.ITipoService;
import com.sirklaude.siges.interfaces.ITipo;
import com.sirklaude.siges.model.Tipo;

@Service
public class TipoService implements ITipoService{

	@Autowired
	private ITipo data;
	
	@Override
	public List<Tipo> listar() {
		return (List<Tipo>)data.findAll();
	}

	@Override
	public Optional<Tipo> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Tipo u) {
		int res=0;
		Tipo tipo=data.save(u);
		if(!tipo.equals(null)) {
			res=1;
		}
		u=null;
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
