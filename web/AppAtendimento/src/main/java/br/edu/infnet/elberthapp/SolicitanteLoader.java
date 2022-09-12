package br.edu.infnet.elberthapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.elberthapp.model.domain.Solicitante;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.SolicitanteService;

@Component
public class SolicitanteLoader implements ApplicationRunner {

	@Autowired 
	private SolicitanteService solicitanteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Solicitante solicitante = new Solicitante();
		solicitante.setCpf("222333444-55");
		solicitante.setEmail("ana@ana.com");
		solicitante.setNome("Ana Maria");
		solicitante.setUsuario(usuario);

		solicitanteService.incluir(solicitante);
	}
}