package com.sirklaude.Earthquake.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirklaude.Earthquake.model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer>{

}
