package com.arquitecturaJava.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.arquitecturaJava.servicios.SpringConfigurador;

public class SpringWebInicializador implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// registro un contexto via web de spring framework
		AnnotationConfigWebApplicationContext Contexto = new AnnotationConfigWebApplicationContext();
		Contexto.register(SpringConfigurador.class);
		Contexto.setServletContext(servletContext);
		
		/*un servlet que haga de controlador frontal y despache todas las peticiones hacia las vistas 
		 * y controladores
		 */
		
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispacher", new DispatcherServlet(Contexto));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
