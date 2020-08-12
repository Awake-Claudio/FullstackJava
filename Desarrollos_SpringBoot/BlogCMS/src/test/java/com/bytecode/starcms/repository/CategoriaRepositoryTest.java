package com.bytecode.starcms.repository;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.klaudecode.blogcms.component.TestDatabaseConfiguration;
import com.klaudecode.blogcms.model.Categoria;
import com.klaudecode.blogcms.repository.CategoriaRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class CategoriaRepositoryTest {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Test
	public void testinsert() {
		Categoria categoria = new Categoria ();
		
		categoria.setNombre("Test3");
		categoria.setFecha(new Date());
		categoria.setDescripcion("Este es el tercer ejemplo de categoria");
		categoria.setCategoriaSuperior(1);
		
		boolean result = categoriaRepository.save(categoria);
		
		//categoriaRepository.deleteAll();
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void testUpdate() {
		Categoria categoria = new Categoria ();
		categoria.setIdCategoria(1);
		categoria.setNombre("TestPadre");
		categoria.setDescripcion("Este es un ejemplo de categoria Padre");
		categoria.setCategoriaSuperior(1);
		
		boolean result = categoriaRepository.update(categoria);
				
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFindById() {
		Categoria categoria = categoriaRepository.findById(1);
		
		Assert.assertTrue(categoria!=null);
		Assert.assertTrue("TestPadre".equals(categoria.getNombre()));
	}
	
	@Test
	public void testFindAll() {
		SpringDataWebProperties.Pageable pageable = new SpringDataWebProperties.Pageable();
		Assert.assertFalse(categoriaRepository.findAll(pageable).isEmpty());
	}
}
