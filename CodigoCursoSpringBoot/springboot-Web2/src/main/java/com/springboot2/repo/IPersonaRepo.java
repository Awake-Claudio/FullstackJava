package com.springboot2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot2.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
