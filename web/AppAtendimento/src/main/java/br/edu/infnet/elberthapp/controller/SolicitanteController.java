package br.edu.infnet.elberthapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.elberthapp.model.domain.Solicitante;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.SolicitanteService;

@Controller
public class SolicitanteController {
	
	private String mensagem;
	
	@Autowired 
	private SolicitanteService solicitanteService;
	
	@GetMapping(value = "/solicitante")
	public String telaCadastro() {
		return "solicitante/cadastro";
	}
	
	@GetMapping(value = "/solicitante/listar")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("msg", mensagem);
		
		model.addAttribute("listagem", solicitanteService.obterLista(usuario));
		
		return "solicitante/lista";
	}

	@PostMapping(value = "/solicitante/incluir")
	public String incluir(Solicitante solicitante, @SessionAttribute("user") Usuario usuario) {
		
		solicitante.setUsuario(usuario);
		
		solicitanteService.incluir(solicitante);
		
		mensagem = "A inclusão do solicitante "+solicitante.getNome()+" ("+solicitante.getEmail()+") foi realizada com sucesso!";

		return "redirect:/solicitante/listar";
	}
	
	@GetMapping(value = "/solicitante/{id}/excluir")
	public String excluir(@PathVariable Integer id){
		
		solicitanteService.excluir(id);
		
		mensagem = "A exclusão do solicitante ("+id+") foi realizada com sucesso!";

		return "redirect:/solicitante/listar";
	}
}
