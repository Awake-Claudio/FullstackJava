package com.klaudecode.blogcms.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.klaudecode.blogcms.model.Usuario;

public class UsuarioMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario user = new Usuario();
		
		user.setApellido(rs.getString("Apellido"));
		user.setContrasena(rs.getString("Contrasena"));
		user.setCorreo(rs.getString("Correo"));
		user.setIdGrupo(rs.getLong("IdGrupo"));
		user.setIdUsuario(rs.getLong("IdUsuario"));
		user.setNombre(rs.getString("Nombre"));
		return user;
	}

}
