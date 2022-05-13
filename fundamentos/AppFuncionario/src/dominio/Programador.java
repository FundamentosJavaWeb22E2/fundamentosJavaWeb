package dominio;

import auxiliar.Constante;

public class Programador {
	public String nome;
	public int idade;
	public float salario;
	public String linguagem;
	public boolean fullstack;
	
	public Programador() {
		this.nome = "Javeiro";
	}
	
	public Programador(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Programador(String nome, int idade, float salario, String linguagem, boolean fullstack) {
		this(nome, idade);
		this.salario = salario;
		this.linguagem = linguagem;
		this.fullstack = fullstack;
	}
	
	public void impressao() {
		float salarioLiquido = 0;		

		salarioLiquido = this.calcularSalarioLiquido();
		
		System.out.println(this+";"+salarioLiquido+";"+this.obterSituacao(salarioLiquido));
	}
	
	public String obterSituacao(float salarioLiquido){
		if(salarioLiquido <= Constante.VALOR_POBRE) {
			return Constante.POBRE;
		}else if (salarioLiquido > Constante.VALOR_RICO) {
			return Constante.RICO;
		}
		return Constante.CLASSE_MEDIA;
	}
	
	private float calcularSalarioLiquidoFullStack() {
		return this.fullstack ? 
				Constante.SALARIO_FULLSTACK_SIM : 
				Constante.SALARIO_FULLSTACK_NAO;
	}
	
	private float calcularSalarioLiquidoLinhagem() {
		return "java".equalsIgnoreCase(this.linguagem) ? 
				Constante.SALARIO_JAVA_SIM : 
				Constante.SALARIO_JAVA_NAO;
	}
	
	public float calcularSalarioLiquido(){
		
		return salario + calcularSalarioLiquidoFullStack() + calcularSalarioLiquidoLinhagem();
	}

	@Override
	public String toString() {
		
		return String.format("%s;%d;%.2f;%s;%s", 
				nome, idade, salario, linguagem, fullstack
			);
	}
}