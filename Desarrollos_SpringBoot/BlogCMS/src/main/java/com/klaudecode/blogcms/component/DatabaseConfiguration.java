package com.klaudecode.blogcms.component;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfiguration {
	
	@Autowired
	private Environment env; // para poder leer las propiedades de application.properties
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name")); 
		datasource.setUrl(env.getProperty("spring.datasource.url")); 
		datasource.setUsername(env.getProperty("spring.datasource.data-username"));
		datasource.setPassword(env.getProperty("spring.datasource.password"));
		return datasource;
	}

}
