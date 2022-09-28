package br.edu.infnet.elberthapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.elberthapp.model.domain.Comida;
import br.edu.infnet.elberthapp.model.domain.Produto;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.ComidaService;

@Controller
public class ComidaController {
	
	private String mensagem;
	
	@Autowired	
	private ComidaService comidaService;
	@Autowired
	private ProdutoController produtoController;

	@GetMapping(value = "/comida")
	public String telaCadastro() {
		return "comida/cadastro";
	}	
	
	@GetMapping(value = "/comida/listar")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("msg", mensagem);
				
		model.addAttribute("listagem", comidaService.obterLista(usuario));
		
		return "comida/lista";
	}

	@PostMapping(value = "/comida/incluir")
	public String incluir(Comida comida, @SessionAttribute("user") Usuario usuario) {
		
		comida.setUsuario(usuario);
		
		comidaService.incluir(comida);
		
		mensagem = "A inclusão da comida "+ comida.getNome()+" ("+comida.getValor()+") foi realizada com sucesso!";

		return "redirect:/comida/listar";
	}
	
	@GetMapping(value = "/comida/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Produto produto = null;
		try {
			produto = produtoController.exclusao(id);
			mensagem = "A exclusão da comida "+produto.getNome()+" foi realizada com sucesso!";			
		} catch (Exception e) {
			mensagem = "Impossível realizar a exclusão do produto ("+id+")! Este produto está associado a um pedido.";		
		}

		return "redirect:/comida/listar";
	}
}