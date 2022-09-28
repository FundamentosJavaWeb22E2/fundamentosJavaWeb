package br.edu.infnet.elberthapp.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.elberthapp.model.domain.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

	@Query("from Pedido p where p.usuario.id = :idUsuario")
	List<Pedido> obterLista(Integer idUsuario, Sort by);
}