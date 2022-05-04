package testes;

import java.util.Arrays;
import java.util.Scanner;

public class TP1 {

	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;

	private static final int TAMANHO = 10;

	public static void main(String[] args) {
		nomes = new String[TAMANHO];
		idades = new int[TAMANHO];
		salarios = new float[TAMANHO];

		Scanner sc = new Scanner(System.in);
		
		int pos = 0;
		String opcao;
		do{
			System.out.println("A) Cadastrar");
			System.out.println("B) Consultar");
			System.out.println("C) Exibir");
			System.out.println("Z) Sair");
			System.out.print("Informe a opcao desejada: ");
			
			opcao = sc.next();
			
			if(opcao.equalsIgnoreCase("A")){
				System.out.print("Informe o seu nome: ");
				nomes[pos] = sc.next();

				System.out.print("Informe a sua idades: ");
				idades[pos] = sc.nextInt();

				System.out.print("Informe o seu salário: ");
				salarios[pos] = sc.nextFloat();
				
				pos++;

			}else if(opcao.equalsIgnoreCase("B")){
				System.out.println("Opcao B selecionada");
				
			}else if(opcao.equalsIgnoreCase("C")){
				System.out.println(Arrays.toString(nomes));
				System.out.println(Arrays.toString(idades));
				System.out.println(Arrays.toString(salarios));
			}
			
		}while(!opcao.equalsIgnoreCase("Z"));
		
		System.out.println("Finalizado com sucesso!!");
		
		sc.close();		
	}
}