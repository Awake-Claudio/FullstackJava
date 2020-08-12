package com.klaudecode.blogcms.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.klaudecode.blogcms.model.Contenido;

public class ContenidoMapper implements RowMapper<Contenido>{

	@Override
	public Contenido mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contenido contenido = new Contenido();
		
		contenido.setContenido(rs.getString("Contenido"));
		contenido.setIdContenido(rs.getLong("IdContenido"));
		contenido.setIdPost(rs.getLong("IdPost"));
		contenido.setTipo(rs.getString("Tipo"));
		return contenido;
	}

}
