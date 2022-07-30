package br.edu.infnet.model.domain;

public class Aluno {
	private String nome;
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

		return String.format("[%s] O aluno %s (%s) da região %s está inscrito em %d disciplinas!\n", 
				curso,
				nome,
				email,
				regiao,
				qtde				
			);
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
}