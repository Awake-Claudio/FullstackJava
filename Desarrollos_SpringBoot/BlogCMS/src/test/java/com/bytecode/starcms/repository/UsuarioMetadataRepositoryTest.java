package com.bytecode.starcms.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.klaudecode.blogcms.component.TestDatabaseConfiguration;
import com.klaudecode.blogcms.model.UsuarioMetadata;
import com.klaudecode.blogcms.repository.UsuarioMetadataRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class UsuarioMetadataRepositoryTest {
	@Autowired
	private UsuarioMetadataRepository usuarioMetadataRepository;
	
	@Test
	public void testinsert() {
		UsuarioMetadata usuarioMetadata = new UsuarioMetadata ();
		
		usuarioMetadata.setIdUsuario(1);
		usuarioMetadata.setClave("Clave 02");
		usuarioMetadata.setValor("Valor 02");
		usuarioMetadata.setTipo("Tipo 02");
		
		boolean result = usuarioMetadataRepository.save(usuarioMetadata);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testUpdate() {
		UsuarioMetadata usuarioMetadata = new UsuarioMetadata ();
		usuarioMetadata.setIdUsuarioMetadata(2);
		usuarioMetadata.setIdUsuario(1);
		usuarioMetadata.setClave("Clave 022");
		usuarioMetadata.setValor("Valor 022");
		usuarioMetadata.setTipo("Tipo 022");
		
		boolean result = usuarioMetadataRepository.update(usuarioMetadata);
				
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFindById() {
		UsuarioMetadata usuarioMetadata = usuarioMetadataRepository.findById(1);
		
		Assert.assertTrue(usuarioMetadata!=null);
		Assert.assertTrue("Clave 011".equals(usuarioMetadata.getClave()));
	}
	
	@Test
	public void testFindAll() {
		SpringDataWebProperties.Pageable pageable = new SpringDataWebProperties.Pageable();
		Assert.assertFalse(usuarioMetadataRepository.findAll(pageable).isEmpty());
	}
}
