package com.sirklaude.siges.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Claudio
 * @version 1.0
 * @created 22-jul-2020 16:09:47
 */
@Entity
@Table(name = "Region")
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idregion")
	private int idRegion;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "id_comuna")
	private Comuna comuna;
	
	@Column(name="fecha_create",insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date Fecha;

	public Region(){

	}

	public int getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}

	public String getNombre() {
		return nombre;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Comuna getComuna() {
		return comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}

	public Region(int idRegion, String nombre, Comuna comuna) {
		this.idRegion = idRegion;
		this.nombre = nombre;
		this.comuna = comuna;
	}

}//end Region