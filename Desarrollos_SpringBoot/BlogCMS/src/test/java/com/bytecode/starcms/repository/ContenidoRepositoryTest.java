package com.bytecode.starcms.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.klaudecode.blogcms.component.TestDatabaseConfiguration;
import com.klaudecode.blogcms.model.Contenido;
import com.klaudecode.blogcms.repository.ContenidoRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class ContenidoRepositoryTest {
	@Autowired
	private ContenidoRepository contenidoRepository;
	
	@Test
	public void testinsert() {
		Contenido contenido = new Contenido ();
		
		contenido.setTipo("Tipo 01");
		contenido.setContenido("Contenido 01");
		contenido.setIdPost(1);
		
		boolean result = contenidoRepository.save(contenido);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testUpdate() {
		Contenido contenido = new Contenido ();
		contenido.setIdContenido(1);
		contenido.setTipo("Tipo 11");
		contenido.setContenido("Contenido 11");
		contenido.setIdPost(1);
		
		boolean result = contenidoRepository.update(contenido);
				
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFindById() {
		Contenido contenido = contenidoRepository.findById(1);
		
		Assert.assertTrue(contenido!=null);
		Assert.assertTrue("Contenido 01".equals(contenido.getContenido()));
	}
	
	@Test
	public void testFindAll() {
		SpringDataWebProperties.Pageable pageable = new SpringDataWebProperties.Pageable();
		Assert.assertFalse(contenidoRepository.findAll(pageable).isEmpty());
	}
}
