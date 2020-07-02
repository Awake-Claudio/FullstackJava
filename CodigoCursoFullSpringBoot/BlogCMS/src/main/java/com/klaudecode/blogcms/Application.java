package com.klaudecode.blogcms;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.core.env.Environment;

import com.klaudecode.blogcms.service.InstalacionService;

//import com.klaudecode.blogcms.repository.UsuarioRep;

@EnableCaching
@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	private Environment env;
	@Autowired
	private InstalacionService instalacionServ;
	/*
	@Autowired
	private UsuarioRep usuarioRep;
	*/
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LogFactory.getLog(getClass()).info(env.getProperty("klaudecode.usuario.nombre"));
		instalacionServ.init_usuarios();
	}

}
