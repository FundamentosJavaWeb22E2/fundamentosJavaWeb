package br.edu.infnet.elberthapp.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private SolicitanteService solicitanteService;
	@Autowired
	private BebidaService bebidaService;
	@Autowired
	private ComidaService comidaService;
	@Autowired
	private SobremesaService sobremesaService;
	@Autowired
	private ProdutoService produtoService;
	@Autowired
	private PedidoService pedidoService;
	
	public Map<String, Long> obterMapa(){
		Map<String, Long> mapaApp = new HashMap<String, Long>();
		
		mapaApp.put("Usuários", usuarioService.obterQtde());
		mapaApp.put("Solicitantes", solicitanteService.obterQtde());
		mapaApp.put("Bebidas", bebidaService.obterQtde());
		mapaApp.put("Comidas", comidaService.obterQtde());
		mapaApp.put("Sobremesas", sobremesaService.obterQtde());
		mapaApp.put("Produtos", produtoService.obterQtde());
		mapaApp.put("Pedidos", pedidoService.obterQtde());
		
		return mapaApp;
	}
}
