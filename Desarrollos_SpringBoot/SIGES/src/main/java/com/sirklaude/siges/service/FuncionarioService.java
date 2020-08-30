package com.sirklaude.siges.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirklaude.siges.interfaceService.IFuncionarioService;
import com.sirklaude.siges.interfaces.IFuncionario;
import com.sirklaude.siges.model.Funcionario;

@Service
public class FuncionarioService implements IFuncionarioService{

	@Autowired
	private IFuncionario data;
	
	@Override
	public List<Funcionario> listar() {
		return (List<Funcionario>)data.findAll();
	}

	@Override
	public Optional<Funcionario> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Funcionario u) {
		int res=0;
		Funcionario funcionario=data.save(u);
		if(!funcionario.equals(null)) {
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
