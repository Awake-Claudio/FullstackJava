package com.sirklaude.siges.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author mabustam
 * @version 1.0
 * @created 22-jul-2020 16:09:48
 */
@Entity
@Table(name = "Tipo")
public class Tipo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idtipo")
	private int IdTipo;
	
	@Column(name = "nombre")
	private String Nombre;
	
	@Column(name="fecha_create",insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date Fecha;

	public Tipo(){

	}

	public int getIdTipo() {
		return IdTipo;
	}

	public void setIdTipo(int idTipo) {
		IdTipo = idTipo;
	}

	public String getNombre() {
		return Nombre;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Tipo(int idTipo, String nombre) {
		IdTipo = idTipo;
		Nombre = nombre;
	}
	
}//end Tipo