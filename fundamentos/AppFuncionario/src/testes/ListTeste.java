package testes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListTeste {

	public static void main(String[] args) {
		
		String arquivo = "c:/dev/out-alunos-java.txt";

		try {			
			try {
				FileReader fileR = new FileReader(arquivo);
				BufferedReader leitura = new BufferedReader(fileR);
				
				String linha = leitura.readLine();

				List<String> nomes = new ArrayList<String>();
				
				int qtdeArquivo = 0;
				float salarioArquivo = 0;
				
				int qtde = 0;
				float somaSalarial = 0;

				while(linha != null) {	
					
					String[] campos = linha.split(";");

					try {
						qtdeArquivo = Integer.valueOf(campos[0]);
						salarioArquivo = Float.valueOf(campos[1]);
						
					} catch (NumberFormatException e) {
						nomes.add(campos[0]);
						qtde++;
						
						float salario = Float.valueOf(campos[1]);
						somaSalarial = somaSalarial + salario;
					}

					linha = leitura.readLine();				
				}
				
				//TODO trabalhar na exibição da mensagem de corrompido
				
				System.out.println("Qtde no arquivo: " + qtdeArquivo);
				System.out.println("Salário no arquivo: " + salarioArquivo);

				System.out.println("Qtde total: " + qtde);
				System.out.println("Soma salarial: " + somaSalarial);

//				for(String nome : nomes) {
//					System.out.println(nome);
//				}
				
				leitura.close();
				fileR.close();
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo inexistente!!!");
			} catch (IOException e) {
				System.out.println("Problemas na abertura do arquivo!!!");
			}
		} finally {
			System.out.println("Processamento finalizado!!!");
		}
	}
}
