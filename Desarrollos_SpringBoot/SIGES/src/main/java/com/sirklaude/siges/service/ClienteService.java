package com.sirklaude.siges.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirklaude.siges.interfaceService.IClienteService;
import com.sirklaude.siges.interfaces.ICliente;
import com.sirklaude.siges.model.Cliente;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private ICliente data;
	
	@Override
	public List<Cliente> listar() {
		return (List<Cliente>)data.findAll();
	}

	@Override
	public Optional<Cliente> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Cliente u) {
		int res=0;
		Cliente cliente=data.save(u);
		if(!cliente.equals(null)) {
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
