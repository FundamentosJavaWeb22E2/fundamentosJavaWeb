package br.edu.infnet.elberthapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.elberthapp.model.domain.Endereco;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired 
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco enderecoAdmin = new Endereco();
		enderecoAdmin.setBairro("bairro admin");
		enderecoAdmin.setCep("cep admin");
		enderecoAdmin.setComplemento("complemento admin");
		enderecoAdmin.setLocalidade("localidade admin");
		enderecoAdmin.setLogradouro("logradouro admin");
		enderecoAdmin.setUf("uf admin");

		Usuario admin = new Usuario();
		admin.setAdmin(true);
		admin.setEmail("elberth@elberth.com");
		admin.setEndereco(enderecoAdmin);
		admin.setNome("Elberth L C Moraes");
		admin.setSenha("123");
		
		usuarioService.incluir(admin);
		
		Endereco enderecoDev = new Endereco();
		enderecoDev.setBairro("bairro dev");
		enderecoDev.setCep("cep dev");
		enderecoDev.setComplemento("complemento dev");
		enderecoDev.setLocalidade("localidade dev");
		enderecoDev.setLogradouro("logradouro dev");
		enderecoDev.setUf("uf dev");

		Usuario dev = new Usuario();
		dev.setAdmin(false);
		dev.setEmail("elberth@programador.com");
		dev.setEndereco(enderecoDev);
		dev.setNome("Elberth Programador");
		dev.setSenha("123");
		
		usuarioService.incluir(dev);
		
		System.out.println("Usuários cadastrados: ");
		for(Usuario u : usuarioService.obterLista()) {
			System.out.println(u.getNome());
		}		
	}
}