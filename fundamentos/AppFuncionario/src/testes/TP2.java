package testes;

import java.util.Scanner;

import dominio.Administrativo;
import dominio.Estagiario;
import dominio.Funcionario;
import dominio.Programador;

public class TP2 {

	private static Funcionario[] funcionarios;

	private static final int TAMANHO = 2;

	private static int pos = 0;

	private static void imprimir() {
		for (int i = 0; i < pos; i++) {
			funcionarios[i].impressao();
		}		
	}
	
	public static void main(String[] args) {

		funcionarios = new Funcionario[TAMANHO];
		
		Scanner sc = new Scanner(System.in);
		
		String opcao;
		do{
			System.out.println("A) Cadastrar Administrativo");
			System.out.println("B) Cadastrar Programador");
			System.out.println("C) Cadastrar Estagiário");
			System.out.println("D) Consultar Funcionário");
			System.out.println("E) Exibir Funcionários");
			System.out.println("Z) Sair");

			System.out.print("Informe a opcao desejada: ");			
			opcao = sc.next();

			switch (opcao.toUpperCase()) {
			case "A":
				if(pos < TAMANHO) {
					Administrativo adm = new Administrativo();
					
					System.out.print("Informe o seu nome: ");
					adm.setNome(sc.next());
	
					System.out.print("Informe a sua idades: ");
					adm.setIdade(sc.nextInt());
	
					System.out.print("Informe o seu salário: ");
					adm.setSalario(sc.nextFloat());
					
					System.out.print("Informe o seu bônus: ");
					adm.setBonus(sc.nextFloat());

					System.out.print("Informe o seu desconto: ");
					adm.setDesconto(sc.nextFloat());
					
					funcionarios[pos] = adm;

					funcionarios[pos].impressao();
					
					pos++;
				} else {
					System.out.println("Impossível realizar um novo cadastramento!");
				}				
				break;

			case "B":
				if(pos < TAMANHO) {
					Programador prog = new Programador();
					
					System.out.print("Informe o seu nome: ");
					prog.setNome(sc.next());
	
					System.out.print("Informe a sua idade: ");
					prog.setIdade(sc.nextInt());
	
					System.out.print("Informe o seu salário: ");
					prog.setSalario(sc.nextFloat());
					
					System.out.print("Informe a sua linguagem: ");
					prog.setLinguagem(sc.next());

					System.out.print("Informe se é fullstack (S/N): ");
					prog.setFullstack("S".equalsIgnoreCase(sc.next()));
					
					funcionarios[pos] = prog;

					funcionarios[pos].impressao();
					
					pos++;
				} else {
					System.out.println("Impossível realizar um novo cadastramento!");
				}				
				break;

			case "C":
				if(pos < TAMANHO) {
					Estagiario estag = new Estagiario();
					
					System.out.print("Informe o seu nome: ");
					estag.setNome(sc.next());
	
					System.out.print("Informe a sua idade: ");
					estag.setIdade(sc.nextInt());
	
					System.out.print("Informe o seu salário: ");
					estag.setSalario(sc.nextFloat());
					
					System.out.print("Informe a sua faculdade: ");
					estag.setFaculdade(sc.next());

					System.out.print("Informe o seu período: ");
					estag.setPeriodo(sc.nextInt());
					
					funcionarios[pos] = estag;

					funcionarios[pos].impressao();
					
					pos++;
				} else {
					System.out.println("Impossível realizar um novo cadastramento!");
				}				
				break;

			case "D":				
				System.out.print("Informe o código do funcionário: ");			
				int codigo = sc.nextInt();

				if(codigo >= 0 && codigo < pos) {
					funcionarios[codigo].impressao();
				} else {
					System.out.println("Código inválido!!!");
				}

				break;

			case "E":				
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