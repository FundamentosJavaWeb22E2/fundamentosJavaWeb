package testes;

import dominio.Empresa;

public class EmpresaStringTeste {

	public static void main(String[] args) {

		Empresa elberth = new Empresa();
		elberth.setNome("instituto infnet java");

		System.out.println(elberth.getNome());
	}
}