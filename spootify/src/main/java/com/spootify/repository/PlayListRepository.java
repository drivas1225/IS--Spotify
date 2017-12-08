package com.spootify.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Album;
import com.example.demo.PlayList;
import com.example.demo.Usuario;


public interface PlayListRepository  extends CrudRepository<PlayList, Long>{
	@Query("SELECT a FROM PlayList a WHERE a.ususario=?1")
	List<PlayList> encontrar_cancion(Usuario usuario);
	
///testeandpooo
}
