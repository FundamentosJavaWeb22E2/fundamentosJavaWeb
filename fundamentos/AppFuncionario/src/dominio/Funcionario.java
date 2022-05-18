package dominio;

import auxiliar.Constante;

public abstract class Funcionario {
	private String nome;
	private int idade;
	private float salario;

	public Funcionario(){
		this.nome = "Fantasma";
		this.idade = 18;
		this.salario = 1045;
	}

	public Funcionario(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	public String obterSituacao(float salarioLiquido){
		if(salarioLiquido <= Constante.VALOR_POBRE) {
			return Constante.POBRE;
		}else if (salarioLiquido > Constante.VALOR_RICO) {
			return Constante.RICO;
		}
		return Constante.CLASSE_MEDIA;
	}
	
	public abstract float calcularSalarioLiquido();

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
		return String.format("%s;%d;%.2f",nome, idade, salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}