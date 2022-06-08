package br.edu.infnet.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.model.domain.ComissaoTecnica;
import br.edu.infnet.model.domain.Dirigente;
import br.edu.infnet.model.domain.Equipe;
import br.edu.infnet.model.domain.Jogador;
import br.edu.infnet.model.domain.Profissional;

public class EquipeTeste {

	public static void main(String[] args) {
		
		ComissaoTecnica c1 = new ComissaoTecnica();
		ComissaoTecnica c2 = new ComissaoTecnica();
		
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Jogador j3 = new Jogador();
		
		Dirigente d1 = new Dirigente();
		
		List<Profissional> listaProfissional = new ArrayList<Profissional>();
		listaProfissional.add(j1);
		listaProfissional.add(j2);
		listaProfissional.add(j3);
		listaProfissional.add(c1);
		listaProfissional.add(c2);
		listaProfissional.add(d1);

		Equipe equipe = new Equipe();
		equipe.setNome("Flamengo");
		equipe.setAnoFundacao(1887);
		equipe.setEmail("fl@mengo.com");
		equipe.setTelefone("21999999999");		
		equipe.setProfissionais(listaProfissional);
				
		equipe.impressao();
		
	}
}
