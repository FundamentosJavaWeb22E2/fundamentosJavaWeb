package testes;

public class Funcionario {
	String nome;
	int idade;
	float salario;
	float bonus;
	float desconto;

	Funcionario(){
		this.nome = "Fantasma";
	}

	Funcionario(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	Funcionario(String nome, int idade, float salario, float bonus, float desconto) {
		this(nome, idade);
		this.salario = salario;
		this.bonus = bonus;
		this.desconto = desconto;
	}
	
	private String obterSituacao(float salarioLiquido) {
		if(salarioLiquido > 5000) {
			return "rico";					
		}
		return "pobre";
	}
	
	private float calcularSalarioLiquido(){
		return salario + bonus - desconto;
	}

	void impressao(){
		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = obterSituacao(salarioLiquido);
		
		System.out.println("Funcion�rio:");
		System.out.println(this);
		System.out.println("Sal�rio L�quido = R$"+salarioLiquido);
		System.out.println("Situa��o = "+situacao);
		System.out.println("............");
	}

	@Override
	public String toString() {
		return nome+";"+idade+";"+salario+";"+bonus+";"+desconto;
	}
}