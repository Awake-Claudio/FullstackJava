package com.klaudecode.blogcms.model;

import java.util.Date;

public class Permiso {
	private long IdPermiso;
	private String Nombre;
	private Date Fecha;
	
	public long getIdPermiso() {
		return IdPermiso;
	}
	public void setIdPermiso(long l) {
		IdPermiso = l;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	
}
