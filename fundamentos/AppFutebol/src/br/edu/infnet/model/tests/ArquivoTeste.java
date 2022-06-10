package br.edu.infnet.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.model.domain.ComissaoTecnica;
import br.edu.infnet.model.domain.Dirigente;
import br.edu.infnet.model.domain.Equipe;
import br.edu.infnet.model.domain.Jogador;
import br.edu.infnet.model.domain.Profissional;
import br.edu.infnet.model.exceptions.AnoInicioInvalidoException;
import br.edu.infnet.model.exceptions.QtdeTituloInternacionalInvalidoException;
import br.edu.infnet.model.exceptions.QtdeTituloNacionalInvalidoException;
import br.edu.infnet.model.exceptions.TituloInvalidoException;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		try {			
			String dir = "c:/dev/";
			String arq = "equipe.txt";
	
			try {
				FileReader fileR = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileR);
				
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				String linha = leitura.readLine();
				
				Equipe equipe = null;
				List<Profissional> listaProfissional = new ArrayList<Profissional>();
				
				while(linha != null) {
					String[] campos = linha.split(";");
					
					String opcao = campos[0];
					
					switch (opcao.toUpperCase()) {
					case "E":				
						equipe = new Equipe();
						equipe.setNome(campos[1]);
						equipe.setAnoFundacao(Integer.valueOf(campos[2]));
						equipe.setEmail(campos[3]);
						equipe.setTelefone(campos[4]);
						equipe.setProfissionais(listaProfissional);		
						break;
					case "J":					
						try {
							Jogador jogador = new Jogador();
							jogador.setNome(campos[1]);
							jogador.setAnoNascimento(Integer.valueOf(campos[2]));
							jogador.setQtdeTituloNacional(Integer.valueOf(campos[3]));
							jogador.setQtdeTituloInternacional(Integer.valueOf(campos[4]));

							listaProfissional.add(jogador);							
						} catch (QtdeTituloInternacionalInvalidoException | QtdeTituloNacionalInvalidoException e) {
							System.out.println("[ERRO] " + e.getMessage());
						}

						break;
					case "T":					
						try {
							ComissaoTecnica comissaoTecnica = new ComissaoTecnica();
							comissaoTecnica.setNome(campos[1]);
							comissaoTecnica.setTreinador(Boolean.valueOf(campos[2]));
							comissaoTecnica.setQtdeTitulo(Integer.valueOf(campos[3]));

							listaProfissional.add(comissaoTecnica);
						} catch (TituloInvalidoException e) {
							System.out.println("[ERRO] " + e.getMessage());
						}
						break;
					case "D":					
						try {
							Dirigente dirigente = new Dirigente();
							dirigente.setNome(campos[1]);
							dirigente.setAnoInicio(Integer.valueOf(campos[2]));
							dirigente.setEmail(campos[3]);
							dirigente.setTelefone(campos[4]);
							dirigente.setPresidente(Boolean.valueOf(campos[5]));

							listaProfissional.add(dirigente);
						} catch (AnoInicioInvalidoException e) {
							System.out.println("[ERRO] " + e.getMessage());
						}
						break;
					default:
						System.out.println("Tipo inválido!");
						break;
					}
					
					linha = leitura.readLine();
				}
				
				equipe.impressao();
				
				escrita.write(equipe.obterDadosArquivo());

				leitura.close();
				fileR.close();
				escrita.close();
				fileW.close();
			} catch (IOException e) {
				System.out.println("[ERRO] " + e.getMessage());
			}
		} finally {
			System.out.println("PROCESSAMENTO REALIZADO!!!");
		}		
	}
}