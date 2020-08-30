package com.sirklaude.siges.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @version 1.0
 * @created 22-jul-2020 17:36:01
 */

@Entity
@Table(name = "Funcionario")
@PrimaryKeyJoinColumn(referencedColumnName="IdUsuario")
public class Funcionario extends Usuario {

	@Column(name = "fecha_contrato", updatable = false, nullable = false)
	@Temporal(TemporalType.DATE)
	private Date FechaContrato;
	
	@Column(name = "vigente")
	private boolean vigente;
	
	@ManyToOne
	@JoinColumn(name = "id_valortipo")
	private ValorTipo tipoRol;
	
	public Date getFechaContrato() {
		return FechaContrato;
	}
	public void setFechaContrato(Date fechaContrato) {
		FechaContrato = fechaContrato;
	}
	public boolean isVigente() {
		return vigente;
	}
	public void setVigente(boolean vigente) {
		this.vigente = vigente;
	}
	public ValorTipo getTipoRol() {
		return tipoRol;
	}
	public void setTipoRol(ValorTipo tipoRol) {
		this.tipoRol = tipoRol;
	}
	
	public Funcionario() {
		
	}
	
	public Funcionario(int idUsuario, String userName, String passwod, String nombre, String apellidos, String correo,
			Date fechaNac, String celular, Date fecha, Date fechaContrato, boolean vigente,
			ValorTipo tipoRol) {
		super(idUsuario, userName, passwod, nombre, apellidos, correo, fechaNac, celular);
		FechaContrato = fechaContrato;
		this.vigente = vigente;
		this.tipoRol = tipoRol;
	}
	

	
}//end Funcionario