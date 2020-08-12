package com.klaudecode.blogcms.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.klaudecode.blogcms.model.Comentario;

public class ComentarioMapper implements RowMapper<Comentario>{

	@Override
	public Comentario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Comentario comentario = new Comentario();
		
		comentario.setComentario(rs.getString("Comentario"));
		comentario.setFecha(rs.getDate("Fecha"));
		comentario.setIdComentario(rs.getLong("IdComentario"));
		comentario.setIdPost(rs.getLong("IdPost"));
		comentario.setIdUsuario(rs.getLong("IdUsuario"));
		comentario.setRespuesta(rs.getLong("Respuesta"));
		return comentario;
	}

}
