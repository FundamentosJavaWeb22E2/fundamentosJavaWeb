package dominio;

import exceptions.FaturamentoZeradoException;
import exceptions.NomeIncompletoException;

public class Empresa {

	private String nome;
	private String sobrenome;
	private String ultimoNome;
	private float faturamento;
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

	public String getNome() throws NomeIncompletoException {
		
		StringBuilder sb = new StringBuilder();
		
		if(ultimoNome == null) {
			throw new NomeIncompletoException("O campo 'nome' não foi preenchido!");
		}
		
		sb.append(ultimoNome.toUpperCase().charAt(0));
		sb.append(".");
		sb.append(",");
		sb.append(" "); 
		sb.append(nome.toUpperCase());
		sb.append(" "); 
		sb.append(sobrenome.toLowerCase());
		sb.append(".");

		return sb.toString();
	}
	public void setNome(String nome) throws NomeIncompletoException {
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		if(posInicial < 0) {
			throw new NomeIncompletoException("O preenchimento do campo 'nome' está incorreto: " + nome);
		}

		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	public float getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(float faturamento) throws FaturamentoZeradoException {
		if(faturamento < 0) {
			throw new FaturamentoZeradoException("O preenchimento do campo 'faturamento' está incorreto: " + faturamento);
		}
		this.faturamento = faturamento;
	}
}