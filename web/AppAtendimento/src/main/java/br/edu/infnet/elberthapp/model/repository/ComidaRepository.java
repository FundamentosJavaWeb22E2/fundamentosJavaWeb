package br.edu.infnet.elberthapp.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.elberthapp.model.domain.Comida;

@Repository
public interface ComidaRepository extends CrudRepository<Comida, Integer> {

	@Query("from Comida c where c.usuario.id = :idUsuario")
	List<Comida> obterLista(Integer idUsuario);
}