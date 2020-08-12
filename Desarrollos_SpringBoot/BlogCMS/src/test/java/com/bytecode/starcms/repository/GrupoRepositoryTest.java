package com.bytecode.starcms.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.klaudecode.blogcms.component.TestDatabaseConfiguration;
import com.klaudecode.blogcms.model.Grupo;
import com.klaudecode.blogcms.repository.GrupoRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class GrupoRepositoryTest {

	@Autowired
	private GrupoRepository grupoRepository;
	
	@Test
	public void testinsert() {
		Grupo grupo = new Grupo();
		
		grupo.setNombre("Grupo 1");
		
		boolean result = grupoRepository.save(grupo);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testUpdate() {
		Grupo grupo = new Grupo();
		
		grupo.setNombre("Grupo 001");
		
		boolean result = grupoRepository.update(grupo);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFindById() {
		Grupo grupo = grupoRepository.findById(2);
		
		Assert.assertTrue(grupo!=null);
		Assert.assertTrue("Visitas".equals(grupo.getNombre()));
	}
	
	@Test
	public void testFindAll() {
		SpringDataWebProperties.Pageable pageable = new SpringDataWebProperties.Pageable();
		Assert.assertFalse(grupoRepository.findAll(pageable).isEmpty());
	}
}
