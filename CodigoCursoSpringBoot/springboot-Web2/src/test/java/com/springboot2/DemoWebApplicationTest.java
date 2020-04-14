package com.springboot2;

import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.springboot2.model.Usuario;
import com.springboot2.repo.IUsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoWebApplicationTest {
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder; //para permitir encriptar informacion en BD

	@Test
	public void CrearUsuario() {
		//define datos de pruebas en duro que se registrarn en BD
		Usuario us = new Usuario();
		us.setId(124);
		us.setNombre("Sirklaus");
		us.setClave(encoder.encode("Claquin-1"));
		
		// Objeto de prueba para comparar
		Usuario TestUser = repo.save(us);
		
		//caso de prueba: comprobar que TestUser retorna el objeto instanciado us, que fue registrado en BD 
		assertTrue(TestUser.getClave().equalsIgnoreCase(us.getClave()));
		
		
	}
}
