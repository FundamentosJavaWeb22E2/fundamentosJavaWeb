package br.edu.infnet.model.domain;

import java.util.List;

public class Equipe {

	private String nome;
	private int anoFundacao;
	private List<Profissional> profissionais;
	private String email;
	private String telefone;
	
	private float calcularGastoMensal(){
		
		float valorGastoMensal = 0f;
		
		for(Profissional prof : profissionais) {
			valorGastoMensal = valorGastoMensal + prof.calcularSalario();
		}
		
		return valorGastoMensal;
	}
	
	public void impressao(){
		System.out.println("Nome: " + nome);
		System.out.println("Ano de fundação: " + anoFundacao);
		System.out.println("E-mail: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("Quantidade de profissionais: " + profissionais.size());
		System.out.println("Gasto Mensal: " + calcularGastoMensal());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoFundacao() {
		return anoFundacao;
	}
	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}
	public List<Profissional> getProfissionais() {
		return profissionais;
	}
	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
