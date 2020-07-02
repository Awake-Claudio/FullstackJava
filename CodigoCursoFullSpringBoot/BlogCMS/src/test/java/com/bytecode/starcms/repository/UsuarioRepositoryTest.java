package com.bytecode.starcms.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.klaudecode.blogcms.component.TestDatabaseConfiguration;
import com.klaudecode.blogcms.model.Usuario;
import com.klaudecode.blogcms.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class UsuarioRepositoryTest {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Test
	public void testinsert() {
		Usuario user = new Usuario();
		
		user.setNombre("Nombre Usuario 3");
		user.setApellido("Apellido  Usuario 3");
		user.setCorreo("User3@gmail.cl");
		user.setContrasena("User-753");
		user.setIdGrupo(1);

		boolean result = usuarioRepository.save(user);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testUpdate() {
		Usuario user = new Usuario();
		
		user.setIdUsuario(1);
		user.setNombre("Claudio");
		user.setApellido("Quintana");
		user.setCorreo("clanquiva@gmail.cl");
		user.setContrasena("Claquin-753");
		user.setIdGrupo(3);

		boolean result = usuarioRepository.update(user);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFindById() {
		Usuario user = usuarioRepository.findById(1);
		
		Assert.assertTrue(user!=null);
		Assert.assertTrue("Claudio".equals(user.getNombre()));
	}
	
	@Test
	public void testFindAll() {
		SpringDataWebProperties.Pageable pageable = new SpringDataWebProperties.Pageable();
		Assert.assertFalse(usuarioRepository.findAll(pageable).isEmpty());
	}
	

}
