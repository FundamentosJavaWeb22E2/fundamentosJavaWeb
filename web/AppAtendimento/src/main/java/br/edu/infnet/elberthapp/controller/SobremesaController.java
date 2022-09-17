package br.edu.infnet.elberthapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.elberthapp.model.domain.Produto;
import br.edu.infnet.elberthapp.model.domain.Sobremesa;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.SobremesaService;

@Controller
public class SobremesaController {
	
	private String mensagem;
	
	@Autowired	
	private SobremesaService sobremesaService;
	@Autowired
	private ProdutoController produtoController;

	@GetMapping(value = "/sobremesa")
	public String telaCadastro() {
		return "sobremesa/cadastro";
	}	
	
	@GetMapping(value = "/sobremesa/listar")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("msg", mensagem);
				
		model.addAttribute("listagem", sobremesaService.obterLista(usuario));
		
		return "sobremesa/lista";
	}

	@PostMapping(value = "/sobremesa/incluir")
	public String incluir(Sobremesa sobremesa, @SessionAttribute("user") Usuario usuario) {
		
		sobremesa.setUsuario(usuario);
		
		sobremesaService.incluir(sobremesa);
		
		mensagem = "A inclusão da sobremesa "+ sobremesa.getNome()+" ("+sobremesa.getValor()+") foi realizada com sucesso!";

		return "redirect:/sobremesa/listar";
	}
	
	@GetMapping(value = "/sobremesa/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Produto produto = produtoController.exclusao(id);
		
		mensagem = "A exclusão da sobremesa "+produto.getNome()+" foi realizada com sucesso!";

		return "redirect:/sobremesa/listar";
	}
}