package br.edu.infnet.model.domain;

import br.edu.infnet.model.exceptions.QtdeTituloInternacionalInvalidoException;
import br.edu.infnet.model.exceptions.QtdeTituloNacionalInvalidoException;

public class Jogador extends Profissional {

	private int anoNascimento;
	private int qtdeTituloNacional;
	private int qtdeTituloInternacional;

	@Override
	public float calcularSalario() {
		return qtdeTituloNacional * 1000 + qtdeTituloInternacional * 5000;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(anoNascimento);
		sb.append(";");
		sb.append(qtdeTituloInternacional);
		sb.append(";");
		sb.append(qtdeTituloNacional);
		
		return sb.toString();
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getQtdeTituloNacional() {
		return qtdeTituloNacional;
	}
	public void setQtdeTituloNacional(int qtdeTituloNacional) throws QtdeTituloNacionalInvalidoException {
		if(qtdeTituloNacional <= 0) {
			throw new QtdeTituloNacionalInvalidoException("Impossível preencher com a quantidade de títulos nacional zerada ou negativa");			
		}

		this.qtdeTituloNacional = qtdeTituloNacional;
	}
	public int getQtdeTituloInternacional() {
		return qtdeTituloInternacional;
	}
	public void setQtdeTituloInternacional(int qtdeTituloInternacional) throws QtdeTituloInternacionalInvalidoException {
		if(qtdeTituloInternacional <= 0) {
			throw new QtdeTituloInternacionalInvalidoException("Impossível preencher com a quantidade de títulos internacional zerada ou negativa");			
		}

		this.qtdeTituloInternacional = qtdeTituloInternacional;
	}
}
