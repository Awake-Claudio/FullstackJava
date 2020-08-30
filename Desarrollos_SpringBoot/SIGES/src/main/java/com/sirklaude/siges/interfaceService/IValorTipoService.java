package com.sirklaude.siges.interfaceService;

import java.util.List;
import java.util.Optional;

import com.sirklaude.siges.model.Tipo;
import com.sirklaude.siges.model.ValorTipo;
 
public interface IValorTipoService {
	public List<ValorTipo> listar();
	public Optional<ValorTipo> listarId(int id);
	public int save(ValorTipo u);
	public void delete(int id);
	public List<ValorTipo> listarxtipo(Tipo tipo);
	
}
