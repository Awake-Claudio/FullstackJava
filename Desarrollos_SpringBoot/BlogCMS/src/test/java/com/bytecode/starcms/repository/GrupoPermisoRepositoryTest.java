package com.bytecode.starcms.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.klaudecode.blogcms.component.TestDatabaseConfiguration;
import com.klaudecode.blogcms.model.GrupoPermiso;
import com.klaudecode.blogcms.repository.GrupoPermisoRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class GrupoPermisoRepositoryTest {
	
	@Autowired
	private GrupoPermisoRepository grupopermisoRepository;
	@Test
	public void testinsert() {
		GrupoPermiso grupoP = new GrupoPermiso ();
		
		grupoP.setIdGrupo(1);
		grupoP.setIdPermiso(1);
				
		boolean result = grupopermisoRepository.save(grupoP);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testUpdate() {
		GrupoPermiso grupoP = new GrupoPermiso ();
		grupoP.setIdGrupo(1);
		grupoP.setIdPermiso(2);
		
		boolean result = grupopermisoRepository.update(grupoP);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFindById() {
		GrupoPermiso grupoP = grupopermisoRepository.findById(1);
		
		Assert.assertTrue(grupoP!=null);
		Assert.assertTrue(1==grupoP.getIdGrupo());
	}
	
	@Test
	public void testFindAll() {
		SpringDataWebProperties.Pageable pageable = new SpringDataWebProperties.Pageable();
		Assert.assertFalse(grupopermisoRepository.findAll(pageable).isEmpty());
	}

}
