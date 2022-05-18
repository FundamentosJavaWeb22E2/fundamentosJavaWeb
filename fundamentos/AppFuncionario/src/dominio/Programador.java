package dominio;

import auxiliar.Constante;

public class Programador extends Funcionario {
	private String linguagem;
	private boolean fullstack;
	
	public Programador() {
		this.setNome("Javeiro");
	}
	
	public Programador(String nome, int idade, float salario, String linguagem, boolean fullstack) {
		super(nome, idade);
		this.setSalario(salario);
		this.linguagem = linguagem;
		this.fullstack = fullstack;
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
	
	@Override
	public float calcularSalarioLiquido() {
		return getSalario() + 
				calcularSalarioLiquidoFullStack() + 
				calcularSalarioLiquidoLinhagem();
	}

	@Override
	public String toString() {
		
		return String.format("%s;%s;%s", 
				super.toString(), linguagem, fullstack
			);
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public boolean isFullstack() {
		return fullstack;
	}

	public void setFullstack(boolean fullstack) {
		this.fullstack = fullstack;
	}

}