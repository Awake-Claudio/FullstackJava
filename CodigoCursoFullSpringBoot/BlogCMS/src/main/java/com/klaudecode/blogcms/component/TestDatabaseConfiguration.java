package com.klaudecode.blogcms.component;
/*
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.bytecode.tratcms.repository.CategoriaRepository;
import com.bytecode.tratcms.repository.ComentarioRepository;
import com.bytecode.tratcms.repository.ContenidoRepository;
import com.bytecode.tratcms.repository.GrupoPermisoRepository;
import com.bytecode.tratcms.repository.GrupoRepository;
import com.bytecode.tratcms.repository.PermisoRepository;
import com.bytecode.tratcms.repository.PostMetadataRepository;
import com.bytecode.tratcms.repository.PostRepository;
import com.bytecode.tratcms.repository.UsuarioMetadataRepository;
import com.bytecode.tratcms.repository.UsuarioRepository;
*/
import org.springframework.context.annotation.*;
@Configuration
public class TestDatabaseConfiguration {
	/*
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver"); //driver mysql
		datasource.setUrl("jdbc:mysql://localhost:3306/test_blog?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"); 
		//url BD con zona horaria para hacer uso del now() del tipo date en BD 
		datasource.setUsername("sirklaude");
		datasource.setPassword("root1234");
		return datasource;
	}
	
	@Bean
	public CategoriaRepository categoriaRepository() {
		return new CategoriaRepository();
	}
	
	@Bean
	public ComentarioRepository comentarioRepository() {
		return new ComentarioRepository();
	}
	
	@Bean
	public ContenidoRepository contenidoRepository() {
		return new ContenidoRepository();
	}
	
	@Bean
	public GrupoPermisoRepository grupopermisoRepository() {
		return new GrupoPermisoRepository();
	}
	
	@Bean
	public GrupoRepository grupoRepository() {
		return new GrupoRepository();
	}
	
	@Bean
	public PermisoRepository permisoRepository() {
		return new PermisoRepository();
	}
	
	@Bean
	public PostMetadataRepository postmetadataRepository() {
		return new PostMetadataRepository();
	}
	
	@Bean
	public PostRepository postRepository() {
		return new PostRepository();
	}
	
	@Bean
	public UsuarioMetadataRepository usuariometadataRepository() {
		return new UsuarioMetadataRepository();
	}
	
	@Bean
	public UsuarioRepository usuarioRepository() {
		return new UsuarioRepository();
	}
	*/
}
