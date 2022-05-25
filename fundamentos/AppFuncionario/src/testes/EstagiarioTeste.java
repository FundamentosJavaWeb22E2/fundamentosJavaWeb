package testes;

import dominio.Estagiario;

public class EstagiarioTeste {

	public static void main(String[] args) {

		Estagiario elberth = new Estagiario("elberth", 43, 999, "filosofia", 2);
		elberth.impressao();
		
		Estagiario erik = new Estagiario();
		erik.setNome("erik");
		erik.setIdade(33);
		erik.setSalario(888);
		erik.setPeriodo(3);
		erik.setFaculdade("direito");
		erik.impressao();
		
		Estagiario glauber = new Estagiario("glauber", 23, 777, "engenharia", 4);
		glauber.impressao();
		
		Estagiario raul = new Estagiario();
		raul.setNome("raul");
		raul.setIdade(13);
		raul.setSalario(666);
		raul.setPeriodo(5);
		raul.setFaculdade("medicina");
		raul.impressao();
	}
}
