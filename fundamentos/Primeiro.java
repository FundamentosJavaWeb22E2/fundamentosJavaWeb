public class Primeiro {
	
	private static boolean validar(int tamanho){
		if(tamanho == 6){
			return true;
		} else {
			return false;
		}
	}
	
	private static int calcularAnoNascimento(int aIdade){
		return 2022 - aIdade;
	}
	
	private static float calcularValorTotal(float oSalario, int aQtdeMes){
		return oSalario * aQtdeMes;
	}

	private static String obterSituacao(int aIdade){
		String situacao = "veterano";
		if(aIdade < 50){
			situacao = "iniciante";
		}
		
		return situacao;
	}
	
	private static String obterStatus(float oSalario){
		String status = "instavel";
		if(oSalario > 1000){
			status = "estavel";
		}
		
		return status;
	}
	
	public static void main(String[] args){
		
		boolean ehValido = validar(args.length);
		
		if(ehValido){		
			String nome = args[0];
			String sobrenome = args[1];
			int idade = Integer.valueOf(args[2]);
			float salario = Float.valueOf(args[3]);
			boolean isJava = Boolean.valueOf(args[4]);
			int qtdeMes = Integer.valueOf(args[5]);			

			int anoNascimento = calcularAnoNascimento(idade);
			float valorTotal = calcularValorTotal(salario, qtdeMes);			
			String situacao = obterSituacao(idade);
			String status = obterStatus(salario);

			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Idade: " + idade);
			System.out.println("Ano de nascimento: " + anoNascimento);
			System.out.println("Salario: " + salario);
			System.out.println("Java Dev: " + isJava);
			System.out.println("Valor Total: " + valorTotal);
			System.out.println("Situacao: " + situacao);
			System.out.println("Status: " + status);
		} else {
			System.out.println("Informacoes invalidas!");
		}

	}
}