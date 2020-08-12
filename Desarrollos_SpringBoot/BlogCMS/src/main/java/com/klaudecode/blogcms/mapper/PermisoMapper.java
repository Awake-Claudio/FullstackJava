package com.klaudecode.blogcms.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.klaudecode.blogcms.model.Permiso;

public class PermisoMapper implements RowMapper<Permiso> {

	@Override
	public Permiso mapRow(ResultSet rs, int rowNum) throws SQLException {
		Permiso p = new Permiso();
		
		p.setIdPermiso(rs.getLong("IdPermiso"));
		p.setNombre(rs.getString("Nombre"));
		p.setFecha(rs.getDate("Fecha"));
		return p;
	}

}
