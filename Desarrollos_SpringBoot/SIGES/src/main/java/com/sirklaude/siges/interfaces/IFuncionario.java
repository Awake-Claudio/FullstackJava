package com.sirklaude.siges.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sirklaude.siges.model.Funcionario;

@Repository
public interface IFuncionario extends CrudRepository<Funcionario, Integer>{

}
