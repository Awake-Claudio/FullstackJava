package com.sirklaude.Earthquake.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sirklaude.Earthquake.model.Sismo;
import com.sirklaude.Earthquake.service.SismoService;

@RestController
public class SismoController {

	@Autowired
	private SismoService sismoService;
	
	@GetMapping("/listar") // mostrar todos los sismos regisstrados en BD
	public ResponseEntity<List<Sismo>> listarSismos(){
		return ResponseEntity.ok().body(sismoService.listar());
	}
	
	@PostMapping("/registrar-1") // Regisrar un sismo en la BD
	public ResponseEntity<Sismo> registrarSismo(@RequestBody Sismo sismo){
		return ResponseEntity.ok().body(this.sismoService.registrar(sismo));
	}
	
	@PostMapping("/registrar-n") // Regisstrar varios sismos en la BD
	public Iterable<Sismo> registrarSismos(@RequestBody List<Sismo> sismos){
		return sismoService.registrar(sismos);
	}
	
	@GetMapping("/{fechaIni}/{fechaFin}")
	public void buscarSismosFechas(@PathVariable String fechainit, @PathVariable String fechafin){
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<Sismo>> typeReference = new TypeReference<List<Sismo>>(){};
		// para registrar todos los sismos
		InputStream input = TypeReference.class.getResourceAsStream(""
				+ "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime="
				+ fechainit +"&endtime="+ fechafin);
		
		try {
			List<Sismo> sismos = mapper.readValue(input, typeReference);
			sismoService.registrar(sismos);
			System.out.println("Se registraron varios sismos");
		} catch(IOException e) {
			System.out.println("No se pudo realizar registros de sismos: "+e.getMessage());
		}
	}
	
	@GetMapping("/{magmin}/{magmin}")
	public void buscarSismosMagnitud(@PathVariable double magmin, @PathVariable double magmax){
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<Sismo>> typeReference = new TypeReference<List<Sismo>>(){};
		// para registrar todos los sismos
		InputStream input = TypeReference.class.getResourceAsStream(""
				+ "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minmagnitude="
				+ magmin +"&maxmagnitude="+ magmax);
		
		try {
			List<Sismo> sismos = mapper.readValue(input, typeReference);
			sismoService.registrar(sismos);
		} catch(IOException e) {

		}
	}
}
