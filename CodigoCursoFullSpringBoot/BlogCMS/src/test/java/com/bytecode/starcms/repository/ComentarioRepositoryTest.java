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
import com.klaudecode.blogcms.model.Comentario;
import com.klaudecode.blogcms.repository.ComentarioRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class ComentarioRepositoryTest {

	@Autowired
	private ComentarioRepository comentarioRepository;
	
	@Test
	public void testinsert() {
		Comentario comentario = new Comentario ();
		
		comentario.setComentario("Comentario Final");
		comentario.setIdPost(1);
		comentario.setIdUsuario(1);
		comentario.setRespuesta(3);
		comentario.setFecha(new Date());
		
		boolean result = comentarioRepository.save(comentario);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testUpdate() {
		Comentario comentario = new Comentario ();
		comentario.setIdComentario(4);
		comentario.setComentario("Comentario 11");
		comentario.setIdPost(1);
		comentario.setIdUsuario(1);
		comentario.setRespuesta(3);
		comentario.setFecha(new Date());
		
		boolean result = comentarioRepository.update(comentario);
				
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFindById() {
		Comentario comentario = comentarioRepository.findById(3);
		
		Assert.assertTrue(comentario!=null);
		Assert.assertTrue("Comentario inicial".equals(comentario.getComentario()));
	}
	
	@Test
	public void testFindAll() {
		SpringDataWebProperties.Pageable pageable = new SpringDataWebProperties.Pageable();
		Assert.assertFalse(comentarioRepository.findAll(pageable).isEmpty());
	}

}
