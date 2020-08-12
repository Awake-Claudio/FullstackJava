package com.bytecode.starcms.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.klaudecode.blogcms.component.TestDatabaseConfiguration;
import com.klaudecode.blogcms.model.Post;
import com.klaudecode.blogcms.repository.PostRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class PostRepositoryTest {
	@Autowired
	private PostRepository PostRepository;
	
	@Test
	public void testinsert() {
		Post post = new Post ();
		
		post.setCategoria(1);
		post.setDescripcion("Descripcion post 2");
		post.setExtracto("Exracto post 2");
		post.setIdUsuario(1);
		post.setImagen("url imagen post 2");
		post.setSlug("slug post 2");
		post.setTipo("Tipo post 2");
		post.setTitulo("Titulo post 2");
		
		boolean result = PostRepository.save(post);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testUpdate() {
		Post post = new Post ();
		post.setIdPost(1);
		post.setCategoria(1);
		post.setDescripcion("Descripcion post 1");
		post.setExtracto("Exracto post 1");
		post.setIdUsuario(1);
		post.setImagen("url imagen post 1");
		post.setSlug("slug post 1");
		post.setTipo("Tipo post 1");
		post.setTitulo("Titulo post 1");
		
		boolean result = PostRepository.update(post);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFindById() {
		Post post = PostRepository.findById(1);
		
		Assert.assertTrue(post!=null);
		Assert.assertTrue("Titulo post 1".equals(post.getTitulo()));
	}
	
	@Test
	public void testFindAll() {
		SpringDataWebProperties.Pageable pageable = new SpringDataWebProperties.Pageable();
		Assert.assertFalse(PostRepository.findAll(pageable).isEmpty());
	}

}
