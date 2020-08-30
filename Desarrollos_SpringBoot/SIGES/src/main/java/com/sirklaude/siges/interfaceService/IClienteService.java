package com.sirklaude.siges.interfaceService;

import java.util.List;
import java.util.Optional;

import com.sirklaude.siges.model.Cliente;
 
public interface IClienteService {
	public List<Cliente> listar();
	public Optional<Cliente> listarId(int id);
	public int save(Cliente u);
	public void delete(int id);
	
}
