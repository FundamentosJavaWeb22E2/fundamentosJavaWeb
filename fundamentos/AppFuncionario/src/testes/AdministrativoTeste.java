package testes;

import dominio.Administrativo;
import exceptions.DescontoNegativoException;

public class AdministrativoTeste {

	public static void main(String[] args) {
		
		try {
			Administrativo elberth = new Administrativo();
			elberth.setIdade(10);
			elberth.setSalario(1000);
			elberth.setBonus(2000);
			elberth.setDesconto(500);
			elberth.impressao();
		} catch (DescontoNegativoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}		

		try {
			Administrativo erik = new Administrativo();
			erik.setNome("Erik");
			erik.setIdade(20);
			erik.setSalario(2000);
			erik.setBonus(3000);
			erik.setDesconto(1000);
			erik.impressao();
		} catch (DescontoNegativoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}		

		Administrativo glauber = new Administrativo("Glauber", 25, 3000, 4000, 2000);
		glauber.impressao();

		Administrativo raul = new Administrativo("Raul", 30, 4000f, 5000f, 3000f);
		raul.impressao();
	}
}