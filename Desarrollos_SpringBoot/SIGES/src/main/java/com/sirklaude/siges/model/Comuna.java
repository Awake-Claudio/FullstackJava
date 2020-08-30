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
 * @author Claudio
 * @version 1.0
 * @created 22-jul-2020 16:09:47
 */

@Entity
@Table(name = "Comuna")
public class Comuna {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int IdComuna;

	@Column(name = "nombre")
	private String Nombre;
	
	@Column(name="fecha_create",insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date Fecha;

	public Comuna(){

	}

	public int getIdComuna() {
		return IdComuna;
	}

	public void setIdComuna(int idComuna) {
		IdComuna = idComuna;
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

	public Comuna(int idComuna, String nombre) {
		IdComuna = idComuna;
		Nombre = nombre;
	}

}//end Comuna