package com.springboot2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot2.model.Usuario;

// la interfaz permite tener acceso a la base de datos donde estan los usuarios que tendran acceso al sistema
public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	// en Springboot esto permite hacer un simil a: Select * from Usuario where nombre = parametro
	Usuario findByNombre(String nombre);
}
