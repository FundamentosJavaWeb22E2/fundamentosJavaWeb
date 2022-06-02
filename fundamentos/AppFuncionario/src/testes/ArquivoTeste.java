package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import dominio.Administrativo;
import dominio.Estagiario;
import dominio.Programador;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		String dir = "C:/dev/";
		String arq = "alunos-java.txt";

		try {
			try {
				FileReader file = new FileReader(dir+arq);			
				BufferedReader buffer = new BufferedReader(file);
				
				FileWriter fileW = new FileWriter(dir+"out-"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				String linha = buffer.readLine();
				
				int qtde = 0;
				float somaSalarial = 0;
				
				while(linha != null) {
					
					String[] campos = linha.split(";");

					switch (campos[0].toUpperCase()) {
					case "A":
						Administrativo adm = new Administrativo();
						adm.setNome(campos[1]);
						adm.setIdade(Integer.valueOf(campos[2]));
						adm.setSalario(Float.valueOf(campos[3]));
						adm.setBonus(Float.valueOf(campos[4]));
						adm.setDesconto(Float.valueOf(campos[5]));

						escrita.write(adm.obterStringSalarioPorFuncionario());
						
						qtde++;
						somaSalarial = somaSalarial + adm.calcularSalarioLiquido();

						break;

					case "E":			
						Estagiario estag = new Estagiario();
						estag.setNome(campos[1]);
						estag.setIdade(Integer.valueOf(campos[2]));
						estag.setSalario(Float.valueOf(campos[3]));
						estag.setFaculdade(campos[4]);
						estag.setPeriodo(Integer.valueOf(campos[5]));

						escrita.write(estag.obterStringSalarioPorFuncionario());
						
						qtde++;
						somaSalarial = somaSalarial + estag.calcularSalarioLiquido();

						break;

					case "P":												
						Programador prog = new Programador();
						prog.setNome(campos[1]);
						prog.setIdade(Integer.valueOf(campos[2]));
						prog.setSalario(Float.valueOf(campos[3]));
						prog.setLinguagem(campos[4]);
						prog.setFullstack(Boolean.valueOf(campos[5]));

						escrita.write(prog.obterStringSalarioPorFuncionario());
						
						qtde++;
						somaSalarial = somaSalarial + prog.calcularSalarioLiquido();

						break;
						
					default:
						System.out.println("O tipo ["+campos[0]+"] é inválido!!!");
						break;
					}

					linha = buffer.readLine();
				}
				
				escrita.write(qtde+";"+somaSalarial+"\r\n");

				System.out.println("Processamento realizado com sucesso!!!");
				
				buffer.close();
				file.close();
				escrita.close();
				fileW.close();
			} catch (IOException e) {
				System.out.println("[PROBLEMA NO ARQUIVO] " + e.getMessage());
			}
		} finally {
			System.out.println("#fim#");
		}
	}
}