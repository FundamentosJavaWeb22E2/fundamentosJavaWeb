package br.edu.infnet.elberthapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.elberthapp.model.domain.Bebida;
import br.edu.infnet.elberthapp.model.domain.Comida;
import br.edu.infnet.elberthapp.model.domain.Pedido;
import br.edu.infnet.elberthapp.model.domain.Produto;
import br.edu.infnet.elberthapp.model.domain.Solicitante;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.PedidoService;

@Component
public class PedidoLoader implements ApplicationRunner {

	@Autowired
	private PedidoService pedidoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Solicitante solicitante = new Solicitante();
		solicitante.setId(1);
		
		Bebida chope = new Bebida();
		chope.setId(1);
		
		Bebida agua = new Bebida();
		agua.setId(4);
		
		Comida pizza = new Comida();
		pizza.setId(6);

		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(chope);
		produtos.add(agua);
		produtos.add(pizza);
		
		Pedido pedido = new Pedido();
		pedido.setDescricao("Primeiro pedido");
		pedido.setProdutos(produtos);
		pedido.setSolicitante(solicitante);
		pedido.setUsuario(usuario);
		
		pedidoService.incluir(pedido);
	}
}