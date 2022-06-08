package br.edu.infnet.model.domain;

import br.edu.infnet.model.exceptions.TituloInvalidoException;

public class ComissaoTecnica extends Profissional {

	private boolean treinador;
	private int qtdeTitulo;
	
	@Override
	public float calcularSalario() {
		return qtdeTitulo * 2000 + (treinador ? 10000 : 0);
	}	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(treinador);
		sb.append(";");
		sb.append(qtdeTitulo);
		
		return sb.toString();
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
	public void setQtdeTitulo(int qtdeTitulo) throws TituloInvalidoException {
		
		if(qtdeTitulo <= 0) {
			throw new TituloInvalidoException("Impossível preencher com a quantidade de títulos zerada ou negativa");			
		}
		
		this.qtdeTitulo = qtdeTitulo;
	}
}
