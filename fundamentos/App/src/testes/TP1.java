package testes;

import java.util.Scanner;

public class TP1 {

	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;
	private static float[] bonus;
	private static float[] descontos;

	private static final int TAMANHO = 2;

	private static int pos = 0;

	private static float calcularSalarioLiquido(int idx) {
		return salarios[idx] + bonus[idx] - descontos[idx];
	}
	
	private static String obterSituacao(float sl){
		if(sl >= 100000) {
			return "rico";
		}
		return "pobre";
	}
	
	private static void imprimir(int index){
		float salarioLiquido = calcularSalarioLiquido(index);
		
		String situacao = obterSituacao(salarioLiquido);
		
		System.out.printf("<%d> %s - %d :: %.2f - %s\n", 
				index, nomes[index], idades[index], salarioLiquido, situacao);
	}
	
	private static void imprimir() {
		for (int i = 0; i < pos; i++) {
			imprimir(i);
		}		
	}
	
	public static void main(String[] args) {

		nomes = new String[TAMANHO];
		idades = new int[TAMANHO];
		salarios = new float[TAMANHO];
		bonus = new float[TAMANHO];
		descontos = new float[TAMANHO];
		
		Scanner sc = new Scanner(System.in);
		
		String opcao;
		do{
			System.out.println("A) Cadastrar");
			System.out.println("B) Consultar");
			System.out.println("C) Exibir");
			System.out.println("Z) Sair");

			System.out.print("Informe a opcao desejada: ");			
			opcao = sc.next();

			switch (opcao.toUpperCase()) {
			case "A":
				if(pos < TAMANHO) {
					System.out.print("Informe o seu nome: ");
					nomes[pos] = sc.next();
	
					System.out.print("Informe a sua idades: ");
					idades[pos] = sc.nextInt();
	
					System.out.print("Informe o seu salário: ");
					salarios[pos] = sc.nextFloat();
					
					System.out.print("Informe o seu bônus: ");
					bonus[pos] = sc.nextFloat();

					System.out.print("Informe o seu desconto: ");
					descontos[pos] = sc.nextFloat();

					imprimir(pos);
					
					pos++;
				} else {
					System.out.println("Impossível realizar um novo cadastramento!");
				}
				
				break;

			case "B":				
				System.out.print("Informe o código do funcionário: ");			
				int codigo = sc.nextInt();

				if(codigo >= 0 && codigo < pos) {
					imprimir(codigo);
				} else {
					System.out.println("Código inválido!!!");
				}

				break;

			case "C":				
				imprimir();

				break;

			case "Z":				
				System.out.println("Volte sempre ao nosso sistema!!!");

				break;

			default:
				System.out.println("Opção inválida!! Escolha uma nova.");
				
				break;
			}

		}while(!opcao.equalsIgnoreCase("Z"));
		
		System.out.println("Finalizado com sucesso!!");
		
		sc.close();		
	}
}