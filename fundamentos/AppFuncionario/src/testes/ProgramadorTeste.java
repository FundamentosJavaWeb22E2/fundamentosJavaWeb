package testes;

import dominio.Programador;

public class ProgramadorTeste {

	public static void main(String[] args) {
		
		Programador elberth = new Programador("Elberth Moraes", 10, 1000, "java", false);
		elberth.impressao();

		Programador erik = new Programador("Erik Guimarães", 20);
		erik.salario = 2000;
		erik.linguagem = "java boy";
		erik.fullstack = true;
		erik.impressao();

		Programador glauber = new Programador();
		glauber.nome = "Glauber Neves";
		glauber.idade = 30;
		glauber.salario = 3000;
		glauber.linguagem = "baby java";
		glauber.fullstack = false;
		glauber.impressao();

		Programador raul = new Programador();
		raul.idade = 40;
		raul.salario = 4000;
		raul.linguagem = "senior java";
		raul.fullstack = true;
		raul.impressao();
	}
}