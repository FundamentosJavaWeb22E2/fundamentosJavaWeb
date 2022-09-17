package br.edu.infnet.elberthapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.elberthapp.model.domain.Produto;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.ProdutoService;

@Controller
public class ProdutoController {
	
	private String mensagem;
	
	@Autowired	
	private ProdutoService produtoService;

	@GetMapping(value = "/produto/listar")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("msg", mensagem);
				
		model.addAttribute("listagem", produtoService.obterLista(usuario));
		
		return "produto/lista";
	}

	@PostMapping(value = "/produto/incluir")
	public String incluir(Produto produto, @SessionAttribute("user") Usuario usuario) {
		
		produto.setUsuario(usuario);
		
		produtoService.incluir(produto);
		
		mensagem = "A inclusão do produto "+ produto.getNome()+" ("+produto.getValor()+") foi realizada com sucesso!";

		return "redirect:/produto/listar";
	}
	
	@GetMapping(value = "/produto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Produto produto = exclusao(id);

		mensagem = "A exclusão do produto "+produto.getNome()+" foi realizada com sucesso!";

		return "redirect:/produto/listar";
	}
	
	public Produto exclusao(Integer id) {
		Produto produto = produtoService.obterPorId(id);
		
		produtoService.excluir(id);
		
		return produto;
	}
}