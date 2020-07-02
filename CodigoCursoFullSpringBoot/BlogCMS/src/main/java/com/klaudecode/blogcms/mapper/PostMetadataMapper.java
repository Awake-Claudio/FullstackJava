package com.klaudecode.blogcms.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.klaudecode.blogcms.model.PostMetadata;

public class PostMetadataMapper implements RowMapper<PostMetadata> {

	@Override
	public PostMetadata mapRow(ResultSet rs, int rowNum) throws SQLException {
		PostMetadata pm = new PostMetadata();
		
		pm.setClave(rs.getString("Clave"));
		pm.setIdPost(rs.getLong("IdPost"));
		pm.setIdPostMetadata(rs.getLong("IdPostMetadata"));
		pm.setTipo(rs.getString("Tipo"));
		pm.setValor(rs.getString("Valor"));
		return pm;
	}

}
