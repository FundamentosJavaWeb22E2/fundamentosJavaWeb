public class Primeiro {
	
	private static String nome;
	private static String sobrenome;
	private static int idade;
	private static float salario;
	private static boolean isJava;
	private static int qtdeMes;
	
	private static boolean validar(int tamanho){
		return tamanho == 6;
	}
	
	private static int calcularAnoNascimento(int aIdade){
		return 2022 - aIdade;
	}
	
	private static float calcularValorTotal(float oSalario, int aQtdeMes){
		return oSalario * aQtdeMes;
	}

	private static String obterSituacao(int aIdade){
		return aIdade < 50 ? "iniciante" : "veterano";
	}
	
	private static String obterStatus(float oSalario){
		if(oSalario > 1000){
			return "estavel";
		}		
		return "instavel";
	}
	
	private static void tratarParametros(String[] argumentos){
		nome = argumentos[0];
		sobrenome = argumentos[1];
		idade = Integer.valueOf(argumentos[2]);
		salario = Float.valueOf(argumentos[3]);
		isJava = Boolean.valueOf(argumentos[4]);
		qtdeMes = Integer.valueOf(argumentos[5]);			
	}

	private static void imprimir(){
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
	}
	
	public static void main(String[] args){
		
		boolean ehValido = validar(args.length);
		
		if(ehValido){
			tratarParametros(args);

			imprimir(
				anoNascimento, 
				valorTotal, 
				situacao, 
				status
			);
		} else {
			System.out.println("Informacoes invalidas!");
		}
	}
}