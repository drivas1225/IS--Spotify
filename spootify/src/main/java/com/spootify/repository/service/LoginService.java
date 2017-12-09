package com.spootify.repository.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Administrador;
import com.example.demo.Persona;

import com.example.demo.Usuario;

import spootify.repository.UserRepository;

@Component
public class LoginService {
    private final Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    UserRepository userRepository;


    public Usuario login(String nickname, String password) throws Exception {
        logger.debug("Metodo login[usuario=" + nickname + "][password=" + password + "]");
        Usuario usuario = userRepository.validarLogin(nickname, password);

        return usuario;
    }

    public Boolean registro(Usuario usuario) throws Exception {

        if (usuario != null) {

            userRepository.save(usuario);
            return true;

        } else {
            throw new Exception("Error");
        }

    }

};
