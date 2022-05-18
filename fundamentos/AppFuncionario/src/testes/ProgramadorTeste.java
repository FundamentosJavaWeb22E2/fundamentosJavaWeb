package testes;

import dominio.Programador;

public class ProgramadorTeste {

	public static void main(String[] args) {
		
		Programador elberth = new Programador("Elberth Moraes", 10, 1000, "java", false);
		elberth.impressao();

		Programador erik = new Programador("Erik Guimarães", 20, 2000, "java boy", true);
		erik.impressao();

		Programador glauber = new Programador();
		glauber.setNome("Glauber Neves");
		glauber.setIdade(30);
		glauber.setSalario(3000);
		glauber.setLinguagem("baby java");
		glauber.setFullstack(false);
		glauber.impressao();

		Programador raul = new Programador();
		raul.setIdade(40);
		raul.setSalario(4000);
		raul.setLinguagem("senior java");
		raul.setFullstack(true);
		raul.impressao();
	}
}