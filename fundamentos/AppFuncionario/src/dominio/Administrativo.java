package dominio;

public class Administrativo extends Funcionario {
	private float bonus;
	private float desconto;
	
	public Administrativo() {
	}

	public Administrativo(String nome, int idade, float salario, float bonus, float desconto) {
		super(nome, idade);
		this.setSalario(salario);
		this.bonus = bonus;
		this.desconto = desconto;
	}	
	
	@Override
	public float calcularSalarioLiquido() {
		return getSalario() + bonus - desconto;
	}

	@Override
	public String toString() {
		return super.toString()+";"+bonus+";"+desconto;
	}
	
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public float getBonus() {
		return bonus;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public float getDesconto() {
		return desconto;
	}	
}