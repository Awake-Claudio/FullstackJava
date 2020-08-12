package com.klaudecode.blogcms.model;

import java.util.Date;

public class Grupo {
	private long IdGrupo;
	private String Nombre;
	private Date Fecha;
	
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public long getIdGrupo() {
		return IdGrupo;
	}
	public void setIdGrupo(long l) {
		IdGrupo = l;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
}
