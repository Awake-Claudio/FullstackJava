package com.sirklaude.Earthquake.service;

import java.util.List;

import com.sirklaude.Earthquake.model.Application;

public interface ApplicationService {
	Application registrar(Application a); //Guarda uno
	List<Application> listar();
	Iterable<Application> registrar(List<Application> apps); // Guarda varios
}
