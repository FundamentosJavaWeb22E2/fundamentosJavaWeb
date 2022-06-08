package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.Jogador;
import br.edu.infnet.model.exceptions.QtdeTituloInternacionalInvalidoException;
import br.edu.infnet.model.exceptions.QtdeTituloNacionalInvalidoException;

public class JogadorTeste {

	public static void main(String[] args) {
		try {
			Jogador j1 = new Jogador();
			j1.setAnoNascimento(2002);
			j1.setNome("Jose");
			j1.setQtdeTituloInternacional(0);
			j1.setQtdeTituloNacional(8);
			System.out.println(j1);
		} catch (QtdeTituloInternacionalInvalidoException | QtdeTituloNacionalInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Jogador j2 = new Jogador();
			j2.setAnoNascimento(1998);
			j2.setNome("Pedro");
			j2.setQtdeTituloInternacional(5);
			j2.setQtdeTituloNacional(0);		
			System.out.println(j2);
		} catch (QtdeTituloInternacionalInvalidoException | QtdeTituloNacionalInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Jogador j3 = new Jogador();
			j3.setAnoNascimento(1999);
			j3.setNome("Hugo");
			j3.setQtdeTituloInternacional(3);
			j3.setQtdeTituloNacional(9);		
			System.out.println(j3);		
		} catch (QtdeTituloInternacionalInvalidoException | QtdeTituloNacionalInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
