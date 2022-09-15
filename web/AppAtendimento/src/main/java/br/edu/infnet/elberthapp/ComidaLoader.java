package br.edu.infnet.elberthapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.elberthapp.model.domain.Comida;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.ComidaService;

@Component
public class ComidaLoader implements ApplicationRunner {
	
	@Autowired	
	private ComidaService comidaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario admin = new Usuario();
		admin.setId(1);

		Usuario dev = new Usuario();
		dev.setId(2);

		String[] comidas = {"pizza", "hotdog", "churras", "petiscos"};
		
		Comida comidaDev = new Comida();
		comidaDev.setCodigo(999);
		comidaDev.setVegano(true);
		comidaDev.setIngredientes("Muita comida");
		comidaDev.setNome("Comida tradicional");
		comidaDev.setPeso(500);
		comidaDev.setValor(10);
		comidaDev.setUsuario(dev);
		
		comidaService.incluir(comidaDev);

		for(String c : comidas) {
			Comida comida = new Comida();
			comida.setCodigo(999);
			comida.setVegano(true);
			comida.setIngredientes("Comida " + c);
			comida.setNome(c);
			comida.setPeso(500);
			comida.setValor(10);
			comida.setUsuario(admin);
			
			comidaService.incluir(comida);
		}

		System.out.println("### Comidas independente do usuário:");
		for(Comida c : comidaService.obterLista()) {
			System.out.printf("%d - %s - %s\n", 
					c.getId(),
					c.getUsuario(),
					c.getNome()
				);
			
		}
		
		System.out.println("### Comidas do usuário admin:");
		for(Comida c : comidaService.obterLista(admin)) {
			System.out.printf("%d - %s - %s\n", 
					c.getId(),
					c.getUsuario(),
					c.getNome()
				);
			
		}
	}
}