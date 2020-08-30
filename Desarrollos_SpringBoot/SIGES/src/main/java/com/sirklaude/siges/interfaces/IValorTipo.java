package com.sirklaude.siges.interfaces;


import java.util.List;

/*
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
*/
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sirklaude.siges.model.Tipo;
import com.sirklaude.siges.model.ValorTipo;

@Repository
public interface IValorTipo extends CrudRepository<ValorTipo, Integer>{
	
//@Query("SELECT * FROM `valor_tipo` WHERE id_tipo=:idtipo")
List<ValorTipo> findByTipo(Tipo tipo);
	
			
}
