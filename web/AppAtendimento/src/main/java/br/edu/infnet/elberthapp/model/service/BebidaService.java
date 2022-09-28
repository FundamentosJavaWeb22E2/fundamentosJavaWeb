package br.edu.infnet.elberthapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.elberthapp.model.domain.Bebida;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.repository.BebidaRepository;

@Service
public class BebidaService {

	@Autowired	
	private BebidaRepository bebidaRepository;

	public long obterQtde() {
		return bebidaRepository.count();
	}

	public void incluir(Bebida bebida) {
		bebidaRepository.save(bebida);		
	}
	
	public void excluir(Integer id) {
		bebidaRepository.deleteById(id);
	}
	
	public Bebida obterPorId(Integer id) {
		return bebidaRepository.findById(id).orElse(null);
	}
	
	public List<Bebida> obterLista(){
		return (List<Bebida>) bebidaRepository.findAll();
	}

	public List<Bebida> obterLista(Usuario usuario){		
		return (List<Bebida>) bebidaRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome", "marca", "tamanho"));
	}
}