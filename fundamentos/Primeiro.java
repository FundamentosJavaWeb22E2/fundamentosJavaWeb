public class Primeiro {
	
	public static void main(String[] args){
		
		if(args.length == 6){
			String nome = args[0];
			String sobrenome = args[1];
			int idade = Integer.valueOf(args[2]);
			float salario = Float.valueOf(args[3]);
			boolean isJava = Boolean.valueOf(args[4]);
			int qtdeMes = Integer.valueOf(args[5]);			

			int anoNascimento = 2022 - idade;
			float valorTotal = salario * qtdeMes;			

			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Idade: " + idade);
			System.out.println("Ano de nascimento: " + anoNascimento);
			System.out.println("Salario: " + salario);
			System.out.println("Java Dev: " + isJava);
			System.out.println("Valor Total: " + valorTotal);
		} else {
			System.out.println("Informacoes invalidas!");
		}
	}
}