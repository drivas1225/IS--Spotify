package com.spootify.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
 

import org.springframework.stereotype.Component;

import com.example.demo.Persona;

//@Component
public interface PersonaRepository extends CrudRepository<Persona, Long> {
	
		@Query("SELECT a FROM Persona a WHERE a.email = ?1")
		Persona findByNumero(String email);
		// select a.* from account a
		 	@Query("SELECT a FROM Persona a")
		 	Collection<Persona> findAll();
	
}