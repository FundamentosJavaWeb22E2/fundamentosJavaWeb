package br.edu.infnet.model.domain;

public abstract class Profissional {

	private String nome;
	
	public abstract float calcularSalario();

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}