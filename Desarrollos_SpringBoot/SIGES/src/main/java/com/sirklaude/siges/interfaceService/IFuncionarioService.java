package com.sirklaude.siges.interfaceService;

import java.util.List;
import java.util.Optional;

import com.sirklaude.siges.model.Funcionario;

public interface IFuncionarioService {
	public List<Funcionario> listar();
	public Optional<Funcionario> listarId(int id);
	public int save(Funcionario u);
	public void delete(int id);
}
