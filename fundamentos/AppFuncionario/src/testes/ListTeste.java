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

				List<String> mensagens = new ArrayList<String>();
				
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
						mensagens.add(
								String.format(
										"O funcionário %s recebe R$%.2f", 
										campos[0],
										Float.valueOf(campos[1])
									)
							);

						qtde++;
						
						float salario = Float.valueOf(campos[1]);
						somaSalarial = somaSalarial + salario;
					}

					linha = leitura.readLine();				
				}

				if(qtdeArquivo == qtde && salarioArquivo == somaSalarial) {					
					for(String msg : mensagens) {
						System.out.println(msg);
					}
					
					System.out.println("Quantidade de funcionários: " + qtde);
					System.out.println("Soma salarial: " + somaSalarial);
					
					float mediaSalarial = somaSalarial/qtde;
					
					System.out.println("Média salarial: " + mediaSalarial);
				} else {	
					System.out.println("Arquivo corrompido!");
				}
				
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
