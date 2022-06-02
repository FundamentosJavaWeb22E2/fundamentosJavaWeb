package dominio;

public class Estagiario extends Funcionario {	
	private String faculdade;
	private int periodo;
	
	public Estagiario() {
		this.setNome("Estag");
		this.periodo = 1;
	}
	
	public Estagiario(String nome, int idade, float salario, String faculdade, int periodo) {
		super(nome, idade);
		this.setSalario(salario);
		this.faculdade = faculdade;
		this.periodo = periodo;
	}		

	@Override
	public float calcularSalarioLiquido() {
		return getSalario() + periodo * 100;
	}
	
	@Override
	public String toString() {
		return super.toString()+";"+faculdade+";"+periodo;
	}
	

	public String getFaculdade() {
		return faculdade;
	}
	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

}