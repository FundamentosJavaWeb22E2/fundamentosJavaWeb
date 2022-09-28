package br.edu.infnet.elberthapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.elberthapp.model.domain.Sobremesa;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.repository.SobremesaRepository;

@Service
public class SobremesaService {

	@Autowired	
	private SobremesaRepository sobremesaRepository;

	public long obterQtde() {
		return sobremesaRepository.count();
	}

	public void incluir(Sobremesa sobremesa) {
		sobremesaRepository.save(sobremesa);		
	}
	
	public void excluir(Integer id) {
		sobremesaRepository.deleteById(id);
	}
	
	public Sobremesa obterPorId(Integer id) {
		return sobremesaRepository.findById(id).orElse(null);
	}
	
	public List<Sobremesa> obterLista(){
		return (List<Sobremesa>) sobremesaRepository.findAll();
	}

	public List<Sobremesa> obterLista(Usuario usuario){		
		return (List<Sobremesa>) sobremesaRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome", "informacao", "quantidade"));
	}
}