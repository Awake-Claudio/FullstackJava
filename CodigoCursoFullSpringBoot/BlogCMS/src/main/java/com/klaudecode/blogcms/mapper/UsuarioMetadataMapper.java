package com.klaudecode.blogcms.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.klaudecode.blogcms.model.UsuarioMetadata;

public class UsuarioMetadataMapper implements RowMapper<UsuarioMetadata>{

	@Override
	public UsuarioMetadata mapRow(ResultSet rs, int rowNum) throws SQLException {
		UsuarioMetadata um = new UsuarioMetadata();
		
		um.setClave(rs.getString("Clave"));
		um.setIdUsuario(rs.getLong("IdUsuario"));
		um.setIdUsuarioMetadata(rs.getLong("IdUsuarioMetadata"));
		um.setTipo(rs.getString("Tipo"));
		um.setValor(rs.getString("Valor"));
		return um;
	}

}
