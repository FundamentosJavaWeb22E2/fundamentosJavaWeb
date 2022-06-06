package testes;

import dominio.Administrativo;
import dominio.Empresa;
import dominio.Funcionario;
import dominio.Programador;
import exceptions.EmpresaSemFuncionarioException;
import exceptions.NomeIncompletoException;

public class EmpresaTeste {

	public static void main(String[] args) {
		
		try {
			Administrativo[] funcionariosInfnet = new Administrativo[3];
			funcionariosInfnet[0] = new Administrativo("joao", 10, 1000, 200, 300);
			funcionariosInfnet[1] = new Administrativo("maria", 20, 2000, 300, 400);
			funcionariosInfnet[2] = new Administrativo("jose", 30, 3000, 400, 500);
			
			Empresa infnet = new Empresa();
			infnet.setNome("Instituto Infnet Educação");
			infnet.setFuncionarios(funcionariosInfnet);
			infnet.impressao();
		} catch (NomeIncompletoException | EmpresaSemFuncionarioException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Programador[] funcionariosInstituto = new Programador[2];
			funcionariosInstituto[0] = new Programador("ana", 20, 2000, "java", true);
			funcionariosInstituto[1] = new Programador("pedrinho", 30, 3000, "python", false);
			
			Empresa instituto = new Empresa();
			instituto.setNome("Instituto Infnet Educação");
			instituto.setFuncionarios(funcionariosInstituto);
			instituto.impressao();
		} catch (NomeIncompletoException | EmpresaSemFuncionarioException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Funcionario[] funcionariosInstitutoInfnet = new Funcionario[5];
			funcionariosInstitutoInfnet[0] = new Administrativo("joao", 10, 1000, 200, 300);
			funcionariosInstitutoInfnet[1] = new Programador("ana", 20, 2000, "java", true);
			funcionariosInstitutoInfnet[2] = new Administrativo("maria", 20, 2000, 300, 400);
			funcionariosInstitutoInfnet[3] = new Programador("pedrinho", 30, 3000, "python", false);
			funcionariosInstitutoInfnet[4] = new Administrativo("jose", 30, 3000, 400, 500);
			
			Empresa institutoInfnet = new Empresa();
			institutoInfnet.setNome("Instituto Infnet Educação");
			institutoInfnet.setFuncionarios(funcionariosInstitutoInfnet);
			institutoInfnet.impressao();
		} catch (NomeIncompletoException | EmpresaSemFuncionarioException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Funcionario[] funcionariosElberth = new Funcionario[2];
			funcionariosElberth[0] = new Programador("ana", 20, 2000, "java", true);
			funcionariosElberth[1] = new Administrativo("maria", 20, 2000, 300, 400);
			
			Empresa elberth = new Empresa();
			elberth.setNome("Elberth Moraes Java");
//			elberth.setFuncionarios(funcionariosElberth);
			elberth.impressao();
		} catch (NomeIncompletoException | EmpresaSemFuncionarioException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
