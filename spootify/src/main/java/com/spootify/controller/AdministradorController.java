package com.spootify.controller;


import com.spootify.domain.Administrador;
import com.spootify.repository.service.AdministradorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/administrador")

public class AdministradorController {
	@Autowired
	AdministradorService admiService;
	private String user;
	
	@RequestMapping(value="/login_adm",method=RequestMethod.POST)
	@ResponseBody
	Boolean login_adm(@RequestBody Administrador admin) throws Exception{
		System.out.println("guardando: "+admin.getNickname());
		user=admin.getNickname();
		System.out.println("guardando!!");
		//admiService.login_adm(admin.getNickname(),admin.getPassword());
		return Boolean.TRUE;
		
	}
	
	//@RequestMapping("/session_adm")
	//@ResponseBody
	//Administrador session_adm() {
		//return admiService.session_adm(user);
	//}
	

