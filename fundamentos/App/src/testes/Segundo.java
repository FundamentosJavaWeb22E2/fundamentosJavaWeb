package testes;

import java.util.Scanner;

public class Segundo {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		String opcao;
		do{
			System.out.println("A) Cadastrar");
			System.out.println("B) Consultar");
			System.out.println("C) Exibir");
			System.out.println("Z) Sair");
			System.out.print("Informe a opcao desejada: ");
			
			opcao = sc.next();
			
			if(opcao.equalsIgnoreCase("A")){
				System.out.println("Opcao A selecionada");
				
			}else if(opcao.equalsIgnoreCase("B")){
				System.out.println("Opcao B selecionada");
				
			}else if(opcao.equalsIgnoreCase("C")){
				System.out.println("Opcao C selecionada");
			}
			
		}while(!opcao.equalsIgnoreCase("Z"));
		
		System.out.println("Finalizado com sucesso!!");
		
		sc.close();
	}
}