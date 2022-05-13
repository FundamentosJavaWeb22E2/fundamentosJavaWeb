package dominio;

import auxiliar.Constante;

public class Funcionario {
	public String nome;
	public int idade;
	public float salario;
	public float bonus;
	public float desconto;

	public Funcionario(){
		this.nome = "Fantasma";
	}

	public Funcionario(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public Funcionario(String nome, int idade, float salario, float bonus, float desconto) {
		this(nome, idade);
		this.salario = salario;
		this.bonus = bonus;
		this.desconto = desconto;
	}
	
	private String obterSituacao(float salarioLiquido) {
		if(salarioLiquido > Constante.VALOR_RICO) {
			return "rico";					
		}
		return "pobre";
	}
	
	private float calcularSalarioLiquido(){
		return salario + bonus - desconto;
	}

	public void impressao(){
		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = obterSituacao(salarioLiquido);
		
		System.out.println("Funcionário:");
		System.out.println(this);
		System.out.println("Salário Líquido = R$"+salarioLiquido);
		System.out.println("Situação = "+situacao);
		System.out.println("............");
	}

	@Override
	public String toString() {
		return nome+";"+idade+";"+salario+";"+bonus+";"+desconto;
	}
}