package com.spootify.repository.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Administrador;
import spootify.repository.AdministradorRepository;

@Service
public class AdministradorService {
	@Autowired
	AdministradorRepository repository;
	
	private Administrador admin;
	

}
