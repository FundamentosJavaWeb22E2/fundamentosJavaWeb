package testes;

import dominio.Administrativo;

public class AdministrativoTeste {

	public static void main(String[] args) {
		
		Administrativo elberth = new Administrativo();
		elberth.setIdade(10);
		elberth.setSalario(1000);
		elberth.setBonus(2000);
		elberth.setDesconto(500);		
		elberth.impressao();

		Administrativo erik = new Administrativo();
		erik.setNome("Erik");
		erik.setIdade(20);
		erik.setSalario(2000);
		erik.setBonus(3000);
		erik.setDesconto(1000);		
		erik.impressao();

		Administrativo glauber = new Administrativo("Glauber", 25, 3000, 4000, 2000);
		glauber.impressao();

		Administrativo raul = new Administrativo("Raul", 30, 4000f, 5000f, 3000f);
		raul.impressao();
	}
}