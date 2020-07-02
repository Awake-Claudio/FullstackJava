package com.bytecode.starcms.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.klaudecode.blogcms.component.TestDatabaseConfiguration;
import com.klaudecode.blogcms.model.Permiso;
import com.klaudecode.blogcms.repository.PermisoRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class PermisoRepositoryTest {

	@Autowired
	private PermisoRepository permisoRepository;
	
	@Test
	public void testinsert() {
		Permiso permiso = new Permiso();
		permiso.setNombre("Permiso 1");
		
		boolean result = permisoRepository.save(permiso);
		Assert.assertTrue(result);
		
	}
	
	@Test
	public void testUpdate() {
		Permiso permiso = new Permiso();
		permiso.setNombre("Permiso 001");
		
		boolean result = permisoRepository.update(permiso);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFindById() {
		Permiso permiso = permisoRepository.findById(1);
		
		Assert.assertTrue(permiso!=null);
		Assert.assertTrue("Ejemplo".equals(permiso.getNombre()));
	}
	
	@Test
	public void testFindAll() {
		SpringDataWebProperties.Pageable pageable = new SpringDataWebProperties.Pageable();
		Assert.assertFalse(permisoRepository.findAll(pageable).isEmpty());
	}
}
