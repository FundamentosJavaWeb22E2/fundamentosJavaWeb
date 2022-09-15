package br.edu.infnet.elberthapp.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TSobremesa")
public class Sobremesa extends Produto {

	private boolean doce;
	private float quantidade;
	private String informacao;
	
	public boolean isDoce() {
		return doce;
	}
	public void setDoce(boolean doce) {
		this.doce = doce;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
}