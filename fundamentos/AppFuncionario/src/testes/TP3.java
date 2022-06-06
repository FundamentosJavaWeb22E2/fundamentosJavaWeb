package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dominio.Administrativo;
import dominio.Estagiario;
import dominio.Funcionario;
import dominio.Programador;
import exceptions.DescontoNegativoException;

public class TP3 {

	private static List<Funcionario> funcionarios;

	private static int pos = 0;

	private static void imprimir() {
		for(Funcionario func : funcionarios) {
			func.impressao();
		}
	}
	
	public static void main(String[] args) {

		funcionarios = new ArrayList<Funcionario>();
		
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

				try {
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

					funcionarios.add(adm);
					adm.impressao();
					
					pos++;

				} catch (DescontoNegativoException e) {
					System.out.println("[ERRO] " + e.getMessage());
				}
				break;

			case "B":

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

				funcionarios.add(prog);
				prog.impressao();

				pos++;

				break;

			case "C":

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

				funcionarios.add(estag);
				estag.impressao();
				
				pos++;

				break;

			case "D":				
				System.out.print("Informe o código do funcionário: ");			
				int codigo = sc.nextInt();

				if(codigo >= 0 && codigo < pos) {
					funcionarios.get(codigo).impressao();
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