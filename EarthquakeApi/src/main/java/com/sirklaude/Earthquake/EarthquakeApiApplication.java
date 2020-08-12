package com.sirklaude.Earthquake;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import com.sirklaude.Earthquake.model.Sismo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sirklaude.Earthquake.configuration.SwaggerConfig;
import com.sirklaude.Earthquake.service.SismoService;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class EarthquakeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EarthquakeApiApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(SismoService service) {
		return args ->{
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Sismo>> typeReference = new TypeReference<List<Sismo>>(){};
			// para registrar todos los sismos
			InputStream input = TypeReference.class.getResourceAsStream("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson");
			
			try {
				List<Sismo> sismos = mapper.readValue(input, typeReference);
				service.registrar(sismos);
				System.out.println("Se registraron varios sismos");
			} catch(IOException e) {
				System.out.println("No se pudo realizar registros de sismos: "+e.getMessage());
			}
		};
	}
}
