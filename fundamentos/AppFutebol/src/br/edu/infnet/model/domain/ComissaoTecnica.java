package br.edu.infnet.model.domain;

public class ComissaoTecnica extends Profissional {

	private boolean treinador;
	private int qtdeTitulo;
	
	@Override
	public float calcularSalario() {

		return qtdeTitulo * 2000 + (treinador ? 10000 : 0);
	}	

	public boolean isTreinador() {
		return treinador;
	}
	public void setTreinador(boolean treinador) {
		this.treinador = treinador;
	}
	public int getQtdeTitulo() {
		return qtdeTitulo;
	}
	public void setQtdeTitulo(int qtdeTitulo) {
		this.qtdeTitulo = qtdeTitulo;
	}
}
