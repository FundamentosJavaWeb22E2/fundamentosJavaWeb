package br.edu.infnet.elberthapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.elberthapp.model.domain.Comida;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.repository.ComidaRepository;

@Service
public class ComidaService {

	@Autowired	
	private ComidaRepository comidaRepository;

	public void incluir(Comida comida) {
		comidaRepository.save(comida);		
	}
	
	public void excluir(Integer id) {
		comidaRepository.deleteById(id);
	}
	
	public Comida obterPorId(Integer id) {
		return comidaRepository.findById(id).orElse(null);
	}
	
	public List<Comida> obterLista(){
		return (List<Comida>) comidaRepository.findAll();
	}

	public List<Comida> obterLista(Usuario usuario){		
		return (List<Comida>) comidaRepository.obterLista(usuario.getId());
	}
}