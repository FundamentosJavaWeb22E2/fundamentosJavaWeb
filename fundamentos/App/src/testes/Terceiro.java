package testes;

import java.util.Scanner;

public class Terceiro {
	
	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;

	private static int qtde;

	private static final int TAMANHO = 10;
	
	private static void impressao() {
		for (int i = 0; i < qtde; i++) {
			System.out.printf("%d : %s | %d | %.2f\n", i, nomes[i], idades[i], salarios[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		qtde = Integer.valueOf(args[0]);
		
		if(qtde <= TAMANHO) {			
			
			nomes = new String[TAMANHO];
			idades = new int[TAMANHO];
			salarios = new float[TAMANHO];
	
			for (int i = 0; i < qtde; i++) {			
				System.out.print("Informe o seu nome: ");
				nomes[i] = in.next();

				System.out.print("Informe a sua idades: ");
				idades[i] = in.nextInt();

				System.out.print("Informe o seu salário: ");
				salarios[i] = in.nextFloat();
			}
	
			impressao();
	
			System.out.println("Finalizado com sucesso!!!");
		} else {
			System.out.println("Impossível realizar o cadastramento!!!");
		}
		
		in.close();
	}
}