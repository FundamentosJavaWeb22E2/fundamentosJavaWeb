package br.edu.infnet.elberthapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.elberthapp.model.domain.Bebida;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.BebidaService;

@Component
public class BebidaLoader implements ApplicationRunner {
	
	@Autowired	
	private BebidaService bebidaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario admin = new Usuario();
		admin.setId(1);
		
		Usuario dev = new Usuario();
		dev.setId(2);

		String[] bebidas = {"chope", "cafe", "suco", "agua"};
		
		for(String b : bebidas) {
			Bebida bebida = new Bebida();
			bebida.setCodigo(999);
			bebida.setGelada(true);
			bebida.setMarca("Bebida " + b);
			bebida.setNome(b);
			bebida.setTamanho(500);
			bebida.setValor(10);
			bebida.setUsuario(admin);
			
			bebidaService.incluir(bebida);
		}
		
		Bebida bebida = null;
		
		bebida = bebidaService.obterPorId(1);
		System.out.println("Inclusão da primeira bebida: " + bebida.getNome());
		
		System.out.println("### Bebidas do usuário admin:");
		for(Bebida b : bebidaService.obterLista(admin)) {
			System.out.printf("%d - %s - %s\n", 
					b.getId(),
					b.getUsuario(),
					b.getNome()
				);
		}

		bebidaService.excluir(2);
		
		System.out.println("### Bebidas do usuário dev:");
		for(Bebida b : bebidaService.obterLista(dev)) {
			System.out.printf("%d - %s - %s\n", 
					b.getId(),
					b.getUsuario(),
					b.getNome()
				);
		}
		
		System.out.println("### Bebidas do usuário admin:");
		for(Bebida b : bebidaService.obterLista(admin)) {
			System.out.printf("%d - %s - %s\n", 
					b.getId(),
					b.getUsuario(),
					b.getNome()
				);
		}

		try {
			bebida = bebidaService.obterPorId(2);
			System.out.println("Inclusão da primeira bebida: " + bebida.getNome());		
		} catch (NullPointerException e) {
			System.err.println("[ERRO] " + e.getMessage());
		}		
	}
}