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
 * @author mabustam
 * @version 1.0
 * @created 22-jul-2020 16:09:49
 */
@Entity
@Table(name = "ValorTipo")
public class ValorTipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idvalortipo")
	private int IdValor;
	
	@Column(name = "nombre")
	private String Nombre;
	
	@Column(name="fecha_create",insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date Fecha;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo")
	private Tipo tipo;

	public ValorTipo(){

	}

	public int getIdValor() {
		return IdValor;
	}

	public void setIdValor(int idValor) {
		IdValor = idValor;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	
	public Tipo getTipo() {
		return tipo;
	}
	
	public String getNombreTipo() {
		return tipo.getNombre();
	}
	
	public Date getFecha() {
		return Fecha;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public ValorTipo(int idValor, String nombre, Tipo tipo) {
		IdValor = idValor;
		Nombre = nombre;
		this.tipo = tipo;
	}

	

}//end Valor Tipo