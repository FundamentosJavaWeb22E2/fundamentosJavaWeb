package br.edu.infnet.elberthapp.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.elberthapp.model.domain.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	@Query("from Produto p where p.usuario.id = :idUsuario")
	List<Produto> obterLista(Integer idUsuario, Sort by);
}