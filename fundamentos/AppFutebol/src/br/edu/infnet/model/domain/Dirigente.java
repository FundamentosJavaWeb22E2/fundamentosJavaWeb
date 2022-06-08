package br.edu.infnet.model.domain;

import br.edu.infnet.model.exceptions.AnoInicioInvalidoException;

public class Dirigente extends Profissional {
	
	private int anoInicio;
	private String email;
	private String telefone;
	private boolean presidente;
	
	@Override
	public float calcularSalario() {
		return (2022 - anoInicio) * 500 + (presidente ? 7500 : 0);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(anoInicio);
		sb.append(";");
		sb.append(email);
		sb.append(";");
		sb.append(presidente);
		sb.append(";");
		sb.append(telefone);
		
		return sb.toString();
	}

	public int getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(int anoInicio) throws AnoInicioInvalidoException {

		if(anoInicio < 2000 || anoInicio >= 2022) {
			throw new AnoInicioInvalidoException("O ano de início precisa estar entre 2000 e 2022");			
		}
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
