package com.sirklaude.siges.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sirklaude.siges.model.Cliente;

@Repository
public interface ICliente extends CrudRepository<Cliente, Integer>{

}
