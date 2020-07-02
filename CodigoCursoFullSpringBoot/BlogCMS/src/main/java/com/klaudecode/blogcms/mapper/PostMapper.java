package com.klaudecode.blogcms.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.klaudecode.blogcms.model.Post;

public class PostMapper implements RowMapper<Post> {

	@Override
	public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
		Post p = new Post();
		
		p.setCategoria(rs.getLong("Categoria"));
		p.setDescripcion(rs.getString("Descripcion"));
		p.setExtracto(rs.getString("Extracto"));
		p.setIdPost(rs.getLong("IdPost"));
		p.setIdUsuario(rs.getLong("IdUsuario"));
		p.setImagen(rs.getString("Imagen"));
		p.setSlug(rs.getString("Slug"));
		p.setTipo(rs.getString("Tipo"));
		p.setTitulo(rs.getString("Titulo"));
		p.setFecha(rs.getDate("Fecha"));
		
		return p;
	}

}
