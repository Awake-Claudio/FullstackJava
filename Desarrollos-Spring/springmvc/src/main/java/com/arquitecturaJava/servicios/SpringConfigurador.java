package com.arquitecturaJava.servicios;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan("com.arquitecturaJava.servicios")
@ComponentScan("com.arquitecturaJava.controllers")

public class SpringConfigurador {

	@Bean
	public ViewResolver viewResolver() {
		//resolutor de vistas para archivos jsp
		// resolutor más clasico 
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setExposeContextBeansAsAttributes(true);
		viewResolver.setPrefix("/WEB-INF/vistas/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
}
