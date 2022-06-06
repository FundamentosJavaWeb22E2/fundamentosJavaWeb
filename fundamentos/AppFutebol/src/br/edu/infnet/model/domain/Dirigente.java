package br.edu.infnet.model.domain;

public class Dirigente extends Profissional {
	
	private int anoInicio;
	private String email;
	private String telefone;
	private boolean presidente;
	
	@Override
	public float calcularSalario() {

		return (2022 - anoInicio) * 500 + (presidente ? 7500 : 0);
	}

	public int getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
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
	public boolean isPresidente() {
		return presidente;
	}
	public void setPresidente(boolean presidente) {
		this.presidente = presidente;
	}
}
