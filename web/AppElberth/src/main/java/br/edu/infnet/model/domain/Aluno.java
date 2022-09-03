package br.edu.infnet.model.domain;

public class Aluno {
	private String nome;
	private int idade;
	private float mensalidade;
	private String email;
	private String curso;
	private String[] disciplinas;
	private String regiao;
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		int qtde = disciplinas == null ? 0 : disciplinas.length;

		return String.format("[%s] O aluno %s (%s) da região %s tem %d anos, paga R$%.2f e está inscrito em %d disciplinas!\n", 
				curso,
				nome,
				email,
				regiao,
				idade,
				mensalidade,
				qtde				
			);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
}