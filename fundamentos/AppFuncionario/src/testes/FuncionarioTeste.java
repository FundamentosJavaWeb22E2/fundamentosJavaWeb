package testes;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario elberth = new Funcionario();
		elberth.idade = 10;
		elberth.salario = 1000;
		elberth.bonus = 2000;
		elberth.desconto = 500;		
		elberth.impressao();

		Funcionario erik = new Funcionario();
		erik.nome = "Erik";
		erik.idade = 20;
		erik.salario = 2000;
		erik.bonus = 3000;
		erik.desconto = 1000;		
		erik.impressao();

		Funcionario glauber = new Funcionario("Glauber", 25);
		glauber.salario = 3000;
		glauber.bonus = 4000;
		glauber.desconto = 2000;
		glauber.impressao();

		Funcionario raul = new Funcionario("Raul", 30, 4000f, 5000f, 3000f);
		raul.impressao();
	}
}