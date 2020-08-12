package com.sirklaude.Earthquake.service;

import java.util.List;

import com.sirklaude.Earthquake.model.Sismo;

public interface SismoService {
	Sismo registrar(Sismo s); //Registrar un sismo
	List<Sismo> listar();
	Iterable<Sismo> registrar(List<Sismo> sismos); // registrar varios sismos
}
