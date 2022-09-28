package br.edu.infnet.elberthapp.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.elberthapp.model.domain.Pedido;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.PedidoService;
import br.edu.infnet.elberthapp.model.service.ProdutoService;
import br.edu.infnet.elberthapp.model.service.SolicitanteService;

@Controller
public class PedidoController {
	
	private String mensagem;
	
	@Autowired	
	private PedidoService pedidoService;
	@Autowired
	private SolicitanteService solicitanteService;
	@Autowired
	private ProdutoService produtoService;

	@GetMapping(value = "/pedido")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("solicitantes", solicitanteService.obterLista(usuario));
		
		model.addAttribute("produtos", produtoService.obterLista(usuario));

		return "pedido/cadastro";
	}	
	
	@GetMapping(value = "/pedido/listar")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("msg", mensagem);
				
		model.addAttribute("listagem", pedidoService.obterLista(usuario));
		
		return "pedido/lista";
	}

	@PostMapping(value = "/pedido/incluir")
	public String incluir(
			Pedido pedido, 
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dtPedido,  
			@SessionAttribute("user") Usuario usuario
		) {

		pedido.setData(dtPedido);
		
		pedido.setUsuario(usuario);
		
		pedidoService.incluir(pedido);
		
		mensagem = "A inclusão do pedido "+ pedido.getDescricao() + " foi realizada com sucesso!";

		return "redirect:/pedido/listar";
	}
	
	@GetMapping(value = "/pedido/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Pedido pedido = pedidoService.obterPorId(id);

		mensagem = "A exclusão do pedido " + pedido.getDescricao() + " foi realizada com sucesso!";

		return "redirect:/pedido/listar";
	}
}