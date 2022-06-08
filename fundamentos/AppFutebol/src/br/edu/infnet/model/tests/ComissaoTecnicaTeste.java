package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.ComissaoTecnica;
import br.edu.infnet.model.exceptions.TituloInvalidoException;

public class ComissaoTecnicaTeste {

	public static void main(String[] args) {
		try {
			ComissaoTecnica c1 = new ComissaoTecnica();
			c1.setNome("Sr Manoel");
			c1.setQtdeTitulo(-50);
			c1.setTreinador(false);
			System.out.println(c1);
		} catch (TituloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			ComissaoTecnica c2 = new ComissaoTecnica();		
			c2.setNome("Paulo");
			c2.setQtdeTitulo(3);
			c2.setTreinador(true);
			System.out.println(c2);
		} catch (TituloInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}		
	}
}
