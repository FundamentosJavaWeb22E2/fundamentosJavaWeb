package br.edu.infnet.elberthapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.elberthapp.model.domain.Pedido;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired	
	private PedidoRepository pedidoRepository;

	public long obterQtde() {
		return pedidoRepository.count();
	}

	public void incluir(Pedido pedido) {
		pedidoRepository.save(pedido);		
	}
	
	public void excluir(Integer id) {
		pedidoRepository.deleteById(id);
	}
	
	public Pedido obterPorId(Integer id) {
		return pedidoRepository.findById(id).orElse(null);
	}
	
	public List<Pedido> obterLista(){
		return (List<Pedido>) pedidoRepository.findAll();
	}

	public List<Pedido> obterLista(Usuario usuario){		
		return (List<Pedido>) pedidoRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "data", "descricao"));
	}
}