package testes;

import dominio.Empresa;
import exceptions.FaturamentoZeradoException;
import exceptions.NomeIncompletoException;

public class EmpresaStringTeste {

	public static void main(String[] args) {

		Empresa infnet = new Empresa();
		try {
			infnet.setNome("instituto infnet");
			infnet.setFaturamento(1000);
			System.out.println(infnet.getNome() + ";" + infnet.getFaturamento());
		} catch (NomeIncompletoException | FaturamentoZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}		

		Empresa institutoInfnet = new Empresa();
		try {
			institutoInfnet.setNome("instituto");
			institutoInfnet.setFaturamento(750);
			System.out.println(institutoInfnet.getNome() + ";" + institutoInfnet.getFaturamento());
		} catch (NomeIncompletoException | FaturamentoZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}		

		Empresa profElberth = new Empresa();
		try {
			profElberth.setFaturamento(500);
			System.out.println(profElberth.getNome() + ";" + profElberth.getFaturamento());
		} catch (NomeIncompletoException | FaturamentoZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		Empresa instituto = new Empresa();
		try {
			instituto.setNome("instituto infnet java");
			instituto.setFaturamento(-250);
			System.out.println(instituto.getNome() + ";" + instituto.getFaturamento());
		} catch (NomeIncompletoException | FaturamentoZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}		

	}
}