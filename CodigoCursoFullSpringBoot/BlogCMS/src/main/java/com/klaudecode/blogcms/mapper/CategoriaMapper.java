package com.klaudecode.blogcms.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.klaudecode.blogcms.model.Categoria;

public class CategoriaMapper implements RowMapper<Categoria>{

	@Override
	public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categoria categoria = new Categoria();
		
		categoria.setCategoriaSuperior(rs.getLong("CategoriaSuperior"));
		categoria.setDescripcion(rs.getString("Descripcion"));
		categoria.setFecha(rs.getDate("Fecha"));
		categoria.setIdCategoria(rs.getLong("IdCategoria"));
		categoria.setNombre(rs.getString("Nombre"));
		return categoria;
	}
	
	
	
	
	

}
