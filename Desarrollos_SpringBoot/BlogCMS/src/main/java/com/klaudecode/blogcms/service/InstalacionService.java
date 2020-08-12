package com.klaudecode.blogcms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.klaudecode.blogcms.model.Usuario;
import com.klaudecode.blogcms.repository.UsuarioRepository;

@Service
public class InstalacionService {
	@Autowired
	public UsuarioRepository usuarioRepository;
	@Autowired
	public Environment env;
	@Autowired
	public BCryptPasswordEncoder passwordEncoder;
	
	public void init_usuarios() {
		Usuario usuario = null;
		
		try {
			usuarioRepository.findByCorreo(env.getProperty("klaudecode.usuario.correo"));
		}catch (Exception e) {
			usuario = new Usuario();
			usuario.setNombre(env.getProperty("klaudecode.usuario.nombre"));
			usuario.setApellido("Administrador");
			usuario.setContrasena(passwordEncoder.encode(env.getProperty("klaudecode.usuario.contrasena")));
			usuario.setCorreo(env.getProperty("klaudecode.usuario.correo"));
			usuario.setIdGrupo(1);
			
			usuarioRepository.save(usuario);
		}
	}
}
