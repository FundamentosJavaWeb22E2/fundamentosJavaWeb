package dominio;

public class Empresa {

	private String nome;
	private String sobrenome;
	private String ultimoNome;
	private Funcionario[] funcionarios;
	
	private float calcularFolhaPagamento() {
		float total = 0;
		
		for(Funcionario func : funcionarios) {
			total = total + func.calcularSalarioLiquido();
		}
		
		return total;
	}
	
	public void impressao() {
		System.out.printf("Empresa: %s <qtde = %d> | <valor = %.2f>\n", 
				this,
				funcionarios.length,
				calcularFolhaPagamento()
			);
		System.out.println("Funcionários: ");
		for(Funcionario func : funcionarios) {
			System.out.printf("%s - %d - %.2f\n",
						func.getNome(),
						func.getIdade(),
						func.calcularSalarioLiquido()
					);
		}
	}
	
	@Override
	public String toString() {
		return nome+";"+sobrenome+";"+ultimoNome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
}