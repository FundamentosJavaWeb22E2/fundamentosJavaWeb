package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.Dirigente;
import br.edu.infnet.model.exceptions.AnoInicioInvalidoException;

public class DirigenteTeste {

	public static void main(String[] args) {
		try {
			Dirigente d0 = new Dirigente();
			d0.setAnoInicio(1999);
			d0.setEmail("joao@joao.com");
			d0.setNome("Joao");
			d0.setPresidente(true);
			d0.setTelefone("12999999999");
			System.out.println(d0);
		} catch (AnoInicioInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Dirigente d1 = new Dirigente();
			d1.setAnoInicio(2010);
			d1.setEmail("joao@joao.com");
			d1.setNome("Joao");
			d1.setPresidente(true);
			d1.setTelefone("12999999999");
			System.out.println(d1);
		} catch (AnoInicioInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}