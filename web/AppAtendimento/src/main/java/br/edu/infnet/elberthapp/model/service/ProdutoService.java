package br.edu.infnet.elberthapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.elberthapp.model.domain.Produto;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired	
	private ProdutoRepository produtoRepository;

	public void incluir(Produto produto) {
		produtoRepository.save(produto);		
	}
	
	public void excluir(Integer id) {
		produtoRepository.deleteById(id);
	}
	
	public Produto obterPorId(Integer id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	public List<Produto> obterLista(){
		return (List<Produto>) produtoRepository.findAll();
	}

	public List<Produto> obterLista(Usuario usuario){		
		return (List<Produto>) produtoRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
}