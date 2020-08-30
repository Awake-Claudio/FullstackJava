package com.sirklaude.siges.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirklaude.siges.interfaceService.IValorTipoService;
import com.sirklaude.siges.interfaces.IValorTipo;
import com.sirklaude.siges.model.Tipo;
import com.sirklaude.siges.model.ValorTipo;

@Service
public class ValorTipoService implements IValorTipoService{

	@Autowired
	private IValorTipo data;
	
	@Override
	public List<ValorTipo> listar() {
		return (List<ValorTipo>)data.findAll();
		
	}

	@Override
	public Optional<ValorTipo> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(ValorTipo u) {
		int res=0;
		ValorTipo valortipo=data.save(u);
		if(!valortipo.equals(null)) {
			res=1;
		}
		u=null;
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public List<ValorTipo> listarxtipo(Tipo tipo){
		return (List<ValorTipo>)data.findByTipo(tipo);
	}

}
