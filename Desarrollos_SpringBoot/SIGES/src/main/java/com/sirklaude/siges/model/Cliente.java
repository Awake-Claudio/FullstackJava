package com.sirklaude.siges.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import java.util.Date;


/**
 * @version 1.0
 * @created 22-jul-2020 17:36:00
 */
@Entity
@Table(name = "cliente")
@PrimaryKeyJoinColumn(referencedColumnName="IdUsuario")
public class Cliente extends Usuario {

	@ManyToOne
	@JoinColumn(name = "id_comuna")
	private Comuna Comuna;
	
	@ManyToOne
	@JoinColumn(name = "id_region")
	private Region Region;
	
	@ManyToOne
	@JoinColumn(name = "id_valortipo")
	private ValorTipo tipoCliente;
	
	public Comuna getComuna() {
		return Comuna;
	}
	public void setComuna(Comuna comuna) {
		Comuna = comuna;
	}
	public Region getRegion() {
		return Region;
	}
	public void setRegion(Region region) {
		Region = region;
	}
	public ValorTipo getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(ValorTipo tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	public Cliente() {
		
	}
	
	public Cliente(int idUsuario, String userName, String passwod, String nombre, String apellidos, String correo,
			Date fechaNac, String celular, com.sirklaude.siges.model.Comuna comuna,
			com.sirklaude.siges.model.Region region, ValorTipo tipoCliente) {
		super(idUsuario, userName, passwod, nombre, apellidos, correo, fechaNac, celular);
		Comuna = comuna;
		Region = region;
		this.tipoCliente = tipoCliente;
	}
	
	

}//end Cliente