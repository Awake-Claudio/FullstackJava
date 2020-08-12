package com.sirklaude.Earthquake.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirklaude.Earthquake.model.Sismo;

public interface SismoRepository extends JpaRepository<Sismo, Long>{

}
