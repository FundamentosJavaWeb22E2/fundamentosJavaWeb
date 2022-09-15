package br.edu.infnet.elberthapp.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.elberthapp.model.domain.Sobremesa;

@Repository
public interface SobremesaRepository extends CrudRepository<Sobremesa, Integer> {

	@Query("from Sobremesa s where s.usuario.id = :idUsuario")
	List<Sobremesa> obterLista(Integer idUsuario);
}