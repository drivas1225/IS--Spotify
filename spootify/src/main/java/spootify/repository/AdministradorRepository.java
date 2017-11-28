package spootify.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Administrador;


public interface AdministradorRepository extends CrudRepository<Administrador, Long>{
	@Query("SELECT a FROM Administrador a")
	Collection<Administrador> buscarUsuarios();
	
	@Query("SELECT a FROM Administrador a  WHERE a.id=?1 ")
	Administrador buscar_por_numero(long id);
	
	@Query("SELECT a FROM Administrador a WHERE a.nickname=?1")
	Administrador buscar_nickname(String id);
	
	@Query("SELECT u FROM Administrador a WHERE u.password=?2 and u.nickname?1")
	Administrador validarLogin(String usuario,String password);

}


