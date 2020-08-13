package com.sirklaude.Earthquake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.sirklaude.Earthquake.configuration.SwaggerConfig;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class EarthquakeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EarthquakeApiApplication.class, args);
	}
	
}
