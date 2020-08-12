package com.bytecode.starcms.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.klaudecode.blogcms.component.TestDatabaseConfiguration;
import com.klaudecode.blogcms.model.PostMetadata;
import com.klaudecode.blogcms.repository.PostMetadataRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class PostMetadataRepositoryTest {
	@Autowired
	private PostMetadataRepository postMetadataRepository;
	
	@Test
	public void testinsert() {
		PostMetadata postMetadata = new PostMetadata ();
		
		postMetadata.setClave("Clave 02");
		postMetadata.setIdPost(1);
		postMetadata.setTipo("Tipo 02");
		postMetadata.setValor("Valor 02");
		
		boolean result = postMetadataRepository.save(postMetadata);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testUpdate() {
		PostMetadata postMetadata = new PostMetadata ();
		postMetadata.setIdPostMetadata(1);
		postMetadata.setClave("Clave 011");
		postMetadata.setIdPost(1);
		postMetadata.setTipo("Tipo 011");
		postMetadata.setValor("Valor 011");
		
		boolean result = postMetadataRepository.update(postMetadata);
				
		Assert.assertTrue(result);
	}
	
	@Test
	public void testFindById() {
		PostMetadata postMetadata = postMetadataRepository.findById(1);
		
		Assert.assertTrue(postMetadata!=null);
		Assert.assertTrue("Clave 011".equals(postMetadata.getClave()));
	}
	
	@Test
	public void testFindAll() {
		SpringDataWebProperties.Pageable pageable = new SpringDataWebProperties.Pageable();
		Assert.assertFalse(postMetadataRepository.findAll(pageable).isEmpty());
	}
}
