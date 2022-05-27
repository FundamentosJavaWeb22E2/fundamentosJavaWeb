package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		String dir = "C:/dev/";
		String arq = "alunos-java.txt";

		try {
			try {
				FileReader file = new FileReader(dir+arq);			
				BufferedReader buffer = new BufferedReader(file);
				
				String linha = buffer.readLine();			
				
				while(linha != null) {
					System.out.println("- "+linha);
					linha = buffer.readLine();
				}

				System.out.println("Processamento realizado com sucesso!!!");
				
				buffer.close();
				file.close();
			} catch (IOException e) {
				System.out.println("[PROBLEMA NO ARQUIVO] " + e.getMessage());
			}
		} finally {
			System.out.println("#fim#");
		}
	}
}