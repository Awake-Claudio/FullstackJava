package com.sirklaude.siges.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sirklaude.siges.model.Tipo;

@Repository
public interface ITipo extends CrudRepository<Tipo, Integer>{

}
