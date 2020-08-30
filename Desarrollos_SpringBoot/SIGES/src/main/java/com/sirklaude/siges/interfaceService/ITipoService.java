package com.sirklaude.siges.interfaceService;

import java.util.List;
import java.util.Optional;

import com.sirklaude.siges.model.Tipo;
 
public interface ITipoService {
	public List<Tipo> listar();
	public Optional<Tipo> listarId(int id);
	public int save(Tipo u);
	public void delete(int id);
	
}
