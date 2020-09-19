package com.jorge.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jorge.demo.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona,Integer>{
	
	
}
