package com.klaudecode.blogcms.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.klaudecode.blogcms.model.GrupoPermiso;

public class GrupoPermisoMapper implements RowMapper<GrupoPermiso>{

	@Override
	public GrupoPermiso mapRow(ResultSet rs, int rowNum) throws SQLException {
		GrupoPermiso gp = new GrupoPermiso();
		
		gp.setIdGrupo(rs.getLong("IdGrupo"));
		gp.setIdPermiso(rs.getLong("IdPermiso"));
		return gp;
	}

}
