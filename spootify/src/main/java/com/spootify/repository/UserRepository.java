package com.spootify.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import java.net.UnknownServiceException;
import java.util.List;


import com.example.demo.Administrador;
import com.example.demo.Persona;
import com.example.demo.Usuario;



@Component
public  interface UserRepository extends CrudRepository<Usuario, Long>  {

	@Query("SELECT a FROM Usuario a")
	Collection<Usuario> findAll();
	

	@Query(value="Select Persona.nombre FROM Persona INNER JOIN Administrador ON Persona.id=Administrador.id WHERE Persona.nombre = $1 AND Administrador.PASSWORD= $2", nativeQuery = true)
	String login_user(String usuario, String password);

	//Con esa consulta se mostrara el primer pantallazo para el Usuario
	@Query("SELECT a FROM Usuario a WHERE a.id = ?1")
	Usuario findByNumero(long id);

	@Query("SELECT a FROM Usuario a WHERE a.nickname = ?1")
	Usuario findByNickname(String id);


	@Query("SELECT u FROM Usuario u WHERE u.password= ?2  and u.nickname= ?1 ")
	Usuario validarLogin(String usuario, String password);
	
	@Modifying
	@Query("UPDATE Usuario u set u.nickname=?1 , u.password =?2   WHERE u.id=?4")
	static 	void  configuracion (String nickname,String password ,String email,Long id) {
	}
	

	
}
