package com.springboot2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot2.model.Usuario;
import com.springboot2.repo.IUsuarioRepo;

@Service

public class UserService implements UserDetailsService{
	
	@Autowired
	private IUsuarioRepo repo; //inyectar la capa de Repositorio

	//se especifica de donde se va a sacar los datos del usuario
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// 
		// Retornar un Usuario a partir de su username
		Usuario us = repo.findByNombre(username);
		
		/* definir los roles de usuario,  pero en caso real se debe conectar con base de datos
		 * para extraer la informacion con algoritmo para poder llenar la lista
		 */
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("Admin")); // de momento, solo un rol
		
		// generar los detalles del usuario retornado
		UserDetails userDet = new User(us.getNombre(), us.getClave(),roles);
		return userDet;
	}
	

}
