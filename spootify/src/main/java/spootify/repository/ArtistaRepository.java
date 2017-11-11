package spootify.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Artista;

public interface ArtistaRepository extends CrudRepository<Artista, Long>{
	
	@Query("SELECT a FROM Artista a")
	Collection<Artista> buscarArtista();

}
