package com.sirklaude.siges.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

/**
 * @version 1.0
 * @created 22-jul-2020 17:36:01
 */
@SuppressWarnings("deprecation")
@Entity(name = "Usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdUsuario")
	private int IdUsuario;
	
	@NotEmpty
    @Length(min=5, max=20)
	@Column(name = "username")
	private String UserName;
	
	@NotEmpty
    @Length(min=8, max=24)
	@Column(name = "passwod")
	private String Passwod;
	
	@Length(min=10, max=20)
	@Column(name = "nombre")
	private String Nombre;
	
	@Length(min=10, max=40)
	@Column(name = "apellidos")
	private String Apellidos;
	
	@NotEmpty
	 @Email
	 @Column(name = "correo")
	private String Correo;
	
	@Column(name = "celular")
	private String Celular;
	
	@Column(name = "fecha_nac", updatable = false, nullable = false)
	@Temporal(TemporalType.DATE)
	private Date FechaNac;
	
	@Column(name="fecha_create",insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date Fecha; 
	
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPasswod() {
		return Passwod;
	}
	public void setPasswod(String passwod) {
		Passwod = passwod;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public Date getFechaNac() {
		return FechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		FechaNac = fechaNac;
	}
	
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	
	public Usuario() {
		
	}
	
	public Usuario(int idUsuario, String userName, String passwod, String nombre, String apellidos, String correo,
			Date fechaNac, String celular) {
		IdUsuario = idUsuario;
		UserName = userName;
		Passwod = passwod;
		Nombre = nombre;
		Apellidos = apellidos;
		Correo = correo;
		FechaNac = fechaNac;
		Celular = celular;
	}
}//end Usuario